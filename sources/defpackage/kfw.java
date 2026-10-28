package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class kfw implements kfn {
    private final /* synthetic */ int $cid;
    final /* synthetic */ kfz a;

    public kfw(kfz kfzVar, int i) {
        this.$cid = i;
        this.a = kfzVar;
    }

    @Override // defpackage.kfn
    public final void a(Bitmap bitmap) {
        if (this.$cid == 0) {
            this.a.a(bitmap, 3);
            return;
        }
        khn khnVar = kfz.a;
        Bitmap bitmap2 = null;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            float f = width;
            int height = bitmap.getHeight();
            int i = (int) (((9.0f * f) / 16.0f) + 0.5f);
            float f2 = (i - height) / 2.0f;
            RectF rectF = new RectF(0.0f, f2, f, height + f2);
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, i, config);
            new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, (Rect) null, rectF, (Paint) null);
            bitmap2 = bitmapCreateBitmap;
        }
        this.a.a(bitmap2, 0);
    }
}
