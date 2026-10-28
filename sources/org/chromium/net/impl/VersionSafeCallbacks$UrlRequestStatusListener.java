package org.chromium.net.impl;

import org.chromium.net.UrlRequest;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class VersionSafeCallbacks$UrlRequestStatusListener extends UrlRequest.StatusListener {
    private final UrlRequest.StatusListener a;

    public VersionSafeCallbacks$UrlRequestStatusListener(UrlRequest.StatusListener statusListener) {
        this.a = statusListener;
    }

    @Override // org.chromium.net.UrlRequest.StatusListener
    public final void onStatus(int i) {
        this.a.onStatus(i);
    }
}
