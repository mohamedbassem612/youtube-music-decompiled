package defpackage;

import android.content.ContentProviderClient;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import app.rive.RiveFile;
import internal.org.jni_zero.JniZero;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adps {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/rendering/rive/RiveImageAssetLoader");
    public final awou b;
    public final Map c;
    public final Map d;
    public final Map e;
    public final Map f;
    public volatile RiveFile g;
    public volatile Function0 h;
    public volatile awqk i;
    public volatile awqm j;
    public final axfm k;
    private final adrl l;
    private final awou m;
    private final awut n;

    public adps(adrl adrlVar, awou awouVar, awou awouVar2) {
        this.l = adrlVar;
        this.m = awouVar;
        this.b = awouVar2;
        this.n = awrc.K(JniZero.u(new awxf(null), awouVar));
        int i = axfn.a;
        this.k = new axfm(4, 0);
        Map mapSynchronizedMap = DesugarCollections.synchronizedMap(new LinkedHashMap());
        mapSynchronizedMap.getClass();
        this.c = mapSynchronizedMap;
        Map mapSynchronizedMap2 = DesugarCollections.synchronizedMap(new LinkedHashMap());
        mapSynchronizedMap2.getClass();
        this.d = mapSynchronizedMap2;
        Map mapSynchronizedMap3 = DesugarCollections.synchronizedMap(new LinkedHashMap());
        mapSynchronizedMap3.getClass();
        this.e = mapSynchronizedMap3;
        Map mapSynchronizedMap4 = DesugarCollections.synchronizedMap(new LinkedHashMap());
        mapSynchronizedMap4.getClass();
        this.f = mapSynchronizedMap4;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [adpv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    static /* synthetic */ Object a(adps adpsVar, adpv adpvVar, awoq awoqVar) throws Throwable {
        adpr adprVar;
        if (awoqVar instanceof adpr) {
            adprVar = (adpr) awoqVar;
            int i = adprVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                adprVar.d = i - Integer.MIN_VALUE;
            } else {
                adprVar = new adpr(adpsVar, awoqVar);
            }
        } else {
            adprVar = new adpr(adpsVar, awoqVar);
        }
        Object objP = adprVar.b;
        awox awoxVar = awox.a;
        int i2 = adprVar.d;
        try {
            if (i2 == 0) {
                atqp.j(objP);
                Objects.checkIndex(0, 3);
                if (adpvVar != 0) {
                    if (adpvVar instanceof adpt) {
                        return ((adpt) adpvVar).a;
                    }
                    if (adpvVar instanceof adpu) {
                        adrl adrlVar = adpsVar.l;
                        adri adriVar = new adri(((adpu) adpvVar).a);
                        adprVar.a = adpvVar;
                        adprVar.d = 1;
                        objP = awro.p(adrlVar.d, new adpb(adriVar, adrlVar, (awoq) null, 5), adprVar);
                        if (objP == awoxVar) {
                            adpvVar = adpvVar;
                            return awoxVar;
                        }
                    }
                }
                throw new awmj();
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj = adprVar.a;
            atqp.j(objP);
            adpvVar = obj;
            adpvVar = adpvVar;
            return (byte[]) objP;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            ((agrc) ((agrc) a.c()).j(e2).k("com/google/android/libraries/youtube/rendering/rive/RiveImageAssetLoader", "resolveBytes", 259, "RiveImageAssetLoader.kt")).w("Failed to fetch image bytes from url: %s", ((adpu) adpvVar).a);
            return null;
        }
    }

    private final void g(RiveFile riveFile, String str, adpv adpvVar, awqg awqgVar) {
        Map map = this.e;
        synchronized (map) {
            if (riveFile == this.g && this.g != null) {
                awwd awwdVar = (awwd) map.remove(str);
                if (awwdVar != null) {
                    awwdVar.p(null);
                }
                map.put(str, awro.t(this.n, null, 0, new adpq(this, str, riveFile, adpvVar, awqgVar, null), 3));
            }
        }
    }

    public final awwd b() {
        this.g = null;
        Function0 function0 = this.h;
        if (function0 != null) {
            function0.invoke();
        }
        awrm awrmVar = new awrm();
        Map map = this.e;
        synchronized (map) {
            awrmVar.a = atqq.ap(map.values());
            map.clear();
        }
        Iterator it = ((List) awrmVar.a).iterator();
        while (it.hasNext()) {
            ((awwd) it.next()).p(null);
        }
        awrm awrmVar2 = new awrm();
        Map map2 = this.f;
        synchronized (map2) {
            awrmVar2.a = atqq.ap(map2.values());
            map2.clear();
        }
        return awro.t(this.n, null, 0, new adpo(awrmVar, awrmVar2, this, (awoq) null, 0), 3);
    }

    public final void c(RiveFile riveFile) {
        if (riveFile != this.g || riveFile == null) {
            this.g = riveFile;
            if (riveFile == null) {
                b();
                return;
            }
            Map map = this.c;
            synchronized (map) {
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    key.getClass();
                    Object value = entry.getValue();
                    value.getClass();
                    e(riveFile, (String) key, (adpv) value);
                }
            }
            Map map2 = this.d;
            synchronized (map2) {
                for (Map.Entry entry2 : map2.entrySet()) {
                    Object key2 = entry2.getKey();
                    key2.getClass();
                    adpn adpnVar = (adpn) key2;
                    Object value2 = entry2.getValue();
                    value2.getClass();
                    adps adpsVar = this;
                    RiveFile riveFile2 = riveFile;
                    adpsVar.f(riveFile2, adpnVar.a, adpnVar.b, adpnVar.c, (adpv) value2);
                    this = adpsVar;
                    riveFile = riveFile2;
                }
            }
        }
    }

    public final void d(AutoCloseable autoCloseable) {
        try {
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
                return;
            }
            if (autoCloseable instanceof ExecutorService) {
                a.ar((ExecutorService) autoCloseable);
                return;
            }
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            }
            if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
                return;
            }
            if (autoCloseable instanceof MediaDrm) {
                ((MediaDrm) autoCloseable).release();
            } else if (autoCloseable instanceof DrmManagerClient) {
                ((DrmManagerClient) autoCloseable).release();
            } else {
                if (!(autoCloseable instanceof ContentProviderClient)) {
                    throw new IllegalArgumentException();
                }
                ((ContentProviderClient) autoCloseable).release();
            }
        } catch (Exception e) {
            ((agrc) ((agrc) a.c()).j(e).k("com/google/android/libraries/youtube/rendering/rive/RiveImageAssetLoader", "closeQuietly", 329, "RiveImageAssetLoader.kt")).w("Failed to close AutoCloseable resource: %s", autoCloseable);
        }
    }

    public final void e(RiveFile riveFile, String str, adpv adpvVar) {
        g(riveFile, str, adpvVar, new acjo(this, str, 5, null));
    }

    public final void f(RiveFile riveFile, String str, int i, String str2, adpv adpvVar) {
        g(riveFile, str + '[' + i + "]/" + str2, adpvVar, new adpm(this, str, i, str2, 0));
    }
}
