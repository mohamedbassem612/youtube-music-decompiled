package defpackage;

import com.google.mediapipe.framework.GlSyncToken;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rge extends ahxm {
    final /* synthetic */ rgf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rge(rgf rgfVar, int i, int i2, int i3) {
        super(i, i2, i3);
        this.a = rgfVar;
    }

    @Override // defpackage.ahxm, com.google.mediapipe.framework.TextureFrame
    public final void release() {
        super.release();
        int i = rgf.a;
        this.a.b(this);
    }

    @Override // defpackage.ahxm, com.google.mediapipe.framework.TextureFrame, com.google.mediapipe.framework.TextureReleaseCallback
    public final void release(GlSyncToken glSyncToken) {
        super.release(glSyncToken);
        int i = rgf.a;
        this.a.b(this);
    }
}
