package org.trypticon.gum.eawt.event;

/**
 * @author trejkaz
 */
public interface AppHiddenListener extends AppEventListener {
    void appHidden(AppHiddenEvent appHiddenEvent);
    void appUnhidden(AppHiddenEvent appHiddenEvent);
}
