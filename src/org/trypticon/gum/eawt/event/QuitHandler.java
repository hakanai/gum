package org.trypticon.gum.eawt.event;

public interface QuitHandler {
    void handleQuitRequestWith(QuitEvent quitEvent, QuitResponse quitResponse);
}
