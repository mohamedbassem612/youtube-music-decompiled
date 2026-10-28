package defpackage;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class agee implements ageg {
    @Override // defpackage.ageg
    public final void a(Class cls, ReferenceQueue referenceQueue, PhantomReference phantomReference) {
        aggc.startFinalizer(cls, referenceQueue, phantomReference);
    }
}
