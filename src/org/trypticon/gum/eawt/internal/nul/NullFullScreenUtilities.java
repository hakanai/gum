package org.trypticon.gum.eawt.internal.nul;

import org.trypticon.gum.eawt.FullScreenUtilities;
import org.trypticon.gum.eawt.event.FullScreenListener;

import java.awt.*;

/**
 * Full screen utilities which do nothing.
 */
public class NullFullScreenUtilities implements FullScreenUtilities {

    @Override
    public void setWindowCanFullScreen(Window window, boolean canFullScreen) {
    }

    @Override
    public void addFullScreenListenerTo(Window window, FullScreenListener listener) {
    }

    @Override
    public void removeFullScreenListenerFrom(Window window, FullScreenListener listener) {
    }
}
