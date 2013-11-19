package org.trypticon.gum.eawt.event;

import java.util.EventListener;

public interface AboutHandler extends EventListener {
    void handleAbout(AboutEvent aboutEvent);
}
