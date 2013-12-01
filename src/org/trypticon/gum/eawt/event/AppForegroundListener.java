package org.trypticon.gum.eawt.event;

/**
 * @author trejkaz
 */
public interface AppForegroundListener extends AppEventListener {
    void appRaisedToForeground(AppForegroundEvent appForegroundEvent);
    void appMovedToBackground(AppForegroundEvent appForegroundEvent);
}
