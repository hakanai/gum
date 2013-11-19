package org.trypticon.gum.eawt.internal.delegate;

import com.apple.eawt.AppEvent;
import org.trypticon.gum.eawt.event.OpenURIEvent;
import org.trypticon.gum.eawt.event.OpenURIHandler;

public class OpenURIHandlerWrapper implements com.apple.eawt.OpenURIHandler {
    private final OpenURIHandler delegate;

    public OpenURIHandlerWrapper(OpenURIHandler delegate) {
        this.delegate = delegate;
    }

    @Override
    public void openURI(AppEvent.OpenURIEvent openURIEvent) {
        delegate.openURI(new OpenURIEvent(openURIEvent.getURI()));
    }
}
