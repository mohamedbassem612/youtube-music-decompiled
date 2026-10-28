package defpackage;

import java.util.concurrent.Future;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awcw extends avlr {
    final Future a;

    public awcw(Future future) {
        this.a = future;
    }

    @Override // defpackage.avlr
    public final void e(avlw avlwVar) {
        avpb avpbVar = new avpb(avlwVar);
        avlwVar.d(avpbVar);
        if (avpbVar.f()) {
            return;
        }
        try {
            Object obj = this.a.get();
            obj.getClass();
            avpbVar.e(obj);
        } catch (Throwable th) {
            avkz.a(th);
            if (avpbVar.f()) {
                return;
            }
            avlwVar.b(th);
        }
    }
}
