package org.trypticon.gum.eawt.event;

import java.util.EventListener;

public interface PreferencesHandler extends EventListener {
    void handlePreferences(PreferencesEvent preferencesEvent);
}
