package com.google.android.libraries.youtube.media.player.exo2.platypus;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class GlobalRequestCounterWrapper {
    private GlobalRequestCounterWrapper() {
    }

    public static final long a() {
        PlatypusNativeLoader.a();
        return nativeNextRequestNumber();
    }

    private static final native long nativeNextRequestNumber();

    private static final native void nativeResetForTesting();
}
