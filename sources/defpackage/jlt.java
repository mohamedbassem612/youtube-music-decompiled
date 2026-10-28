package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jlt implements jls {
    private Context b;
    private LottieAnimationView c;
    private LottieAnimationView d;
    private LottieAnimationView e;
    private LottieAnimationView f;
    private TextView g;
    private TextView h;
    private ListenableFuture j;
    private ListenableFuture k;
    private ListenableFuture l;
    private final ahey m;
    private int n = 1;
    private boolean a = false;
    private int i = 0;

    public jlt(Context context, LottieAnimationView lottieAnimationView, LottieAnimationView lottieAnimationView2, LottieAnimationView lottieAnimationView3, LottieAnimationView lottieAnimationView4, TextView textView, TextView textView2, ahey aheyVar) {
        ListenableFuture listenableFuture = aher.a;
        this.j = listenableFuture;
        this.k = listenableFuture;
        this.l = listenableFuture;
        this.b = context;
        this.c = lottieAnimationView;
        this.d = lottieAnimationView2;
        this.e = lottieAnimationView3;
        this.f = lottieAnimationView4;
        this.g = textView;
        this.h = textView2;
        this.m = aheyVar;
        lottieAnimationView3.setVisibility(0);
        lottieAnimationView.b(new ejv("Ring Scale"), ehr.o, new enp(new enq(0.0f, 0.0f)));
    }

    private final void b() {
        Context context;
        if (this.a) {
            return;
        }
        LottieAnimationView lottieAnimationView = this.c;
        if (lottieAnimationView != null) {
            lottieAnimationView.f();
            this.c.setVisibility(0);
        }
        LottieAnimationView lottieAnimationView2 = this.d;
        if (lottieAnimationView2 != null) {
            lottieAnimationView2.f();
            this.d.setVisibility(0);
        }
        LottieAnimationView lottieAnimationView3 = this.f;
        if (lottieAnimationView3 != null) {
            lottieAnimationView3.f();
            this.f.setVisibility(0);
        }
        LottieAnimationView lottieAnimationView4 = this.e;
        if (lottieAnimationView4 != null) {
            lottieAnimationView4.h(R.raw.sound_search_button);
            this.e.f();
        }
        TextView textView = this.h;
        if (textView != null && (context = this.b) != null) {
            textView.setText(context.getResources().getText(R.string.sound_search_instructions));
            this.h.setTextColor(this.b.getResources().getColor(R.color.ytm_color_white));
            this.h.setVisibility(0);
        }
        TextView textView2 = this.h;
        if (textView2 != null) {
            ahey aheyVar = this.m;
            this.l = aheyVar.schedule(new duz(textView2, R.string.listening, 2), 2L, TimeUnit.SECONDS);
            this.k = aheyVar.schedule(new duz(this.h, R.string.sound_search_almost_there, 2), 8L, TimeUnit.SECONDS);
            this.j = aheyVar.schedule(new duz(this.h, R.string.sound_search_keep_going, 2), 5L, TimeUnit.SECONDS);
        }
        TextView textView3 = this.g;
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        this.a = true;
    }

    private final void m() {
        if (this.a) {
            LottieAnimationView lottieAnimationView = this.c;
            if (lottieAnimationView != null) {
                lottieAnimationView.setVisibility(8);
                this.c.d();
            }
            LottieAnimationView lottieAnimationView2 = this.d;
            if (lottieAnimationView2 != null) {
                lottieAnimationView2.setVisibility(8);
                this.d.d();
            }
            LottieAnimationView lottieAnimationView3 = this.f;
            if (lottieAnimationView3 != null) {
                lottieAnimationView3.setVisibility(8);
                this.f.d();
            }
            LottieAnimationView lottieAnimationView4 = this.e;
            if (lottieAnimationView4 != null) {
                lottieAnimationView4.h(R.raw.sound_search_button_paused);
            }
            TextView textView = this.g;
            if (textView != null) {
                textView.setVisibility(0);
            }
            TextView textView2 = this.h;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            this.j.cancel(false);
            this.k.cancel(false);
            this.l.cancel(false);
            this.a = false;
        }
    }

    @Override // defpackage.jls
    public final void a() {
        this.j.cancel(false);
        this.k.cancel(false);
        this.l.cancel(false);
        LottieAnimationView lottieAnimationView = this.c;
        if (lottieAnimationView != null) {
            lottieAnimationView.d();
            this.c = null;
        }
        LottieAnimationView lottieAnimationView2 = this.d;
        if (lottieAnimationView2 != null) {
            lottieAnimationView2.d();
            this.d = null;
        }
        LottieAnimationView lottieAnimationView3 = this.e;
        if (lottieAnimationView3 != null) {
            lottieAnimationView3.d();
            this.e = null;
        }
        LottieAnimationView lottieAnimationView4 = this.f;
        if (lottieAnimationView4 != null) {
            lottieAnimationView4.d();
            this.f = null;
        }
        this.g = null;
        this.h = null;
        this.b = null;
    }

    @Override // defpackage.jls
    public final void e(Configuration configuration) {
        Context context = this.b;
        if (context == null || this.g == null || this.e == null || this.c == null || this.d == null) {
            return;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.sound_search_around_button_animations_size);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
        int dimensionPixelSize2 = this.b.getResources().getDimensionPixelSize(R.dimen.sound_search_button_size);
        int dimensionPixelSize3 = this.b.getResources().getDimensionPixelSize(R.dimen.sound_search_button_inset);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(dimensionPixelSize2, dimensionPixelSize2);
        int i = (dimensionPixelSize2 / 2) + dimensionPixelSize3;
        int i2 = dimensionPixelSize / 2;
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.g.getLayoutParams();
        if (layoutParams3 != null) {
            int i3 = (-i2) + i;
            layoutParams3.removeRule(21);
            layoutParams3.removeRule(14);
            layoutParams3.topMargin = dimensionPixelSize2 + this.b.getResources().getDimensionPixelSize(R.dimen.item_extra_extra_large_spacing);
            if (configuration.orientation == 2) {
                layoutParams2.setMarginEnd(dimensionPixelSize3);
                layoutParams.setMarginEnd(i3);
                layoutParams.addRule(21);
                layoutParams.addRule(15);
                layoutParams3.addRule(21);
            } else {
                layoutParams2.bottomMargin = dimensionPixelSize3;
                layoutParams.bottomMargin = i3;
                layoutParams.addRule(12);
                layoutParams.addRule(14);
                layoutParams3.addRule(14);
            }
            this.e.setLayoutParams(layoutParams2);
            this.c.setLayoutParams(new RelativeLayout.LayoutParams(layoutParams));
            this.d.setLayoutParams(new RelativeLayout.LayoutParams(layoutParams));
            this.g.setLayoutParams(layoutParams3);
        }
    }

    @Override // defpackage.jls
    public final void f(int i) {
        int i2;
        ahno.F(i <= 100);
        int i3 = this.i;
        if (i != i3) {
            if (i > i3) {
                i2 = i3 + ((i - i3) / 4);
                this.i = i2;
            } else {
                i2 = (int) (i3 * 0.95f);
                this.i = i2;
            }
            double dRound = Math.round(((((double) i2) * 0.020714285714285716d) - 0.27142857142857146d) * 100.0d) / 100.0d;
            LottieAnimationView lottieAnimationView = this.c;
            if (lottieAnimationView != null) {
                float f = (float) dRound;
                lottieAnimationView.b(new ejv("Ring Scale"), ehr.o, new enp(new enq(f, f)));
            }
        }
    }

    @Override // defpackage.jls
    public final void g() {
        this.n = 2;
        LottieAnimationView lottieAnimationView = this.e;
        if (lottieAnimationView != null) {
            lottieAnimationView.setEnabled(true);
        }
        b();
    }

    @Override // defpackage.jls
    public final void h() {
        this.n = 1;
        LottieAnimationView lottieAnimationView = this.e;
        if (lottieAnimationView != null) {
            lottieAnimationView.setEnabled(true);
        }
        m();
    }

    @Override // defpackage.jls
    public final void i() {
        this.n = 1;
        LottieAnimationView lottieAnimationView = this.e;
        if (lottieAnimationView != null) {
            lottieAnimationView.setEnabled(true);
        }
        m();
        LottieAnimationView lottieAnimationView2 = this.e;
        if (lottieAnimationView2 != null) {
            lottieAnimationView2.h(R.raw.sound_search_button_inactive);
        }
    }

    @Override // defpackage.jls
    public final void j() {
        this.n = 4;
        LottieAnimationView lottieAnimationView = this.e;
        if (lottieAnimationView != null) {
            lottieAnimationView.setEnabled(false);
        }
    }

    @Override // defpackage.jls
    public final void k() {
        this.n = 3;
        LottieAnimationView lottieAnimationView = this.e;
        if (lottieAnimationView != null) {
            lottieAnimationView.setEnabled(true);
        }
        b();
    }

    @Override // defpackage.jls
    public final void l() {
        Context context;
        this.n = 1;
        LottieAnimationView lottieAnimationView = this.e;
        if (lottieAnimationView != null) {
            lottieAnimationView.setEnabled(true);
        }
        m();
        TextView textView = this.g;
        if (textView != null) {
            textView.setVisibility(0);
        }
        TextView textView2 = this.h;
        if (textView2 == null || (context = this.b) == null) {
            return;
        }
        textView2.setText(context.getResources().getText(R.string.sound_search_paused_state));
        this.h.setTextColor(tzk.i(this.b, R.attr.ytOverlayTextSecondary));
        this.h.setVisibility(0);
    }

    @Override // defpackage.jls
    public final int n() {
        return this.n;
    }

    @Override // defpackage.jls
    public final /* synthetic */ void c(int i) {
    }

    @Override // defpackage.jls
    public final /* synthetic */ void d(CharSequence charSequence) {
    }
}
