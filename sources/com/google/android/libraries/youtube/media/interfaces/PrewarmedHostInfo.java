package com.google.android.libraries.youtube.media.interfaces;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class PrewarmedHostInfo {
    final String openedHost;
    final int rttMs;
    final String validBandaidUri;

    public PrewarmedHostInfo(String str, int i, String str2) {
        this.openedHost = str;
        this.rttMs = i;
        this.validBandaidUri = str2;
    }

    public String getOpenedHost() {
        return this.openedHost;
    }

    public int getRttMs() {
        return this.rttMs;
    }

    public String getValidBandaidUri() {
        return this.validBandaidUri;
    }

    public String toString() {
        return "PrewarmedHostInfo{openedHost=" + this.openedHost + ",rttMs=" + this.rttMs + ",validBandaidUri=" + this.validBandaidUri + '}';
    }
}
