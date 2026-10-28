package defpackage;

import android.view.Choreographer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class aom implements Choreographer.FrameCallback {
    final /* synthetic */ awuc a;
    final /* synthetic */ awqg b;

    public aom(awuc awucVar, awqg awqgVar) {
        this.a = awucVar;
        this.b = awqgVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object awmmVar;
        try {
            awmmVar = this.b.invoke(Long.valueOf(j));
        } catch (Throwable th) {
            awmmVar = new awmm(th);
        }
        this.a.resumeWith(awmmVar);
    }
}
