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
import org.trypticon.gum.eawt.event.FullScreenEvent;
import org.trypticon.gum.eawt.event.FullScreenListener;

/**
 * @author trejkaz
 */
class FullScreenListenerWrapper implements com.apple.eawt.FullScreenListener {
    private final FullScreenListener delegate;

    public FullScreenListenerWrapper(FullScreenListener delegate) {
        this.delegate = delegate;
    }

    @Override
    public void windowEnteringFullScreen(AppEvent.FullScreenEvent event) {
        delegate.windowEnteringFullScreen(new FullScreenEvent(event.getWindow()));
    }

    @Override
    public void windowEnteredFullScreen(AppEvent.FullScreenEvent event) {
        delegate.windowEnteredFullScreen(new FullScreenEvent(event.getWindow()));
    }

    @Override
    public void windowExitingFullScreen(AppEvent.FullScreenEvent event) {
        delegate.windowExitingFullScreen(new FullScreenEvent(event.getWindow()));
    }

    @Override
    public void windowExitedFullScreen(AppEvent.FullScreenEvent event) {
        delegate.windowExitedFullScreen(new FullScreenEvent(event.getWindow()));
    }
}
