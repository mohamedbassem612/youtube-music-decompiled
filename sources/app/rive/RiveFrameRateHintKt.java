package app.rive;

import android.os.Build;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class RiveFrameRateHintKt {
    public static final void applyRequestedFrameRateHint(View view, RiveFrameRate riveFrameRate, boolean z) {
        view.getClass();
        riveFrameRate.getClass();
        if (Build.VERSION.SDK_INT >= 35) {
            float framesPerSecond = -1.0f;
            if (z && (riveFrameRate instanceof RiveFrameRate.Capped)) {
                framesPerSecond = ((RiveFrameRate.Capped) riveFrameRate).getFramesPerSecond();
            }
            view.setRequestedFrameRate(framesPerSecond);
        }
    }
}
