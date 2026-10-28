package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abcn {
    public final abcq a;
    public final abcq b;
    public float c;

    public abcn(float f, float f2, float f3, float f4, int i, float[] fArr) {
        int i2 = 0;
        if (f3 < f4) {
            this.c = 0.0f;
            abco abcoVar = new abco(new float[]{0.0f, 10.0f, Math.max(10.0f, f3)}, new float[]{0.0f, 17.0f, f4});
            this.b = abcoVar;
            this.a = abcoVar;
            return;
        }
        float f5 = f * f4;
        this.c = f5;
        float f6 = f2 * f4;
        if (i <= 0) {
            this.c = Math.max(f5, 10.0f);
            float fMax = Math.max(f6, 17.0f);
            this.a = new abco(new float[]{0.0f, 10.0f, this.c}, new float[]{0.0f, 17.0f, fMax});
            float f7 = this.c;
            this.b = new abcp(new float[]{f7, ((f3 - f7) * 0.5f) + f7, f3}, new float[]{fMax, ((f4 - f7) * 0.75f) + fMax, f4});
            return;
        }
        float f8 = f * f3;
        this.c = f8;
        this.a = new abco(new float[]{0.0f, f8}, new float[]{0.0f, f6});
        int i3 = i + 2;
        float[] fArr2 = new float[i3];
        float[] fArr3 = new float[i3];
        fArr2[0] = this.c;
        fArr3[0] = f6;
        int i4 = i + 1;
        float f9 = (1.0f - f) / i4;
        float f10 = f + f9;
        while (i2 < i) {
            int i5 = i2 + 1;
            fArr2[i5] = f10 * f3;
            fArr3[i5] = fArr[i2] * f4;
            f10 += f9;
            i2 = i5;
        }
        fArr2[i4] = f3;
        fArr3[i4] = f4;
        this.b = new abcp(fArr2, fArr3);
    }
}
