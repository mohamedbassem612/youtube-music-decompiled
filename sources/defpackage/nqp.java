package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class nqp extends ezx {
    private static final byte[] b = "com.google.android.libraries.elements.glide.ShadowBitmapTransformation".getBytes(StandardCharsets.UTF_8);
    private final int c;
    private final int d;
    private final float e;
    private final float f;
    private final int g;

    public nqp(int i, int i2, float f, float f2, int i3) {
        this.c = i;
        this.d = i2;
        this.e = f;
        this.f = f2;
        this.g = i3;
    }

    @Override // defpackage.ett
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
        messageDigest.update(ByteBuffer.allocate(20).putInt(this.c).putInt(this.d).putFloat(this.e).putFloat(this.f).putInt(this.g).array());
    }

    @Override // defpackage.ezx
    protected final Bitmap c(ewn ewnVar, Bitmap bitmap, int i, int i2) {
        Paint paint;
        Bitmap bitmapA = ewnVar.a(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        bitmapA.eraseColor(0);
        Canvas canvas = new Canvas(bitmapA);
        int iMax = Math.max(this.d, 2);
        int i3 = this.g;
        if (Color.alpha(i3) != 0) {
            Paint paint2 = new Paint(1);
            paint2.setAlpha(Math.max(1, (int) Math.round(((double) Color.alpha(i3)) / (((double) ((iMax + 1) / 2)) * 8.0d))));
            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.ADD));
            paint2.setColorFilter(new PorterDuffColorFilter(Color.rgb(Color.red(i3), Color.green(i3), Color.blue(i3)), PorterDuff.Mode.SRC_IN));
            while (iMax > 0) {
                float f = this.e;
                float f2 = this.f;
                float f3 = iMax;
                float f4 = f - f3;
                float f5 = f2 - f3;
                canvas.drawBitmap(bitmap, f4, f5, paint2);
                canvas.drawBitmap(bitmap, f4, f2, paint2);
                float f6 = f2 + f3;
                canvas.drawBitmap(bitmap, f4, f6, paint2);
                canvas.drawBitmap(bitmap, f, f5, paint2);
                canvas.drawBitmap(bitmap, f, f6, paint2);
                float f7 = f + f3;
                canvas.drawBitmap(bitmap, f7, f5, paint2);
                canvas.drawBitmap(bitmap, f7, f2, paint2);
                canvas.drawBitmap(bitmap, f7, f6, paint2);
                iMax -= 2;
            }
        }
        int i4 = this.c;
        if (i4 != 0) {
            paint = new Paint(1);
            paint.setColorFilter(new PorterDuffColorFilter(i4, PorterDuff.Mode.SRC_IN));
        } else {
            paint = null;
        }
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return bitmapA;
    }

    @Override // defpackage.ett
    public final boolean equals(Object obj) {
        if (!(obj instanceof nqp)) {
            return false;
        }
        nqp nqpVar = (nqp) obj;
        return this.c == nqpVar.c && this.d == nqpVar.d && Float.compare(nqpVar.e, this.e) == 0 && Float.compare(nqpVar.f, this.f) == 0 && this.g == nqpVar.g;
    }

    @Override // defpackage.ett
    public final int hashCode() {
        char[] cArr = ffs.a;
        return ((((((((this.c - 522394731) * 31) + this.d) * 31) + Float.floatToIntBits(this.e)) * 31) + Float.floatToIntBits(this.f)) * 31) + this.g;
    }
}
