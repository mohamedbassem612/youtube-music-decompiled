package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.security.MessageDigest;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ezy extends ezx {
    private static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(a);

    @Override // defpackage.ett
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.ezx
    protected final Bitmap c(ewn ewnVar, Bitmap bitmap, int i, int i2) {
        float height;
        float f;
        Paint paint = fbk.a;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f2 = i2;
        float f3 = i;
        float width = 0.0f;
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            height = f2 / bitmap.getHeight();
            f = 0.0f;
            width = (f3 - (bitmap.getWidth() * height)) * 0.5f;
        } else {
            float width2 = f3 / bitmap.getWidth();
            float height2 = (f2 - (bitmap.getHeight() * width2)) * 0.5f;
            height = width2;
            f = height2;
        }
        matrix.setScale(height, height);
        matrix.postTranslate((int) (width + 0.5f), (int) (f + 0.5f));
        Bitmap bitmapA = ewnVar.a(i, i2, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        bitmapA.setHasAlpha(bitmap.hasAlpha());
        fbk.d.lock();
        try {
            Canvas canvas = new Canvas(bitmapA);
            canvas.drawBitmap(bitmap, matrix, fbk.a);
            canvas.setBitmap(null);
            fbk.d.unlock();
            if (bitmapA != null && !bitmapA.equals(bitmap) && bitmapA.getWidth() == bitmap.getWidth()) {
                bitmapA.getHeight();
                bitmap.getHeight();
            }
            return bitmapA;
        } catch (Throwable th) {
            fbk.d.unlock();
            throw th;
        }
    }

    @Override // defpackage.ett
    public final boolean equals(Object obj) {
        return obj instanceof ezy;
    }

    @Override // defpackage.ett
    public final int hashCode() {
        return -599754482;
    }
}
