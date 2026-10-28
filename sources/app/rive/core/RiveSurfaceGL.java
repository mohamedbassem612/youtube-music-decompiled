package app.rive.core;

import android.opengl.EGLSurface;
import app.rive.RiveLog;
import app.rive.RiveShutdownException;
import defpackage.awqx;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class RiveSurfaceGL extends RiveSurface implements AutoCloseable {
    public static final String TAG = "Rive/SurfaceGL";
    private final CloseableSurface closeableSurface;
    private final EGLSurface eglSurface;
    private final RenderContextGL renderContext;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private RiveSurfaceGL(EGLSurface eGLSurface, RenderContextGL renderContextGL, CloseableSurface closeableSurface, CommandQueue commandQueue, long j, long j2, int i, int i2, boolean z) {
        super(commandQueue, j, j2, i, i2, z, null);
        eGLSurface.getClass();
        renderContextGL.getClass();
        closeableSurface.getClass();
        commandQueue.getClass();
        this.eglSurface = eGLSurface;
        this.renderContext = renderContextGL;
        this.closeableSurface = closeableSurface;
    }

    static final String dispose$lambda$0() {
        return "Destroying EGL surface";
    }

    @Override // app.rive.core.RiveSurface
    protected void dispose() throws RiveShutdownException {
        RiveLog.INSTANCE.getLogger().d(TAG, new Function0() { // from class: app.rive.core.RiveSurfaceGL$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RiveSurfaceGL.dispose$lambda$0();
            }
        });
        this.renderContext.destroySurface(this.eglSurface);
        this.closeableSurface.close();
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

    public /* synthetic */ RiveSurfaceGL(EGLSurface eGLSurface, RenderContextGL renderContextGL, CloseableSurface closeableSurface, CommandQueue commandQueue, long j, long j2, int i, int i2, boolean z, awqx awqxVar) {
        this(eGLSurface, renderContextGL, closeableSurface, commandQueue, j, j2, i, i2, z);
    }
}
