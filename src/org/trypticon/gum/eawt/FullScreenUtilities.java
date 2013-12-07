/*
 * Gum - a thin shim around the com.apple extension classes
 * Copyright (C) 2013  Trejkaz
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.trypticon.gum.eawt;

import org.trypticon.gum.eawt.event.FullScreenListener;

import java.awt.*;

/**
 * Utilities for marking windows as top-level and receiving events when this happens.
 *
 * @see org.trypticon.gum.MacFactory#getFullScreenUtilities()
 * @author trejkaz
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
