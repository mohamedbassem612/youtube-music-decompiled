package defpackage;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kdl extends kbw {
    public final Set a = DesugarCollections.synchronizedSet(new HashSet());
    private int d = b;
    private static final khn c = new khn("AppVisibilityProxy", (String) null);
    static final int b = 1;

    @Override // defpackage.kbx
    public final kuo b() {
        return new kun(this);
    }

    @Override // defpackage.kbx
    public final void c() {
        c.a("onAppEnteredBackground", new Object[0]);
        this.d = 2;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((kdk) it.next()).a();
        }
    }

    @Override // defpackage.kbx
    public final void d() {
        c.a("onAppEnteredForeground", new Object[0]);
        this.d = 1;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((kdk) it.next()).b();
        }
    }

    public final void e(kdk kdkVar) {
        this.a.add(kdkVar);
    }

    public final boolean f() {
        return this.d == 2;
    }
}
