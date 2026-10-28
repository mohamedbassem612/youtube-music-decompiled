package com.google.common.util.concurrent;

import com.google.common.util.concurrent.MoreExecutors;
import defpackage.ahch;
import defpackage.ahds;
import defpackage.ahex;
import defpackage.ahey;
import defpackage.ahfa;
import defpackage.ahfd;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class MoreExecutors {
    private MoreExecutors() {
    }

    public static ahex a(ExecutorService executorService) {
        if (executorService instanceof ahex) {
            return (ahex) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new ahfd((ScheduledExecutorService) executorService) : new ahfa(executorService);
    }

    public static ahey b(ScheduledExecutorService scheduledExecutorService) {
        return scheduledExecutorService instanceof ahey ? (ahey) scheduledExecutorService : new ahfd(scheduledExecutorService);
    }

    public static Executor c(final Executor executor, final ahch ahchVar) {
        executor.getClass();
        return executor != directExecutor() ? new Executor() { // from class: ahez
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                MoreExecutors.d(executor, ahchVar, runnable);
            }
        } : executor;
    }

    public static /* synthetic */ void d(Executor executor, ahch ahchVar, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (RejectedExecutionException e) {
            ahchVar.setException(e);
        }
    }

    public static Executor directExecutor() {
        return ahds.INSTANCE;
    }
}
