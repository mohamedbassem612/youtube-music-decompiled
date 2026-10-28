package defpackage;

import com.google.mediapipe.framework.GlSyncToken;
import com.google.mediapipe.framework.GraphTextureFrame;
import com.google.mediapipe.framework.TextureFrame;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
class rhq implements TextureFrame {
    protected final TextureFrame b;

    protected rhq(TextureFrame textureFrame) {
        this.b = textureFrame;
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final int getFormat() {
        return ((GraphTextureFrame) this.b).c;
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final int getHeight() {
        return ((GraphTextureFrame) this.b).b;
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final int getTextureName() {
        return this.b.getTextureName();
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final long getTimestamp() {
        return ((GraphTextureFrame) this.b).d;
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final int getWidth() {
        return ((GraphTextureFrame) this.b).a;
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public void release() {
        this.b.release();
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final void retain() {
        this.b.retain();
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final boolean supportsRetain() {
        return true;
    }

    @Override // com.google.mediapipe.framework.TextureFrame, com.google.mediapipe.framework.TextureReleaseCallback
    public void release(GlSyncToken glSyncToken) {
        this.b.release(glSyncToken);
    }
}
