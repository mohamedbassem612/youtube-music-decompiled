package defpackage;

import android.support.rastermill.FrameSequenceDrawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class otp implements ote {
    private final FrameSequenceDrawable a;

    public otp(FrameSequenceDrawable frameSequenceDrawable) {
        this.a = frameSequenceDrawable;
        frameSequenceDrawable.setLoopBehavior(1);
        frameSequenceDrawable.setLoopCount(1);
    }

    @Override // defpackage.ote
    public final void a(Runnable runnable) {
        FrameSequenceDrawable frameSequenceDrawable = this.a;
        if (runnable == null) {
            frameSequenceDrawable.setOnFinishedListener(null);
        } else {
            frameSequenceDrawable.setOnFinishedListener(new oto(runnable, 0));
        }
    }

    @Override // defpackage.ote
    public final void b() {
        FrameSequenceDrawable frameSequenceDrawable = this.a;
        frameSequenceDrawable.setLoopBehavior(1);
        frameSequenceDrawable.setLoopCount(1);
        frameSequenceDrawable.start();
    }

    @Override // defpackage.ote
    public final void c() {
        this.a.stop();
    }
}
