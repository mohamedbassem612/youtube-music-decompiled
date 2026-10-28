package defpackage;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Choreographer;
import android.view.Choreographer$VsyncCallback;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ctt extends ctr implements Choreographer$VsyncCallback {
    private final Handler f;

    public ctt(Choreographer choreographer, DisplayManager displayManager) {
        super(choreographer, displayManager);
        this.f = bwp.H(null);
    }

    @Override // defpackage.ctr
    public final void a() {
        super.a();
        Choreographer choreographer = this.a;
        choreographer.removeVsyncCallback(this);
        choreographer.postVsyncCallback(this);
    }

    @Override // defpackage.ctr
    public final void b() {
        super.b();
        this.f.removeCallbacksAndMessages(null);
        this.a.removeVsyncCallback(this);
        this.c = -9223372036854775807L;
        this.d = -9223372036854775807L;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (i == 0) {
            this.f.removeCallbacksAndMessages(null);
            Choreographer choreographer = this.a;
            choreographer.removeVsyncCallback(this);
            choreographer.postVsyncCallback(this);
        }
    }

    public final void onVsync(Choreographer.FrameData frameData) {
        this.c = frameData.getFrameTimeNanos();
        Choreographer.FrameTimeline[] frameTimelines = frameData.getFrameTimelines();
        if (frameTimelines.length >= 2) {
            long expectedPresentationTimeNanos = frameTimelines[1].getExpectedPresentationTimeNanos() - frameTimelines[0].getExpectedPresentationTimeNanos();
            this.d = expectedPresentationTimeNanos != 0 ? expectedPresentationTimeNanos : -9223372036854775807L;
        } else {
            this.d = -9223372036854775807L;
        }
        Handler handler = this.f;
        handler.removeCallbacksAndMessages(null);
        handler.postDelayed(new cqc(this, 8), 500L);
    }
}
