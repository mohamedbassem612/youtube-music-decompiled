package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.car.app.model.Alert;
import defpackage.bbz;
import defpackage.mc;
import defpackage.mn;
import defpackage.nd;
import defpackage.nh;
import defpackage.nn;
import defpackage.no;
import defpackage.np;
import defpackage.nq;
import defpackage.nv;
import defpackage.oc;
import defpackage.od;
import defpackage.oe;
import defpackage.or;
import defpackage.os;
import defpackage.ot;
import defpackage.ou;
import defpackage.ov;
import defpackage.qa;
import defpackage.yv;
import defpackage.zs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class StaggeredGridLayoutManager extends np implements oc {
    ov[] a;
    public nd b;
    nd c;
    private int i;
    private int j;
    private int k;
    private final mn l;
    private BitSet m;
    private boolean o;
    private boolean p;
    private ou q;
    private int[] u;
    public boolean d = false;
    boolean e = false;
    int f = -1;
    int g = Integer.MIN_VALUE;
    yv h = new yv();
    private int n = 2;
    private final Rect r = new Rect();
    private final or s = new or(this);
    private boolean t = true;
    private final Runnable v = new mc(this, 6);

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.i = -1;
        no properties = getProperties(context, attributeSet, i, i2);
        int i3 = properties.a;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        assertNotInLayoutOrScroll(null);
        if (i3 != this.j) {
            this.j = i3;
            nd ndVar = this.b;
            this.b = this.c;
            this.c = ndVar;
            requestLayout();
        }
        int i4 = properties.b;
        assertNotInLayoutOrScroll(null);
        if (i4 != this.i) {
            this.h.a();
            requestLayout();
            this.i = i4;
            this.m = new BitSet(i4);
            this.a = new ov[this.i];
            for (int i5 = 0; i5 < this.i; i5++) {
                this.a[i5] = new ov(this, i5);
            }
            requestLayout();
        }
        h(properties.c);
        this.l = new mn();
        this.b = nd.p(this, this.j);
        this.c = nd.p(this, 1 - this.j);
    }

    private final void A(nv nvVar, int i) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (this.b.a(childAt) > i || this.b.l(childAt) > i) {
                return;
            }
            os osVar = (os) childAt.getLayoutParams();
            boolean z = osVar.b;
            if (osVar.a.a.size() == 1) {
                return;
            }
            ov ovVar = osVar.a;
            ArrayList arrayList = ovVar.a;
            View view = (View) arrayList.remove(0);
            os osVarN = ov.n(view);
            osVarN.a = null;
            if (arrayList.size() == 0) {
                ovVar.c = Integer.MIN_VALUE;
            }
            if (osVarN.gN() || osVarN.gM()) {
                ovVar.d -= ovVar.f.b.b(view);
            }
            ovVar.b = Integer.MIN_VALUE;
            removeAndRecycleView(childAt, nvVar);
        }
    }

    private final void B() {
        this.e = (this.j == 1 || !k()) ? this.d : !this.d;
    }

    private final void C(int i) {
        mn mnVar = this.l;
        mnVar.e = i;
        mnVar.d = this.e != (i == -1) ? -1 : 1;
    }

    private final void D(int i, oe oeVar) {
        int iK;
        int iK2;
        int i2;
        mn mnVar = this.l;
        boolean z = false;
        mnVar.b = 0;
        mnVar.c = i;
        if (!isSmoothScrolling() || (i2 = oeVar.a) == -1) {
            iK = 0;
            iK2 = 0;
        } else {
            boolean z2 = this.e;
            boolean z3 = i2 < i;
            nd ndVar = this.b;
            if (z2 == z3) {
                iK = ndVar.k();
                iK2 = 0;
            } else {
                iK2 = ndVar.k();
                iK = 0;
            }
        }
        boolean clipToPadding = getClipToPadding();
        nd ndVar2 = this.b;
        if (clipToPadding) {
            mnVar.f = ndVar2.j() - iK2;
            mnVar.g = this.b.f() + iK;
        } else {
            mnVar.g = ndVar2.e() + iK;
            mnVar.f = -iK2;
        }
        mnVar.h = false;
        mnVar.a = true;
        if (this.b.h() == 0 && this.b.e() == 0) {
            z = true;
        }
        mnVar.i = z;
    }

    private final void E(ov ovVar, int i, int i2) {
        int i3 = ovVar.d;
        if (i == -1) {
            if (ovVar.e() + i3 <= i2) {
                this.m.set(ovVar.e, false);
            }
        } else if (ovVar.c() - i3 >= i2) {
            this.m.set(ovVar.e, false);
        }
    }

    private final boolean F(int i) {
        int i2 = this.j;
        boolean z = i == -1;
        boolean z2 = this.e;
        if (i2 != 0) {
            if ((z == z2) != k()) {
                return false;
            }
        } else if (z == z2) {
            return false;
        }
        return true;
    }

    private final void G(View view, int i, int i2) {
        Rect rect = this.r;
        calculateItemDecorationsForChild(view, rect);
        os osVar = (os) view.getLayoutParams();
        int iH = H(i, osVar.leftMargin + rect.left, osVar.rightMargin + rect.right);
        int iH2 = H(i2, osVar.topMargin + rect.top, osVar.bottomMargin + rect.bottom);
        if (shouldMeasureChild(view, iH, iH2, osVar)) {
            view.measure(iH, iH2);
        }
    }

    private static final int H(int i, int i2, int i3) {
        if (i2 == 0) {
            if (i3 == 0) {
                return i;
            }
            i2 = 0;
        }
        int mode = View.MeasureSpec.getMode(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 1073741824) {
                return i;
            }
            mode = 1073741824;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode);
    }

    private final int l(int i) {
        if (getChildCount() != 0) {
            if ((i < a()) != this.e) {
                return -1;
            }
        } else if (!this.e) {
            return -1;
        }
        return 1;
    }

    private final int m(oe oeVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        return qa.x(oeVar, this.b, e(!this.t), d(!this.t), this, this.t);
    }

    private final int n(oe oeVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        return qa.y(oeVar, this.b, e(!this.t), d(!this.t), this, this.t, this.e);
    }

    private final int o(oe oeVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        return qa.z(oeVar, this.b, e(!this.t), d(!this.t), this, this.t);
    }

    /* JADX WARN: Code duplicated, block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001c, code lost:
    
        if (r5.j == 1) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int p(int r6) {
        /*
            r5 = this;
            r0 = -1
            r1 = 1
            if (r6 == r1) goto L32
            r2 = 2
            if (r6 == r2) goto L27
            r2 = 17
            r3 = 0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 == r2) goto L20
            r2 = 33
            if (r6 == r2) goto L21
            r0 = 66
            if (r6 == r0) goto L1f
            r0 = 130(0x82, float:1.82E-43)
            if (r6 != r0) goto L25
            int r5 = r5.j
            if (r5 != r1) goto L25
            goto L3c
        L1f:
            r0 = r1
        L20:
            r1 = r3
        L21:
            int r5 = r5.j
            if (r5 == r1) goto L3d
        L25:
            r0 = r4
            goto L3d
        L27:
            int r6 = r5.j
            if (r6 == r1) goto L3c
            boolean r5 = r5.k()
            if (r5 == 0) goto L3c
            goto L3d
        L32:
            int r6 = r5.j
            if (r6 == r1) goto L3d
            boolean r5 = r5.k()
            if (r5 == 0) goto L3d
        L3c:
            r0 = r1
        L3d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.p(int):int");
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0097  */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v34 */
    private final int q(nv nvVar, mn mnVar, oe oeVar) {
        int i;
        ov ovVar;
        ?? r2;
        int iF;
        int iB;
        int iJ;
        int iB2;
        int i2;
        int i3;
        int i4;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this;
        int i5 = 0;
        int i6 = 1;
        staggeredGridLayoutManager.m.set(0, staggeredGridLayoutManager.i, true);
        mn mnVar2 = staggeredGridLayoutManager.l;
        int i7 = mnVar2.i ? mnVar.e == 1 ? Alert.DURATION_SHOW_INDEFINITELY : Integer.MIN_VALUE : mnVar.e == 1 ? mnVar.g + mnVar.b : mnVar.f - mnVar.b;
        int i8 = mnVar.e;
        for (int i9 = 0; i9 < staggeredGridLayoutManager.i; i9++) {
            if (!staggeredGridLayoutManager.a[i9].a.isEmpty()) {
                staggeredGridLayoutManager.E(staggeredGridLayoutManager.a[i9], i8, i7);
            }
        }
        boolean z = staggeredGridLayoutManager.e;
        nd ndVar = staggeredGridLayoutManager.b;
        int iF2 = z ? ndVar.f() : ndVar.j();
        boolean z2 = false;
        while (mnVar.a(oeVar) && (mnVar2.i || !staggeredGridLayoutManager.m.isEmpty())) {
            View viewN = nvVar.n(mnVar.c);
            mnVar.c += mnVar.d;
            os osVar = (os) viewN.getLayoutParams();
            int iGL = osVar.gL();
            Object obj = staggeredGridLayoutManager.h.b;
            if (obj != null) {
                int[] iArr = (int[]) obj;
                if (iGL < iArr.length) {
                    i = iArr[iGL];
                } else {
                    i = -1;
                }
            } else {
                i = -1;
            }
            int i10 = i == -1 ? i6 : i5;
            if (i10 != 0) {
                boolean z3 = osVar.b;
                boolean zF = staggeredGridLayoutManager.F(mnVar.e);
                int i11 = staggeredGridLayoutManager.i;
                if (zF) {
                    i4 = i11 - 1;
                    i3 = -1;
                    i2 = -1;
                } else {
                    i2 = i6;
                    i3 = i11;
                    i4 = i5;
                }
                int i12 = mnVar.e;
                nd ndVar2 = staggeredGridLayoutManager.b;
                ov ovVar2 = null;
                if (i12 == i6) {
                    int iJ2 = ndVar2.j();
                    int i13 = Alert.DURATION_SHOW_INDEFINITELY;
                    while (i4 != i3) {
                        ov ovVar3 = staggeredGridLayoutManager.a[i4];
                        int iD = ovVar3.d(iJ2);
                        if (iD < i13) {
                            ovVar2 = ovVar3;
                            i13 = iD;
                        }
                        i4 += i2;
                    }
                } else {
                    int iF3 = ndVar2.f();
                    int i14 = Integer.MIN_VALUE;
                    while (i4 != i3) {
                        ov ovVar4 = staggeredGridLayoutManager.a[i4];
                        int iF4 = ovVar4.f(iF3);
                        if (iF4 > i14) {
                            ovVar2 = ovVar4;
                            i14 = iF4;
                        }
                        i4 += i2;
                    }
                }
                ovVar = ovVar2;
                yv yvVar = staggeredGridLayoutManager.h;
                yvVar.b(iGL);
                ((int[]) yvVar.b)[iGL] = ovVar.e;
            } else {
                ovVar = staggeredGridLayoutManager.a[i];
            }
            ov ovVar5 = ovVar;
            osVar.a = ovVar5;
            if (mnVar.e == 1) {
                staggeredGridLayoutManager.addView(viewN);
                r2 = 0;
            } else {
                r2 = 0;
                staggeredGridLayoutManager.addView(viewN, 0);
            }
            boolean z4 = osVar.b;
            if (staggeredGridLayoutManager.j == 1) {
                staggeredGridLayoutManager.G(viewN, getChildMeasureSpec(staggeredGridLayoutManager.k, staggeredGridLayoutManager.getWidthMode(), r2, osVar.width, r2), getChildMeasureSpec(staggeredGridLayoutManager.getHeight(), staggeredGridLayoutManager.getHeightMode(), staggeredGridLayoutManager.getPaddingTop() + staggeredGridLayoutManager.getPaddingBottom(), osVar.height, true));
            } else {
                staggeredGridLayoutManager.G(viewN, getChildMeasureSpec(staggeredGridLayoutManager.getWidth(), staggeredGridLayoutManager.getWidthMode(), staggeredGridLayoutManager.getPaddingLeft() + staggeredGridLayoutManager.getPaddingRight(), osVar.width, true), getChildMeasureSpec(staggeredGridLayoutManager.k, staggeredGridLayoutManager.getHeightMode(), 0, osVar.height, false));
            }
            if (mnVar.e == 1) {
                boolean z5 = osVar.b;
                iB = ovVar5.d(iF2);
                iF = staggeredGridLayoutManager.b.b(viewN) + iB;
                if (i10 != 0) {
                    boolean z6 = osVar.b;
                }
            } else {
                boolean z7 = osVar.b;
                iF = ovVar5.f(iF2);
                iB = iF - staggeredGridLayoutManager.b.b(viewN);
                if (i10 != 0) {
                    boolean z8 = osVar.b;
                }
            }
            int i15 = iF;
            boolean z9 = osVar.b;
            if (mnVar.e == 1) {
                ov ovVar6 = osVar.a;
                os osVarN = ov.n(viewN);
                osVarN.a = ovVar6;
                ArrayList arrayList = ovVar6.a;
                arrayList.add(viewN);
                ovVar6.c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    ovVar6.b = Integer.MIN_VALUE;
                }
                if (osVarN.gN() || osVarN.gM()) {
                    ovVar6.d += ovVar6.f.b.b(viewN);
                }
            } else {
                ov ovVar7 = osVar.a;
                os osVarN2 = ov.n(viewN);
                osVarN2.a = ovVar7;
                ArrayList arrayList2 = ovVar7.a;
                arrayList2.add(0, viewN);
                ovVar7.b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    ovVar7.c = Integer.MIN_VALUE;
                }
                if (osVarN2.gN() || osVarN2.gM()) {
                    ovVar7.d += ovVar7.f.b.b(viewN);
                }
            }
            if (staggeredGridLayoutManager.k() && staggeredGridLayoutManager.j == 1) {
                boolean z10 = osVar.b;
                iB2 = staggeredGridLayoutManager.c.f() - (((staggeredGridLayoutManager.i - 1) - ovVar5.e) * staggeredGridLayoutManager.k);
                iJ = iB2 - staggeredGridLayoutManager.c.b(viewN);
            } else {
                boolean z11 = osVar.b;
                iJ = staggeredGridLayoutManager.c.j() + (ovVar5.e * staggeredGridLayoutManager.k);
                iB2 = staggeredGridLayoutManager.c.b(viewN) + iJ;
            }
            int i16 = iJ;
            int i17 = iB2;
            if (staggeredGridLayoutManager.j == 1) {
                staggeredGridLayoutManager.layoutDecoratedWithMargins(viewN, i16, iB, i17, i15);
                staggeredGridLayoutManager = this;
            } else {
                staggeredGridLayoutManager.layoutDecoratedWithMargins(viewN, iB, i16, i15, i17);
            }
            boolean z12 = osVar.b;
            staggeredGridLayoutManager.E(ovVar5, mnVar2.e, i7);
            staggeredGridLayoutManager.y(nvVar, mnVar2);
            if (mnVar2.h && viewN.hasFocusable()) {
                boolean z13 = osVar.b;
                staggeredGridLayoutManager.m.set(ovVar5.e, false);
                i5 = 0;
                z2 = true;
                i6 = 1;
            } else {
                z2 = true;
                i6 = 1;
                i5 = 0;
            }
        }
        int i18 = i5;
        if (!z2) {
            staggeredGridLayoutManager.y(nvVar, mnVar2);
        }
        int i19 = mnVar2.e;
        nd ndVar3 = staggeredGridLayoutManager.b;
        int iJ3 = i19 == -1 ? staggeredGridLayoutManager.b.j() - staggeredGridLayoutManager.s(ndVar3.j()) : staggeredGridLayoutManager.r(ndVar3.f()) - staggeredGridLayoutManager.b.f();
        return iJ3 > 0 ? Math.min(mnVar.b, iJ3) : i18;
    }

    private final int r(int i) {
        int iD = this.a[0].d(i);
        for (int i2 = 1; i2 < this.i; i2++) {
            int iD2 = this.a[i2].d(i);
            if (iD2 > iD) {
                iD = iD2;
            }
        }
        return iD;
    }

    private final int s(int i) {
        int iF = this.a[0].f(i);
        for (int i2 = 1; i2 < this.i; i2++) {
            int iF2 = this.a[i2].f(i);
            if (iF2 < iF) {
                iF = iF2;
            }
        }
        return iF;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008d  */
    /* JADX WARN: Code duplicated, block: B:35:0x008f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0092  */
    /* JADX WARN: Code duplicated, block: B:39:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0097  */
    /* JADX WARN: Code duplicated, block: B:41:0x009c  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:61:0x00d7 A[LOOP:2: B:61:0x00d7->B:74:0x00fc, LOOP_START, PHI: r5
      0x00d7: PHI (r5v8 int) = (r5v7 int), (r5v9 int) binds: [B:46:0x00ac, B:74:0x00fc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x00db  */
    /* JADX WARN: Code duplicated, block: B:64:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:83:0x00d4 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x00fc A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    private final View t(View view, int i, nv nvVar, oe oeVar) {
        ov ovVar;
        View viewG;
        boolean z;
        boolean z2;
        ov[] ovVarArr;
        int iB;
        View viewFindViewByPosition;
        int i2;
        ov[] ovVarArr2;
        int iB2;
        View viewFindViewByPosition2;
        int iB3;
        B();
        int iP = p(i);
        if (iP == Integer.MIN_VALUE) {
            return null;
        }
        if (view != null) {
            os osVar = (os) view.getLayoutParams();
            boolean z3 = osVar.b;
            ovVar = osVar.a;
        } else {
            ovVar = null;
        }
        int iB4 = iP == 1 ? b() : a();
        D(iB4, oeVar);
        C(iP);
        mn mnVar = this.l;
        mnVar.c = mnVar.d + iB4;
        mnVar.b = (int) (this.b.k() * 0.33333334f);
        mnVar.h = true;
        mnVar.a = false;
        q(nvVar, mnVar, oeVar);
        this.o = this.e;
        if (view == null || (viewFindViewByPosition2 = ovVar.g(iB4, iP)) == null || viewFindViewByPosition2 == view) {
            if (!F(iP)) {
                for (int i3 = 0; i3 < this.i; i3++) {
                    viewG = this.a[i3].g(iB4, iP);
                    if (viewG != null && viewG != view) {
                        return viewG;
                    }
                }
                boolean z4 = !this.d;
                if (iP != -1) {
                    z = false;
                } else {
                    z = true;
                }
                if (z4 == z) {
                }
                if (view == null) {
                    if (F(iP)) {
                        while (i < this.i) {
                            if (view != null) {
                                ovVarArr = this.a;
                                if (z2) {
                                    iB = ovVarArr[i].a();
                                } else {
                                    iB = ovVarArr[i].b();
                                }
                                viewFindViewByPosition = findViewByPosition(iB);
                                if (viewFindViewByPosition == null) {
                                    continue;
                                }
                            } else {
                                ovVarArr = this.a;
                                if (z2) {
                                    iB = ovVarArr[i].a();
                                } else {
                                    iB = ovVarArr[i].b();
                                }
                                viewFindViewByPosition = findViewByPosition(iB);
                                if (viewFindViewByPosition == null) {
                                    continue;
                                }
                            }
                        }
                        return null;
                    }
                    while (i2 >= 0) {
                        if (view != null) {
                            ovVarArr2 = this.a;
                            if (z2) {
                                iB2 = ovVarArr2[i2].a();
                            } else {
                                iB2 = ovVarArr2[i2].b();
                            }
                            viewFindViewByPosition2 = findViewByPosition(iB2);
                            if (viewFindViewByPosition2 != null) {
                                continue;
                            }
                        } else {
                            ovVarArr2 = this.a;
                            if (z2) {
                                iB2 = ovVarArr2[i2].a();
                            } else {
                                iB2 = ovVarArr2[i2].b();
                            }
                            viewFindViewByPosition2 = findViewByPosition(iB2);
                            if (viewFindViewByPosition2 != null) {
                                continue;
                            }
                        }
                    }
                    return null;
                }
                if (z2) {
                    iB3 = ovVar.a();
                } else {
                    iB3 = ovVar.b();
                }
                viewFindViewByPosition2 = findViewByPosition(iB3);
                if (viewFindViewByPosition2 != null) {
                    if (F(iP)) {
                        while (i < this.i) {
                            if (view != null) {
                                ovVarArr = this.a;
                                if (z2) {
                                    iB = ovVarArr[i].a();
                                } else {
                                    iB = ovVarArr[i].b();
                                }
                                viewFindViewByPosition = findViewByPosition(iB);
                                if (viewFindViewByPosition == null) {
                                    continue;
                                }
                            } else {
                                ovVarArr = this.a;
                                if (z2) {
                                    iB = ovVarArr[i].a();
                                } else {
                                    iB = ovVarArr[i].b();
                                }
                                viewFindViewByPosition = findViewByPosition(iB);
                                if (viewFindViewByPosition == null) {
                                    continue;
                                }
                            }
                        }
                        return null;
                    }
                    while (i2 >= 0) {
                        if (view != null) {
                            ovVarArr2 = this.a;
                            if (z2) {
                                iB2 = ovVarArr2[i2].a();
                            } else {
                                iB2 = ovVarArr2[i2].b();
                            }
                            viewFindViewByPosition2 = findViewByPosition(iB2);
                            if (viewFindViewByPosition2 != null) {
                                continue;
                            }
                        } else {
                            ovVarArr2 = this.a;
                            if (z2) {
                                iB2 = ovVarArr2[i2].a();
                            } else {
                                iB2 = ovVarArr2[i2].b();
                            }
                            viewFindViewByPosition2 = findViewByPosition(iB2);
                            if (viewFindViewByPosition2 != null) {
                                continue;
                            }
                        }
                    }
                    return null;
                }
                if (F(iP)) {
                    while (i < this.i) {
                        if (view != null) {
                            ovVarArr = this.a;
                            if (z2) {
                                iB = ovVarArr[i].a();
                            } else {
                                iB = ovVarArr[i].b();
                            }
                            viewFindViewByPosition = findViewByPosition(iB);
                            if (viewFindViewByPosition == null) {
                                continue;
                            }
                        } else {
                            ovVarArr = this.a;
                            if (z2) {
                                iB = ovVarArr[i].a();
                            } else {
                                iB = ovVarArr[i].b();
                            }
                            viewFindViewByPosition = findViewByPosition(iB);
                            if (viewFindViewByPosition == null) {
                                continue;
                            }
                        }
                    }
                    return null;
                }
                while (i2 >= 0) {
                    if (view != null) {
                        ovVarArr2 = this.a;
                        if (z2) {
                            iB2 = ovVarArr2[i2].a();
                        } else {
                            iB2 = ovVarArr2[i2].b();
                        }
                        viewFindViewByPosition2 = findViewByPosition(iB2);
                        if (viewFindViewByPosition2 != null) {
                            continue;
                        }
                    } else {
                        ovVarArr2 = this.a;
                        if (z2) {
                            iB2 = ovVarArr2[i2].a();
                        } else {
                            iB2 = ovVarArr2[i2].b();
                        }
                        viewFindViewByPosition2 = findViewByPosition(iB2);
                        if (viewFindViewByPosition2 != null) {
                            continue;
                        }
                    }
                }
                return null;
            }
            for (int i4 = this.i - 1; i4 >= 0; i4--) {
                viewG = this.a[i4].g(iB4, iP);
                if (viewG != null && viewG != view) {
                    return viewG;
                }
            }
            boolean z5 = !this.d;
            if (iP != -1) {
                z = false;
            } else {
                z = true;
            }
            z2 = z5 == z;
            if (view == null) {
                if (F(iP)) {
                    for (i2 = this.i - 1; i2 >= 0; i2--) {
                        if (view != null || i2 != ovVar.e) {
                            ovVarArr2 = this.a;
                            if (z2) {
                                iB2 = ovVarArr2[i2].a();
                            } else {
                                iB2 = ovVarArr2[i2].b();
                            }
                            viewFindViewByPosition2 = findViewByPosition(iB2);
                            if (viewFindViewByPosition2 != null || viewFindViewByPosition2 == view) {
                            }
                        }
                    }
                    return null;
                }
                for (int i5 = 0; i5 < this.i; i5++) {
                    if (view != null || i5 != ovVar.e) {
                        ovVarArr = this.a;
                        if (z2) {
                            iB = ovVarArr[i5].a();
                        } else {
                            iB = ovVarArr[i5].b();
                        }
                        viewFindViewByPosition = findViewByPosition(iB);
                        if (viewFindViewByPosition == null && viewFindViewByPosition != view) {
                            return viewFindViewByPosition;
                        }
                    }
                }
                return null;
            }
            if (z2) {
                iB3 = ovVar.a();
            } else {
                iB3 = ovVar.b();
            }
            viewFindViewByPosition2 = findViewByPosition(iB3);
            if (viewFindViewByPosition2 != null || viewFindViewByPosition2 == view) {
                if (F(iP)) {
                    while (i5 < this.i) {
                        if (view != null) {
                            ovVarArr = this.a;
                            if (z2) {
                                iB = ovVarArr[i5].a();
                            } else {
                                iB = ovVarArr[i5].b();
                            }
                            viewFindViewByPosition = findViewByPosition(iB);
                            if (viewFindViewByPosition == null) {
                                continue;
                            }
                        } else {
                            ovVarArr = this.a;
                            if (z2) {
                                iB = ovVarArr[i5].a();
                            } else {
                                iB = ovVarArr[i5].b();
                            }
                            viewFindViewByPosition = findViewByPosition(iB);
                            if (viewFindViewByPosition == null) {
                                continue;
                            }
                        }
                    }
                    return null;
                }
                while (i2 >= 0) {
                    if (view != null) {
                        ovVarArr2 = this.a;
                        if (z2) {
                            iB2 = ovVarArr2[i2].a();
                        } else {
                            iB2 = ovVarArr2[i2].b();
                        }
                        viewFindViewByPosition2 = findViewByPosition(iB2);
                        if (viewFindViewByPosition2 != null) {
                            continue;
                        }
                    } else {
                        ovVarArr2 = this.a;
                        if (z2) {
                            iB2 = ovVarArr2[i2].a();
                        } else {
                            iB2 = ovVarArr2[i2].b();
                        }
                        viewFindViewByPosition2 = findViewByPosition(iB2);
                        if (viewFindViewByPosition2 != null) {
                            continue;
                        }
                    }
                }
                return null;
            }
        }
        return viewFindViewByPosition2;
    }

    private final void u(nv nvVar, oe oeVar, boolean z) {
        int iF;
        int i;
        int iR = r(Integer.MIN_VALUE);
        if (iR == Integer.MIN_VALUE || (iF = this.b.f() - iR) <= 0) {
            return;
        }
        int i2 = -c(-iF, nvVar, oeVar);
        if (!z || (i = iF - i2) <= 0) {
            return;
        }
        this.b.n(i);
    }

    private final void v(nv nvVar, oe oeVar, boolean z) {
        int iJ;
        int iS = s(Alert.DURATION_SHOW_INDEFINITELY);
        if (iS == Integer.MAX_VALUE || (iJ = iS - this.b.j()) <= 0) {
            return;
        }
        int iC = iJ - c(iJ, nvVar, oeVar);
        if (!z || iC <= 0) {
            return;
        }
        this.b.n(-iC);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0035  */
    /* JADX WARN: Code duplicated, block: B:23:0x0041 A[LOOP:0: B:20:0x0033->B:23:0x0041, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:31:0x0061 A[LOOP:1: B:28:0x0053->B:31:0x0061, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x0067  */
    /* JADX WARN: Code duplicated, block: B:35:0x0077  */
    /* JADX WARN: Code duplicated, block: B:37:0x007a  */
    /* JADX WARN: Code duplicated, block: B:38:0x0088  */
    /* JADX WARN: Code duplicated, block: B:40:0x009b  */
    /* JADX WARN: Code duplicated, block: B:42:0x009e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:49:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:54:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0045 A[EDGE_INSN: B:55:0x0045->B:25:0x0045 BREAK  A[LOOP:0: B:20:0x0033->B:23:0x0041], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0065 A[EDGE_INSN: B:57:0x0065->B:33:0x0065 BREAK  A[LOOP:1: B:28:0x0053->B:31:0x0061], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.List] */
    private final void w(int i, int i2, int i3) {
        int i4;
        int i5;
        yv yvVar;
        Object obj;
        int iB;
        ?? r5;
        int i6;
        int size;
        ot otVar;
        int size2;
        int i7;
        int iB2 = this.e ? b() : a();
        if (i3 == 8) {
            if (i < i2) {
                i4 = i2 + 1;
            } else {
                i4 = i + 1;
                i5 = i2;
            }
            yvVar = this.h;
            obj = yvVar.b;
            if (obj != null && i5 < ((int[]) obj).length) {
                r5 = yvVar.a;
                if (r5 != 0) {
                    size = r5.size() - 1;
                    while (true) {
                        if (size >= 0) {
                            otVar = null;
                            break;
                        }
                        otVar = (ot) yvVar.a.get(size);
                        if (otVar.a != i5) {
                            break;
                        } else {
                            size--;
                        }
                    }
                    if (otVar != null) {
                        yvVar.a.remove(otVar);
                    }
                    size2 = yvVar.a.size();
                    i7 = 0;
                    while (true) {
                        if (i7 < size2) {
                            i7 = -1;
                            break;
                        } else if (((ot) yvVar.a.get(i7)).a < i5) {
                            break;
                        } else {
                            i7++;
                        }
                    }
                    if (i7 != -1) {
                        ot otVar2 = (ot) yvVar.a.get(i7);
                        yvVar.a.remove(i7);
                        i6 = otVar2.a;
                    } else {
                        i6 = -1;
                    }
                } else {
                    i6 = -1;
                }
                if (i6 == -1) {
                    int[] iArr = (int[]) yvVar.b;
                    Arrays.fill(iArr, i5, iArr.length, -1);
                    int length = ((int[]) yvVar.b).length;
                } else {
                    Arrays.fill((int[]) yvVar.b, i5, Math.min(i6 + 1, ((int[]) yvVar.b).length), -1);
                }
            }
            if (i3 != 1) {
                this.h.c(i, i2);
            } else if (i3 != 2) {
                this.h.d(i, i2);
            } else if (i3 == 8) {
                this.h.d(i, 1);
                this.h.c(i2, 1);
            }
            if (i4 > iB2) {
                if (this.e) {
                    iB = a();
                } else {
                    iB = b();
                }
                if (i5 <= iB) {
                    requestLayout();
                }
            }
        }
        i4 = i + i2;
        i5 = i;
        yvVar = this.h;
        obj = yvVar.b;
        if (obj != null) {
            r5 = yvVar.a;
            if (r5 != 0) {
                size = r5.size() - 1;
                while (true) {
                    if (size >= 0) {
                        otVar = null;
                        break;
                    }
                    otVar = (ot) yvVar.a.get(size);
                    if (otVar.a != i5) {
                        break;
                        break;
                    }
                    size--;
                }
                if (otVar != null) {
                    yvVar.a.remove(otVar);
                }
                size2 = yvVar.a.size();
                i7 = 0;
                while (true) {
                    if (i7 < size2) {
                        i7 = -1;
                        break;
                    } else {
                        if (((ot) yvVar.a.get(i7)).a < i5) {
                            break;
                            break;
                        }
                        i7++;
                    }
                }
                if (i7 != -1) {
                    ot otVar3 = (ot) yvVar.a.get(i7);
                    yvVar.a.remove(i7);
                    i6 = otVar3.a;
                } else {
                    i6 = -1;
                }
            } else {
                i6 = -1;
            }
            if (i6 == -1) {
                int[] iArr2 = (int[]) yvVar.b;
                Arrays.fill(iArr2, i5, iArr2.length, -1);
                int length2 = ((int[]) yvVar.b).length;
            } else {
                Arrays.fill((int[]) yvVar.b, i5, Math.min(i6 + 1, ((int[]) yvVar.b).length), -1);
            }
        }
        if (i3 != 1) {
            this.h.c(i, i2);
        } else if (i3 != 2) {
            this.h.d(i, i2);
        } else if (i3 == 8) {
            this.h.d(i, 1);
            this.h.c(i2, 1);
        }
        if (i4 > iB2) {
            if (this.e) {
                iB = a();
            } else {
                iB = b();
            }
            if (i5 <= iB) {
                requestLayout();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:107:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:111:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:113:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:167:0x0282 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:168:0x0284  */
    /* JADX WARN: Code duplicated, block: B:225:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:236:0x01e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:240:0x01e2 A[SYNTHETIC] */
    private final void x(nv nvVar, oe oeVar, boolean z) {
        boolean z2;
        ou ouVar;
        ov[] ovVarArr;
        int childCount;
        int i;
        int position;
        int position2;
        int childCount2;
        int i2;
        or orVar = this.s;
        if (!(this.q == null && this.f == -1) && oeVar.a() == 0) {
            removeAndRecycleAllViews(nvVar);
            orVar.a();
            return;
        }
        boolean z3 = (orVar.e && this.f == -1 && this.q == null) ? false : true;
        if (z3) {
            orVar.a();
            ou ouVar2 = this.q;
            if (ouVar2 != null) {
                int i3 = ouVar2.c;
                if (i3 > 0) {
                    if (i3 == this.i) {
                        for (int i4 = 0; i4 < this.i; i4++) {
                            this.a[i4].j();
                            ou ouVar3 = this.q;
                            int iF = ouVar3.d[i4];
                            if (iF != Integer.MIN_VALUE) {
                                boolean z4 = ouVar3.i;
                                nd ndVar = this.b;
                                iF += z4 ? ndVar.f() : ndVar.j();
                            }
                            this.a[i4].l(iF);
                        }
                    } else {
                        ouVar2.b();
                        ou ouVar4 = this.q;
                        ouVar4.a = ouVar4.b;
                    }
                }
                ou ouVar5 = this.q;
                this.p = ouVar5.j;
                h(ouVar5.h);
                B();
                ou ouVar6 = this.q;
                int i5 = ouVar6.a;
                if (i5 != -1) {
                    this.f = i5;
                    orVar.c = ouVar6.i;
                } else {
                    orVar.c = this.e;
                }
                if (ouVar6.e > 1) {
                    yv yvVar = this.h;
                    yvVar.b = ouVar6.f;
                    yvVar.a = ouVar6.g;
                }
            } else {
                B();
                orVar.c = this.e;
            }
            if (oeVar.g || (i2 = this.f) == -1) {
                if (this.o) {
                    int iA = oeVar.a();
                    childCount2 = getChildCount() - 1;
                    while (true) {
                        if (childCount2 < 0) {
                            position2 = 0;
                            break;
                        }
                        position2 = getPosition(getChildAt(childCount2));
                        if (position2 < 0 && position2 < iA) {
                            break;
                        } else {
                            childCount2--;
                        }
                    }
                } else {
                    int iA2 = oeVar.a();
                    childCount = getChildCount();
                    i = 0;
                    while (true) {
                        if (i >= childCount) {
                            position2 = 0;
                            break;
                        }
                        position = getPosition(getChildAt(i));
                        if (position < 0 && position < iA2) {
                            position2 = position;
                            break;
                        }
                        i++;
                    }
                }
                orVar.a = position2;
                orVar.b = Integer.MIN_VALUE;
            } else if (i2 < 0 || i2 >= oeVar.a()) {
                this.f = -1;
                this.g = Integer.MIN_VALUE;
                if (this.o) {
                    int iA3 = oeVar.a();
                    childCount2 = getChildCount() - 1;
                    while (true) {
                        if (childCount2 < 0) {
                            position2 = 0;
                            break;
                        } else {
                            position2 = getPosition(getChildAt(childCount2));
                            if (position2 < 0) {
                            }
                            childCount2--;
                        }
                    }
                } else {
                    int iA4 = oeVar.a();
                    childCount = getChildCount();
                    i = 0;
                    while (true) {
                        if (i >= childCount) {
                            position2 = 0;
                            break;
                        } else {
                            position = getPosition(getChildAt(i));
                            if (position < 0) {
                            }
                            i++;
                        }
                    }
                }
                orVar.a = position2;
                orVar.b = Integer.MIN_VALUE;
            } else {
                ou ouVar7 = this.q;
                if (ouVar7 == null || ouVar7.a == -1 || ouVar7.c <= 0) {
                    View viewFindViewByPosition = findViewByPosition(this.f);
                    if (viewFindViewByPosition != null) {
                        orVar.a = this.e ? b() : a();
                        if (this.g != Integer.MIN_VALUE) {
                            boolean z5 = orVar.c;
                            nd ndVar2 = this.b;
                            if (z5) {
                                orVar.b = (ndVar2.f() - this.g) - this.b.a(viewFindViewByPosition);
                            } else {
                                orVar.b = (ndVar2.j() + this.g) - this.b.d(viewFindViewByPosition);
                            }
                        } else if (this.b.b(viewFindViewByPosition) > this.b.k()) {
                            boolean z6 = orVar.c;
                            nd ndVar3 = this.b;
                            orVar.b = z6 ? ndVar3.f() : ndVar3.j();
                        } else {
                            int iD = this.b.d(viewFindViewByPosition) - this.b.j();
                            if (iD < 0) {
                                orVar.b = -iD;
                            } else {
                                int iF2 = this.b.f() - this.b.a(viewFindViewByPosition);
                                if (iF2 < 0) {
                                    orVar.b = iF2;
                                } else {
                                    orVar.b = Integer.MIN_VALUE;
                                }
                            }
                        }
                    } else {
                        int i6 = this.f;
                        orVar.a = i6;
                        int i7 = this.g;
                        if (i7 == Integer.MIN_VALUE) {
                            boolean z7 = l(i6) == 1;
                            orVar.c = z7;
                            orVar.b = z7 ? orVar.g.b.f() : orVar.g.b.j();
                        } else if (orVar.c) {
                            orVar.b = orVar.g.b.f() - i7;
                        } else {
                            orVar.b = orVar.g.b.j() + i7;
                        }
                        orVar.d = true;
                    }
                } else {
                    orVar.b = Integer.MIN_VALUE;
                    orVar.a = this.f;
                }
            }
            orVar.e = true;
        }
        if (this.q == null && this.f == -1 && (orVar.c != this.o || k() != this.p)) {
            this.h.a();
            orVar.d = true;
        }
        if (getChildCount() > 0 && ((ouVar = this.q) == null || ouVar.c <= 0)) {
            if (orVar.d) {
                for (int i8 = 0; i8 < this.i; i8++) {
                    this.a[i8].j();
                    int i9 = orVar.b;
                    if (i9 != Integer.MIN_VALUE) {
                        this.a[i8].l(i9);
                    }
                }
            } else if (z3 || orVar.f == null) {
                int i10 = 0;
                while (true) {
                    int i11 = this.i;
                    ovVarArr = this.a;
                    if (i10 >= i11) {
                        break;
                    }
                    ov ovVar = ovVarArr[i10];
                    boolean z8 = this.e;
                    int i12 = orVar.b;
                    int iD2 = z8 ? ovVar.d(Integer.MIN_VALUE) : ovVar.f(Integer.MIN_VALUE);
                    ovVar.j();
                    if (iD2 != Integer.MIN_VALUE) {
                        if (z8) {
                            if (iD2 >= ovVar.f.b.f()) {
                                if (i12 != Integer.MIN_VALUE) {
                                    iD2 += i12;
                                }
                                ovVar.c = iD2;
                                ovVar.b = iD2;
                            }
                        } else if (iD2 <= ovVar.f.b.j()) {
                            if (i12 != Integer.MIN_VALUE) {
                                iD2 += i12;
                            }
                            ovVar.c = iD2;
                            ovVar.b = iD2;
                        }
                    }
                    i10++;
                }
                int length = ovVarArr.length;
                int[] iArr = orVar.f;
                if (iArr == null || iArr.length < length) {
                    orVar.f = new int[orVar.g.a.length];
                }
                for (int i13 = 0; i13 < length; i13++) {
                    orVar.f[i13] = ovVarArr[i13].f(Integer.MIN_VALUE);
                }
            } else {
                for (int i14 = 0; i14 < this.i; i14++) {
                    ov ovVar2 = this.a[i14];
                    ovVar2.j();
                    ovVar2.l(orVar.f[i14]);
                }
            }
        }
        detachAndScrapAttachedViews(nvVar);
        mn mnVar = this.l;
        mnVar.a = false;
        i(this.c.k());
        D(orVar.a, oeVar);
        if (orVar.c) {
            C(-1);
            q(nvVar, mnVar, oeVar);
            C(1);
            mnVar.c = orVar.a + mnVar.d;
            q(nvVar, mnVar, oeVar);
        } else {
            C(1);
            q(nvVar, mnVar, oeVar);
            C(-1);
            mnVar.c = orVar.a + mnVar.d;
            q(nvVar, mnVar, oeVar);
        }
        if (this.c.h() != 1073741824) {
            int childCount3 = getChildCount();
            float fMax = 0.0f;
            for (int i15 = 0; i15 < childCount3; i15++) {
                View childAt = getChildAt(i15);
                float fB = this.c.b(childAt);
                if (fB >= fMax) {
                    fMax = Math.max(fMax, fB);
                }
            }
            int i16 = this.k;
            int iRound = Math.round(fMax * this.i);
            if (this.c.h() == Integer.MIN_VALUE) {
                iRound = Math.min(iRound, this.c.k());
            }
            i(iRound);
            if (this.k != i16) {
                for (int i17 = 0; i17 < childCount3; i17++) {
                    View childAt2 = getChildAt(i17);
                    os osVar = (os) childAt2.getLayoutParams();
                    boolean z9 = osVar.b;
                    if (k() && this.j == 1) {
                        int i18 = -((this.i - 1) - osVar.a.e);
                        childAt2.offsetLeftAndRight((this.k * i18) - (i18 * i16));
                    } else {
                        int i19 = osVar.a.e;
                        int i20 = this.j;
                        int i21 = (this.k * i19) - (i19 * i16);
                        if (i20 == 1) {
                            childAt2.offsetLeftAndRight(i21);
                        } else {
                            childAt2.offsetTopAndBottom(i21);
                        }
                    }
                }
            }
        }
        if (getChildCount() > 0) {
            if (this.e) {
                u(nvVar, oeVar, true);
                v(nvVar, oeVar, false);
            } else {
                v(nvVar, oeVar, true);
                u(nvVar, oeVar, false);
            }
        }
        if (z && !oeVar.g && this.n != 0 && getChildCount() > 0 && f() != null) {
            removeCallbacks(this.v);
            z2 = j();
        }
        if (oeVar.g) {
            orVar.a();
        }
        this.o = orVar.c;
        this.p = k();
        if (z2) {
            orVar.a();
            x(nvVar, oeVar, false);
        }
    }

    private final void y(nv nvVar, mn mnVar) {
        int iMin;
        if (!mnVar.a || mnVar.i) {
            return;
        }
        if (mnVar.b == 0) {
            if (mnVar.e == -1) {
                z(nvVar, mnVar.g);
                return;
            } else {
                A(nvVar, mnVar.f);
                return;
            }
        }
        int i = 1;
        if (mnVar.e == -1) {
            int i2 = mnVar.f;
            int iF = this.a[0].f(i2);
            while (i < this.i) {
                int iF2 = this.a[i].f(i2);
                if (iF2 > iF) {
                    iF = iF2;
                }
                i++;
            }
            int i3 = i2 - iF;
            z(nvVar, i3 < 0 ? mnVar.g : mnVar.g - Math.min(i3, mnVar.b));
            return;
        }
        int i4 = mnVar.g;
        int iD = this.a[0].d(i4);
        while (i < this.i) {
            int iD2 = this.a[i].d(i4);
            if (iD2 < iD) {
                iD = iD2;
            }
            i++;
        }
        int i5 = iD - mnVar.g;
        if (i5 < 0) {
            iMin = mnVar.f;
        } else {
            iMin = Math.min(i5, mnVar.b) + mnVar.f;
        }
        A(nvVar, iMin);
    }

    private final void z(nv nvVar, int i) {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return;
            }
            View childAt = getChildAt(childCount);
            if (this.b.d(childAt) < i || this.b.m(childAt) < i) {
                return;
            }
            os osVar = (os) childAt.getLayoutParams();
            boolean z = osVar.b;
            if (osVar.a.a.size() == 1) {
                return;
            }
            ov ovVar = osVar.a;
            ArrayList arrayList = ovVar.a;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            os osVarN = ov.n(view);
            osVarN.a = null;
            if (osVarN.gN() || osVarN.gM()) {
                ovVar.d -= ovVar.f.b.b(view);
            }
            if (size == 1) {
                ovVar.b = Integer.MIN_VALUE;
            }
            ovVar.c = Integer.MIN_VALUE;
            removeAndRecycleView(childAt, nvVar);
        }
    }

    final int a() {
        if (getChildCount() != 0) {
            return getPosition(getChildAt(0));
        }
        return 0;
    }

    @Override // defpackage.np
    public final void assertNotInLayoutOrScroll(String str) {
        if (this.q == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    final int b() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return getPosition(getChildAt(childCount - 1));
    }

    final int c(int i, nv nvVar, oe oeVar) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        g(i, oeVar);
        mn mnVar = this.l;
        int iQ = q(nvVar, mnVar, oeVar);
        if (mnVar.b >= iQ) {
            i = i < 0 ? -iQ : iQ;
        }
        this.b.n(-i);
        this.o = this.e;
        mnVar.b = 0;
        y(nvVar, mnVar);
        return i;
    }

    @Override // defpackage.np
    public final boolean canScrollHorizontally() {
        return this.j == 0;
    }

    @Override // defpackage.np
    public final boolean canScrollVertically() {
        return this.j == 1;
    }

    @Override // defpackage.np
    public final boolean checkLayoutParams(nq nqVar) {
        return nqVar instanceof os;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001b  */
    @Override // defpackage.np
    public final void collectAdjacentPrefetchPositions(int i, int i2, oe oeVar, nn nnVar) {
        int iD;
        if (1 == this.j) {
            i = i2;
        }
        if (getChildCount() == 0 || i == 0) {
            return;
        }
        g(i, oeVar);
        int[] iArr = this.u;
        if (iArr != null) {
            if (iArr.length < this.i) {
                this.u = new int[this.i];
            }
        } else {
            this.u = new int[this.i];
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.i; i4++) {
            mn mnVar = this.l;
            if (mnVar.d == -1) {
                int i5 = mnVar.f;
                iD = i5 - this.a[i4].f(i5);
            } else {
                iD = this.a[i4].d(mnVar.g) - mnVar.g;
            }
            if (iD >= 0) {
                this.u[i3] = iD;
                i3++;
            }
        }
        Arrays.sort(this.u, 0, i3);
        for (int i6 = 0; i6 < i3; i6++) {
            mn mnVar2 = this.l;
            if (!mnVar2.a(oeVar)) {
                return;
            }
            nnVar.a(mnVar2.c, this.u[i6]);
            mnVar2.c += mnVar2.d;
        }
    }

    @Override // defpackage.np
    public final int computeHorizontalScrollExtent(oe oeVar) {
        return m(oeVar);
    }

    @Override // defpackage.np
    public final int computeHorizontalScrollOffset(oe oeVar) {
        return n(oeVar);
    }

    @Override // defpackage.np
    public final int computeHorizontalScrollRange(oe oeVar) {
        return o(oeVar);
    }

    @Override // defpackage.oc
    public final PointF computeScrollVectorForPosition(int i) {
        int iL = l(i);
        PointF pointF = new PointF();
        if (iL == 0) {
            return null;
        }
        float f = iL;
        if (this.j == 0) {
            pointF.x = f;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = f;
        return pointF;
    }

    @Override // defpackage.np
    public final int computeVerticalScrollExtent(oe oeVar) {
        return m(oeVar);
    }

    @Override // defpackage.np
    public final int computeVerticalScrollOffset(oe oeVar) {
        return n(oeVar);
    }

    @Override // defpackage.np
    public final int computeVerticalScrollRange(oe oeVar) {
        return o(oeVar);
    }

    final View d(boolean z) {
        int iJ = this.b.j();
        int iF = this.b.f();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int iD = this.b.d(childAt);
            int iA = this.b.a(childAt);
            if (iA > iJ && iD < iF) {
                if (iA <= iF || !z) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    final View e(boolean z) {
        int iJ = this.b.j();
        int iF = this.b.f();
        int childCount = getChildCount();
        View view = null;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int iD = this.b.d(childAt);
            if (this.b.a(childAt) > iJ && iD < iF) {
                if (iD >= iJ || !z) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x002c A[SYNTHETIC] */
    final View f() {
        int childCount = getChildCount();
        int i = childCount - 1;
        BitSet bitSet = new BitSet(this.i);
        bitSet.set(0, this.i, true);
        int i2 = (this.j == 1 && k()) ? 1 : -1;
        if (this.e) {
            childCount = -1;
        } else {
            i = 0;
        }
        int i3 = i >= childCount ? -1 : 1;
        while (i != childCount) {
            View childAt = getChildAt(i);
            os osVar = (os) childAt.getLayoutParams();
            if (bitSet.get(osVar.a.e)) {
                ov ovVar = osVar.a;
                if (this.e) {
                    if (ovVar.c() < this.b.f()) {
                        ArrayList arrayList = ovVar.a;
                        boolean z = ov.n((View) arrayList.get(arrayList.size() - 1)).b;
                        return childAt;
                    }
                } else if (ovVar.e() > this.b.j()) {
                    boolean z2 = ov.n((View) ovVar.a.get(0)).b;
                    return childAt;
                }
                bitSet.clear(osVar.a.e);
            }
            boolean z3 = osVar.b;
            i += i3;
            if (i != childCount) {
                View childAt2 = getChildAt(i);
                boolean z4 = this.e;
                nd ndVar = this.b;
                if (z4) {
                    int iA = ndVar.a(childAt);
                    int iA2 = this.b.a(childAt2);
                    if (iA < iA2) {
                        return childAt;
                    }
                    if (iA == iA2) {
                        if (((osVar.a.e - ((os) childAt2.getLayoutParams()).a.e) >>> 31) == (i2 >>> 31)) {
                            return childAt;
                        }
                    } else {
                        continue;
                    }
                } else {
                    int iD = ndVar.d(childAt);
                    int iD2 = this.b.d(childAt2);
                    if (iD > iD2) {
                        return childAt;
                    }
                    if (iD == iD2) {
                        if (((osVar.a.e - ((os) childAt2.getLayoutParams()).a.e) >>> 31) == (i2 >>> 31)) {
                            return childAt;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    final void g(int i, oe oeVar) {
        int iA;
        int i2;
        if (i > 0) {
            iA = b();
            i2 = 1;
        } else {
            iA = a();
            i2 = -1;
        }
        mn mnVar = this.l;
        mnVar.a = true;
        D(iA, oeVar);
        C(i2);
        mnVar.c = iA + mnVar.d;
        mnVar.b = Math.abs(i);
    }

    @Override // defpackage.np
    public final nq generateDefaultLayoutParams() {
        return this.j == 0 ? new os(-2, -1) : new os(-1, -2);
    }

    @Override // defpackage.np
    public final nq generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new os((ViewGroup.MarginLayoutParams) layoutParams) : new os(layoutParams);
    }

    @Override // defpackage.np
    public final int getColumnCountForAccessibility(nv nvVar, oe oeVar) {
        if (this.j == 1) {
            return Math.min(this.i, oeVar.a());
        }
        return -1;
    }

    @Override // defpackage.np
    public final int getRowCountForAccessibility(nv nvVar, oe oeVar) {
        if (this.j == 0) {
            return Math.min(this.i, oeVar.a());
        }
        return -1;
    }

    public final void h(boolean z) {
        assertNotInLayoutOrScroll(null);
        ou ouVar = this.q;
        if (ouVar != null && ouVar.h != z) {
            ouVar.h = z;
        }
        this.d = z;
        requestLayout();
    }

    final void i(int i) {
        this.k = i / this.i;
        this.c.h();
    }

    @Override // defpackage.np
    public final boolean isAutoMeasureEnabled() {
        return this.n != 0;
    }

    @Override // defpackage.np
    public final boolean isLayoutReversed() {
        return this.d;
    }

    public final boolean j() {
        int iA;
        if (getChildCount() != 0 && this.n != 0 && isAttachedToWindow()) {
            if (this.e) {
                iA = b();
                a();
            } else {
                iA = a();
                b();
            }
            if (iA == 0 && f() != null) {
                this.h.a();
                requestSimpleAnimationsInNextLayout();
                requestLayout();
                return true;
            }
        }
        return false;
    }

    final boolean k() {
        return getLayoutDirection() == 1;
    }

    @Override // defpackage.np
    public final void offsetChildrenHorizontal(int i) {
        super.offsetChildrenHorizontal(i);
        for (int i2 = 0; i2 < this.i; i2++) {
            this.a[i2].k(i);
        }
    }

    @Override // defpackage.np
    public final void offsetChildrenVertical(int i) {
        super.offsetChildrenVertical(i);
        for (int i2 = 0; i2 < this.i; i2++) {
            this.a[i2].k(i);
        }
    }

    @Override // defpackage.np
    public final void onAdapterChanged(nh nhVar, nh nhVar2) {
        this.h.a();
        for (int i = 0; i < this.i; i++) {
            this.a[i].j();
        }
    }

    @Override // defpackage.np
    public final void onDetachedFromWindow(RecyclerView recyclerView, nv nvVar) {
        super.onDetachedFromWindow(recyclerView, nvVar);
        removeCallbacks(this.v);
        for (int i = 0; i < this.i; i++) {
            this.a[i].j();
        }
        recyclerView.requestLayout();
    }

    @Override // defpackage.np
    public final View onFocusEnter(int i, nv nvVar, oe oeVar) {
        int iP;
        View childAt;
        B();
        if (getChildCount() == 0 || (iP = p(i)) == Integer.MIN_VALUE) {
            return null;
        }
        int i2 = 1;
        int childCount = 0;
        int childCount2 = -1;
        int iA = (iP == -1) ^ this.e ? oeVar.a() - 1 : 0;
        if (findViewByPosition(iA) != null) {
            smoothScrollToPosition(this.mRecyclerView, oeVar, iA);
        } else {
            this.f = iA;
            x(nvVar, oeVar, true);
        }
        boolean z = this.e;
        if (iP != -1) {
            if (z) {
                childCount = getChildCount() - 1;
                i2 = -1;
            } else {
                childCount2 = getChildCount();
            }
            while (true) {
                if (childCount != childCount2) {
                    childAt = getChildAt(childCount);
                    if (childAt != null && childAt.hasFocusable()) {
                        break;
                    }
                    childCount += i2;
                } else {
                    childAt = null;
                    break;
                }
            }
        } else {
            if (z) {
                childCount2 = getChildCount();
            } else {
                childCount = getChildCount() - 1;
                i2 = -1;
            }
            while (true) {
                if (childCount != childCount2) {
                    childAt = getChildAt(childCount);
                    if (childAt != null && childAt.hasFocusable()) {
                        break;
                    }
                    childCount += i2;
                } else {
                    childAt = null;
                    break;
                }
            }
        }
        return (childAt == null || !childAt.hasFocusable()) ? t(null, i, nvVar, oeVar) : childAt;
    }

    @Override // defpackage.np
    public final View onFocusSearchFailed(View view, int i, nv nvVar, oe oeVar) {
        View viewFindContainingItemView;
        if (getChildCount() == 0 || (viewFindContainingItemView = findContainingItemView(view)) == null) {
            return null;
        }
        return t(viewFindContainingItemView, i, nvVar, oeVar);
    }

    @Override // defpackage.np
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            View viewE = e(false);
            View viewD = d(false);
            if (viewE == null || viewD == null) {
                return;
            }
            int position = getPosition(viewE);
            int position2 = getPosition(viewD);
            if (position < position2) {
                accessibilityEvent.setFromIndex(position);
                accessibilityEvent.setToIndex(position2);
            } else {
                accessibilityEvent.setFromIndex(position2);
                accessibilityEvent.setToIndex(position);
            }
        }
    }

    @Override // defpackage.np
    public final void onInitializeAccessibilityNodeInfo(nv nvVar, oe oeVar, bbz bbzVar) {
        super.onInitializeAccessibilityNodeInfo(nvVar, oeVar, bbzVar);
        bbzVar.v("android.support.v7.widget.StaggeredGridLayoutManager");
    }

    @Override // defpackage.np
    public final void onInitializeAccessibilityNodeInfoForItem(nv nvVar, oe oeVar, View view, bbz bbzVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof os)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, bbzVar);
            return;
        }
        os osVar = (os) layoutParams;
        if (this.j == 0) {
            int iD = osVar.d();
            boolean z = osVar.b;
            bbzVar.y(zs.g(iD, 1, -1, -1, false));
        } else {
            int iD2 = osVar.d();
            boolean z2 = osVar.b;
            bbzVar.y(zs.g(-1, -1, iD2, 1, false));
        }
    }

    @Override // defpackage.np
    public final void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        w(i, i2, 1);
    }

    @Override // defpackage.np
    public final void onItemsChanged(RecyclerView recyclerView) {
        this.h.a();
        requestLayout();
    }

    @Override // defpackage.np
    public final void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        w(i, i2, 8);
    }

    @Override // defpackage.np
    public final void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        w(i, i2, 2);
    }

    @Override // defpackage.np
    public final void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        w(i, i2, 4);
    }

    @Override // defpackage.np
    public final void onLayoutChildren(nv nvVar, oe oeVar) {
        x(nvVar, oeVar, true);
    }

    @Override // defpackage.np
    public final void onLayoutCompleted(oe oeVar) {
        this.f = -1;
        this.g = Integer.MIN_VALUE;
        this.q = null;
        this.s.a();
    }

    @Override // defpackage.np
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof ou) {
            ou ouVar = (ou) parcelable;
            this.q = ouVar;
            if (this.f != -1) {
                ouVar.a();
                this.q.b();
            }
            requestLayout();
        }
    }

    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.np
    public final Parcelable onSaveInstanceState() {
        int iF;
        int iJ;
        Object obj;
        ou ouVar = this.q;
        if (ouVar != null) {
            return new ou(ouVar);
        }
        ou ouVar2 = new ou();
        ouVar2.h = this.d;
        ouVar2.i = this.o;
        ouVar2.j = this.p;
        yv yvVar = this.h;
        if (yvVar == null || (obj = yvVar.b) == null) {
            ouVar2.e = 0;
        } else {
            ouVar2.f = (int[]) obj;
            ouVar2.e = ouVar2.f.length;
            ouVar2.g = yvVar.a;
        }
        if (getChildCount() > 0) {
            ouVar2.a = this.o ? b() : a();
            View viewD = this.e ? d(true) : e(true);
            ouVar2.b = viewD != null ? getPosition(viewD) : -1;
            int i = this.i;
            ouVar2.c = i;
            ouVar2.d = new int[i];
            for (int i2 = 0; i2 < this.i; i2++) {
                boolean z = this.o;
                ov[] ovVarArr = this.a;
                if (z) {
                    iF = ovVarArr[i2].d(Integer.MIN_VALUE);
                    if (iF != Integer.MIN_VALUE) {
                        iJ = this.b.f();
                        iF -= iJ;
                    }
                } else {
                    iF = ovVarArr[i2].f(Integer.MIN_VALUE);
                    if (iF != Integer.MIN_VALUE) {
                        iJ = this.b.j();
                        iF -= iJ;
                    }
                }
                ouVar2.d[i2] = iF;
            }
        } else {
            ouVar2.a = -1;
            ouVar2.b = -1;
            ouVar2.c = 0;
        }
        return ouVar2;
    }

    @Override // defpackage.np
    public final void onScrollStateChanged(int i) {
        if (i == 0) {
            j();
        }
    }

    @Override // defpackage.np
    public final int scrollHorizontallyBy(int i, nv nvVar, oe oeVar) {
        return c(i, nvVar, oeVar);
    }

    @Override // defpackage.np
    public final void scrollToPosition(int i) {
        ou ouVar = this.q;
        if (ouVar != null && ouVar.a != i) {
            ouVar.a();
        }
        this.f = i;
        this.g = Integer.MIN_VALUE;
        requestLayout();
    }

    @Override // defpackage.np
    public final int scrollVerticallyBy(int i, nv nvVar, oe oeVar) {
        return c(i, nvVar, oeVar);
    }

    @Override // defpackage.np
    public final void setMeasuredDimension(Rect rect, int i, int i2) {
        int iChooseSize;
        int iChooseSize2;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.j == 1) {
            iChooseSize2 = chooseSize(i2, rect.height() + paddingTop, getMinimumHeight());
            iChooseSize = chooseSize(i, (this.k * this.i) + paddingLeft, getMinimumWidth());
        } else {
            iChooseSize = chooseSize(i, rect.width() + paddingLeft, getMinimumWidth());
            iChooseSize2 = chooseSize(i2, (this.k * this.i) + paddingTop, getMinimumHeight());
        }
        setMeasuredDimension(iChooseSize, iChooseSize2);
    }

    @Override // defpackage.np
    public final void smoothScrollToPosition(RecyclerView recyclerView, oe oeVar, int i) {
        od odVar = new od(recyclerView.getContext());
        odVar.b = i;
        startSmoothScroll(odVar);
    }

    @Override // defpackage.np
    public final boolean supportsPredictiveItemAnimations() {
        return this.q == null;
    }

    @Override // defpackage.np
    public final nq generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new os(context, attributeSet);
    }
}
