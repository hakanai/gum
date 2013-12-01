package org.trypticon.gum.eawt.event;

import java.util.EventListener;

/**
 * @author trejkaz
 */
public interface AboutHandler extends EventListener {
    void handleAbout(AboutEvent aboutEvent);
}
