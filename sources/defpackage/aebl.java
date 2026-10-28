package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.android.libraries.elements.interfaces.BlockRegistryProvider;
import j$.util.Collection;
import j$.util.function.Predicate$CC;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Predicate;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aebl extends qa {
    private final BlockRegistryProvider A;
    private final boolean B;
    private final Handler C;
    private final mhc D;
    private final afip E;
    private final ci F;
    public final fsy a;
    public final xgn b;
    public final boolean c;
    public avmm d;
    public final aecs e;
    public final adwq f;
    public final nqt g;
    public final boolean h;
    public final boolean i;
    public boolean j;
    public final mlo k;
    public final lqa l;
    private final fof m;
    private final admo n;
    private final boolean o;
    private final boolean p;
    private final nvy q;
    private final nwj r;
    private final aebc s;
    private final ntu v;
    private final float w;
    private final nt x;
    private final boolean y;
    private final Runnable z;

    public aebl(fof fofVar, fsy fsyVar, admo admoVar, mlo mloVar, xgn xgnVar, boolean z, boolean z2, ntx ntxVar, boolean z3, ntu ntuVar, afip afipVar, float f, float f2, mhc mhcVar, nt ntVar, nwj nwjVar, aecs aecsVar, adwq adwqVar, nqt nqtVar, lqa lqaVar, boolean z4, boolean z5, boolean z6, boolean z7) {
        nvy nvyVar;
        super((byte[]) null);
        this.C = new Handler(Looper.getMainLooper());
        this.m = fofVar;
        this.a = fsyVar;
        this.n = admoVar;
        this.k = mloVar;
        this.b = xgnVar;
        this.o = z;
        this.p = z2;
        this.r = nwjVar;
        this.s = new aebc(mloVar, aecsVar, ntuVar, afipVar, nqtVar, adwqVar, z4);
        this.F = new ci(aecsVar, (char[]) null);
        this.c = z3;
        this.v = ntuVar;
        this.E = afipVar;
        this.w = f2;
        this.D = mhcVar;
        this.x = ntVar;
        this.y = ntxVar == null ? true : ntxVar.g;
        this.e = aecsVar;
        this.f = adwqVar;
        this.g = nqtVar;
        this.l = lqaVar;
        this.h = z5;
        this.B = z6;
        this.i = z7;
        this.A = aebp.c(adwqVar);
        this.z = new wdd(this, fsyVar, 18, (byte[]) null);
        if (ntxVar != null && (nvyVar = ntxVar.f) != null) {
            this.q = nvyVar;
            return;
        }
        nvx nvxVarA = nvy.a();
        nvxVarA.d(f);
        this.q = nvxVarA.a();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0077  */
    /* JADX WARN: Type inference failed for: r1v2, types: [aecs, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [aecs, java.lang.Object] */
    private final ftg q(int i) {
        final int i2;
        final int i3;
        boolean z;
        acxm acxmVar;
        final avmm avmmVar;
        nxv nxvVar;
        final aebl aeblVar;
        nsl nslVarA;
        fgy fgyVarA;
        Object item = this.n.getItem(i);
        boolean z2 = false;
        if (!(item instanceof acxm) || (item instanceof adai)) {
            boolean z3 = item instanceof adla;
            if (z3) {
                final adla adlaVar = (adla) item;
                Iterator it = adlaVar.b().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        final aebc aebcVar = this.s;
                        fof fofVar = this.m;
                        final xgn xgnVar = this.b;
                        avmm avmmVar2 = this.d;
                        final nwj nwjVar = this.r;
                        if (!z3) {
                            return null;
                        }
                        final avmm avmmVar3 = new avmm();
                        int i4 = fks.g;
                        fkr fkrVar = new fkr(fofVar, new fks());
                        fkrVar.M(1, adlaVar.c);
                        fkrVar.M(3, adlaVar.d);
                        fkrVar.M(2, 0);
                        fkrVar.M(4, adlaVar.b);
                        int i5 = adlaVar.a;
                        int i6 = 0;
                        while (i6 < i5) {
                            final acxm acxmVar2 = (acxm) adlaVar.a(i6);
                            int i7 = i6 < i5 + (-1) ? adlaVar.e : 0;
                            float f = i5;
                            if (acxmVar2 != null) {
                                i2 = i5;
                                i3 = i6;
                                nxw nxwVar = new nxw() { // from class: aebb
                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, nqt] */
                                    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, ntu] */
                                    @Override // defpackage.nxw
                                    public final fgy a(fhd fhdVar, nsl nslVar) {
                                        fhd fhdVar2;
                                        aebc aebcVar2 = aebcVar;
                                        ?? r0 = aebcVar2.e;
                                        r0.b();
                                        boolean z4 = aebcVar2.a;
                                        acxm acxmVar3 = acxmVar2;
                                        if (z4) {
                                            fly flyVarA = fly.a(fhdVar.j());
                                            flyVarA.d(mlf.class, acxmVar3.a());
                                            fhdVar2 = new fhd(fhdVar, flyVarA, fhdVar.h());
                                        } else {
                                            fhdVar2 = fhdVar;
                                        }
                                        avmm avmmVar4 = avmmVar3;
                                        int i8 = i3;
                                        int i9 = i2;
                                        adla adlaVar2 = adlaVar;
                                        nwj nwjVar2 = nwjVar;
                                        xgn xgnVar2 = xgnVar;
                                        nsk nskVarB = nsl.b();
                                        nskVarB.o(agke.q(aawb.ad(acxmVar3, null, null)));
                                        nskVarB.n(((afip) aebcVar2.d).f(xgnVar2, acxmVar3.a));
                                        ?? r8 = aebcVar2.c;
                                        nskVarB.c = r8.e(r8.a(), r0);
                                        nskVarB.n = new AtomicReference(nwjVar2);
                                        nskVarB.h(adlaVar2.f);
                                        nskVarB.f(i9);
                                        nskVarB.g(i8);
                                        adwq adwqVar = (adwq) aebcVar2.f;
                                        nskVarB.r = aebp.d(adwqVar);
                                        nskVarB.s = aebp.c(adwqVar);
                                        return ((mlo) aebcVar2.g).b(fhdVar2, nskVarB.a(), acxmVar3, new adat(xgnVar2), avmmVar4);
                                    }
                                };
                                nyf nyfVar = new nyf(fofVar, new nyh());
                                nyfVar.e(nsl.b().a());
                                nyfVar.d(nxwVar);
                                nyfVar.W(100.0f / f);
                                nyfVar.Q(6, i7);
                                fkrVar.f(nyfVar.a().l());
                            } else {
                                i2 = i5;
                                i3 = i6;
                                int i8 = fgr.g;
                                fgq fgqVar = new fgq(fofVar, new fgr());
                                fgqVar.W(100.0f / f);
                                fgqVar.Q(6, i7);
                                fkrVar.f(fgqVar.a);
                            }
                            i6 = i3 + 1;
                            avmmVar3 = avmmVar3;
                            i5 = i2;
                        }
                        avmm avmmVar4 = avmmVar3;
                        if (avmmVar2 != null) {
                            avmmVar2.c(avmmVar4);
                        }
                        fqc fqcVar = new fqc();
                        ?? r3 = aebcVar.b;
                        if (r3 != 0 && r3.h()) {
                            z2 = true;
                        }
                        fqcVar.b(z2);
                        fqcVar.b = fkrVar.a;
                        return new nye(new fqe(fqcVar), avmmVar4, null, null, null);
                    }
                    Object next = it.next();
                    if (next != null && (!(next instanceof acxm) || (next instanceof adai))) {
                        break;
                    }
                }
            }
            ?? r1 = this.F.a;
            if (r1 != 0) {
                if (r1.h() ? r1.d(item) : ci.Z(item)) {
                    fpv fpvVar = new fpv();
                    fpvVar.b(true);
                    int i9 = fsi.a;
                    return new fsj(fpvVar);
                }
            }
            return fsk.a;
        }
        final acxm acxmVar3 = (acxm) item;
        avmm avmmVar5 = new avmm();
        int iA = this.v.a();
        ntt nttVar = new ntt(String.valueOf(iA));
        afip afipVar = this.E;
        xgn xgnVar2 = this.b;
        akrn akrnVar = acxmVar3.a;
        adfx adfxVarF = afipVar.f(xgnVar2, akrnVar);
        akro akroVar = akrnVar.c;
        if (akroVar == null) {
            akroVar = akro.a;
        }
        aihl aihlVar = apku.b;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
        akroVar.c(aihlVarCheckIsLite);
        if (akroVar.j.n(aihlVarCheckIsLite.d)) {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
            akroVar.c(aihlVarCheckIsLite2);
            Object objK = akroVar.j.k(aihlVarCheckIsLite2.d);
            int iAS = a.aS(((apku) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).d);
            if (iAS == 0 || iAS != 3) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        ntw ntwVarB = ntx.b(new glj(this.k.a, 6));
        ntwVarB.c(this.o);
        ntwVarB.b(this.y);
        ntwVarB.i = adfxVarF;
        nvx nvxVar = new nvx(this.q);
        nvxVar.f(this.p || acxmVar3.b().f);
        ntwVarB.f = nvxVar.a();
        Object[] objArr = {new adar(null, new adaq(acxmVar3, null, null, null))};
        aguu.j(objArr, 1);
        ntwVarB.g = new agpi(objArr, 1);
        agkh agkhVar = ntwVarB.a;
        aecs aecsVar = this.e;
        agkhVar.e("enable_imp_for_single_column_grid", Boolean.valueOf(aecsVar != null));
        if (this.h) {
            ntx ntxVarA = ntwVarB.a();
            adwq adwqVar = this.f;
            nsk nskVarB = nsl.b();
            p(nskVarB, ntxVarA, iA, aecsVar, adwqVar);
            final nsl nslVarA2 = nskVarB.a();
            final adat adatVar = new adat(xgnVar2);
            aeblVar = this;
            avmmVar = avmmVar5;
            nxw nxwVar2 = new nxw() { // from class: aebj
                @Override // defpackage.nxw
                public final fgy a(fhd fhdVar, nsl nslVar) {
                    aebl aeblVar2 = this.a;
                    aeblVar2.g.b();
                    boolean z4 = aeblVar2.c;
                    nsl nslVarA3 = nslVarA2;
                    if (z4) {
                        Integer num = nslVar.c;
                        Integer num2 = nslVar.d;
                        if (num != null || num2 != null) {
                            nsk nskVar = new nsk(nslVarA3);
                            if (num != null) {
                                nskVar.a = num;
                            }
                            if (num2 != null) {
                                nskVar.b = num2;
                            }
                            nslVarA3 = nskVar.a();
                        }
                    }
                    avmm avmmVar6 = avmmVar;
                    nth nthVar = adatVar;
                    acxm acxmVar4 = acxmVar3;
                    return aeblVar2.k.b(fhdVar, nslVarA3, acxmVar4, nthVar, avmmVar6);
                }
            };
            acxmVar = acxmVar3;
            nxvVar = new nxv(nxwVar2);
            nslVarA = nsl.a;
        } else {
            acxmVar = acxmVar3;
            avmmVar = avmmVar5;
            aeblVar = this;
            nxvVar = new nxv(new aebk(aeblVar, ntwVarB, iA, acxmVar, avmmVar, 0));
            nslVarA = nsl.b().a();
        }
        nxv nxvVar2 = nxvVar;
        boolean z4 = aeblVar.c;
        fof fofVar2 = aeblVar.m;
        if (z4) {
            nyi nyiVar = new nyi(fofVar2, new nyk());
            nyk nykVar = nyiVar.a;
            nykVar.c = nslVarA;
            BitSet bitSet = nyiVar.d;
            bitSet.set(1);
            nykVar.b = nxvVar2;
            bitSet.set(0);
            nykVar.a = Boolean.TRUE;
            fgyVarA = nyiVar.a();
        } else {
            nyf nyfVar2 = new nyf(fofVar2, new nyh());
            nyfVar2.e(nslVarA);
            nyfVar2.d(nxvVar2);
            nyfVar2.c(Boolean.TRUE);
            fgyVarA = nyfVar2.a();
        }
        avmm avmmVar6 = aeblVar.d;
        if (avmmVar6 != null) {
            avmmVar6.c(avmmVar);
            aeblVar.d.c(new avmq(new acem(nxvVar2, 3)));
        }
        fly flyVar = new fly();
        flyVar.d(ntt.class, nttVar);
        flyVar.d(mlf.class, acxmVar.a());
        fqc fqcVar2 = new fqc();
        if (aecsVar != 0 && aecsVar.h() && z) {
            z2 = true;
        }
        fqcVar2.b(z2);
        mlf mlfVarA = acxmVar.a();
        fqcVar2.b = fgyVarA;
        return new nye(new fqe(fqcVar2), avmmVar, flyVar, mlfVarA, nxvVar2);
    }

    private final void r() {
        AtomicBoolean atomicBoolean;
        adwq adwqVar = this.f;
        if (adwqVar == null || (atomicBoolean = adwqVar.c) == null || !atomicBoolean.get()) {
            this.a.V(true, null);
            return;
        }
        if (this.j) {
            return;
        }
        boolean zPost = this.C.post(this.z);
        this.j = zPost;
        if (zPost) {
            return;
        }
        r();
    }

    @Override // defpackage.qa
    public final void A(int i, int i2) {
        if (this.i) {
            o(i, i2);
        }
        ArrayList arrayList = new ArrayList(i2);
        int i3 = i2 + i;
        for (int i4 = i; i4 < i3; i4++) {
            arrayList.add(q(i4));
        }
        fsy fsyVar = this.a;
        fsyVar.R(i, arrayList);
        lqa lqaVar = this.l;
        if (lqaVar != null) {
            lqaVar.K(fsyVar);
        }
        r();
    }

    @Override // defpackage.qa
    public final void fQ() {
        avmm avmmVar;
        ArrayList arrayList;
        if (this.i) {
            o(0, this.a.h());
        } else if (this.B && (avmmVar = this.d) != null) {
            avmmVar.b();
        }
        admo admoVar = this.n;
        ArrayList<ftg> arrayList2 = new ArrayList(admoVar.a());
        int iA = admoVar.a();
        for (int i = 0; i < iA; i++) {
            arrayList2.add(q(i));
        }
        fsy fsyVar = this.a;
        synchronized (fsyVar) {
            if (fsyVar.L) {
                throw new RuntimeException("Trying to do a sync replaceAll when using asynchronous mutations!");
            }
            List list = fsyVar.b;
            arrayList = new ArrayList(list);
            list.clear();
            if (fna.I) {
                fsyVar.r.clear();
            }
            for (ftg ftgVar : arrayList2) {
                list.add(fsyVar.t(ftgVar));
                fsyVar.Q.b(ftgVar);
            }
            arrayList2.size();
        }
        fsyVar.f.jW();
        fsyVar.N.c(true);
        fsyVar.I(arrayList);
        lqa lqaVar = this.l;
        if (lqaVar != null) {
            lqaVar.K(fsyVar);
        }
        r();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.qa
    public final void fS(int i, int i2) {
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = i; i3 < i + i2; i3++) {
            arrayList.add(q(i3));
        }
        fsy fsyVar = this.a;
        fsyVar.A(i, arrayList);
        lqa lqaVar = this.l;
        if (lqaVar != null) {
            ?? r0 = lqaVar.a;
            for (Map.Entry entry : r0.entrySet()) {
                if (((Integer) entry.getValue()).intValue() >= i) {
                    r0.put((ftg) entry.getKey(), Integer.valueOf(((Integer) entry.getValue()).intValue() + i2));
                }
            }
            for (int i4 = 0; i4 < i2; i4++) {
                int i5 = i + i4;
                ftg ftgVarN = fsyVar.n(i5);
                if (ftgVarN != null) {
                    r0.put(ftgVarN, Integer.valueOf(i5));
                }
            }
        }
        r();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.qa
    public final void fT(final int i, final int i2) {
        if (this.i) {
            o(i, i2);
        }
        this.a.M(i, i2);
        lqa lqaVar = this.l;
        if (lqaVar != null) {
            ?? r0 = lqaVar.a;
            Collection.EL.removeIf(r0.entrySet(), new Predicate() { // from class: aebo
                public final /* synthetic */ Predicate and(Predicate predicate) {
                    return Predicate$CC.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* JADX INFO: renamed from: negate */
                public final /* synthetic */ Predicate mo841negate() {
                    return Predicate$CC.$default$negate(this);
                }

                public final /* synthetic */ Predicate or(Predicate predicate) {
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    int iIntValue = ((Integer) ((Map.Entry) obj).getValue()).intValue();
                    int i3 = i;
                    return iIntValue >= i3 && iIntValue < i3 + i2;
                }
            });
            for (Map.Entry entry : r0.entrySet()) {
                if (((Integer) entry.getValue()).intValue() >= i + i2) {
                    r0.put((ftg) entry.getKey(), Integer.valueOf(((Integer) entry.getValue()).intValue() - i2));
                }
            }
        }
        r();
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.qa
    public final void fU(int i, int i2) {
        if (i != i2) {
            fsy fsyVar = this.a;
            if (i < i2) {
                fsyVar.H(i, i2);
            } else {
                fsyVar.H(i, i2);
            }
            lqa lqaVar = this.l;
            if (lqaVar != null) {
                fsy fsyVar2 = this.a;
                int iMax = Math.max(i, i2) + 1;
                for (int iMin = Math.min(i, i2); iMin < iMax; iMin++) {
                    ftg ftgVarN = fsyVar2.n(iMin);
                    if (ftgVarN != null) {
                        lqaVar.a.put(ftgVarN, Integer.valueOf(iMin));
                    }
                }
            }
            r();
        }
    }

    public final void m() {
        if (this.j) {
            this.C.removeCallbacks(this.z);
            this.j = false;
        }
    }

    public final void o(int i, int i2) {
        fsy fsyVar = this.a;
        int iMin = Math.min(i2 + i, fsyVar.h());
        for (int iMax = Math.max(0, i); iMax < iMin; iMax++) {
            ftg ftgVarN = fsyVar.n(iMax);
            if (ftgVarN instanceof nye) {
                nye nyeVar = (nye) ftgVarN;
                nyeVar.b.dispose();
                nxv nxvVar = nyeVar.d;
                if (nxvVar != null) {
                    nxvVar.a = nxw.o;
                    nyeVar.d = null;
                }
            }
        }
    }

    public final void p(nsk nskVar, ntx ntxVar, int i, aecs aecsVar, adwq adwqVar) {
        nskVar.c = this.v.e(i, this.g);
        nskVar.i(this.w);
        nskVar.x = this.D;
        nskVar.e = this.x;
        nskVar.n = new AtomicReference(this.r);
        nskVar.e(false);
        nskVar.m(ntxVar);
        nskVar.f(aecsVar != null ? aecsVar.a() : 0);
        nskVar.r = aebp.d(adwqVar);
        nskVar.s = this.A;
    }
}
