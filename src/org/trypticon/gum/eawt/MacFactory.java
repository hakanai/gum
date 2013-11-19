package org.trypticon.gum.eawt;

import org.trypticon.gum.eawt.internal.delegate.DelegatingApplication;
import org.trypticon.gum.eawt.internal.delegate.DelegatingFullScreenUtilities;
import org.trypticon.gum.eawt.internal.nul.NullApplication;
import org.trypticon.gum.eawt.internal.nul.NullFullScreenUtilities;

/**
 * Factory to get the top-level instance of the application.
 */
public class MacFactory {

    /**
     * <p>Gets a top-level application instance.</p>
     *
     * @return the application.
     */
    public static Application getApplication() {
        if (isMac()) {
            return new DelegatingApplication();
        } else {
            return new NullApplication();
        }
    }

    /**
     * <p>Gets an instance of the full screen utilities.</p>
     *
     * @return the full screen utilities.
     */
    public static FullScreenUtilities getFullScreenUtilities() {
        if (isMac()) {
            return new DelegatingFullScreenUtilities();
        } else {
            return new NullFullScreenUtilities();
        }
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
