package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class bbc extends bbk {
    private static boolean g = false;
    private static Method h;
    private static Class k;
    private static Field l;
    private static Field m;
    final WindowInsets a;
    avw b;
    int c;
    ayk d;
    int e;
    int f;
    private avw[] n;
    private avw o;
    private bbn p;
    private Rect[][] q;
    private Rect[][] r;

    public bbc(bbn bbnVar, WindowInsets windowInsets) {
        super(bbnVar);
        this.o = null;
        this.q = new Rect[10][];
        this.r = new Rect[10][];
        this.a = windowInsets;
    }

    private avw G(int i, boolean z) {
        avw avwVarB = avw.a;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                avwVarB = avw.b(avwVarB, b(i2, z));
            }
        }
        return avwVarB;
    }

    private avw H() {
        bbn bbnVar = this.p;
        return bbnVar != null ? bbnVar.h() : avw.a;
    }

    private avw I(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!g) {
            L();
        }
        Method method = h;
        avw avwVarD = null;
        if (method != null && k != null && l != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                } else {
                    Rect rect = (Rect) l.get(m.get(objInvoke));
                    if (rect != null) {
                        avwVarD = avw.d(rect.left, rect.top, rect.right, rect.bottom);
                    }
                }
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). ".concat(String.valueOf(e.getMessage())), e);
            }
        }
        return avwVarD;
    }

    private ayk J(View view) {
        Display display;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        Point point = new Point();
        display.getRealSize(point);
        if (this.j.b.s()) {
            int i = point.x;
            int i2 = point.y;
            return new ayk(ayk.a(i, i2, true, 0, 0, 0, 0), i, i2);
        }
        aza azaVarE = azs.e(display, 0);
        aza azaVarE2 = azs.e(display, 1);
        aza azaVarE3 = azs.e(display, 2);
        aza azaVarE4 = azs.e(display, 3);
        int i3 = point.x;
        int i4 = point.y;
        return new ayk(ayk.a(i3, i4, false, azaVarE != null ? azaVarE.a : 0, azaVarE2 != null ? azaVarE2.a : 0, azaVarE3 != null ? azaVarE3.a : 0, azaVarE4 != null ? azaVarE4.a : 0), i3, i4);
    }

    private static List K(Rect[][] rectArr, int i) {
        Rect[] rectArr2;
        Rect[] rectArr3 = null;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && (rectArr2 = rectArr[azu.d(i2)]) != null) {
                if (rectArr3 == null) {
                    rectArr3 = rectArr2;
                } else {
                    int length = rectArr3.length;
                    int length2 = rectArr2.length;
                    Rect[] rectArr4 = new Rect[length + length2];
                    System.arraycopy(rectArr3, 0, rectArr4, 0, length);
                    System.arraycopy(rectArr2, 0, rectArr4, length, length2);
                    rectArr3 = rectArr4;
                }
            }
        }
        return rectArr3 == null ? Collections.EMPTY_LIST : Arrays.asList(rectArr3);
    }

    private static void L() {
        try {
            h = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            k = cls;
            l = cls.getDeclaredField("mVisibleInsets");
            m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            l.setAccessible(true);
            m.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). ".concat(String.valueOf(e.getMessage())), e);
        }
        g = true;
    }

    private Rect[] M(avw avwVar) {
        ArrayList arrayList = new ArrayList();
        int i = avwVar.b;
        if (i != 0) {
            arrayList.add(new Rect(0, 0, i, this.e));
        }
        int i2 = avwVar.c;
        if (i2 != 0) {
            arrayList.add(new Rect(0, 0, this.f, i2));
        }
        int i3 = avwVar.d;
        if (i3 != 0) {
            int i4 = this.f;
            arrayList.add(new Rect(i4 - i3, 0, i4, this.e));
        }
        int i5 = avwVar.e;
        if (i5 != 0) {
            int i6 = this.e;
            arrayList.add(new Rect(0, i6 - i5, this.f, i6));
        }
        return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
    }

    static boolean v(int i, int i2) {
        return (i & 6) == (i2 & 6);
    }

    @Override // defpackage.bbk
    public avw a(int i) {
        return G(i, false);
    }

    protected avw b(int i, boolean z) {
        avw avwVarH;
        avw avwVar;
        if (i != 1) {
            if (i != 2) {
                if (i == 8) {
                    avw[] avwVarArr = this.n;
                    avwVarH = avwVarArr != null ? avwVarArr[azu.d(8)] : null;
                    if (avwVarH != null) {
                        return avwVarH;
                    }
                    avw avwVarD = d();
                    avw avwVarH2 = H();
                    int i2 = avwVarD.e;
                    int i3 = avwVarH2.e;
                    if (i2 > i3 || ((avwVar = this.b) != null && !avwVar.equals(avw.a) && (i2 = this.b.e) > i3)) {
                        return avw.d(0, 0, 0, i2);
                    }
                } else {
                    if (i == 16) {
                        return E();
                    }
                    if (i == 32) {
                        return D();
                    }
                    if (i == 64) {
                        return F();
                    }
                    if (i == 128) {
                        bbn bbnVar = this.p;
                        ayi ayiVarJ = bbnVar != null ? bbnVar.j() : B();
                        if (ayiVarJ != null) {
                            return avw.d(Build.VERSION.SDK_INT >= 28 ? ayiVarJ.a.getSafeInsetLeft() : 0, Build.VERSION.SDK_INT >= 28 ? ayiVarJ.a.getSafeInsetTop() : 0, Build.VERSION.SDK_INT >= 28 ? ayiVarJ.a.getSafeInsetRight() : 0, Build.VERSION.SDK_INT >= 28 ? ayiVarJ.a.getSafeInsetBottom() : 0);
                        }
                    }
                }
            } else {
                if (z) {
                    avw avwVarH3 = H();
                    avw avwVarW = w();
                    return avw.d(Math.max(avwVarH3.b, avwVarW.b), 0, Math.max(avwVarH3.d, avwVarW.d), Math.max(avwVarH3.e, avwVarW.e));
                }
                if ((this.c & 2) == 0) {
                    avw avwVarD2 = d();
                    bbn bbnVar2 = this.p;
                    avwVarH = bbnVar2 != null ? bbnVar2.h() : null;
                    int iMin = avwVarD2.e;
                    if (avwVarH != null) {
                        iMin = Math.min(iMin, avwVarH.e);
                    }
                    return avw.d(avwVarD2.b, 0, avwVarD2.d, iMin);
                }
            }
        } else {
            if (z) {
                return avw.d(0, Math.max(H().c, d().c), 0, 0);
            }
            if ((this.c & 4) == 0) {
                return avw.d(0, d().c, 0, 0);
            }
        }
        return avw.a;
    }

    @Override // defpackage.bbk
    public avw c(int i) {
        return G(i, true);
    }

    @Override // defpackage.bbk
    public final avw d() {
        avw avwVar = this.o;
        if (avwVar != null) {
            return avwVar;
        }
        WindowInsets windowInsets = this.a;
        avw avwVarD = avw.d(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        this.o = avwVarD;
        return avwVarD;
    }

    @Override // defpackage.bbk
    public bbn e(int i, int i2, int i3, int i4) {
        bbb bavVar;
        bbn bbnVarO = bbn.o(this.a, null);
        if (Build.VERSION.SDK_INT >= 36) {
            bavVar = new bba(bbnVarO);
        } else if (Build.VERSION.SDK_INT >= 35) {
            bavVar = new baz(bbnVarO);
        } else if (Build.VERSION.SDK_INT >= 34) {
            bavVar = new bay(bbnVarO);
        } else if (Build.VERSION.SDK_INT >= 31) {
            bavVar = new bax(bbnVarO);
        } else if (Build.VERSION.SDK_INT >= 30) {
            bavVar = new baw(bbnVarO);
        } else {
            bavVar = Build.VERSION.SDK_INT >= 29 ? new bav(bbnVarO) : new bau(bbnVarO);
        }
        bavVar.c(bbn.i(d(), i, i2, i3, i4));
        bavVar.b(bbn.i(w(), i, i2, i3, i4));
        return bavVar.a();
    }

    @Override // defpackage.bbk
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        bbc bbcVar = (bbc) obj;
        return Objects.equals(this.b, bbcVar.b) && v(this.c, bbcVar.c);
    }

    @Override // defpackage.bbk
    public List f(int i) {
        return K(this.q, i);
    }

    @Override // defpackage.bbk
    public List g(int i) {
        return K(this.r, i);
    }

    @Override // defpackage.bbk
    public void h(View view) {
        this.f = view.getWidth();
        this.e = view.getHeight();
        avw avwVarI = I(view);
        if (avwVarI == null) {
            avwVarI = avw.a;
        }
        n(avwVarI);
    }

    @Override // defpackage.bbk
    public void i(bbn bbnVar) {
        bbnVar.s(this.p);
        bbnVar.b.n(this.b);
        bbnVar.t(this.c);
        bbnVar.q(this.d);
        bbnVar.u(this.q);
        bbnVar.v(this.r);
    }

    @Override // defpackage.bbk
    public void j(View view) {
        this.d = J(view);
    }

    @Override // defpackage.bbk
    public void k() {
        for (int i = 1; i <= 512; i <<= 1) {
            int iD = azu.d(i);
            this.q[iD] = M(a(i));
            if (i != 8) {
                this.r[iD] = M(c(i));
            }
        }
    }

    @Override // defpackage.bbk
    public void l(ayk aykVar) {
        this.d = aykVar;
    }

    @Override // defpackage.bbk
    public void m(avw[] avwVarArr) {
        this.n = avwVarArr;
    }

    @Override // defpackage.bbk
    public void n(avw avwVar) {
        this.b = avwVar;
    }

    @Override // defpackage.bbk
    public void o(bbn bbnVar) {
        this.p = bbnVar;
    }

    @Override // defpackage.bbk
    public void p(int i) {
        this.c = i;
    }

    @Override // defpackage.bbk
    public void q(Rect[][] rectArr) {
        rectArr.getClass();
        this.q = (Rect[][]) rectArr.clone();
    }

    @Override // defpackage.bbk
    public void r(Rect[][] rectArr) {
        rectArr.getClass();
        this.r = (Rect[][]) rectArr.clone();
    }

    @Override // defpackage.bbk
    public boolean s() {
        return this.a.isRound();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0012  */
    /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
    protected boolean t(int i) {
        if (i == 1 || i == 2) {
            if (b(i, false).equals(avw.a)) {
                return false;
            }
        } else {
            if (i == 4) {
                return false;
            }
            if (i == 8 || i == 128) {
                if (b(i, false).equals(avw.a)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // defpackage.bbk
    public boolean u(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i2 & 8) != 0 && !t(i2)) {
                return false;
            }
        }
        return true;
    }

    public bbc(bbn bbnVar, bbc bbcVar) {
        this(bbnVar, new WindowInsets(bbcVar.a));
    }
}
