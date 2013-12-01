package org.trypticon.gum.eawt.internal;

import com.apple.eawt.AppEvent;
import org.trypticon.gum.eawt.event.FullScreenEvent;
import org.trypticon.gum.eawt.event.FullScreenListener;

public class FullScreenListenerWrapper implements com.apple.eawt.FullScreenListener {
    private final FullScreenListener delegate;

    public FullScreenListenerWrapper(FullScreenListener delegate) {
        this.delegate = delegate;
    }

    @Override
    public void windowEnteringFullScreen(AppEvent.FullScreenEvent event) {
        delegate.windowEnteringFullScreen(new FullScreenEvent(event.getWindow()));
    }

    @Override
    public void windowEnteredFullScreen(AppEvent.FullScreenEvent event) {
        delegate.windowEnteredFullScreen(new FullScreenEvent(event.getWindow()));
    }

    @Override
    public void windowExitingFullScreen(AppEvent.FullScreenEvent event) {
        delegate.windowExitingFullScreen(new FullScreenEvent(event.getWindow()));
    }

    @Override
    public void windowExitedFullScreen(AppEvent.FullScreenEvent event) {
        delegate.windowExitedFullScreen(new FullScreenEvent(event.getWindow()));
    }
}
