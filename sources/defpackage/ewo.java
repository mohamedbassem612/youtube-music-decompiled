package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ewo implements ewn {
    @Override // defpackage.ewn
    public final Bitmap a(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // defpackage.ewn
    public final Bitmap b(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // defpackage.ewn
    public void d(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // defpackage.ewn
    public final void c() {
    }

    @Override // defpackage.ewn
    public final void e(float f) {
    }

    @Override // defpackage.ewn
    public final void f(int i) {
    }
}
