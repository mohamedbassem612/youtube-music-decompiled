package com.google.research.xeno.effect;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public class MultiEffectSingleGraph {
    public final Effect a;

    public MultiEffectSingleGraph(long j) {
        new ReentrantReadWriteLock();
        this.a = new Effect(j);
    }

    public static native long nativeCreate(long[] jArr, boolean[] zArr, Control[] controlArr, String[] strArr);
}
