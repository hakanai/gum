package org.trypticon.gum.eawt.event;

import java.util.EventListener;

/**
 * @author trejkaz
 */
public interface PreferencesHandler extends EventListener {
    void handlePreferences(PreferencesEvent preferencesEvent);
}
