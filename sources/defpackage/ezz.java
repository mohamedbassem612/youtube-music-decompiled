package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import java.security.MessageDigest;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ezz extends ezx {
    private static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".getBytes(a);

    @Override // defpackage.ett
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.ezx
    protected final Bitmap c(ewn ewnVar, Bitmap bitmap, int i, int i2) {
        Paint paint = fbk.a;
        int iMin = Math.min(i, i2);
        float f = iMin;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float fMax = Math.max(f / width, f / height);
        float f2 = width * fMax;
        float f3 = fMax * height;
        float f4 = (f - f2) / 2.0f;
        float f5 = (f - f3) / 2.0f;
        RectF rectF = new RectF(f4, f5, f2 + f4, f3 + f5);
        Bitmap bitmapB = fbk.b(ewnVar, bitmap);
        Bitmap bitmapA = ewnVar.a(iMin, iMin, fbk.a(bitmap));
        bitmapA.setHasAlpha(true);
        fbk.d.lock();
        float f6 = f / 2.0f;
        try {
            Canvas canvas = new Canvas(bitmapA);
            canvas.drawCircle(f6, f6, f6, fbk.b);
            canvas.drawBitmap(bitmapB, (Rect) null, rectF, fbk.c);
            canvas.setBitmap(null);
            fbk.d.unlock();
            if (!bitmapB.equals(bitmap)) {
                ewnVar.d(bitmapB);
            }
            return bitmapA;
        } catch (Throwable th) {
            fbk.d.unlock();
            throw th;
        }
    }

    @Override // defpackage.ett
    public final boolean equals(Object obj) {
        return obj instanceof ezz;
    }

    @Override // defpackage.ett
    public final int hashCode() {
        return 1101716364;
    }
}
