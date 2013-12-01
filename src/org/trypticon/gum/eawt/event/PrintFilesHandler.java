package org.trypticon.gum.eawt.event;

import java.util.EventListener;

/**
 * @author trejkaz
 */
public interface PrintFilesHandler extends EventListener {
    void printFiles(PrintFilesEvent printFilesEvent);
}
