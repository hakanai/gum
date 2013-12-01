package org.trypticon.gum.eawt.internal;

import org.trypticon.gum.eawt.Application;
import org.trypticon.gum.eawt.QuitStrategy;
import org.trypticon.gum.eawt.event.*;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class DelegatingApplication implements Application {
    private final com.apple.eawt.Application delegate;
    private final Map<AppEventListener, List<com.apple.eawt.AppEventListener>> wrapperMap = new HashMap<>();

    public DelegatingApplication() {
        delegate = com.apple.eawt.Application.getApplication();
    }

    @Override
    public void addAppEventListener(AppEventListener listener) {
        if (listener == null) {
            return;
        }

        List<com.apple.eawt.AppEventListener> wrappers = new LinkedList<>();
        if (listener instanceof AppForegroundListener) {
            AppForegroundListenerWrapper wrapper = new AppForegroundListenerWrapper((AppForegroundListener) listener);
            wrappers.add(wrapper);
            delegate.addAppEventListener(wrapper);
        }
        if (listener instanceof AppHiddenListener) {
            AppHiddenListenerWrapper wrapper = new AppHiddenListenerWrapper((AppHiddenListener) listener);
            wrappers.add(wrapper);
            delegate.addAppEventListener(wrapper);
        }
        if (listener instanceof AppReOpenedListener) {
            AppReOpenedListenerWrapper wrapper = new AppReOpenedListenerWrapper((AppReOpenedListener) listener);
            wrappers.add(wrapper);
            delegate.addAppEventListener(wrapper);
        }
        if (listener instanceof ScreenSleepListener) {
            ScreenSleepListenerWrapper wrapper = new ScreenSleepListenerWrapper((ScreenSleepListener) listener);
            wrappers.add(wrapper);
            delegate.addAppEventListener(wrapper);
        }
        if (listener instanceof SystemSleepListener) {
            SystemSleepListenerWrapper wrapper = new SystemSleepListenerWrapper((SystemSleepListener) listener);
            wrappers.add(wrapper);
            delegate.addAppEventListener(wrapper);
        }
        if (listener instanceof UserSessionListener) {
            UserSessionListenerWrapper wrapper = new UserSessionListenerWrapper((UserSessionListener) listener);
            wrappers.add(wrapper);
            delegate.addAppEventListener(wrapper);
        }
        wrapperMap.put(listener, wrappers);
    }

    @Override
    public void removeAppEventListener(AppEventListener listener) {
        List<com.apple.eawt.AppEventListener> wrappers = wrapperMap.remove(listener);
        if (wrappers != null) {
            for (com.apple.eawt.AppEventListener wrapper : wrappers) {
                delegate.removeAppEventListener(wrapper);
            }
        }
    }

    @Override
    public void setAboutHandler(AboutHandler handler) {
        delegate.setAboutHandler(handler == null ? null : new AboutHandlerWrapper(handler));
    }

    @Override
    public void setPreferencesHandler(PreferencesHandler handler) {
        delegate.setPreferencesHandler(handler == null ? null : new PreferencesHandlerWrapper(handler));
    }

    @Override
    public void setOpenFileHandler(OpenFilesHandler handler) {
        delegate.setOpenFileHandler(handler == null ? null : new OpenFilesHandlerWrapper(handler));
    }

    @Override
    public void setPrintFileHandler(PrintFilesHandler handler) {
        delegate.setPrintFileHandler(handler == null ? null : new PrintFilesHandlerWrapper(handler));
    }

    @Override
    public void setOpenURIHandler(OpenURIHandler handler) {
        delegate.setOpenURIHandler(handler == null ? null : new OpenURIHandlerWrapper(handler));
    }

    @Override
    public void setQuitHandler(QuitHandler handler) {
        delegate.setQuitHandler(handler == null ? null : new QuitHandlerWrapper(handler));
    }

    @Override
    public void setQuitStrategy(QuitStrategy strategy) {
        switch (strategy) {
            case SYSTEM_EXIT_0:
                delegate.setQuitStrategy(com.apple.eawt.QuitStrategy.SYSTEM_EXIT_0);
                break;
            case CLOSE_ALL_WINDOWS:
                delegate.setQuitStrategy(com.apple.eawt.QuitStrategy.CLOSE_ALL_WINDOWS);
                break;
            default:
                throw new UnsupportedOperationException("Unsupported quit strategy: " + strategy);

        }
    }

    @Override
    public void enableSuddenTermination() {
        delegate.enableSuddenTermination();
    }

    @Override
    public void disableSuddenTermination() {
        delegate.disableSuddenTermination();
    }

    @Override
    public void requestForeground(boolean allWindows) {
        delegate.requestForeground(allWindows);
    }

    @Override
    public void requestUserAttention(boolean critical) {
        delegate.requestUserAttention(critical);
    }

    @Override
    public void openHelpViewer() {
        delegate.openHelpViewer();
    }

    @Override
    public void setDockMenu(PopupMenu popupMenu) {
        delegate.setDockMenu(popupMenu);
    }

    @Override
    public PopupMenu getDockMenu() {
        return delegate.getDockMenu();
    }

    @Override
    public void setDockIconImage(Image image) {
        delegate.setDockIconImage(image);
    }

    @Override
    public Image getDockIconImage() {
        return delegate.getDockIconImage();
    }

    @Override
    public void setDockIconBadge(String text) {
        delegate.setDockIconBadge(text);
    }

    @Override
    public void setDefaultMenuBar(JMenuBar menuBar) {
        delegate.setDefaultMenuBar(menuBar);
    }

    @Override
    public void requestToggleFullScreen(Window window) {
        delegate.requestToggleFullScreen(window);
    }
}
