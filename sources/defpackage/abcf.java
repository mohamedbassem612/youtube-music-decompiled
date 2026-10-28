package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abcf {
    public static final float[] a = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f, 0.3127f, 0.329f};
    public static final float[] b = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f, 0.3127f, 0.329f};
    public static final float[] c = {0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f, 0.3127f, 0.329f};
    public final grj d;
    public final grj e;

    public abcf(float[] fArr) {
        grj grjVar = new grj((short[]) null);
        this.e = grjVar;
        float f = fArr[0];
        float f2 = fArr[2];
        float f3 = fArr[4];
        float f4 = fArr[1];
        float f5 = fArr[3];
        float f6 = fArr[5];
        grj grjVar2 = new grj(f, f2, f3, f4, f5, f6, (1.0f - f) - f4, (1.0f - f2) - f5, (1.0f - f3) - f6);
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = f7 / f8;
        float f10 = ((1.0f - f7) - f8) / f8;
        grj grjVar3 = new grj((short[]) null);
        grjVar2.B(grjVar3);
        float[] fArr2 = (float[]) grjVar3.a;
        float f11 = fArr2[0] * f9;
        float f12 = fArr2[1];
        float f13 = fArr2[2] * f10;
        float f14 = fArr2[3] * f9;
        float f15 = fArr2[4];
        float f16 = fArr2[5] * f10;
        float f17 = fArr2[6] * f9;
        float f18 = fArr2[7];
        float f19 = fArr2[8] * f10;
        grj grjVar4 = new grj(f11 + f12 + f13, 0.0f, 0.0f, 0.0f, f14 + f15 + f16, 0.0f, 0.0f, 0.0f, f17 + f18 + f19);
        this.d = grjVar4;
        grj.A(grjVar2, grjVar4, grjVar4);
        grjVar4.B(grjVar);
    }
}
