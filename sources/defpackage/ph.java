package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ph {
    public final Toolbar a;
    public int b;
    CharSequence c;
    public Window.Callback d;
    boolean e;
    public jx f;
    private View g;
    private Drawable h;
    private Drawable i;
    private Drawable j;
    private boolean k;
    private CharSequence l;
    private CharSequence m;
    private int n;
    private Drawable o;

    public ph(Toolbar toolbar, boolean z) {
        Drawable drawable;
        this.n = 0;
        this.a = toolbar;
        this.c = toolbar.r;
        this.l = toolbar.s;
        this.k = this.c != null;
        this.j = toolbar.e();
        Context context = toolbar.getContext();
        ahto ahtoVar = new ahto(context, context.obtainStyledAttributes(null, he.a, R.attr.actionBarStyle, 0));
        int i = 15;
        this.o = ahtoVar.B(15);
        if (z) {
            CharSequence charSequenceD = ahtoVar.D(27);
            if (!TextUtils.isEmpty(charSequenceD)) {
                k(charSequenceD);
            }
            CharSequence charSequenceD2 = ahtoVar.D(25);
            if (!TextUtils.isEmpty(charSequenceD2)) {
                this.l = charSequenceD2;
                if ((this.b & 8) != 0) {
                    toolbar.u(charSequenceD2);
                }
            }
            Drawable drawableB = ahtoVar.B(20);
            if (drawableB != null) {
                g(drawableB);
            }
            Drawable drawableB2 = ahtoVar.B(17);
            if (drawableB2 != null) {
                f(drawableB2);
            }
            if (this.j == null && (drawable = this.o) != null) {
                j(drawable);
            }
            d(ahtoVar.w(10, 0));
            int iZ = ahtoVar.z(9, 0);
            if (iZ != 0) {
                View viewInflate = LayoutInflater.from(toolbar.getContext()).inflate(iZ, (ViewGroup) toolbar, false);
                View view = this.g;
                if (view != null && (this.b & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.g = viewInflate;
                if (viewInflate != null && (this.b & 16) != 0) {
                    toolbar.addView(viewInflate);
                }
                d(this.b | 16);
            }
            int iY = ahtoVar.y(13, 0);
            if (iY > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = iY;
                toolbar.setLayoutParams(layoutParams);
            }
            int iU = ahtoVar.u(7, -1);
            int iU2 = ahtoVar.u(3, -1);
            if (iU >= 0 || iU2 >= 0) {
                toolbar.m(Math.max(iU, 0), Math.max(iU2, 0));
            }
            int iZ2 = ahtoVar.z(28, 0);
            if (iZ2 != 0) {
                Context context2 = toolbar.getContext();
                toolbar.k = iZ2;
                TextView textView = toolbar.b;
                if (textView != null) {
                    textView.setTextAppearance(context2, iZ2);
                }
            }
            int iZ3 = ahtoVar.z(26, 0);
            if (iZ3 != 0) {
                Context context3 = toolbar.getContext();
                toolbar.l = iZ3;
                TextView textView2 = toolbar.c;
                if (textView2 != null) {
                    textView2.setTextAppearance(context3, iZ3);
                }
            }
            int iZ4 = ahtoVar.z(22, 0);
            if (iZ4 != 0) {
                toolbar.t(iZ4);
            }
        } else {
            if (toolbar.e() != null) {
                this.o = toolbar.e();
            } else {
                i = 11;
            }
            this.b = i;
        }
        ahtoVar.F();
        if (this.n != R.string.abc_action_bar_up_description) {
            this.n = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.h())) {
                i(this.n);
            }
        }
        this.m = toolbar.h();
        toolbar.s(new pf(this));
    }

    private final void s(CharSequence charSequence) {
        this.c = charSequence;
        if ((this.b & 8) != 0) {
            Toolbar toolbar = this.a;
            toolbar.v(charSequence);
            if (this.k) {
                bac.r(toolbar.getRootView(), charSequence);
            }
        }
    }

    private final void t() {
        if ((this.b & 4) != 0) {
            boolean zIsEmpty = TextUtils.isEmpty(this.m);
            Toolbar toolbar = this.a;
            if (zIsEmpty) {
                toolbar.o(this.n);
            } else {
                toolbar.p(this.m);
            }
        }
    }

    private final void u() {
        int i = this.b & 4;
        Toolbar toolbar = this.a;
        if (i == 0) {
            toolbar.r(null);
            return;
        }
        Drawable drawable = this.j;
        if (drawable == null) {
            drawable = this.o;
        }
        toolbar.r(drawable);
    }

    private final void v() {
        Drawable drawable;
        int i = this.b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.i) == null) {
            drawable = this.h;
        }
        this.a.n(drawable);
    }

    public final Context a() {
        return this.a.getContext();
    }

    public final void b() {
        this.a.j();
    }

    public final void c() {
        ActionMenuView actionMenuView = this.a.a;
        if (actionMenuView != null) {
            actionMenuView.h();
        }
    }

    public final void d(int i) {
        View view;
        int i2 = this.b ^ i;
        this.b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    t();
                }
                u();
            }
            if ((i2 & 3) != 0) {
                v();
            }
            if ((i2 & 8) != 0) {
                int i3 = i & 8;
                Toolbar toolbar = this.a;
                if (i3 != 0) {
                    toolbar.v(this.c);
                    toolbar.u(this.l);
                } else {
                    toolbar.v(null);
                    toolbar.u(null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.g) == null) {
                return;
            }
            int i4 = i & 16;
            Toolbar toolbar2 = this.a;
            if (i4 != 0) {
                toolbar2.addView(view);
            } else {
                toolbar2.removeView(view);
            }
        }
    }

    public final void e(int i) {
        Drawable drawableC;
        if (i != 0) {
            drawableC = ok.e().c(a(), i);
        } else {
            drawableC = null;
        }
        f(drawableC);
    }

    public final void f(Drawable drawable) {
        this.h = drawable;
        v();
    }

    public final void g(Drawable drawable) {
        this.i = drawable;
        v();
    }

    public final void h() {
        this.e = true;
    }

    public final void i(int i) {
        this.m = i == 0 ? null : a().getString(i);
        t();
    }

    public final void j(Drawable drawable) {
        this.j = drawable;
        u();
    }

    public final void k(CharSequence charSequence) {
        this.k = true;
        s(charSequence);
    }

    public final void l(int i) {
        this.a.setVisibility(i);
    }

    public final void m(CharSequence charSequence) {
        if (this.k) {
            return;
        }
        s(charSequence);
    }

    public final boolean n() {
        return this.a.x();
    }

    public final boolean o() {
        jx jxVar;
        ActionMenuView actionMenuView = this.a.a;
        return (actionMenuView == null || (jxVar = actionMenuView.c) == null || !jxVar.k()) ? false : true;
    }

    public final boolean p() {
        return this.a.y();
    }

    public final boolean q() {
        return this.a.z();
    }

    public final ci r(int i, long j) {
        ci ciVarX = bac.x(this.a);
        ciVarX.q(i == 0 ? 1.0f : 0.0f);
        ciVarX.r(j);
        ciVarX.t(new pg(this, i));
        return ciVarX;
    }
}
