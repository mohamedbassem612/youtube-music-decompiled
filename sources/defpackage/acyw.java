package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acyw {
    public final tsr a;
    public final agev b;
    public volatile boolean d;
    public final Set c = Collections.newSetFromMap(new ConcurrentHashMap());
    public volatile String e = "en-US";

    public acyw(tsr tsrVar, agev agevVar) {
        this.a = tsrVar;
        this.b = agevVar;
    }

    public final avlb a() {
        return this.d ? avlb.e() : this.a.g.p();
    }

    public final void b() {
        if (this.d) {
            return;
        }
        tsr tsrVar = this.a;
        tsrVar.e.abandonAudioFocus(tsrVar);
        Iterator it = tsrVar.h.iterator();
        while (it.hasNext()) {
            ((aeiv) it.next()).l(false, true, tsrVar.i);
        }
    }

    public final void c(int i) {
        tsr tsrVar = this.a;
        int iAx = acfz.ax(i);
        if (iAx == 0) {
            tsrVar.i = 2;
            iAx = 0;
        } else {
            tsrVar.i = iAx;
        }
        ((tsl) ((agfa) this.b).a).i = iAx != 0 ? iAx : 2;
    }

    public final void d(boolean z) {
        this.a.h(z);
        ((tsl) ((agfa) this.b).a).f(z);
    }

    public final void e(mgr mgrVar) {
        this.c.remove(mgrVar);
        this.a.j(mgrVar);
        ((tsl) ((agfa) this.b).a).e(mgrVar);
    }
}
