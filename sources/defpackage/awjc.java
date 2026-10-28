package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awjc extends awih implements Callable {
    private static final long serialVersionUID = 1811839108042568751L;

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        this.d = Thread.currentThread();
        try {
            this.c.run();
            return null;
        } finally {
            lazySet(a);
            this.d = null;
        }
    }
}
