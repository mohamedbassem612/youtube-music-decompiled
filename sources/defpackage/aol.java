package defpackage;

import android.view.Choreographer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class aol implements awqg {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Choreographer.FrameCallback a;
    final /* synthetic */ Object b;

    public aol(Object obj, Choreographer.FrameCallback frameCallback, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = frameCallback;
    }

    @Override // defpackage.awqg
    public final /* synthetic */ Object invoke(Object obj) {
        if (this.$cid == 0) {
            ((aon) this.b).b.removeFrameCallback(this.a);
            return awmy.a;
        }
        Choreographer.FrameCallback frameCallback = this.a;
        Object obj2 = this.b;
        synchronized (((aok) obj2).d) {
            ((aok) obj2).e.remove(frameCallback);
        }
        return awmy.a;
    }
}
