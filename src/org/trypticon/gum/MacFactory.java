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

package org.trypticon.gum;

import org.trypticon.gum.concurrent.Dispatch;
import org.trypticon.gum.concurrent.internal.DelegatingDispatch;
import org.trypticon.gum.eawt.Application;
import org.trypticon.gum.eawt.FullScreenUtilities;
import org.trypticon.gum.eawt.internal.DelegatingApplication;
import org.trypticon.gum.eawt.internal.DelegatingFullScreenUtilities;
import org.trypticon.gum.eio.FileManager;
import org.trypticon.gum.eio.internal.DelegatingFileManager;

/**
 * Factory to get the top-level instance of the application.
 *
 * @author trejkaz
 */
public class MacFactory {

    /**
     * <p>Gets a top-level application instance.</p>
     *
     * @return the application. Returns {@code null} if the service is not available on the current platform.
     */
    public static Application getApplication() {
        if (isMac()) {
            return new DelegatingApplication();
        }
        return null;
    }

    /**
     * <p>Gets an instance of the full screen utilities.</p>
     *
     * @return the full screen utilities. Returns {@code null} if the service is not available on the current platform.
     */
    public static FullScreenUtilities getFullScreenUtilities() {
        if (isMac()) {
            return new DelegatingFullScreenUtilities();
        }
        return null;
    }

    /**
     * <p>Gets an instance of the concurrent dispatch utilities.</p>
     *
     * @return the concurrent dispatch utilities. Returns {@code null} if the service is not available on
     *         the current platform.
     */
    public static Dispatch getDispatch() {
        if (isMac()) {
            DelegatingDispatch dispatch = new DelegatingDispatch();
            if (dispatch.isSupported()) {
                return dispatch;
            }
        }
        return null;
    }

    /**
     * <p>Gets an instance of the file manager.</p>
     *
     * @return the file manager. Returns {@code null} if the service is not available on the current platform.
     */
    public static FileManager getFileManager() {
        if (isMac()) {
            return new DelegatingFileManager();
        }
        return null;
    }

    /**
     * <p>Tests whether we're running on Mac OS X.</p>
     *
     * <p>You might call this if you want to check if you can avoid doing any Mac-specific work at all,
     *    but it would also be useful if you're building a menu and have to decide which actions to hide.</p>
     *
     * @return {@code true} if we're running on Mac OS X, {@code false} otherwise.
     */
    public static boolean isMac() {
        String osName = System.getProperty("os.name").toLowerCase();
        return osName.startsWith("mac") || osName.startsWith("darwin");
    }

}
