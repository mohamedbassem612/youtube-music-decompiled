package defpackage;

import android.text.Layout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ddf {
    public CharSequence c;
    public long a = 0;
    public long b = 0;
    public int d = 2;
    public float e = -3.4028235E38f;
    public int f = 1;
    public int g = 0;
    public float h = -3.4028235E38f;
    public int i = Integer.MIN_VALUE;
    public float j = 1.0f;
    public int k = Integer.MIN_VALUE;

    /* JADX WARN: Code duplicated, block: B:18:0x0030  */
    /* JADX WARN: Code duplicated, block: B:19:0x0032  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:29:0x0057  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    public final bur a() {
        Layout.Alignment alignment;
        float f = this.h;
        float f2 = -3.4028235E38f;
        if (f == -3.4028235E38f) {
            int i = this.d;
            if (i != 4) {
                f = i != 5 ? 0.5f : 1.0f;
            } else {
                f = 0.0f;
            }
        }
        int i2 = this.i;
        if (i2 == Integer.MIN_VALUE) {
            int i3 = this.d;
            if (i3 == 1) {
                i2 = 0;
            } else if (i3 == 3) {
                i2 = 2;
            } else if (i3 == 4) {
                i2 = 0;
            } else if (i3 != 5) {
                i2 = 1;
            } else {
                i2 = 2;
            }
        }
        bur burVar = new bur();
        int i4 = this.d;
        if (i4 == 1) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i4 == 2) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else if (i4 == 3) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else if (i4 == 4) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i4 != 5) {
            bvx.e("WebvttCueParser", a.bR(i4, "Unknown textAlignment: "));
            alignment = null;
        } else {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        burVar.b = alignment;
        float f3 = this.e;
        int i5 = this.f;
        if (f3 != -3.4028235E38f && i5 == 0 && (f3 < 0.0f || f3 > 1.0f)) {
            f2 = 1.0f;
        } else if (f3 != -3.4028235E38f) {
            f2 = f3;
        } else if (i5 == 0) {
            f2 = 1.0f;
        }
        burVar.c(f2, i5);
        burVar.d = this.g;
        burVar.e = f;
        burVar.f = i2;
        float f4 = this.j;
        if (i2 == 0) {
            f = 1.0f - f;
        } else if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException(String.valueOf(i2));
            }
        } else if (f <= 0.5f) {
            f += f;
        } else {
            float f5 = 1.0f - f;
            f = f5 + f5;
        }
        burVar.g = Math.min(f4, f);
        burVar.j = this.k;
        CharSequence charSequence = this.c;
        if (charSequence != null) {
            burVar.d(charSequence);
        }
        return burVar;
    }
}
