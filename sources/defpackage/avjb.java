package defpackage;

import java.util.concurrent.Future;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avjb {
    public final Object a;
    Future b;
    public boolean c;

    public avjb(Object obj) {
        this.a = obj;
    }

    public final Future a() {
        this.c = true;
        return this.b;
    }

    final void b(Future future) {
        boolean z;
        synchronized (this.a) {
            z = this.c;
            if (!z) {
                this.b = future;
            }
        }
        if (z) {
            future.cancel(false);
        }
    }
}
