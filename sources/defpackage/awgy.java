package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class awgy extends avmc {
    final Callable a;

    public awgy(Callable callable) {
        this.a = callable;
    }

    @Override // defpackage.avmc
    protected final void G(avmd avmdVar) {
        try {
            th = (Throwable) ((avog) this.a).a;
        } catch (Throwable th) {
            th = th;
            avkz.a(th);
        }
        avns.h(th, avmdVar);
    }
}
