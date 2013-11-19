package org.trypticon.gum.eawt.event;

import java.util.EventListener;

public interface OpenURIHandler extends EventListener {
    void openURI(OpenURIEvent openURIEvent);
}
