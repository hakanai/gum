/*
 * Gum - a thin shim around the com.apple extension classes
 * Copyright (C) 2013  Trejkaz
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

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
