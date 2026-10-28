package defpackage;

import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Optional;
import java.util.concurrent.Executor;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aapa implements abor, abon {
    public final aboq a;
    public final awmd b;
    public final awmd c;
    public final vyo d;
    private final ahey e;
    private final awmd f;
    private final awmd g;
    private final awmd h;
    private final awmd i;
    private final awmd j;
    private final abmt k;

    /* JADX WARN: Type inference failed for: r10v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [awmd, java.lang.Object] */
    public aapa(abzo abzoVar, awmd awmdVar, vyo vyoVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, ahey aheyVar, awmd awmdVar7, abmt abmtVar) {
        txp txpVar = (txp) abzoVar.k.io();
        txpVar.getClass();
        abpd abpdVar = (abpd) abzoVar.f.io();
        abpdVar.getClass();
        abpf abpfVar = (abpf) abzoVar.i.io();
        abpfVar.getClass();
        axfd axfdVar = (axfd) abzoVar.g.io();
        axfdVar.getClass();
        qcb qcbVar = (qcb) abzoVar.b.io();
        qcbVar.getClass();
        abqq abqqVar = (abqq) abzoVar.c.io();
        abqqVar.getClass();
        abom abomVar = (abom) abzoVar.a.io();
        abomVar.getClass();
        acqf acqfVar = (acqf) abzoVar.h.io();
        acqfVar.getClass();
        aboi aboiVar = (aboi) abzoVar.e.io();
        aboiVar.getClass();
        vyo vyoVar2 = (vyo) abzoVar.d.io();
        vyoVar2.getClass();
        abmt abmtVar2 = (abmt) abzoVar.j.io();
        abmtVar2.getClass();
        aheyVar.getClass();
        this.a = new aboq(txpVar, abpdVar, abpfVar, axfdVar, qcbVar, abqqVar, abomVar, acqfVar, aboiVar, vyoVar2, abmtVar2, aheyVar);
        vyoVar.getClass();
        this.d = vyoVar;
        this.k = abmtVar;
        aheyVar.getClass();
        this.e = aheyVar;
        tqj tqjVar = abmtVar.b;
        int i = tqr.a;
        boolean zK = tqjVar.k(1073828654);
        this.b = new tbp(awmdVar, zK);
        this.c = new tbp(awmdVar6, zK);
        this.f = new tbp(awmdVar2, zK);
        this.g = new tbp(awmdVar3, zK);
        this.h = new tbp(awmdVar4, zK);
        this.i = new tbp(awmdVar5, zK);
        this.j = new tbp(awmdVar7, zK);
    }

    private final long k(abnl abnlVar) {
        Object objValueOf;
        jrk jrkVar = abnlVar.a;
        Optional optionalOf = (jrkVar.c & SemanticState.LiveRegion) != 0 ? Optional.of(Integer.valueOf(jrkVar.O)) : Optional.empty();
        hly hlyVar = new hly(this, 16);
        if (true != optionalOf.isPresent()) {
            aoqs aoqsVar = ((aapa) hlyVar.a).d.b().k;
            if (aoqsVar == null) {
                aoqsVar = aoqs.a;
            }
            objValueOf = Integer.valueOf((int) ((aoqsVar.b & 262144) != 0 ? aoqsVar.i : 1000L));
        } else {
            objValueOf = optionalOf.get();
        }
        return ((Integer) objValueOf).intValue();
    }

    private static ListenableFuture l(ListenableFuture listenableFuture, int i) {
        return ahcs.e(listenableFuture, afwl.a(new iow(i, 4)), MoreExecutors.directExecutor());
    }

    private final ListenableFuture m(abnl abnlVar, String str, int i, aphs aphsVar, abnp abnpVar) {
        return this.a.d(abnlVar, str, i, aphsVar, abnpVar);
    }

    private final ListenableFuture n(abnl abnlVar, String str, Supplier supplier, Supplier supplier2) {
        return (abnlVar.S() == 3 || q(abnlVar)) ? ((aaou) this.f.io()).d(str, l((ListenableFuture) supplier.get(), 1), l((ListenableFuture) supplier2.get(), 2), k(abnlVar), agkz.u(toe.class, NullPointerException.class, aaio.class, aair.class, aaos.class, SQLiteException.class, new Class[0]), this.e, (aalv) this.g.io(), new wix(9), 2) : (ListenableFuture) supplier.get();
    }

    private final ListenableFuture o(abnl abnlVar, ListenableFuture listenableFuture) {
        if (!abnlVar.J()) {
            if (!((abfv) this.h.io()).r()) {
                return listenableFuture;
            }
            aoev aoevVar = this.d.b().i;
            if (aoevVar == null) {
                aoevVar = aoev.a;
            }
            if (!aoevVar.k) {
                return listenableFuture;
            }
            new wix(12).a(abnlVar);
        }
        ListenableFuture listenableFutureB = ((iao) this.c.io()).b(abnlVar, false);
        aaou aaouVar = (aaou) this.f.io();
        aoev aoevVar2 = this.d.b().i;
        if (aoevVar2 == null) {
            aoevVar2 = aoev.a;
        }
        return aaouVar.d(null, listenableFuture, listenableFutureB, (aoevVar2.b & 33554432) != 0 ? aoevVar2.l : 1000L, agkz.s(toe.class, NullPointerException.class, aaos.class, SQLiteException.class), this.e, (aalv) this.g.io(), new wix(10), 3);
    }

    private final boolean p(abnl abnlVar) {
        int iS = abnlVar.S();
        return ((abnlVar.J() || iS == 5 || (iS == 4 && ((abfv) this.h.io()).r())) || abnlVar.J()) ? false : true;
    }

    private final boolean q(abnl abnlVar) {
        if (((abfv) this.h.io()).r()) {
            aoqs aoqsVar = this.d.b().k;
            if (aoqsVar == null) {
                aoqsVar = aoqs.a;
            }
            if (aoqsVar.h) {
                new wix(11).a(abnlVar);
                return true;
            }
        }
        return false;
    }

    public final ListenableFuture a(abnl abnlVar, ListenableFuture listenableFuture) {
        return TextUtils.isEmpty(abnlVar.w()) ? ahcs.f(listenableFuture, afwl.d(new aaoq(this, abnlVar, 3, null)), this.e) : ((aapd) this.b.io()).a(abnlVar);
    }

    @Override // defpackage.abor
    public final Pair b(abnl abnlVar, String str, abnp abnpVar, boolean z) {
        if (abnlVar.J() && abnlVar.J()) {
            if (!this.k.aw()) {
                return new Pair(((aapd) this.b.io()).a(abnlVar), ((iao) this.c.io()).b(abnlVar, true));
            }
            grj grjVarH = acqf.h(abnlVar, abnpVar, this.d, str, new aaoz(this, 1), new aaoz(this, 0), z, this.e);
            return new Pair(grjVarH.q(), (ListenableFuture) grjVarH.p().d(new cmw(this, abnlVar, 11, null)));
        }
        if (!p(abnlVar)) {
            grj grjVarH2 = acqf.h(abnlVar, abnpVar, this.d, str, new ukt(this, z, 4), new aaoz(this, 2), z, this.e);
            return Pair.create(grjVarH2.q(), (ListenableFuture) grjVarH2.p().d(new ovf(this, abnlVar, abnpVar, 9, (char[]) null)));
        }
        Pair pairB = this.a.b(abnlVar, str, abnpVar, z);
        ListenableFuture listenableFutureO = o(abnlVar, (ListenableFuture) pairB.second);
        return Pair.create(n(abnlVar, str, new vnn(pairB, 19), new mly(this, abnlVar, listenableFutureO, 7)), listenableFutureO);
    }

    @Override // defpackage.abor
    public final abrj c(abnl abnlVar, String str, abnp abnpVar, boolean z) {
        if (abnlVar.J() && abnlVar.J()) {
            final uqq uqqVar = new uqq(this, abnlVar, 12);
            avlr avlrVarK = tzk.c(((iao) this.c.io()).b(abnlVar, true)).k();
            if (!this.k.aw()) {
                return acqf.f((avlr) uqqVar.get(), avlrVarK);
            }
            avlr avlrVarP = TextUtils.isEmpty(abnlVar.w()) ? avlrVarK.B(new yqz(6)).ao().r(new hpn(this, abnlVar, 14)).k().P(new avnn() { // from class: aaoy
                @Override // defpackage.avnn
                public final Object a(Object obj) {
                    return (avlu) uqqVar.get();
                }
            }) : (avlr) uqqVar.get();
            return acqf.f(avlrVarP, avlrVarK);
        }
        int i = 3;
        if (!p(abnlVar)) {
            grj grjVarH = acqf.h(abnlVar, abnpVar, this.d, str, new ukt(this, z, i), new aagw(this, 20), z, this.e);
            ListenableFuture listenableFutureQ = grjVarH.q();
            ListenableFuture listenableFuture = (ListenableFuture) grjVarH.p().d(new ovf(this, abnlVar, abnpVar, 8, (char[]) null));
            return acqf.g(listenableFutureQ, listenableFuture);
        }
        abrj abrjVarC = this.a.c(abnlVar, str, abnpVar, z);
        ListenableFuture listenableFutureB = tzk.b(abrjVarC.a(abpg.class).h(wjf.class).ao());
        ListenableFuture listenableFutureO = o(abnlVar, tzk.b(abrjVarC.a(abqu.class).h(wgi.class).ao()));
        ListenableFuture listenableFutureN = n(abnlVar, str, new vnn(listenableFutureB, 18), new mly(this, abnlVar, listenableFutureO, 6));
        ahgr ahgrVar = new ahgr(abrjVarC);
        agkh agkhVar = new agkh(4);
        agkhVar.e(abpg.class, tzk.c(listenableFutureN).k());
        if (this.k.bf()) {
            avlr avlrVarG = avlr.G(agke.r(tzk.c(listenableFutureO).k(), abrjVarC.a(abqu.class).h(wgi.class).aq()));
            int i2 = avlh.a;
            avoj.a(i2, "prefetch is null");
            awbg awbgVar = new awbg(avlrVarG, avoi.a, i2, 3);
            avnn avnnVar = atqp.l;
            agkhVar.e(abqu.class, awbgVar);
        } else {
            agkhVar.e(abqu.class, tzk.c(listenableFutureO).k());
        }
        ahgrVar.h(agkhVar.d(true));
        return ahgrVar.f();
    }

    @Override // defpackage.abor
    public final ListenableFuture d(abnl abnlVar, String str, int i, aphs aphsVar, abnp abnpVar) {
        int iS = abnlVar.S();
        if (abnlVar.J() || iS == 5) {
            return ((aapd) this.b.io()).b(abnlVar);
        }
        if (iS != 4) {
            if (iS != 3) {
            }
            ListenableFuture listenableFutureL = l(((aapd) this.b.io()).b(abnlVar), 2);
            return ((aaou) this.f.io()).d(str, l(m(abnlVar, str, i, aphsVar, abnpVar), 1), listenableFutureL, k(abnlVar), agkz.u(toe.class, NullPointerException.class, aaio.class, aair.class, aaos.class, SQLiteException.class, new Class[0]), this.e, (aalv) this.g.io(), new wix(9), 2);
        }
        if (((abfv) this.h.io()).r()) {
            return ((aapd) this.b.io()).a(abnlVar);
        }
        if (!q(abnlVar)) {
            return m(abnlVar, str, i, aphsVar, abnpVar);
        }
        ListenableFuture listenableFutureL2 = l(((aapd) this.b.io()).b(abnlVar), 2);
        return ((aaou) this.f.io()).d(str, l(m(abnlVar, str, i, aphsVar, abnpVar), 1), listenableFutureL2, k(abnlVar), agkz.u(toe.class, NullPointerException.class, aaio.class, aair.class, aaos.class, SQLiteException.class, new Class[0]), this.e, (aalv) this.g.io(), new wix(9), 2);
    }

    @Override // defpackage.abor
    public final ListenableFuture e(abnl abnlVar, abnp abnpVar) {
        return abnlVar.J() ? ((iao) this.c.io()).b(abnlVar, true) : o(abnlVar, this.a.e(abnlVar, abnpVar));
    }

    @Override // defpackage.abor
    public final ListenableFuture f(abnl abnlVar, abnt abntVar, xir xirVar, abnp abnpVar) {
        if (abnlVar.J()) {
            return ((aapd) this.b.io()).a(abnlVar);
        }
        ListenableFuture listenableFutureF = this.a.f(abnlVar, abntVar, xirVar, abnpVar);
        return this.k.av() ? n(abnlVar, (String) abnlVar.o().orElse(null), new vnn(listenableFutureF, 16), new uqq(this, abnlVar, 9)) : listenableFutureF;
    }

    @Override // defpackage.abor
    public final ListenableFuture g(abnl abnlVar, aooj aoojVar, xir xirVar, abnp abnpVar) {
        if (abnlVar.J()) {
            return ((aapd) this.b.io()).a(abnlVar);
        }
        ListenableFuture listenableFutureG = this.a.g(abnlVar, aoojVar, xirVar, abnpVar);
        return this.k.av() ? n(abnlVar, (String) abnlVar.o().orElse(null), new vnn(listenableFutureG, 17), new uqq(this, abnlVar, 11)) : listenableFutureG;
    }

    @Override // defpackage.abor
    public final ListenableFuture h(String str, abnl abnlVar, abnp abnpVar, aphs aphsVar, boolean z) {
        return acqf.h(abnlVar, abnpVar, this.d, str, new ukt(this, z, 2), new hco(this, abnlVar, abnpVar, 20, (byte[]) null), z, this.e).q();
    }

    public final ListenableFuture i(abpw abpwVar, final boolean z) {
        final abnl abnlVar = abpwVar.a;
        int iS = abnlVar.S();
        if (abnlVar.J() || iS == 5) {
            return ((aapd) this.b.io()).a(abnlVar);
        }
        if (iS == 4 && ((abfv) this.h.io()).r()) {
            return ((aapd) this.b.io()).a(abnlVar);
        }
        final abnp abnpVar = abpwVar.b;
        final String str = abpwVar.c;
        return n(abnlVar, str, new Supplier() { // from class: aaox
            @Override // java.util.function.Supplier
            public final Object get() {
                abnl abnlVar2 = abnlVar;
                abnlVar2.w();
                return this.a.a.h(str, abnlVar2, abnpVar, null, z);
            }
        }, new uqq(this, abnlVar, 10));
    }

    @Override // defpackage.abon
    public final void j(abnl abnlVar, String str, Executor executor, abnp abnpVar) {
        if (abnlVar.J()) {
            return;
        }
        boolean zP = p(abnlVar);
        aboq aboqVar = this.a;
        if (zP) {
            aboqVar.j(abnlVar, str, executor, abnpVar);
        } else {
            aboqVar.a(abnlVar, str, executor, abnpVar);
        }
    }
}
