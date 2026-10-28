package defpackage;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afuj extends PhantomReference {
    public final afui a;

    public afuj(Object obj, ReferenceQueue referenceQueue) {
        super(obj, referenceQueue);
        this.a = new afui(this);
    }
}
