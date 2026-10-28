package app.rive.core;

import defpackage.awqx;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class RiveSurfaceVulkanImage extends RiveSurface implements AutoCloseable {
    public static final String TAG = "Rive/SurfaceVulkanImage";
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private RiveSurfaceVulkanImage(long j, CommandQueue commandQueue, long j2, int i, int i2) {
        super(commandQueue, j, j2, i, i2, false, null);
        commandQueue.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long cppCreateImageSurface(long j, int i, int i2);

    @Override // app.rive.core.RiveSurface
    protected void dispose() {
        super.dispose();
    }

    /* JADX INFO: compiled from: PG */
    public final class Companion {
        private Companion() {
        }

        private final long cppCreateImageSurface(long j, int i, int i2) {
            return RiveSurfaceVulkanImage.cppCreateImageSurface(j, i, i2);
        }

        /* JADX INFO: renamed from: create-GaSJWX4$third_party_java_android_libs_rive_rive_android, reason: not valid java name */
        public final RiveSurfaceVulkanImage m563createGaSJWX4$third_party_java_android_libs_rive_rive_android(RenderContextVulkan renderContextVulkan, int i, int i2, CommandQueue commandQueue, long j) throws Throwable {
            long jCppCreateImageSurface;
            renderContextVulkan.getClass();
            commandQueue.getClass();
            if (i <= 0 || i2 <= 0) {
                throw new IllegalArgumentException("Image surfaces require a positive width and height.");
            }
            try {
                jCppCreateImageSurface = cppCreateImageSurface(renderContextVulkan.getNativeObjectPointer(), i, i2);
                try {
                    return new RiveSurfaceVulkanImage(jCppCreateImageSurface, commandQueue, j, i, i2, null);
                } catch (Throwable th) {
                    th = th;
                    if (jCppCreateImageSurface != 0) {
                        RiveSurface.Companion.cppDeleteSurface$third_party_java_android_libs_rive_rive_android(jCppCreateImageSurface);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                jCppCreateImageSurface = 0;
            }
        }

        public /* synthetic */ Companion(awqx awqxVar) {
            this();
        }
    }

    public /* synthetic */ RiveSurfaceVulkanImage(long j, CommandQueue commandQueue, long j2, int i, int i2, awqx awqxVar) {
        this(j, commandQueue, j2, i, i2);
    }
}
