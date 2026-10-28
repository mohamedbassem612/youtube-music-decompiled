package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class ahce {
    static final ahce a = new ahce();
    final Runnable b;
    final Executor c;
    ahce next;

    public ahce() {
        this.b = null;
        this.c = null;
    }

    public ahce(Runnable runnable, Executor executor) {
        this.b = runnable;
        this.c = executor;
    }
}
