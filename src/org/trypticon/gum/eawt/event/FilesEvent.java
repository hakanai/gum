package org.trypticon.gum.eawt.event;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class FilesEvent extends AppEvent {
    private final List<File> files;

    protected FilesEvent(List<File> files) {
        this.files = new ArrayList<File>(files);
    }

    public List<File> getFiles() {
        return Collections.unmodifiableList(files);
    }
}