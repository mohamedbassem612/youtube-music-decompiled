package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aaqf extends wnn {
    public final Object c;
    public final Object d;
    public final Object e;

    public aaqf(wlp wlpVar, abxv abxvVar, zwb zwbVar, tgg tggVar, nrm nrmVar) {
        super(abxvVar, tggVar);
        this.c = zwbVar;
        wlpVar.getClass();
        this.d = f(alyk.a, wlpVar, new wsj(14), new wtk(9));
        this.e = f(alym.a, wlpVar, new wsj(15), new wtk(10));
        nrmVar.getClass();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, zwb] */
    public final aaqe a() {
        return new aaqe(this.b, this.c.e(), ((vxz) this.e).l(34, 45402343L, false));
    }

    public final ListenableFuture b(aaqe aaqeVar, Executor executor) {
        return ((wnh) this.d).b(aaqeVar, executor, null);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, zwb] */
    public final wur c(boolean z) {
        return new wur(this.b, this.d.e(), z);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, zwy] */
    public final ListenableFuture d(wur wurVar, Executor executor) {
        wnh wnhVar = (wnh) this.e;
        ?? r2 = this.c;
        ListenableFuture listenableFutureB = wnhVar.b(wurVar, executor, null);
        yno.ef(r2, listenableFutureB, executor, 204);
        return listenableFutureB;
    }

    public final ListenableFuture g(wlu wluVar, Executor executor) {
        return ((wnl) this.e).f(wluVar, executor);
    }

    public aaqf(wlp wlpVar, abxv abxvVar, zwh zwhVar, tgg tggVar, Executor executor) {
        super(abxvVar, tggVar);
        this.d = zwhVar;
        int i = 2;
        this.e = f(aldm.a, wlpVar, new heo(i), new hep(i));
        this.c = executor;
    }

    public aaqf(wlp wlpVar, abxv abxvVar, zwb zwbVar, tgg tggVar, mbc mbcVar) {
        super(abxvVar, tggVar);
        this.d = zwbVar;
        mbcVar.getClass();
        this.c = mbcVar;
        this.e = new woa(this, wlpVar);
    }

    public aaqf(wlp wlpVar, abxv abxvVar, zwh zwhVar, tgg tggVar, wjz wjzVar, Optional optional) {
        super(abxvVar, tggVar);
        this.e = zwhVar;
        this.d = optional;
        this.c = new wta(this, wlpVar, wjzVar);
    }

    public aaqf(wlp wlpVar, abxv abxvVar, zwh zwhVar, tgg tggVar, Executor executor, byte[] bArr) {
        super(abxvVar, tggVar);
        this.d = zwhVar;
        int i = 1;
        this.e = f(alsq.a, wlpVar, new heo(i), new hep(i));
        this.c = executor;
    }

    public aaqf(wlp wlpVar, abxv abxvVar, zwh zwhVar, tgg tggVar, vxu vxuVar) {
        super(abxvVar, tggVar);
        this.c = zwhVar;
        this.e = f(alpw.a, wlpVar, new wsj(19), new wtk(14));
        this.d = vxuVar;
    }

    public aaqf(wlp wlpVar, abxv abxvVar, zwb zwbVar, zwy zwyVar, tgg tggVar) {
        super(abxvVar, tggVar);
        this.d = zwbVar;
        this.c = zwyVar;
        this.e = f(alof.a, wlpVar, new wsj(20), new wtk(15));
    }

    public aaqf(wlp wlpVar, abxv abxvVar, zwb zwbVar, tgg tggVar, Executor executor) {
        super(abxvVar, tggVar);
        this.d = zwbVar;
        this.c = executor;
        this.e = f(alzi.a, wlpVar, new wut(17), new wvb(9));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public aaqf(wlp wlpVar, abxv abxvVar, zwb zwbVar, awmd awmdVar, awmd awmdVar2, vxz vxzVar, tqj tqjVar, byte[] bArr) {
        tgg tggVar;
        int i = tqr.a;
        if (tqjVar.k(1073828827)) {
            tggVar = (tgg) awmdVar2.io();
        } else {
            tggVar = (tgg) awmdVar.io();
        }
        super(abxvVar, tggVar);
        this.c = zwbVar;
        this.e = vxzVar;
        this.d = f(aohg.a, wlpVar, new wut(19), new wvb(11));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public aaqf(wlp wlpVar, abxv abxvVar, zwb zwbVar, awmd awmdVar, awmd awmdVar2, vxz vxzVar, tqj tqjVar) {
        tgg tggVar;
        int i = tqr.a;
        if (tqjVar.k(1073828827)) {
            tggVar = (tgg) awmdVar2.io();
        } else {
            tggVar = (tgg) awmdVar.io();
        }
        super(abxvVar, tggVar);
        this.c = zwbVar;
        this.e = vxzVar;
        this.d = f(alub.a, wlpVar, new wut(20), new wvb(12));
    }
}
