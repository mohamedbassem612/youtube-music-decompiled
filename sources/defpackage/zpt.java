package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.widget.NestedScrollView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zpt {
    public final NestedScrollView a;
    final ViewGroup b;
    public int c;
    public boolean d;
    private boolean e;
    private boolean f;

    public zpt(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && !(parent instanceof NestedScrollView)) {
            parent = parent.getParent();
        }
        NestedScrollView nestedScrollView = (NestedScrollView) parent;
        this.a = nestedScrollView;
        if (nestedScrollView != null) {
            this.e = g(view, nestedScrollView);
            this.b = null;
            return;
        }
        ViewParent parent2 = view.getParent();
        while (parent2 != null && (!(parent2 instanceof View) || ((View) parent2).getId() != R.id.mde_container)) {
            parent2 = parent2.getParent();
        }
        ViewGroup viewGroup = (ViewGroup) parent2;
        this.b = viewGroup;
        if (viewGroup != null) {
            this.f = g(view, viewGroup);
        }
    }

    public static int a(View view) {
        if (view == null) {
            return 0;
        }
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return rect.top;
    }

    private final void f(View view) {
        if (view != null) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.c, 0);
            valueAnimatorOfInt.addUpdateListener(new vmg(this, view, 2));
            valueAnimatorOfInt.addListener(new zps(this, view));
            valueAnimatorOfInt.start();
        }
    }

    private static final boolean g(View view, View view2) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return rect.bottom > view2.getHeight() / 2;
    }

    public final void b(int i, int i2) {
        NestedScrollView nestedScrollView = this.a;
        if (nestedScrollView != null) {
            int i3 = i - i2;
            this.c += i3;
            if (!this.d) {
                nestedScrollView.scrollBy(0, i3);
            } else if (nestedScrollView.getChildAt(0) != null) {
                nestedScrollView.getChildAt(0).scrollBy(0, i3);
            }
        }
    }

    public final void c() {
        NestedScrollView nestedScrollView = this.a;
        if (nestedScrollView != null) {
            if (!this.d || this.c == 0) {
                nestedScrollView.scrollBy(0, -this.c);
                this.c = 0;
                return;
            } else {
                if (nestedScrollView.getChildAt(0) != null) {
                    f(nestedScrollView.getChildAt(0));
                    return;
                }
                return;
            }
        }
        ViewGroup viewGroup = this.b;
        if (viewGroup != null) {
            if (this.d && this.c != 0) {
                f(viewGroup);
            } else {
                viewGroup.scrollBy(0, -this.c);
                this.c = 0;
            }
        }
    }

    public final void d(int i, int i2) {
        ViewGroup viewGroup = this.b;
        if (viewGroup != null) {
            int i3 = i - i2;
            this.c += i3;
            viewGroup.scrollBy(0, i3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0030 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0032 A[ORIG_RETURN, RETURN] */
    public final int e() {
        boolean z;
        NestedScrollView nestedScrollView = this.a;
        if (nestedScrollView == null) {
            ViewGroup viewGroup = this.b;
            if (viewGroup == null) {
                return 1;
            }
            if (viewGroup != null) {
                if (this.d) {
                    z = this.f;
                    if (z) {
                    }
                }
                return 3;
            }
            return 2;
        }
        if (this.d) {
            z = this.e;
            if (z) {
                return 3;
            }
            return 2;
        }
        if (nestedScrollView.getChildCount() != 1 || nestedScrollView.getChildAt(0).getHeight() <= nestedScrollView.getHeight()) {
            return 2;
        }
        return 3;
    }
}
