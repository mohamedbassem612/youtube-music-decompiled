package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Predicate;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abwf implements abuo {
    private static final Predicate c = new hkn(abnv.f, 15);
    public final abvk a;
    public final abvx b;
    private final abwj d;
    private final avmb e;
    private final abmt f;
    private final avlh g;
    private final axsp h;
    private final ExecutorService i;
    private final Executor j;

    public abwf(abvk abvkVar, avmb avmbVar, avlh avlhVar, axsp axspVar, abvx abvxVar, abwj abwjVar, abmt abmtVar, ExecutorService executorService, Executor executor) {
        this.a = abvkVar;
        this.d = abwjVar;
        this.b = abvxVar;
        this.e = avmbVar;
        this.g = avlhVar;
        this.h = axspVar;
        this.f = abmtVar;
        this.i = executorService;
        this.j = executor;
    }

    public static final abnt q(abnt abntVar, abug abugVar) {
        if (abugVar.k) {
            return abntVar;
        }
        ahsk ahskVarB = abnt.b(abntVar);
        ahskVarB.e(0L);
        return ahskVarB.c();
    }

    @Override // defpackage.abuo
    public final /* synthetic */ ListenableFuture a(abun abunVar, abug abugVar) {
        return d((abvz) abunVar, abugVar, new aajl(this, 18));
    }

    @Override // defpackage.abuo
    public final /* synthetic */ void c(abun abunVar, abun abunVar2) {
        p(abunVar2);
    }

    public final ListenableFuture d(abvz abvzVar, abug abugVar, Predicate predicate) {
        ListenableFuture listenableFutureF = f(abvzVar, abugVar, predicate);
        ListenableFuture listenableFutureK = ahno.av(listenableFutureF).k(new fxv(17), this.i);
        abmt abmtVar = this.f;
        return (abmtVar == null || !abmtVar.aE()) ? listenableFutureK : new abwe(listenableFutureK, new vnn(listenableFutureF, 20));
    }

    public final ListenableFuture e(abvz abvzVar, abug abugVar, final Predicate predicate) {
        ListenableFuture listenableFutureN = ahng.n(null);
        abvk abvkVar = this.a;
        acip acipVarJ = abvkVar.j();
        if (acipVarJ != null && abvkVar.V()) {
            listenableFutureN = tzk.b(acipVarJ.ad().x(new avno() { // from class: abwc
                @Override // defpackage.avno
                public final boolean a(Object obj) {
                    return predicate.test(((aayt) obj).a);
                }
            }).au().y(this.e));
        }
        awmd awmdVarF = abvzVar.f();
        if (awmdVarF == null) {
            AtomicReference atomicReference = new AtomicReference();
            qmw qmwVar = new qmw((Object) this, (Object) abugVar, (Object) abvzVar, (Object) atomicReference, 15, (byte[]) null);
            abvx abvxVar = this.b;
            abvxVar.getClass();
            ListenableFuture listenableFutureAs = ahno.as(listenableFutureN, qmwVar, new cck(abvxVar, 15));
            abmt abmtVar = this.f;
            return (abmtVar == null || !abmtVar.aE()) ? listenableFutureAs : new abwe(listenableFutureAs, new abzk(atomicReference, 1));
        }
        int i = 12;
        int i2 = 5;
        if (this.f.e.m(377, 45825407L)) {
            afxd afxdVarF = afxd.f(listenableFutureN);
            aajs aajsVar = new aajs(awmdVarF, 9);
            ExecutorService executorService = this.i;
            afxd afxdVarH = afxdVarF.h(aajsVar, executorService);
            aakn aaknVar = new aakn(this, abugVar, abvzVar, 7);
            abvx abvxVar2 = this.b;
            abvxVar2.getClass();
            afxd afxdVarH2 = afxdVarH.h(aaknVar, new cck(abvxVar2, 15));
            taf.i(afxdVarH2, executorService, new ztb(20), new uqk(i), new abmn(5));
            return afxdVarH2;
        }
        afxd afxdVarF2 = afxd.f(listenableFutureN);
        aakn aaknVar2 = new aakn(this, abugVar, awmdVarF, i2);
        abvx abvxVar3 = this.b;
        abvxVar3.getClass();
        afxd afxdVarH3 = afxdVarF2.h(aaknVar2, new cck(abvxVar3, 15)).h(new oly(i), this.i);
        aakn aaknVar3 = new aakn(this, abugVar, abvzVar, 6);
        abvxVar3.getClass();
        afxd afxdVarH4 = afxdVarH3.h(aaknVar3, new cck(abvxVar3, 15));
        abvxVar3.getClass();
        taf.i(afxdVarH4, new cck(abvxVar3, 15), new ztb(19), new uqk(11), new abmn(4));
        return afxdVarH4;
    }

    public final ListenableFuture f(abvz abvzVar, abug abugVar, Predicate predicate) {
        return g(abvzVar, abugVar, predicate, c);
    }

    public final ListenableFuture g(final abvz abvzVar, final abug abugVar, final Predicate predicate, final Predicate predicate2) {
        if (this.a.j() == null || predicate.test(abugVar.d)) {
            return e(abvzVar, abugVar, predicate2);
        }
        final AtomicReference atomicReference = new AtomicReference();
        ListenableFuture listenableFutureAs = ahno.as(tzk.b(this.g.x(new avno() { // from class: abwa
            @Override // defpackage.avno
            public final boolean a(Object obj) {
                return predicate.test(abugVar.d);
            }
        }).au().y(this.e)), new ahcy() { // from class: abwb
            @Override // defpackage.ahcy
            public final ListenableFuture a(Object obj) {
                abwf abwfVar = this.a;
                abvz abvzVar2 = abvzVar;
                abug abugVar2 = abugVar;
                AtomicReference atomicReference2 = atomicReference;
                ListenableFuture listenableFutureE = abwfVar.e(abvzVar2, abugVar2, predicate2);
                atomicReference2.set(listenableFutureE);
                return listenableFutureE;
            }
        }, this.i);
        abmt abmtVar = this.f;
        return (abmtVar == null || !abmtVar.aE()) ? listenableFutureAs : new abwe(listenableFutureAs, new abzk(atomicReference, 1));
    }

    public final ListenableFuture h(abvz abvzVar, abug abugVar, abng abngVar) {
        if (n()) {
            abvx abvxVar = this.b;
            abvxVar.f.B(abvzVar.a(), abngVar);
            wjf wjfVar = abngVar.a;
            abvxVar.a(abvzVar, abugVar, wjfVar);
            return ahng.n(wjfVar);
        }
        abvk abvkVar = this.a;
        abnl abnlVarA = abvzVar.a();
        abnp abnpVarB = abvzVar.b();
        abvv abvvVar = new abvv(this, abugVar, abvzVar, 2);
        ((Executor) abvkVar.q.io()).execute(afwl.i(new aapc(abvkVar, abnlVarA, abngVar, 8)));
        wjf wjfVar2 = abngVar.a;
        abvkVar.aj(abnlVarA, abnpVarB, wjfVar2, abvvVar);
        return ahng.n(wjfVar2);
    }

    @Override // defpackage.abuo
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final void b(abvz abvzVar, abuc abucVar) {
        k(abvzVar, abucVar, new iab(this, abucVar, 12, null));
    }

    public final void j(abuc abucVar, abnl abnlVar, abnp abnpVar) {
        abtz abtzVar = abucVar.b;
        abtz abtzVar2 = abtz.NONE;
        abpi abpiVar = this.a.s;
        if (abtzVar == abtzVar2) {
            abpiVar.c(abnlVar, abnpVar);
        } else {
            abpiVar.d(abnlVar, abnpVar, true);
        }
    }

    public final void k(abvz abvzVar, abuc abucVar, Predicate predicate) {
        if (abucVar.b == abtz.NONE && predicate.test(abvzVar)) {
            if (n()) {
                this.b.g(ahng.n(aazq.a));
                return;
            }
            return;
        }
        abpi abpiVar = this.a.s;
        if (!abpiVar.f()) {
            abpiVar.a();
        }
        abua abuaVar = abucVar.c;
        abnl abnlVarB = abuaVar != null ? abuaVar.b(abvzVar.a()) : abvzVar.a();
        abnp abnpVarB = abvzVar.b();
        if (n()) {
            this.b.g(tzk.b(this.g.x(new wsh(abnlVarB, 13)).au().y(this.e)));
        }
        awmd awmdVarF = abvzVar.f();
        if (awmdVarF != null) {
            afxd.f(ahno.ap(afwl.j(new wko(awmdVarF, 20)), this.i)).h(new qmw(this, abucVar, abnlVarB, abnpVarB, 16), this.j);
        } else {
            j(abucVar, abnlVarB, abnpVarB);
        }
    }

    public final void l(abul abulVar, abvz abvzVar, abnl abnlVar) {
        if (abnlVar == abvzVar.a()) {
            this.h.kk(new aayx(abulVar, abvzVar));
        }
    }

    public final boolean m(abun abunVar, abua abuaVar) {
        if (!(abunVar instanceof abvz)) {
            return true;
        }
        abnl abnlVarA = ((abvz) abunVar).a();
        abvk abvkVar = this.a;
        if (abuaVar != null) {
            abnlVarA = abuaVar.b(abnlVarA);
        }
        return abvkVar.S(abnlVarA);
    }

    public final boolean n() {
        abwj abwjVar = this.d;
        return abwjVar.c || abwjVar.f;
    }

    public final boolean o(abug abugVar) {
        return abugVar.g && (abugVar.d instanceof abvz) && this.a.X();
    }

    public final void p(abun abunVar) {
        if (abunVar instanceof abvz) {
            return;
        }
        abpi abpiVar = this.a.s;
        abpiVar.e();
        ((abvk) abpiVar.a).r.d();
    }
}
