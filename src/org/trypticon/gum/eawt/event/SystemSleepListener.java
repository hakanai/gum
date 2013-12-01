package org.trypticon.gum.eawt.event;

/**
 * @author trejkaz
 */
public interface SystemSleepListener extends AppEventListener {
    void systemAboutToSleep(SystemSleepEvent systemSleepEvent);
    void systemAwoke(SystemSleepEvent systemSleepEvent);
}
