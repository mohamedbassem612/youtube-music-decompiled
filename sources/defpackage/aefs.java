package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.widget.PopupWindow;
import com.google.android.libraries.elements.interfaces.ByteStore;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aefs {
    final aefr a;
    public final Rect b;
    final View c;
    private final View d;
    private final int e;
    private final int f;
    private final int g;
    private final boolean h;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    public aefs(View view, View view2, int i, int i2, int i3, int i4, Optional optional, Optional optional2, Optional optional3) {
        view.getClass();
        view2.getClass();
        this.d = view2;
        this.e = i;
        this.f = i2;
        this.g = i3;
        boolean zIsPresent = optional.isPresent();
        this.h = zIsPresent;
        boolean z = false;
        if (optional2.isPresent() && optional3.isPresent() && !((String) optional3.get()).isEmpty()) {
            z = true;
        }
        aefr aefrVar = new aefr(view.getContext(), i4, zIsPresent, z);
        this.a = aefrVar;
        aefrVar.h = twm.c(aefrVar.g.getResources().getDisplayMetrics(), 12);
        if (z) {
            Object obj = optional2.get();
            Object obj2 = optional3.get();
            aefrVar.u = (ByteStore) obj;
            aefrVar.v = (String) obj2;
        }
        View view3 = (View) (zIsPresent ? optional.get() : view);
        this.c = view3;
        aefrVar.n = view3;
        if (aefrVar.s) {
            view3.setVisibility(8);
        }
        aefrVar.i = new PopupWindow(aefrVar);
        aefrVar.addView(view3);
        Rect rect = new Rect();
        this.b = rect;
        rect.right = aefrVar.getResources().getDisplayMetrics().widthPixels;
        rect.bottom = aefrVar.getResources().getDisplayMetrics().heightPixels;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001b, code lost:
    
        if (r4 != 1) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0012, code lost:
    
        if (r4 == 1) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(int r3, android.view.View r4) {
        /*
            int r0 = defpackage.bac.a
            int r4 = r4.getLayoutDirection()
            r0 = 1
            if (r3 == r0) goto L20
            r1 = 2
            if (r3 == r1) goto L1f
            r1 = 4
            r2 = 3
            if (r3 == r2) goto L1b
            if (r3 != r1) goto L15
            if (r4 != r0) goto L1f
            goto L1d
        L15:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>()
            throw r3
        L1b:
            if (r4 == r0) goto L1f
        L1d:
            r0 = r2
            goto L20
        L1f:
            r0 = r1
        L20:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aefs.a(int, android.view.View):int");
    }

    private static int i(View view) {
        int width = view.getWidth();
        if (width != 0) {
            return width;
        }
        view.measure(0, 0);
        return view.getMeasuredWidth();
    }

    public final void b(int i) {
        this.a.b(i);
    }

    public final void c(Rect rect, int i, int i2) {
        this.a.c(this.d, rect, i, i2, this.g);
    }

    public final void d(boolean z) {
        this.a.k = z;
    }

    public final void e(aefq aefqVar) {
        this.a.j = aefqVar;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004a  */
    public final void f(Rect rect) {
        int i;
        int i2;
        int i3 = this.e;
        int i4 = this.f;
        c(rect, i3, i4);
        if (this.h) {
            this.a.f();
            return;
        }
        if (!a.az(i3)) {
            View view = this.d;
            if (a.az(i3)) {
                i = i3;
            } else {
                int iA = a(i3, view);
                aefr aefrVar = this.a;
                Rect rect2 = this.b;
                int i5 = i(aefrVar);
                int iWidth = rect2.width();
                if (iA != 3 ? i5 < (iWidth - rect.width()) - rect.left : i5 < rect.left - rect2.left) {
                    i = i3;
                } else if (i3 == 3) {
                    i2 = 4;
                    i = i2;
                } else {
                    i = 3;
                }
            }
        } else if (g(i3, rect)) {
            i = i3;
        } else {
            i2 = 1;
            if (i3 == 1) {
                i2 = 2;
            }
            i = i2;
        }
        if (i != i3) {
            aefr aefrVar2 = this.a;
            aefrVar2.c(this.d, rect, i, i4, this.g);
            i(aefrVar2);
        }
        this.a.f();
    }

    public final boolean g(int i, Rect rect) {
        if (!a.az(i)) {
            return true;
        }
        aefr aefrVar = this.a;
        int height = aefrVar.getHeight();
        if (height == 0) {
            aefrVar.measure(0, 0);
            height = aefrVar.getMeasuredHeight();
        }
        Rect rect2 = this.b;
        int iHeight = rect2.height();
        if (i == 1) {
            if (height < rect.top - rect2.top) {
                return true;
            }
        } else if (height < (iHeight - rect.height()) - rect.top) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        return this.a.isShown();
    }

    public aefs(View view, View view2, int i, int i2, int i3, int i4) {
        this(view, view2, i, i2, i3, i4, Optional.empty(), Optional.empty(), Optional.empty());
    }
}
