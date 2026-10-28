package com.google.android.libraries.youtube.media.player.exo2.platypus;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ExecutorImpl$$ExternalSyntheticLambda4 implements Runnable {
    public final /* synthetic */ ExecutorImpl a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ ExecutorImpl$$ExternalSyntheticLambda4(ExecutorImpl executorImpl, Runnable runnable) {
        this.a = executorImpl;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ExecutorImpl executorImpl = this.a;
        executorImpl.c.execute(new ExecutorImpl$$ExternalSyntheticLambda0(executorImpl, this.b));
    }
}
