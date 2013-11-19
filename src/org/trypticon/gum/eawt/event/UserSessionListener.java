package org.trypticon.gum.eawt.event;

public interface UserSessionListener extends AppEventListener {
    void userSessionDeactivated(UserSessionEvent userSessionEvent);
    void userSessionActivated(UserSessionEvent userSessionEvent);
}
