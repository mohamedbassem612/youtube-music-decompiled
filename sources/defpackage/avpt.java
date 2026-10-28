package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avpt extends avlb {
    final Callable a;

    public avpt(Callable callable) {
        this.a = callable;
    }

    @Override // defpackage.avlb
    protected final void H(avlc avlcVar) {
        try {
            avle avleVar = (avle) this.a.call();
            avleVar.getClass();
            avleVar.kp(avlcVar);
        } catch (Throwable th) {
            avkz.a(th);
            avns.e(th, avlcVar);
        }
    }
}
