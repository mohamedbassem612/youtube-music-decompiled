package defpackage;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.util.Size;
import j$.util.Optional;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rgi {
    public static final /* synthetic */ int a = 0;
    private static final rbm b = rbm.c(rgi.class);

    private rgi() {
    }

    static Rect a(Size size, RectF rectF) {
        float fWidth = rectF.width() * size.getWidth();
        float fHeight = rectF.height() * size.getHeight();
        int i = (int) (fWidth / 2.0f);
        int i2 = 1;
        if (i <= 0) {
            rbc rbcVar = new rbc(b, rbd.c);
            rbcVar.c();
            rbcVar.a("Crop width is 0, setting to 1", new Object[0]);
            i = 1;
        }
        int i3 = (int) (fHeight / 2.0f);
        if (i3 <= 0) {
            rbc rbcVar2 = new rbc(b, rbd.c);
            rbcVar2.c();
            rbcVar2.a("Crop height is 0, setting to 1", new Object[0]);
        } else {
            i2 = i3;
        }
        float width = ((rectF.left + 1.0f) * size.getWidth()) / 2.0f;
        float height = ((rectF.top + 1.0f) * size.getHeight()) / 2.0f;
        int i4 = (int) width;
        int i5 = (int) height;
        return new Rect(i4, i5, i + i4, i2 + i5);
    }

    public static Size b(Size size, RectF rectF) {
        Rect rectA = a(size, rectF);
        return new Size(rectA.width(), rectA.height());
    }

    public static void c(String str) {
        try {
            bvo.f();
        } catch (bvn e) {
            bvn bvnVar = new bvn(String.format(Locale.US, "[%s]: %s", str, e.getMessage()));
            bvnVar.initCause(e);
            throw bvnVar;
        }
    }

    public static void d(int i) {
        GLES20.glClearColor(h(Color.red(i)), h(Color.green(i)), h(Color.blue(i)), h(Color.alpha(i)));
        GLES20.glClear(16384);
        c("clearColorBuffer");
    }

    public static void e(int i) {
        GLES20.glClearColor(h(Color.red(i)), h(Color.green(i)), h(Color.blue(i)), h(Color.alpha(i)));
        GLES20.glClearDepthf(1.0f);
        GLES20.glClear(16640);
        GLES20.glFinish();
        c("clearOutputFrame");
    }

    public static void f(int i, Bitmap bitmap, Optional optional) {
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i);
        c("glBindTexture");
        Bitmap bitmap2 = null;
        if (optional.isPresent()) {
            if (!((RectF) optional.get()).equals(new RectF(-1.0f, -1.0f, 1.0f, 1.0f))) {
                Rect rectA = a(new Size(bitmap.getWidth(), bitmap.getHeight()), (RectF) optional.get());
                bitmap = Bitmap.createBitmap(bitmap, rectA.left, rectA.top, rectA.width(), rectA.height());
                bitmap2 = bitmap;
            }
        }
        GLUtils.texImage2D(3553, 0, bitmap, 0);
        c("texImage2D");
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        c("glTexParamteri");
        GLES20.glFinish();
        c("glFinish");
        if (bitmap2 != null) {
            bitmap2.recycle();
        }
    }

    public static void g() {
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
        c("glFramebufferTexture2D");
    }

    private static float h(int i) {
        return i / 255.0f;
    }
}
