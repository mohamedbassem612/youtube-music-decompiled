package defpackage;

import android.animation.Animator;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import j$.util.Objects;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class dsd implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    final dsa a;
    final ViewGroup b;

    public dsd(dsa dsaVar, ViewGroup viewGroup) {
        this.a = dsaVar;
        this.b = viewGroup;
    }

    private final void a() {
        ViewGroup viewGroup = this.b;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0208  */
    /* JADX WARN: Code duplicated, block: B:105:0x0228  */
    /* JADX WARN: Code duplicated, block: B:136:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:138:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:142:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:144:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:146:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:148:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:151:0x0307  */
    /* JADX WARN: Code duplicated, block: B:152:0x030d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:153:0x030f  */
    /* JADX WARN: Code duplicated, block: B:156:0x01d5 A[EDGE_INSN: B:156:0x01d5->B:88:0x01d5 BREAK  A[LOOP:1: B:19:0x007f->B:87:0x01cf], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x0047  */
    /* JADX WARN: Code duplicated, block: B:17:0x004e A[LOOP:0: B:16:0x004c->B:17:0x004e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:194:0x01f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:0x0212 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x02a5 A[EDGE_INSN: B:198:0x02a5->B:133:0x02a5 BREAK  A[LOOP:8: B:103:0x0224->B:212:0x0224], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x0085  */
    /* JADX WARN: Code duplicated, block: B:225:0x02c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0089 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x008b  */
    /* JADX WARN: Code duplicated, block: B:26:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0090  */
    /* JADX WARN: Code duplicated, block: B:29:0x009d  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:46:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:59:0x0143  */
    /* JADX WARN: Code duplicated, block: B:61:0x0150  */
    /* JADX WARN: Code duplicated, block: B:74:0x0198  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:91:0x01da  */
    /* JADX WARN: Code duplicated, block: B:93:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:98:0x01fa  */
    /* JADX WARN: Instruction removed from duplicated block: B:146:0x02e3, please report this as an issue */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ArrayList arrayList;
        dsa dsaVar;
        int i;
        kwq kwqVar;
        kwq kwqVar2;
        afv afvVar;
        afv afvVar2;
        int i2;
        int[] iArr;
        int i3;
        int i4;
        afv afvVarH;
        int i5;
        ArrayList arrayList2;
        int i6;
        drw drwVar;
        int i7;
        dsa dsaVar2;
        Animator animator;
        gmj gmjVar;
        Object obj;
        dsk dskVar;
        dsk dskVar2;
        int i8;
        int i9;
        int i10;
        View view;
        dsk dskVar3;
        aha ahaVar;
        int i11;
        int i12;
        View view2;
        SparseArray sparseArray;
        int size;
        int i13;
        View view3;
        agk agkVar;
        int iC;
        int i14;
        View view4;
        int i15;
        int size2;
        int i16;
        a();
        ArrayList arrayList3 = dse.a;
        ViewGroup viewGroup = this.b;
        int i17 = 1;
        if (!arrayList3.remove(viewGroup)) {
            return true;
        }
        afv afvVarA = dse.a();
        ArrayList arrayList4 = (ArrayList) afvVarA.get(viewGroup);
        if (arrayList4 != null) {
            arrayList = arrayList4.size() > 0 ? new ArrayList(arrayList4) : null;
            dsaVar = this.a;
            arrayList4.add(dsaVar);
            dsaVar.D(new dsc(this, afvVarA));
            i = 0;
            dsaVar.p(viewGroup, false);
            if (arrayList != null) {
                size2 = arrayList.size();
                for (i16 = 0; i16 < size2; i16++) {
                    ((dsa) arrayList.get(i16)).w(viewGroup);
                }
            }
            dsaVar.h = new ArrayList();
            dsaVar.i = new ArrayList();
            kwqVar = dsaVar.u;
            kwqVar2 = dsaVar.v;
            afvVar = new afv((aha) kwqVar.b);
            afvVar2 = new afv((aha) kwqVar2.b);
            i2 = 0;
            while (true) {
                iArr = dsaVar.g;
                if (i2 < 4) {
                    break;
                }
                i8 = iArr[i2];
                if (i8 != i17) {
                    i9 = i2;
                    i10 = afvVar.d;
                    while (true) {
                        i10--;
                        if (i10 >= 0) {
                            view = (View) afvVar.d(i10);
                            if (view == null && dsaVar.C(view) && (dskVar3 = (dsk) afvVar2.remove(view)) != null && dsaVar.C(dskVar3.b)) {
                                dsaVar.h.add((dsk) afvVar.e(i10));
                                dsaVar.i.add(dskVar3);
                            }
                        }
                    }
                } else if (i8 != 2) {
                    i9 = i2;
                    Object obj2 = kwqVar.c;
                    Object obj3 = kwqVar2.c;
                    ahaVar = (aha) obj2;
                    i11 = ahaVar.d;
                    for (i12 = 0; i12 < i11; i12++) {
                        view2 = (View) ahaVar.g(i12);
                        if (view2 == null && dsaVar.C(view2)) {
                            View view5 = (View) ((aha) obj3).get((String) ahaVar.d(i12));
                            if (view5 != null && dsaVar.C(view5)) {
                                dsk dskVar4 = (dsk) afvVar.get(view2);
                                dsk dskVar5 = (dsk) afvVar2.get(view5);
                                if (dskVar4 != null && dskVar5 != null) {
                                    dsaVar.h.add(dskVar4);
                                    dsaVar.i.add(dskVar5);
                                    afvVar.remove(view2);
                                    afvVar2.remove(view5);
                                }
                            }
                        }
                    }
                } else if (i8 != 3) {
                    if (i8 == 4) {
                        Object obj4 = kwqVar.a;
                        Object obj5 = kwqVar2.a;
                        agkVar = (agk) obj4;
                        iC = agkVar.c();
                        i14 = i;
                        while (i14 < iC) {
                            view4 = (View) agkVar.g(i14);
                            if (view4 == null && dsaVar.C(view4)) {
                                i15 = i2;
                                View view6 = (View) ((agk) obj5).e(agkVar.d(i14));
                                if (view6 != null && dsaVar.C(view6)) {
                                    dsk dskVar6 = (dsk) afvVar.get(view4);
                                    dsk dskVar7 = (dsk) afvVar2.get(view6);
                                    if (dskVar6 != null && dskVar7 != null) {
                                        dsaVar.h.add(dskVar6);
                                        dsaVar.i.add(dskVar7);
                                        afvVar.remove(view4);
                                        afvVar2.remove(view6);
                                    }
                                }
                            } else {
                                i15 = i2;
                            }
                            i14++;
                            i2 = i15;
                        }
                    }
                    i9 = i2;
                } else {
                    i9 = i2;
                    Object obj6 = kwqVar.d;
                    Object obj7 = kwqVar2.d;
                    sparseArray = (SparseArray) obj6;
                    size = sparseArray.size();
                    for (i13 = 0; i13 < size; i13++) {
                        view3 = (View) sparseArray.valueAt(i13);
                        if (view3 == null && dsaVar.C(view3)) {
                            View view7 = (View) ((SparseArray) obj7).get(sparseArray.keyAt(i13));
                            if (view7 != null && dsaVar.C(view7)) {
                                dsk dskVar8 = (dsk) afvVar.get(view3);
                                dsk dskVar9 = (dsk) afvVar2.get(view7);
                                if (dskVar8 != null && dskVar9 != null) {
                                    dsaVar.h.add(dskVar8);
                                    dsaVar.i.add(dskVar9);
                                    afvVar.remove(view3);
                                    afvVar2.remove(view7);
                                }
                            }
                        }
                    }
                }
                i2 = i9 + 1;
                i = 0;
                i17 = 1;
            }
            for (i3 = 0; i3 < afvVar.d; i3++) {
                dskVar2 = (dsk) afvVar.g(i3);
                if (dsaVar.C(dskVar2.b)) {
                    dsaVar.h.add(dskVar2);
                    dsaVar.i.add(null);
                }
            }
            for (i4 = 0; i4 < afvVar2.d; i4++) {
                dskVar = (dsk) afvVar2.g(i4);
                if (dsaVar.C(dskVar.b)) {
                    dsaVar.i.add(dskVar);
                    dsaVar.h.add(null);
                }
            }
            afvVarH = dsa.h();
            i5 = afvVarH.d;
            WindowId windowId = viewGroup.getWindowId();
            arrayList2 = new ArrayList();
            while (true) {
                i5--;
                if (i5 >= 0) {
                    break;
                }
                animator = (Animator) afvVarH.d(i5);
                if (animator == null && (gmjVar = (gmj) afvVarH.get(animator)) != null && (obj = gmjVar.d) != null && Objects.equals(windowId, gmjVar.c)) {
                    Object obj8 = gmjVar.e;
                    View view8 = (View) obj;
                    dsk dskVarL = dsaVar.l(view8, true);
                    dsk dskVarK = dsaVar.k(view8, true);
                    if (dskVarL == null && dskVarK == null) {
                        dskVarK = (dsk) ((aha) dsaVar.v.b).get(obj);
                    }
                    if (dskVarL != null || dskVarK != null) {
                        Object obj9 = gmjVar.a;
                        dsa dsaVar3 = (dsa) obj9;
                        if (dsaVar3.B((dsk) obj8, dskVarK)) {
                            if (dsaVar3.j().q != null) {
                                animator.cancel();
                                ArrayList arrayList5 = dsaVar3.j;
                                arrayList5.remove(animator);
                                afvVarH.e(i5);
                                if (arrayList5.size() == 0) {
                                    arrayList2.add(obj9);
                                }
                            } else if (animator.isRunning() || animator.isStarted()) {
                                animator.cancel();
                            } else {
                                afvVarH.e(i5);
                            }
                        }
                    }
                }
            }
            for (i6 = 0; i6 < arrayList2.size(); i6++) {
                dsaVar2 = (dsa) arrayList2.get(i6);
                dsaVar2.s(dsaVar2, drz.c, false);
                if (!dsaVar2.l) {
                    dsaVar2.l = true;
                    dsaVar2.s(dsaVar2, drz.b, false);
                }
            }
            dsaVar.N(viewGroup, dsaVar.u, dsaVar.v, dsaVar.h, dsaVar.i);
            if (dsaVar.q == null) {
                dsaVar.x();
            } else if (Build.VERSION.SDK_INT >= 34) {
                dsaVar.u();
                drw drwVar2 = dsaVar.q;
                long jH = drwVar2.h();
                dsa dsaVar4 = drwVar2.g;
                long j = drwVar2.a;
                long j2 = jH == 0 ? 1L : 0L;
                dsaVar4.y(j2, j);
                drwVar2.a = j2;
                drwVar = dsaVar.q;
                drwVar.b = true;
                i7 = drwVar.d;
                if (i7 == 1) {
                    drwVar.d = 0;
                    drwVar.i();
                    return true;
                }
                if (i7 == 2) {
                    return true;
                }
                drwVar.d = 0;
                drwVar.j(drwVar.f);
                return true;
            }
            return true;
        }
        arrayList4 = new ArrayList();
        afvVarA.put(viewGroup, arrayList4);
        dsaVar = this.a;
        arrayList4.add(dsaVar);
        dsaVar.D(new dsc(this, afvVarA));
        i = 0;
        dsaVar.p(viewGroup, false);
        if (arrayList != null) {
            size2 = arrayList.size();
            while (i16 < size2) {
                ((dsa) arrayList.get(i16)).w(viewGroup);
            }
        }
        dsaVar.h = new ArrayList();
        dsaVar.i = new ArrayList();
        kwqVar = dsaVar.u;
        kwqVar2 = dsaVar.v;
        afvVar = new afv((aha) kwqVar.b);
        afvVar2 = new afv((aha) kwqVar2.b);
        i2 = 0;
        while (true) {
            iArr = dsaVar.g;
            if (i2 < 4) {
                break;
                break;
            }
            i8 = iArr[i2];
            if (i8 != i17) {
                i9 = i2;
                i10 = afvVar.d;
                while (true) {
                    i10--;
                    if (i10 >= 0) {
                        view = (View) afvVar.d(i10);
                        if (view == null) {
                        }
                    }
                }
            } else if (i8 != 2) {
                i9 = i2;
                Object obj10 = kwqVar.c;
                Object obj11 = kwqVar2.c;
                ahaVar = (aha) obj10;
                i11 = ahaVar.d;
                while (i12 < i11) {
                    view2 = (View) ahaVar.g(i12);
                    if (view2 == null) {
                    }
                }
            } else if (i8 != 3) {
                if (i8 == 4) {
                    Object obj12 = kwqVar.a;
                    Object obj13 = kwqVar2.a;
                    agkVar = (agk) obj12;
                    iC = agkVar.c();
                    i14 = i;
                    while (i14 < iC) {
                        view4 = (View) agkVar.g(i14);
                        if (view4 == null) {
                            i15 = i2;
                        } else {
                            i15 = i2;
                        }
                        i14++;
                        i2 = i15;
                    }
                }
                i9 = i2;
            } else {
                i9 = i2;
                Object obj14 = kwqVar.d;
                Object obj15 = kwqVar2.d;
                sparseArray = (SparseArray) obj14;
                size = sparseArray.size();
                while (i13 < size) {
                    view3 = (View) sparseArray.valueAt(i13);
                    if (view3 == null) {
                    }
                }
            }
            i2 = i9 + 1;
            i = 0;
            i17 = 1;
        }
        while (i3 < afvVar.d) {
            dskVar2 = (dsk) afvVar.g(i3);
            if (dsaVar.C(dskVar2.b)) {
                dsaVar.h.add(dskVar2);
                dsaVar.i.add(null);
            }
        }
        while (i4 < afvVar2.d) {
            dskVar = (dsk) afvVar2.g(i4);
            if (dsaVar.C(dskVar.b)) {
                dsaVar.i.add(dskVar);
                dsaVar.h.add(null);
            }
        }
        afvVarH = dsa.h();
        i5 = afvVarH.d;
        WindowId windowId2 = viewGroup.getWindowId();
        arrayList2 = new ArrayList();
        while (true) {
            i5--;
            if (i5 >= 0) {
                break;
                break;
            }
            animator = (Animator) afvVarH.d(i5);
            if (animator == null) {
            }
        }
        while (i6 < arrayList2.size()) {
            dsaVar2 = (dsa) arrayList2.get(i6);
            dsaVar2.s(dsaVar2, drz.c, false);
            if (!dsaVar2.l) {
                dsaVar2.l = true;
                dsaVar2.s(dsaVar2, drz.b, false);
            }
        }
        dsaVar.N(viewGroup, dsaVar.u, dsaVar.v, dsaVar.h, dsaVar.i);
        if (dsaVar.q == null) {
            dsaVar.x();
        } else if (Build.VERSION.SDK_INT >= 34) {
            dsaVar.u();
            drw drwVar3 = dsaVar.q;
            long jH2 = drwVar3.h();
            dsa dsaVar5 = drwVar3.g;
            long j3 = drwVar3.a;
            if (jH2 == 0) {
            }
            dsaVar5.y(j2, j3);
            drwVar3.a = j2;
            drwVar = dsaVar.q;
            drwVar.b = true;
            i7 = drwVar.d;
            if (i7 == 1) {
                drwVar.d = 0;
                drwVar.i();
                return true;
            }
            if (i7 == 2) {
                return true;
            }
            drwVar.d = 0;
            drwVar.j(drwVar.f);
            return true;
        }
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
        ArrayList arrayList = dse.a;
        ViewGroup viewGroup = this.b;
        arrayList.remove(viewGroup);
        ArrayList arrayList2 = (ArrayList) dse.a().get(viewGroup);
        if (arrayList2 != null && arrayList2.size() > 0) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                ((dsa) arrayList2.get(i)).w(viewGroup);
            }
        }
        this.a.q(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
