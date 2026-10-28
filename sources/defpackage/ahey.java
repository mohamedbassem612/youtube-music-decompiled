package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public interface ahey extends ScheduledExecutorService, ahex {
    ahew b(Runnable runnable, long j, TimeUnit timeUnit);

    ahew c(Callable callable, long j, TimeUnit timeUnit);

    ahew d(Runnable runnable, long j, long j2, TimeUnit timeUnit);

    ahew e(Runnable runnable, long j, long j2, TimeUnit timeUnit);
}
