package defpackage;

import android.view.Choreographer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class oor implements oos {
    final /* synthetic */ Choreographer a;

    public oor(Choreographer choreographer) {
        this.a = choreographer;
    }

    @Override // defpackage.oos
    public final void a(Choreographer.FrameCallback frameCallback) {
        this.a.postFrameCallback(frameCallback);
    }

    @Override // defpackage.oos
    public final void b(Choreographer.FrameCallback frameCallback) {
        this.a.removeFrameCallback(frameCallback);
    }
}
