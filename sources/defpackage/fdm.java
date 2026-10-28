package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fdm implements fcz {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());

    @Override // defpackage.fcz
    public final void k() {
        Iterator it = ffs.e(this.a).iterator();
        while (it.hasNext()) {
            ((fem) it.next()).k();
        }
    }

    @Override // defpackage.fcz
    public final void l() {
        Iterator it = ffs.e(this.a).iterator();
        while (it.hasNext()) {
            ((fem) it.next()).l();
        }
    }

    @Override // defpackage.fcz
    public final void m() {
        Iterator it = ffs.e(this.a).iterator();
        while (it.hasNext()) {
            ((fem) it.next()).m();
        }
    }
}
