package com.google.android.libraries.youtube.media.interfaces;

import com.google.protos.youtube.api.innertube.InnertubeContext$ClientInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class MediaFetchCallbacks {
    public abstract void acquireNetworkPriority(boolean z);

    public abstract InnertubeContext$ClientInfo getClientInfo();

    public abstract Time getCurrentPlaybackPosition();

    public abstract boolean isNetworkActive();

    public abstract void prefetch(boolean z);
}
