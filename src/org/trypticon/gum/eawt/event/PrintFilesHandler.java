package org.trypticon.gum.eawt.event;

import java.util.EventListener;

public interface PrintFilesHandler extends EventListener {
    void printFiles(PrintFilesEvent printFilesEvent);
}
