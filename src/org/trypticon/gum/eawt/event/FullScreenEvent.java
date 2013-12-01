package org.trypticon.gum.eawt.event;

import java.awt.*;

/**
 * @author trejkaz
 */
public class FullScreenEvent extends AppEvent {
    private final Window window;

    public FullScreenEvent(Window window) {
        this.window = window;
    }

    public java.awt.Window getWindow() {
        return window;
    }
}
