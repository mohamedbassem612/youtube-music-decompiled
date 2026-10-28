package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awft extends avmc implements avon {
    final avlu a;

    public awft(avlu avluVar) {
        this.a = avluVar;
    }

    @Override // defpackage.avmc
    public final void G(avmd avmdVar) {
        try {
            this.a.ak(new awfs(avmdVar, new ArrayList(16)));
        } catch (Throwable th) {
            avkz.a(th);
            avns.h(th, avmdVar);
        }
    }

    @Override // defpackage.avon
    public final avlr a() {
        awfr awfrVar = new awfr(this.a);
        avnn avnnVar = atqp.l;
        return awfrVar;
    }
}
