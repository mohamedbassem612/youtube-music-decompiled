package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class cbf implements ccz {
    public final cbe b;
    public cdp c;
    public ccz d;
    public boolean f;
    public final cdw a = new cdw();
    public boolean e = true;

    public cbf(cbe cbeVar) {
        this.b = cbeVar;
    }

    @Override // defpackage.ccz
    public final long a() {
        if (this.e) {
            return this.a.a();
        }
        ccz cczVar = this.d;
        cczVar.getClass();
        return cczVar.a();
    }

    @Override // defpackage.ccz
    public final btb b() {
        ccz cczVar = this.d;
        return cczVar != null ? cczVar.b() : this.a.a;
    }

    public final void c(cdp cdpVar) {
        ccz cczVar;
        ccz cczVarS = cdpVar.s();
        if (cczVarS == null || cczVarS == (cczVar = this.d)) {
            return;
        }
        if (cczVar != null) {
            throw new cbo(2, new IllegalStateException("Multiple renderer media clocks enabled."), null, 1000, null, -1, null, 4, null, false);
        }
        this.d = cczVarS;
        this.c = cdpVar;
        cczVarS.gb(this.a.a);
    }

    public final void e() {
        this.f = true;
        this.a.e();
    }

    public final void f() {
        this.f = false;
        this.a.f();
    }

    @Override // defpackage.ccz
    public final void gb(btb btbVar) {
        ccz cczVar = this.d;
        if (cczVar != null) {
            cczVar.gb(btbVar);
            btbVar = this.d.b();
        }
        this.a.gb(btbVar);
    }

    @Override // defpackage.ccz
    public final boolean gc() {
        if (this.e) {
            return false;
        }
        ccz cczVar = this.d;
        cczVar.getClass();
        return cczVar.gc();
    }
}
