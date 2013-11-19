package org.trypticon.gum.eawt.internal.nul;

import org.trypticon.gum.eawt.Application;
import org.trypticon.gum.eawt.QuitStrategy;
import org.trypticon.gum.eawt.event.*;

import javax.swing.*;
import java.awt.*;

/**
 * An application which does nothing.
 */
public class NullApplication implements Application {
    @Override
    public boolean isMac() {
        return false;
    }

    @Override
    public void addAppEventListener(AppEventListener listener) {
    }

    @Override
    public void removeAppEventListener(AppEventListener listener) {
    }

    @Override
    public void setAboutHandler(AboutHandler handler) {
    }

    @Override
    public void setPreferencesHandler(PreferencesHandler handler) {
    }

    @Override
    public void setOpenFileHandler(OpenFilesHandler handler) {
    }

    @Override
    public void setPrintFileHandler(PrintFilesHandler handler) {
    }

    @Override
    public void setOpenURIHandler(OpenURIHandler handler) {
    }

    @Override
    public void setQuitHandler(QuitHandler handler) {
    }

    @Override
    public void setQuitStrategy(QuitStrategy strategy) {
    }

    @Override
    public void enableSuddenTermination() {
    }

    @Override
    public void disableSuddenTermination() {
    }

    @Override
    public void requestForeground(boolean allWindows) {
    }

    @Override
    public void requestUserAttention(boolean critical) {
    }

    @Override
    public void openHelpViewer() {
    }

    @Override
    public void setDockMenu(PopupMenu popupMenu) {
    }

    @Override
    public PopupMenu getDockMenu() {
        return null;
    }

    @Override
    public void setDockIconImage(Image image) {
    }

    @Override
    public Image getDockIconImage() {
        return null;
    }

    @Override
    public void setDockIconBadge(String text) {
    }

    @Override
    public void setDefaultMenuBar(JMenuBar menuBar) {
    }

    @Override
    public void requestToggleFullScreen(Window window) {
    }
}
