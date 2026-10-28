package com.google.android.apps.youtube.music.player.indicator;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.youtube.music.R;
import defpackage.ehm;
import defpackage.pr;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class RoundedPlayingIndicatorView extends FrameLayout {
    public final LottieAnimationView a;

    public RoundedPlayingIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LottieAnimationView lottieAnimationView = new LottieAnimationView(context);
        this.a = lottieAnimationView;
        lottieAnimationView.h(R.raw.rounded_playing_indicator_with_pause);
        lottieAnimationView.q(-1);
        addView(lottieAnimationView, new FrameLayout.LayoutParams(-1, -1, 17));
    }

    public final void a(boolean z, float f) {
        LottieAnimationView lottieAnimationView = this.a;
        lottieAnimationView.setVisibility(0);
        lottieAnimationView.s(f);
        pr prVar = new pr(this, 8, null);
        ehm ehmVar = lottieAnimationView.d;
        ehmVar.h(prVar);
        if (z) {
            ehmVar.p();
            lottieAnimationView.n(0, 69);
            lottieAnimationView.q(-1);
            lottieAnimationView.f();
            return;
        }
        lottieAnimationView.n(70, 109);
        if (!lottieAnimationView.t()) {
            ehmVar.r(109);
        } else {
            lottieAnimationView.q(0);
            lottieAnimationView.f();
        }
    }
}
