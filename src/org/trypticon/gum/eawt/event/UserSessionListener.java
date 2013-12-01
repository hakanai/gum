package org.trypticon.gum.eawt.event;

/**
 * @author trejkaz
 */
public interface UserSessionListener extends AppEventListener {
    void userSessionDeactivated(UserSessionEvent userSessionEvent);
    void userSessionActivated(UserSessionEvent userSessionEvent);
}
