package org.trypticon.gum.eawt.internal.delegate;


import com.apple.eawt.AppEvent;
import org.trypticon.gum.eawt.event.ScreenSleepEvent;
import org.trypticon.gum.eawt.event.ScreenSleepListener;

public class ScreenSleepListenerWrapper implements com.apple.eawt.ScreenSleepListener {
    private final ScreenSleepListener delegate;

    public ScreenSleepListenerWrapper(ScreenSleepListener delegate) {
        this.delegate = delegate;
    }

    @Override
    public void screenAboutToSleep(AppEvent.ScreenSleepEvent event) {
        delegate.screenAboutToSleep(new ScreenSleepEvent());
    }

    @Override
    public void screenAwoke(AppEvent.ScreenSleepEvent event) {
        delegate.screenAwoke(new ScreenSleepEvent());
    }
}
