package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RSRuntimeException;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.google.android.libraries.multiplatform.elements.FlagServices;
import j$.util.Objects;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class oth extends ezx {
    private static final otg b = new otg();
    private final Context c;
    private final float d;
    private final oui e;
    private final boolean f;
    private final int g;

    public oth(Context context, oui ouiVar, int i, float f) {
        byte bPeekByte = Memory.peekByte(FlagServices.b().c + 104);
        this.c = context.getApplicationContext();
        this.e = ouiVar;
        this.g = i;
        this.d = f;
        this.f = bPeekByte != 0;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x008e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0093  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    private final void d(Bitmap bitmap, float f) throws Throwable {
        Allocation allocation;
        Allocation allocationCreateFromBitmap;
        ScriptIntrinsicBlur scriptIntrinsicBlurCreate;
        ?? r5;
        ?? r6;
        RenderScript renderScriptCreate;
        Allocation allocationCreateTyped = null;
        allocationCreateTyped = null;
        allocationCreateTyped = null;
        allocationCreateTyped = null;
        ScriptIntrinsicBlur scriptIntrinsicBlur = null;
        try {
            try {
                boolean z = this.f;
                if (z) {
                    otg otgVar = b;
                    if (otgVar.a == null) {
                        otgVar.a = RenderScript.create(this.c);
                    }
                    renderScriptCreate = otgVar.a;
                } else {
                    renderScriptCreate = RenderScript.create(this.c);
                }
                if (z) {
                    otg otgVar2 = b;
                    if (otgVar2.b == null) {
                        otgVar2.b = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
                    }
                    scriptIntrinsicBlurCreate = otgVar2.b;
                } else {
                    scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
                }
                try {
                    allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmap);
                    try {
                        allocationCreateTyped = Allocation.createTyped(renderScriptCreate, allocationCreateFromBitmap.getType());
                        scriptIntrinsicBlurCreate.setRadius(f);
                        scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
                        scriptIntrinsicBlurCreate.forEach(allocationCreateTyped);
                        allocationCreateTyped.copyTo(bitmap);
                    } catch (RSRuntimeException e) {
                        e = e;
                        this.e.c(aslh.LOG_LEVEL_WARN, "Failed to blur image", e);
                    }
                } catch (RSRuntimeException e2) {
                    e = e2;
                    allocationCreateFromBitmap = null;
                } catch (Throwable th) {
                    th = th;
                    allocation = null;
                    allocationCreateFromBitmap = null;
                    this = this;
                    scriptIntrinsicBlur = scriptIntrinsicBlurCreate;
                    r5 = r6;
                    if (!r5.f && scriptIntrinsicBlur != null) {
                        scriptIntrinsicBlur.destroy();
                    }
                    if (allocationCreateFromBitmap != null) {
                        allocationCreateFromBitmap.destroy();
                    }
                    if (allocation != null) {
                        allocation.destroy();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                allocation = allocationCreateTyped;
                r6 = this;
            }
        } catch (RSRuntimeException e3) {
            e = e3;
            scriptIntrinsicBlurCreate = null;
            allocationCreateFromBitmap = null;
        } catch (Throwable th3) {
            th = th3;
            allocation = null;
            allocationCreateFromBitmap = null;
            this = this;
            if (!r5.f) {
                scriptIntrinsicBlur.destroy();
            }
            if (allocationCreateFromBitmap != null) {
                allocationCreateFromBitmap.destroy();
            }
            if (allocation != null) {
                allocation.destroy();
            }
            throw th;
        }
        this = this.f;
        if (this == 0 && scriptIntrinsicBlurCreate != null) {
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
        String string = "blur:" + this.d;
        if (this.f) {
            int i = this.g;
            StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append(':');
            sb.append(i - 1);
            string = sb.toString();
        }
        messageDigest.update(string.getBytes(StandardCharsets.UTF_8));
    }

    @Override // defpackage.ezx
    protected final Bitmap c(ewn ewnVar, Bitmap bitmap, int i, int i2) throws Throwable {
        float f;
        Bitmap bitmapA;
        float f2 = this.d;
        if (f2 < 0.01f) {
            return bitmap;
        }
        if (f2 > 25.0f) {
            float f3 = 25.0f / f2;
            bitmapA = ewnVar.a(Math.round(bitmap.getWidth() * f3), Math.round(bitmap.getHeight() * f3), Bitmap.Config.ARGB_8888);
            rpi.t(bitmap, bitmapA);
            f = 25.0f;
        } else {
            f = f2;
            bitmapA = bitmap;
        }
        if (this.f) {
            synchronized (b) {
                d(bitmapA, f);
            }
        } else {
            d(bitmapA, f);
        }
        if (this.g != 5 || this.d <= 25.0f) {
            return bitmapA;
        }
        rpi.t(bitmapA, bitmap);
        ewnVar.d(bitmapA);
        return bitmap;
    }

    @Override // defpackage.ett
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof oth) {
            oth othVar = (oth) obj;
            if (this.f && othVar.f && Float.compare(othVar.d, this.d) == 0 && this.g == othVar.g) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ett
    public final int hashCode() {
        return !this.f ? System.identityHashCode(this) : Objects.hash(Float.valueOf(this.d), Integer.valueOf(this.g));
    }
}
