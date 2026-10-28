package app.rive.core;

import android.opengl.EGLSurface;
import app.rive.RiveLog;
import app.rive.RiveShutdownException;
import defpackage.awqx;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class RiveSurfaceGLPBuffer extends RiveSurface implements AutoCloseable {
    public static final String TAG = "Rive/SurfaceGLPBuffer";
    private final EGLSurface eglSurface;
    private final RenderContextGL renderContext;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private RiveSurfaceGLPBuffer(EGLSurface eGLSurface, RenderContextGL renderContextGL, CommandQueue commandQueue, long j, long j2, int i, int i2) {
        super(commandQueue, j, j2, i, i2, false, null);
        eGLSurface.getClass();
        renderContextGL.getClass();
        commandQueue.getClass();
        this.eglSurface = eGLSurface;
        this.renderContext = renderContextGL;
    }

    static final String dispose$lambda$0() {
        return "Destroying EGL PBuffer surface";
    }

    @Override // app.rive.core.RiveSurface
    protected void dispose() throws RiveShutdownException {
        RiveLog.INSTANCE.getLogger().d(TAG, new Function0() { // from class: app.rive.core.RiveSurfaceGLPBuffer$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RiveSurfaceGLPBuffer.dispose$lambda$0();
            }
        });
        this.renderContext.destroySurface(this.eglSurface);
        super.dispose();
    }

    /* JADX INFO: compiled from: PG */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(awqx awqxVar) {
            this();
        }
    }

    public /* synthetic */ RiveSurfaceGLPBuffer(EGLSurface eGLSurface, RenderContextGL renderContextGL, CommandQueue commandQueue, long j, long j2, int i, int i2, awqx awqxVar) {
        this(eGLSurface, renderContextGL, commandQueue, j, j2, i, i2);
    }
}
