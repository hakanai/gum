package org.trypticon.gum.eawt.internal.delegate;

import com.apple.eawt.AppEvent;
import org.trypticon.gum.eawt.event.AppHiddenEvent;
import org.trypticon.gum.eawt.event.AppHiddenListener;

public class AppHiddenListenerWrapper implements com.apple.eawt.AppHiddenListener {
    private final AppHiddenListener delegate;

    AppHiddenListenerWrapper(AppHiddenListener delegate) {
        this.delegate = delegate;
    }

    @Override
    public void appHidden(AppEvent.AppHiddenEvent event) {
        delegate.appHidden(new AppHiddenEvent());
    }

    @Override
    public void appUnhidden(AppEvent.AppHiddenEvent event) {
        delegate.appUnhidden(new AppHiddenEvent());
    }
}
