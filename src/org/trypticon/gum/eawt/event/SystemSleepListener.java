package org.trypticon.gum.eawt.event;

public interface SystemSleepListener extends AppEventListener {
    void systemAboutToSleep(SystemSleepEvent systemSleepEvent);
    void systemAwoke(SystemSleepEvent systemSleepEvent);
}
