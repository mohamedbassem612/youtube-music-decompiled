package defpackage;

import java.lang.ref.ReferenceQueue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
class agnq extends agmn implements agns {
    public volatile agnt b;

    public agnq(ReferenceQueue referenceQueue, Object obj, int i) {
        super(referenceQueue, obj, i);
        this.b = agnw.a;
    }

    @Override // defpackage.agms
    public final Object d() {
        return this.b.get();
    }

    @Override // defpackage.agns
    public final agnt e() {
        return this.b;
    }
}
