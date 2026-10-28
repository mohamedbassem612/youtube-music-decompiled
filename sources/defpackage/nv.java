package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import app.rive.semantics.SemanticState;
import j$.util.DesugarCollections;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nv {
    public final ArrayList a;
    public ArrayList b;
    public final ArrayList c;
    public final List d;
    public int e;
    int f;
    public final /* synthetic */ RecyclerView g;
    public tgr h;

    public nv(RecyclerView recyclerView) {
        this.g = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.b = null;
        this.c = new ArrayList();
        this.d = DesugarCollections.unmodifiableList(arrayList);
        this.e = 2;
        this.f = 2;
    }

    public final int a(int i) {
        if (i >= 0) {
            RecyclerView recyclerView = this.g;
            if (i < recyclerView.O.a()) {
                return recyclerView.O.g ? recyclerView.g.a(i, 0) : i;
            }
        }
        StringBuilder sb = new StringBuilder("invalid position ");
        sb.append(i);
        sb.append(". State item count is ");
        RecyclerView recyclerView2 = this.g;
        sb.append(recyclerView2.O.a());
        sb.append(recyclerView2.o());
        throw new IndexOutOfBoundsException(sb.toString());
    }

    final void b(oh ohVar, boolean z) {
        RecyclerView.y(ohVar);
        RecyclerView recyclerView = this.g;
        View view = ohVar.a;
        oj ojVar = recyclerView.S;
        if (ojVar != null) {
            axx axxVarA = ojVar.a();
            bac.p(view, axxVarA instanceof oi ? (axx) ((oi) axxVarA).b.remove(view) : null);
        }
        if (z) {
            List list = recyclerView.o;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((nw) list.get(i)).a();
            }
            nh nhVar = recyclerView.m;
            if (nhVar != null) {
                nhVar.s(ohVar);
            }
            if (recyclerView.O != null) {
                recyclerView.aa.g(ohVar);
            }
        }
        ohVar.r = null;
        ohVar.q = null;
        p().m(ohVar);
    }

    public final void c() {
        this.a.clear();
        g();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Set] */
    public final void d() {
        RecyclerView recyclerView;
        nh nhVar;
        tgr tgrVar = this.h;
        if (tgrVar == null || (nhVar = (recyclerView = this.g).m) == null || !recyclerView.q) {
            return;
        }
        tgrVar.c.add(nhVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    public final void e(nh nhVar, boolean z) {
        tgr tgrVar = this.h;
        if (tgrVar == null) {
            return;
        }
        ?? r0 = tgrVar.c;
        r0.remove(nhVar);
        if (r0.size() != 0 || z) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = (SparseArray) tgrVar.b;
            if (i >= sparseArray.size()) {
                return;
            }
            ArrayList arrayList = ((nu) sparseArray.get(sparseArray.keyAt(i))).a;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                azx.d(((oh) arrayList.get(i2)).a);
            }
            i++;
        }
    }

    final void f(View view) {
        oh ohVarK = RecyclerView.k(view);
        ohVarK.m = null;
        ohVarK.n = false;
        ohVarK.i();
        j(ohVarK);
    }

    public final void g() {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                arrayList.clear();
                this.g.N.b();
                return;
            }
            h(size);
        }
    }

    public final void h(int i) {
        int i2 = RecyclerView.ad;
        ArrayList arrayList = this.c;
        b((oh) arrayList.get(i), true);
        arrayList.remove(i);
    }

    public final void i(View view) {
        oh ohVarK = RecyclerView.k(view);
        if (ohVarK.x()) {
            this.g.removeDetachedView(view, false);
        }
        if (ohVarK.w()) {
            ohVarK.p();
        } else if (ohVarK.B()) {
            ohVarK.i();
        }
        j(ohVarK);
        RecyclerView recyclerView = this.g;
        if (recyclerView.E == null || ohVarK.u()) {
            return;
        }
        recyclerView.E.b(ohVarK);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002c  */
    final void j(oh ohVar) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        boolean z4 = false;
        if (!ohVar.w()) {
            View view = ohVar.a;
            if (view.getParent() == null) {
                if (ohVar.x()) {
                    throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + ohVar + this.g.o());
                }
                if (ohVar.A()) {
                    throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.".concat(this.g.o()));
                }
                if ((ohVar.j & 16) == 0) {
                    int i = bac.a;
                    if (view.hasTransientState()) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                RecyclerView recyclerView = this.g;
                nh nhVar = recyclerView.m;
                if ((nhVar != null && z && nhVar.u(ohVar)) || ohVar.u()) {
                    if (this.f <= 0 || ohVar.q(526)) {
                        z2 = false;
                    } else {
                        ArrayList arrayList = this.c;
                        int size = arrayList.size();
                        if (size >= this.f && size > 0) {
                            h(0);
                            size--;
                        }
                        if (size > 0 && !recyclerView.N.d(ohVar.c)) {
                            do {
                                size--;
                                if (size < 0) {
                                    break;
                                }
                            } while (recyclerView.N.d(((oh) arrayList.get(size)).c));
                            size++;
                        }
                        arrayList.add(size, ohVar);
                        z2 = true;
                    }
                    if (z2) {
                        z3 = false;
                    } else {
                        b(ohVar, true);
                    }
                    z4 = z2;
                } else {
                    z3 = false;
                }
                recyclerView.aa.g(ohVar);
                if (z4 || z3 || !z) {
                    return;
                }
                azx.d(view);
                ohVar.r = null;
                ohVar.q = null;
                return;
            }
        }
        StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
        sb.append(ohVar.w());
        sb.append(" isAttached:");
        sb.append(ohVar.a.getParent() != null);
        sb.append(this.g.o());
        throw new IllegalArgumentException(sb.toString());
    }

    final void k(View view) {
        nl nlVar;
        int i = RecyclerView.ad;
        oh ohVar = view == null ? null : ((nq) view.getLayoutParams()).c;
        if (!ohVar.q(12) && ohVar.y() && (nlVar = this.g.E) != null && !nlVar.i(ohVar, ohVar.d())) {
            if (this.b == null) {
                this.b = new ArrayList();
            }
            ohVar.o(this, true);
            this.b.add(ohVar);
            return;
        }
        if (ohVar.t() && !ohVar.v()) {
            RecyclerView recyclerView = this.g;
            if (!recyclerView.m.c) {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.".concat(recyclerView.o()));
            }
        }
        ohVar.o(this, false);
        this.a.add(ohVar);
    }

    public final void l(oh ohVar) {
        if (ohVar.n) {
            this.b.remove(ohVar);
        } else {
            this.a.remove(ohVar);
        }
        ohVar.m = null;
        ohVar.n = false;
        ohVar.i();
    }

    public final void m() {
        np npVar = this.g.n;
        this.f = this.e + (npVar != null ? npVar.mPrefetchMaxCountObserved : 0);
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0 || arrayList.size() <= this.f) {
                return;
            } else {
                h(size);
            }
        }
    }

    public final View n(int i) {
        return o(i, Long.MAX_VALUE).a;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x01df  */
    /* JADX WARN: Code duplicated, block: B:116:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:118:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:120:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:251:0x0489  */
    /* JADX WARN: Code duplicated, block: B:252:0x0491  */
    /* JADX WARN: Code duplicated, block: B:254:0x0497  */
    /* JADX WARN: Code duplicated, block: B:255:0x049f  */
    /* JADX WARN: Code duplicated, block: B:260:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:34:0x007c A[EDGE_INSN: B:34:0x007c->B:35:0x007d BREAK  A[LOOP:0: B:13:0x0024->B:19:0x003e]] */
    final oh o(int i, long j) {
        boolean z;
        oh ohVarJV;
        long j2;
        long j3;
        boolean z2;
        boolean z3;
        boolean z4;
        View view;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParamsGenerateLayoutParams;
        boolean z5;
        View view2;
        oh ohVar;
        int size;
        int iA;
        if (i >= 0) {
            RecyclerView recyclerView = this.g;
            if (i < recyclerView.O.a()) {
                if (recyclerView.O.g) {
                    ArrayList arrayList = this.b;
                    if (arrayList != null && (size = arrayList.size()) != 0) {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= size) {
                                if (recyclerView.m.c && (iA = recyclerView.g.a(i, 0)) > 0 && iA < recyclerView.m.a()) {
                                    long jC = recyclerView.m.c(iA);
                                    int i3 = 0;
                                    while (true) {
                                        if (i3 >= size) {
                                            ohVarJV = null;
                                            break;
                                        }
                                        oh ohVar2 = (oh) this.b.get(i3);
                                        if (!ohVar2.B() && ohVar2.e == jC) {
                                            ohVar2.f(32);
                                            ohVarJV = ohVar2;
                                            break;
                                        }
                                        i3++;
                                    }
                                } else {
                                    ohVarJV = null;
                                    break;
                                }
                            } else {
                                ohVarJV = (oh) this.b.get(i2);
                                if (!ohVarJV.B() && ohVarJV.c() == i) {
                                    ohVarJV.f(32);
                                    break;
                                }
                                i2++;
                            }
                        }
                    } else {
                        ohVarJV = null;
                        break;
                    }
                    z = ohVarJV != null;
                } else {
                    z = false;
                    ohVarJV = null;
                }
                if (ohVarJV == null) {
                    ArrayList arrayList2 = this.a;
                    int size2 = arrayList2.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= size2) {
                            lm lmVar = recyclerView.h;
                            List list = lmVar.b;
                            int size3 = list.size();
                            int i5 = 0;
                            while (true) {
                                if (i5 >= size3) {
                                    view2 = null;
                                    break;
                                }
                                view2 = (View) list.get(i5);
                                hhb hhbVar = lmVar.e;
                                oh ohVar3 = view2 == null ? null : ((nq) view2.getLayoutParams()).c;
                                if (ohVar3.c() == i && !ohVar3.t() && !ohVar3.v()) {
                                    break;
                                }
                                i5++;
                            }
                            if (view2 == null) {
                                ArrayList arrayList3 = this.c;
                                int size4 = arrayList3.size();
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= size4) {
                                        ohVarJV = null;
                                        break;
                                    }
                                    ohVar = (oh) arrayList3.get(i6);
                                    if (ohVar.t() || ohVar.c() != i || ohVar.r()) {
                                        i6++;
                                    } else {
                                        arrayList3.remove(i6);
                                    }
                                }
                            } else {
                                ohVarJV = ((nq) view2.getLayoutParams()).c;
                                lm lmVar2 = recyclerView.h;
                                int iB = lmVar2.e.B(view2);
                                if (iB < 0) {
                                    Objects.toString(view2);
                                    throw new IllegalArgumentException("view is not a child, cannot hide ".concat(view2.toString()));
                                }
                                ll llVar = lmVar2.a;
                                if (!llVar.f(iB)) {
                                    Objects.toString(view2);
                                    throw new RuntimeException("trying to unhide a view that was not hidden".concat(view2.toString()));
                                }
                                llVar.b(iB);
                                lmVar2.l(view2);
                                int iC = recyclerView.h.c(view2);
                                if (iC != -1) {
                                    recyclerView.h.h(iC);
                                    k(view2);
                                    ohVarJV.f(8224);
                                    break;
                                }
                                throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + ohVarJV + recyclerView.o());
                            }
                        } else {
                            ohVar = (oh) arrayList2.get(i4);
                            if (ohVar.B() || ohVar.c() != i || ohVar.t() || (!recyclerView.O.g && ohVar.v())) {
                                i4++;
                            } else {
                                ohVar.f(32);
                            }
                        }
                        ohVarJV = ohVar;
                        break;
                    }
                    if (ohVarJV != null) {
                        if (!ohVarJV.v()) {
                            int i7 = ohVarJV.c;
                            if (i7 < 0 || i7 >= recyclerView.m.a()) {
                                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + ohVarJV + recyclerView.o());
                            }
                            if (recyclerView.O.g || recyclerView.m.b(ohVarJV.c) == ohVarJV.f) {
                                nh nhVar = recyclerView.m;
                                if (!nhVar.c || ohVarJV.e == nhVar.c(ohVarJV.c)) {
                                    z = true;
                                }
                            }
                            ohVarJV.f(4);
                            if (ohVarJV.w()) {
                                recyclerView.removeDetachedView(ohVarJV.a, false);
                                ohVarJV.p();
                            } else if (ohVarJV.B()) {
                                ohVarJV.i();
                            }
                            j(ohVarJV);
                            ohVarJV = null;
                        } else if (recyclerView.O.g) {
                            z = true;
                        } else {
                            ohVarJV.f(4);
                            if (ohVarJV.w()) {
                                recyclerView.removeDetachedView(ohVarJV.a, false);
                                ohVarJV.p();
                            } else if (ohVarJV.B()) {
                                ohVarJV.i();
                            }
                            j(ohVarJV);
                            ohVarJV = null;
                        }
                    }
                }
                if (ohVarJV == null) {
                    int iA2 = recyclerView.g.a(i, 0);
                    if (iA2 < 0 || iA2 >= recyclerView.m.a()) {
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + iA2 + ").state:" + recyclerView.O.a() + recyclerView.o());
                    }
                    int iB2 = recyclerView.m.b(iA2);
                    nh nhVar2 = recyclerView.m;
                    j2 = 0;
                    if (nhVar2.c) {
                        long jC2 = nhVar2.c(iA2);
                        ArrayList arrayList4 = this.a;
                        int size5 = arrayList4.size() - 1;
                        while (true) {
                            if (size5 < 0) {
                                j3 = Long.MAX_VALUE;
                                ArrayList arrayList5 = this.c;
                                int size6 = arrayList5.size() - 1;
                                while (true) {
                                    if (size6 >= 0) {
                                        oh ohVar4 = (oh) arrayList5.get(size6);
                                        if (ohVar4.e != jC2 || ohVar4.r()) {
                                            size6--;
                                        } else {
                                            if (iB2 == ohVar4.f) {
                                                arrayList5.remove(size6);
                                                ohVarJV = ohVar4;
                                                break;
                                            }
                                            h(size6);
                                        }
                                    }
                                    ohVarJV = null;
                                    break;
                                }
                            }
                            j3 = Long.MAX_VALUE;
                            oh ohVar5 = (oh) arrayList4.get(size5);
                            if (ohVar5.e == jC2 && !ohVar5.B()) {
                                if (iB2 == ohVar5.f) {
                                    ohVar5.f(32);
                                    if (ohVar5.v() && !recyclerView.O.g) {
                                        ohVar5.m(2, 14);
                                    }
                                    ohVarJV = ohVar5;
                                    break;
                                }
                                arrayList4.remove(size5);
                                View view3 = ohVar5.a;
                                recyclerView.removeDetachedView(view3, false);
                                f(view3);
                            }
                            size5--;
                        }
                        if (ohVarJV != null) {
                            ohVarJV.c = iA2;
                            z = true;
                        }
                    } else {
                        j3 = Long.MAX_VALUE;
                    }
                    if (ohVarJV == null) {
                        oh ohVarI = p().i(iB2);
                        if (ohVarI != null) {
                            ohVarI.l();
                        }
                        ohVarJV = ohVarI;
                    }
                    if (ohVarJV == null) {
                        long jNanoTime = System.nanoTime();
                        if (j != j3) {
                            long j4 = this.h.h(iB2).c;
                            if (j4 != 0 && j4 + jNanoTime >= j) {
                                return null;
                            }
                        }
                        ohVarJV = recyclerView.m.jV(recyclerView, iB2);
                        RecyclerView recyclerViewL = RecyclerView.l(ohVarJV.a);
                        if (recyclerViewL != null) {
                            ohVarJV.b = new WeakReference(recyclerViewL);
                        }
                        long jNanoTime2 = System.nanoTime() - jNanoTime;
                        nu nuVarH = this.h.h(iB2);
                        nuVarH.c = tgr.o(nuVarH.c, jNanoTime2);
                    }
                } else {
                    j2 = 0;
                    j3 = Long.MAX_VALUE;
                }
                if (z && !recyclerView.O.g && ohVarJV.q(SemanticState.Multiline)) {
                    ohVarJV.m(0, SemanticState.Multiline);
                    if (recyclerView.O.j) {
                        nl.o(ohVarJV);
                        ohVarJV.d();
                        cwp cwpVar = new cwp();
                        cwpVar.b(ohVarJV);
                        recyclerView.aD(ohVarJV, cwpVar);
                    }
                }
                if (!recyclerView.O.g || !ohVarJV.s()) {
                    if (!ohVarJV.s() || ohVarJV.z() || ohVarJV.t()) {
                        int iA3 = recyclerView.g.a(i, 0);
                        ohVarJV.r = null;
                        ohVarJV.q = recyclerView;
                        int i8 = ohVarJV.f;
                        long jNanoTime3 = System.nanoTime();
                        if (j != j3) {
                            long j5 = this.h.h(i8).d;
                            if (j5 == j2 || j5 + jNanoTime3 < j) {
                            }
                        }
                        if (ohVarJV.x()) {
                            View view4 = ohVarJV.a;
                            recyclerView.attachViewToParent(view4, recyclerView.getChildCount(), view4.getLayoutParams());
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        nh nhVar3 = recyclerView.m;
                        boolean z6 = ohVarJV.r == null;
                        if (z6) {
                            ohVarJV.c = iA3;
                            if (nhVar3.c) {
                                ohVarJV.e = nhVar3.c(iA3);
                            }
                            ohVarJV.m(1, 519);
                            if (awt.a()) {
                                String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(ohVarJV.f));
                            }
                        }
                        ohVarJV.r = nhVar3;
                        nhVar3.p(ohVarJV, iA3, ohVarJV.d());
                        if (z6) {
                            ohVarJV.h();
                            ViewGroup.LayoutParams layoutParams2 = ohVarJV.a.getLayoutParams();
                            if (layoutParams2 instanceof nq) {
                                ((nq) layoutParams2).e = true;
                            }
                        }
                        if (z2) {
                            recyclerView.detachViewFromParent(ohVarJV.a);
                        }
                        long jNanoTime4 = System.nanoTime() - jNanoTime3;
                        nu nuVarH2 = this.h.h(ohVarJV.f);
                        nuVarH2.d = tgr.o(nuVarH2.d, jNanoTime4);
                        if (recyclerView.at()) {
                            View view5 = ohVarJV.a;
                            z3 = true;
                            if (view5.getImportantForAccessibility() == 0) {
                                view5.setImportantForAccessibility(1);
                            }
                            oj ojVar = recyclerView.S;
                            if (ojVar != null) {
                                axx axxVarA = ojVar.a();
                                if (axxVarA instanceof oi) {
                                    oi oiVar = (oi) axxVarA;
                                    axx axxVarC = bac.c(view5);
                                    if (axxVarC != null && axxVarC != oiVar) {
                                        oiVar.b.put(view5, axxVarC);
                                    }
                                }
                                bac.p(view5, axxVarA);
                            }
                        } else {
                            z3 = true;
                        }
                        if (recyclerView.O.g) {
                            ohVarJV.g = i;
                        }
                        z4 = z3;
                    }
                    view = ohVarJV.a;
                    layoutParams = view.getLayoutParams();
                    if (layoutParams == null) {
                        layoutParamsGenerateLayoutParams = recyclerView.generateDefaultLayoutParams();
                        view.setLayoutParams(layoutParamsGenerateLayoutParams);
                    } else if (recyclerView.checkLayoutParams(layoutParams)) {
                        layoutParamsGenerateLayoutParams = (nq) layoutParams;
                    } else {
                        layoutParamsGenerateLayoutParams = recyclerView.generateLayoutParams(layoutParams);
                        view.setLayoutParams(layoutParamsGenerateLayoutParams);
                    }
                    nq nqVar = (nq) layoutParamsGenerateLayoutParams;
                    nqVar.c = ohVarJV;
                    if (z || !z4) {
                        z5 = false;
                    } else {
                        z5 = z3;
                    }
                    nqVar.f = z5;
                    return ohVarJV;
                }
                ohVarJV.g = i;
                z4 = false;
                z3 = true;
                view = ohVarJV.a;
                layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    layoutParamsGenerateLayoutParams = recyclerView.generateDefaultLayoutParams();
                    view.setLayoutParams(layoutParamsGenerateLayoutParams);
                } else if (recyclerView.checkLayoutParams(layoutParams)) {
                    layoutParamsGenerateLayoutParams = recyclerView.generateLayoutParams(layoutParams);
                    view.setLayoutParams(layoutParamsGenerateLayoutParams);
                } else {
                    layoutParamsGenerateLayoutParams = (nq) layoutParams;
                }
                nq nqVar2 = (nq) layoutParamsGenerateLayoutParams;
                nqVar2.c = ohVarJV;
                if (z) {
                    z5 = false;
                } else {
                    z5 = false;
                }
                nqVar2.f = z5;
                return ohVarJV;
            }
        }
        StringBuilder sb = new StringBuilder("Invalid item position ");
        sb.append(i);
        sb.append('(');
        sb.append(i);
        sb.append("). Item count:");
        RecyclerView recyclerView2 = this.g;
        sb.append(recyclerView2.O.a());
        sb.append(recyclerView2.o());
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final tgr p() {
        if (this.h == null) {
            this.h = new tgr((byte[]) null);
            d();
        }
        return this.h;
    }
}
