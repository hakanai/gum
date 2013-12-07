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
import com.apple.eawt.QuitResponse;
import org.trypticon.gum.eawt.event.QuitEvent;
import org.trypticon.gum.eawt.event.QuitHandler;

/**
 * @author trejkaz
 */
class QuitHandlerWrapper implements com.apple.eawt.QuitHandler {
    private final QuitHandler delegate;

    public QuitHandlerWrapper(QuitHandler delegate) {
        this.delegate = delegate;
    }

    @Override
    public void handleQuitRequestWith(AppEvent.QuitEvent quitEvent, final QuitResponse quitResponse) {
        delegate.handleQuitRequestWith(new QuitEvent(), new org.trypticon.gum.eawt.event.QuitResponse() {
            @Override
            public void performQuit() {
                quitResponse.performQuit();
            }

            @Override
            public void cancelQuit() {
                quitResponse.cancelQuit();
            }
        });
    }
}
