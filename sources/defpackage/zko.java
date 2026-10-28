package defpackage;

import android.graphics.SurfaceTexture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zko implements SurfaceTexture.OnFrameAvailableListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public zko(auje aujeVar, int i) {
        this.$cid = i;
        this.a = aujeVar;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        aujf aujfVar;
        int i = this.$cid;
        if (i == 0) {
            ((zkp) this.a).e.requestRender();
            return;
        }
        Object obj = this.a;
        if (i == 1) {
            ((cuj) obj).a.set(true);
            return;
        }
        auje aujeVar = (auje) obj;
        aujeVar.d.getAndIncrement();
        synchronized (aujeVar.k) {
            if (!((auje) obj).j && (aujfVar = ((auje) obj).b) != null) {
                aujfVar.b();
            }
        }
    }

    public /* synthetic */ zko(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }
}
