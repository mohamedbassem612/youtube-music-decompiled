package org.chromium.net.impl;

import android.content.Context;
import defpackage.axnh;
import defpackage.axnk;
import defpackage.axnl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class CronetUmaRecorder {
    public static volatile CronetUmaRecorder a;
    private final axnk b;
    private final axnh c;

    public CronetUmaRecorder(Context context, axnh axnhVar) {
        this.c = axnhVar;
        this.b = axnl.a(context, axnhVar);
    }

    public static void logCronetUmaHistogram(long j, int i) {
        CronetUmaRecorder cronetUmaRecorder = a;
        if (cronetUmaRecorder == null) {
            throw new IllegalStateException("CronetUmaRecorder is not initialized!");
        }
        cronetUmaRecorder.b.h(j, i, cronetUmaRecorder.c);
    }
}
