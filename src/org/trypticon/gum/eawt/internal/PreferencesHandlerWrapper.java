package org.trypticon.gum.eawt.internal;

import com.apple.eawt.AppEvent;
import org.trypticon.gum.eawt.event.PreferencesEvent;
import org.trypticon.gum.eawt.event.PreferencesHandler;

class PreferencesHandlerWrapper implements com.apple.eawt.PreferencesHandler {
    private final PreferencesHandler delegate;

    public PreferencesHandlerWrapper(PreferencesHandler delegate) {
        this.delegate = delegate;
    }

    @Override
    public void handlePreferences(AppEvent.PreferencesEvent event) {
        delegate.handlePreferences(new PreferencesEvent());
    }
}
