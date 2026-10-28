package defpackage;

import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.libraries.elements.converters.layout.FlowLayoutManager;
import j$.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class moi {
    public int a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int p;
    public final int r;
    private final DisplayMetrics s;
    public final mog i = new mog(-1, null);
    public final List j = new ArrayList();
    public final TreeMap k = new TreeMap();
    public final List l = new ArrayList();
    public int m = -1;
    public int n = -1;
    public int q = -1;
    public nd o = null;

    public moi(moc mocVar) {
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = false;
        this.h = false;
        this.p = 1;
        this.p = mocVar.a;
        this.a = mocVar.c;
        this.b = mocVar.b;
        this.r = mocVar.f;
        this.c = mocVar.d;
        this.d = FlowLayoutManager.d;
        this.e = false;
        this.f = false;
        this.g = false;
        this.h = false;
        this.s = mocVar.e;
    }

    public static final void o(mog mogVar) {
        moh mohVar = mogVar.d;
    }

    private final View p(int i, mom momVar, nv nvVar, FlowLayoutManager flowLayoutManager) {
        momVar.d = i;
        View viewN = nvVar.n(i);
        flowLayoutManager.addView(viewN);
        if (FlowLayoutManager.a) {
            flowLayoutManager.j(viewN, new mod(viewN, i, -1, 4), this.i.d, -1, -1);
        } else {
            flowLayoutManager.measureChildWithMargins(viewN, 0, 0);
        }
        return viewN;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00f7  */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        if (r15 < r14.c) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        r14.d(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if (r15 < ((defpackage.mod) r0.get(0)).a) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void q(defpackage.mog r14, int r15) {
        /*
            Method dump skipped, instruction units count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.moi.q(mog, int):void");
    }

    private final void r(moj mojVar) {
        moe moeVarD = d(mojVar.a);
        if (moeVarD != null) {
            mojVar.a = ((mod) moeVarD.d.get(0)).a;
        }
    }

    private final void s(moj mojVar) {
        moe moeVarD = d(mojVar.a);
        if (moeVarD != null) {
            mojVar.a = ((mod) aguu.K(moeVarD.d)).a;
        }
    }

    public final int a(np npVar) {
        int width;
        int paddingRight;
        if (this.p == 0) {
            width = npVar.getHeight() - npVar.getPaddingTop();
            paddingRight = npVar.getPaddingBottom();
        } else {
            width = npVar.getWidth() - npVar.getPaddingLeft();
            paddingRight = npVar.getPaddingRight();
        }
        return width - paddingRight;
    }

    public final int b(oe oeVar, mog mogVar, moe moeVar) {
        moh mohVar = mogVar.d;
        ArrayList arrayList = moeVar.d;
        boolean z = true;
        int iB = 0;
        boolean z2 = !arrayList.isEmpty() && ((mod) aguu.K(arrayList)).a == oeVar.a() + (-1);
        if (!this.d || mohVar == null) {
            if (z2) {
                return 0;
            }
            return this.a;
        }
        boolean z3 = moeVar.g;
        if (mohVar.d == null) {
            z = z3;
        } else if (!z3) {
            z = false;
        } else if (!z2) {
            iB = mohVar.b(this.p);
        }
        return !z ? mohVar.c : iB;
    }

    public final moe c() {
        if (FlowLayoutManager.i) {
            List list = this.l;
            if (!list.isEmpty()) {
                return (moe) list.remove(list.size() - 1);
            }
        }
        return new moe();
    }

    public final moe d(int i) {
        moe moeVarA;
        if (this.d) {
            if (FlowLayoutManager.b) {
                Map.Entry entryFloorEntry = this.k.floorEntry(Integer.valueOf(i));
                if (entryFloorEntry != null) {
                    mog mogVar = (mog) entryFloorEntry.getValue();
                    if (mogVar.h(i)) {
                        moeVarA = mogVar.a(i);
                        if (moeVarA != null && moeVarA.d.isEmpty()) {
                            return null;
                        }
                        return moeVarA;
                    }
                }
            } else {
                for (mog mogVar2 : this.j) {
                    if (mogVar2.h(i)) {
                        moeVarA = mogVar2.a(i);
                        if (moeVarA != null && moeVarA.d.isEmpty()) {
                            return null;
                        }
                        return moeVarA;
                    }
                }
            }
        }
        return ((mof) this.i.f).get(Integer.valueOf(i));
    }

    public final mog e(int i, mop mopVar) {
        mog mogVar = null;
        if (mopVar == null) {
            List list = this.j;
            if (!list.isEmpty()) {
                return (mog) list.get(0);
            }
            mog mogVar2 = new mog(0, moh.d(null, this.b, this.a, this.c, this.s));
            list.add(mogVar2);
            if (!FlowLayoutManager.b) {
                return mogVar2;
            }
            this.k.put(0, mogVar2);
            return mogVar2;
        }
        if (FlowLayoutManager.b) {
            Map.Entry entryFloorEntry = this.k.floorEntry(Integer.valueOf(i));
            if (entryFloorEntry != null) {
                mogVar = (mog) entryFloorEntry.getValue();
                if (mogVar.h(i)) {
                    if (FlowLayoutManager.v && FlowLayoutManager.f && mogVar.a != i && mopVar.c(i)) {
                        l(mogVar, i);
                    }
                } else if (mopVar.c(i) || i != mogVar.c) {
                }
            }
            return mogVar;
        }
        for (mog mogVar3 : this.j) {
            if (mogVar3.h(i)) {
                if (!FlowLayoutManager.v || !FlowLayoutManager.f || mogVar3.a == i || !mopVar.c(i)) {
                    return mogVar3;
                }
                l(mogVar3, i);
                break;
            }
        }
        while (i >= 0) {
            if (mopVar.c(i) || i == 0) {
                if (FlowLayoutManager.b) {
                    mog mogVar4 = (mog) this.k.get(Integer.valueOf(i));
                    if (mogVar4 != null) {
                        return mogVar4;
                    }
                } else {
                    for (mog mogVar5 : this.j) {
                        if (mogVar5.a == i) {
                            return mogVar5;
                        }
                    }
                }
                mogVar = new mog(i, moh.d(mopVar, this.b, this.a, this.c, this.s));
                this.j.add(mogVar);
                if (!FlowLayoutManager.b) {
                    break;
                }
                this.k.put(Integer.valueOf(i), mogVar);
                break;
            }
            i--;
        }
        mogVar.getClass();
        return mogVar;
    }

    public final void f(FlowLayoutManager flowLayoutManager, nv nvVar, oe oeVar, boolean z) {
        int iA;
        int i;
        moe moeVar;
        moi moiVar;
        moi moiVar2;
        FlowLayoutManager flowLayoutManager2;
        boolean z2;
        View view;
        if (this.q < 0 || this.q >= (iA = oeVar.a()) || iA == 0) {
            return;
        }
        mom momVar = new mom();
        moe moeVar2 = new moe();
        if (this.p == 0 && z) {
            momVar.f = -1;
        } else {
            momVar.f = 1;
        }
        int i2 = 0;
        while (true) {
            i = this.q;
            if (i2 > i) {
                break;
            }
            if (this.i.f.containsKey(Integer.valueOf(i2))) {
                flowLayoutManager2 = flowLayoutManager;
                z2 = z;
                moiVar2 = this;
                moeVar2 = moeVar2;
                moeVar2 = moeVar2;
            } else {
                try {
                    View viewP = this.p(i2, momVar, nvVar, flowLayoutManager);
                    moiVar2 = this;
                    flowLayoutManager2 = flowLayoutManager;
                    z2 = z;
                    try {
                        int i3 = i2;
                        if (moeVar2.n(moiVar2, viewP, i2, flowLayoutManager2, momVar, z2)) {
                            i2 = i3;
                            view = viewP;
                        } else {
                            mom momVar2 = momVar;
                            try {
                                moeVar2.c(moiVar2, momVar2, flowLayoutManager2, z2, false);
                                momVar = momVar2;
                                flowLayoutManager2 = flowLayoutManager2;
                                try {
                                    moeVar2 = new moe();
                                    i2 = i3;
                                    view = viewP;
                                    try {
                                        moeVar2.n(moiVar2, view, i2, flowLayoutManager2, momVar, z2);
                                    } catch (IndexOutOfBoundsException unused) {
                                        moiVar2 = moiVar2;
                                    }
                                } catch (IndexOutOfBoundsException unused2) {
                                    i2 = i3;
                                    moiVar2 = moiVar2;
                                    moeVar2 = moeVar2;
                                }
                            } catch (IndexOutOfBoundsException unused3) {
                                momVar = momVar2;
                                z2 = z2;
                                flowLayoutManager2 = flowLayoutManager2;
                            }
                        }
                        try {
                            flowLayoutManager2.k(view, nvVar, false);
                        } catch (IndexOutOfBoundsException unused4) {
                        }
                    } catch (IndexOutOfBoundsException unused5) {
                        moeVar2 = moeVar2;
                    }
                } catch (IndexOutOfBoundsException unused6) {
                    flowLayoutManager2 = flowLayoutManager;
                    z2 = z;
                    moiVar2 = this;
                    moeVar2 = moeVar2;
                }
            }
            i2++;
            this = moiVar2;
            flowLayoutManager = flowLayoutManager2;
            z = z2;
        }
        FlowLayoutManager flowLayoutManager3 = flowLayoutManager;
        boolean z3 = z;
        moi moiVar3 = this;
        moe moeVar3 = moeVar2;
        int i4 = i + 1;
        while (i4 < iA) {
            if (moiVar3.i.f.containsKey(Integer.valueOf(i4))) {
                moeVar = moeVar3;
                moiVar = moiVar3;
            } else {
                View viewP2 = moiVar3.p(i4, momVar, nvVar, flowLayoutManager3);
                moeVar = moeVar3;
                moiVar = moiVar3;
                if (!moeVar.n(moiVar, viewP2, i4, flowLayoutManager3, momVar, z3)) {
                    flowLayoutManager3.k(viewP2, nvVar, false);
                    moeVar.c(moiVar, momVar, flowLayoutManager3, z3, true);
                    moiVar.q = -1;
                }
                flowLayoutManager3.k(viewP2, nvVar, false);
            }
            i4++;
            moeVar3 = moeVar;
            moiVar3 = moiVar;
        }
        moeVar = moeVar3;
        moiVar = moiVar3;
        moeVar.c(moiVar, momVar, flowLayoutManager3, z3, true);
        moiVar.q = -1;
    }

    final void g(moe moeVar, mog mogVar) {
        mogVar.f(moeVar);
        if (FlowLayoutManager.i) {
            List list = this.l;
            if (list.size() < 30) {
                moeVar.f();
                list.add(moeVar);
            }
        }
    }

    public final void h() {
        this.i.e();
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((mog) it.next()).e();
        }
    }

    public final void i(int i) {
        mob mobVar = new mob(i, 0);
        List list = this.j;
        Collection.EL.removeIf(list, mobVar);
        if (FlowLayoutManager.b) {
            this.k.tailMap(Integer.valueOf(i)).clear();
        }
        if (FlowLayoutManager.c && FlowLayoutManager.b) {
            Map.Entry entryFloorEntry = this.k.floorEntry(Integer.valueOf(i));
            mog mogVar = entryFloorEntry == null ? null : (mog) entryFloorEntry.getValue();
            if (mogVar != null) {
                q(mogVar, i);
                return;
            }
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                q((mog) list.get(size), i);
            }
        }
    }

    public final void j() {
        this.i.g();
        if (this.d) {
            if (FlowLayoutManager.t) {
                h();
                Iterator it = this.j.iterator();
                while (it.hasNext()) {
                    ((mog) it.next()).g();
                }
            }
            this.j.clear();
            this.k.clear();
            ahno.O(this.d);
        }
    }

    public final void k(oe oeVar) {
        ahno.O(this.d);
        List list = this.j;
        if (list.isEmpty()) {
            return;
        }
        int iA = oeVar.a();
        if (((mof) ((mog) aguu.K(list)).f).get(Integer.valueOf(iA)) != null) {
            i(iA);
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00d4  */
    public final void l(mog mogVar, int i) {
        Collection.EL.removeIf(this.j, new mob(i, 2));
        if (FlowLayoutManager.b) {
            this.k.tailMap(Integer.valueOf(i)).clear();
        }
        if (FlowLayoutManager.m) {
            List list = mogVar.e;
            if (!list.isEmpty()) {
                ArrayList arrayList = ((moe) list.get(0)).d;
                if (!arrayList.isEmpty() && i < ((mod) arrayList.get(0)).a) {
                    mogVar.d(this);
                    return;
                }
            } else if (i < mogVar.c) {
                mogVar.d(this);
                return;
            }
        }
        moh mohVar = mogVar.d;
        boolean z = true;
        if (FlowLayoutManager.e && mohVar != null && mohVar.e == 1) {
            int i2 = (i - mogVar.a) - (FlowLayoutManager.m ? mogVar.g : 0);
            if (i2 >= 0) {
                List list2 = mogVar.e;
                if (i2 < list2.size()) {
                    ArrayList arrayList2 = new ArrayList(list2.subList(i2, list2.size()));
                    int size = arrayList2.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        moe moeVar = (moe) arrayList2.get(i3);
                        ArrayList arrayList3 = moeVar.d;
                        int size2 = arrayList3.size();
                        for (int i4 = 0; i4 < size2; i4++) {
                            ((mof) mogVar.f).remove(Integer.valueOf(((mod) arrayList3.get(i4)).a));
                        }
                        if (FlowLayoutManager.t) {
                            moeVar.e();
                        }
                        if (FlowLayoutManager.i) {
                            List list3 = this.l;
                            if (list3.size() < 30) {
                                moeVar.f();
                                list3.add(moeVar);
                            }
                        }
                    }
                    list2.subList(i2, list2.size()).clear();
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
        } else {
            ArrayList arrayList4 = new ArrayList();
            boolean z2 = false;
            for (moe moeVar2 : aguu.t(mogVar.e)) {
                if (!moeVar2.d.isEmpty() && moeVar2.a() >= i) {
                    arrayList4.add(moeVar2);
                    z2 = true;
                }
            }
            for (int i5 = 0; i5 < arrayList4.size(); i5++) {
                moe moeVar3 = (moe) arrayList4.get(i5);
                if (FlowLayoutManager.i) {
                    g(moeVar3, mogVar);
                } else {
                    mogVar.f(moeVar3);
                }
            }
            z = z2;
        }
        if (z) {
            List list4 = mogVar.e;
            if (list4.isEmpty()) {
                mogVar.c = 0;
                mogVar.g = 0;
                mogVar.b = -1;
            } else {
                int iA = ((moe) aguu.K(list4)).a();
                mogVar.c = iA + 1;
                mogVar.b = iA == i + (-1) ? iA : -1;
            }
        }
    }

    public final void m(moj mojVar, boolean z) {
        if (mojVar.c) {
            if (z) {
                r(mojVar);
                return;
            } else {
                s(mojVar);
                return;
            }
        }
        if (z) {
            s(mojVar);
        } else {
            r(mojVar);
        }
    }

    public final int n(View view, int i, oe oeVar, mom momVar, mop mopVar) {
        int iB;
        int i2;
        moe moeVarD = d(i);
        if (moeVarD == null) {
            return 0;
        }
        ArrayList arrayList = moeVarD.d;
        ahno.O(!arrayList.isEmpty());
        int i3 = ((mod) arrayList.get(0)).a;
        mog mogVarE = e(i, mopVar);
        o(mogVarE);
        int iB2 = b(oeVar, mogVarE, moeVarD);
        int i4 = (this.p != 1 && momVar.f == 1 && momVar.e == -1 && i3 == 0) ? 0 : iB2;
        nd ndVar = this.o;
        ndVar.getClass();
        int i5 = moeVarD.a - iB2;
        int i6 = this.r;
        int i7 = i6 - 1;
        if (i6 == 0) {
            throw null;
        }
        if (i7 == 1) {
            if (momVar.f != -1) {
                iB = ndVar.b(view);
                i2 = i5 - iB;
            }
            return iB2;
        }
        if (i7 == 2) {
            if (momVar.f == -1) {
                iB = ndVar.b(view);
                i2 = i5 - iB;
            }
            return iB2;
        }
        int iB3 = i5 - ndVar.b(view);
        int i8 = momVar.f;
        i2 = iB3 / 2;
        return i4 + i2;
    }
}
