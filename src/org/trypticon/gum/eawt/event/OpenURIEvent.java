package org.trypticon.gum.eawt.event;

import java.net.URI;

/**
 * @author trejkaz
 */
public class OpenURIEvent extends AppEvent {
    private final URI uri;

    public OpenURIEvent(URI uri) {
        this.uri = uri;
    }

    public URI getURI() {
        return uri;
    }
}
