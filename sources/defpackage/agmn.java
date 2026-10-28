package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
abstract class agmn extends WeakReference implements agms {
    final int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agmn(ReferenceQueue referenceQueue, Object obj, int i) {
        super(obj, referenceQueue);
        agnw.d(obj);
        this.a = i;
    }

    @Override // defpackage.agms
    public final int a() {
        return this.a;
    }

    @Override // defpackage.agms
    public agms b() {
        return null;
    }

    @Override // defpackage.agms
    public final Object c() {
        return get();
    }
}
