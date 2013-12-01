package org.trypticon.gum.eawt.internal;

import org.trypticon.gum.eawt.FullScreenUtilities;
import org.trypticon.gum.eawt.event.FullScreenListener;

import java.awt.*;
import java.util.Map;
import java.util.WeakHashMap;

/**
 * Utilities for marking windows as top-level and receiving events when this happens.
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
