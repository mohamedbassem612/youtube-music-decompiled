package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RSRuntimeException;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ttx {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/common/ui/RenderScriptCompat");
    private final Map b = new ttw("Input");
    private final Map c = new ttw("Output");
    private boolean d = true;
    private volatile RenderScript e;

    private final void b() {
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            try {
                ((Allocation) it.next()).destroy();
            } catch (RSRuntimeException e) {
                ((agrc) ((agrc) ((agrc) a.b()).j(e)).k("com/google/android/libraries/youtube/common/ui/RenderScriptCompat", "cleanUp", (char) 130, "RenderScriptCompat.java")).t("Input allocation destroy failed");
            }
        }
        this.b.clear();
        Iterator it2 = this.c.values().iterator();
        while (it2.hasNext()) {
            try {
                ((Allocation) it2.next()).destroy();
            } catch (RSRuntimeException e2) {
                ((agrc) ((agrc) ((agrc) a.b()).j(e2)).k("com/google/android/libraries/youtube/common/ui/RenderScriptCompat", "cleanUp", (char) 139, "RenderScriptCompat.java")).t("Output allocation destroy failed");
            }
        }
        this.c.clear();
        if (this.e != null) {
            try {
                this.e.destroy();
            } catch (RSRuntimeException e3) {
                ((agrc) ((agrc) ((agrc) a.b()).j(e3)).k("com/google/android/libraries/youtube/common/ui/RenderScriptCompat", "cleanUp", (char) 156, "RenderScriptCompat.java")).t("Render script destroy failed");
            }
            this.e = null;
        }
    }

    public final Bitmap a(Context context, Bitmap bitmap) {
        Bitmap bitmapCopy;
        if (!this.d) {
            return bitmap;
        }
        try {
            RenderScript renderScriptCreate = this.e;
            if (renderScriptCreate == null) {
                renderScriptCreate = RenderScript.create(context);
                this.e = renderScriptCreate;
            }
            if (bitmap.getConfig() == Bitmap.Config.ARGB_8888) {
                bitmapCopy = bitmap;
            } else {
                bitmapCopy = bitmap.copy(Bitmap.Config.ARGB_8888, false);
                if (bitmapCopy == null) {
                    return bitmap;
                }
            }
            Bitmap bitmapCopy2 = bitmapCopy.copy(bitmapCopy.getConfig(), true);
            Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapCopy);
            Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCopy2);
            ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
            scriptIntrinsicBlurCreate.setRadius(25.0f);
            scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
            scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
            allocationCreateFromBitmap2.copyTo(bitmapCopy2);
            scriptIntrinsicBlurCreate.destroy();
            return bitmapCopy2;
        } catch (RSRuntimeException e) {
            ((agrc) ((agrc) ((agrc) a.b()).j(e)).k("com/google/android/libraries/youtube/common/ui/RenderScriptCompat", "blurInternal", 'v', "RenderScriptCompat.java")).t("RenderScript blur failed");
            this.d = false;
            b();
            return bitmap;
        }
    }
}
