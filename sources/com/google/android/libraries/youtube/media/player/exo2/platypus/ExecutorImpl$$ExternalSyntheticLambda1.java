package com.google.android.libraries.youtube.media.player.exo2.platypus;

import defpackage.zik;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ExecutorImpl$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ Runnable a;

    public /* synthetic */ ExecutorImpl$$ExternalSyntheticLambda1(Runnable runnable) {
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = this.a;
        synchronized (zik.class) {
            runnable.run();
        }
    }
}
