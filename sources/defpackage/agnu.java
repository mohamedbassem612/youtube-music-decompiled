package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class agnu extends WeakReference implements agnt {
    final agms a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agnu(ReferenceQueue referenceQueue, Object obj, agms agmsVar) {
        super(obj, referenceQueue);
        agnw.d(obj);
        this.a = agmsVar;
    }

    @Override // defpackage.agnt
    public final agms a() {
        return this.a;
    }

    @Override // defpackage.agnt
    public final agnt b(ReferenceQueue referenceQueue, agms agmsVar) {
        return new agnu(referenceQueue, get(), agmsVar);
    }
}
