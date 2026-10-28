package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class aqc {
    static final aqc a = new aqc(null, null);
    final Runnable b;
    final Executor c;
    aqc next;

    public aqc(Runnable runnable, Executor executor) {
        this.b = runnable;
        this.c = executor;
    }
}
