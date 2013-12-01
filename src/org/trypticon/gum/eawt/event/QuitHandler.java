package org.trypticon.gum.eawt.event;

/**
 * @author trejkaz
 */
public interface QuitHandler {
    void handleQuitRequestWith(QuitEvent quitEvent, QuitResponse quitResponse);
}
