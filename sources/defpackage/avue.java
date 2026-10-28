package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avue extends avlh {
    final Iterable b;

    public avue(Iterable iterable) {
        this.b = iterable;
    }

    @Override // defpackage.avlh
    public final void ar(axsp axspVar) {
        try {
            Iterator it = this.b.iterator();
            try {
                if (!it.hasNext()) {
                    axspVar.e(awjx.INSTANCE);
                    axspVar.kn();
                } else if (axspVar instanceof avok) {
                    axspVar.e(new avuc((avok) axspVar, it));
                } else {
                    axspVar.e(new avud(axspVar, it));
                }
            } catch (Throwable th) {
                avkz.a(th);
                awjx.f(th, axspVar);
            }
        } catch (Throwable th2) {
            avkz.a(th2);
            awjx.f(th2, axspVar);
        }
    }
}
