package com.google.mediapipe.framework;

import defpackage.agrc;
import defpackage.agrf;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class GraphTextureFrame implements TextureFrame {
    private static final agrf e = agrf.h("com/google/mediapipe/framework/GraphTextureFrame");
    public final int a;
    public final int b;
    public final int c;
    public long d;
    private long f;
    private final int g;
    private final Set h = new HashSet();
    private int i = 1;

    public GraphTextureFrame(long j, long j2) {
        this.d = Long.MIN_VALUE;
        this.f = j;
        this.g = nativeGetTextureName(j);
        this.a = nativeGetWidth(this.f);
        this.b = nativeGetHeight(this.f);
        this.c = nativeGetFormat(this.f);
        this.d = j2;
    }

    private native long nativeCreateSyncTokenForCurrentExternalContext(long j);

    private native void nativeDidRead(long j, long j2);

    private native long nativeGetCurrentExternalContextHandle();

    private native int nativeGetFormat(long j);

    private native int nativeGetHeight(long j);

    private native int nativeGetTextureName(long j);

    private native int nativeGetWidth(long j);

    private native void nativeReleaseBuffer(long j);

    protected final void finalize() {
        if (this.i > 0 || this.f != 0) {
            ((agrc) ((agrc) e.c()).k("com/google/mediapipe/framework/GraphTextureFrame", "finalize", 186, "GraphTextureFrame.java")).t("release was not called before finalize");
        }
        if (this.h.isEmpty()) {
            return;
        }
        ((agrc) ((agrc) e.c()).k("com/google/mediapipe/framework/GraphTextureFrame", "finalize", 189, "GraphTextureFrame.java")).t("active consumers did not release with sync before finalize");
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final int getFormat() {
        return this.c;
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final int getHeight() {
        return this.b;
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final synchronized int getTextureName() {
        if (this.f == 0) {
            return 0;
        }
        long jNativeGetCurrentExternalContextHandle = nativeGetCurrentExternalContextHandle();
        if (jNativeGetCurrentExternalContextHandle != 0) {
            this.h.add(Long.valueOf(jNativeGetCurrentExternalContextHandle));
        }
        return this.g;
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final long getTimestamp() {
        return this.d;
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final int getWidth() {
        return this.a;
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final synchronized void release() {
        long jNativeGetCurrentExternalContextHandle = nativeGetCurrentExternalContextHandle();
        if (jNativeGetCurrentExternalContextHandle == 0) {
            if (!this.h.isEmpty()) {
                ((agrc) ((agrc) e.c()).k("com/google/mediapipe/framework/GraphTextureFrame", "release", 137, "GraphTextureFrame.java")).t("GraphTextureFrame is being released on non GL thread while having active consumers, which may lead to external / internal GL contexts synchronization issues.");
            }
            jNativeGetCurrentExternalContextHandle = 0;
        }
        GraphGlSyncToken graphGlSyncToken = null;
        if (jNativeGetCurrentExternalContextHandle != 0 && this.h.remove(Long.valueOf(jNativeGetCurrentExternalContextHandle))) {
            graphGlSyncToken = new GraphGlSyncToken(nativeCreateSyncTokenForCurrentExternalContext(this.f));
        }
        release(graphGlSyncToken);
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final synchronized void retain() {
        this.i++;
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final boolean supportsRetain() {
        return true;
    }

    @Override // com.google.mediapipe.framework.TextureFrame, com.google.mediapipe.framework.TextureReleaseCallback
    public final synchronized void release(GlSyncToken glSyncToken) {
        if (this.f != 0) {
            if (glSyncToken != null) {
                nativeDidRead(this.f, glSyncToken.nativeToken());
                glSyncToken.release();
            }
            int i = this.i - 1;
            this.i = i;
            if (i <= 0) {
                nativeReleaseBuffer(this.f);
                this.f = 0L;
            }
        } else if (glSyncToken != null) {
            ((agrc) ((agrc) e.c()).k("com/google/mediapipe/framework/GraphTextureFrame", "release", 162, "GraphTextureFrame.java")).t("release with sync token, but handle is 0");
        }
    }
}
