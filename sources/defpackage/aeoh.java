package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.slimstatusbar.SlimStatusBar;
import j$.util.Objects;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aeoh {
    public Runnable A;
    public Runnable B;
    public Runnable C;
    public Runnable D;
    public Runnable E;
    public Runnable F;
    public Runnable G;
    public Runnable H;
    public LayoutTransition I;
    public LayoutTransition J;
    public boolean K;
    public boolean L;
    public String M;
    public final vxz N;
    public abgn O;
    public final heg P;
    public adul Q;
    private final xgm R;
    private final avmb S;
    private final long T;
    private int U;
    private Animator V;
    private Runnable W;
    private avmn X;
    private final spa Y;
    public final Context a;
    public final adxj b;
    public final aeda c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public ViewGroup h;
    public ViewGroup i;
    public SlimStatusBar j;
    public SlimStatusBar k;
    public int l;
    public AnimatorSet m;
    public final awku n;
    public final awku o;
    public Runnable p;
    public Runnable q;
    public Runnable r;
    public Runnable s;
    public Runnable t;
    public Runnable u;
    public Runnable v;
    public Runnable w;
    public Runnable x;
    public Runnable y;
    public Runnable z;

    public aeoh(Context context, adxj adxjVar, aeda aedaVar, spa spaVar, xgm xgmVar, heg hegVar, vxz vxzVar, avmb avmbVar, Optional optional) {
        this.n = new awku();
        this.o = new awku();
        this.a = context;
        this.b = adxjVar;
        this.c = aedaVar;
        this.Y = spaVar;
        this.R = xgmVar;
        this.P = hegVar;
        this.N = vxzVar;
        this.S = avmbVar;
        Resources resources = context.getResources();
        this.d = resources.getColor(R.color.slim_status_bar_active_background_color);
        this.e = ((Integer) optional.orElse(Integer.valueOf(resources.getColor(R.color.slim_status_bar_inactive_background_color)))).intValue();
        this.f = resources.getColor(R.color.slim_status_bar_shimmer_background_color);
        this.T = resources.getInteger(android.R.integer.config_longAnimTime);
        this.g = resources.getDimensionPixelSize(R.dimen.slim_status_bar_padding);
        this.Q = new adul();
        this.O = new abgn(this);
    }

    public static boolean s(ViewGroup viewGroup, SlimStatusBar slimStatusBar) {
        return viewGroup.indexOfChild(slimStatusBar) >= 0;
    }

    private static Animator u(SlimStatusBar slimStatusBar) {
        return ObjectAnimator.ofPropertyValuesHolder(slimStatusBar, PropertyValuesHolder.ofInt("top", slimStatusBar.getTop(), slimStatusBar.getBottom()));
    }

    private static void v(SlimStatusBar slimStatusBar) {
        TextView textView = slimStatusBar.a;
        if (textView != null) {
            textView.setCompoundDrawables(null, null, null, null);
        }
    }

    private final void w(boolean z, boolean z2, boolean z3, boolean z4) {
        Runnable runnable;
        Runnable runnable2;
        if (z) {
            f();
        } else {
            e();
        }
        d();
        ViewGroup viewGroupB = b(z);
        SlimStatusBar slimStatusBarC = c(z);
        o(3);
        slimStatusBarC.a(R.string.offline_bottom_status_bar_connection_regained);
        v(slimStatusBarC);
        if (z) {
            n(this.d, slimStatusBarC);
        } else {
            this.Q.getClass();
            Animator animatorN = adul.n(slimStatusBarC, this.e, this.d, 250L);
            this.V = animatorN;
            if (animatorN instanceof ValueAnimator) {
                ((ValueAnimator) animatorN).addUpdateListener(new adey(this, 8));
            }
            Animator animator = this.V;
            if (animator != null) {
                animator.addListener(new aeok(this, slimStatusBarC, 0));
                this.V.start();
            }
        }
        if (z) {
            runnable = this.t;
            runnable.getClass();
        } else {
            runnable = this.p;
            runnable.getClass();
        }
        viewGroupB.post(runnable);
        if (z2 && !z) {
            Runnable runnable3 = this.z;
            runnable3.getClass();
            viewGroupB.postDelayed(runnable3, 2000L);
        } else if (z3 && !z) {
            Runnable runnable4 = this.W;
            runnable4.getClass();
            viewGroupB.postDelayed(runnable4, 2000L);
        } else if (!z4 || z) {
            if (z) {
                runnable2 = this.v;
                runnable2.getClass();
            } else {
                runnable2 = this.r;
                runnable2.getClass();
            }
            viewGroupB.postDelayed(runnable2, 2000L);
        } else {
            Runnable runnable5 = this.H;
            runnable5.getClass();
            viewGroupB.postDelayed(runnable5, 2000L);
        }
        this.Y.g(false);
    }

    public final LayoutTransition a(boolean z) {
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setStartDelay(1, 0L);
        layoutTransition.setDuration(this.T);
        if (z) {
            layoutTransition.addTransitionListener(new aeoj());
        }
        return layoutTransition;
    }

    public final ViewGroup b(boolean z) {
        if (z) {
            ViewGroup viewGroup = this.i;
            viewGroup.getClass();
            return viewGroup;
        }
        ViewGroup viewGroup2 = this.h;
        viewGroup2.getClass();
        return viewGroup2;
    }

    public final SlimStatusBar c(boolean z) {
        if (z) {
            SlimStatusBar slimStatusBar = this.k;
            slimStatusBar.getClass();
            return slimStatusBar;
        }
        SlimStatusBar slimStatusBar2 = this.j;
        slimStatusBar2.getClass();
        return slimStatusBar2;
    }

    public final void d() {
        Animator animator = this.V;
        if (animator != null) {
            animator.cancel();
            this.V = null;
        }
        AnimatorSet animatorSet = this.m;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.m = null;
        }
    }

    public final void e() {
        ViewGroup viewGroup = this.h;
        viewGroup.getClass();
        Runnable runnable = this.q;
        runnable.getClass();
        viewGroup.removeCallbacks(runnable);
        ViewGroup viewGroup2 = this.h;
        Runnable runnable2 = this.p;
        runnable2.getClass();
        viewGroup2.removeCallbacks(runnable2);
        ViewGroup viewGroup3 = this.h;
        Runnable runnable3 = this.r;
        runnable3.getClass();
        viewGroup3.removeCallbacks(runnable3);
        ViewGroup viewGroup4 = this.h;
        Runnable runnable4 = this.s;
        runnable4.getClass();
        viewGroup4.removeCallbacks(runnable4);
        ViewGroup viewGroup5 = this.h;
        Runnable runnable5 = this.x;
        runnable5.getClass();
        viewGroup5.removeCallbacks(runnable5);
        ViewGroup viewGroup6 = this.h;
        Runnable runnable6 = this.z;
        runnable6.getClass();
        viewGroup6.removeCallbacks(runnable6);
        ViewGroup viewGroup7 = this.h;
        Runnable runnable7 = this.B;
        runnable7.getClass();
        viewGroup7.removeCallbacks(runnable7);
        ViewGroup viewGroup8 = this.h;
        Runnable runnable8 = this.C;
        runnable8.getClass();
        viewGroup8.removeCallbacks(runnable8);
        ViewGroup viewGroup9 = this.h;
        Runnable runnable9 = this.E;
        runnable9.getClass();
        viewGroup9.removeCallbacks(runnable9);
        avmn avmnVar = this.X;
        if (avmnVar != null) {
            avmnVar.dispose();
            this.X = null;
        }
        ViewGroup viewGroup10 = this.h;
        Runnable runnable10 = this.H;
        runnable10.getClass();
        viewGroup10.removeCallbacks(runnable10);
    }

    public final void f() {
        ViewGroup viewGroup = this.i;
        viewGroup.getClass();
        Runnable runnable = this.u;
        runnable.getClass();
        viewGroup.removeCallbacks(runnable);
        ViewGroup viewGroup2 = this.i;
        Runnable runnable2 = this.t;
        runnable2.getClass();
        viewGroup2.removeCallbacks(runnable2);
        ViewGroup viewGroup3 = this.i;
        Runnable runnable3 = this.v;
        runnable3.getClass();
        viewGroup3.removeCallbacks(runnable3);
        ViewGroup viewGroup4 = this.i;
        Runnable runnable4 = this.w;
        runnable4.getClass();
        viewGroup4.removeCallbacks(runnable4);
        ViewGroup viewGroup5 = this.i;
        Runnable runnable5 = this.A;
        runnable5.getClass();
        viewGroup5.removeCallbacks(runnable5);
        ViewGroup viewGroup6 = this.i;
        Runnable runnable6 = this.F;
        runnable6.getClass();
        viewGroup6.removeCallbacks(runnable6);
        avmn avmnVar = this.X;
        if (avmnVar != null) {
            avmnVar.dispose();
            this.X = null;
        }
    }

    public final void g(boolean z) {
        if (r()) {
            if (z) {
                f();
            } else {
                e();
            }
        }
    }

    public final void h(int i) {
        this.U++;
        xgn xgnVarHB = this.R.hB();
        xgnVarHB.l(new xgx(xgnVarHB.h(Integer.valueOf(this.U), xhb.b(i), this.U)));
    }

    public final void i(boolean z) {
        if (z) {
            f();
            d();
            o(0);
            return;
        }
        e();
        this.K = false;
        SlimStatusBar slimStatusBarC = c(false);
        slimStatusBarC.a(R.string.bottom_status_bar_your_channel_is_hidden);
        v(slimStatusBarC);
        n(this.e, slimStatusBarC);
        o(8);
        avmn avmnVar = this.X;
        if (avmnVar != null) {
            avmnVar.dispose();
        }
        avmb avmbVar = this.S;
        Runnable runnable = this.G;
        runnable.getClass();
        this.X = avmbVar.e(runnable);
    }

    public final void j(boolean z, long j) {
        Runnable runnable;
        o(1);
        ViewGroup viewGroupB = b(z);
        if (z) {
            runnable = this.w;
            runnable.getClass();
        } else {
            runnable = this.s;
            runnable.getClass();
        }
        viewGroupB.postDelayed(runnable, j);
    }

    public final void k(boolean z, boolean z2) {
        Runnable runnable;
        if (z2) {
            f();
        } else {
            e();
        }
        d();
        ViewGroup viewGroupB = b(z2);
        SlimStatusBar slimStatusBarC = c(z2);
        slimStatusBarC.a(R.string.offline_bottom_status_bar_connection_lost);
        v(slimStatusBarC);
        n(this.e, slimStatusBarC);
        if (z2) {
            runnable = this.u;
            runnable.getClass();
        } else {
            runnable = this.q;
            runnable.getClass();
        }
        viewGroupB.post(runnable);
        if (z2) {
            o(4);
            Runnable runnable2 = this.v;
            runnable2.getClass();
            viewGroupB.postDelayed(runnable2, 5000L);
        }
        if (z) {
            this.Y.g(true);
        }
    }

    public final void l(boolean z) {
        Runnable runnable;
        if (z) {
            f();
        } else {
            e();
        }
        ViewGroup viewGroupB = b(z);
        SlimStatusBar slimStatusBarC = c(z);
        slimStatusBarC.a(R.string.bottom_status_bar_incognito_mode);
        v(slimStatusBarC);
        n(this.e, slimStatusBarC);
        if (z) {
            runnable = this.y;
            runnable.getClass();
        } else {
            runnable = this.x;
            runnable.getClass();
        }
        viewGroupB.post(runnable);
        if (z) {
            o(4);
            Runnable runnable2 = this.v;
            runnable2.getClass();
            viewGroupB.postDelayed(runnable2, 5000L);
        }
    }

    public final void m(boolean z, String str) {
        if (z || str == null) {
            f();
            d();
            o(0);
            return;
        }
        e();
        d();
        ViewGroup viewGroupB = b(false);
        SlimStatusBar slimStatusBarC = c(false);
        slimStatusBarC.b(str);
        v(slimStatusBarC);
        n(this.e, slimStatusBarC);
        o(6);
        Runnable runnable = this.B;
        runnable.getClass();
        viewGroupB.post(runnable);
    }

    public final void n(int i, SlimStatusBar slimStatusBar) {
        slimStatusBar.setBackgroundColor(i);
        this.o.kk(Integer.valueOf(i));
    }

    public final void o(int i) {
        this.l = i;
        this.n.kk(Boolean.valueOf(q()));
    }

    public final void p(ViewGroup viewGroup, SlimStatusBar slimStatusBar) {
        if (Objects.equals(viewGroup, this.h) && !this.N.l(151, 45649805L, false)) {
            LayoutTransition layoutTransition = this.I;
            layoutTransition.getClass();
            layoutTransition.setAnimator(3, u(slimStatusBar));
        } else if (Objects.equals(viewGroup, this.i)) {
            LayoutTransition layoutTransition2 = this.J;
            layoutTransition2.getClass();
            layoutTransition2.setAnimator(3, u(slimStatusBar));
        }
    }

    public final boolean q() {
        int i = this.l;
        return (i == 0 || i == 1) ? false : true;
    }

    public final boolean r() {
        return (this.h == null || this.i == null || this.j == null || this.k == null) ? false : true;
    }

    public final void t(boolean z, boolean z2, boolean z3, String str, boolean z4) {
        Runnable runnable;
        Runnable runnable2;
        Runnable runnable3;
        if (r()) {
            boolean zIsEmpty = TextUtils.isEmpty(str);
            boolean z5 = !zIsEmpty;
            boolean z6 = true;
            this.L = z2 && !z3 && zIsEmpty;
            if (!this.N.l(151, 45649805L, false)) {
                ViewGroup viewGroup = this.h;
                viewGroup.getClass();
                LayoutTransition layoutTransition = this.I;
                layoutTransition.getClass();
                viewGroup.setLayoutTransition(layoutTransition);
            }
            ViewGroup viewGroup2 = this.i;
            viewGroup2.getClass();
            LayoutTransition layoutTransition2 = this.J;
            layoutTransition2.getClass();
            viewGroup2.setLayoutTransition(layoutTransition2);
            int i = 17;
            switch (this.l) {
                case 0:
                    g(z);
                    if (z2) {
                        if (!zIsEmpty) {
                            m(z, str);
                        } else if (z3) {
                            l(z);
                        } else if (z4) {
                            i(z);
                        } else if (z) {
                            this.W = new aead(this, str, i);
                            w(true, false, false, false);
                        }
                        this.Y.g(false);
                    } else if (!z) {
                        j(false, 3000L);
                    } else {
                        k(true, true);
                    }
                    break;
                case 1:
                    if (z2) {
                        g(z);
                        o(0);
                        if (z3) {
                            l(z);
                        } else if (z4) {
                            i(z);
                        } else if (!zIsEmpty) {
                            m(z, str);
                        }
                    }
                    break;
                case 2:
                    g(z);
                    if (!z2) {
                        k(true, z);
                    } else {
                        this.W = new aead(this, str, i);
                        w(z, z3, z5, z4);
                    }
                    break;
                case 3:
                case 4:
                    if (!z2) {
                        g(z);
                        k(true, z);
                    } else if (z3) {
                        l(z);
                    } else if (z4) {
                        i(z);
                    } else if (!zIsEmpty) {
                        m(z, str);
                    }
                    break;
                case 5:
                    if (!z2) {
                        g(z);
                        k(true, z);
                    } else if (!zIsEmpty) {
                        m(z, str);
                    } else if (z4) {
                        i(z);
                    } else if (!z3) {
                        e();
                        ViewGroup viewGroupB = b(false);
                        Runnable runnable4 = this.r;
                        runnable4.getClass();
                        viewGroupB.post(runnable4);
                    } else {
                        l(z);
                    }
                    break;
                case 6:
                    if (!z2) {
                        g(z);
                        k(true, z);
                    } else if (z3) {
                        l(z);
                    } else if (z4) {
                        i(z);
                    } else if (!zIsEmpty) {
                        m(z, str);
                    } else {
                        if (z) {
                            f();
                        } else {
                            e();
                            z6 = false;
                        }
                        ViewGroup viewGroupB2 = b(z6);
                        if (z6) {
                            runnable = this.v;
                            runnable.getClass();
                        } else {
                            runnable = this.r;
                            runnable.getClass();
                        }
                        viewGroupB2.post(runnable);
                    }
                    break;
                case 7:
                    if (!z2) {
                        g(z);
                        k(true, z);
                    } else if (z3) {
                        l(z);
                    } else if (!zIsEmpty) {
                        m(z, str);
                    } else if (!z4) {
                        if (z) {
                            f();
                        } else {
                            e();
                            z6 = false;
                        }
                        ViewGroup viewGroupB3 = b(z6);
                        this.K = false;
                        if (z6) {
                            runnable2 = this.v;
                            runnable2.getClass();
                        } else {
                            runnable2 = this.r;
                            runnable2.getClass();
                        }
                        viewGroupB3.post(runnable2);
                    } else {
                        i(z);
                    }
                    break;
                default:
                    if (!z2) {
                        g(z);
                        k(true, z);
                    } else if (!zIsEmpty) {
                        m(z, str);
                    } else if (z3) {
                        l(z);
                    } else if (!z4) {
                        if (z) {
                            f();
                        } else {
                            e();
                            z6 = false;
                        }
                        avmb avmbVar = this.S;
                        if (z6) {
                            runnable3 = this.v;
                            runnable3.getClass();
                        } else {
                            runnable3 = this.r;
                            runnable3.getClass();
                        }
                        avmbVar.e(runnable3);
                    } else {
                        i(z);
                    }
                    break;
            }
        }
    }

    public aeoh() {
        throw null;
    }
}
