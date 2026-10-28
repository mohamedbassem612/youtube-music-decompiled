package defpackage;

import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ov {
    public final ArrayList a = new ArrayList();
    public int b = Integer.MIN_VALUE;
    public int c = Integer.MIN_VALUE;
    public int d = 0;
    public final int e;
    public final /* synthetic */ StaggeredGridLayoutManager f;

    public ov(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f = staggeredGridLayoutManager;
        this.e = i;
    }

    public static final os n(View view) {
        return (os) view.getLayoutParams();
    }

    public final int a() {
        boolean z = this.f.d;
        ArrayList arrayList = this.a;
        return z ? m(arrayList.size() - 1, -1) : m(0, arrayList.size());
    }

    public final int b() {
        boolean z = this.f.d;
        ArrayList arrayList = this.a;
        return z ? m(0, arrayList.size()) : m(arrayList.size() - 1, -1);
    }

    public final int c() {
        int i = this.c;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        h();
        return this.c;
    }

    public final int d(int i) {
        int i2 = this.c;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.a.size() == 0) {
            return i;
        }
        h();
        return this.c;
    }

    public final int e() {
        int i = this.b;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        i();
        return this.b;
    }

    public final int f(int i) {
        int i2 = this.b;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.a.size() == 0) {
            return i;
        }
        i();
        return this.b;
    }

    public final View g(int i, int i2) {
        ArrayList arrayList = this.a;
        View view = null;
        if (i2 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                StaggeredGridLayoutManager staggeredGridLayoutManager = this.f;
                if ((staggeredGridLayoutManager.d && staggeredGridLayoutManager.getPosition(view2) >= i) || ((!staggeredGridLayoutManager.d && staggeredGridLayoutManager.getPosition(view2) <= i) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
        } else {
            int size2 = arrayList.size();
            int i3 = 0;
            while (i3 < size2) {
                View view3 = (View) arrayList.get(i3);
                StaggeredGridLayoutManager staggeredGridLayoutManager2 = this.f;
                if ((staggeredGridLayoutManager2.d && staggeredGridLayoutManager2.getPosition(view3) <= i) || ((!staggeredGridLayoutManager2.d && staggeredGridLayoutManager2.getPosition(view3) >= i) || !view3.hasFocusable())) {
                    break;
                }
                i3++;
                view = view3;
            }
        }
        return view;
    }

    final void h() {
        ArrayList arrayList = this.a;
        View view = (View) arrayList.get(arrayList.size() - 1);
        os osVarN = n(view);
        this.c = this.f.b.a(view);
        boolean z = osVarN.b;
    }

    final void i() {
        View view = (View) this.a.get(0);
        os osVarN = n(view);
        this.b = this.f.b.d(view);
        boolean z = osVarN.b;
    }

    public final void j() {
        this.a.clear();
        this.b = Integer.MIN_VALUE;
        this.c = Integer.MIN_VALUE;
        this.d = 0;
    }

    public final void k(int i) {
        int i2 = this.b;
        if (i2 != Integer.MIN_VALUE) {
            this.b = i2 + i;
        }
        int i3 = this.c;
        if (i3 != Integer.MIN_VALUE) {
            this.c = i3 + i;
        }
    }

    public final void l(int i) {
        this.b = i;
        this.c = i;
    }

    final int m(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f;
        int iJ = staggeredGridLayoutManager.b.j();
        int iF = staggeredGridLayoutManager.b.f();
        int i3 = i;
        while (true) {
            int i4 = -1;
            if (i3 == i2) {
                return -1;
            }
            View view = (View) this.a.get(i3);
            int iD = staggeredGridLayoutManager.b.d(view);
            int iA = staggeredGridLayoutManager.b.a(view);
            boolean z = iD <= iF;
            boolean z2 = iA >= iJ;
            if (z && z2 && (iD < iJ || iA > iF)) {
                return staggeredGridLayoutManager.getPosition(view);
            }
            if (i2 > i) {
                i4 = 1;
            }
            i3 += i4;
        }
    }
}
