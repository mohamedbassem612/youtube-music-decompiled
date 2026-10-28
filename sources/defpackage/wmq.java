package defpackage;

import android.util.DisplayMetrics;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wmq {
    public final int a;
    public final int b;
    public final float c;
    public final float d;
    public final float e;

    public wmq(DisplayMetrics displayMetrics, boolean z) {
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        agrf agrfVar = twm.a;
        displayMetrics.getClass();
        float f = i;
        float f2 = f / displayMetrics.density;
        displayMetrics.getClass();
        float f3 = i2;
        float f4 = f3 / displayMetrics.density;
        float f5 = f / displayMetrics.xdpi;
        float f6 = f3 / displayMetrics.ydpi;
        int i3 = (int) (f4 + 0.5f);
        int i4 = (int) (f2 + 0.5f);
        if (!z || i <= i2) {
            this.a = i4;
            this.b = i3;
            this.c = f5;
            this.d = f6;
        } else {
            this.a = i3;
            this.b = i4;
            this.c = f6;
            this.d = f5;
        }
        this.e = displayMetrics.density;
    }
}
