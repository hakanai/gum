package org.trypticon.gum.eawt;

/**
 * Strategy specifying what will actually be done when the application quits.
 */
public enum QuitStrategy {

    /**
     * Will execute {@code System.exit(0)}.
     */
    SYSTEM_EXIT_0,

    /**
     * Will close all remaining windows.
     */
    CLOSE_ALL_WINDOWS

}
