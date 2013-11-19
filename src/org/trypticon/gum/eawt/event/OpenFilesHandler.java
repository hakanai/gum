package org.trypticon.gum.eawt.event;

import java.util.EventListener;

public interface OpenFilesHandler extends EventListener {
    void openFiles(OpenFilesEvent openFilesEvent);
}
