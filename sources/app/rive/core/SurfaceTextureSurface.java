package app.rive.core;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import defpackage.awmy;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class SurfaceTextureSurface implements CloseableSurface {
    public static final int $stable = 8;
    private final CloseOnce closer;
    private final int height;
    private final boolean resizable;
    private final Surface surface;
    private final SurfaceTexture surfaceTexture;
    private final int width;

    public SurfaceTextureSurface(SurfaceTexture surfaceTexture, int i, int i2) {
        surfaceTexture.getClass();
        this.surfaceTexture = surfaceTexture;
        this.width = i;
        this.height = i2;
        if (getWidth() <= 0 || getHeight() <= 0) {
            throw new IllegalArgumentException("SurfaceTextureSurface requires a positive width and height.");
        }
        this.surface = new Surface(surfaceTexture);
        this.resizable = true;
        this.closer = new CloseOnce("SurfaceTextureSurface", new Function0() { // from class: app.rive.core.SurfaceTextureSurface$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SurfaceTextureSurface.closer$lambda$0(this.f$0);
            }
        });
    }

    static final awmy closer$lambda$0(SurfaceTextureSurface surfaceTextureSurface) {
        surfaceTextureSurface.getSurface().release();
        surfaceTextureSurface.surfaceTexture.release();
        return awmy.a;
    }

    @Override // app.rive.core.CloseableSurface, java.lang.AutoCloseable
    public void close() {
        this.closer.close();
    }

    @Override // app.rive.core.CloseableSurface
    public int getHeight() {
        return this.height;
    }

    @Override // app.rive.core.CloseableSurface
    public boolean getResizable() {
        return this.resizable;
    }

    @Override // app.rive.core.CloseableSurface
    public Surface getSurface() {
        return this.surface;
    }

    @Override // app.rive.core.CloseableSurface
    public int getWidth() {
        return this.width;
    }
}
