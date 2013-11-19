package org.trypticon.gum.eawt.event;

public interface AppHiddenListener extends AppEventListener {
    void appHidden(AppHiddenEvent appHiddenEvent);
    void appUnhidden(AppHiddenEvent appHiddenEvent);
}
