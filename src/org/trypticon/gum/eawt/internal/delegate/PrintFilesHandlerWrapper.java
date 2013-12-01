package org.trypticon.gum.eawt.internal.delegate;

import com.apple.eawt.AppEvent;
import org.trypticon.gum.eawt.event.PrintFilesEvent;
import org.trypticon.gum.eawt.event.PrintFilesHandler;

public class PrintFilesHandlerWrapper implements com.apple.eawt.PrintFilesHandler {
    private final PrintFilesHandler delegate;

    public PrintFilesHandlerWrapper(PrintFilesHandler delegate) {
        this.delegate = delegate;
    }

    @Override
    public void printFiles(AppEvent.PrintFilesEvent PrintFilesEvent) {
        delegate.printFiles(new PrintFilesEvent(PrintFilesEvent.getFiles()));
    }
}