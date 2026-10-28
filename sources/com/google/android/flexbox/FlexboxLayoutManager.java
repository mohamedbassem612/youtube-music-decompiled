package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import defpackage.abi;
import defpackage.jvj;
import defpackage.jvl;
import defpackage.jvo;
import defpackage.jvp;
import defpackage.jvq;
import defpackage.jvr;
import defpackage.nb;
import defpackage.nc;
import defpackage.nd;
import defpackage.nh;
import defpackage.no;
import defpackage.np;
import defpackage.nq;
import defpackage.nv;
import defpackage.oc;
import defpackage.od;
import defpackage.oe;
import defpackage.zh;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class FlexboxLayoutManager extends np implements jvj, oc {
    private static final Rect h = new Rect();
    public int a;
    public int b;
    public boolean c;
    public nd e;
    public nd f;
    private int i;
    private boolean k;
    private nv l;
    private oe m;
    private jvq n;
    private jvr p;
    private final Context v;
    private View w;
    private final int j = -1;
    public List d = new ArrayList();
    public final abi g = new abi(this);
    private final jvo o = new jvo(this);
    private int q = -1;
    private int r = Integer.MIN_VALUE;
    private int s = Integer.MIN_VALUE;
    private int t = Integer.MIN_VALUE;
    private final SparseArray u = new SparseArray();
    private int x = -1;
    private final zh y = new zh((byte[]) null);

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        no properties = getProperties(context, attributeSet, i, i2);
        int i3 = properties.a;
        if (i3 != 0) {
            if (i3 == 1) {
                if (properties.c) {
                    v(3);
                } else {
                    v(2);
                }
            }
        } else if (properties.c) {
            v(1);
        } else {
            v(0);
        }
        if (this.b != 1) {
            removeAllViews();
            J();
            this.b = 1;
            this.e = null;
            this.f = null;
            requestLayout();
        }
        if (this.i != 4) {
            removeAllViews();
            J();
            this.i = 4;
            requestLayout();
        }
        this.v = context;
    }

    private final int A(int i, nv nvVar, oe oeVar, boolean z) {
        int iC;
        int iF;
        if (t() || !this.c) {
            int iF2 = this.e.f() - i;
            if (iF2 <= 0) {
                return 0;
            }
            iC = -C(-iF2, nvVar, oeVar);
        } else {
            int iJ = i - this.e.j();
            if (iJ <= 0) {
                return 0;
            }
            iC = C(iJ, nvVar, oeVar);
        }
        int i2 = iC;
        int i3 = i + i2;
        if (!z || (iF = this.e.f() - i3) <= 0) {
            return i2;
        }
        this.e.n(iF);
        return i2 + iF;
    }

    private final int B(int i, nv nvVar, oe oeVar, boolean z) {
        int iC;
        int iJ;
        if (t() || !this.c) {
            int iJ2 = i - this.e.j();
            if (iJ2 <= 0) {
                return 0;
            }
            iC = -C(iJ2, nvVar, oeVar);
        } else {
            int iF = this.e.f() - i;
            if (iF <= 0) {
                return 0;
            }
            iC = C(-iF, nvVar, oeVar);
        }
        int i2 = iC;
        int i3 = i + i2;
        if (!z || (iJ = i3 - this.e.j()) <= 0) {
            return i2;
        }
        this.e.n(-iJ);
        return i2 - iJ;
    }

    /* JADX WARN: Code duplicated, block: B:72:0x01ee  */
    private final int C(int i, nv nvVar, oe oeVar) {
        int i2;
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        L();
        this.n.j = true;
        boolean z = !t() && this.c;
        int i3 = (!z ? i > 0 : i < 0) ? -1 : 1;
        int iAbs = Math.abs(i);
        this.n.i = i3;
        boolean zT = t();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getWidth(), getWidthMode());
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getHeight(), getHeightMode());
        boolean z2 = !zT && this.c;
        if (i3 == 1) {
            View childAt = getChildAt(getChildCount() - 1);
            if (childAt != null) {
                this.n.e = this.e.a(childAt);
                int position = getPosition(childAt);
                boolean z3 = z2;
                abi abiVar = this.g;
                View viewH = H(childAt, (jvl) this.d.get(((int[]) abiVar.e)[position]));
                this.n.h = 1;
                jvq jvqVar = this.n;
                int i4 = position + jvqVar.h;
                jvqVar.d = i4;
                int[] iArr = (int[]) abiVar.e;
                if (iArr.length <= i4) {
                    jvqVar.c = -1;
                } else {
                    jvqVar.c = iArr[i4];
                }
                nd ndVar = this.e;
                if (z3) {
                    jvqVar.e = ndVar.d(viewH);
                    this.n.f = (-this.e.d(viewH)) + this.e.j();
                    jvq jvqVar2 = this.n;
                    jvqVar2.f = Math.max(jvqVar2.f, 0);
                } else {
                    jvqVar.e = ndVar.a(viewH);
                    this.n.f = this.e.a(viewH) - this.e.f();
                }
                int i5 = this.n.c;
                if ((i5 == -1 || i5 > this.d.size() - 1) && this.n.d <= h()) {
                    int i6 = iAbs - this.n.f;
                    zh zhVar = this.y;
                    zhVar.h();
                    if (i6 > 0) {
                        jvq jvqVar3 = this.n;
                        if (zT) {
                            abiVar.q(zhVar, iMakeMeasureSpec, iMakeMeasureSpec2, i6, jvqVar3.d, -1, this.d);
                        } else {
                            abiVar.q(zhVar, iMakeMeasureSpec2, iMakeMeasureSpec, i6, jvqVar3.d, -1, this.d);
                            iMakeMeasureSpec2 = iMakeMeasureSpec2;
                            iMakeMeasureSpec = iMakeMeasureSpec;
                        }
                        abiVar.g(iMakeMeasureSpec, iMakeMeasureSpec2, this.n.d);
                        abiVar.m(this.n.d);
                    }
                }
                jvq jvqVar4 = this.n;
                jvqVar4.a = iAbs - jvqVar4.f;
            }
        } else {
            boolean z4 = z2;
            View childAt2 = getChildAt(0);
            if (childAt2 != null) {
                this.n.e = this.e.d(childAt2);
                int position2 = getPosition(childAt2);
                abi abiVar2 = this.g;
                View viewF = F(childAt2, (jvl) this.d.get(((int[]) abiVar2.e)[position2]));
                this.n.h = 1;
                int i7 = ((int[]) abiVar2.e)[position2];
                if (i7 == -1) {
                    i7 = 0;
                }
                if (i7 > 0) {
                    this.n.d = position2 - ((jvl) this.d.get(i7 - 1)).h;
                } else {
                    this.n.d = -1;
                }
                jvq jvqVar5 = this.n;
                jvqVar5.c = i7 > 0 ? i7 - 1 : 0;
                nd ndVar2 = this.e;
                if (z4) {
                    jvqVar5.e = ndVar2.a(viewF);
                    this.n.f = this.e.a(viewF) - this.e.f();
                    jvq jvqVar6 = this.n;
                    jvqVar6.f = Math.max(jvqVar6.f, 0);
                } else {
                    jvqVar5.e = ndVar2.d(viewF);
                    this.n.f = (-this.e.d(viewF)) + this.e.j();
                }
                jvq jvqVar7 = this.n;
                jvqVar7.a = iAbs - jvqVar7.f;
            }
        }
        jvq jvqVar8 = this.n;
        int iZ = jvqVar8.f + z(nvVar, oeVar, jvqVar8);
        if (iZ < 0) {
            return 0;
        }
        if (z) {
            if (iAbs > iZ) {
                i2 = (-i3) * iZ;
            } else {
                i2 = i;
            }
        } else if (iAbs > iZ) {
            i2 = i3 * iZ;
        } else {
            i2 = i;
        }
        this.e.n(-i2);
        this.n.g = i2;
        return i2;
    }

    private final int D(int i) {
        int height;
        int height2;
        int iMin;
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        L();
        boolean zT = t();
        View view = this.w;
        if (zT) {
            height = view.getWidth();
            height2 = getWidth();
        } else {
            height = view.getHeight();
            height2 = getHeight();
        }
        if (getLayoutDirection() == 1) {
            int iAbs = Math.abs(i);
            jvo jvoVar = this.o;
            if (i < 0) {
                iMin = Math.min((height2 + jvoVar.d) - height, iAbs);
            } else {
                iMin = jvoVar.d;
                if (iMin + i <= 0) {
                    return i;
                }
            }
        } else {
            jvo jvoVar2 = this.o;
            if (i > 0) {
                return Math.min((height2 - jvoVar2.d) - height, i);
            }
            iMin = jvoVar2.d;
            if (iMin + i >= 0) {
                return i;
            }
        }
        return -iMin;
    }

    private final View E(int i) {
        View viewI = I(0, getChildCount(), i);
        if (viewI != null) {
            int i2 = ((int[]) this.g.e)[getPosition(viewI)];
            if (i2 != -1) {
                return F(viewI, (jvl) this.d.get(i2));
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003a  */
    private final View F(View view, jvl jvlVar) {
        boolean zT = t();
        int i = jvlVar.h;
        for (int i2 = 1; i2 < i; i2++) {
            View childAt = getChildAt(i2);
            if (childAt != null && childAt.getVisibility() != 8) {
                if (!this.c || zT) {
                    if (this.e.d(view) > this.e.d(childAt)) {
                        view = childAt;
                    }
                } else if (this.e.a(view) < this.e.a(childAt)) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    private final View G(int i) {
        View viewI = I(getChildCount() - 1, -1, i);
        if (viewI == null) {
            return null;
        }
        return H(viewI, (jvl) this.d.get(((int[]) this.g.e)[getPosition(viewI)]));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0046  */
    private final View H(View view, jvl jvlVar) {
        boolean zT = t();
        int childCount = getChildCount() - jvlVar.h;
        for (int childCount2 = getChildCount() - 2; childCount2 > childCount - 1; childCount2--) {
            View childAt = getChildAt(childCount2);
            if (childAt != null && childAt.getVisibility() != 8) {
                if (!this.c || zT) {
                    if (this.e.a(view) < this.e.a(childAt)) {
                        view = childAt;
                    }
                } else if (this.e.d(view) > this.e.d(childAt)) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    private final View I(int i, int i2, int i3) {
        int position;
        L();
        K();
        int iJ = this.e.j();
        int iF = this.e.f();
        View view = null;
        int i4 = i;
        View view2 = null;
        while (i4 != i2) {
            View childAt = getChildAt(i4);
            if (childAt != null && (position = getPosition(childAt)) >= 0 && position < i3) {
                if (((nq) childAt.getLayoutParams()).gN()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.e.d(childAt) >= iJ && this.e.a(childAt) <= iF) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i4 += i2 > i ? 1 : -1;
        }
        return view == null ? view2 : view;
    }

    private final void J() {
        this.d.clear();
        jvo jvoVar = this.o;
        jvoVar.b();
        jvoVar.d = 0;
    }

    private final void K() {
        if (this.n == null) {
            this.n = new jvq();
        }
    }

    private final void L() {
        if (this.e == null) {
            boolean zT = t();
            int i = this.b;
            if (zT) {
                if (i == 0) {
                    this.e = new nb(this);
                    this.f = new nc(this);
                    return;
                } else {
                    this.e = new nc(this);
                    this.f = new nb(this);
                    return;
                }
            }
            if (i == 0) {
                this.e = new nc(this);
                this.f = new nb(this);
            } else {
                this.e = new nb(this);
                this.f = new nc(this);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0066 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x006a  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00db  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:67:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00f0 A[SYNTHETIC] */
    private final void M(nv nvVar, jvq jvqVar) {
        int childCount;
        View childAt;
        int childCount2;
        int i;
        View childAt2;
        if (jvqVar.j) {
            if (jvqVar.i == -1) {
                if (jvqVar.f < 0 || (childCount2 = getChildCount()) == 0 || (childAt2 = getChildAt((i = childCount2 - 1))) == null) {
                    return;
                }
                int i2 = ((int[]) this.g.e)[getPosition(childAt2)];
                if (i2 != -1) {
                    jvl jvlVar = (jvl) this.d.get(i2);
                    for (int i3 = i; i3 >= 0; i3--) {
                        View childAt3 = getChildAt(i3);
                        if (childAt3 != null) {
                            int i4 = jvqVar.f;
                            if (!t() && this.c) {
                                if (this.e.a(childAt3) > i4) {
                                    break;
                                }
                                if (jvlVar.o != getPosition(childAt3)) {
                                    continue;
                                } else if (i2 <= 0) {
                                    childCount2 = i3;
                                    break;
                                } else {
                                    i2 += jvqVar.i;
                                    jvlVar = (jvl) this.d.get(i2);
                                    childCount2 = i3;
                                }
                            } else {
                                if (this.e.d(childAt3) < this.e.e() - i4) {
                                    break;
                                }
                                if (jvlVar.o != getPosition(childAt3)) {
                                    continue;
                                } else if (i2 <= 0) {
                                    childCount2 = i3;
                                    break;
                                } else {
                                    i2 += jvqVar.i;
                                    jvlVar = (jvl) this.d.get(i2);
                                    childCount2 = i3;
                                }
                            }
                        }
                    }
                    N(nvVar, childCount2, i);
                    return;
                }
                return;
            }
            if (jvqVar.f < 0 || (childCount = getChildCount()) == 0 || (childAt = getChildAt(0)) == null) {
                return;
            }
            int i5 = ((int[]) this.g.e)[getPosition(childAt)];
            if (i5 != -1) {
                jvl jvlVar2 = (jvl) this.d.get(i5);
                int i6 = -1;
                int i7 = 0;
                while (i7 < childCount) {
                    View childAt4 = getChildAt(i7);
                    if (childAt4 != null) {
                        int i8 = jvqVar.f;
                        if (t() || !this.c) {
                            if (this.e.a(childAt4) > i8) {
                                break;
                            }
                            if (jvlVar2.p != getPosition(childAt4)) {
                                continue;
                            } else if (i5 < this.d.size() - 1) {
                                i5 += jvqVar.i;
                                jvlVar2 = (jvl) this.d.get(i5);
                                i6 = i7;
                            }
                            N(nvVar, 0, i7);
                        }
                        if (this.e.e() - this.e.d(childAt4) > i8) {
                            break;
                        }
                        if (jvlVar2.p != getPosition(childAt4)) {
                            continue;
                        } else if (i5 < this.d.size() - 1) {
                            i5 += jvqVar.i;
                            jvlVar2 = (jvl) this.d.get(i5);
                            i6 = i7;
                        }
                        N(nvVar, 0, i7);
                    }
                    i7++;
                }
                i7 = i6;
                N(nvVar, 0, i7);
            }
        }
    }

    private final void N(nv nvVar, int i, int i2) {
        while (i2 >= i) {
            removeAndRecycleViewAt(i2, nvVar);
            i2--;
        }
    }

    private final void O() {
        int heightMode = t() ? getHeightMode() : getWidthMode();
        jvq jvqVar = this.n;
        boolean z = true;
        if (heightMode != 0 && heightMode != Integer.MIN_VALUE) {
            z = false;
        }
        jvqVar.b = z;
    }

    private final void P(int i) {
        if (i < u()) {
            int childCount = getChildCount();
            abi abiVar = this.g;
            abiVar.i(childCount);
            abiVar.j(childCount);
            abiVar.h(childCount);
            if (i < ((int[]) abiVar.e).length) {
                this.x = i;
                View childAt = getChildAt(0);
                if (childAt != null) {
                    this.q = getPosition(childAt);
                    if (t() || !this.c) {
                        this.r = this.e.d(childAt) - this.e.j();
                    } else {
                        this.r = this.e.a(childAt) + this.e.g();
                    }
                }
            }
        }
    }

    private final void Q(jvo jvoVar, boolean z, boolean z2) {
        int i;
        if (z2) {
            O();
        } else {
            this.n.b = false;
        }
        if (t() || !this.c) {
            this.n.a = this.e.f() - jvoVar.c;
        } else {
            this.n.a = jvoVar.c - getPaddingRight();
        }
        jvq jvqVar = this.n;
        jvqVar.d = jvoVar.a;
        jvqVar.h = 1;
        jvq jvqVar2 = this.n;
        jvqVar2.i = 1;
        jvqVar2.e = jvoVar.c;
        jvqVar2.f = Integer.MIN_VALUE;
        jvqVar2.c = jvoVar.b;
        if (!z || this.d.size() <= 1 || (i = jvoVar.b) < 0 || i >= this.d.size() - 1) {
            return;
        }
        jvl jvlVar = (jvl) this.d.get(jvoVar.b);
        jvq jvqVar3 = this.n;
        jvqVar3.c++;
        jvqVar3.d += jvlVar.h;
    }

    private final void R(jvo jvoVar, boolean z, boolean z2) {
        if (z2) {
            O();
        } else {
            this.n.b = false;
        }
        if (t() || !this.c) {
            this.n.a = jvoVar.c - this.e.j();
        } else {
            this.n.a = (this.w.getWidth() - jvoVar.c) - this.e.j();
        }
        jvq jvqVar = this.n;
        jvqVar.d = jvoVar.a;
        jvqVar.h = 1;
        jvq jvqVar2 = this.n;
        jvqVar2.i = -1;
        jvqVar2.e = jvoVar.c;
        jvqVar2.f = Integer.MIN_VALUE;
        jvqVar2.c = jvoVar.b;
        if (!z || jvoVar.b <= 0) {
            return;
        }
        int size = this.d.size();
        int i = jvoVar.b;
        if (size > i) {
            jvl jvlVar = (jvl) this.d.get(i);
            jvq jvqVar3 = this.n;
            jvqVar3.c--;
            jvqVar3.d -= jvlVar.h;
        }
    }

    private static boolean S(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0 && (mode != 1073741824 || size != i)) {
                return false;
            }
        } else if (size < i) {
            return false;
        }
        return true;
    }

    private final boolean T(View view, int i, int i2, nq nqVar) {
        return (!view.isLayoutRequested() && isMeasurementCacheEnabled() && S(view.getWidth(), i, nqVar.width) && S(view.getHeight(), i2, nqVar.height)) ? false : true;
    }

    private final View U(int i, int i2) {
        int i3 = i;
        while (i3 != i2) {
            View childAt = getChildAt(i3);
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            int decoratedLeft = getDecoratedLeft(childAt) - ((nq) childAt.getLayoutParams()).leftMargin;
            int decoratedTop = getDecoratedTop(childAt) - ((nq) childAt.getLayoutParams()).topMargin;
            int decoratedRight = getDecoratedRight(childAt) + ((nq) childAt.getLayoutParams()).rightMargin;
            int decoratedBottom = getDecoratedBottom(childAt) + ((nq) childAt.getLayoutParams()).bottomMargin;
            int i4 = 1;
            boolean z = decoratedLeft >= width || decoratedRight >= paddingLeft;
            boolean z2 = decoratedTop >= height || decoratedBottom >= paddingTop;
            if (z && z2) {
                return childAt;
            }
            if (i2 <= i) {
                i4 = -1;
            }
            i3 += i4;
        }
        return null;
    }

    private final int w(oe oeVar) {
        if (getChildCount() != 0) {
            int iA = oeVar.a();
            L();
            View viewE = E(iA);
            View viewG = G(iA);
            if (oeVar.a() != 0 && viewE != null && viewG != null) {
                return Math.min(this.e.k(), this.e.a(viewG) - this.e.d(viewE));
            }
        }
        return 0;
    }

    private final int x(oe oeVar) {
        if (getChildCount() != 0) {
            int iA = oeVar.a();
            View viewE = E(iA);
            View viewG = G(iA);
            if (oeVar.a() != 0 && viewE != null && viewG != null) {
                int position = getPosition(viewE);
                int position2 = getPosition(viewG);
                int iA2 = this.e.a(viewG) - this.e.d(viewE);
                abi abiVar = this.g;
                int iAbs = Math.abs(iA2);
                int[] iArr = (int[]) abiVar.e;
                int i = iArr[position];
                if (i != 0 && i != -1) {
                    return Math.round((i * (iAbs / ((iArr[position2] - i) + 1))) + (this.e.j() - this.e.d(viewE)));
                }
            }
        }
        return 0;
    }

    private final int y(oe oeVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        int iA = oeVar.a();
        View viewE = E(iA);
        View viewG = G(iA);
        if (oeVar.a() == 0 || viewE == null || viewG == null) {
            return 0;
        }
        View viewU = U(0, getChildCount());
        return (int) ((Math.abs(this.e.a(viewG) - this.e.d(viewE)) / ((u() - (viewU == null ? -1 : getPosition(viewU))) + 1)) * oeVar.a());
    }

    private final int z(nv nvVar, oe oeVar, jvq jvqVar) {
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        float f;
        int i8 = jvqVar.f;
        if (i8 != Integer.MIN_VALUE) {
            int i9 = jvqVar.a;
            if (i9 < 0) {
                jvqVar.f = i8 + i9;
            }
            M(nvVar, jvqVar);
        }
        int i10 = jvqVar.a;
        boolean zT = t();
        int i11 = i10;
        int i12 = 0;
        while (true) {
            if (i11 <= 0 && !this.n.b) {
                break;
            }
            List list = this.d;
            int i13 = jvqVar.d;
            if (i13 < 0 || i13 >= oeVar.a() || (i = jvqVar.c) < 0 || i >= list.size()) {
                break;
            }
            jvl jvlVar = (jvl) this.d.get(jvqVar.c);
            jvqVar.d = jvlVar.o;
            if (t()) {
                int paddingLeft = getPaddingLeft();
                int paddingRight = getPaddingRight();
                int width = getWidth();
                int i14 = jvqVar.e;
                if (jvqVar.i == -1) {
                    i14 -= jvlVar.g;
                }
                int i15 = i14;
                int i16 = jvqVar.d;
                int i17 = width - paddingRight;
                float f2 = this.o.d;
                int i18 = jvlVar.h;
                float measuredWidth = i17 - f2;
                float measuredWidth2 = paddingLeft - f2;
                int i19 = i16;
                int i20 = 0;
                while (i19 < i16 + i18) {
                    int i21 = i16;
                    View viewM = m(i19);
                    int i22 = i10;
                    int i23 = jvqVar.i;
                    boolean z2 = zT;
                    Rect rect = h;
                    int i24 = i15;
                    if (i23 == 1) {
                        calculateItemDecorationsForChild(viewM, rect);
                        addView(viewM);
                    } else {
                        calculateItemDecorationsForChild(viewM, rect);
                        addView(viewM, i20);
                        i20++;
                    }
                    float f3 = measuredWidth2;
                    abi abiVar = this.g;
                    int i25 = i11;
                    long j = ((long[]) abiVar.c)[i19];
                    int i26 = (int) j;
                    int iO = abi.o(j);
                    jvp jvpVar = (jvp) viewM.getLayoutParams();
                    if (T(viewM, i26, iO, jvpVar)) {
                        viewM.measure(i26, iO);
                    }
                    float leftDecorationWidth = f3 + jvpVar.leftMargin + getLeftDecorationWidth(viewM);
                    float rightDecorationWidth = measuredWidth - (jvpVar.rightMargin + getRightDecorationWidth(viewM));
                    int topDecorationHeight = i24 + getTopDecorationHeight(viewM);
                    if (this.c) {
                        f = leftDecorationWidth;
                        abiVar.k(viewM, jvlVar, Math.round(rightDecorationWidth) - viewM.getMeasuredWidth(), topDecorationHeight, Math.round(rightDecorationWidth), topDecorationHeight + viewM.getMeasuredHeight());
                    } else {
                        f = leftDecorationWidth;
                        abiVar.k(viewM, jvlVar, Math.round(f), topDecorationHeight, Math.round(f) + viewM.getMeasuredWidth(), viewM.getMeasuredHeight() + topDecorationHeight);
                    }
                    measuredWidth2 = f + viewM.getMeasuredWidth() + jvpVar.rightMargin + getRightDecorationWidth(viewM) + 0.0f;
                    measuredWidth = rightDecorationWidth - (((viewM.getMeasuredWidth() + jvpVar.leftMargin) + getLeftDecorationWidth(viewM)) + 0.0f);
                    i19++;
                    i18 = i18;
                    i10 = i22;
                    zT = z2;
                    i15 = i24;
                    i11 = i25;
                    i16 = i21;
                }
                i2 = i10;
                z = zT;
                i3 = i11;
                jvqVar.c += this.n.i;
                i5 = jvlVar.g;
            } else {
                i2 = i10;
                z = zT;
                i3 = i11;
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i27 = jvqVar.e;
                if (jvqVar.i == -1) {
                    int i28 = jvlVar.g;
                    i4 = i27 + i28;
                    i27 -= i28;
                } else {
                    i4 = i27;
                }
                int i29 = jvqVar.d;
                int i30 = height - paddingBottom;
                float f4 = this.o.d;
                int i31 = jvlVar.h;
                float measuredHeight = i30 - f4;
                float f5 = paddingTop - f4;
                int i32 = i29;
                int i33 = 0;
                while (i32 < i29 + i31) {
                    int i34 = i31;
                    View viewM2 = m(i32);
                    int i35 = i29;
                    abi abiVar2 = this.g;
                    float f6 = f5;
                    long j2 = ((long[]) abiVar2.c)[i32];
                    int i36 = (int) j2;
                    int iO2 = abi.o(j2);
                    jvp jvpVar2 = (jvp) viewM2.getLayoutParams();
                    if (T(viewM2, i36, iO2, jvpVar2)) {
                        viewM2.measure(i36, iO2);
                    }
                    float topDecorationHeight2 = f6 + jvpVar2.topMargin + getTopDecorationHeight(viewM2);
                    float bottomDecorationHeight = measuredHeight - (jvpVar2.rightMargin + getBottomDecorationHeight(viewM2));
                    int i37 = jvqVar.i;
                    Rect rect2 = h;
                    int i38 = i32;
                    if (i37 == 1) {
                        calculateItemDecorationsForChild(viewM2, rect2);
                        addView(viewM2);
                    } else {
                        calculateItemDecorationsForChild(viewM2, rect2);
                        addView(viewM2, i33);
                        i33++;
                    }
                    int i39 = i33;
                    int leftDecorationWidth2 = getLeftDecorationWidth(viewM2) + i27;
                    int rightDecorationWidth2 = i4 - getRightDecorationWidth(viewM2);
                    boolean z3 = this.c;
                    boolean z4 = this.k;
                    if (!z3) {
                        i6 = i34;
                        i7 = i35;
                        if (z4) {
                            abiVar2.l(viewM2, jvlVar, false, leftDecorationWidth2, Math.round(bottomDecorationHeight) - viewM2.getMeasuredHeight(), leftDecorationWidth2 + viewM2.getMeasuredWidth(), Math.round(bottomDecorationHeight));
                        } else {
                            abiVar2.l(viewM2, jvlVar, false, leftDecorationWidth2, Math.round(topDecorationHeight2), leftDecorationWidth2 + viewM2.getMeasuredWidth(), Math.round(topDecorationHeight2) + viewM2.getMeasuredHeight());
                        }
                    } else if (z4) {
                        i7 = i35;
                        i6 = i34;
                        abiVar2.l(viewM2, jvlVar, true, rightDecorationWidth2 - viewM2.getMeasuredWidth(), Math.round(bottomDecorationHeight) - viewM2.getMeasuredHeight(), rightDecorationWidth2, Math.round(bottomDecorationHeight));
                    } else {
                        i6 = i34;
                        i7 = i35;
                        abiVar2.l(viewM2, jvlVar, true, rightDecorationWidth2 - viewM2.getMeasuredWidth(), Math.round(topDecorationHeight2), rightDecorationWidth2, Math.round(topDecorationHeight2) + viewM2.getMeasuredHeight());
                    }
                    float measuredHeight2 = topDecorationHeight2 + viewM2.getMeasuredHeight() + jvpVar2.topMargin + getBottomDecorationHeight(viewM2) + 0.0f;
                    measuredHeight = bottomDecorationHeight - (((viewM2.getMeasuredHeight() + jvpVar2.bottomMargin) + getTopDecorationHeight(viewM2)) + 0.0f);
                    i29 = i7;
                    i33 = i39;
                    i31 = i6;
                    i32 = i38 + 1;
                    f5 = measuredHeight2;
                }
                jvqVar.c += this.n.i;
                i5 = jvlVar.g;
            }
            i12 += i5;
            if (z || !this.c) {
                jvqVar.e += jvlVar.g * jvqVar.i;
            } else {
                jvqVar.e -= jvlVar.g * jvqVar.i;
            }
            i11 = i3 - jvlVar.g;
            i10 = i2;
            zT = z;
        }
        int i40 = i10;
        int i41 = jvqVar.a - i12;
        jvqVar.a = i41;
        int i42 = jvqVar.f;
        if (i42 != Integer.MIN_VALUE) {
            int i43 = i42 + i12;
            jvqVar.f = i43;
            if (i41 < 0) {
                jvqVar.f = i43 + i41;
            }
            M(nvVar, jvqVar);
        }
        return i40 - jvqVar.a;
    }

    @Override // defpackage.jvj
    public final int a() {
        return 5;
    }

    @Override // defpackage.jvj
    public final int b() {
        return this.i;
    }

    @Override // defpackage.jvj
    public final int c(int i, int i2, int i3) {
        return getChildMeasureSpec(getHeight(), getHeightMode(), i2, i3, canScrollVertically());
    }

    @Override // defpackage.np
    public final boolean canScrollHorizontally() {
        if (this.b == 0) {
            return t();
        }
        if (t()) {
            int width = getWidth();
            View view = this.w;
            if (width <= (view != null ? view.getWidth() : 0)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.np
    public final boolean canScrollVertically() {
        if (this.b == 0) {
            if (!t()) {
                return true;
            }
        } else {
            if (t()) {
                return true;
            }
            int height = getHeight();
            View view = this.w;
            if (height > (view != null ? view.getHeight() : 0)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.np
    public final boolean checkLayoutParams(nq nqVar) {
        return nqVar instanceof jvp;
    }

    @Override // defpackage.np
    public final int computeHorizontalScrollExtent(oe oeVar) {
        return w(oeVar);
    }

    @Override // defpackage.np
    public final int computeHorizontalScrollOffset(oe oeVar) {
        return x(oeVar);
    }

    @Override // defpackage.np
    public final int computeHorizontalScrollRange(oe oeVar) {
        return y(oeVar);
    }

    @Override // defpackage.oc
    public final PointF computeScrollVectorForPosition(int i) {
        View childAt;
        if (getChildCount() == 0 || (childAt = getChildAt(0)) == null) {
            return null;
        }
        float f = i < getPosition(childAt) ? -1 : 1;
        return t() ? new PointF(0.0f, f) : new PointF(f, 0.0f);
    }

    @Override // defpackage.np
    public final int computeVerticalScrollExtent(oe oeVar) {
        return w(oeVar);
    }

    @Override // defpackage.np
    public final int computeVerticalScrollOffset(oe oeVar) {
        return x(oeVar);
    }

    @Override // defpackage.np
    public final int computeVerticalScrollRange(oe oeVar) {
        return y(oeVar);
    }

    @Override // defpackage.jvj
    public final int d(int i, int i2, int i3) {
        return getChildMeasureSpec(getWidth(), getWidthMode(), i2, i3, canScrollHorizontally());
    }

    @Override // defpackage.jvj
    public final int e(View view) {
        int leftDecorationWidth;
        int rightDecorationWidth;
        if (t()) {
            leftDecorationWidth = getTopDecorationHeight(view);
            rightDecorationWidth = getBottomDecorationHeight(view);
        } else {
            leftDecorationWidth = getLeftDecorationWidth(view);
            rightDecorationWidth = getRightDecorationWidth(view);
        }
        return leftDecorationWidth + rightDecorationWidth;
    }

    @Override // defpackage.jvj
    public final int f(View view, int i, int i2) {
        int topDecorationHeight;
        int bottomDecorationHeight;
        if (t()) {
            topDecorationHeight = getLeftDecorationWidth(view);
            bottomDecorationHeight = getRightDecorationWidth(view);
        } else {
            topDecorationHeight = getTopDecorationHeight(view);
            bottomDecorationHeight = getBottomDecorationHeight(view);
        }
        return topDecorationHeight + bottomDecorationHeight;
    }

    @Override // defpackage.jvj
    public final int g() {
        return this.a;
    }

    @Override // defpackage.np
    public final nq generateDefaultLayoutParams() {
        return new jvp();
    }

    @Override // defpackage.np
    public final nq generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new jvp(context, attributeSet);
    }

    @Override // defpackage.jvj
    public final int h() {
        return this.m.a();
    }

    @Override // defpackage.jvj
    public final int i() {
        return this.b;
    }

    @Override // defpackage.np
    public final boolean isAutoMeasureEnabled() {
        return true;
    }

    @Override // defpackage.jvj
    public final int j() {
        if (this.d.size() == 0) {
            return 0;
        }
        int size = this.d.size();
        int iMax = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            iMax = Math.max(iMax, ((jvl) this.d.get(i)).e);
        }
        return iMax;
    }

    @Override // defpackage.jvj
    public final int k() {
        return this.j;
    }

    @Override // defpackage.jvj
    public final int l() {
        int size = this.d.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((jvl) this.d.get(i2)).g;
        }
        return i;
    }

    @Override // defpackage.jvj
    public final View m(int i) {
        View view = (View) this.u.get(i);
        return view == null ? this.l.n(i) : view;
    }

    @Override // defpackage.jvj
    public final View n(int i) {
        return m(i);
    }

    @Override // defpackage.jvj
    public final List o() {
        return this.d;
    }

    @Override // defpackage.np
    public final void onAdapterChanged(nh nhVar, nh nhVar2) {
        removeAllViews();
    }

    @Override // defpackage.np
    public final void onAttachedToWindow(RecyclerView recyclerView) {
        this.w = (View) recyclerView.getParent();
    }

    @Override // defpackage.np
    public final void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        P(i);
    }

    @Override // defpackage.np
    public final void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        P(Math.min(i, i2));
    }

    @Override // defpackage.np
    public final void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        P(i);
    }

    @Override // defpackage.np
    public final void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        super.onItemsUpdated(recyclerView, i, i2, obj);
        P(i);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:102:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:103:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:106:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:109:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:112:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:123:0x0219  */
    /* JADX WARN: Code duplicated, block: B:124:0x021e  */
    /* JADX WARN: Code duplicated, block: B:126:0x0225  */
    /* JADX WARN: Code duplicated, block: B:185:0x0384  */
    /* JADX WARN: Code duplicated, block: B:186:0x0393  */
    /* JADX WARN: Code duplicated, block: B:189:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:191:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:192:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:195:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x0036  */
    /* JADX WARN: Code duplicated, block: B:22:0x0038  */
    /* JADX WARN: Code duplicated, block: B:83:0x0166  */
    /* JADX WARN: Code duplicated, block: B:85:0x016a  */
    /* JADX WARN: Code duplicated, block: B:86:0x0173  */
    /* JADX WARN: Code duplicated, block: B:88:0x017d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0183  */
    /* JADX WARN: Code duplicated, block: B:91:0x0186  */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.np
    public final void onLayoutChildren(nv nvVar, oe oeVar) {
        boolean z;
        View viewE;
        FlexboxLayoutManager flexboxLayoutManager;
        nd ndVar;
        int position;
        int i;
        int size;
        int i2;
        boolean z2;
        nd ndVar2;
        int iJ;
        int i3;
        View childAt;
        boolean z3;
        int i4;
        int i5;
        boolean z4;
        jvq jvqVar;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        this.l = nvVar;
        this.m = oeVar;
        int iA = oeVar.a();
        if (iA == 0) {
            if (oeVar.g) {
                return;
            } else {
                iA = 0;
            }
        }
        int layoutDirection = getLayoutDirection();
        int i12 = this.a;
        if (i12 == 0) {
            if (layoutDirection == 1) {
                z = true;
            } else {
                z = false;
            }
            this.c = z;
            this.k = false;
        } else if (i12 == 1) {
            if (layoutDirection != 1) {
                z = true;
            } else {
                z = false;
            }
            this.c = z;
            this.k = false;
        } else if (i12 != 2) {
            this.c = layoutDirection == 1;
            this.k = true;
        } else {
            if (layoutDirection == 1) {
                z = true;
            } else {
                z = false;
            }
            this.c = z;
            this.k = false;
        }
        L();
        K();
        abi abiVar = this.g;
        abiVar.i(iA);
        abiVar.j(iA);
        abiVar.h(iA);
        this.n.j = false;
        jvr jvrVar = this.p;
        if (jvrVar != null && jvrVar.b(iA)) {
            this.q = jvrVar.a;
        }
        jvo jvoVar = this.o;
        if (!jvoVar.f || this.q != -1 || jvrVar != null) {
            jvoVar.b();
            jvr jvrVar2 = this.p;
            if (oeVar.g || (i3 = this.q) == -1) {
                if (getChildCount() == 0) {
                    jvoVar.a();
                    jvoVar.a = 0;
                    jvoVar.b = 0;
                } else {
                    if (jvoVar.e) {
                        viewE = G(oeVar.a());
                    } else {
                        viewE = E(oeVar.a());
                    }
                    if (viewE != null) {
                        flexboxLayoutManager = jvoVar.h;
                        if (flexboxLayoutManager.b == 0) {
                            ndVar = flexboxLayoutManager.f;
                        } else {
                            ndVar = flexboxLayoutManager.e;
                        }
                        if (flexboxLayoutManager.t() && flexboxLayoutManager.c) {
                            if (jvoVar.e) {
                                jvoVar.c = ndVar.d(viewE) + ndVar.o();
                            } else {
                                jvoVar.c = ndVar.a(viewE);
                            }
                        } else if (jvoVar.e) {
                            jvoVar.c = ndVar.a(viewE) + ndVar.o();
                        } else {
                            jvoVar.c = ndVar.d(viewE);
                        }
                        position = flexboxLayoutManager.getPosition(viewE);
                        jvoVar.a = position;
                        jvoVar.g = false;
                        abi abiVar2 = flexboxLayoutManager.g;
                        if (position == -1) {
                            position = 0;
                        }
                        i = ((int[]) abiVar2.e)[position];
                        if (i == -1) {
                            i = 0;
                        }
                        jvoVar.b = i;
                        size = flexboxLayoutManager.d.size();
                        i2 = jvoVar.b;
                        if (size > i2) {
                            jvoVar.a = ((jvl) flexboxLayoutManager.d.get(i2)).o;
                        }
                        if (!oeVar.g && supportsPredictiveItemAnimations() && (this.e.d(viewE) >= this.e.f() || this.e.a(viewE) < this.e.j())) {
                            z2 = jvoVar.e;
                            ndVar2 = this.e;
                            if (z2) {
                                iJ = ndVar2.f();
                            } else {
                                iJ = ndVar2.j();
                            }
                            jvoVar.c = iJ;
                        }
                    } else {
                        jvoVar.a();
                        jvoVar.a = 0;
                        jvoVar.b = 0;
                    }
                }
            } else if (i3 < 0 || i3 >= oeVar.a()) {
                this.q = -1;
                this.r = Integer.MIN_VALUE;
                if (getChildCount() == 0) {
                    jvoVar.a();
                    jvoVar.a = 0;
                    jvoVar.b = 0;
                } else {
                    if (jvoVar.e) {
                        viewE = G(oeVar.a());
                    } else {
                        viewE = E(oeVar.a());
                    }
                    if (viewE != null) {
                        flexboxLayoutManager = jvoVar.h;
                        if (flexboxLayoutManager.b == 0) {
                            ndVar = flexboxLayoutManager.f;
                        } else {
                            ndVar = flexboxLayoutManager.e;
                        }
                        if (flexboxLayoutManager.t()) {
                            if (jvoVar.e) {
                                jvoVar.c = ndVar.a(viewE) + ndVar.o();
                            } else {
                                jvoVar.c = ndVar.d(viewE);
                            }
                        } else if (jvoVar.e) {
                            jvoVar.c = ndVar.a(viewE) + ndVar.o();
                        } else {
                            jvoVar.c = ndVar.d(viewE);
                        }
                        position = flexboxLayoutManager.getPosition(viewE);
                        jvoVar.a = position;
                        jvoVar.g = false;
                        abi abiVar3 = flexboxLayoutManager.g;
                        if (position == -1) {
                            position = 0;
                        }
                        i = ((int[]) abiVar3.e)[position];
                        if (i == -1) {
                            i = 0;
                        }
                        jvoVar.b = i;
                        size = flexboxLayoutManager.d.size();
                        i2 = jvoVar.b;
                        if (size > i2) {
                            jvoVar.a = ((jvl) flexboxLayoutManager.d.get(i2)).o;
                        }
                        if (!oeVar.g) {
                            z2 = jvoVar.e;
                            ndVar2 = this.e;
                            if (z2) {
                                iJ = ndVar2.f();
                            } else {
                                iJ = ndVar2.j();
                            }
                            jvoVar.c = iJ;
                        }
                    } else {
                        jvoVar.a();
                        jvoVar.a = 0;
                        jvoVar.b = 0;
                    }
                }
            } else {
                int i13 = this.q;
                jvoVar.a = i13;
                jvoVar.b = ((int[]) abiVar.e)[i13];
                jvr jvrVar3 = this.p;
                if (jvrVar3 == null || !jvrVar3.b(oeVar.a())) {
                    int i14 = this.r;
                    if (i14 == Integer.MIN_VALUE) {
                        View viewFindViewByPosition = findViewByPosition(this.q);
                        if (viewFindViewByPosition == null) {
                            if (getChildCount() > 0 && (childAt = getChildAt(0)) != null) {
                                jvoVar.e = this.q < getPosition(childAt);
                            }
                            jvoVar.a();
                        } else if (this.e.b(viewFindViewByPosition) > this.e.k()) {
                            jvoVar.a();
                        } else {
                            int iD = this.e.d(viewFindViewByPosition) - this.e.j();
                            nd ndVar3 = this.e;
                            if (iD < 0) {
                                jvoVar.c = ndVar3.j();
                                jvoVar.e = false;
                            } else if (ndVar3.f() - this.e.a(viewFindViewByPosition) < 0) {
                                jvoVar.c = this.e.f();
                                jvoVar.e = true;
                            } else {
                                boolean z5 = jvoVar.e;
                                nd ndVar4 = this.e;
                                jvoVar.c = z5 ? ndVar4.a(viewFindViewByPosition) + this.e.o() : ndVar4.d(viewFindViewByPosition);
                            }
                        }
                    } else if (t() || !this.c) {
                        jvoVar.c = this.e.j() + this.r;
                    } else {
                        jvoVar.c = i14 - this.e.g();
                    }
                } else {
                    jvoVar.c = this.e.j() + jvrVar2.b;
                    jvoVar.g = true;
                    jvoVar.b = -1;
                }
            }
            jvoVar.f = true;
        }
        detachAndScrapAttachedViews(nvVar);
        if (jvoVar.e) {
            R(jvoVar, false, true);
        } else {
            Q(jvoVar, false, true);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getWidth(), getWidthMode());
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getHeight(), getHeightMode());
        int width = getWidth();
        int height = getHeight();
        if (t()) {
            int i15 = this.s;
            z3 = (i15 == Integer.MIN_VALUE || i15 == width) ? false : true;
            jvq jvqVar2 = this.n;
            i4 = jvqVar2.b ? this.v.getResources().getDisplayMetrics().heightPixels : jvqVar2.a;
        } else {
            int i16 = this.t;
            z3 = (i16 == Integer.MIN_VALUE || i16 == height) ? false : true;
            jvq jvqVar3 = this.n;
            i4 = jvqVar3.b ? this.v.getResources().getDisplayMetrics().widthPixels : jvqVar3.a;
        }
        this.s = width;
        this.t = height;
        int i17 = this.x;
        if (i17 == -1) {
            if (this.q == -1 && !z3) {
                i5 = -1;
            } else if (!jvoVar.e) {
                this.d.clear();
                zh zhVar = this.y;
                zhVar.h();
                if (t()) {
                    i11 = iMakeMeasureSpec;
                    abiVar.q(zhVar, i11, iMakeMeasureSpec2, i4, 0, jvoVar.a, this.d);
                    i10 = iMakeMeasureSpec2;
                } else {
                    abiVar.q(zhVar, iMakeMeasureSpec2, iMakeMeasureSpec, i4, 0, jvoVar.a, this.d);
                    i10 = iMakeMeasureSpec2;
                    i11 = iMakeMeasureSpec;
                }
                this.d = zhVar.b;
                abiVar.g(i11, i10, 0);
                abiVar.m(0);
                int i18 = ((int[]) abiVar.e)[jvoVar.a];
                jvoVar.b = i18;
                this.n.c = i18;
            }
            z(nvVar, oeVar, this.n);
            z4 = jvoVar.e;
            jvqVar = this.n;
            if (z4) {
                i7 = jvqVar.e;
                Q(jvoVar, true, false);
                z(nvVar, oeVar, this.n);
                i6 = this.n.e;
            } else {
                i6 = jvqVar.e;
                R(jvoVar, true, false);
                z(nvVar, oeVar, this.n);
                i7 = this.n.e;
            }
            if (getChildCount() > 0) {
                if (jvoVar.e) {
                    B(i7 + A(i6, nvVar, oeVar, true), nvVar, oeVar, false);
                } else {
                    A(i6 + B(i7, nvVar, oeVar, true), nvVar, oeVar, false);
                }
            }
        }
        i5 = i17;
        int i19 = i4;
        int iMin = i5 != -1 ? Math.min(i5, jvoVar.a) : jvoVar.a;
        zh zhVar2 = this.y;
        zhVar2.h();
        boolean zT = t();
        List list = this.d;
        if (!zT) {
            i8 = iMin;
            if (list.size() > 0) {
                abiVar.e(this.d, i8);
                iMin = i8;
                abiVar.q(zhVar2, iMakeMeasureSpec2, iMakeMeasureSpec, i19, iMin, jvoVar.a, this.d);
                i9 = iMakeMeasureSpec2;
                iMakeMeasureSpec = iMakeMeasureSpec;
                i8 = iMin;
            } else {
                abiVar.h(iA);
                abiVar.q(zhVar2, iMakeMeasureSpec2, iMakeMeasureSpec, i19, 0, -1, this.d);
                i9 = iMakeMeasureSpec2;
                iMakeMeasureSpec = iMakeMeasureSpec;
            }
        } else if (list.size() > 0) {
            abiVar.e(this.d, iMin);
            i9 = iMakeMeasureSpec2;
            abiVar.q(zhVar2, iMakeMeasureSpec, i9, i19, iMin, jvoVar.a, this.d);
            i8 = iMin;
        } else {
            i9 = iMakeMeasureSpec2;
            i8 = iMin;
            abiVar.h(iA);
            abiVar.q(zhVar2, iMakeMeasureSpec, i9, i19, 0, -1, this.d);
        }
        this.d = zhVar2.b;
        abiVar.g(iMakeMeasureSpec, i9, i8);
        abiVar.m(i8);
        z(nvVar, oeVar, this.n);
        z4 = jvoVar.e;
        jvqVar = this.n;
        if (z4) {
            i7 = jvqVar.e;
            Q(jvoVar, true, false);
            z(nvVar, oeVar, this.n);
            i6 = this.n.e;
        } else {
            i6 = jvqVar.e;
            R(jvoVar, true, false);
            z(nvVar, oeVar, this.n);
            i7 = this.n.e;
        }
        if (getChildCount() > 0) {
            if (jvoVar.e) {
                B(i7 + A(i6, nvVar, oeVar, true), nvVar, oeVar, false);
            } else {
                A(i6 + B(i7, nvVar, oeVar, true), nvVar, oeVar, false);
            }
        }
    }

    @Override // defpackage.np
    public final void onLayoutCompleted(oe oeVar) {
        this.p = null;
        this.q = -1;
        this.r = Integer.MIN_VALUE;
        this.x = -1;
        this.o.b();
        this.u.clear();
    }

    @Override // defpackage.np
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof jvr) {
            this.p = (jvr) parcelable;
            requestLayout();
        }
    }

    @Override // defpackage.np
    public final Parcelable onSaveInstanceState() {
        jvr jvrVar = this.p;
        if (jvrVar != null) {
            return new jvr(jvrVar);
        }
        jvr jvrVar2 = new jvr();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            jvrVar2.a = getPosition(childAt);
            jvrVar2.b = this.e.d(childAt) - this.e.j();
        } else {
            jvrVar2.a();
        }
        return jvrVar2;
    }

    @Override // defpackage.jvj
    public final void p(View view, int i, int i2, jvl jvlVar) {
        calculateItemDecorationsForChild(view, h);
        if (t()) {
            int leftDecorationWidth = getLeftDecorationWidth(view) + getRightDecorationWidth(view);
            jvlVar.e += leftDecorationWidth;
            jvlVar.f += leftDecorationWidth;
        } else {
            int topDecorationHeight = getTopDecorationHeight(view) + getBottomDecorationHeight(view);
            jvlVar.e += topDecorationHeight;
            jvlVar.f += topDecorationHeight;
        }
    }

    @Override // defpackage.jvj
    public final void r(List list) {
        this.d = list;
    }

    @Override // defpackage.jvj
    public final void s(int i, View view) {
        this.u.put(i, view);
    }

    @Override // defpackage.np
    public final int scrollHorizontallyBy(int i, nv nvVar, oe oeVar) {
        if (!t() || this.b == 0) {
            int iC = C(i, nvVar, oeVar);
            this.u.clear();
            return iC;
        }
        int iD = D(i);
        this.o.d += iD;
        this.f.n(-iD);
        return iD;
    }

    @Override // defpackage.np
    public final void scrollToPosition(int i) {
        this.q = i;
        this.r = Integer.MIN_VALUE;
        jvr jvrVar = this.p;
        if (jvrVar != null) {
            jvrVar.a();
        }
        requestLayout();
    }

    @Override // defpackage.np
    public final int scrollVerticallyBy(int i, nv nvVar, oe oeVar) {
        if (t() || (this.b == 0 && !t())) {
            int iC = C(i, nvVar, oeVar);
            this.u.clear();
            return iC;
        }
        int iD = D(i);
        this.o.d += iD;
        this.f.n(-iD);
        return iD;
    }

    @Override // defpackage.np
    public final void smoothScrollToPosition(RecyclerView recyclerView, oe oeVar, int i) {
        od odVar = new od(recyclerView.getContext());
        odVar.b = i;
        startSmoothScroll(odVar);
    }

    @Override // defpackage.jvj
    public final boolean t() {
        int i = this.a;
        return i == 0 || i == 1;
    }

    public final int u() {
        View viewU = U(getChildCount() - 1, -1);
        if (viewU != null) {
            return getPosition(viewU);
        }
        return -1;
    }

    public final void v(int i) {
        if (this.a != i) {
            removeAllViews();
            this.a = i;
            this.e = null;
            this.f = null;
            J();
            requestLayout();
        }
    }

    @Override // defpackage.np
    public final void onItemsUpdated(RecyclerView recyclerView, int i, int i2) {
        P(i);
    }

    @Override // defpackage.jvj
    public final void q(jvl jvlVar) {
    }
}
