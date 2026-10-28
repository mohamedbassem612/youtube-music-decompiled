package com.google.android.libraries.elements.converters.layout;

import android.graphics.PointF;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.elements.converters.layout.FlowLayoutManager;
import defpackage.ahno;
import defpackage.moc;
import defpackage.mod;
import defpackage.moe;
import defpackage.mog;
import defpackage.moh;
import defpackage.moi;
import defpackage.moj;
import defpackage.mok;
import defpackage.mol;
import defpackage.mom;
import defpackage.mon;
import defpackage.mop;
import defpackage.nd;
import defpackage.nh;
import defpackage.nn;
import defpackage.np;
import defpackage.nq;
import defpackage.nv;
import defpackage.oc;
import defpackage.od;
import defpackage.oe;
import defpackage.oh;
import defpackage.pu;
import defpackage.qnl;
import j$.util.Collection;
import j$.util.function.Predicate$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.function.Predicate;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class FlowLayoutManager extends np implements pu, oc {
    public static boolean a = false;
    public static boolean b = false;
    public static boolean c = false;
    public static boolean d = false;
    public static boolean e = false;
    public static boolean f = false;
    public static boolean g = false;
    public static boolean h = false;
    public static boolean i = false;
    public static boolean j = false;
    public static boolean k = false;
    public static boolean l = false;
    public static boolean m = false;
    public static boolean n = false;
    public static boolean o = false;
    public static boolean p = false;
    public static boolean q = false;
    public static boolean r = false;
    public static boolean s = false;
    public static boolean t = false;
    public static boolean u = false;
    public static boolean v = false;
    public final moi F;
    public int G;
    public int H;
    public boolean I;
    public boolean J;
    public boolean K;
    public mop L;
    private boolean M;
    private final boolean P;
    private int S;
    private int T;
    public final int w;
    mom x;
    public nd y;
    boolean z = false;
    public boolean A = false;
    private final boolean N = true;
    int B = -1;
    private int O = -1;
    int C = Integer.MIN_VALUE;
    mon D = null;
    final moj E = new moj(this);
    private final mol Q = new mol();
    private final int R = 2;

    public FlowLayoutManager(mok mokVar) {
        this.H = -1;
        this.T = 1;
        this.I = false;
        this.J = false;
        this.K = false;
        int i2 = mokVar.b;
        this.w = i2;
        this.G = qnl.bu(mokVar.c, mokVar.a);
        int iBu = qnl.bu(mokVar.d, mokVar.a);
        this.S = iBu;
        int i3 = mokVar.e;
        this.H = i3;
        this.T = 4;
        this.I = d;
        this.J = false;
        this.K = false;
        this.L = null;
        moc mocVar = new moc(mokVar.a);
        mocVar.a = i2;
        mocVar.b = this.G;
        mocVar.c = iBu;
        mocVar.d = i3;
        mocVar.f = 4;
        this.F = new moi(mocVar);
        this.P = o;
    }

    private final View A() {
        if (this.z) {
            View childAt = getChildAt(0);
            getChildCount();
            childAt.getClass();
            return childAt;
        }
        View childAt2 = getChildAt(getChildCount() - 1);
        if (childAt2 == null) {
            int childCount = getChildCount();
            do {
                childCount--;
                if (childCount >= 0) {
                    childAt2 = getChildAt(childCount);
                }
            } while (childAt2 == null);
            return childAt2;
        }
        getChildCount();
        childAt2.getClass();
        return childAt2;
    }

    private final View B() {
        if (!this.z) {
            View childAt = getChildAt(0);
            getChildCount();
            childAt.getClass();
            return childAt;
        }
        View childAt2 = getChildAt(getChildCount() - 1);
        if (childAt2 == null) {
            int childCount = getChildCount();
            do {
                childCount--;
                if (childCount >= 0) {
                    childAt2 = getChildAt(childCount);
                }
            } while (childAt2 == null);
            return childAt2;
        }
        getChildCount();
        childAt2.getClass();
        return childAt2;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:105:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:109:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:112:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:113:0x01db A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:119:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:313:0x01ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:315:0x01d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:73:0x010e  */
    /* JADX WARN: Code duplicated, block: B:82:0x012f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0134  */
    /* JADX WARN: Code duplicated, block: B:85:0x0137 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x0139  */
    /* JADX WARN: Code duplicated, block: B:87:0x013e  */
    /* JADX WARN: Code duplicated, block: B:88:0x013f A[PHI: r1
      0x013f: PHI (r1v94 int) = (r1v93 int), (r1v106 int) binds: [B:84:0x0135, B:87:0x013e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:91:0x0146 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x0148  */
    /* JADX WARN: Code duplicated, block: B:94:0x014b  */
    /* JADX WARN: Code duplicated, block: B:95:0x014e  */
    /* JADX WARN: Code duplicated, block: B:97:0x0166  */
    /* JADX WARN: Code duplicated, block: B:99:0x019b  */
    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:26:0x0056
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    private final void C(defpackage.nv r22, defpackage.oe r23, defpackage.mom r24, defpackage.mol r25, defpackage.mog r26, int r27, int r28) {
        /*
            Method dump skipped, instruction units count: 1242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.elements.converters.layout.FlowLayoutManager.C(nv, oe, mom, mol, mog, int, int):void");
    }

    private final void D(nv nvVar, mom momVar, oe oeVar) {
        if (!momVar.a || momVar.l) {
            return;
        }
        if (momVar.f != -1) {
            int i2 = momVar.g;
            if (i2 >= 0) {
                int childCount = getChildCount();
                if (!this.z) {
                    for (int i3 = 0; i3 < childCount; i3++) {
                        View childAt = getChildAt(i3);
                        getChildCount();
                        childAt.getClass();
                        moi moiVar = this.F;
                        int position = getPosition(childAt);
                        mom momVar2 = this.x;
                        o();
                        if (this.y.a(childAt) + moiVar.n(childAt, position, oeVar, momVar2, this.L) > i2 || this.y.l(childAt) > i2) {
                            E(nvVar, 0, i3);
                            return;
                        }
                    }
                    return;
                }
                int i4 = childCount - 1;
                for (int i5 = i4; i5 >= 0; i5--) {
                    View childAt2 = getChildAt(i5);
                    getChildCount();
                    childAt2.getClass();
                    moi moiVar2 = this.F;
                    int position2 = getPosition(childAt2);
                    mom momVar3 = this.x;
                    o();
                    if (this.y.a(childAt2) + moiVar2.n(childAt2, position2, oeVar, momVar3, this.L) > i2 || this.y.l(childAt2) > i2) {
                        E(nvVar, i4, i5);
                        return;
                    }
                }
                return;
            }
            return;
        }
        int i6 = momVar.g;
        int childCount2 = getChildCount();
        if (i6 >= 0) {
            int iE = this.y.e() - i6;
            if (!this.z) {
                int i7 = childCount2 - 1;
                for (int i8 = i7; i8 >= 0; i8--) {
                    View childAt3 = getChildAt(i8);
                    getChildCount();
                    childAt3.getClass();
                    moi moiVar3 = this.F;
                    int position3 = getPosition(childAt3);
                    mom momVar4 = this.x;
                    o();
                    if (this.y.d(childAt3) < moiVar3.n(childAt3, position3, oeVar, momVar4, this.L) + iE || this.y.m(childAt3) < iE) {
                        E(nvVar, i7, i8);
                        return;
                    }
                }
                return;
            }
            int i9 = 0;
            while (i9 < childCount2) {
                View childAt4 = getChildAt(i9);
                getChildCount();
                childAt4.getClass();
                moi moiVar4 = this.F;
                int position4 = getPosition(childAt4);
                mom momVar5 = this.x;
                o();
                oe oeVar2 = oeVar;
                if (this.y.d(childAt4) < moiVar4.n(childAt4, position4, oeVar2, momVar5, this.L) + iE || this.y.m(childAt4) < iE) {
                    E(nvVar, 0, i9);
                    return;
                } else {
                    i9++;
                    oeVar = oeVar2;
                }
            }
        }
    }

    private final void E(nv nvVar, int i2, int i3) {
        if (i2 == i3) {
            return;
        }
        if (i3 <= i2) {
            while (i2 > i3) {
                removeAndRecycleViewAt(i2, nvVar);
                i2--;
            }
        } else {
            while (true) {
                i3--;
                if (i3 < i2) {
                    return;
                } else {
                    removeAndRecycleViewAt(i3, nvVar);
                }
            }
        }
    }

    private final void F() {
        boolean z = false;
        if (this.w != 1 && o()) {
            z = true;
        }
        this.z = z;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00f3  */
    private final void G(int i2, int i3, boolean z, oe oeVar) {
        int iB;
        int iB2;
        int iJ;
        this.x.l = p();
        this.x.h = f(oeVar);
        mom momVar = this.x;
        momVar.f = i2;
        if (i2 == 1) {
            momVar.h += this.y.g();
            View viewA = A();
            mom momVar2 = this.x;
            momVar2.e = true != this.z ? 1 : -1;
            momVar2.d = getPosition(viewA) + this.x.e;
            moi moiVar = this.F;
            int position = getPosition(viewA);
            mom momVar3 = this.x;
            o();
            iB = moiVar.n(viewA, position, oeVar, momVar3, this.L);
            this.x.b = this.y.a(viewA) + iB;
            iJ = this.y.a(viewA) - this.y.f();
        } else {
            View viewB = B();
            this.x.h += this.y.j();
            mom momVar4 = this.x;
            momVar4.e = true != this.z ? -1 : 1;
            int position2 = getPosition(viewB);
            int i4 = this.x.e;
            momVar4.d = position2 + i4;
            moi moiVar2 = this.F;
            if (i4 == 1) {
                int position3 = getPosition(viewB);
                mom momVar5 = this.x;
                o();
                iB = moiVar2.n(viewB, position3, oeVar, momVar5, this.L);
            } else {
                int position4 = getPosition(viewB);
                o();
                int i5 = this.x.f;
                mop mopVar = this.L;
                moe moeVarD = moiVar2.d(position4);
                if (moeVarD != null) {
                    ahno.O(!moeVarD.d.isEmpty());
                    mog mogVarE = moiVar2.e(position4, mopVar);
                    moi.o(mogVarE);
                    int iB3 = moiVar2.b(oeVar, mogVarE, moeVarD);
                    nd ndVar = moiVar2.o;
                    ndVar.getClass();
                    boolean z2 = moiVar2.e;
                    int i6 = moeVarD.a - iB3;
                    int i7 = moiVar2.r;
                    int i8 = i7 - 1;
                    if (i7 == 0) {
                        throw null;
                    }
                    if (i8 != 1) {
                        if (i8 != 2) {
                            iB = (i6 - ndVar.b(viewB)) / 2;
                        } else if (i5 == -1) {
                            iB2 = ndVar.b(viewB);
                            iB = i6 - iB2;
                        } else {
                            iB = 0;
                        }
                    } else if (i5 == -1) {
                        iB = 0;
                    } else {
                        iB2 = ndVar.b(viewB);
                        iB = i6 - iB2;
                    }
                } else {
                    iB = 0;
                }
            }
            this.x.b = this.y.d(viewB) - iB;
            iJ = (-this.y.d(viewB)) + this.y.j();
        }
        int i9 = iJ + iB;
        mom momVar6 = this.x;
        momVar6.c = i3;
        if (z) {
            momVar6.c = i3 - i9;
        }
        momVar6.g = i9;
    }

    private final void H(moj mojVar) {
        I(mojVar.a, mojVar.b);
    }

    private final void I(int i2, int i3) {
        this.x.c = this.y.f() - i3;
        mom momVar = this.x;
        momVar.e = true != this.z ? 1 : -1;
        momVar.d = i2;
        momVar.f = 1;
        momVar.b = i3;
        momVar.g = Integer.MIN_VALUE;
    }

    private final void J(moj mojVar) {
        K(mojVar.a, mojVar.b);
    }

    private final void K(int i2, int i3) {
        this.x.c = i3 - this.y.j();
        mom momVar = this.x;
        momVar.d = i2;
        momVar.e = true != this.z ? -1 : 1;
        momVar.f = -1;
        momVar.b = i3;
        momVar.g = Integer.MIN_VALUE;
    }

    private final boolean L(int i2) {
        mop mopVar = this.L;
        if (mopVar != null) {
            return mopVar.c(i2);
        }
        return i2 == 0;
    }

    private final boolean M(int i2) {
        mop mopVar = this.L;
        if (mopVar != null) {
            return mopVar.b(i2);
        }
        return i2 == getItemCount() + (-1);
    }

    private final View N(boolean z) {
        return this.z ? h(0, getChildCount(), z, true) : h(getChildCount() - 1, -1, z, true);
    }

    private final View O(boolean z) {
        return this.z ? h(getChildCount() - 1, -1, z, true) : h(0, getChildCount(), z, true);
    }

    private final View P(oe oeVar) {
        return q(0, getChildCount(), oeVar.a());
    }

    private final View Q(oe oeVar) {
        return q(getChildCount() - 1, -1, oeVar.a());
    }

    private final View R(oe oeVar) {
        return this.z ? P(oeVar) : Q(oeVar);
    }

    private final View S(oe oeVar) {
        return this.z ? Q(oeVar) : P(oeVar);
    }

    private final int r(oe oeVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        i();
        boolean z = this.N;
        boolean z2 = !z;
        View viewO = O(z2);
        View viewN = N(z2);
        if (viewO == null || viewN == null) {
            return 0;
        }
        nd ndVar = this.y;
        if (getChildCount() == 0 || oeVar.a() == 0) {
            return 0;
        }
        if (!z) {
            return Math.abs(getPosition(viewO) - getPosition(viewN)) + 1;
        }
        return Math.min(ndVar.k(), ndVar.a(viewN) - ndVar.d(viewO));
    }

    private final int s(oe oeVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        i();
        boolean z = this.N;
        boolean z2 = !z;
        View viewO = O(z2);
        View viewN = N(z2);
        if (viewO == null || viewN == null) {
            return 0;
        }
        nd ndVar = this.y;
        boolean z3 = this.z;
        if (getChildCount() == 0 || oeVar.a() == 0) {
            return 0;
        }
        int iMax = z3 ? Math.max(0, (oeVar.a() - Math.max(getPosition(viewO), getPosition(viewN))) - 1) : Math.max(0, Math.min(getPosition(viewO), getPosition(viewN)));
        if (z) {
            return Math.round((iMax * (Math.abs(ndVar.a(viewN) - ndVar.d(viewO)) / (Math.abs(getPosition(viewO) - getPosition(viewN)) + 1))) + (ndVar.j() - ndVar.d(viewO)));
        }
        return iMax;
    }

    private final int t(oe oeVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        i();
        boolean z = this.N;
        boolean z2 = !z;
        View viewO = O(z2);
        View viewN = N(z2);
        if (viewO == null || viewN == null) {
            return 0;
        }
        nd ndVar = this.y;
        if (getChildCount() == 0 || oeVar.a() == 0) {
            return 0;
        }
        if (!z) {
            return oeVar.a();
        }
        return (int) (((ndVar.a(viewN) - ndVar.d(viewO)) / (Math.abs(getPosition(viewO) - getPosition(viewN)) + 1)) * oeVar.a());
    }

    private final int u(int i2, nv nvVar, oe oeVar, boolean z) {
        int iF;
        int iF2 = this.y.f() - i2;
        if (iF2 <= 0) {
            return 0;
        }
        int i3 = -g(-iF2, nvVar, oeVar);
        int i4 = i2 + i3;
        if (!z || (iF = this.y.f() - i4) <= 0) {
            return i3;
        }
        this.y.n(iF);
        return i3 + iF;
    }

    private final int v(int i2, nv nvVar, oe oeVar, boolean z) {
        int iJ;
        int iJ2 = i2 - this.y.j();
        if (iJ2 <= 0) {
            return 0;
        }
        int i3 = -g(iJ2, nvVar, oeVar);
        int i4 = i2 + i3;
        if (!z || (iJ = i4 - this.y.j()) <= 0) {
            return i3;
        }
        this.y.n(-iJ);
        return i3 - iJ;
    }

    private final int w(moh mohVar) {
        int i2 = mohVar.e;
        if (e && i2 == 1) {
            return a(this) - mohVar.c(this.w);
        }
        if (i2 == -1 || i2 <= 0) {
            return -1;
        }
        return (int) Math.floor(((a(this) - mohVar.c(this.w)) - ((i2 - 1) * mohVar.b)) / i2);
    }

    private final int x(int i2) {
        mop mopVar = this.L;
        if (mopVar == null) {
            return -1;
        }
        return mopVar.a(i2);
    }

    private final int y(nv nvVar, oe oeVar, mom momVar, mol molVar) {
        int i2;
        int i3 = momVar.b;
        int i4 = molVar.a;
        momVar.b = i3 + (momVar.f * i4);
        if (molVar.c && momVar.k == null && oeVar.g) {
            i2 = 0;
        } else {
            momVar.c -= i4;
            i2 = i4;
        }
        int i5 = momVar.g;
        if (i5 != Integer.MIN_VALUE) {
            int i6 = i5 + i4;
            momVar.g = i6;
            int i7 = momVar.c;
            if (i7 < 0) {
                momVar.g = i6 + i7;
            }
            D(nvVar, momVar, oeVar);
        }
        return i2;
    }

    private final View z(int i2, nv nvVar) {
        View viewFindViewByPosition = findViewByPosition(i2);
        if (viewFindViewByPosition != null) {
            return viewFindViewByPosition;
        }
        try {
            View viewN = nvVar.n(i2);
            int childCount = getChildCount();
            if (childCount > 0) {
                int i3 = childCount - 1;
                View childAt = getChildAt(i3);
                childAt.getClass();
                if (getPosition(childAt) >= i2) {
                    childCount = 0;
                    for (int i4 = 0; i4 < i3; i4++) {
                        View childAt2 = getChildAt(i4);
                        getChildCount();
                        childAt2.getClass();
                        if (getPosition(childAt2) >= i2) {
                            break;
                        }
                        childCount++;
                    }
                }
            } else {
                childCount = 0;
            }
            mom momVar = this.x;
            if (momVar == null || momVar.k == null) {
                addView(viewN, childCount);
                return viewN;
            }
            addDisappearingView(viewN, childCount);
            return viewN;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public final int a(np npVar) {
        return this.F.a(npVar);
    }

    @Override // defpackage.np
    public final void assertNotInLayoutOrScroll(String str) {
        if (this.D == null) {
            if (str == null) {
                str = "";
            }
            super.assertNotInLayoutOrScroll(str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:123:0x0230  */
    /* JADX WARN: Code duplicated, block: B:125:0x0246  */
    /* JADX WARN: Code duplicated, block: B:126:0x0259  */
    /* JADX WARN: Code duplicated, block: B:165:0x031c  */
    /* JADX WARN: Code duplicated, block: B:169:0x033e  */
    /* JADX WARN: Code duplicated, block: B:172:0x0347  */
    /* JADX WARN: Code duplicated, block: B:219:0x0358 A[EDGE_INSN: B:219:0x0358->B:177:0x0358 BREAK  A[LOOP:0: B:8:0x0022->B:225:0x0022], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x016c A[EDGE_INSN: B:236:0x016c->B:74:0x016c BREAK  A[LOOP:2: B:27:0x00d2->B:73:0x0166], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:237:0x016c A[EDGE_INSN: B:237:0x016c->B:74:0x016c BREAK  A[LOOP:2: B:27:0x00d2->B:73:0x0166], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:243:0x016c A[EDGE_INSN: B:243:0x016c->B:74:0x016c BREAK  A[LOOP:2: B:27:0x00d2->B:73:0x0166], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:0x0166 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:0x0166 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:0x0166 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0128  */
    /* JADX WARN: Code duplicated, block: B:59:0x013e  */
    /* JADX WARN: Code duplicated, block: B:61:0x0149  */
    /* JADX WARN: Code duplicated, block: B:63:0x014d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0151  */
    /* JADX WARN: Code duplicated, block: B:67:0x0158  */
    /* JADX WARN: Code duplicated, block: B:70:0x015f  */
    /* JADX WARN: Code duplicated, block: B:91:0x01a7 A[LOOP:3: B:91:0x01a7->B:152:0x02c0, LOOP_START, PHI: r0 r1 r2 r3 r5 r9
      0x01a7: PHI (r0v14 moi) = (r0v6 moi), (r0v39 moi) binds: [B:90:0x01a5, B:152:0x02c0] A[DONT_GENERATE, DONT_INLINE]
      0x01a7: PHI (r1v8 mol) = (r1v3 mol), (r1v20 mol) binds: [B:90:0x01a5, B:152:0x02c0] A[DONT_GENERATE, DONT_INLINE]
      0x01a7: PHI (r2v7 moe) = (r2v2 moe), (r2v16 moe) binds: [B:90:0x01a5, B:152:0x02c0] A[DONT_GENERATE, DONT_INLINE]
      0x01a7: PHI (r3v6 com.google.android.libraries.elements.converters.layout.FlowLayoutManager) = 
      (r3v2 com.google.android.libraries.elements.converters.layout.FlowLayoutManager)
      (r3v13 com.google.android.libraries.elements.converters.layout.FlowLayoutManager)
     binds: [B:90:0x01a5, B:152:0x02c0] A[DONT_GENERATE, DONT_INLINE]
      0x01a7: PHI (r5v6 mom) = (r5v4 mom), (r5v15 mom) binds: [B:90:0x01a5, B:152:0x02c0] A[DONT_GENERATE, DONT_INLINE]
      0x01a7: PHI (r9v1 int) = (r9v0 int), (r9v7 int) binds: [B:90:0x01a5, B:152:0x02c0] A[DONT_GENERATE, DONT_INLINE]] */
    final int b(nv nvVar, oe oeVar, boolean z) {
        nv nvVar2;
        oe oeVar2;
        mol molVar;
        int i2;
        mom momVar;
        moi moiVar;
        moe moeVarC;
        int iA;
        int i3;
        int i4;
        moi moiVar2;
        moe moeVar;
        int width;
        boolean z2;
        int i5;
        int i6;
        int iCeil;
        boolean z3;
        FlowLayoutManager flowLayoutManager;
        mom momVar2;
        boolean z4;
        boolean z5;
        moi moiVar3;
        mog mogVarE;
        moh mohVar;
        int childMeasureSpec;
        int childMeasureSpec2;
        mop mopVar;
        int i7;
        int i8;
        mop mopVar2;
        mop mopVar3;
        final int i9;
        int i10;
        Map.Entry entryFloorEntry;
        mog mogVar;
        int i11;
        FlowLayoutManager flowLayoutManager2 = this;
        nv nvVar3 = nvVar;
        oe oeVar3 = oeVar;
        mom momVar3 = flowLayoutManager2.x;
        int i12 = momVar3.c;
        int i13 = momVar3.g;
        if (i13 != Integer.MIN_VALUE) {
            if (i12 < 0) {
                momVar3.g = i13 + i12;
            }
            flowLayoutManager2.D(nvVar3, momVar3, oeVar3);
        }
        mom momVar4 = flowLayoutManager2.x;
        int iY = momVar4.c + momVar4.h;
        mol molVar2 = flowLayoutManager2.Q;
        while (true) {
            mom momVar5 = flowLayoutManager2.x;
            int i14 = -1;
            if ((!momVar5.l && iY <= 0) || !momVar5.c(oeVar3)) {
                break;
            }
            if (!flowLayoutManager2.I || (mohVar = (mogVarE = (moiVar3 = flowLayoutManager2.F).e(flowLayoutManager2.x.d, flowLayoutManager2.L)).d) == null || mohVar.e != 1) {
                nvVar2 = nvVar3;
                oeVar2 = oeVar3;
                molVar = molVar2;
                i2 = iY;
                molVar.a();
                momVar = flowLayoutManager2.x;
                moiVar = flowLayoutManager2.F;
                moeVarC = moiVar.c();
                iA = oeVar2.a();
                if (flowLayoutManager2.I) {
                    molVar = molVar;
                    i3 = momVar.d;
                    if (i3 != iA || i3 < 0) {
                        nvVar3 = nvVar2;
                        oeVar3 = oeVar2;
                        molVar.b = true;
                    } else {
                        moiVar.k(oeVar2);
                        nvVar3 = nvVar;
                        oeVar3 = oeVar2;
                        C(nvVar3, oeVar3, momVar, molVar, moiVar.e(momVar.d, flowLayoutManager2.L), -1, -1);
                        flowLayoutManager2 = this;
                    }
                } else {
                    while (true) {
                        i4 = momVar.d;
                        if (i4 >= iA && i4 >= 0) {
                            if (moeVarC.d.size() == flowLayoutManager2.H || moeVarC.j(moiVar, flowLayoutManager2, Boolean.valueOf(flowLayoutManager2.o()))) {
                                molVar = molVar;
                                moi moiVar4 = moiVar;
                                moe moeVar2 = moeVarC;
                                moeVar2.c(moiVar4, flowLayoutManager2.x, flowLayoutManager2, flowLayoutManager2.o(), momVar.d >= iA);
                                moeVar2.g(molVar);
                                break;
                            }
                            int i15 = momVar.d;
                            moiVar2 = moiVar;
                            moeVar = moeVarC;
                            View viewA = momVar.a(nvVar2, oeVar2);
                            if (viewA != null) {
                                nq nqVar = (nq) viewA.getLayoutParams();
                                nqVar.getClass();
                                List list = momVar.k;
                                boolean z6 = flowLayoutManager2.z;
                                if (list == null) {
                                    if (z6 == (momVar.f == i14)) {
                                        flowLayoutManager2.addView(viewA);
                                    } else {
                                        flowLayoutManager2.addView(viewA, 0);
                                    }
                                } else if (z6 == (momVar.f == i14)) {
                                    flowLayoutManager2.addDisappearingView(viewA);
                                } else {
                                    flowLayoutManager2.addDisappearingView(viewA, 0);
                                }
                                Object tag = viewA.getTag(R.id.flow_layout_manager_view_is_full_span_tag);
                                if (tag instanceof Boolean) {
                                    boolean zEquals = tag.equals(Boolean.TRUE);
                                    Boolean.valueOf(zEquals).getClass();
                                    if (zEquals) {
                                        iCeil = flowLayoutManager2.getPaddingLeft() + flowLayoutManager2.getPaddingRight();
                                        i5 = i14;
                                    } else {
                                        width = (flowLayoutManager2.getWidth() - flowLayoutManager2.getPaddingLeft()) - flowLayoutManager2.getPaddingRight();
                                        z2 = a;
                                        i5 = i14;
                                        i6 = flowLayoutManager2.H;
                                        if (z2) {
                                            iCeil = width - ((int) Math.floor((width - ((i6 - 1) * flowLayoutManager2.G)) / i6));
                                        } else {
                                            iCeil = (((int) Math.ceil((width - ((i6 - 1) * flowLayoutManager2.G)) / i6)) + flowLayoutManager2.G) * (flowLayoutManager2.H - 1);
                                        }
                                    }
                                } else {
                                    width = (flowLayoutManager2.getWidth() - flowLayoutManager2.getPaddingLeft()) - flowLayoutManager2.getPaddingRight();
                                    z2 = a;
                                    i5 = i14;
                                    i6 = flowLayoutManager2.H;
                                    if (z2) {
                                        iCeil = width - ((int) Math.floor((width - ((i6 - 1) * flowLayoutManager2.G)) / i6));
                                    } else {
                                        iCeil = (((int) Math.ceil((width - ((i6 - 1) * flowLayoutManager2.G)) / i6)) + flowLayoutManager2.G) * (flowLayoutManager2.H - 1);
                                    }
                                }
                                if (p && viewA.getVisibility() == 8) {
                                    z3 = false;
                                } else {
                                    z3 = false;
                                    flowLayoutManager2.measureChildWithMargins(viewA, iCeil, 0);
                                }
                                boolean z7 = momVar.d >= iA ? true : z3;
                                flowLayoutManager = flowLayoutManager2;
                                boolean zN = moeVar.n(moiVar2, viewA, i15, flowLayoutManager, momVar, flowLayoutManager2.o());
                                momVar2 = momVar;
                                if (!zN) {
                                    flowLayoutManager2 = flowLayoutManager;
                                    moeVar.c(moiVar2, flowLayoutManager2.x, flowLayoutManager2, flowLayoutManager2.o(), z7);
                                    moeVar.g(molVar);
                                    flowLayoutManager2.k(viewA, nvVar2, true);
                                    int i16 = momVar2.d;
                                    if (i16 < i5 || i16 > iA) {
                                        break;
                                        break;
                                    }
                                    momVar2.d = i16 - momVar2.e;
                                    break;
                                }
                                if (nqVar.gN() || nqVar.gM()) {
                                    z4 = true;
                                    molVar.c = true;
                                } else {
                                    z4 = true;
                                }
                                if (viewA.hasFocusable()) {
                                    molVar.d = z4;
                                }
                                if (momVar2.d < 0) {
                                    z5 = z7;
                                } else if (z7) {
                                    z5 = true;
                                } else {
                                    flowLayoutManager2 = flowLayoutManager;
                                    moiVar = moiVar2;
                                    momVar = momVar2;
                                    molVar = molVar;
                                    i14 = i5;
                                    moeVarC = moeVar;
                                }
                                flowLayoutManager2 = flowLayoutManager;
                                moeVar.c(moiVar2, flowLayoutManager.x, flowLayoutManager2, flowLayoutManager.o(), z5);
                                moeVar.g(molVar);
                                break;
                            }
                            molVar.b = true;
                        }
                        molVar = molVar;
                        break;
                    }
                    nvVar3 = nvVar2;
                    oeVar3 = oeVar2;
                }
                if (!molVar.b) {
                    break;
                }
                iY = i2 - flowLayoutManager2.y(nvVar3, oeVar3, flowLayoutManager2.x, molVar);
                if (!z && molVar.d) {
                    break;
                }
                molVar2 = molVar;
            } else {
                moiVar3.k(oeVar3);
                if (!k) {
                    childMeasureSpec = -1;
                    childMeasureSpec2 = -1;
                } else if (flowLayoutManager2.w == 1) {
                    childMeasureSpec = getChildMeasureSpec(flowLayoutManager2.getWidth(), flowLayoutManager2.getWidthMode(), flowLayoutManager2.getPaddingLeft() + flowLayoutManager2.getPaddingRight() + mohVar.c(1), -1, flowLayoutManager2.canScrollHorizontally());
                    childMeasureSpec2 = getChildMeasureSpec(flowLayoutManager2.getHeight(), flowLayoutManager2.getHeightMode(), flowLayoutManager2.getPaddingTop() + flowLayoutManager2.getPaddingBottom(), -2, flowLayoutManager2.canScrollVertically());
                } else {
                    int childMeasureSpec3 = getChildMeasureSpec(flowLayoutManager2.getWidth(), flowLayoutManager2.getWidthMode(), flowLayoutManager2.getPaddingLeft() + flowLayoutManager2.getPaddingRight(), -2, flowLayoutManager2.canScrollHorizontally());
                    childMeasureSpec2 = getChildMeasureSpec(flowLayoutManager2.getHeight(), flowLayoutManager2.getHeightMode(), flowLayoutManager2.getPaddingTop() + flowLayoutManager2.getPaddingBottom() + mohVar.c(0), -1, flowLayoutManager2.canScrollVertically());
                    childMeasureSpec = childMeasureSpec3;
                }
                int iY2 = iY;
                int i17 = 0;
                while (true) {
                    mom momVar6 = flowLayoutManager2.x;
                    if ((momVar6.l || iY2 > 0) && momVar6.c(oeVar3)) {
                        boolean z8 = f;
                        mom momVar7 = flowLayoutManager2.x;
                        if (!z8) {
                            int i18 = momVar7.d;
                            if (i18 == mogVarE.a || (mopVar = flowLayoutManager2.L) == null || !mopVar.c(i18)) {
                                i7 = flowLayoutManager2.x.d;
                                molVar2.a();
                                FlowLayoutManager flowLayoutManager3 = flowLayoutManager2;
                                flowLayoutManager3.C(nvVar3, oeVar3, flowLayoutManager3.x, molVar2, mogVarE, childMeasureSpec, childMeasureSpec2);
                                flowLayoutManager2 = flowLayoutManager3;
                                oeVar2 = oeVar3;
                                i8 = childMeasureSpec2;
                                nvVar2 = nvVar3;
                                molVar = molVar2;
                                if (molVar.b) {
                                    break;
                                    break;
                                }
                                iY2 -= flowLayoutManager2.y(nvVar2, oeVar2, flowLayoutManager2.x, molVar);
                                i17++;
                                if (!z) {
                                    mopVar2 = flowLayoutManager2.L;
                                    if (mopVar2 != null) {
                                        if (flowLayoutManager2.x.e != 1) {
                                            if (mopVar2.c(i7)) {
                                                break;
                                                break;
                                            }
                                        } else {
                                            if (mopVar2.b(i7)) {
                                                break;
                                                break;
                                            }
                                        }
                                    }
                                    molVar2 = molVar;
                                    nvVar3 = nvVar2;
                                    oeVar3 = oeVar2;
                                    childMeasureSpec2 = i8;
                                } else {
                                    mopVar2 = flowLayoutManager2.L;
                                    if (mopVar2 != null) {
                                        if (flowLayoutManager2.x.e != 1) {
                                            if (mopVar2.c(i7)) {
                                                break;
                                                break;
                                            }
                                        } else {
                                            if (mopVar2.b(i7)) {
                                                break;
                                                break;
                                            }
                                        }
                                    }
                                    molVar2 = molVar;
                                    nvVar3 = nvVar2;
                                    oeVar3 = oeVar2;
                                    childMeasureSpec2 = i8;
                                }
                            }
                        } else if (momVar7.e == 1) {
                            int i19 = momVar7.d;
                            if (i19 == mogVarE.a || (mopVar3 = flowLayoutManager2.L) == null || !mopVar3.c(i19)) {
                                i7 = flowLayoutManager2.x.d;
                                molVar2.a();
                                FlowLayoutManager flowLayoutManager4 = flowLayoutManager2;
                                flowLayoutManager4.C(nvVar3, oeVar3, flowLayoutManager4.x, molVar2, mogVarE, childMeasureSpec, childMeasureSpec2);
                                flowLayoutManager2 = flowLayoutManager4;
                                oeVar2 = oeVar3;
                                i8 = childMeasureSpec2;
                                nvVar2 = nvVar3;
                                molVar = molVar2;
                                if (molVar.b) {
                                    break;
                                }
                                iY2 -= flowLayoutManager2.y(nvVar2, oeVar2, flowLayoutManager2.x, molVar);
                                i17++;
                                if (!z && molVar.d) {
                                    break;
                                }
                                mopVar2 = flowLayoutManager2.L;
                                if (mopVar2 != null) {
                                    if (flowLayoutManager2.x.e != 1) {
                                        if (mopVar2.c(i7)) {
                                            break;
                                        }
                                    } else {
                                        if (mopVar2.b(i7)) {
                                            break;
                                        }
                                    }
                                }
                                molVar2 = molVar;
                                nvVar3 = nvVar2;
                                oeVar3 = oeVar2;
                                childMeasureSpec2 = i8;
                            } else if (v && mogVarE.h(i19)) {
                                moiVar3.l(mogVarE, flowLayoutManager2.x.d);
                            }
                        } else if (momVar7.d >= mogVarE.a) {
                            i7 = flowLayoutManager2.x.d;
                            molVar2.a();
                            FlowLayoutManager flowLayoutManager5 = flowLayoutManager2;
                            flowLayoutManager5.C(nvVar3, oeVar3, flowLayoutManager5.x, molVar2, mogVarE, childMeasureSpec, childMeasureSpec2);
                            flowLayoutManager2 = flowLayoutManager5;
                            oeVar2 = oeVar3;
                            i8 = childMeasureSpec2;
                            nvVar2 = nvVar3;
                            molVar = molVar2;
                            if (molVar.b) {
                                break;
                                break;
                            }
                            iY2 -= flowLayoutManager2.y(nvVar2, oeVar2, flowLayoutManager2.x, molVar);
                            i17++;
                            if (!z) {
                                mopVar2 = flowLayoutManager2.L;
                                if (mopVar2 != null) {
                                    if (flowLayoutManager2.x.e != 1) {
                                        if (mopVar2.c(i7)) {
                                            break;
                                            break;
                                        }
                                    } else {
                                        if (mopVar2.b(i7)) {
                                            break;
                                            break;
                                        }
                                    }
                                }
                                molVar2 = molVar;
                                nvVar3 = nvVar2;
                                oeVar3 = oeVar2;
                                childMeasureSpec2 = i8;
                            } else {
                                mopVar2 = flowLayoutManager2.L;
                                if (mopVar2 != null) {
                                    if (flowLayoutManager2.x.e != 1) {
                                        if (mopVar2.c(i7)) {
                                            break;
                                            break;
                                        }
                                    } else {
                                        if (mopVar2.b(i7)) {
                                            break;
                                            break;
                                        }
                                    }
                                }
                                molVar2 = molVar;
                                nvVar3 = nvVar2;
                                oeVar3 = oeVar2;
                                childMeasureSpec2 = i8;
                            }
                        }
                    }
                    nvVar2 = nvVar3;
                    oeVar2 = oeVar3;
                    molVar = molVar2;
                    break;
                }
                iY = iY2;
                if (molVar.b || (z && molVar.d)) {
                    break;
                }
                if (v && i17 == 0) {
                    mom momVar8 = flowLayoutManager2.x;
                    if ((momVar8.l || iY > 0) && momVar8.c(oeVar2)) {
                        i2 = iY;
                        molVar.a();
                        momVar = flowLayoutManager2.x;
                        moiVar = flowLayoutManager2.F;
                        moeVarC = moiVar.c();
                        iA = oeVar2.a();
                        if (flowLayoutManager2.I) {
                            while (true) {
                                i4 = momVar.d;
                                if (i4 >= iA) {
                                }
                                molVar = molVar;
                                nvVar3 = nvVar2;
                                oeVar3 = oeVar2;
                                flowLayoutManager2 = flowLayoutManager;
                                moiVar = moiVar2;
                                momVar = momVar2;
                                molVar = molVar;
                                i14 = i5;
                                moeVarC = moeVar;
                            }
                        } else {
                            molVar = molVar;
                            i3 = momVar.d;
                            if (i3 != iA) {
                                nvVar3 = nvVar2;
                                oeVar3 = oeVar2;
                                molVar.b = true;
                            } else {
                                nvVar3 = nvVar2;
                                oeVar3 = oeVar2;
                                molVar.b = true;
                            }
                        }
                        if (!molVar.b) {
                            break;
                            break;
                        }
                        iY = i2 - flowLayoutManager2.y(nvVar3, oeVar3, flowLayoutManager2.x, molVar);
                        if (!z) {
                        }
                        molVar2 = molVar;
                    }
                }
                molVar2 = molVar;
                nvVar3 = nvVar2;
                oeVar3 = oeVar2;
            }
        }
        if (l) {
            int iC = flowLayoutManager2.c();
            int i20 = flowLayoutManager2.O;
            if (i20 == -1 || Math.abs(iC - i20) >= 30) {
                final moi moiVar5 = flowLayoutManager2.F;
                if (iC >= 0 && (i9 = iC - 60) > 0) {
                    if (b) {
                        TreeMap treeMap = moiVar5.k;
                        Integer numValueOf = Integer.valueOf(i9);
                        SortedMap sortedMapHeadMap = treeMap.headMap(numValueOf);
                        final ArrayList arrayList = new ArrayList();
                        Collection.EL.removeIf(sortedMapHeadMap.entrySet(), new Predicate() { // from class: mnz
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
                                mog mogVar2 = (mog) ((Map.Entry) obj).getValue();
                                int i21 = mogVar2.b;
                                if (i21 == -1 || i21 >= i9) {
                                    return false;
                                }
                                if (FlowLayoutManager.t) {
                                    mogVar2.e();
                                }
                                if (FlowLayoutManager.i) {
                                    ArrayList arrayList2 = new ArrayList(mogVar2.e);
                                    int size = arrayList2.size();
                                    for (int i22 = 0; i22 < size; i22++) {
                                        moiVar5.g((moe) arrayList2.get(i22), mogVar2);
                                    }
                                }
                                arrayList.add(mogVar2);
                                return true;
                            }
                        });
                        moiVar5.j.removeAll(arrayList);
                        if (m && (entryFloorEntry = treeMap.floorEntry(numValueOf)) != null && ((i11 = (mogVar = (mog) entryFloorEntry.getValue()).b) == -1 || i11 >= i9)) {
                            mogVar.c(i9, moiVar5);
                        }
                    } else {
                        List<mog> list2 = moiVar5.j;
                        Collection.EL.removeIf(list2, new Predicate() { // from class: moa
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
                                mog mogVar2 = (mog) obj;
                                int i21 = mogVar2.b;
                                if (i21 == -1 || i21 >= i9) {
                                    return false;
                                }
                                if (FlowLayoutManager.t) {
                                    mogVar2.e();
                                }
                                if (FlowLayoutManager.i) {
                                    ArrayList arrayList2 = new ArrayList(mogVar2.e);
                                    int size = arrayList2.size();
                                    for (int i22 = 0; i22 < size; i22++) {
                                        moiVar5.g((moe) arrayList2.get(i22), mogVar2);
                                    }
                                }
                                return true;
                            }
                        });
                        if (m) {
                            for (mog mogVar2 : list2) {
                                if (mogVar2.a <= i9 && ((i10 = mogVar2.b) == -1 || i10 >= i9)) {
                                    mogVar2.c(i9, moiVar5);
                                }
                            }
                        }
                    }
                }
                flowLayoutManager2.O = iC;
            }
        }
        return i12 - flowLayoutManager2.x.c;
    }

    public final int c() {
        View viewH = h(0, getChildCount(), false, true);
        if (viewH == null) {
            return -1;
        }
        return getPosition(viewH);
    }

    @Override // defpackage.np
    public final boolean canScrollHorizontally() {
        return this.w == 0;
    }

    @Override // defpackage.np
    public final boolean canScrollVertically() {
        return this.w == 1;
    }

    @Override // defpackage.np
    public final void collectAdjacentPrefetchPositions(int i2, int i3, oe oeVar, nn nnVar) {
        if (getChildCount() != 0) {
            if (1 == this.w) {
                i2 = i3;
            }
            if (i2 != 0) {
                G(i2 > 0 ? 1 : -1, Math.abs(i2), true, oeVar);
                mom momVar = this.x;
                int i4 = momVar.d;
                if (i4 < 0 || i4 >= oeVar.a()) {
                    return;
                }
                nnVar.a(i4, Math.max(0, momVar.g));
            }
        }
    }

    @Override // defpackage.np
    public final void collectInitialPrefetchPositions(int i2, nn nnVar) {
        boolean z;
        int i3;
        mon monVar = this.D;
        if (monVar == null || !monVar.b()) {
            F();
            z = this.z;
            i3 = this.B;
            if (i3 == -1) {
                i3 = z ? i2 - 1 : 0;
            }
        } else {
            z = monVar.c;
            i3 = monVar.a;
        }
        int i4 = true != z ? 1 : -1;
        for (int i5 = 0; i5 < this.R && i3 >= 0 && i3 < i2; i5++) {
            nnVar.a(i3, 0);
            i3 += i4;
        }
    }

    @Override // defpackage.np
    public final int computeHorizontalScrollExtent(oe oeVar) {
        return r(oeVar);
    }

    @Override // defpackage.np
    public final int computeHorizontalScrollOffset(oe oeVar) {
        return s(oeVar);
    }

    @Override // defpackage.np
    public final int computeHorizontalScrollRange(oe oeVar) {
        return t(oeVar);
    }

    @Override // defpackage.oc
    public final PointF computeScrollVectorForPosition(int i2) {
        if (getChildCount() != 0) {
            View childAt = getChildAt(0);
            if (childAt != null) {
                float f2 = (i2 < getPosition(childAt)) != this.z ? -1 : 1;
                return this.w == 0 ? new PointF(f2, 0.0f) : new PointF(0.0f, f2);
            }
        }
        return null;
    }

    @Override // defpackage.np
    public final int computeVerticalScrollExtent(oe oeVar) {
        return r(oeVar);
    }

    @Override // defpackage.np
    public final int computeVerticalScrollOffset(oe oeVar) {
        return s(oeVar);
    }

    @Override // defpackage.np
    public final int computeVerticalScrollRange(oe oeVar) {
        return t(oeVar);
    }

    public final int d() {
        View viewH = h(getChildCount() - 1, -1, true, false);
        if (viewH != null) {
            return getPosition(viewH);
        }
        return -1;
    }

    public final int e() {
        View viewH = h(getChildCount() - 1, -1, false, true);
        if (viewH == null || viewH.getLayoutParams() == null) {
            return -1;
        }
        return getPosition(viewH);
    }

    protected final int f(oe oeVar) {
        if (oeVar.c()) {
            return this.y.k();
        }
        return 0;
    }

    @Override // defpackage.np
    public final View findViewByPosition(int i2) {
        View childAt;
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        View childAt2 = getChildAt(0);
        if (childAt2 == null) {
            return super.findViewByPosition(i2);
        }
        int position = i2 - getPosition(childAt2);
        return (position < 0 || position >= childCount || (childAt = getChildAt(position)) == null || getPosition(childAt) != i2) ? super.findViewByPosition(i2) : childAt;
    }

    final int g(int i2, nv nvVar, oe oeVar) {
        if (getChildCount() == 0 || i2 == 0) {
            return 0;
        }
        this.x.a = true;
        i();
        int i3 = i2 > 0 ? 1 : -1;
        int iAbs = Math.abs(i2);
        G(i3, iAbs, true, oeVar);
        int iB = this.x.g + b(nvVar, oeVar, false);
        if (iB < 0) {
            return 0;
        }
        if (iAbs > iB) {
            i2 = i3 * iB;
        }
        this.y.n(-i2);
        this.x.j = i2;
        return i2;
    }

    @Override // defpackage.np
    public final nq generateDefaultLayoutParams() {
        return new nq(-2, -2);
    }

    public final View h(int i2, int i3, boolean z, boolean z2) {
        i();
        int iJ = this.y.j();
        int iF = this.y.f();
        View view = null;
        int i4 = i2;
        while (i4 != i3) {
            View childAt = getChildAt(i4);
            if (childAt != null) {
                int iD = this.y.d(childAt);
                int iA = this.y.a(childAt);
                if (iD <= iF && iA >= iJ) {
                    if (z) {
                        if (iD >= iJ && iA <= iF) {
                            return childAt;
                        }
                        if (z2 && view == null) {
                            view = childAt;
                        }
                    } else if ((iD < iF && iA > iJ) || iD == iA) {
                        return childAt;
                    }
                }
            }
            i4 += i3 > i2 ? 1 : -1;
        }
        return view;
    }

    final void i() {
        if (this.x == null) {
            this.x = new mom();
        }
        if (this.y == null) {
            this.y = nd.p(this, this.w);
        }
        moi moiVar = this.F;
        if (moiVar.o == null) {
            moiVar.o = nd.p(this, moiVar.p);
        }
    }

    @Override // defpackage.np
    public final boolean isAutoMeasureEnabled() {
        return true;
    }

    public final void j(View view, mod modVar, moh mohVar, int i2, int i3) {
        nq nqVar;
        if (p && view.getVisibility() == 8) {
            modVar.h = 0;
            modVar.j = 0;
            return;
        }
        if (k && mohVar != null && mohVar.e == 1 && i2 != -1 && i3 != -1 && (nqVar = (nq) view.getLayoutParams()) != null && (nqVar.leftMargin | nqVar.rightMargin | nqVar.topMargin | nqVar.bottomMargin) == 0 && (this.w != 1 ? !(nqVar.height != -1 || nqVar.width >= 0) : !(nqVar.width != -1 || nqVar.height >= 0))) {
            view.measure(i2, i3);
            nd ndVar = this.y;
            if (ndVar != null) {
                modVar.h = ndVar.b(view);
                modVar.j = this.y.c(view);
                return;
            }
            return;
        }
        int i4 = modVar.g;
        int i5 = modVar.m;
        if (i4 > 0) {
            if (i5 == 2) {
                int width = ((getWidth() - getPaddingLeft()) - getPaddingRight()) - i4;
                if (this.w == 1) {
                    measureChildWithMargins(view, width, 0);
                    return;
                } else {
                    measureChildWithMargins(view, 0, width);
                    return;
                }
            }
            if (i5 == 3 && mohVar != null) {
                ahno.O(mohVar.e > 0);
                int i6 = mohVar.b + i4;
                int i7 = mohVar.e - 1;
                nq nqVar2 = (nq) view.getLayoutParams();
                nqVar2.getClass();
                if (nqVar2.width == -1) {
                    nqVar2.width = i4;
                    view.setLayoutParams(nqVar2);
                }
                measureChildWithMargins(view, i6 * i7, 0);
                nd ndVar2 = this.y;
                if (ndVar2 != null) {
                    modVar.h = ndVar2.b(view);
                    modVar.j = this.y.c(view);
                    return;
                }
                return;
            }
        }
        measureChildWithMargins(view, 0, 0);
        nd ndVar3 = this.y;
        if (ndVar3 != null) {
            modVar.h = ndVar3.b(view);
            modVar.j = this.y.c(view);
        }
    }

    public final void k(View view, nv nvVar, boolean z) {
        nd ndVar;
        mom momVar = this.x;
        if (momVar == null || momVar.k == null) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                if (getChildAt(i2) == view) {
                    if (q && !z && (ndVar = this.y) != null) {
                        int iJ = ndVar.j();
                        int iF = this.y.f();
                        int iD = this.y.d(view);
                        if (this.y.a(view) <= iJ || iD >= iF) {
                            removeAndRecycleView(view, nvVar);
                            return;
                        }
                    }
                    detachAndScrapView(view, nvVar);
                    return;
                }
            }
        }
        removeAndRecycleView(view, nvVar);
    }

    public final void l(int i2, int i3) {
        this.B = i2;
        this.C = i3;
        mon monVar = this.D;
        if (monVar != null) {
            monVar.a();
        }
        requestLayout();
    }

    public final void m(int i2) {
        if (this.G != i2) {
            this.G = i2;
            moi moiVar = this.F;
            if (moiVar.b != i2) {
                moiVar.b = i2;
                moiVar.j();
            }
            requestLayout();
        }
    }

    public final void n(int i2) {
        if (this.S != i2) {
            this.S = i2;
            moi moiVar = this.F;
            if (moiVar.a != i2) {
                moiVar.a = i2;
                moiVar.j();
            }
            requestLayout();
        }
    }

    protected final boolean o() {
        return getLayoutDirection() == 1;
    }

    @Override // defpackage.np
    public final void onAdapterChanged(nh nhVar, nh nhVar2) {
        moi moiVar = this.F;
        moiVar.j();
        moiVar.i(getItemCount());
    }

    @Override // defpackage.np
    public final void onDetachedFromWindow(RecyclerView recyclerView, nv nvVar) {
        super.onDetachedFromWindow(recyclerView, nvVar);
        if (this.P) {
            removeAndRecycleAllViews(nvVar);
            nvVar.c();
            moi moiVar = this.F;
            if (moiVar != null) {
                moiVar.h();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x004d  */
    /* JADX WARN: Code duplicated, block: B:38:0x004f  */
    @Override // defpackage.np
    public final View onFocusSearchFailed(View view, int i2, nv nvVar, oe oeVar) {
        int i3;
        F();
        if (getChildCount() == 0) {
            return null;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 17) {
                    if (i2 != 33) {
                        if (i2 == 66 ? this.w == 0 : !(i2 != 130 || this.w != 1)) {
                            i3 = 1;
                        }
                    } else if (this.w == 1) {
                        i3 = -1;
                    }
                    i3 = Integer.MIN_VALUE;
                } else if (this.w != 0) {
                    i3 = Integer.MIN_VALUE;
                } else {
                    i3 = -1;
                }
            } else if (this.w == 1 || !o()) {
                i3 = 1;
            } else {
                i3 = -1;
            }
        } else if (this.w == 1 || !o()) {
            i3 = -1;
        } else {
            i3 = 1;
        }
        if (i3 == Integer.MIN_VALUE) {
            return null;
        }
        i();
        View viewS = i3 == -1 ? S(oeVar) : R(oeVar);
        if (viewS == null) {
            return null;
        }
        i();
        G(i3, (int) (this.y.k() * 0.33333334f), false, oeVar);
        mom momVar = this.x;
        momVar.g = Integer.MIN_VALUE;
        momVar.a = false;
        b(nvVar, oeVar, true);
        View viewB = i3 == -1 ? B() : A();
        if (viewB == viewS || !viewB.isFocusable()) {
            return null;
        }
        return viewB;
    }

    @Override // defpackage.np
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(c());
            accessibilityEvent.setToIndex(e());
        }
    }

    @Override // defpackage.np
    public final void onItemsAdded(RecyclerView recyclerView, int i2, int i3) {
        this.F.i(i2);
    }

    @Override // defpackage.np
    public final void onItemsChanged(RecyclerView recyclerView) {
        moi moiVar = this.F;
        moiVar.j();
        moiVar.i(getItemCount());
    }

    @Override // defpackage.np
    public final void onItemsMoved(RecyclerView recyclerView, int i2, int i3, int i4) {
        this.F.i(Math.min(i2, i3));
    }

    @Override // defpackage.np
    public final void onItemsRemoved(RecyclerView recyclerView, int i2, int i3) {
        this.F.i(i2);
    }

    @Override // defpackage.np
    public final void onItemsUpdated(RecyclerView recyclerView, int i2, int i3) {
        this.F.i(i2);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x019b  */
    /* JADX WARN: Code duplicated, block: B:122:0x0256  */
    /* JADX WARN: Code duplicated, block: B:124:0x025c  */
    /* JADX WARN: Code duplicated, block: B:126:0x0260  */
    /* JADX WARN: Code duplicated, block: B:127:0x0265  */
    /* JADX WARN: Code duplicated, block: B:129:0x026b  */
    /* JADX WARN: Code duplicated, block: B:131:0x0272  */
    /* JADX WARN: Code duplicated, block: B:135:0x0292 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:136:0x0294 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:140:0x029c  */
    /* JADX WARN: Code duplicated, block: B:142:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:144:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:145:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:24:0x0049  */
    /* JADX WARN: Code duplicated, block: B:26:0x0056  */
    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    /* JADX WARN: Code duplicated, block: B:99:0x0195  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v71 */
    /* JADX WARN: Type inference failed for: r6v72, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v73 */
    @Override // defpackage.np
    public final void onLayoutChildren(nv nvVar, oe oeVar) {
        View childAt;
        int position;
        int iA;
        View focusedChild;
        View viewS;
        int iD;
        int iJ;
        int iF;
        nq nqVar;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        ?? r6;
        int i7;
        int i8;
        int iU;
        int i9;
        View viewFindViewByPosition;
        int iD2;
        int iF2;
        int i10 = -1;
        if (!(this.D == null && this.B == -1) && oeVar.a() == 0) {
            removeAndRecycleAllViews(nvVar);
            return;
        }
        mon monVar = this.D;
        if (monVar != null && monVar.b()) {
            this.B = monVar.a;
        }
        i();
        moi moiVar = this.F;
        int width = getWidth();
        int height = getHeight();
        int i11 = moiVar.m;
        boolean z = false;
        if (i11 != -1) {
            if (i11 == width || moiVar.n != height) {
                moiVar.m = width;
                moiVar.n = height;
                moiVar.j();
                childAt = getChildAt(0);
                if (childAt == null) {
                    position = -1;
                } else {
                    position = getPosition(childAt);
                }
                moiVar.q = position;
            }
        } else if (moiVar.n == -1) {
            moiVar.m = width;
            moiVar.n = height;
        } else {
            i11 = -1;
            if (i11 == width) {
                moiVar.m = width;
                moiVar.n = height;
                moiVar.j();
                childAt = getChildAt(0);
                if (childAt == null) {
                    position = -1;
                } else {
                    position = getPosition(childAt);
                }
                moiVar.q = position;
            } else {
                moiVar.m = width;
                moiVar.n = height;
                moiVar.j();
                childAt = getChildAt(0);
                if (childAt == null) {
                    position = -1;
                } else {
                    position = getPosition(childAt);
                }
                moiVar.q = position;
            }
        }
        if (this.I && moiVar != null) {
            moiVar.i(oeVar.a());
        }
        if (this.H == -1 && !this.I) {
            moiVar.f(this, nvVar, oeVar, o());
        }
        this.x.a = false;
        F();
        moj mojVar = this.E;
        if (!mojVar.d || this.B != -1 || this.D != null) {
            mojVar.c();
            mojVar.c = this.z ^ this.A;
            if (oeVar.g || (i2 = this.B) == -1) {
                if (getChildCount() == 0) {
                    mojVar.a();
                    if (this.A) {
                        iA = oeVar.a() - 1;
                    } else {
                        iA = 0;
                    }
                    mojVar.a = iA;
                } else {
                    focusedChild = getFocusedChild();
                    if (focusedChild != null) {
                        nqVar = (nq) focusedChild.getLayoutParams();
                        nqVar.getClass();
                        if (nqVar.gN() && nqVar.gL() >= 0 && nqVar.gL() < oeVar.a()) {
                            FlowLayoutManager flowLayoutManager = mojVar.e;
                            int iO = flowLayoutManager.y.o();
                            if (iO >= 0) {
                                mojVar.b(focusedChild);
                            } else {
                                mojVar.a = flowLayoutManager.getPosition(focusedChild);
                                if (mojVar.c) {
                                    int iF3 = (flowLayoutManager.y.f() - iO) - flowLayoutManager.y.a(focusedChild);
                                    mojVar.b = flowLayoutManager.y.f() - iF3;
                                    if (iF3 > 0) {
                                        int iB = mojVar.b - flowLayoutManager.y.b(focusedChild);
                                        int iJ2 = flowLayoutManager.y.j();
                                        int iMin = iB - (iJ2 + Math.min(flowLayoutManager.y.d(focusedChild) - iJ2, 0));
                                        if (iMin < 0) {
                                            mojVar.b += Math.min(iF3, -iMin);
                                        }
                                    }
                                } else {
                                    int iD3 = flowLayoutManager.y.d(focusedChild);
                                    int iJ3 = iD3 - flowLayoutManager.y.j();
                                    mojVar.b = iD3;
                                    if (iJ3 > 0) {
                                        int iF4 = (flowLayoutManager.y.f() - Math.min(0, (flowLayoutManager.y.f() - iO) - flowLayoutManager.y.a(focusedChild))) - (iD3 + flowLayoutManager.y.b(focusedChild));
                                        if (iF4 < 0) {
                                            mojVar.b -= Math.min(iJ3, -iF4);
                                        }
                                    }
                                }
                            }
                        } else if (this.M != this.A) {
                            mojVar.a();
                            if (this.A) {
                                iA = oeVar.a() - 1;
                            } else {
                                iA = 0;
                            }
                            mojVar.a = iA;
                        } else {
                            if (mojVar.c) {
                                viewS = R(oeVar);
                            } else {
                                viewS = S(oeVar);
                            }
                            if (viewS != null) {
                                mojVar.b(viewS);
                                if (!oeVar.g && supportsPredictiveItemAnimations()) {
                                    iD = this.y.d(viewS);
                                    int iA2 = this.y.a(viewS);
                                    iJ = this.y.j();
                                    iF = this.y.f();
                                    if ((iD < iF && iA2 > iF) || (iA2 <= iJ && iD < iJ)) {
                                        if (true == mojVar.c) {
                                            iJ = iF;
                                        }
                                        mojVar.b = iJ;
                                    }
                                }
                            } else {
                                mojVar.a();
                                if (this.A) {
                                    iA = oeVar.a() - 1;
                                } else {
                                    iA = 0;
                                }
                                mojVar.a = iA;
                            }
                        }
                    } else if (this.M != this.A) {
                        mojVar.a();
                        if (this.A) {
                            iA = oeVar.a() - 1;
                        } else {
                            iA = 0;
                        }
                        mojVar.a = iA;
                    } else {
                        if (mojVar.c) {
                            viewS = R(oeVar);
                        } else {
                            viewS = S(oeVar);
                        }
                        if (viewS != null) {
                            mojVar.b(viewS);
                            if (!oeVar.g) {
                                iD = this.y.d(viewS);
                                int iA3 = this.y.a(viewS);
                                iJ = this.y.j();
                                iF = this.y.f();
                                if (iD < iF) {
                                    if (true == mojVar.c) {
                                        iJ = iF;
                                    }
                                    mojVar.b = iJ;
                                } else {
                                    if (true == mojVar.c) {
                                        iJ = iF;
                                    }
                                    mojVar.b = iJ;
                                }
                            }
                        } else {
                            mojVar.a();
                            if (this.A) {
                                iA = oeVar.a() - 1;
                            } else {
                                iA = 0;
                            }
                            mojVar.a = iA;
                        }
                    }
                }
            } else if (i2 < 0 || i2 >= oeVar.a()) {
                this.B = -1;
                this.C = Integer.MIN_VALUE;
                if (getChildCount() == 0) {
                    mojVar.a();
                    if (this.A) {
                        iA = oeVar.a() - 1;
                    } else {
                        iA = 0;
                    }
                    mojVar.a = iA;
                } else {
                    focusedChild = getFocusedChild();
                    if (focusedChild != null) {
                        nqVar = (nq) focusedChild.getLayoutParams();
                        nqVar.getClass();
                        if (nqVar.gN()) {
                            if (this.M != this.A) {
                                mojVar.a();
                                if (this.A) {
                                    iA = oeVar.a() - 1;
                                } else {
                                    iA = 0;
                                }
                                mojVar.a = iA;
                            } else {
                                if (mojVar.c) {
                                    viewS = R(oeVar);
                                } else {
                                    viewS = S(oeVar);
                                }
                                if (viewS != null) {
                                    mojVar.b(viewS);
                                    if (!oeVar.g) {
                                        iD = this.y.d(viewS);
                                        int iA4 = this.y.a(viewS);
                                        iJ = this.y.j();
                                        iF = this.y.f();
                                        if (iD < iF) {
                                            if (true == mojVar.c) {
                                                iJ = iF;
                                            }
                                            mojVar.b = iJ;
                                        } else {
                                            if (true == mojVar.c) {
                                                iJ = iF;
                                            }
                                            mojVar.b = iJ;
                                        }
                                    }
                                } else {
                                    mojVar.a();
                                    if (this.A) {
                                        iA = oeVar.a() - 1;
                                    } else {
                                        iA = 0;
                                    }
                                    mojVar.a = iA;
                                }
                            }
                        } else if (this.M != this.A) {
                            mojVar.a();
                            if (this.A) {
                                iA = oeVar.a() - 1;
                            } else {
                                iA = 0;
                            }
                            mojVar.a = iA;
                        } else {
                            if (mojVar.c) {
                                viewS = R(oeVar);
                            } else {
                                viewS = S(oeVar);
                            }
                            if (viewS != null) {
                                mojVar.b(viewS);
                                if (!oeVar.g) {
                                    iD = this.y.d(viewS);
                                    int iA5 = this.y.a(viewS);
                                    iJ = this.y.j();
                                    iF = this.y.f();
                                    if (iD < iF) {
                                        if (true == mojVar.c) {
                                            iJ = iF;
                                        }
                                        mojVar.b = iJ;
                                    } else {
                                        if (true == mojVar.c) {
                                            iJ = iF;
                                        }
                                        mojVar.b = iJ;
                                    }
                                }
                            } else {
                                mojVar.a();
                                if (this.A) {
                                    iA = oeVar.a() - 1;
                                } else {
                                    iA = 0;
                                }
                                mojVar.a = iA;
                            }
                        }
                    } else if (this.M != this.A) {
                        mojVar.a();
                        if (this.A) {
                            iA = oeVar.a() - 1;
                        } else {
                            iA = 0;
                        }
                        mojVar.a = iA;
                    } else {
                        if (mojVar.c) {
                            viewS = R(oeVar);
                        } else {
                            viewS = S(oeVar);
                        }
                        if (viewS != null) {
                            mojVar.b(viewS);
                            if (!oeVar.g) {
                                iD = this.y.d(viewS);
                                int iA6 = this.y.a(viewS);
                                iJ = this.y.j();
                                iF = this.y.f();
                                if (iD < iF) {
                                    if (true == mojVar.c) {
                                        iJ = iF;
                                    }
                                    mojVar.b = iJ;
                                } else {
                                    if (true == mojVar.c) {
                                        iJ = iF;
                                    }
                                    mojVar.b = iJ;
                                }
                            }
                        } else {
                            mojVar.a();
                            if (this.A) {
                                iA = oeVar.a() - 1;
                            } else {
                                iA = 0;
                            }
                            mojVar.a = iA;
                        }
                    }
                }
            } else {
                int i12 = this.B;
                mojVar.a = i12;
                mon monVar2 = this.D;
                if (monVar2 != null && monVar2.b()) {
                    boolean z2 = monVar2.c;
                    mojVar.c = z2;
                    nd ndVar = this.y;
                    if (z2) {
                        mojVar.b = ndVar.f() - monVar2.b;
                    } else {
                        mojVar.b = ndVar.j() + monVar2.b;
                    }
                } else if (this.C == Integer.MIN_VALUE) {
                    View viewFindViewByPosition2 = findViewByPosition(i12);
                    if (viewFindViewByPosition2 == null) {
                        if (getChildCount() > 0) {
                            View childAt2 = getChildAt(0);
                            childAt2.getClass();
                            int position2 = getPosition(childAt2);
                            if (position2 >= 0 && (i3 = this.B) != 0) {
                                mojVar.c = (i3 < position2) == this.z;
                            }
                        }
                        mojVar.a();
                    } else if (this.y.b(viewFindViewByPosition2) > this.y.k()) {
                        mojVar.a();
                    } else {
                        int iD4 = this.y.d(viewFindViewByPosition2) - this.y.j();
                        nd ndVar2 = this.y;
                        if (iD4 < 0) {
                            mojVar.b = ndVar2.j();
                            mojVar.c = false;
                        } else if (ndVar2.f() - this.y.a(viewFindViewByPosition2) < 0) {
                            mojVar.b = this.y.f();
                            mojVar.c = true;
                        } else {
                            boolean z3 = mojVar.c;
                            nd ndVar3 = this.y;
                            mojVar.b = z3 ? ndVar3.a(viewFindViewByPosition2) + this.y.o() : ndVar3.d(viewFindViewByPosition2);
                        }
                    }
                } else {
                    boolean z4 = this.z;
                    mojVar.c = z4;
                    nd ndVar4 = this.y;
                    if (z4) {
                        mojVar.b = ndVar4.f() - this.C;
                    } else {
                        mojVar.b = ndVar4.j() + this.C;
                    }
                }
            }
            mojVar.d = true;
        }
        int iF5 = f(oeVar);
        if (this.x.j >= 0) {
            i4 = iF5;
            iF5 = 0;
        } else {
            i4 = 0;
        }
        int iJ4 = iF5 + this.y.j();
        int iG = i4 + this.y.g();
        if (oeVar.g && (i9 = this.B) != -1 && this.C != Integer.MIN_VALUE && (viewFindViewByPosition = findViewByPosition(i9)) != null) {
            boolean z5 = this.z;
            nd ndVar5 = this.y;
            if (z5) {
                iF2 = ndVar5.f() - this.y.a(viewFindViewByPosition);
                iD2 = this.C;
            } else {
                iD2 = ndVar5.d(viewFindViewByPosition) - this.y.j();
                iF2 = this.C;
            }
            int i13 = iF2 - iD2;
            if (i13 > 0) {
                iJ4 += i13;
            } else {
                iG -= i13;
            }
        }
        boolean z6 = mojVar.c;
        detachAndScrapAttachedViews(nvVar);
        this.x.l = p();
        this.x.i = oeVar.g;
        boolean z7 = mojVar.c;
        boolean z8 = this.z;
        if (z7) {
            moiVar.m(mojVar, z8);
            J(mojVar);
            this.x.h = iJ4;
            b(nvVar, oeVar, false);
            mom momVar = this.x;
            i6 = momVar.b;
            int i14 = momVar.d;
            int i15 = momVar.c;
            if (i15 > 0) {
                iG += i15;
            }
            H(mojVar);
            mom momVar2 = this.x;
            momVar2.h = iG;
            momVar2.d += momVar2.e;
            b(nvVar, oeVar, false);
            mom momVar3 = this.x;
            i5 = momVar3.b;
            int i16 = momVar3.c;
            if (i16 > 0) {
                K(i14, i6);
                this.x.h = i16;
                b(nvVar, oeVar, false);
                i6 = this.x.b;
            }
        } else {
            moiVar.m(mojVar, z8);
            H(mojVar);
            this.x.h = iG;
            b(nvVar, oeVar, false);
            mom momVar4 = this.x;
            i5 = momVar4.b;
            int i17 = momVar4.d;
            int i18 = momVar4.c;
            if (i18 > 0) {
                iJ4 += i18;
            }
            J(mojVar);
            mom momVar5 = this.x;
            momVar5.h = iJ4;
            momVar5.d += momVar5.e;
            b(nvVar, oeVar, false);
            mom momVar6 = this.x;
            i6 = momVar6.b;
            int i19 = momVar6.c;
            if (i19 > 0) {
                I(i17, i5);
                this.x.h = i19;
                b(nvVar, oeVar, false);
                i5 = this.x.b;
            }
        }
        if (getChildCount() > 0) {
            if (this.z ^ this.A) {
                int iU2 = u(i5, nvVar, oeVar, true);
                i7 = i6 + iU2;
                i8 = i5 + iU2;
                iU = v(i7, nvVar, oeVar, false);
            } else {
                int iV = v(i6, nvVar, oeVar, true);
                i7 = i6 + iV;
                i8 = i5 + iV;
                iU = u(i8, nvVar, oeVar, false);
            }
            i6 = i7 + iU;
            i5 = i8 + iU;
        }
        if (oeVar.k && getChildCount() != 0 && !oeVar.g && supportsPredictiveItemAnimations()) {
            List list = nvVar.d;
            int size = list.size();
            View childAt3 = getChildAt(0);
            if (childAt3 != null) {
                int position3 = getPosition(childAt3);
                int i20 = 0;
                int iB2 = 0;
                int iB3 = 0;
                while (i20 < size) {
                    oh ohVar = (oh) list.get(i20);
                    if (ohVar.b() != i10) {
                        boolean z9 = ohVar.c() >= position3 ? z : true;
                        boolean z10 = this.z;
                        nd ndVar6 = this.y;
                        if (z9 != z10) {
                            iB2 += ndVar6.b(ohVar.a);
                        } else {
                            iB3 += ndVar6.b(ohVar.a);
                        }
                    }
                    i20++;
                    i10 = -1;
                    z = false;
                }
                this.x.k = list;
                if (iB2 > 0) {
                    K(getPosition(B()), i6);
                    mom momVar7 = this.x;
                    momVar7.h = iB2;
                    r6 = 0;
                    momVar7.c = 0;
                    momVar7.b(null);
                    b(nvVar, oeVar, false);
                } else {
                    r6 = 0;
                }
                if (iB3 > 0) {
                    I(getPosition(A()), i5);
                    mom momVar8 = this.x;
                    momVar8.h = iB3;
                    momVar8.c = r6;
                    momVar8.b(null);
                    b(nvVar, oeVar, r6);
                }
                this.x.k = null;
            }
        }
        if (oeVar.g) {
            mojVar.c();
        } else {
            this.y.q();
        }
        this.M = this.A;
    }

    @Override // defpackage.np
    public final void onLayoutCompleted(oe oeVar) {
        this.D = null;
        this.B = -1;
        this.C = Integer.MIN_VALUE;
        this.E.c();
    }

    @Override // defpackage.np
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof mon) {
            this.D = (mon) parcelable;
            requestLayout();
        }
    }

    @Override // defpackage.np
    public final Parcelable onSaveInstanceState() {
        mon monVar = this.D;
        if (monVar != null) {
            return new mon(monVar);
        }
        mon monVar2 = new mon();
        if (getChildCount() > 0) {
            i();
            boolean z = this.M ^ this.z;
            monVar2.c = z;
            if (z) {
                View viewA = A();
                monVar2.b = this.y.f() - this.y.a(viewA);
                monVar2.a = getPosition(viewA);
            } else {
                View viewB = B();
                monVar2.a = getPosition(viewB);
                monVar2.b = this.y.d(viewB) - this.y.j();
            }
        } else {
            monVar2.a();
        }
        return monVar2;
    }

    final boolean p() {
        return this.y.h() == 0 && this.y.e() == 0;
    }

    @Override // defpackage.pu
    public final void prepareForDrop(View view, View view2, int i2, int i3) {
        assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        i();
        F();
        int position = getPosition(view);
        int position2 = getPosition(view2);
        boolean z = this.z;
        byte b2 = position < position2 ? (byte) 1 : (byte) -1;
        if (z) {
            nd ndVar = this.y;
            if (b2 == 1) {
                l(position2, ndVar.f() - (this.y.d(view2) + this.y.b(view)));
                return;
            } else {
                l(position2, ndVar.f() - this.y.a(view2));
                return;
            }
        }
        nd ndVar2 = this.y;
        if (b2 == -1) {
            l(position2, ndVar2.d(view2));
        } else {
            l(position2, ndVar2.a(view2) - this.y.b(view));
        }
    }

    final View q(int i2, int i3, int i4) {
        int position;
        i();
        int iJ = this.y.j();
        int iF = this.y.f();
        View view = null;
        int i5 = i2;
        View view2 = null;
        while (i5 != i3) {
            View childAt = getChildAt(i5);
            if (childAt != null && (position = getPosition(childAt)) >= 0 && position < i4) {
                nq nqVar = (nq) childAt.getLayoutParams();
                nqVar.getClass();
                if (!nqVar.gN()) {
                    int iD = this.y.d(childAt);
                    int iA = this.y.a(childAt);
                    if ((iD < iF || iA <= iF) && (iA > iJ || iD >= iJ)) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                } else if (view2 == null) {
                    view2 = childAt;
                }
            }
            i5 += i3 > i2 ? 1 : -1;
        }
        return view == null ? view2 : view;
    }

    @Override // defpackage.np
    public final int scrollHorizontallyBy(int i2, nv nvVar, oe oeVar) {
        if (this.w == 1) {
            return 0;
        }
        return g(i2, nvVar, oeVar);
    }

    @Override // defpackage.np
    public final void scrollToPosition(int i2) {
        this.F.q = i2;
        this.B = i2;
        this.C = Integer.MIN_VALUE;
        mon monVar = this.D;
        if (monVar != null) {
            monVar.a();
        }
        requestLayout();
    }

    @Override // defpackage.np
    public final int scrollVerticallyBy(int i2, nv nvVar, oe oeVar) {
        if (this.w == 0) {
            return 0;
        }
        return g(i2, nvVar, oeVar);
    }

    @Override // defpackage.np
    public final void smoothScrollToPosition(RecyclerView recyclerView, oe oeVar, int i2) {
        od odVar = new od(recyclerView.getContext());
        odVar.b = i2;
        startSmoothScroll(odVar);
    }

    @Override // defpackage.np
    public final boolean supportsPredictiveItemAnimations() {
        return !this.I && this.D == null && this.M == this.A;
    }
}
