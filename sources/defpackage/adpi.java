package defpackage;

import app.rive.FontAsset;
import app.rive.RiveFile;
import internal.org.jni_zero.JniZero;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adpi {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/rendering/rive/RiveFontAssetLoader");
    public final awou b;
    public final Map c;
    public final ConcurrentHashMap d;
    public final ConcurrentHashMap e;
    public volatile RiveFile f;
    public final AtomicLong g;
    public volatile awqk h;
    public final axfm i;
    private final adrl j;
    private final awou k;
    private final awut l;
    private volatile Function0 m;

    public adpi(adrl adrlVar, awou awouVar, awou awouVar2) {
        this.j = adrlVar;
        this.k = awouVar;
        this.b = awouVar2;
        this.l = awrc.K(JniZero.u(new awxf(null), awouVar));
        int i = axfn.a;
        this.i = new axfm(4, 0);
        Map mapSynchronizedMap = DesugarCollections.synchronizedMap(new LinkedHashMap());
        mapSynchronizedMap.getClass();
        this.c = mapSynchronizedMap;
        this.d = new ConcurrentHashMap();
        this.e = new ConcurrentHashMap();
        this.g = new AtomicLong(0L);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x007e  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00c1 -> B:57:0x0127). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00c4 -> B:57:0x0127). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00d8 -> B:35:0x00da). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static /* synthetic */ java.lang.Object a(defpackage.adpi r16, app.rive.core.CommandQueue r17, defpackage.awoq r18) {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adpi.a(adpi, app.rive.core.CommandQueue, awoq):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [adpl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    static /* synthetic */ Object b(adpi adpiVar, adpl adplVar, awoq awoqVar) throws Throwable {
        adph adphVar;
        if (awoqVar instanceof adph) {
            adphVar = (adph) awoqVar;
            int i = adphVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                adphVar.d = i - Integer.MIN_VALUE;
            } else {
                adphVar = new adph(adpiVar, awoqVar);
            }
        } else {
            adphVar = new adph(adpiVar, awoqVar);
        }
        Object objP = adphVar.b;
        awox awoxVar = awox.a;
        int i2 = adphVar.d;
        try {
            if (i2 == 0) {
                atqp.j(objP);
                Objects.checkIndex(0, 3);
                if (adplVar != 0) {
                    if (adplVar instanceof adpj) {
                        throw null;
                    }
                    if (adplVar instanceof adpk) {
                        adrl adrlVar = adpiVar.j;
                        adri adriVar = new adri(((adpk) adplVar).a);
                        adphVar.a = adplVar;
                        adphVar.d = 1;
                        objP = awro.p(adrlVar.d, new adpb(adriVar, adrlVar, (awoq) null, 5), adphVar);
                        if (objP == awoxVar) {
                            adplVar = adplVar;
                            return awoxVar;
                        }
                    }
                }
                throw new awmj();
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj = adphVar.a;
            atqp.j(objP);
            adplVar = obj;
            adplVar = adplVar;
            return (byte[]) objP;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            ((agrc) ((agrc) a.c()).j(e2).k("com/google/android/libraries/youtube/rendering/rive/RiveFontAssetLoader", "resolveBytes", 273, "RiveFontAssetLoader.kt")).w("Failed to fetch font bytes from url: %s", ((adpk) adplVar).a);
            return null;
        }
    }

    public final awwd c() {
        this.f = null;
        this.g.incrementAndGet();
        Function0 function0 = this.m;
        awrm awrmVar = new awrm();
        ConcurrentHashMap concurrentHashMap = this.d;
        synchronized (concurrentHashMap) {
            Collection collectionValues = concurrentHashMap.values();
            collectionValues.getClass();
            awrmVar.a = atqq.ap(collectionValues);
        }
        Iterator it = ((List) awrmVar.a).iterator();
        while (it.hasNext()) {
            ((awwd) it.next()).p(null);
        }
        awrm awrmVar2 = new awrm();
        ConcurrentHashMap concurrentHashMap2 = this.e;
        synchronized (concurrentHashMap2) {
            awrmVar2.a = atqq.D(concurrentHashMap2);
            concurrentHashMap2.clear();
        }
        return awro.t(this.l, null, 0, new adpo(awrmVar, awrmVar2, this, (awoq) null, 1), 3);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0059 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(app.rive.RiveFile r9) {
        /*
            r8 = this;
            app.rive.RiveFile r0 = r8.f
            if (r9 != r0) goto L7
            if (r9 != 0) goto L58
            r9 = 0
        L7:
            r1 = r9
            app.rive.RiveFile r9 = r8.f
            if (r9 == 0) goto Lf
            r8.c()
        Lf:
            r8.f = r1
            if (r1 == 0) goto L58
            java.util.concurrent.atomic.AtomicLong r9 = r8.g
            java.util.Map r6 = r8.c
            long r4 = r9.get()
            monitor-enter(r6)
            java.util.Set r9 = r6.entrySet()     // Catch: java.lang.Throwable -> L59
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L59
        L24:
            boolean r0 = r9.hasNext()     // Catch: java.lang.Throwable -> L59
            if (r0 == 0) goto L57
            java.lang.Object r0 = r9.next()     // Catch: java.lang.Throwable -> L59
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L59
            java.lang.Object r2 = r0.getKey()     // Catch: java.lang.Throwable -> L59
            r2.getClass()     // Catch: java.lang.Throwable -> L59
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L59
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L59
            r0.getClass()     // Catch: java.lang.Throwable -> L59
            r3 = r0
            adpl r3 = (defpackage.adpl) r3     // Catch: java.lang.Throwable -> L59
            j$.util.concurrent.ConcurrentHashMap r7 = r8.e     // Catch: java.lang.Throwable -> L59
            monitor-enter(r7)     // Catch: java.lang.Throwable -> L59
            boolean r0 = r7.containsKey(r2)     // Catch: java.lang.Throwable -> L53
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L59
            if (r0 != 0) goto L24
            r0 = r8
            r0.f(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L59
            r8 = r0
            goto L24
        L53:
            r0 = move-exception
            r8 = r0
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L59
            throw r8     // Catch: java.lang.Throwable -> L59
        L57:
            monitor-exit(r6)
        L58:
            return
        L59:
            r0 = move-exception
            r8 = r0
            monitor-exit(r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adpi.d(app.rive.RiveFile):void");
    }

    public final void e(String str, FontAsset fontAsset) {
        str.getClass();
        fontAsset.getClass();
        try {
            fontAsset.close();
        } catch (Exception e) {
            ((agrc) ((agrc) a.c()).j(e).k("com/google/android/libraries/youtube/rendering/rive/RiveFontAssetLoader", "closeQuietly", 339, "RiveFontAssetLoader.kt")).w("Failed to close FontAsset resource for: %s", str);
        }
    }

    public final void f(RiveFile riveFile, String str, adpl adplVar, long j) {
        ConcurrentHashMap concurrentHashMap = this.d;
        synchronized (concurrentHashMap) {
            if (riveFile == this.f && this.f != null && this.g.get() == j) {
                awwd awwdVar = (awwd) concurrentHashMap.remove(str);
                if (awwdVar != null) {
                    awwdVar.p(null);
                }
                concurrentHashMap.put(str, awro.t(this.l, null, 0, new adpf(this, str, riveFile, j, adplVar, null), 3));
            }
        }
    }
}
