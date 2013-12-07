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

package org.trypticon.gum.eawt.internal;

import org.trypticon.gum.eawt.FullScreenUtilities;
import org.trypticon.gum.eawt.event.FullScreenListener;

import java.awt.*;
import java.util.Map;
import java.util.WeakHashMap;

/**
 * Delegating implementation of the full screen utilities.
 *
 * @author trejkaz
 */
public class DelegatingFullScreenUtilities implements FullScreenUtilities {
    private static final Map<FullScreenListener, com.apple.eawt.FullScreenListener> wrapperMap = new WeakHashMap<>();

    @Override
    public void setWindowCanFullScreen(Window window, boolean canFullScreen) {
        com.apple.eawt.FullScreenUtilities.setWindowCanFullScreen(window, canFullScreen);
    }

    @Override
    public void addFullScreenListenerTo(Window window, FullScreenListener listener) {
        com.apple.eawt.FullScreenListener wrapper = new FullScreenListenerWrapper(listener);
        wrapperMap.put(listener, wrapper);
        com.apple.eawt.FullScreenUtilities.addFullScreenListenerTo(window, wrapper);
    }

    @Override
    public void removeFullScreenListenerFrom(Window window, FullScreenListener listener) {
        com.apple.eawt.FullScreenListener wrapper = wrapperMap.remove(listener);
        if (wrapper != null) {
            com.apple.eawt.FullScreenUtilities.removeFullScreenListenerFrom(window, wrapper);
        }
    }
}
