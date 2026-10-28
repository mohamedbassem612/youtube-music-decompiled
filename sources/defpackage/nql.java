package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class nql extends ezx {
    private static final byte[] b = "com.google.android.libraries.elements.glide.GlideImageSpec.TracedRoundedCorners".getBytes(a);
    private final int c;

    public nql(int i) {
        ahno.G(i > 0, "roundingRadius must be greater than 0.");
        this.c = i;
    }

    @Override // defpackage.ett
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.c).array());
    }

    @Override // defpackage.ezx
    protected final Bitmap c(ewn ewnVar, Bitmap bitmap, int i, int i2) {
        int i3 = this.c;
        boolean z = i3 > 0;
        Paint paint = fbk.a;
        gzj.bJ(z, "roundingRadius must be greater than 0.");
        Bitmap.Config configA = fbk.a(bitmap);
        Bitmap bitmapB = fbk.b(ewnVar, bitmap);
        Bitmap bitmapA = ewnVar.a(bitmapB.getWidth(), bitmapB.getHeight(), configA);
        bitmapA.setHasAlpha(true);
        BitmapShader bitmapShader = new BitmapShader(bitmapB, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, bitmapA.getWidth(), bitmapA.getHeight());
        fbk.d.lock();
        try {
            Canvas canvas = new Canvas(bitmapA);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            float f = i3;
            canvas.drawRoundRect(rectF, f, f, paint2);
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
        return (obj instanceof nql) && this.c == ((nql) obj).c;
    }

    @Override // defpackage.ett
    public final int hashCode() {
        char[] cArr = ffs.a;
        return ((this.c + 527) * 31) - 1270139031;
    }
}
