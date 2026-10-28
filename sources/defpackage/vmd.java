package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vmd {
    public final int a;
    public final int b;
    private final Bitmap c;
    private final Bitmap d;
    private Bitmap e;

    private vmd(Bitmap bitmap, Bitmap bitmap2, int i, int i2) {
        this.c = bitmap;
        this.d = bitmap2;
        this.a = i;
        this.b = i2;
        this.e = bitmap;
    }

    public static vmd b(int i, int i2) {
        int iMax = Math.max(i, 1);
        int iMax2 = Math.max(i2, 1);
        return new vmd(c(iMax, iMax2), c(iMax, iMax2), iMax, iMax2);
    }

    private static Bitmap c(int i, int i2) {
        return Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
    }

    public final Bitmap a() {
        Bitmap bitmap = this.e;
        Bitmap bitmap2 = this.c;
        if (bitmap == bitmap2) {
            bitmap2 = this.d;
        }
        this.e = bitmap2;
        bitmap2.eraseColor(0);
        return this.e;
    }
}
