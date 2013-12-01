package org.trypticon.gum.eawt.internal;


import com.apple.eawt.AppEvent;
import org.trypticon.gum.eawt.event.SystemSleepEvent;
import org.trypticon.gum.eawt.event.SystemSleepListener;

/**
 * @author trejkaz
 */
class SystemSleepListenerWrapper implements com.apple.eawt.SystemSleepListener {
    private final SystemSleepListener delegate;

    public SystemSleepListenerWrapper(SystemSleepListener delegate) {
        this.delegate = delegate;
    }

    @Override
    public void systemAboutToSleep(AppEvent.SystemSleepEvent event) {
        delegate.systemAboutToSleep(new SystemSleepEvent());
    }

    @Override
    public void systemAwoke(AppEvent.SystemSleepEvent event) {
        delegate.systemAwoke(new SystemSleepEvent());
    }
}
