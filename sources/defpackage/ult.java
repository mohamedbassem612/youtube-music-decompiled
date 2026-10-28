package defpackage;

import android.animation.AnimatorSet;
import android.view.View;
import android.view.animation.PathInterpolator;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ult {
    public final LottieAnimationView a;
    public final LottieAnimationView b;
    public final AnimatorSet c = new AnimatorSet();

    static {
        new PathInterpolator(0.2f, 0.0f, 0.6f, 1.0f);
    }

    public ult(View view) {
        this.a = (LottieAnimationView) view.findViewById(R.id.shorts_feedback_play);
        this.b = (LottieAnimationView) view.findViewById(R.id.shorts_feedback_pause);
        view.findViewById(R.id.play_button);
        view.findViewById(R.id.pause_button);
        view.findViewById(R.id.alert_icon);
        view.findViewById(R.id.video_preview_scrim_overlay);
        view.findViewById(R.id.blurred_window);
        view.findViewById(R.id.loading_spinner_container);
    }
}
