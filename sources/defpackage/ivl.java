package defpackage;

import android.media.MediaPlayer;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import com.google.android.apps.youtube.music.signin.OnboardingVideoView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ivl implements MediaPlayer.OnPreparedListener {
    final /* synthetic */ OnboardingVideoView a;

    public ivl(OnboardingVideoView onboardingVideoView) {
        this.a = onboardingVideoView;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        mediaPlayer.setLooping(true);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setStartOffset(100L);
        alphaAnimation.setDuration(300L);
        View view = this.a.b;
        view.setAnimation(alphaAnimation);
        view.setVisibility(8);
    }
}
