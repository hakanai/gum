package org.trypticon.gum.eawt.event;

/**
 * @author trejkaz
 */
public interface ScreenSleepListener extends AppEventListener {
    void screenAboutToSleep(ScreenSleepEvent screenSleepEvent);
    void screenAwoke(ScreenSleepEvent screenSleepEvent);
}
