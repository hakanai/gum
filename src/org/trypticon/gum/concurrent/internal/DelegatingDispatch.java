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

package org.trypticon.gum.concurrent.internal;

import org.trypticon.gum.concurrent.Dispatch;
import org.trypticon.gum.concurrent.Priority;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/**
 * Delegating implementation of the dispatch utility.
 *
 * @author trejkaz
 */
public class DelegatingDispatch implements Dispatch {
    private final com.apple.concurrent.Dispatch delegate;

    public DelegatingDispatch() {
        delegate = com.apple.concurrent.Dispatch.getInstance();
    }

    public boolean isSupported() {
        return delegate != null;
    }

    @Override
    public Executor getAsyncExecutor(Priority priority) {
        switch (priority) {
            case LOW:
                return delegate.getAsyncExecutor(com.apple.concurrent.Dispatch.Priority.LOW);
            case NORMAL:
                return delegate.getAsyncExecutor(com.apple.concurrent.Dispatch.Priority.NORMAL);
            case HIGH:
                return delegate.getAsyncExecutor(com.apple.concurrent.Dispatch.Priority.HIGH);
            default:
                throw new UnsupportedOperationException("Unsupported priority: " + priority);
        }
    }

    @Override
    public ExecutorService createSerialExecutor(String label) {
        return delegate.createSerialExecutor(label);
    }

    @Override
    public Executor getNonBlockingMainQueueExecutor() {
        return delegate.getNonBlockingMainQueueExecutor();
    }

    @Override
    public Executor getBlockingMainQueueExecutor() {
        return delegate.getBlockingMainQueueExecutor();
    }
}
