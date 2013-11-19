package org.trypticon.gum.eawt.event;

public class OpenFilesEvent extends FilesEvent {
    private final String searchTerm;

    public OpenFilesEvent(java.util.List<java.io.File> files, String searchTerm) {
        super(files);
        this.searchTerm = searchTerm;
    }

    public String getSearchTerm() {
        return searchTerm;
    }
}
