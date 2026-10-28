package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import j$.util.Optional;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vhn implements Animator.AnimatorListener {
    static final long a;
    public static final /* synthetic */ int h = 0;
    public final int b;
    public cc c;
    public TextView d;
    final float g;
    private final Handler i;
    private final int j;
    private final int k;
    public Optional e = Optional.empty();
    public boolean f = false;
    private final Runnable l = new vhm(this, 2);

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        a = 5000L;
    }

    public vhn(Context context, Handler handler) {
        this.i = handler;
        Resources resources = context.getResources();
        this.j = resources.getDisplayMetrics().heightPixels;
        this.k = resources.getDisplayMetrics().widthPixels;
        resources.getDimension(R.dimen.comment_sticker_container_bottom_margin);
        this.g = resources.getDimension(R.dimen.reel_edit_video_tap_for_more_static_sticker_margin);
        this.b = resources.getColor(R.color.add_text_shadow_color);
    }

    public final int a() {
        return (!this.f || this.e.isEmpty() || ((View) this.e.get()).getHeight() == 0) ? this.j : ((View) this.e.get()).getHeight();
    }

    public final void b() {
        this.i.post(new vhm(this, 0));
    }

    public final void c(int i) {
        TextView textView = this.d;
        textView.setShadowLayer(textView.getShadowRadius(), this.d.getShadowDx(), this.d.getShadowDy(), i);
    }

    public final void d(int i) {
        rir rirVar = new rir(this, i, 5);
        Handler handler = this.i;
        handler.post(rirVar);
        Runnable runnable = this.l;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, a);
    }

    public final void e(auau auauVar) {
        auat auatVar = (auat) ((aihf) auauVar).instance;
        f(auatVar.d, auatVar.c);
    }

    public final void f(int i, int i2) {
        float f = i;
        d(Math.round((a() / 2.0f) - Math.min(f, (f / i2) * (this.k / 2.0f))));
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.d.setVisibility(8);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
