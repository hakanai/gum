package org.trypticon.gum.eawt;

import org.trypticon.gum.eawt.event.FullScreenListener;

import java.awt.*;

/**
 * Utilities for marking windows as top-level and receiving events when this happens.
 *
 * @see org.trypticon.gum.MacFactory#getFullScreenUtilities()
 */
public interface FullScreenUtilities {

    /**
     * Sets a window so that it can be full-screened.
     *
     * @param window the window.
     * @param canFullScreen {@code true} to make the window capable of full-screening, {@code false} to disable.
     */
    void setWindowCanFullScreen(Window window, boolean canFullScreen);

    /**
     * Adds a full screen listener to the given window.
     *
     * @param window the window.
     * @param listener the listener.
     */
    void addFullScreenListenerTo(Window window, FullScreenListener listener);

    /**
     * Removes a full screen listener from the given window.
     *
     * @param window the window.
     * @param listener the listener.
     */
    void removeFullScreenListenerFrom(Window window, FullScreenListener listener);
}
