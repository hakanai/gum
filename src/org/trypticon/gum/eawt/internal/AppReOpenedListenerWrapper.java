package org.trypticon.gum.eawt.internal;

import com.apple.eawt.AppEvent;
import org.trypticon.gum.eawt.event.AppReOpenedEvent;
import org.trypticon.gum.eawt.event.AppReOpenedListener;

public class AppReOpenedListenerWrapper implements com.apple.eawt.AppReOpenedListener {
    private final AppReOpenedListener delegate;

    public AppReOpenedListenerWrapper(AppReOpenedListener delegate) {
        this.delegate = delegate;
    }

    @Override
    public void appReOpened(AppEvent.AppReOpenedEvent event) {
        delegate.appReOpened(new AppReOpenedEvent());
    }
}
