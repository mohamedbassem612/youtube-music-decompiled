package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class spy {
    public final zzj a;
    public final Map b = new HashMap();
    public final Map c = new HashMap();
    public volatile spx d;
    public final vrn e;
    public nrm f;
    public final syn g;
    public final dov h;

    public spy(zzj zzjVar, dov dovVar, vrn vrnVar, syn synVar, abvn abvnVar, avlh avlhVar) {
        this.a = zzjVar;
        this.h = dovVar;
        this.e = vrnVar;
        this.g = synVar;
        boolean zCh = abvnVar.g().ch();
        ((avlh) (zCh ? abvnVar.r().t : abvnVar.r().i)).al(new rtn(this, 7), new jop(5));
        ((avlh) abvnVar.r().a).al(new aawl(new rtn(this, 10), "ARM", 1), new jop(5));
        ((avlh) (zCh ? abvnVar.r().u : abvnVar.r().n)).al(new rtn(this, 11), new jop(5));
        int i = 9;
        (zCh ? avlhVar.W(new rtq(8)).W(new rtq(9)) : avlhVar.p().W(new igz(19))).al(new rtn(this, 8), new jop(5));
        (zCh ? avlhVar.W(new rtq(6)).W(new rtq(7)) : avlhVar.p().W(new igz(20))).al(new rtn(this, i), new jop(5));
    }

    public final void a() {
        if (this.d != null) {
            this.d.k();
        }
        d();
    }

    public final void b(String str, smc smcVar, slm slmVar, Long l) {
        if (this.d != null) {
            this.d.z();
        }
        d();
        this.d = this.e.b(this.g.j(smcVar), str, smcVar, l, slmVar);
    }

    public final void c() {
        taq.d();
        this.f = null;
        this.d = null;
    }

    public final void d() {
        if (this.d != null) {
            this.d.z();
            this.d = null;
        }
    }

    public final void e() {
        taq.d();
        if (this.d != null) {
            this.d.o();
        }
    }

    public final void f(int i, int i2) {
        taq.d();
        if (this.d != null) {
            this.d.m(i, i2);
        }
    }

    public final void g() {
        taq.d();
        if (this.d != null) {
            this.d.r();
        }
    }

    public final void h() {
        taq.d();
        if (this.d != null) {
            this.d.v();
        }
    }

    public final void i(aazk aazkVar, boolean z) {
        taq.d();
        if (z == (this.d instanceof sqb)) {
            if (this.d != null) {
                this.d.x(aazkVar);
            }
            nrm nrmVar = this.f;
            if (nrmVar != null) {
                nrmVar.b(aazkVar);
            }
        }
    }
}
