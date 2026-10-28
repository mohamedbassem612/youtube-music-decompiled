package defpackage;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class tth {
    public final awkv a = new awku(new tuy(new ttq(new Rect(), new ttj(new Rect(), agke.n(agpi.a)), new Rect(), new Rect(), false))).aI();
    public final avlh b;
    public final Rect c;
    public final Rect d;
    public final Rect e;
    public boolean f;
    public final Set g;
    protected final Window h;
    public final tto i;
    public boolean j;
    public ttg k;
    public hwf l;
    final hwf m;
    private final awkv n;
    private final ayx o;
    private ttg p;
    private View q;

    public tth(Window window) {
        new awku(Boolean.FALSE).aI();
        this.o = new ttf(this, 0);
        this.c = new Rect();
        this.d = new Rect();
        this.e = new Rect();
        hwf hwfVar = new hwf(this);
        this.m = hwfVar;
        this.p = ttg.DEFAULT;
        window.getClass();
        this.h = window;
        this.i = new tto(window, hwfVar);
        this.g = Collections.newSetFromMap(new WeakHashMap());
        awkv awkvVarAI = new awku().aI();
        this.n = awkvVarAI;
        this.b = awkvVarAI.H(new tfk(3)).ax().c();
        f(this.p);
    }

    public static Rect a(View view) {
        if (Build.VERSION.SDK_INT < 29) {
            return new Rect();
        }
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        rootWindowInsets.getClass();
        return c(rootWindowInsets.getMandatorySystemGestureInsets());
    }

    public static Rect b(View view) {
        if (Build.VERSION.SDK_INT < 29) {
            return new Rect();
        }
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        rootWindowInsets.getClass();
        return c(rootWindowInsets.getStableInsets());
    }

    public static Rect c(Insets insets) {
        return new Rect(insets.left, insets.top, insets.right, insets.bottom);
    }

    public static boolean k(ttg ttgVar) {
        return ttgVar.i == 2;
    }

    public final void d() {
        Rect rect = this.c;
        Rect rect2 = new Rect(rect);
        hwf hwfVar = this.l;
        if (hwfVar != null) {
            Rect rect3 = new Rect(rect);
            Object obj = hwfVar.a;
            ttr ttrVar = (ttr) obj;
            if (ttrVar.i.e) {
                ttrVar.h.hasFeature(9);
            }
            Rect rect4 = new Rect();
            if (((tth) obj).j()) {
                rect4.set(rect3);
            }
            rect2.set(rect4);
        }
        awkv awkvVar = this.a;
        View view = this.q;
        awkvVar.kk(new tuy(new ttq(rect2, view == null ? new ttj(new Rect(), agke.n(agpi.a)) : tuk.f(view), this.d, this.e, this.f)));
    }

    public final void e() {
        f(this.p);
    }

    public final void f(ttg ttgVar) {
        this.k = ttgVar;
        this.n.kk(ttgVar);
        tto ttoVar = this.i;
        int i = ttgVar.i;
        if (ttoVar.c != i) {
            ttoVar.c = i;
            ttoVar.a();
        }
        boolean z = ttgVar.j;
        if (ttoVar.d != z) {
            ttoVar.d = z;
            ttoVar.a();
        }
        ttoVar.b(ttgVar.k);
        h();
    }

    public final void g(int i) {
        if (this.k == ttg.IMMERSIVE || this.k == ttg.VR) {
            return;
        }
        this.i.b(i);
    }

    public final void h() {
        boolean z = false;
        if (j() && this.j) {
            z = true;
        }
        tto ttoVar = this.i;
        if (ttoVar.f != z) {
            ttoVar.f = z;
            ttoVar.a();
        }
    }

    public final boolean i() {
        return k(this.k);
    }

    public final boolean j() {
        ttg ttgVar = this.k;
        return ttgVar.i == 2 && !ttgVar.j;
    }

    public final void l(View view) {
        View view2 = this.q;
        if (view2 != view) {
            if (view2 != null) {
                int i = bac.a;
                azs.c(view2, null);
            }
            view.getClass();
            this.q = view;
            tto ttoVar = this.i;
            View view3 = ttoVar.a;
            if (view3 != view) {
                if (view3 != null) {
                    view3.setOnSystemUiVisibilityChangeListener(null);
                }
                view.getClass();
                ttoVar.a = view;
                ttoVar.a.setOnSystemUiVisibilityChangeListener(ttoVar);
                ttoVar.b = ttoVar.a.getSystemUiVisibility();
            }
            View view4 = this.q;
            if (view4 != null) {
                ayx ayxVar = this.o;
                int i2 = bac.a;
                azs.c(view4, ayxVar);
            }
            ttg ttgVar = ttg.DEFAULT;
            this.p = ttgVar;
            f(ttgVar);
        }
    }
}
