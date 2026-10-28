package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RSRuntimeException;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import j$.util.Objects;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class npx extends ezx {
    private static final agrf b = agrf.h("com/google/android/libraries/elements/glide/BlurBitmapTransformation");
    private final Context c;
    private final nsl d;
    private final float e;
    private final nuc f;
    private final boolean g;
    private final boolean h;
    private final int i;

    public npx(Context context, nsl nslVar, nuc nucVar, int i, float f, boolean z, boolean z2) {
        this.c = context.getApplicationContext();
        this.d = nslVar;
        this.f = nucVar;
        this.i = i;
        this.e = f;
        this.g = z;
        this.h = z2;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0072  */
    /* JADX WARN: Code duplicated, block: B:35:0x0077  */
    /* JADX WARN: Code duplicated, block: B:37:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:? A[SYNTHETIC] */
    private final void d(Bitmap bitmap, float f) throws Throwable {
        Throwable th;
        Allocation allocation;
        Allocation allocationCreateFromBitmap;
        RSRuntimeException rSRuntimeException;
        Allocation allocation2;
        ScriptIntrinsicBlur scriptIntrinsicBlur;
        ScriptIntrinsicBlur scriptIntrinsicBlurCreate;
        ScriptIntrinsicBlur scriptIntrinsicBlur2 = null;
        allocationCreateTyped = null;
        Allocation allocationCreateTyped = null;
        try {
            RenderScript renderScriptCreate = RenderScript.create(this.c);
            scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
            try {
                allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmap);
                try {
                    allocationCreateTyped = Allocation.createTyped(renderScriptCreate, allocationCreateFromBitmap.getType());
                    scriptIntrinsicBlurCreate.setRadius(f);
                    scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
                    scriptIntrinsicBlurCreate.forEach(allocationCreateTyped);
                    allocationCreateTyped.copyTo(bitmap);
                } catch (RSRuntimeException e) {
                    rSRuntimeException = e;
                    allocation2 = allocationCreateFromBitmap;
                    allocation = allocationCreateTyped;
                    scriptIntrinsicBlur = scriptIntrinsicBlurCreate;
                    try {
                        this.f.f(aslh.LOG_LEVEL_WARN, this.d, rSRuntimeException, "Failed to blur image", new Object[0]);
                        allocationCreateFromBitmap = allocation2;
                        allocationCreateTyped = allocation;
                        scriptIntrinsicBlurCreate = scriptIntrinsicBlur;
                    } catch (Throwable th2) {
                        th = th2;
                        allocationCreateFromBitmap = allocation2;
                        scriptIntrinsicBlur2 = scriptIntrinsicBlur;
                        if (scriptIntrinsicBlur2 != null) {
                            scriptIntrinsicBlur2.destroy();
                        }
                        if (allocationCreateFromBitmap != null) {
                            allocationCreateFromBitmap.destroy();
                        }
                        if (allocation != null) {
                            throw th;
                        }
                        allocation.destroy();
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    allocation = allocationCreateTyped;
                    scriptIntrinsicBlur2 = scriptIntrinsicBlurCreate;
                    if (scriptIntrinsicBlur2 != null) {
                        scriptIntrinsicBlur2.destroy();
                    }
                    if (allocationCreateFromBitmap != null) {
                        allocationCreateFromBitmap.destroy();
                    }
                    if (allocation != null) {
                        throw th;
                    }
                    allocation.destroy();
                    throw th;
                }
            } catch (RSRuntimeException e2) {
                rSRuntimeException = e2;
                allocation2 = null;
                allocation = null;
            } catch (Throwable th4) {
                th = th4;
                allocation = null;
                allocationCreateFromBitmap = null;
            }
        } catch (RSRuntimeException e3) {
            rSRuntimeException = e3;
            allocation2 = null;
            allocation = null;
            scriptIntrinsicBlur = null;
        } catch (Throwable th5) {
            th = th5;
            allocation = null;
            allocationCreateFromBitmap = null;
        }
        if (scriptIntrinsicBlurCreate != null) {
            scriptIntrinsicBlurCreate.destroy();
        }
        if (allocationCreateFromBitmap != null) {
            allocationCreateFromBitmap.destroy();
        }
        if (allocationCreateTyped != null) {
            allocationCreateTyped.destroy();
        }
    }

    @Override // defpackage.ett
    public final void a(MessageDigest messageDigest) {
        String string = "blur:" + this.e;
        if (this.h) {
            int i = this.i;
            boolean z = this.g;
            StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append(':');
            sb.append(i - 1);
            sb.append(':');
            sb.append(z);
            string = sb.toString();
        }
        messageDigest.update(string.getBytes(StandardCharsets.UTF_8));
    }

    @Override // defpackage.ezx
    protected final Bitmap c(ewn ewnVar, Bitmap bitmap, int i, int i2) throws Throwable {
        Bitmap bitmapA;
        float f = this.e;
        if (f < 0.01f) {
            return bitmap;
        }
        if (this.g && bitmap.getConfig() == Bitmap.Config.HARDWARE) {
            Bitmap bitmapCopy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
            if (bitmapCopy == null) {
                ((agrc) ((agrc) b.c()).k("com/google/android/libraries/elements/glide/BlurBitmapTransformation", "transform", 113, "BlurBitmapTransformation.java")).t("Failed to copy hardware bitmap to software bitmap. Returning original image");
                return bitmap;
            }
            bitmap = bitmapCopy;
        }
        float f2 = 25.0f;
        if (f > 25.0f) {
            float f3 = 25.0f / f;
            bitmapA = ewnVar.a(Math.round(bitmap.getWidth() * f3), Math.round(bitmap.getHeight() * f3), Bitmap.Config.ARGB_8888);
            rpi.t(bitmap, bitmapA);
        } else {
            f2 = f;
            bitmapA = bitmap;
        }
        d(bitmapA, f2);
        if (this.i != 5 || f <= 25.0f) {
            return bitmapA;
        }
        rpi.t(bitmapA, bitmap);
        ewnVar.d(bitmapA);
        return bitmap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        if (r4.g == r5.g) goto L15;
     */
    @Override // defpackage.ett
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            boolean r0 = r4.h
            if (r0 != 0) goto L9
            boolean r4 = super.equals(r5)
            goto L2c
        L9:
            r0 = 1
            if (r4 == r5) goto L29
            boolean r1 = r5 instanceof defpackage.npx
            r2 = 0
            if (r1 == 0) goto L2b
            npx r5 = (defpackage.npx) r5
            float r1 = r5.e
            float r3 = r4.e
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 != 0) goto L2b
            int r1 = r4.i
            int r3 = r5.i
            if (r1 != r3) goto L2b
            boolean r4 = r4.g
            boolean r5 = r5.g
            if (r4 != r5) goto L2b
        L29:
            r4 = r0
            goto L2c
        L2b:
            r4 = r2
        L2c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.npx.equals(java.lang.Object):boolean");
    }

    @Override // defpackage.ett
    public final int hashCode() {
        return !this.h ? super.hashCode() : Objects.hash(Float.valueOf(this.e), Integer.valueOf(this.i), Boolean.valueOf(this.g));
    }
}
