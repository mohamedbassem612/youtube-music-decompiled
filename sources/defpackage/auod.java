package defpackage;

import internal.org.jni_zero.CommonApis;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class auod implements auns {
    public final Set a = new HashSet();
    private boolean b = false;

    public final void a() {
        CommonApis.k();
        this.b = true;
        for (afma afmaVar : this.a) {
            awrc.O(afmaVar.a);
            afmaVar.b.getLifecycle().c(afmaVar);
        }
    }

    public final void b() {
        if (this.b) {
            throw new IllegalStateException("There was a race between the call to add/remove an OnClearedListener and onCleared(). This can happen when posting to the Main thread from a background thread, which is not supported.");
        }
    }
}
