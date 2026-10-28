package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class evd extends WeakReference {
    final ett a;
    final boolean b;
    ewf c;

    public evd(ett ettVar, evz evzVar, ReferenceQueue referenceQueue, boolean z) {
        super(evzVar, referenceQueue);
        if (ettVar == null) {
            throw new NullPointerException("Argument must not be null");
        }
        this.a = ettVar;
        boolean z2 = evzVar.a;
        ewf ewfVar = null;
        if (z2 && z) {
            ewfVar = evzVar.b;
        }
        this.c = ewfVar;
        this.b = z2;
    }

    final void a() {
        this.c = null;
        clear();
    }
}
