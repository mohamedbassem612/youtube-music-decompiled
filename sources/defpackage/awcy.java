package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awcy extends avlr {
    final Iterable a;

    public awcy(Iterable iterable) {
        this.a = iterable;
    }

    @Override // defpackage.avlr
    public final void e(avlw avlwVar) {
        try {
            Iterator it = this.a.iterator();
            try {
                if (!it.hasNext()) {
                    avlwVar.d(avns.a);
                    avlwVar.kn();
                    return;
                }
                awcx awcxVar = new awcx(avlwVar, it);
                avlwVar.d(awcxVar);
                if (awcxVar.d) {
                    return;
                }
                while (!awcxVar.c) {
                    try {
                        Iterator it2 = awcxVar.b;
                        Object next = it2.next();
                        next.getClass();
                        awcxVar.a.kk(next);
                        if (awcxVar.c) {
                            return;
                        }
                        try {
                            if (!it2.hasNext()) {
                                if (awcxVar.c) {
                                    return;
                                }
                                awcxVar.a.kn();
                                return;
                            }
                        } catch (Throwable th) {
                            avkz.a(th);
                            awcxVar.a.b(th);
                            return;
                        }
                    } catch (Throwable th2) {
                        avkz.a(th2);
                        awcxVar.a.b(th2);
                        return;
                    }
                }
            } catch (Throwable th3) {
                avkz.a(th3);
                avns.g(th3, avlwVar);
            }
        } catch (Throwable th4) {
            avkz.a(th4);
            avns.g(th4, avlwVar);
        }
    }
}
