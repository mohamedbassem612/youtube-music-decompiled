package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class sgk extends sgi {
    private final smc k;
    private boolean l;
    private final boolean m;
    private final zdj n;

    public sgk(sko skoVar, smc smcVar, axfd axfdVar, boolean z, boolean z2, zdj zdjVar, boolean z3) {
        super(skoVar, 1000 * ((long) smcVar.a()), z, z2, axfdVar);
        this.k = smcVar;
        this.n = zdjVar;
        zdjVar.b = this;
        this.l = false;
        this.m = z3;
    }

    @Override // defpackage.ogi
    public final Set b(ogj ogjVar) {
        return zzj.b(sng.b(this.k, ogjVar), a);
    }

    @Override // defpackage.sgi
    public final ofg h(int i) {
        this.g = this.n.p(i);
        return this.g;
    }

    @Override // defpackage.sgi
    public final void j() {
        this.g = this.n.i();
    }

    @Override // defpackage.sgi
    public final void k() {
        this.g = this.n.j();
    }

    @Override // defpackage.sgi
    protected final void l() {
        this.g = this.n.m();
    }

    @Override // defpackage.sgi
    protected final void m() {
        this.g = this.n.n();
    }

    @Override // defpackage.sgi
    protected final void n() {
        this.g = this.n.o();
    }

    @Override // defpackage.sgi
    public final void o() {
        this.g = this.n.q();
    }

    @Override // defpackage.sgi
    public final void p() {
        this.n.s();
    }

    @Override // defpackage.sgi
    public final void q() {
        zdj zdjVar = this.n;
        zdjVar.t();
        this.g = zdjVar.i();
    }

    @Override // defpackage.sgi
    public final void r(abnr abnrVar) {
        if (this.i) {
            if (abnrVar != abnr.BACKGROUND) {
                this.i = false;
            }
        } else if (abnrVar == abnr.BACKGROUND) {
            this.i = true;
        }
        if (this.h) {
            if (abnrVar != abnr.FULLSCREEN) {
                this.g = this.n.k();
                this.h = false;
                return;
            }
            return;
        }
        if (abnrVar == abnr.FULLSCREEN) {
            this.g = this.n.l();
            this.h = true;
        }
    }

    @Override // defpackage.sgi
    public final void s(boolean z, long j) {
        this.b = j;
        boolean z2 = this.m;
        smc smcVar = this.k;
        boolean zG = z2 ? nsf.g(smcVar.a(), j, smcVar.m()) : nsf.g(smcVar.a(), j, 5000);
        if (!this.l && this.k.A() && zG) {
            this.g = ((ofj) this.n.a).a(ogj.SKIP_SHOWN);
            this.l = true;
        }
    }
}
