package defpackage;

import java.util.concurrent.Future;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avua extends avlh {
    final Future b;

    public avua(Future future) {
        this.b = future;
    }

    @Override // defpackage.avlh
    public final void ar(axsp axspVar) {
        awjw awjwVar = new awjw(axspVar);
        axspVar.e(awjwVar);
        try {
            Object obj = this.b.get();
            if (obj == null) {
                axspVar.b(new NullPointerException("The future returned null"));
            } else {
                awjwVar.f(obj);
            }
        } catch (Throwable th) {
            avkz.a(th);
            if (awjwVar.g()) {
                return;
            }
            axspVar.b(th);
        }
    }
}
