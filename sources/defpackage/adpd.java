package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import internal.org.jni_zero.JniZero;
import j$.util.concurrent.ConcurrentHashMap;
import java.nio.ByteBuffer;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adpd {
    public static final Set a = atqq.aS(new String[]{"gstatic.com", "googleusercontent.com", "ggpht.com", "ytimg.com"});
    public static final char[] b = {'/', '\\', '@', '?', '#'};
    public static final agrf c = agrf.h("com/google/android/libraries/youtube/rendering/rive/RiveDynamicAssetDownloader");
    public final awou d;
    public final awut e;
    public final ConcurrentHashMap f = new ConcurrentHashMap();
    public final lqa g;
    private final ahul h;

    public adpd(ahul ahulVar, awou awouVar, lqa lqaVar) {
        this.h = ahulVar;
        this.d = awouVar;
        this.g = lqaVar;
        this.e = awrc.K(JniZero.u(new awxf(null), awouVar));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, awoq awoqVar) throws Throwable {
        adpc adpcVar;
        if (awoqVar instanceof adpc) {
            adpcVar = (adpc) awoqVar;
            int i = adpcVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                adpcVar.c = i - Integer.MIN_VALUE;
            } else {
                adpcVar = new adpc(this, awoqVar);
            }
        } else {
            adpcVar = new adpc(this, awoqVar);
        }
        Object objAd = adpcVar.a;
        awox awoxVar = awox.a;
        int i2 = adpcVar.c;
        try {
            if (i2 == 0) {
                atqp.j(objAd);
                byte[] bArrU = this.g.U(str);
                if (bArrU != null) {
                    return bArrU;
                }
                ahus ahusVar = new ahus();
                ahusVar.c(str);
                ahusVar.b("GET");
                ListenableFuture listenableFutureA = this.h.a(new ahuu(ahusVar));
                adpcVar.d = str;
                adpcVar.c = 1;
                objAd = awrc.ad(listenableFutureA, adpcVar);
                if (objAd == awoxVar) {
                    return awoxVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = adpcVar.d;
                atqp.j(objAd);
            }
            aami aamiVar = (aami) objAd;
            int i3 = aamiVar.a;
            if (i3 != 200) {
                ((agrc) c.b().k("com/google/android/libraries/youtube/rendering/rive/RiveDynamicAssetDownloader", "performDownload", 99, "RiveDynamicAssetDownloader.kt")).u("Failed to download Rive file. HTTP Status: %d", i3);
            } else {
                Object obj = aamiVar.b;
                if (obj != null) {
                    byte[] bArr = new byte[((ByteBuffer) obj).remaining()];
                    ((ByteBuffer) obj).get(bArr);
                    this.g.T(str, bArr);
                    return bArr;
                }
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            ((agrc) ((agrc) c.b()).j(e2).k("com/google/android/libraries/youtube/rendering/rive/RiveDynamicAssetDownloader", "performDownload", 117, "RiveDynamicAssetDownloader.kt")).w("Failed to download bytes from URL: %s", str);
        }
        return null;
    }
}
