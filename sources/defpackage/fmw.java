package defpackage;

import android.view.Choreographer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class fmw implements Choreographer.FrameCallback {
    final /* synthetic */ fmx a;

    public fmw(fmx fmxVar) {
        this.a = fmxVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.a.d(j);
    }
}
