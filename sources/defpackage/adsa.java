package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adsa {
    private static final agrf c = agrf.h("com/google/android/libraries/youtube/rendering/text/inlineimage/ImageClientImageLoader");
    public final HashMap a = new HashMap();
    public final Executor b;
    private final adhv d;

    public adsa(adhv adhvVar, Executor executor) {
        this.d = adhvVar;
        this.b = executor;
    }

    public final void a(adrw adrwVar, aqmh aqmhVar, int i, adsc adscVar) {
        aqmg aqmgVarL = aawb.L(aqmhVar, i);
        Uri uriD = aqmgVarL == null ? null : tyu.d(aqmgVarL.c);
        WeakReference weakReference = (WeakReference) this.a.get(uriD);
        Bitmap bitmap = weakReference != null ? (Bitmap) weakReference.get() : null;
        if (bitmap != null) {
            adscVar.d(adrwVar, bitmap);
            return;
        }
        adrz adrzVar = new adrz(this, adscVar, adrwVar, 0);
        if (uriD == null) {
            ((agrc) ((agrc) c.b()).k("com/google/android/libraries/youtube/rendering/text/inlineimage/ImageClientImageLoader", "loadImageAsync", 82, "ImageClientImageLoader.java")).t("Tried to load a null bitmap.");
        } else {
            this.d.k(uriD, adrzVar);
        }
    }
}
