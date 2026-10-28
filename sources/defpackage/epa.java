package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class epa {
    static final epa a = new epa(null, null);
    final Runnable b;
    final Executor c;
    epa d;

    public epa(Runnable runnable, Executor executor) {
        this.b = runnable;
        this.c = executor;
    }
}
