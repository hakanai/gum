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

package org.trypticon.gum.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/**
 * Factory for executor services backed by Apple's global dispatcher.
 *
 * @author trejkaz
 * @see org.trypticon.gum.MacFactory#getDispatch()
 */
public interface Dispatch {
    /**
     * Creates an {@link Executor} that performs tasks asynchronously.
     * The executor cannot be shutdown and enqueued tasks cannot be canceled.
     *
     * @param priority the priority to give the executor. If {@code null}, {@link Priority#NORMAL} is used.
     * @return the executor.
     */
    Executor getAsyncExecutor(Priority priority);

    /**
     * Creates an {@link ExecutorService} that performs tasks synchronously in FIFO order.
     * Useful to protect a resource against concurrent modification, in lieu of a lock.
     * Passing null returns an {@link ExecutorService} with a uniquely labeled queue.
     *
     * @param label - a label to name the queue (shown in debugging tools.)
     * @return the executor service.
     */
    ExecutorService createSerialExecutor(String label);

    /**
     * <p>Gets an {@link Executor} that performs the provided Runnables on the main queue of the process.
     *    Runnables submitted to this {@link Executor} will not run until the AWT is started or another
     *    native toolkit is running a CFRunLoop or NSRunLoop on the main thread.</p>
     *
     * <p>Submitting a Runnable to this {@link Executor} does not wait for the Runnable to complete.</p>
     *
     * @return the executor.
     */
    Executor getNonBlockingMainQueueExecutor();

   /**
    * <p>Returns an {@link Executor} that performs the provided Runnables on the main queue of the process.
    *    Runnables submitted to this {@link Executor} will not run until the AWT is started or another
    *    native toolkit is running a CFRunLoop or NSRunLoop on the main thread.</p>
    *
    * <p>Submitting a Runnable to this {@link Executor} will block until the Runnable has completed.</p>
    *
    * @return the executor.
    */
   Executor getBlockingMainQueueExecutor();
}
