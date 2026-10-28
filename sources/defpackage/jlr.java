package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.voice.views.BitmapSoundLevelsView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jlr implements jls {
    public ImageView a;
    private BitmapSoundLevelsView b;
    private FloatingActionButton c;
    private FloatingActionButton d;
    private Animation e;
    private ProgressBar f;
    private View g;
    private int h = 1;

    public jlr(Context context, View view, int i, int i2) {
        this.g = view;
        this.b = (BitmapSoundLevelsView) view.findViewById(R.id.sound_levels);
        this.c = (FloatingActionButton) view.findViewById(R.id.enabled_microphone);
        this.d = (FloatingActionButton) view.findViewById(R.id.disabled_microphone);
        FloatingActionButton floatingActionButton = this.c;
        if (floatingActionButton != null) {
            floatingActionButton.setImageResource(i);
        }
        FloatingActionButton floatingActionButton2 = this.d;
        if (floatingActionButton2 != null) {
            floatingActionButton2.setImageResource(i2);
        }
        this.a = (ImageView) view.findViewById(R.id.pulsing_circle);
        this.f = (ProgressBar) view.findViewById(R.id.loading_view);
        ohj ohjVar = new ohj(context.getResources().getDimensionPixelSize(R.dimen.buffering_progress_max_thickness), context.getResources().getDimensionPixelSize(R.dimen.buffering_progress_inset), new int[]{tzk.i(context, R.attr.ytStaticBrandRed)});
        ProgressBar progressBar = this.f;
        if (progressBar != null) {
            progressBar.setIndeterminateDrawable(ohjVar);
        }
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, R.anim.pulsing_circle_anim);
        this.e = animationLoadAnimation;
        if (animationLoadAnimation != null) {
            animationLoadAnimation.setAnimationListener(new dfy(this, 5));
        }
    }

    private static final void o(View view, int i) {
        view.setAlpha(0.0f);
        view.animate().alpha(1.0f).setDuration(i).start();
    }

    @Override // defpackage.jls
    public final void a() {
        Animation animation = this.e;
        if (animation != null) {
            animation.setAnimationListener(null);
            this.e.cancel();
        }
        this.b = null;
        this.c = null;
        this.d = null;
        this.a = null;
        this.e = null;
        this.f = null;
        this.g = null;
    }

    final void b() {
        int i = this.h;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            BitmapSoundLevelsView bitmapSoundLevelsView = this.b;
            if (bitmapSoundLevelsView != null) {
                bitmapSoundLevelsView.setEnabled(false);
                this.b.setVisibility(8);
            }
            ImageView imageView = this.a;
            if (imageView != null) {
                imageView.setVisibility(4);
            }
            Animation animation = this.e;
            if (animation != null) {
                animation.cancel();
                this.e.reset();
            }
            ProgressBar progressBar = this.f;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            FloatingActionButton floatingActionButton = this.c;
            if (floatingActionButton != null) {
                floatingActionButton.g(4, true);
            }
            FloatingActionButton floatingActionButton2 = this.d;
            if (floatingActionButton2 != null) {
                floatingActionButton2.g(0, true);
            }
            View view = this.g;
            if (view != null) {
                view.setEnabled(true);
                return;
            }
            return;
        }
        if (i2 == 1) {
            FloatingActionButton floatingActionButton3 = this.d;
            if (floatingActionButton3 != null) {
                floatingActionButton3.g(0, true);
            }
            BitmapSoundLevelsView bitmapSoundLevelsView2 = this.b;
            if (bitmapSoundLevelsView2 != null) {
                bitmapSoundLevelsView2.setEnabled(true);
                this.b.setVisibility(0);
            }
            ImageView imageView2 = this.a;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
            m();
            BitmapSoundLevelsView bitmapSoundLevelsView3 = this.b;
            if (bitmapSoundLevelsView3 != null) {
                o(bitmapSoundLevelsView3, 218);
            }
            FloatingActionButton floatingActionButton4 = this.d;
            if (floatingActionButton4 != null) {
                o(floatingActionButton4, 218);
                return;
            }
            return;
        }
        if (i2 == 2) {
            FloatingActionButton floatingActionButton5 = this.d;
            if (floatingActionButton5 != null) {
                floatingActionButton5.g(0, true);
            }
            BitmapSoundLevelsView bitmapSoundLevelsView4 = this.b;
            if (bitmapSoundLevelsView4 != null) {
                bitmapSoundLevelsView4.setEnabled(true);
                this.b.setVisibility(0);
            }
            ImageView imageView3 = this.a;
            if (imageView3 != null) {
                imageView3.setVisibility(0);
            }
            m();
            FloatingActionButton floatingActionButton6 = this.c;
            if (floatingActionButton6 != null) {
                floatingActionButton6.g(0, true);
                o(this.c, 536);
            }
            FloatingActionButton floatingActionButton7 = this.d;
            if (floatingActionButton7 != null) {
                floatingActionButton7.setAlpha(1.0f);
                floatingActionButton7.animate().alpha(0.0f).setDuration(536L).start();
            }
            View view2 = this.g;
            if (view2 != null) {
                view2.setEnabled(true);
                return;
            }
            return;
        }
        if (i2 == 3) {
            FloatingActionButton floatingActionButton8 = this.c;
            if (floatingActionButton8 != null) {
                floatingActionButton8.g(4, true);
            }
            FloatingActionButton floatingActionButton9 = this.d;
            if (floatingActionButton9 != null) {
                floatingActionButton9.g(4, true);
            }
            BitmapSoundLevelsView bitmapSoundLevelsView5 = this.b;
            if (bitmapSoundLevelsView5 != null) {
                bitmapSoundLevelsView5.setEnabled(false);
                this.b.setVisibility(4);
            }
            ImageView imageView4 = this.a;
            if (imageView4 != null) {
                imageView4.setVisibility(4);
            }
            Animation animation2 = this.e;
            if (animation2 != null) {
                animation2.cancel();
                this.e.reset();
            }
            ProgressBar progressBar2 = this.f;
            if (progressBar2 != null) {
                progressBar2.setVisibility(0);
            }
            View view3 = this.g;
            if (view3 != null) {
                view3.setEnabled(false);
            }
        }
    }

    @Override // defpackage.jls
    public final void f(int i) {
        ahno.F(i <= 100);
        BitmapSoundLevelsView bitmapSoundLevelsView = this.b;
        if (bitmapSoundLevelsView != null) {
            ahno.F(i <= 100);
            bitmapSoundLevelsView.a = i;
        }
    }

    @Override // defpackage.jls
    public final void g() {
        this.h = 2;
        b();
    }

    @Override // defpackage.jls
    public final void h() {
        this.h = 1;
        b();
    }

    @Override // defpackage.jls
    public final void i() {
        this.h = 1;
        b();
    }

    @Override // defpackage.jls
    public final void j() {
        this.h = 4;
        b();
    }

    @Override // defpackage.jls
    public final void k() {
        this.h = 3;
        b();
    }

    public final void m() {
        Animation animation;
        ImageView imageView = this.a;
        if (imageView == null || imageView.getVisibility() == 4 || (animation = this.e) == null) {
            return;
        }
        this.a.setAnimation(animation);
        this.e.start();
    }

    @Override // defpackage.jls
    public final int n() {
        return this.h;
    }

    @Override // defpackage.jls
    public final void l() {
    }

    @Override // defpackage.jls
    public final /* synthetic */ void c(int i) {
    }

    @Override // defpackage.jls
    public final /* synthetic */ void d(CharSequence charSequence) {
    }

    @Override // defpackage.jls
    public final void e(Configuration configuration) {
    }
}
