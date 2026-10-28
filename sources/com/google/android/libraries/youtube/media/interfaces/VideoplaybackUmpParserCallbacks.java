package com.google.android.libraries.youtube.media.interfaces;

import com.google.protos.youtube.api.innertube.NextRequestPolicyOuterClass$NextRequestPolicy;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class VideoplaybackUmpParserCallbacks {
    public abstract void onError(QoeError qoeError);

    public abstract void onMedia(int i, int i2);

    public abstract void onNextRequestPolicy(NextRequestPolicyOuterClass$NextRequestPolicy nextRequestPolicyOuterClass$NextRequestPolicy);
}
