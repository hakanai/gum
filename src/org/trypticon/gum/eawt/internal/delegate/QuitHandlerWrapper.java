package org.trypticon.gum.eawt.internal.delegate;

import com.apple.eawt.AppEvent;
import com.apple.eawt.QuitResponse;
import org.trypticon.gum.eawt.event.QuitEvent;
import org.trypticon.gum.eawt.event.QuitHandler;

public class QuitHandlerWrapper implements com.apple.eawt.QuitHandler {
    private final QuitHandler delegate;

    public QuitHandlerWrapper(QuitHandler delegate) {
        this.delegate = delegate;
    }

    @Override
    public void handleQuitRequestWith(AppEvent.QuitEvent quitEvent, final QuitResponse quitResponse) {
        delegate.handleQuitRequestWith(new QuitEvent(), new org.trypticon.gum.eawt.event.QuitResponse() {
            @Override
            public void performQuit() {
                quitResponse.performQuit();
            }

            @Override
            public void cancelQuit() {
                quitResponse.cancelQuit();
            }
        });
    }
}
