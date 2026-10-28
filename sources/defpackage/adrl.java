package defpackage;

import android.content.Context;
import android.content.res.Resources;
import internal.org.jni_zero.JniZero;
import j$.util.Optional;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adrl {
    private static final agrf b = agrf.h("com/google/android/libraries/youtube/rendering/rive/RiveSourceFetcher");
    public final lqa a;
    private final Context c;
    private final awou d;
    private final awmd e;

    public adrl(Context context, Optional optional, lqa lqaVar, awou awouVar) {
        context.getClass();
        lqaVar.getClass();
        awouVar.getClass();
        this.c = context;
        this.a = lqaVar;
        this.d = awouVar;
        this.e = (awmd) awrc.f(optional);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, awoq awoqVar) throws Throwable {
        adrk adrkVar;
        if (awoqVar instanceof adrk) {
            adrkVar = (adrk) awoqVar;
            int i = adrkVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                adrkVar.c = i - Integer.MIN_VALUE;
            } else {
                adrkVar = new adrk(this, awoqVar);
            }
        } else {
            adrkVar = new adrk(this, awoqVar);
        }
        Object objP = adrkVar.a;
        awox awoxVar = awox.a;
        int i2 = adrkVar.c;
        try {
            if (i2 == 0) {
                atqp.j(objP);
                awmd awmdVar = this.e;
                adpd adpdVar = awmdVar != null ? (adpd) awmdVar.io() : null;
                if (adpdVar == null) {
                    ((agrc) b.c().k("com/google/android/libraries/youtube/rendering/rive/RiveSourceFetcher", "downloadUrl", 69, "RiveSourceFetcher.kt")).w("Cannot fetch URL source (%s): downloaderProvider is not available", str);
                    return null;
                }
                adrkVar.d = str;
                adrkVar.c = 1;
                objP = awro.p(adpdVar.d, new adpb(str, adpdVar, (awoq) null, 0), adrkVar);
                if (objP == awoxVar) {
                    return awoxVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = adrkVar.d;
                atqp.j(objP);
            }
            return (byte[]) objP;
        } catch (IllegalArgumentException e) {
            ((agrc) ((agrc) b.b()).j(e).k("com/google/android/libraries/youtube/rendering/rive/RiveSourceFetcher", "downloadUrl", 80, "RiveSourceFetcher.kt")).w("Failed to download URL source: %s", str);
        } catch (CancellationException e2) {
            throw e2;
        } catch (IllegalStateException e3) {
            ((agrc) ((agrc) b.b()).j(e3).k("com/google/android/libraries/youtube/rendering/rive/RiveSourceFetcher", "downloadUrl", 77, "RiveSourceFetcher.kt")).w("Failed to download URL source: %s", str);
        } catch (SecurityException e4) {
            ((agrc) ((agrc) b.b()).j(e4).k("com/google/android/libraries/youtube/rendering/rive/RiveSourceFetcher", "downloadUrl", 83, "RiveSourceFetcher.kt")).w("Security error downloading URL source: %s", str);
        }
    }

    public final byte[] c(int i) {
        try {
            InputStream inputStreamOpenRawResource = this.c.getResources().openRawResource(i);
            try {
                inputStreamOpenRawResource.getClass();
                byte[] bArrB = avkz.b(inputStreamOpenRawResource);
                JniZero.l(inputStreamOpenRawResource, null);
                return bArrB;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    JniZero.l(inputStreamOpenRawResource, th);
                    throw th2;
                }
            }
        } catch (Resources.NotFoundException e) {
            ((agrc) ((agrc) b.b()).j(e).k("com/google/android/libraries/youtube/rendering/rive/RiveSourceFetcher", "readRawResource", 92, "RiveSourceFetcher.kt")).u("Raw resource not found: %d", i);
            return null;
        } catch (IOException e2) {
            ((agrc) ((agrc) b.b()).j(e2).k("com/google/android/libraries/youtube/rendering/rive/RiveSourceFetcher", "readRawResource", 95, "RiveSourceFetcher.kt")).u("Failed to read raw resource ID: %d", i);
            return null;
        }
    }
}
