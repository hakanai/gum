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

package org.trypticon.gum.eawt;

import org.trypticon.gum.eawt.event.*;

import javax.swing.*;
import java.awt.*;

/**
 * Top-level interface to the application.
 *
 * @see org.trypticon.gum.MacFactory#getApplication()
 * @author trejkaz
 */
public interface Application {

    /**
     * <p>Adds a listener for app events.</p>
     *
     * <p>It is possible to implement multiple sub-interfaces of {@link AppEventListener} and add it as a single
     *    listener. Only the relevant events will be fired.</p>
     *
     * @param listener the listener to add.
     */
    void addAppEventListener(AppEventListener listener);

    /**
     * Removes a listener for app events.
     *
     * @param listener the listener to remove.
     */
    void removeAppEventListener(AppEventListener listener);

    /**
     * Sets the handler for when the user activates the About action.
     *
     * @param handler the About handler.
     */
    void setAboutHandler(AboutHandler handler);

    /**
     * Sets the handler for when the user activates the Preferences action.
     *
     * @param handler the Preferences handler.
     */
    void setPreferencesHandler(PreferencesHandler handler);

    /**
     * Sets the handler for when the user is opening files in the application.
     *
     * @param handler the open files handler.
     */
    void setOpenFileHandler(OpenFilesHandler handler);

    /**
     * Sets the handler for when the user is printing files in the application.
     *
     * @param handler the print files handler.
     */
    void setPrintFileHandler(PrintFilesHandler handler);

    /**
     * Sets the handler for when the user is opening a URI in the application.
     *
     * @param handler the open URI handler.
     */
    void setOpenURIHandler(OpenURIHandler handler);

    /**
     * Sets the handler for when the user is quitting the application via the application menu.
     *
     * @param handler the quit handler.
     */
    void setQuitHandler(QuitHandler handler);

    /**
     * Sets the strategy to use for when the application is to be quit.
     *
     * @param strategy the quit strategy.
     */
    void setQuitStrategy(QuitStrategy strategy);

    /**
     * Enables the application to be suddenly terminated. This allows the application to be terminated without
     * any of the usual callbacks you would get which allow the user to intercept being terminated.
     */
    void enableSuddenTermination();

    /**
     * Disables the application from being suddenly terminated.
     */
    void disableSuddenTermination();

    /**
     * Requests the application to move to the foreground.
     * (This sounds like a bad idea for usability.)
     *
     * @param allWindows if {@code true}, will move all windows.
     */
    void requestForeground(boolean allWindows);

    /**
     * Requests user attention (bounces the dock icon.) Critical requests will continue to bounce forever,
     * whereas non-critical ones just bounce once.
     *
     * @param critical {@code true} if the notice is critical.`
     */
    void requestUserAttention(boolean critical);

    /**
     * Opens the help viewer for the application.
     */
    void openHelpViewer();

    /**
     * Sets the popup menu seen when the user activates the menu on the dock icon.
     *
     * @param popupMenu the dock menu.
     */
    void setDockMenu(PopupMenu popupMenu);

    /**
     * Gets the dock menu.
     *
     * @return the dock menu.
     */
    PopupMenu getDockMenu();

    /**
     * Sets the image for the dock item. This can be used to overlay things like progress bars.
     *
     * @param image the dock icon image.
     */
    void setDockIconImage(Image image);

    /**
     * Gets the current image for the dock icon.
     *
     * @return the dock icon image.
     */
    Image getDockIconImage();

    /**
     * Sets a dock icon badge string. This can be used to overlay the common red badge you might have
     * seen on dock icons in other applications.
     *
     * @param text the text to set.
     */
    void setDockIconBadge(String text);

    /**
     * Sets the menu bar to use when no windows are present.
     *
     * @param menuBar the menu bar to set.
     */
    void setDefaultMenuBar(JMenuBar menuBar);

    /**
     * Requests that the given window toggles full screen status.
     *
     * @param window the window to toggle.
     */
    void requestToggleFullScreen(Window window);
}
