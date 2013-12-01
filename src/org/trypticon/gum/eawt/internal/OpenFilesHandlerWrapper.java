package org.trypticon.gum.eawt.internal;

import com.apple.eawt.AppEvent;
import org.trypticon.gum.eawt.event.OpenFilesEvent;
import org.trypticon.gum.eawt.event.OpenFilesHandler;

public class OpenFilesHandlerWrapper implements com.apple.eawt.OpenFilesHandler {
    private final OpenFilesHandler delegate;

    public OpenFilesHandlerWrapper(OpenFilesHandler delegate) {
        this.delegate = delegate;
    }

    @Override
    public void openFiles(AppEvent.OpenFilesEvent openFilesEvent) {
        delegate.openFiles(new OpenFilesEvent(openFilesEvent.getFiles(), openFilesEvent.getSearchTerm()));
    }
}
