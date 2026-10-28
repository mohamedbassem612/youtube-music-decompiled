package com.google.android.libraries.youtube.media.interfaces;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class BandaidConnectionOpenerConfig {
    final long bandaidOpenerInactiveStopThresholdMs;
    final int maxPrewarmConnections;
    final long openedConnectionFudgeMs;
    final long pingIntervalMs;
    final ArrayList prewarmOnlyWhenNetworkActiveConnectionTypes;
    final long randomizeRedirectorUriIdParamIntervalMs;
    final String redirectorUri;
    final ArrayList redirectorUris;
    final boolean useA1Subdomain;

    public BandaidConnectionOpenerConfig(long j, long j2, long j3, int i, ArrayList arrayList, boolean z, long j4, String str, ArrayList arrayList2) {
        this.openedConnectionFudgeMs = j;
        this.randomizeRedirectorUriIdParamIntervalMs = j2;
        this.bandaidOpenerInactiveStopThresholdMs = j3;
        this.maxPrewarmConnections = i;
        this.prewarmOnlyWhenNetworkActiveConnectionTypes = arrayList;
        this.useA1Subdomain = z;
        this.pingIntervalMs = j4;
        this.redirectorUri = str;
        this.redirectorUris = arrayList2;
    }

    public long getBandaidOpenerInactiveStopThresholdMs() {
        return this.bandaidOpenerInactiveStopThresholdMs;
    }

    public int getMaxPrewarmConnections() {
        return this.maxPrewarmConnections;
    }

    public long getOpenedConnectionFudgeMs() {
        return this.openedConnectionFudgeMs;
    }

    public long getPingIntervalMs() {
        return this.pingIntervalMs;
    }

    public ArrayList getPrewarmOnlyWhenNetworkActiveConnectionTypes() {
        return this.prewarmOnlyWhenNetworkActiveConnectionTypes;
    }

    public long getRandomizeRedirectorUriIdParamIntervalMs() {
        return this.randomizeRedirectorUriIdParamIntervalMs;
    }

    public String getRedirectorUri() {
        return this.redirectorUri;
    }

    public ArrayList getRedirectorUris() {
        return this.redirectorUris;
    }

    public boolean getUseA1Subdomain() {
        return this.useA1Subdomain;
    }

    public String toString() {
        ArrayList arrayList = this.redirectorUris;
        return "BandaidConnectionOpenerConfig{openedConnectionFudgeMs=" + this.openedConnectionFudgeMs + ",randomizeRedirectorUriIdParamIntervalMs=" + this.randomizeRedirectorUriIdParamIntervalMs + ",bandaidOpenerInactiveStopThresholdMs=" + this.bandaidOpenerInactiveStopThresholdMs + ",maxPrewarmConnections=" + this.maxPrewarmConnections + ",prewarmOnlyWhenNetworkActiveConnectionTypes=" + String.valueOf(this.prewarmOnlyWhenNetworkActiveConnectionTypes) + ",useA1Subdomain=" + this.useA1Subdomain + ",pingIntervalMs=" + this.pingIntervalMs + ",redirectorUri=" + this.redirectorUri + ",redirectorUris=" + String.valueOf(arrayList) + '}';
    }
}
