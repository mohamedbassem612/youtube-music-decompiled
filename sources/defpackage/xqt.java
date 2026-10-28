package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xqt {
    private static final agrf e = agrf.h("com/google/android/libraries/youtube/mdx/mediaroute/MdxDeviceDiscoveryController");
    protected boolean d;
    private final xla f;
    private final aunn g;
    private final aunn h;
    private final aunn i;
    private boolean j;
    private boolean k;
    private final vxz l;
    private final azs m;
    public final Set a = Collections.newSetFromMap(new ConcurrentHashMap());
    public final Object c = new Object();
    public final Set b = Collections.newSetFromMap(new ConcurrentHashMap());

    public xqt(vxz vxzVar, xla xlaVar, aunn aunnVar, aunn aunnVar2, aunn aunnVar3) {
        this.l = vxzVar;
        this.f = xlaVar;
        this.g = aunnVar;
        this.h = aunnVar2;
        this.i = aunnVar3;
        this.m = new xqs(vxzVar, xlaVar);
    }

    public static void c(vxz vxzVar, xla xlaVar, dim dimVar) {
        if (!vxzVar.l(160, 45662068L, false) || !xlaVar.az() || dimVar == null || dimVar.b) {
            return;
        }
        dil dilVar = new dil(dimVar);
        dilVar.a(true);
        dilVar.b(true);
        dij.n(new dim(dilVar));
    }

    private final void d(boolean z) {
        ((dij) this.g.io()).p((did) this.h.io(), this.m, true != z ? 4 : 1);
    }

    final void a(Object obj) {
        taq.d();
        synchronized (this.c) {
            Set set = this.a;
            boolean zRemove = set.remove(obj);
            Set set2 = this.b;
            set2.remove(obj);
            if (!zRemove) {
                ((agrc) ((agrc) e.c().i(agso.a, "MDX.DiscoveryController")).k("com/google/android/libraries/youtube/mdx/mediaroute/MdxDeviceDiscoveryController", "cancelDiscoveryRequest", 199, "MdxDeviceDiscoveryController.java")).w("cancelDiscoveryRequest ignored requester %s", obj);
                return;
            }
            if (this.j) {
                if (set.isEmpty()) {
                    agrx agrxVar = agso.a;
                    ((dij) this.g.io()).q(this.m);
                    this.j = false;
                    this.k = false;
                } else if (this.k && set2.isEmpty()) {
                    d(false);
                    this.k = false;
                }
            }
        }
    }

    public final void b(Object obj, boolean z) {
        taq.d();
        dij.c();
        dim dimVar = dij.a().q;
        vxz vxzVar = this.l;
        xla xlaVar = this.f;
        c(vxzVar, xlaVar, dimVar);
        if ((!vxzVar.l(160, 45662068L, false) || !xlaVar.az()) && !this.d) {
            dhp dhpVar = (dhp) this.i.io();
            if (dhpVar == null) {
                throw new IllegalArgumentException("providerInstance must not be null");
            }
            dij.c();
            dij.a().i(dhpVar, false);
            this.d = true;
        }
        synchronized (this.c) {
            if (this.a.add(obj)) {
                agrx agrxVar = agso.a;
                if (z) {
                    this.b.add(obj);
                }
                if (!this.j || (z && !this.k)) {
                    d(z);
                    this.j = true;
                    this.k = z;
                }
            }
        }
    }
}
