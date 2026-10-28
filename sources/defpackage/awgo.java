package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class awgo extends avmc {
    final Callable a;

    public awgo(Callable callable) {
        this.a = callable;
    }

    @Override // defpackage.avmc
    protected final void G(avmd avmdVar) {
        try {
            avmf avmfVar = (avmf) this.a.call();
            avmfVar.getClass();
            avmfVar.F(avmdVar);
        } catch (Throwable th) {
            avkz.a(th);
            avns.h(th, avmdVar);
        }
    }
}
