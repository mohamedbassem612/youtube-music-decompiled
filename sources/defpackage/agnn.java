package defpackage;

import java.lang.ref.ReferenceQueue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
class agnn extends agmn implements agms {
    public volatile Object b;

    public agnn(ReferenceQueue referenceQueue, Object obj, int i) {
        super(referenceQueue, obj, i);
        this.b = null;
    }

    @Override // defpackage.agms
    public final Object d() {
        return this.b;
    }
}
