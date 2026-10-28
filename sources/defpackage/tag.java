package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public interface tag {
    ScheduledFuture a(tai taiVar, Runnable runnable, long j, TimeUnit timeUnit);

    void b(tai taiVar, Runnable runnable);
}
