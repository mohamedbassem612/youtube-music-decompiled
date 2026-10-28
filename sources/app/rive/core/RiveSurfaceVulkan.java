package app.rive.core;

import android.view.Surface;
import app.rive.RiveRenderException;
import defpackage.awqx;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class RiveSurfaceVulkan extends RiveSurface implements AutoCloseable {
    public static final String TAG = "Rive/SurfaceVulkan";
    private final CloseableSurface closeableSurface;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private RiveSurfaceVulkan(long j, CloseableSurface closeableSurface, CommandQueue commandQueue, long j2, int i, int i2, boolean z) {
        super(commandQueue, j, j2, i, i2, z, null);
        closeableSurface.getClass();
        commandQueue.getClass();
        this.closeableSurface = closeableSurface;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long cppCreateSurface(long j, Surface surface, int i, int i2);

    @Override // app.rive.core.RiveSurface
    protected void dispose() {
        super.dispose();
        this.closeableSurface.close();
    }

    /* JADX INFO: compiled from: PG */
    public final class Companion {
        private Companion() {
        }

        private final long cppCreateSurface(long j, Surface surface, int i, int i2) {
            return RiveSurfaceVulkan.cppCreateSurface(j, surface, i, i2);
        }

        /* JADX INFO: renamed from: create-SnmYj8w$third_party_java_android_libs_rive_rive_android, reason: not valid java name */
        public final RiveSurfaceVulkan m562createSnmYj8w$third_party_java_android_libs_rive_rive_android(RenderContextVulkan renderContextVulkan, CloseableSurface closeableSurface, CommandQueue commandQueue, long j) throws Throwable {
            Throwable th;
            long jCppCreateSurface;
            renderContextVulkan.getClass();
            closeableSurface.getClass();
            commandQueue.getClass();
            if (!closeableSurface.getSurface().isValid()) {
                throw new RiveRenderException("Unable to create Android Surface", null, 2, null);
            }
            try {
                jCppCreateSurface = cppCreateSurface(renderContextVulkan.getNativeObjectPointer(), closeableSurface.getSurface(), closeableSurface.getWidth(), closeableSurface.getHeight());
                try {
                    return new RiveSurfaceVulkan(jCppCreateSurface, closeableSurface, commandQueue, j, closeableSurface.getWidth(), closeableSurface.getHeight(), closeableSurface.getResizable(), null);
                } catch (Throwable th2) {
                    th = th2;
                    if (jCppCreateSurface == 0) {
                        throw th;
                    }
                    RiveSurface.Companion.cppDeleteSurface$third_party_java_android_libs_rive_rive_android(jCppCreateSurface);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                jCppCreateSurface = 0;
            }
        }

        public /* synthetic */ Companion(awqx awqxVar) {
            this();
        }
    }

    public /* synthetic */ RiveSurfaceVulkan(long j, CloseableSurface closeableSurface, CommandQueue commandQueue, long j2, int i, int i2, boolean z, awqx awqxVar) {
        this(j, closeableSurface, commandQueue, j2, i, i2, z);
    }
}
