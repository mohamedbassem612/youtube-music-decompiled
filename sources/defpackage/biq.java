package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class biq extends bhm implements bjj {
    public final bis a;
    public bis b;

    public biq(bis bisVar) {
        this.a = bisVar;
        if (bisVar.s()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.b = g();
    }

    private final bis g() {
        return this.a.l();
    }

    @Override // defpackage.bhm
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final biq clone() {
        biq biqVarM = this.a.m();
        biqVarM.b = d();
        return biqVarM;
    }

    public final bis c() {
        bis bisVarD = d();
        if (bis.t(bisVarD)) {
            return bisVarD;
        }
        throw new bjx();
    }

    public final bis d() {
        boolean zS = this.b.s();
        bis bisVar = this.b;
        if (!zS) {
            return bisVar;
        }
        bisVar.n();
        return this.b;
    }

    @Override // defpackage.bjj
    public final /* bridge */ /* synthetic */ bji e() {
        throw null;
    }

    public final void f() {
        if (this.b.s()) {
            return;
        }
        bis bisVarG = g();
        bjp.a.a(bisVarG).e(bisVarG, this.b);
        this.b = bisVarG;
    }

    public biq() {
        this(bhc.DEFAULT_INSTANCE);
    }
}
