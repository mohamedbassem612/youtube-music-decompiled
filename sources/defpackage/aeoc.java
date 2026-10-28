package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aeoc implements bnu {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/shell/root/impl/RootFragmentLifecycleListenerImpl");
    private static final trk l = new trk("cdnci", new qci("onCreateDestroyNonCriticalInitializables"));
    public final avmb b;
    public final aunn c;
    public final aunn d;
    public final aunn e;
    public final aunn f;
    public final aunn g;
    public final aunn h;
    public final Set i;
    public final Set j;
    public final Set k;
    private final tre m;
    private final avmb n;
    private final tqj o;
    private final aunn p;
    private final List q;
    private final List r;
    private final List s;
    private final hef t;

    public aeoc(hef hefVar, tre treVar, avmb avmbVar, avmb avmbVar2, tqj tqjVar, aunn aunnVar, aunn aunnVar2, aunn aunnVar3, aunn aunnVar4, aunn aunnVar5, aunn aunnVar6, aunn aunnVar7) {
        treVar.getClass();
        avmbVar.getClass();
        avmbVar2.getClass();
        tqjVar.getClass();
        aunnVar.getClass();
        aunnVar2.getClass();
        aunnVar3.getClass();
        aunnVar4.getClass();
        aunnVar5.getClass();
        aunnVar6.getClass();
        aunnVar7.getClass();
        this.t = hefVar;
        this.m = treVar;
        this.b = avmbVar;
        this.n = avmbVar2;
        this.o = tqjVar;
        this.c = aunnVar;
        this.d = aunnVar2;
        this.e = aunnVar3;
        this.f = aunnVar4;
        this.g = aunnVar5;
        this.h = aunnVar6;
        this.p = aunnVar7;
        this.i = new LinkedHashSet();
        this.q = new ArrayList();
        this.j = new LinkedHashSet();
        this.r = new ArrayList();
        this.k = new LinkedHashSet();
        this.s = new ArrayList();
    }

    private final void b() {
        int i = tqr.a;
        if (this.o.k(1073829218)) {
            return;
        }
        taq.d();
    }

    private final void c(int i) {
        int i2 = tqr.a;
        if (this.o.k(1073829972)) {
            ((xeu) this.p.io()).f(new ccf(i, 6));
        }
    }

    public final void a(aunn aunnVar, Set set, int i) {
        tre treVar = this.m;
        treVar.h.r(i);
        try {
            Object objIo = aunnVar.io();
            objIo.getClass();
            tdh tdhVar = (tdh) objIo;
            if (!set.contains(tdhVar)) {
                agrx agrxVar = agso.a;
                tdhVar.a();
                set.add(tdhVar);
            }
        } finally {
            treVar.h.i(i);
        }
    }

    @Override // defpackage.bnu
    public final void onCreate(bog bogVar) {
        agrx agrxVar = agso.a;
        c(9);
        b();
        List list = this.r;
        adul.o(list);
        hef hefVar = this.t;
        list.add(hefVar.s().r(this.b).F(new isg(this, 9), new acae(aenz.a, 18)));
        int i = tqr.a;
        if (this.o.l(1074025443, 8)) {
            avmr avmrVar = new avmr();
            aebc aebcVarW = hefVar.w();
            trb trbVar = new trb(0, null);
            trbVar.a(l, new aead(this, avmrVar, 14));
            aebcVarW.i(trbVar);
            list.add(avmrVar);
        }
    }

    @Override // defpackage.bnu
    public final void onDestroy(bog bogVar) {
        agrx agrxVar = agso.a;
        c(14);
        b();
        adul.o(this.r);
        Set set = this.j;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((tdh) it.next()).gY();
        }
        set.clear();
    }

    @Override // defpackage.bnu
    public final void onPause(bog bogVar) {
        int i = tqr.a;
        tqj tqjVar = this.o;
        if (tqjVar.a(1073951412) == 5 || tqjVar.a(1073951412) == 6) {
            agrx agrxVar = agso.a;
            c(12);
            b();
            adul.o(this.s);
            Set set = this.k;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((tdh) it.next()).gY();
            }
            set.clear();
        }
    }

    @Override // defpackage.bnu
    public final void onResume(bog bogVar) {
        int i = tqr.a;
        tqj tqjVar = this.o;
        if (tqjVar.a(1073951412) == 5 || tqjVar.a(1073951412) == 6) {
            agrx agrxVar = agso.a;
            c(11);
            b();
            List list = this.s;
            adul.o(list);
            if (tqjVar.a(1073951412) == 5) {
                hef hefVar = this.t;
                final int i2 = 1;
                list.add(hefVar.s().r(this.b).F(new avnd(this) { // from class: aeny
                    public final /* synthetic */ aeoc a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.avnd
                    public final void a() {
                        int i3 = i2;
                        aeoc aeocVar = this.a;
                        if (i3 != 0) {
                            aeocVar.a(aeocVar.g, aeocVar.k, 221);
                        } else {
                            aeocVar.a(aeocVar.h, aeocVar.k, 222);
                        }
                    }
                }, new acym(aeoa.a, 9)));
            }
            if (tqjVar.a(1073951412) == 6) {
                Object obj = this.t.w().d;
                avlb avlbVar = (avlb) obj;
                avlb avlbVarR = avlbVar.w(30L, TimeUnit.SECONDS, this.n, null).s().r(this.b);
                final int i3 = 0;
                list.add(avlbVarR.E(new avnd(this) { // from class: aeny
                    public final /* synthetic */ aeoc a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.avnd
                    public final void a() {
                        int i4 = i3;
                        aeoc aeocVar = this.a;
                        if (i4 != 0) {
                            aeocVar.a(aeocVar.g, aeocVar.k, 221);
                        } else {
                            aeocVar.a(aeocVar.h, aeocVar.k, 222);
                        }
                    }
                }));
            }
        }
    }

    @Override // defpackage.bnu
    public final void onStart(bog bogVar) {
        agrx agrxVar = agso.a;
        c(10);
        b();
        List list = this.q;
        adul.o(list);
        hef hefVar = this.t;
        avlb avlbVarS = hefVar.s();
        avmb avmbVar = this.b;
        list.add(avlbVarS.r(avmbVar).F(new isg(this, 7), new acae(aeob.a, 19)));
        list.add(((avlb) hefVar.w().d).w(30L, TimeUnit.SECONDS, this.n, null).s().r(avmbVar).E(new isg(this, 8)));
    }

    @Override // defpackage.bnu
    public final void onStop(bog bogVar) {
        agrx agrxVar = agso.a;
        c(13);
        b();
        adul.o(this.q);
        Set set = this.i;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((tdh) it.next()).gY();
        }
        set.clear();
    }
}
