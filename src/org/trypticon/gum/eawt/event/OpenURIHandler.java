package org.trypticon.gum.eawt.event;

import java.util.EventListener;

/**
 * @author trejkaz
 */
public interface OpenURIHandler extends EventListener {
    void openURI(OpenURIEvent openURIEvent);
}
