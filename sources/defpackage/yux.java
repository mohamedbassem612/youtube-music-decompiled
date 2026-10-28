package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class yux extends crv implements yvb {
    private float f;
    private float g;

    public yux(int i, float f, float f2) {
        super(i);
        this.f = f;
        this.g = f2;
    }

    @Override // defpackage.yvb
    public final float c() {
        return this.g * a(this.f);
    }

    @Override // defpackage.yvb
    public final aoxz d() {
        return aoxz.PREDICTOR_TYPE_NEAREST_RANK;
    }

    @Override // defpackage.yvb
    public final void e(float f) {
        b(1, f);
    }

    @Override // defpackage.yvb
    public final void f(wiu wiuVar) {
        this.f = wiuVar.e(0.25f);
        this.g = wiuVar.f(0.85f);
    }
}
