package defpackage;

import android.text.TextUtils;
import android.util.LruCache;
import android.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aboq implements abor, abon {
    public final abpd a;
    public final abpf b;
    public final abqq c;
    public final abmt d;
    public final axfd e;
    public final qcb f;
    private final txp g;
    private final abom h;
    private final vyo i;
    private final Executor j;
    private final aboi k;
    private final acqf l;

    public aboq(txp txpVar, abpd abpdVar, abpf abpfVar, axfd axfdVar, qcb qcbVar, abqq abqqVar, abom abomVar, acqf acqfVar, aboi aboiVar, vyo vyoVar, abmt abmtVar, Executor executor) {
        this.g = txpVar;
        this.a = abpdVar;
        this.b = abpfVar;
        this.e = axfdVar;
        this.f = qcbVar;
        this.c = abqqVar;
        this.h = abomVar;
        this.l = acqfVar;
        this.k = aboiVar;
        this.i = vyoVar;
        this.j = executor;
        this.d = abmtVar;
    }

    private final void k(abnl abnlVar) {
        aboi aboiVar = this.k;
        if (aboiVar.m()) {
            aboiVar.h(abnlVar.I());
            aboiVar.g(abnlVar.H());
        }
    }

    public final void a(abnl abnlVar, String str, Executor executor, abnp abnpVar) {
        k(abnlVar);
        this.a.s(abnlVar, str, executor, abnpVar);
    }

    @Override // defpackage.abor
    public final Pair b(abnl abnlVar, String str, abnp abnpVar, boolean z) {
        final aazx aazxVar = new aazx(this, abnpVar, 5);
        grj grjVarH = acqf.h(abnlVar, abnpVar, this.i, str, new agek() { // from class: aboo
            @Override // defpackage.agek
            public final Object apply(Object obj) {
                return (ListenableFuture) ((agfr) aazxVar.apply((abpw) obj)).io();
            }
        }, new aaoz(this, 8), z, this.j);
        return Pair.create(grjVarH.q(), grjVarH.p().g() ? (ListenableFuture) grjVarH.p().c() : this.e.n(abnlVar, abnpVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [com.google.common.util.concurrent.ListenableFuture] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r2v11, types: [com.google.common.util.concurrent.ListenableFuture] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.abor
    public final abrj c(final abnl abnlVar, String str, final abnp abnpVar, boolean z) {
        acqf acqfVar;
        String str2;
        ?? r10;
        Object obj;
        abpd abpdVar = this.a;
        LruCache lruCache = abpdVar.j;
        if (lruCache != null && !TextUtils.isEmpty(abnlVar.w())) {
            abnlVar.Q();
            if (lruCache.get(abpdVar.h(abnlVar, -1).Y()) != null) {
                final aazx aazxVar = new aazx(this, abnpVar, 6);
                grj grjVarH = acqf.h(abnlVar, abnpVar, this.i, str, new agek() { // from class: abop
                    @Override // defpackage.agek
                    public final Object apply(Object obj2) {
                        return (ListenableFuture) ((agfr) aazxVar.apply((abpw) obj2)).io();
                    }
                }, new aaoz(this, 11), z, this.j);
                return acqf.g(grjVarH.q(), (ListenableFuture) grjVarH.p().d(new ovf((Object) this, (Object) abnlVar, (Object) abnpVar, 12, (byte[]) null)));
            }
        }
        agfr agfrVarI = i(abnlVar, str, abnpVar);
        final acqf acqfVar2 = this.l;
        abom abomVar = this.h;
        xir xirVar = abnpVar.b;
        abrj abrjVar = (abrj) abomVar.a(str, agfrVarI, xirVar);
        aaoz aaozVar = new aaoz(this, 9);
        final aaoz aaozVar2 = new aaoz(this, 10);
        final avmc avmcVarAo = abrjVar.a(abpg.class).h(wjf.class).ao();
        AtomicReference atomicReference = new AtomicReference(new avmq(avoi.b));
        avlr avlrVarH = abrjVar.a(abqu.class).h(wgi.class);
        int i = 14;
        final abaq abaqVar = new abaq(xirVar, "sw_wfb", i);
        avnn avnnVar = new avnn() { // from class: abpv
            @Override // defpackage.avnn
            public final Object a(Object obj2) {
                Throwable th = (Throwable) obj2;
                final acqf acqfVar3 = acqfVar2;
                abmt abmtVar = (abmt) acqfVar3.a;
                if (abmtVar.Q()) {
                    return avlr.A(th);
                }
                if (!abmtVar.bM() && (th instanceof CancellationException)) {
                    return avlr.A(th);
                }
                if (!(th instanceof UnsupportedOperationException)) {
                    zvp.b(zvn.b, zvm.k, "Error performing streaming watch.", th);
                }
                final agek agekVar = aaozVar2;
                final abnp abnpVar2 = abnpVar;
                final abnl abnlVar2 = abnlVar;
                abaqVar.run();
                if (TextUtils.isEmpty(abnlVar2.w())) {
                    final avmc avmcVar = avmcVarAo;
                    agekVar = new agek() { // from class: abpu
                        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.concurrent.Executor] */
                        @Override // defpackage.agek
                        public final Object apply(Object obj3) {
                            abnl abnlVar3 = abnlVar2;
                            return ahcs.f(tzk.b(avmcVar.u(new yrb(abnlVar3, 19)).w(new yrb(abnlVar3, 20))), afwl.d(new aaoq(agekVar, abnpVar2, 4)), acqfVar3.d);
                        }
                    };
                }
                return tzk.c((ListenableFuture) agekVar.apply(new abpx(abnlVar2, abnpVar2))).k();
            }
        };
        abnl abnlVar2 = abnlVar;
        abnp abnpVar2 = abnpVar;
        awko awkoVarC = awen.c(avlrVarH.P(avnnVar));
        awkoVarC.f(new abms(atomicReference, 20));
        abmt abmtVar = (abmt) acqfVar2.a;
        Object objApply = abmtVar.e.m(54, 45375607L) ? aaozVar2.apply(new abpx(abnlVar2, abnpVar2)) : tzk.b(awkoVarC.ao());
        if (TextUtils.isEmpty(abnlVar2.w())) {
            ?? r2 = objApply;
            acqfVar = acqfVar2;
            str2 = str;
            hsh hshVar = new hsh(acqfVar, (ListenableFuture) r2, abnlVar, abnpVar2, str2, aaozVar, 2);
            r10 = r2;
            abnlVar2 = abnlVar;
            abnpVar2 = abnpVar2;
            obj = hshVar;
        } else {
            acqfVar = acqfVar2;
            str2 = str;
            r10 = objApply;
            obj = aaozVar;
        }
        abpw abpwVar = new abpw(abnlVar2, abnpVar2, str2, z);
        avlr avlrVarK = tzk.c(abmtVar.Q() ? tzk.b(avmcVarAo) : ahbz.f(tzk.b(avmcVarAo), Throwable.class, afwl.d(new qmw(acqfVar, new abaq(xirVar, "sw_pfb", i), obj, abpwVar, 14, (char[]) null)), acqfVar.b)).k();
        avlr avlrVarK2 = awkoVarC;
        if (!abmtVar.bf()) {
            avlrVarK2 = tzk.c(r10).k();
        }
        agkj agkjVarK = agkj.k(abpg.class, avlrVarK, abqu.class, avlrVarK2);
        ahgr ahgrVarB = abrj.b();
        ahgrVarB.g(new avml(new hmg(abrjVar, atomicReference, 14)));
        ahgrVarB.h(agkjVarK);
        return ahgrVarB.f();
    }

    @Override // defpackage.abor
    public final ListenableFuture d(abnl abnlVar, String str, int i, aphs aphsVar, abnp abnpVar) {
        abpd abpdVar = this.a;
        abpdVar.m(abnlVar, i);
        return abpdVar.i(abnlVar, str, i, aphsVar, null, true, abnpVar);
    }

    @Override // defpackage.abor
    public final ListenableFuture e(abnl abnlVar, abnp abnpVar) {
        return this.e.n(abnlVar, abnpVar);
    }

    @Override // defpackage.abor
    public final ListenableFuture f(abnl abnlVar, abnt abntVar, xir xirVar, abnp abnpVar) {
        return this.a.k(abnlVar, abntVar.b.a(), xirVar, abnpVar, abntVar);
    }

    @Override // defpackage.abor
    public final ListenableFuture g(abnl abnlVar, aooj aoojVar, xir xirVar, abnp abnpVar) {
        return this.a.l(abnlVar, aoojVar, xirVar, abnpVar);
    }

    @Override // defpackage.abor
    public final ListenableFuture h(String str, abnl abnlVar, abnp abnpVar, aphs aphsVar, boolean z) {
        return acqf.h(abnlVar, abnpVar, this.i, str, new aaat(this, abnpVar, 12), new aaoz(this, 7), z, this.j).q();
    }

    final agfr i(abnl abnlVar, String str, abnp abnpVar) {
        return afwl.b(new rrw(this, abnlVar, abnpVar, str, 3));
    }

    @Override // defpackage.abon
    public final void j(abnl abnlVar, String str, Executor executor, abnp abnpVar) {
        k(abnlVar);
        if (!this.d.aY() || !abnlVar.O()) {
            a(abnlVar, str, executor, abnpVar);
            return;
        }
        String strQ = abnlVar.q(this.g);
        abmw abmwVar = abmw.MEDIASESSION;
        this.h.b(strQ, i(abnlVar, strQ, abnpVar), abnpVar.b, executor);
    }
}
