package defpackage;

import android.animation.ValueAnimator;
import com.google.android.apps.youtube.music.watchpage.MusicPlaybackControlsTimeBar;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jns implements ValueAnimator.AnimatorUpdateListener {
    public final ValueAnimator a;
    public boolean b;
    public final int c;
    public final int d;
    public final /* synthetic */ MusicPlaybackControlsTimeBar e;

    public jns(MusicPlaybackControlsTimeBar musicPlaybackControlsTimeBar, int i, int i2, int i3) {
        this.e = musicPlaybackControlsTimeBar;
        this.c = i2;
        this.d = i;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(i, i2);
        this.a = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(i3);
        valueAnimatorOfFloat.addUpdateListener(this);
        this.b = false;
    }

    public final float a() {
        if (!this.e.isEnabled()) {
            return 0.0f;
        }
        float fFloatValue = ((Float) this.a.getAnimatedValue()).floatValue();
        return Math.min(this.c, Math.max(this.d, fFloatValue));
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.e.invalidate();
    }
}
