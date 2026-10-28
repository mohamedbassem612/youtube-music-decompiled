package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class faw {
    private static final ffm a = new ffl(new fav());

    public static boolean a(BitmapFactory.Options options) {
        if (Build.VERSION.SDK_INT == 34 && options.inPreferredConfig == Bitmap.Config.HARDWARE) {
            return ((Boolean) a.a()).booleanValue();
        }
        return false;
    }
}
