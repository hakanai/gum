package org.trypticon.gum.eawt.event;

public interface AppForegroundListener extends AppEventListener {
    void appRaisedToForeground(AppForegroundEvent appForegroundEvent);
    void appMovedToBackground(AppForegroundEvent appForegroundEvent);
}
