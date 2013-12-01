package org.trypticon.gum.eawt.event;

import java.util.EventListener;

/**
 * @author trejkaz
 */
public interface OpenFilesHandler extends EventListener {
    void openFiles(OpenFilesEvent openFilesEvent);
}
