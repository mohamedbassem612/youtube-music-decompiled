package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afbb extends afba {
    private final float a;

    public afbb(float f) {
        this.a = f - 0.001f;
    }

    @Override // defpackage.afba
    public final void b(float f, float f2, float f3, afbu afbuVar) {
        double d = this.a;
        double d2 = 1.4142135623730951d * d;
        float f4 = (float) (d2 / 2.0d);
        float fSqrt = (float) Math.sqrt(Math.pow(d, 2.0d) - Math.pow(f4, 2.0d));
        float f5 = (float) (-(d2 - d));
        float f6 = fSqrt + f5;
        afbuVar.e(f2 - f4, f6, 270.0f, 0.0f);
        afbuVar.d(f2, f5);
        afbuVar.d(f2 + f4, f6);
    }

    @Override // defpackage.afba
    public final boolean c() {
        return true;
    }
}
