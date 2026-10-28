package defpackage;

import android.view.View;
import android.view.ViewParent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ayt {
    public boolean a;
    private ViewParent b;
    private ViewParent c;
    private final View d;
    private int[] e;

    public ayt(View view) {
        this.d = view;
    }

    private final ViewParent i(int i) {
        return i != 0 ? this.c : this.b;
    }

    private final void j(int i, ViewParent viewParent) {
        if (i != 0) {
            this.c = viewParent;
        } else {
            this.b = viewParent;
        }
    }

    private final int[] k() {
        int[] iArr = this.e;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[2];
        this.e = iArr2;
        return iArr2;
    }

    public final void a(boolean z) {
        if (this.a) {
            View view = this.d;
            int i = bac.a;
            view.stopNestedScroll();
        }
        this.a = z;
    }

    public final void b(int i) {
        ViewParent viewParentI = i(i);
        if (viewParentI != null) {
            azy.g(viewParentI, this.d, i);
            j(i, null);
        }
    }

    public final boolean c(float f, float f2, boolean z) {
        ViewParent viewParent;
        if (!this.a || (viewParent = this.b) == null) {
            return false;
        }
        return azy.h(viewParent, this.d, f, f2, z);
    }

    public final boolean d(float f, float f2) {
        ViewParent viewParent;
        if (!this.a || (viewParent = this.b) == null) {
            return false;
        }
        return azy.i(viewParent, this.d, f, f2);
    }

    public final boolean e(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent viewParentI;
        int i4;
        int i5;
        if (!this.a || (viewParentI = i(i3)) == null) {
            return false;
        }
        if (i == 0) {
            if (i2 == 0) {
                if (iArr2 == null) {
                    return false;
                }
                iArr2[0] = 0;
                iArr2[1] = 0;
                return false;
            }
            i = 0;
        }
        if (iArr2 != null) {
            this.d.getLocationInWindow(iArr2);
            int i6 = iArr2[0];
            i5 = iArr2[1];
            i4 = i6;
        } else {
            iArr2 = null;
            i4 = 0;
            i5 = 0;
        }
        int[] iArr3 = iArr2;
        if (iArr == null) {
            iArr = k();
        }
        int[] iArr4 = iArr;
        iArr4[0] = 0;
        iArr4[1] = 0;
        View view = this.d;
        azy.d(viewParentI, view, i, i2, iArr4, i3);
        if (iArr3 != null) {
            view.getLocationInWindow(iArr3);
            iArr3[0] = iArr3[0] - i4;
            iArr3[1] = iArr3[1] - i5;
        }
        return (iArr4[0] == 0 && iArr4[1] == 0) ? false : true;
    }

    public final boolean f(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent viewParentI;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        if (!this.a || (viewParentI = i(i5)) == null) {
            return false;
        }
        if (i != 0) {
            i6 = i;
            i7 = i3;
            i8 = i2;
        } else if (i2 != 0) {
            i7 = i3;
            i8 = i2;
            i6 = 0;
        } else if (i3 != 0) {
            i6 = 0;
            i7 = i3;
            i8 = 0;
        } else {
            if (i4 == 0) {
                if (iArr == null) {
                    return false;
                }
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
            i6 = 0;
            i8 = 0;
            i7 = 0;
        }
        if (iArr != 0) {
            this.d.getLocationInWindow(iArr);
            int i11 = iArr[0];
            i10 = iArr[1];
            i9 = i11;
        } else {
            iArr = null;
            i9 = 0;
            i10 = 0;
        }
        int[] iArr3 = iArr;
        if (iArr2 == null) {
            iArr2 = k();
            iArr2[0] = 0;
            iArr2[1] = 0;
        }
        View view = this.d;
        azy.e(viewParentI, view, i6, i8, i7, i4, i5, iArr2);
        if (iArr3 != null) {
            view.getLocationInWindow(iArr3);
            iArr3[0] = iArr3[0] - i9;
            iArr3[1] = iArr3[1] - i10;
        }
        return true;
    }

    public final boolean g(int i) {
        return i(i) != null;
    }

    public final boolean h(int i, int i2) {
        if (g(i2)) {
            return true;
        }
        if (this.a) {
            View view = this.d;
            View view2 = view;
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                if (azy.j(parent, view2, view, i, i2)) {
                    j(i2, parent);
                    azy.f(parent, view2, view, i, i2);
                    return true;
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
        }
        return false;
    }
}
