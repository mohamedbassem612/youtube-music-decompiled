package defpackage;

import android.view.Choreographer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ogv extends ogw {
    private final Choreographer a = Choreographer.getInstance();

    @Override // defpackage.ogw
    public final void a(ogu oguVar) {
        this.a.postFrameCallback(oguVar.b());
    }

    @Override // defpackage.ogw
    public final void b(ogu oguVar) {
        this.a.removeFrameCallback(oguVar.b());
    }
}
