package defpackage;

import android.graphics.Bitmap;
import android.os.Build;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fav implements ffm {
    @Override // defpackage.ffm
    public final Object a() {
        boolean z = false;
        if (Build.VERSION.SDK_INT == 34) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8);
            Bitmap bitmapCopy = bitmapCreateBitmap.copy(Bitmap.Config.HARDWARE, false);
            bitmapCreateBitmap.recycle();
            if (bitmapCopy == null) {
                z = true;
            } else {
                bitmapCopy.recycle();
            }
        }
        return Boolean.valueOf(z);
    }
}
