package org.trypticon.gum.eawt.event;

/**
 * @author trejkaz
 */
public interface FullScreenListener extends AppEventListener {
    void windowEnteringFullScreen(FullScreenEvent fullScreenEvent);
    void windowEnteredFullScreen(FullScreenEvent fullScreenEvent);
    void windowExitingFullScreen(FullScreenEvent fullScreenEvent);
    void windowExitedFullScreen(FullScreenEvent fullScreenEvent);
}
