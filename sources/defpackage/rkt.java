package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class rkt implements rks, rkn {
    public final cf a;
    public final mfy b;
    public final xgn c;
    public final ttm d;
    public final Executor e;
    public final vxe f;
    public bp g;
    public final vxz j;
    public final vxz k;
    public final aapw l;
    private final tbt m;
    private final vxz n;
    private final omj o;
    public boolean i = true;
    public final Set h = Collections.newSetFromMap(new ConcurrentHashMap());

    public rkt(cf cfVar, tbt tbtVar, omj omjVar, vxz vxzVar, mfy mfyVar, xgn xgnVar, aapw aapwVar, vxz vxzVar2, vxz vxzVar3, ttm ttmVar, Executor executor, vxe vxeVar, boc bocVar) {
        this.a = cfVar;
        this.m = tbtVar;
        this.o = omjVar;
        this.n = vxzVar;
        this.b = mfyVar;
        this.l = aapwVar;
        this.j = vxzVar2;
        this.k = vxzVar3;
        this.d = ttmVar;
        this.e = executor;
        this.f = vxeVar;
        this.c = xgnVar;
        new vwt(bocVar).A().af(new jqi(this, 8));
    }

    private final void g(rkp rkpVar) {
        if (this.n.k(45821617L, false)) {
            this.o.O(rkpVar);
        } else {
            this.m.c(rkpVar);
        }
    }

    @Override // defpackage.rks
    public final void a() {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((rks) it.next()).a();
        }
    }

    @Override // defpackage.rks
    public final void b() {
        g(new rkp());
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((rks) it.next()).b();
        }
    }

    @Override // defpackage.rks
    public final void c() {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((rks) it.next()).c();
        }
    }

    @Override // defpackage.rks
    public final void d() {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((rks) it.next()).d();
        }
    }

    @Override // defpackage.rks
    public final void e(int i) {
        g(new rkp());
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((rks) it.next()).e(i);
        }
    }

    public final bp f() {
        bp bpVar = this.g;
        if (bpVar != null) {
            return bpVar;
        }
        bp bpVar2 = (bp) this.a.getSupportFragmentManager().g("channel_creation_fragment");
        this.g = bpVar2;
        return bpVar2;
    }

    @Override // defpackage.rkn
    public final void i(ajwo ajwoVar) {
        rkn rknVar = (rkn) f();
        if (rknVar != null) {
            rknVar.i(ajwoVar);
        }
    }
}
