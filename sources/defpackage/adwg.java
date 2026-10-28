package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.elements.converters.layout.FlowLayoutManager;
import j$.util.Collection;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class adwg extends adsr implements aecq {
    public static final advz aw = new advx();
    private final admh a;
    private aecw aA;
    private pv aB;
    private final boolean aC;
    private final boolean aD;
    private np aE;
    private adwb aF;
    public final boolean ax;
    public int ay;
    public final adsu az;
    private final adwd b;
    private final advz c;
    private advy d;
    private adwf e;
    private int f;
    private final avmn g;
    private apod h;

    /* JADX WARN: Code duplicated, block: B:18:0x0065  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c3  */
    public adwg(adwh adwhVar) {
        boolean z;
        super(adwhVar.a);
        this.a = adwhVar.b;
        this.c = adwhVar.c;
        this.f = ((RecyclerView) adwhVar.a.b).getResources().getConfiguration().smallestScreenWidthDp;
        adwt adwtVar = adwhVar.a;
        vxz vxzVar = adwtVar.C;
        vxz vxzVar2 = adwtVar.D;
        avlh avlhVar = adwhVar.d;
        this.aC = vxzVar != null && vxzVar.l(278, 45681011L, false);
        this.az = new adsu();
        this.aD = vxzVar2 != null && vxzVar2.l(25, 45718912L, false);
        tqj tqjVar = adwhVar.a.w;
        if (tqjVar != null) {
            int i = tqr.a;
            z = tqjVar.k(1073840111);
        }
        this.ax = z;
        int i2 = 17;
        if (avlhVar != null) {
            this.g = avlhVar.x(new ifu(this, 7)).ak(new acae(this, i2));
        } else {
            this.g = null;
        }
        adlq adlqVar = this.j;
        adwd adwdVar = new adwd(adlqVar);
        this.b = adwdVar;
        adlqVar.h(adwdVar);
        vyo vyoVar = adwhVar.a.n;
        if (vyoVar.b() == null) {
            ((RecyclerView) this.l).setOnHierarchyChangeListener(new xgq(adwhVar.a.j));
        } else {
            amuh amuhVar = vyoVar.b().n;
            amdz amdzVar = (amuhVar == null ? amuh.a : amuhVar).d;
            if (!(amdzVar == null ? amdz.a : amdzVar).f) {
                amuh amuhVar2 = vyoVar.b().n;
                amdz amdzVar2 = (amuhVar2 == null ? amuh.a : amuhVar2).d;
                if (!(amdzVar2 == null ? amdz.a : amdzVar2).g) {
                    ((RecyclerView) this.l).setOnHierarchyChangeListener(new xgq(adwhVar.a.j));
                }
            }
            ((RecyclerView) this.l).setOnHierarchyChangeListener(new adte(new xgq(adwhVar.a.j), new wix(i2)));
        }
        ((admo) this.m).e = adwhVar.a.n;
    }

    public static adwb aO(np npVar) {
        if (npVar != null) {
            if (npVar instanceof GridLayoutManager) {
                return new adwa((GridLayoutManager) npVar, 0);
            }
            if (npVar instanceof LinearLayoutManager) {
                return new adwc((LinearLayoutManager) npVar);
            }
            if (npVar instanceof FlowLayoutManager) {
                return new adwa((FlowLayoutManager) npVar, 1);
            }
        }
        return new adwe();
    }

    private final void k() {
        adwf adwfVar = this.e;
        if (adwfVar == null) {
            adwfVar = new adwf(this);
            this.e = adwfVar;
        }
        ((RecyclerView) this.l).aC(adwfVar);
    }

    private final void l(Runnable runnable) {
        vxz vxzVar = this.aa;
        if (vxzVar != null && vxzVar.l(100, 45830964L, false)) {
            RecyclerView recyclerView = (RecyclerView) this.l;
            if (recyclerView.n != null && !recyclerView.au()) {
                runnable.run();
                return;
            }
        }
        ((RecyclerView) this.l).post(runnable);
    }

    private final void q() {
        RecyclerView recyclerView = (RecyclerView) this.l;
        if (recyclerView.n == null || ((admo) this.m).a() <= 0) {
            return;
        }
        recyclerView.ab(0);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:104:0x0200  */
    /* JADX WARN: Code duplicated, block: B:105:0x0202  */
    /* JADX WARN: Code duplicated, block: B:109:0x022d  */
    /* JADX WARN: Code duplicated, block: B:113:0x0258 A[LOOP:9: B:111:0x0252->B:113:0x0258, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:116:0x0267  */
    /* JADX WARN: Code duplicated, block: B:119:0x0065 A[EDGE_INSN: B:119:0x0065->B:33:0x0065 BREAK  A[LOOP:0: B:26:0x003b->B:32:0x0062], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x007f A[EDGE_INSN: B:122:0x007f->B:40:0x007f BREAK  A[LOOP:2: B:37:0x006c->B:39:0x0075], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x0043  */
    /* JADX WARN: Code duplicated, block: B:31:0x0054 A[LOOP:1: B:29:0x004a->B:31:0x0054, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x0075 A[LOOP:2: B:37:0x006c->B:39:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:42:0x0083  */
    /* JADX WARN: Code duplicated, block: B:43:0x008d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0094 A[LOOP:10: B:44:0x0092->B:45:0x0094, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00dd A[LOOP:5: B:55:0x00d7->B:57:0x00dd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:61:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:64:0x010e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0122 A[LOOP:8: B:65:0x011c->B:67:0x0122, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:71:0x013b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0144  */
    /* JADX WARN: Code duplicated, block: B:75:0x0154  */
    /* JADX WARN: Code duplicated, block: B:93:0x018d  */
    /* JADX WARN: Code duplicated, block: B:96:0x0198  */
    @Override // defpackage.adsr
    public final void M(boolean z) {
        int i;
        int i2;
        int i3;
        List list;
        Executor executor;
        int size;
        int i4;
        adxz adxzVar;
        adlq adlqVar;
        adkz adkzVar;
        vxz vxzVar;
        Optional optional;
        vxz vxzVar2;
        Iterator it;
        Iterator it2;
        Iterator it3;
        Iterator it4;
        Iterator it5;
        Iterator it6;
        Object obj;
        int i5;
        tbm tbmVar;
        advc advcVar;
        int i6;
        int i7 = 0;
        this.T = false;
        this.Q = false;
        if (z) {
            i = this.M == null ? 0 : 1;
            if (this.R) {
                i++;
            }
        } else {
            i = 0;
        }
        vxz vxzVar3 = this.Z;
        boolean z2 = vxzVar3 != null && vxzVar3.l(470, 45810673L, false);
        ArrayList arrayList = new ArrayList();
        if (z) {
            if (this.R) {
                i2 = 1;
            } else {
                i2 = 0;
                i3 = 1;
            }
            while (true) {
                list = this.n;
                if (i2 < list.size()) {
                    break;
                }
                advcVar = (advc) list.get(i2);
                for (i6 = 0; i6 < advcVar.a().a(); i6++) {
                    adsr.P(advcVar.a().d(i6), arrayList, z2);
                }
                i2++;
            }
            if (i3 == 0 && (obj = this.M) != null) {
                i5 = 0;
                while (true) {
                    tbmVar = (tbm) obj;
                    if (i5 < tbmVar.size()) {
                        break;
                    }
                    adsr.P(tbmVar.get(i5), arrayList, z2);
                    i5++;
                }
            }
            executor = this.B;
            if (executor != null) {
                executor.execute(new acem(arrayList, 2));
            } else {
                size = arrayList.size();
                for (i4 = 0; i4 < size; i4++) {
                    ((acxm) arrayList.get(i4)).d();
                }
            }
            adxzVar = this.F;
            if (adxzVar != null) {
                it = adxzVar.d.values().iterator();
                while (it.hasNext()) {
                    it5 = ((Map) it.next()).values().iterator();
                    while (it5.hasNext()) {
                        it6 = ((Map) it5.next()).keySet().iterator();
                        while (it6.hasNext()) {
                            adxz.f(it6.next());
                        }
                    }
                }
                adxzVar.d.clear();
                it2 = adxzVar.e.values().iterator();
                while (it2.hasNext()) {
                    it3 = ((Map) it2.next()).values().iterator();
                    while (it3.hasNext()) {
                        it4 = ((Map) it3.next()).keySet().iterator();
                        while (it4.hasNext()) {
                            adxz.f(it4.next());
                        }
                    }
                }
                adxzVar.e.clear();
                adxzVar.f.clear();
                adxzVar.g = null;
            }
            adlqVar = this.j;
            if (i > 0) {
                adlqVar.s(i, adlqVar.g() - 1);
            } else {
                adlqVar.t();
            }
            if (this.x.h()) {
                vxzVar2 = this.aa;
                boolean z3 = (vxzVar2 == null && vxzVar2.l(13, 45707990L, false)) || super.al();
                if (vxzVar2 == null && vxzVar2.l(91, 45822765L, false) && z3 && z && this.R) {
                    adlq adlqVar2 = this.k;
                    if (adlqVar2.g() > 0) {
                        adlqVar2.s(1, adlqVar2.g() - 1);
                    } else {
                        this.k.t();
                    }
                } else {
                    this.k.t();
                }
            }
            this.U = null;
            adkzVar = this.N;
            if (adkzVar != null) {
                this.j.m(-1, adkzVar, true);
            }
            vxzVar = this.aa;
            if (vxzVar == null && vxzVar.l(13, 45707990L, false)) {
                super.ab(i);
                list.subList(i, list.size()).clear();
                List list2 = this.o;
                list2.subList(i, list2.size()).clear();
                agke agkeVar = (agke) Collection.EL.stream(list).flatMap(new accu(16)).collect(aghu.a);
                Collection.EL.removeIf(this.p.keySet(), new aciy(agkeVar, 10));
                Collection.EL.removeIf(this.q.q(), new aciy(agkeVar, 11));
            } else if (super.al()) {
                if (z && this.R) {
                    i7 = 1;
                }
                super.ab(i7);
                list.subList(i7, list.size()).clear();
                List list3 = this.o;
                list3.subList(i7, list3.size()).clear();
                this.p.clear();
                this.q.r();
            } else {
                super.ab(0);
                list.clear();
                this.o.clear();
                this.p.clear();
                this.q.r();
            }
            this.S = "";
            ag(null);
            z();
            for (aecm aecmVar : this.w) {
            }
            optional = this.z;
            if (true == optional.isPresent()) {
                ((HashMap) ((lqa) optional.get()).a).clear();
            }
            this.b.b();
        }
        i2 = 0;
        i3 = i2;
        while (true) {
            list = this.n;
            if (i2 < list.size()) {
                break;
                break;
            }
            advcVar = (advc) list.get(i2);
            while (i6 < advcVar.a().a()) {
                adsr.P(advcVar.a().d(i6), arrayList, z2);
            }
            i2++;
        }
        if (i3 == 0) {
            i5 = 0;
            while (true) {
                tbmVar = (tbm) obj;
                if (i5 < tbmVar.size()) {
                    break;
                    break;
                } else {
                    adsr.P(tbmVar.get(i5), arrayList, z2);
                    i5++;
                }
            }
        }
        executor = this.B;
        if (executor != null) {
            executor.execute(new acem(arrayList, 2));
        } else {
            size = arrayList.size();
            while (i4 < size) {
                ((acxm) arrayList.get(i4)).d();
            }
        }
        adxzVar = this.F;
        if (adxzVar != null) {
            it = adxzVar.d.values().iterator();
            while (it.hasNext()) {
                it5 = ((Map) it.next()).values().iterator();
                while (it5.hasNext()) {
                    it6 = ((Map) it5.next()).keySet().iterator();
                    while (it6.hasNext()) {
                        adxz.f(it6.next());
                    }
                }
            }
            adxzVar.d.clear();
            it2 = adxzVar.e.values().iterator();
            while (it2.hasNext()) {
                it3 = ((Map) it2.next()).values().iterator();
                while (it3.hasNext()) {
                    it4 = ((Map) it3.next()).keySet().iterator();
                    while (it4.hasNext()) {
                        adxz.f(it4.next());
                    }
                }
            }
            adxzVar.e.clear();
            adxzVar.f.clear();
            adxzVar.g = null;
        }
        adlqVar = this.j;
        if (i > 0) {
            adlqVar.s(i, adlqVar.g() - 1);
        } else {
            adlqVar.t();
        }
        if (this.x.h()) {
            vxzVar2 = this.aa;
            if (vxzVar2 == null) {
            }
            if (vxzVar2 == null) {
                this.k.t();
            } else {
                this.k.t();
            }
        }
        this.U = null;
        adkzVar = this.N;
        if (adkzVar != null) {
            this.j.m(-1, adkzVar, true);
        }
        vxzVar = this.aa;
        if (vxzVar == null) {
            if (super.al()) {
                if (z) {
                    i7 = 1;
                }
                super.ab(i7);
                list.subList(i7, list.size()).clear();
                List list4 = this.o;
                list4.subList(i7, list4.size()).clear();
                this.p.clear();
                this.q.r();
            } else {
                super.ab(0);
                list.clear();
                this.o.clear();
                this.p.clear();
                this.q.r();
            }
        } else if (super.al()) {
            if (z) {
                i7 = 1;
            }
            super.ab(i7);
            list.subList(i7, list.size()).clear();
            List list5 = this.o;
            list5.subList(i7, list5.size()).clear();
            this.p.clear();
            this.q.r();
        } else {
            super.ab(0);
            list.clear();
            this.o.clear();
            this.p.clear();
            this.q.r();
        }
        this.S = "";
        ag(null);
        z();
        while (r15.hasNext()) {
        }
        optional = this.z;
        if (true == optional.isPresent()) {
            ((HashMap) ((lqa) optional.get()).a).clear();
        }
        this.b.b();
    }

    @Override // defpackage.adsr
    protected final void S() {
        admh admhVar = this.a;
        if (admhVar instanceof admk) {
            ((RecyclerView) this.l).aI(((admk) admhVar).f());
        }
        advz advzVar = this.c;
        View view = this.l;
        Object obj = this.m;
        RecyclerView recyclerView = (RecyclerView) view;
        advy advyVarA = advzVar.a(recyclerView, (admo) obj, I());
        this.d = advyVarA;
        if (advyVarA != null) {
            advyVarA.a(recyclerView);
        } else {
            nh nhVar = (nh) obj;
            recyclerView.ad(nhVar);
            nhVar.jW();
        }
        vxz vxzVar = this.Z;
        if (vxzVar == null || !vxzVar.l(270, 45675808L, false)) {
            k();
        }
        if (this.h != null) {
            np npVar = recyclerView.n;
            this.aA = new aecw(this, (npVar instanceof FlowLayoutManager) || (npVar instanceof GridLayoutManager));
            pv pvVar = new pv(this.aA);
            this.aB = pvVar;
            pvVar.o(recyclerView);
            recyclerView.setTag(R.id.elements_item_touch_helper, this.aB);
        }
        if (vxzVar != null && vxzVar.l(270, 45675808L, false)) {
            k();
        }
        Optional optional = this.z;
        hkp hkpVar = new hkp(this, 20);
        if (true == optional.isPresent()) {
            Object obj2 = optional.get();
            Object obj3 = hkpVar.a;
            adsr adsrVar = (adsr) obj3;
            RecyclerView recyclerView2 = (RecyclerView) adsrVar.l;
            DisplayMetrics displayMetrics = recyclerView2.getResources().getDisplayMetrics();
            adwg adwgVar = (adwg) obj3;
            vxz vxzVar2 = adwgVar.aa;
            recyclerView2.aJ(new aduj(adsrVar.m, (lqa) obj2, displayMetrics, adwgVar.x, vxzVar2 != null && vxzVar2.l(77, 45802733L, false)));
        }
    }

    public final adwb aP(np npVar) {
        adwb adwbVar;
        vxz vxzVar = this.Z;
        if (vxzVar == null || !vxzVar.l(509, 45833727L, false)) {
            return aO(npVar);
        }
        if (npVar == null) {
            return new adwe();
        }
        if (npVar == this.aE && (adwbVar = this.aF) != null) {
            return adwbVar;
        }
        this.aE = npVar;
        adwb adwbVarAO = aO(npVar);
        this.aF = adwbVarAO;
        return adwbVarAO;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00a7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    public final void aQ() {
        aobx aobxVar;
        adlq adlqVar;
        Object objD;
        View view = this.l;
        if (view != null) {
            acjw acjwVar = acjw.b;
            if (o(acjwVar)) {
                RecyclerView recyclerView = (RecyclerView) view;
                np npVar = recyclerView.n;
                if (((npVar instanceof GridLayoutManager) || (npVar instanceof LinearLayoutManager) || (npVar instanceof FlowLayoutManager)) && (aobxVar = (aobx) aawb.ag(hQ(acjwVar), aobx.class)) != null && aobxVar.g) {
                    if (aobxVar.c == 8 && ((Boolean) aobxVar.d).booleanValue()) {
                        aq();
                        return;
                    }
                    if (aobxVar.c != 9 || recyclerView.n == null) {
                        return;
                    }
                    int iA = ((admo) this.m).a() - 1;
                    adwb adwbVarAP = aP(recyclerView.n);
                    boolean z = this.aD;
                    int iC = z ? adwbVarAP.c() : adwbVarAP.b();
                    if (z && iC == -1) {
                        return;
                    }
                    int iIntValue = aobxVar.c == 9 ? ((Integer) aobxVar.d).intValue() : 0;
                    int i = iA - iC;
                    Optional optional = this.z;
                    if (!optional.isEmpty()) {
                        vxz vxzVar = this.aa;
                        if (vxzVar != null && vxzVar.l(65, 45791420L, false)) {
                            np npVar2 = recyclerView.n;
                            if ((npVar2 instanceof FlowLayoutManager) || (npVar2 instanceof GridLayoutManager)) {
                                if ((i << 1) > iIntValue) {
                                    return;
                                }
                            } else {
                                if (i <= iIntValue) {
                                    return;
                                }
                                if ((i << 1) > iIntValue) {
                                    adlqVar = this.j;
                                    while (iC < iA) {
                                        objD = adlqVar.d(iC);
                                        if (objD != null) {
                                            ((lqa) optional.get()).S(objD);
                                        }
                                        iC++;
                                    }
                                    if (i > iIntValue) {
                                        return;
                                    }
                                }
                            }
                        } else {
                            if (i <= iIntValue) {
                                return;
                            }
                            if ((i << 1) > iIntValue) {
                                adlqVar = this.j;
                                while (iC < iA) {
                                    objD = adlqVar.d(iC);
                                    if (objD != null) {
                                        ((lqa) optional.get()).S(objD);
                                    }
                                    iC++;
                                }
                                if (i > iIntValue) {
                                    return;
                                }
                            }
                        }
                    } else if (i > iIntValue) {
                        return;
                    }
                    aq();
                }
            }
        }
    }

    @Override // defpackage.aecq
    public final boolean aR(int i, int i2) {
        vxz vxzVar;
        adlo adloVarV;
        adlo adloVarAn;
        adkz adkzVar;
        adkz adkzVar2;
        advc advcVar;
        apod apodVar = this.h;
        if (apodVar == null) {
            return false;
        }
        apoe apoeVar = apodVar.c;
        if (apoeVar == null) {
            apoeVar = apoe.a;
        }
        int iAS = a.aS(apoeVar.b);
        if (iAS == 0 || iAS != 2 || (vxzVar = this.Z) == null || !vxzVar.l(240, 45663528L, false) || i == i2) {
            return false;
        }
        if (this.x.h()) {
            adloVarAn = super.an(i);
            adloVarV = super.an(i2);
            i = super.w(i);
            i2 = super.w(i2);
        } else {
            adlq adlqVar = this.j;
            adlo adloVarV2 = adlqVar.v(i);
            adloVarV = adlqVar.v(i2);
            adloVarAn = adloVarV2;
        }
        if (adloVarAn == null || adloVarV == null || (adkzVar2 = adloVarAn.a) != (adkzVar = adloVarV.a)) {
            return false;
        }
        Iterator it = this.n.iterator();
        do {
            if (!it.hasNext()) {
                advcVar = null;
                break;
            }
            advcVar = (advc) it.next();
        } while (advcVar.a() != adkzVar2);
        if (!(advcVar instanceof advj)) {
            return false;
        }
        int iB = adloVarAn.b(i);
        int iB2 = adloVarV.b(i2);
        if (iB < 0 || iB2 < 0 || iB >= adkzVar2.a() || iB2 >= adkzVar.a()) {
            return false;
        }
        ((advj) advcVar).R(iB, iB2);
        return true;
    }

    @Override // defpackage.adsr
    protected final void aa(Bundle bundle) {
        if (bundle == null) {
            q();
            return;
        }
        int i = bundle.getInt("scroll_position", 0);
        if (i > 0) {
            af(i);
        } else {
            q();
        }
    }

    @Override // defpackage.adsr
    protected final void af(int i) {
        l(new rir(this, i, 18));
    }

    @Override // defpackage.adsr
    protected final void ai(int i, int i2) {
        l(new yuj(this, i, i2, 5));
    }

    @Override // defpackage.adsr
    public final void at(wgd wgdVar) {
        View view;
        nh nhVar;
        if (super.au(wgdVar, false) && (view = this.l) != null && (nhVar = ((RecyclerView) view).m) != null) {
            nhVar.jW();
        }
        vxz vxzVar = this.Z;
        if (vxzVar != null && vxzVar.l(240, 45663528L, false) && wgdVar != null) {
            apoq apoqVar = wgdVar.a;
            if ((apoqVar.c & 1073741824) != 0) {
                apod apodVar = apoqVar.v;
                if (apodVar == null) {
                    apodVar = apod.a;
                }
                if ((apodVar.b & 1) != 0) {
                    apod apodVar2 = apoqVar.v;
                    if (apodVar2 == null) {
                        apodVar2 = apod.a;
                    }
                    this.h = apodVar2;
                }
            }
        }
        this.b.b();
    }

    @Override // defpackage.adtv
    protected final /* bridge */ /* synthetic */ void hs(Object obj, acjx acjxVar) {
        Y((wgd) obj, acjxVar);
    }

    @Override // defpackage.adsr, defpackage.adtv, defpackage.twn
    public void i() {
        super.i();
        advy advyVar = this.d;
        if (advyVar != null) {
            advyVar.b((RecyclerView) this.l);
            this.d = null;
        }
        vxz vxzVar = this.Z;
        if (vxzVar == null || !vxzVar.l(330, 45719181L, false)) {
            adwf adwfVar = this.e;
            if (adwfVar != null) {
                ((RecyclerView) this.l).aE(adwfVar);
            }
        } else {
            ((RecyclerView) this.l).A();
        }
        pv pvVar = this.aB;
        if (pvVar != null && this.aA != null) {
            pvVar.o((RecyclerView) null);
            this.aB = null;
            this.aA = null;
            ((RecyclerView) this.l).setTag(R.id.elements_item_touch_helper, null);
        }
        RecyclerView recyclerView = (RecyclerView) this.l;
        recyclerView.ad(null);
        recyclerView.aI(null);
        Object obj = this.g;
        if (obj != null) {
            awka.f((AtomicReference) obj);
        }
        this.aE = null;
        this.aF = null;
    }

    @Override // defpackage.advq
    public final int m() {
        return aP(((RecyclerView) this.l).n).c();
    }

    @Override // defpackage.adsr
    public void p(Configuration configuration) {
        int iA;
        if (this.ax) {
            np npVar = ((RecyclerView) this.l).n;
            if (((npVar instanceof GridLayoutManager) || (npVar instanceof LinearLayoutManager) || (npVar instanceof FlowLayoutManager)) && (iA = aP(npVar).a()) != -1) {
                this.ay = iA;
            }
        }
        Iterator it = this.n.iterator();
        while (it.hasNext()) {
            ((advc) it.next()).k(configuration);
        }
        if (this.f != configuration.smallestScreenWidthDp) {
            this.f = configuration.smallestScreenWidthDp;
            RecyclerView recyclerView = (RecyclerView) this.l;
            np npVar2 = recyclerView.n;
            recyclerView.ah(null);
            recyclerView.aG().k();
            recyclerView.ah(npVar2);
        }
        View view = this.l;
        vxz vxzVar = this.Z;
        RecyclerView recyclerView2 = (RecyclerView) view;
        np npVar3 = recyclerView2.n;
        boolean z = false;
        boolean z2 = vxzVar != null && vxzVar.l(231, 45660961L, false) && (npVar3 instanceof FlowLayoutManager) && ((FlowLayoutManager) npVar3).I;
        if (!this.aC && !z2) {
            z = true;
        }
        if (this.d == null || z) {
            ((nh) this.m).jW();
        }
        recyclerView2.post(new rir(this, this.ay, 17));
        advy advyVar = this.d;
        if (advyVar != null) {
            aebp aebpVar = (aebp) advyVar;
            if (configuration.orientation != aebpVar.d) {
                aebpVar.g = true;
                aebpVar.d = configuration.orientation;
            }
        }
    }
}
