package org.trypticon.gum.concurrent.internal;

import org.trypticon.gum.concurrent.Dispatch;
import org.trypticon.gum.concurrent.Priority;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

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
