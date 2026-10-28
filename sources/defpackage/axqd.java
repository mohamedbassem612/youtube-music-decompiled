package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axqd extends axpf implements axqw {
    public final axqf a;
    public axqf b;

    public axqd(axqf axqfVar) {
        this.a = axqfVar;
        if (axqfVar.r()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.b = h();
    }

    private final axqf h() {
        return this.a.l();
    }

    @Override // defpackage.axpf
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final axqd clone() {
        axqd axqdVarJ = this.a.m();
        axqdVarJ.b = d();
        return axqdVarJ;
    }

    public final axqf c() {
        axqf axqfVarD = d();
        if (axqf.t(axqfVarD)) {
            return axqfVarD;
        }
        throw new axrk();
    }

    public final axqf d() {
        boolean zR = this.b.r();
        axqf axqfVar = this.b;
        if (!zR) {
            return axqfVar;
        }
        axqfVar.n();
        return this.b;
    }

    @Override // defpackage.axqw
    public final /* bridge */ /* synthetic */ axqv e() {
        throw null;
    }

    public final void f() {
        if (this.b.r()) {
            return;
        }
        axqf axqfVarH = h();
        axrb.a.b(axqfVarH).e(axqfVarH, this.b);
        this.b = axqfVarH;
    }

    public final void g(int i) {
        f();
        axpa axpaVar = (axpa) this.b;
        int i2 = axpa.SCHEME_FIELD_NUMBER;
        axpaVar.scheme_ = i - 1;
        axpaVar.bitField0_ |= 1;
    }

    public axqd() {
        this(axli.DEFAULT_INSTANCE);
    }
}
