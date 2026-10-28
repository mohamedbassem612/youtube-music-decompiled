package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class agkq extends agqr {
    int a;
    Object b;
    final /* synthetic */ Iterator c;

    public agkq(Iterator it) {
        this.c = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a > 0 || this.c.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int iA = this.a;
        if (iA <= 0) {
            agox agoxVar = (agox) this.c.next();
            this.b = agoxVar.a;
            iA = agoxVar.a();
        }
        this.a = iA - 1;
        Object obj = this.b;
        obj.getClass();
        return obj;
    }
}
