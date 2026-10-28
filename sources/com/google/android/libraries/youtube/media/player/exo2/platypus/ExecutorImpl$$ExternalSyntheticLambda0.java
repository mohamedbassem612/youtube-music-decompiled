package com.google.android.libraries.youtube.media.player.exo2.platypus;

import defpackage.zik;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ExecutorImpl$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ ExecutorImpl a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ ExecutorImpl$$ExternalSyntheticLambda0(ExecutorImpl executorImpl, Runnable runnable) {
        this.a = executorImpl;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = this.b;
        try {
            synchronized (zik.class) {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            this.a.b(th2);
        }
    }
}
