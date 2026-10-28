package app.rive;

import android.os.Build;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class RenderBackendKt {
    public static final RenderBackend effectiveRenderBackend(RenderBackend renderBackend, int i) {
        renderBackend.getClass();
        RenderBackend renderBackend2 = RenderBackend.Vulkan;
        return (renderBackend != renderBackend2 || i < 29) ? RenderBackend.OpenGL : renderBackend2;
    }

    public static /* synthetic */ RenderBackend effectiveRenderBackend$default(RenderBackend renderBackend, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = Build.VERSION.SDK_INT;
        }
        return effectiveRenderBackend(renderBackend, i);
    }
}
