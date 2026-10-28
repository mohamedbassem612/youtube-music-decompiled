package defpackage;

import java.util.Deque;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class agww extends aggd {
    final /* synthetic */ Deque a;
    final /* synthetic */ Deque b;
    final /* synthetic */ ahub c;

    public agww(ahub ahubVar, Deque deque, Deque deque2) {
        this.a = deque;
        this.b = deque2;
        this.c = ahubVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [agwu, java.lang.Object] */
    @Override // defpackage.aggd
    protected final Object a() {
        Deque deque = this.a;
        while (true) {
            Object objG = ahub.g(deque);
            if (objG == null) {
                Deque deque2 = this.b;
                if (!deque2.isEmpty()) {
                    return deque2.pop();
                }
                b();
                return null;
            }
            Iterator it = this.c.a.b(objG).iterator();
            if (!it.hasNext()) {
                return objG;
            }
            deque.addFirst(it);
            this.b.push(objG);
        }
    }
}
