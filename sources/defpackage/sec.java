package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sec extends sdv {
    protected final mbc f;
    sdy g;
    final long h;
    private final Object i;
    private final Object j;
    private final awmd k;
    private final tqj l;

    public sec(Context context, String str, ajbd ajbdVar, vwt vwtVar, mbc mbcVar, long j, awmd awmdVar, boolean z, tqj tqjVar, abxu abxuVar) {
        super(context, str, ajbdVar, vwtVar, z, tqjVar, abxuVar);
        this.f = mbcVar;
        if (j < 0) {
            throw new IllegalStateException();
        }
        this.h = j;
        this.k = awmdVar;
        tqjVar.getClass();
        this.l = tqjVar;
        this.i = new Object();
        this.j = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12, types: [com.google.common.util.concurrent.ListenableFuture] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // defpackage.sdv, defpackage.sds
    public final ListenableFuture a(boolean z) {
        ?? aherVar;
        synchronized (this.i) {
            sdy sdyVar = this.g;
            if (sdyVar == null || !m(sdyVar)) {
                synchronized (this.j) {
                    synchronized (this.i) {
                        try {
                            sdy sdyVar2 = this.g;
                            if (sdyVar2 == null || !m(sdyVar2)) {
                                l();
                                sdy sdyVar3 = this.g;
                                aherVar = sdyVar3 == null ? new aher(Optional.empty()) : sdyVar3.d;
                            } else {
                                aherVar = this.g.d;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } else {
                aherVar = this.g.d;
            }
        }
        return aherVar;
    }

    @Override // defpackage.sdv, defpackage.sds
    public final ListenableFuture b() {
        return ahng.o(ahno.ap(new qoh(this, 15), this.d.a));
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x003c */
    @Override // defpackage.sdv, defpackage.sds
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String d() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.i
            monitor-enter(r0)
            sdy r1 = r3.g     // Catch: java.lang.Throwable -> L40
            if (r1 == 0) goto L15
            boolean r1 = r3.m(r1)     // Catch: java.lang.Throwable -> L40
            if (r1 == 0) goto L15
            sdy r3 = r3.g     // Catch: java.lang.Throwable -> L40
            java.lang.Object r3 = r3.b     // Catch: java.lang.Throwable -> L40
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L40
            java.lang.String r3 = (java.lang.String) r3
            goto L35
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L40
            java.lang.Object r1 = r3.j
            monitor-enter(r1)
            java.lang.Object r0 = r3.i     // Catch: java.lang.Throwable -> L3c
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L3c
            sdy r2 = r3.g     // Catch: java.lang.Throwable -> L38
            if (r2 == 0) goto L2f
            boolean r2 = r3.m(r2)     // Catch: java.lang.Throwable -> L38
            if (r2 == 0) goto L2f
            sdy r3 = r3.g     // Catch: java.lang.Throwable -> L38
            java.lang.Object r3 = r3.b     // Catch: java.lang.Throwable -> L38
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L38
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r3 = (java.lang.String) r3
            goto L35
        L2f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L38
            java.lang.String r3 = r3.l()     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3c
        L35:
            return r3
        L36:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L38
            throw r3     // Catch: java.lang.Throwable -> L3c
        L38:
            r3 = move-exception
            goto L36
        L3a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3c
            throw r3
        L3c:
            r3 = move-exception
            goto L3a
        L3e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L40
            throw r3
        L40:
            r3 = move-exception
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sec.d():java.lang.String");
    }

    protected final String k() {
        return ((zwb) this.k.io()).e().k();
    }

    protected final String l() {
        int i = tqr.a;
        ListenableFuture listenableFutureA = super.a(this.l.k(1073808297));
        Object obj = this.i;
        String strI = i();
        String strK = k();
        synchronized (obj) {
            long epochMilli = this.f.f().toEpochMilli();
            if (TextUtils.isEmpty(strI) || epochMilli <= 0) {
                this.g = null;
            } else {
                this.g = new sdy(strI, epochMilli, strK, listenableFutureA);
            }
        }
        return strI;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.CharSequence, java.lang.Object] */
    protected final boolean m(sdy sdyVar) {
        ?? r0 = sdyVar.b;
        if (!TextUtils.isEmpty(r0) && !j((String) r0)) {
            long j = this.h;
            long j2 = sdyVar.a;
            long epochMilli = this.f.f().toEpochMilli();
            if (epochMilli >= j2 && epochMilli < j2 + j && TextUtils.equals(sdyVar.c, k())) {
                return true;
            }
        }
        return false;
    }
}
