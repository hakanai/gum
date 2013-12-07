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

package org.trypticon.gum.eio.internal;


import org.trypticon.gum.eio.Domain;
import org.trypticon.gum.eio.FileManager;
import org.trypticon.gum.eio.FolderType;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Delegating implementation of the file manager.
 *
 * @author trejkaz
 */
public class DelegatingFileManager implements FileManager {
    @Override
    public int OSTypeToInt(String type) {
        return com.apple.eio.FileManager.OSTypeToInt(type);
    }

    @Override
    public void setFileTypeAndCreator(File file, int type, int creator) throws IOException {
        com.apple.eio.FileManager.setFileTypeAndCreator(file.getAbsolutePath(), type, creator);
    }

    @Override
    public void setFileType(File file, int type) throws IOException {
        com.apple.eio.FileManager.setFileType(file.getAbsolutePath(), type);

    }

    @Override
    public void setFileCreator(File file, int creator) throws IOException {
        com.apple.eio.FileManager.setFileCreator(file.getAbsolutePath(), creator);
    }

    @Override
    public int getFileType(File file) throws IOException {
        return com.apple.eio.FileManager.getFileType(file.getAbsolutePath());
    }

    @Override
    public int getFileCreator(File file) throws IOException {
        return com.apple.eio.FileManager.getFileCreator(file.getAbsolutePath());
    }

    @Override
    public File findFolder(FolderType folderType) throws FileNotFoundException {
        return new File(com.apple.eio.FileManager.findFolder(FolderTypeMappings.convert(folderType)));
    }

    @Override
    public File findFolder(Domain domain, FolderType folderType) throws FileNotFoundException {
        return new File(com.apple.eio.FileManager.findFolder(DomainMappings.convert(domain), FolderTypeMappings.convert(folderType)));
    }

    @Override
    public File findFolder(Domain domain, FolderType folderType, boolean createIfNeeded) throws FileNotFoundException {
        return new File(com.apple.eio.FileManager.findFolder(DomainMappings.convert(domain), FolderTypeMappings.convert(folderType), createIfNeeded));
    }

    @Override
    public File getResource(String resourceName) throws FileNotFoundException {
        return new File(com.apple.eio.FileManager.getResource(resourceName));
    }

    @Override
    public File getResource(String resourceName, String subDirName) throws FileNotFoundException {
        return new File(com.apple.eio.FileManager.getResource(resourceName, subDirName));
    }

    @Override
    public File getResource(String resourceName, String subDirName, String type) throws FileNotFoundException {
        return new File(com.apple.eio.FileManager.getResource(resourceName, subDirName, type));
    }

    @Override
    public File getPathToApplicationBundle() {
        return new File(com.apple.eio.FileManager.getPathToApplicationBundle());
    }

    @Override
    public boolean moveToTrash(File file) throws FileNotFoundException {
        return com.apple.eio.FileManager.moveToTrash(file);
    }

    @Override
    public boolean revealInFinder(File file) throws FileNotFoundException {
        return com.apple.eio.FileManager.revealInFinder(file);
    }
}
