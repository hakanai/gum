package org.trypticon.gum.eawt.internal;

import com.apple.eawt.AppEvent;
import org.trypticon.gum.eawt.event.AppForegroundEvent;
import org.trypticon.gum.eawt.event.AppForegroundListener;

class AppForegroundListenerWrapper implements com.apple.eawt.AppForegroundListener {
    private final AppForegroundListener delegate;

    AppForegroundListenerWrapper(AppForegroundListener delegate) {
        this.delegate = delegate;
    }

    @Override
    public void appRaisedToForeground(AppEvent.AppForegroundEvent event) {
        delegate.appRaisedToForeground(new AppForegroundEvent());
    }

    @Override
    public void appMovedToBackground(AppEvent.AppForegroundEvent event) {
        delegate.appMovedToBackground(new AppForegroundEvent());
    }
}
