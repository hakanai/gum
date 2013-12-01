package org.trypticon.gum.eawt.internal;

import com.apple.eawt.AppEvent;
import org.trypticon.gum.eawt.event.PrintFilesEvent;
import org.trypticon.gum.eawt.event.PrintFilesHandler;

class PrintFilesHandlerWrapper implements com.apple.eawt.PrintFilesHandler {
    private final PrintFilesHandler delegate;

    public PrintFilesHandlerWrapper(PrintFilesHandler delegate) {
        this.delegate = delegate;
    }

    @Override
    public void printFiles(AppEvent.PrintFilesEvent PrintFilesEvent) {
        delegate.printFiles(new PrintFilesEvent(PrintFilesEvent.getFiles()));
    }
}
