package defpackage;

import android.view.Choreographer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class ogu {
    private Choreographer.FrameCallback a;

    public abstract void a(long j);

    final Choreographer.FrameCallback b() {
        if (this.a == null) {
            this.a = new ogt(this, 0);
        }
        return this.a;
    }
}
