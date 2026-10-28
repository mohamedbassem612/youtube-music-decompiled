package defpackage;

import android.hardware.display.DisplayManager;
import android.view.Choreographer;
import android.view.Display;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class cts extends ctr implements Choreographer.FrameCallback {
    private static long c(DisplayManager displayManager) {
        Display display = displayManager.getDisplay(0);
        if (display != null) {
            return (long) (1.0E9d / ((double) display.getRefreshRate()));
        }
        bvx.e("VideoFrameReleaseHelper", "Unable to query display refresh rate");
        return -9223372036854775807L;
    }

    @Override // defpackage.ctr
    public final void a() {
        super.a();
        Choreographer choreographer = this.a;
        choreographer.removeFrameCallback(this);
        choreographer.postFrameCallback(this);
        this.d = c(this.b);
    }

    @Override // defpackage.ctr
    public final void b() {
        super.b();
        this.a.removeFrameCallback(this);
        this.c = -9223372036854775807L;
        this.d = -9223372036854775807L;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.c = j;
        Choreographer choreographer = this.a;
        choreographer.removeFrameCallback(this);
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (i == 0) {
            Choreographer choreographer = this.a;
            choreographer.removeFrameCallback(this);
            choreographer.postFrameCallback(this);
            this.d = c(this.b);
        }
    }
}
