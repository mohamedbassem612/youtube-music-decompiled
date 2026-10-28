package defpackage;

import com.google.mediapipe.framework.GlSyncToken;
import com.google.mediapipe.framework.TextureFrame;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class ahxm implements TextureFrame {
    public final int b;
    public final int c;
    public final int d;
    public long e = Long.MIN_VALUE;
    public boolean f = false;
    public GlSyncToken g = null;
    private final int a = 6408;

    public ahxm(int i, int i2, int i3) {
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final void finalize() {
        GlSyncToken glSyncToken = this.g;
        if (glSyncToken != null) {
            glSyncToken.release();
            this.g = null;
        }
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final int getFormat() {
        return this.a;
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final int getHeight() {
        return this.d;
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final int getTextureName() {
        return this.b;
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final long getTimestamp() {
        return this.e;
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final int getWidth() {
        return this.c;
    }

    @Override // com.google.mediapipe.framework.TextureFrame, com.google.mediapipe.framework.TextureReleaseCallback
    public void release(GlSyncToken glSyncToken) {
        synchronized (this) {
            GlSyncToken glSyncToken2 = this.g;
            if (glSyncToken2 != null) {
                glSyncToken2.release();
            }
            this.g = glSyncToken;
            notifyAll();
        }
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final /* synthetic */ void retain() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final /* synthetic */ boolean supportsRetain() {
        return false;
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public void release() {
        synchronized (this) {
            this.f = false;
            notifyAll();
        }
    }
}
