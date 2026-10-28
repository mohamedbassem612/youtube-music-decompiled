package com.google.android.libraries.youtube.media.interfaces;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class TimerFactory {
    public abstract Timer createOneShotTimer(Executor executor, long j, long j2, Runnable runnable);

    public abstract Timer createRepeatingTimer(Executor executor, long j, long j2, long j3, Runnable runnable);
}
