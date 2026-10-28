package defpackage;

import java.io.Closeable;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public interface avdz extends Closeable {
    ScheduledExecutorService a();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();
}
