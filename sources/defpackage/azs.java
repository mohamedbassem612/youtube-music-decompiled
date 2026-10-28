package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.MenuItem;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import com.google.android.apps.youtube.music.R;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class azs {
    private static Executor a;

    public static void C(dhg dhgVar, List list) {
        if (dhgVar == null) {
            throw new IllegalArgumentException("route must not be null");
        }
        if (list.contains(dhgVar)) {
            throw new IllegalArgumentException("route descriptor already added");
        }
        list.add(dhgVar);
    }

    public static void D(Collection collection, List list) {
        list.clear();
        if (collection != null) {
            list.addAll(collection);
        }
    }

    public static synchronized Executor F() {
        if (a == null) {
            int i = bwp.a;
            a = Executors.newSingleThreadExecutor(new kyn("ExoPlayer:BackgroundExecutor", 1));
        }
        return a;
    }

    @Deprecated
    public static void G(int i) {
        if (i < 0 || i > 0) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static bbn aa(View view, bbn bbnVar, Rect rect) {
        WindowInsets windowInsetsE = bbnVar.e();
        if (windowInsetsE != null) {
            return bbn.o(view.computeSystemWindowInsets(windowInsetsE, rect), view);
        }
        rect.setEmpty();
        return bbnVar;
    }

    static void b(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static void c(View view, ayx ayxVar) {
        azr azrVar = ayxVar != null ? new azr(view, ayxVar) : null;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, azrVar);
        }
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null) {
            if (azrVar != null) {
                view.setOnApplyWindowInsetsListener(azrVar);
            } else {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
            }
        }
    }

    public static void d(MenuItem menuItem, axy axyVar) {
        if (menuItem instanceof awj) {
            ((awj) menuItem).d(axyVar);
        } else {
            Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        }
    }

    public static aza e(Display display, int i) {
        RoundedCorner roundedCorner;
        int i2;
        aza azaVar = null;
        if (Build.VERSION.SDK_INT >= 31 && (roundedCorner = display.getRoundedCorner(i)) != null) {
            int position = roundedCorner.getPosition();
            if (position != 0) {
                i2 = 1;
                if (position != 1) {
                    i2 = 2;
                    if (position != 2) {
                        i2 = 3;
                        if (position != 3) {
                            throw new IllegalArgumentException(a.bR(position, "Invalid position: "));
                        }
                    }
                }
            } else {
                i2 = 0;
            }
            int radius = roundedCorner.getRadius();
            Point center = roundedCorner.getCenter();
            azaVar = new aza(i2, radius, center.x, center.y);
        }
        return azaVar;
    }

    public static void f(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void g(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void h(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    public static void i(int i, int i2, int i3, String str) {
        if (i < i2) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, 1, Integer.valueOf(i3)));
        }
        if (i > i3) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Integer.valueOf(i2), Integer.valueOf(i3)));
        }
    }

    public static void j(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void k(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void l(Object obj) {
        obj.getClass();
    }

    public static void m(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException((String) obj2);
        }
    }

    public void A(dii diiVar, int i) {
        r();
    }

    public void B(dii diiVar, int i) {
        s();
    }

    public final void E(dij dijVar, dii diiVar, dii diiVar2, ytt yttVar) {
        n(dijVar, diiVar, yttVar.a, diiVar2);
    }

    public void n(dij dijVar, dii diiVar, int i, dii diiVar2) {
        A(diiVar, i);
    }

    public void o() {
    }

    @Deprecated
    public void r() {
    }

    @Deprecated
    public void s() {
    }

    public void v() {
    }

    public void w() {
    }

    public void t(dii diiVar) {
    }

    public void u(dim dimVar) {
    }

    public void x(dii diiVar) {
    }

    public void y(dii diiVar) {
    }

    public void z(dii diiVar) {
    }

    public void p(dii diiVar, dii diiVar2) {
    }

    public void q(dii diiVar, dii diiVar2, int i) {
    }
}
