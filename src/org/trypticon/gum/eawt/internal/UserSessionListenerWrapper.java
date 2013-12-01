package org.trypticon.gum.eawt.internal;

import com.apple.eawt.AppEvent;
import org.trypticon.gum.eawt.event.UserSessionEvent;
import org.trypticon.gum.eawt.event.UserSessionListener;

class UserSessionListenerWrapper implements com.apple.eawt.UserSessionListener {
    private final UserSessionListener delegate;

    public UserSessionListenerWrapper(UserSessionListener delegate) {
        this.delegate = delegate;
    }

    @Override
    public void userSessionDeactivated(AppEvent.UserSessionEvent event) {
        delegate.userSessionDeactivated(new UserSessionEvent());
    }

    @Override
    public void userSessionActivated(AppEvent.UserSessionEvent event) {
        delegate.userSessionActivated(new UserSessionEvent());
    }
}
