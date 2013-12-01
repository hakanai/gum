package org.trypticon.gum.eio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Provides functionality to query and modify Mac-specific file attributes.
 *
 * @author trejkaz
 */
public interface FileManager {

    /**
     * Converts an OSType (e.g. "macs") into an int.
     * 
     * @param type the 4 character type to convert.
     * @return an int representing the 4 character value
     */
    @SuppressWarnings("deprecation")
    int OSTypeToInt(String type);

    /**
     * Sets the file {@code type} and {@code creator} codes for a file or folder.
     */
    void setFileTypeAndCreator(File file, int type, int creator) throws IOException;

    /**
     * Sets the file {@code type} code for a file or folder.
     */
    void setFileType(File file, int type) throws IOException;

    /**
     * Sets the file {@code creator} code for a file or folder.
     */
    void setFileCreator(File file, int creator) throws IOException;

    /**
     * Obtains the file {@code type} code for a file or folder.
     */
    int getFileType(File file) throws IOException;

    /**
     * Obtains the file {@code creator} code for a file or folder.
     */
    int getFileCreator(File file) throws IOException;

    /**
     * Locates a folder of a particular type. Mac OS X recognizes certain specific folders that have distinct purposes.
     * For example, the user's desktop or temporary folder. These folders have corresponding codes. Given one of these codes,
     * this method returns the path to that particular folder. Certain folders of a given type may appear in more than
     * one domain. For example, although there is only one {@code root} folder, there are multiple {@code pref}
     * folders. If this method is called to find the {@code pref} folder, it will return the first one it finds,
     * the user's preferences folder in {@code ~/Library/Preferences}. To explicitly locate a folder in a certain
     * domain use {@code findFolder(short domain, int folderType)} or {@code findFolder(short domain, int folderType,
     * boolean createIfNeeded)}.
     *
     * @param folderType the folder type to fetch.
     * @return the path to the folder searched for.
     * @see org.trypticon.gum.eio.FolderType
     */
    File findFolder(FolderType folderType) throws FileNotFoundException;

    /**
     * Locates a folder of a particular type, within a given domain. Similar to {@code findFolder(int folderType)}
     * except that the domain to look in can be specified. Valid values for {@code domain}include:
     * <dl>
     *   <dt>user</dt>
     *   <dd>The User domain contains resources specific to the user who is currently logged in</dd>
     *   <dt>local</dt>
     *   <dd>The Local domain contains resources shared by all users of the system but are not needed for the system
     *       itself to run.</dd>
     *   <dt>network</dt>
     *   <dd>The Network domain contains resources shared by users of a local area network.</dd>
     *   <dt>system</dt>
     *   <dd>The System domain contains the operating system resources installed by Apple.</dd>
     * </dl>
     *
     * @return the path to the folder searched for
     * @see org.trypticon.gum.eio.FolderType
     * @see org.trypticon.gum.eio.Domain
     */
    File findFolder(Domain domain, FolderType folderType) throws FileNotFoundException;

    /**
     * Locates a folder of a particular type within a given domain and optionally creating the folder if it does
     * not exist. The behavior is similar to {@code findFolder(int folderType)} and
     * {@code findFolder(short domain, int folderType)} except that it can create the folder if it does not already exist.
     *
     * @param createIfNeeded set to {@code true}, by setting to {@code false} the behavior will be the
     *                       same as {@code findFolder(short domain, int folderType, boolean createIfNeeded)}
     * @return the path to the folder searched for
     * @see org.trypticon.gum.eio.FolderType
     * @see org.trypticon.gum.eio.Domain
     */
    File findFolder(Domain domain, FolderType folderType, boolean createIfNeeded) throws FileNotFoundException;

    /**
     * @return full pathname for the resource identified by a given name.
     */
    File getResource(String resourceName) throws FileNotFoundException;

    /**
     * @return full pathname for the resource identified by a given name and located in the specified bundle subdirectory.
     */
    File getResource(String resourceName, String subDirName) throws FileNotFoundException;

    /**
     * <p>Returns the full pathname for the resource identified by the given name and file extension
     *    and located in the specified bundle subdirectory.</p>
     *
     * <p>If extension is an empty string or null, the returned pathname is the first one encountered where the
     *    file name exactly matches name.</p>
     *
     * <p>If subpath is null, this method searches the top-level nonlocalized resource directory (typically Resources)
     *    and the top-level of any language-specific directories. For example, suppose you have a modern bundle and
     *    specify "Documentation" for the subpath parameter. This method would first look in the
     *    Contents/Resources/Documentation directory of the bundle, followed by the Documentation subdirectories of
     *    each language-specific .lproj directory. (The search order for the language-specific directories
     *    corresponds to the user's preferences.) This method does not recurse through any other subdirectories at
     *    any of these locations. For more details see the AppKit NSBundle documentation.</p>
     *
     * @return full pathname for the resource identified by the given name and file extension and located in the
     *         specified bundle subdirectory.
     */
    File getResource(String resourceName, String subDirName, String type) throws FileNotFoundException;

    /**
     * Obtains the path to the current application's bundle. May not
     * return a valid path if Java was launched from the command line.
     *
     * @return full pathname of the NSBundle of the current application executable.
     */
    File getPathToApplicationBundle();

    /**
     * Moves the specified file to the Trash
     *
     * @param file the file.
     * @return returns true if the file was successfully moved to the Trash.
     * @throws FileNotFoundException if the file was not found.
     */
    boolean moveToTrash(File file) throws FileNotFoundException;

    /**
     * Reveals the specified file in the Finder
     *
     * @param file the file to reveal
     * @return returns true if the file was successfully revealed in the Finder.
     * @throws FileNotFoundException if the file was not found.
     */
    boolean revealInFinder(File file) throws FileNotFoundException;
}
