package app.rive.core;

import android.os.Build;
import app.rive.RiveLog;
import defpackage.awmy;
import defpackage.awqg;
import defpackage.awqx;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class RenderContextVulkan extends RenderContext implements CheckableAutoCloseable {
    public static final String TAG = "Rive/RenderContextVulkan";
    private final UniquePointer cppPointer;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = CloseOnce.$stable | UniquePointer.$stable;

    public RenderContextVulkan() {
        String str = Build.HARDWARE;
        str.getClass();
        this.cppPointer = new UniquePointer(cppConstructor(RenderContextKt.supportsVulkanDebugNames(str)), TAG, new awqg() { // from class: app.rive.core.RenderContextVulkan$$ExternalSyntheticLambda0
            @Override // defpackage.awqg
            public final Object invoke(Object obj) {
                return RenderContextVulkan.cppPointer$lambda$0(this.f$0, ((Long) obj).longValue());
            }
        });
    }

    private final native long cppConstructor(boolean z);

    private final native void cppDelete(long j);

    static final awmy cppPointer$lambda$0(RenderContextVulkan renderContextVulkan, long j) {
        RiveLog.INSTANCE.getLogger().d(TAG, new Function0() { // from class: app.rive.core.RenderContextVulkan$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RenderContextVulkan.cppPointer$lambda$0$0();
            }
        });
        renderContextVulkan.cppDelete(j);
        return awmy.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String cppPointer$lambda$0$0() {
        return "Deleting RenderContextVulkan native object";
    }

    @Override // app.rive.core.RenderContext
    /* JADX INFO: renamed from: createImageSurface-i4dAsZ4$third_party_java_android_libs_rive_rive_android */
    public RiveSurface mo558x25d34fc(int i, int i2, long j, CommandQueue commandQueue) {
        commandQueue.getClass();
        return RiveSurfaceVulkanImage.Companion.m563createGaSJWX4$third_party_java_android_libs_rive_rive_android(this, i, i2, commandQueue, j);
    }

    @Override // app.rive.core.RenderContext
    /* JADX INFO: renamed from: createSurface-mDlYe8U$third_party_java_android_libs_rive_rive_android */
    public RiveSurface mo559x4819e378(CloseableSurface closeableSurface, long j, CommandQueue commandQueue) {
        closeableSurface.getClass();
        commandQueue.getClass();
        return RiveSurfaceVulkan.Companion.m562createSnmYj8w$third_party_java_android_libs_rive_rive_android(this, closeableSurface, commandQueue, j);
    }

    @Override // app.rive.core.RenderContext
    protected void dispose() {
        this.cppPointer.close();
    }

    @Override // app.rive.core.RenderContext
    public long getNativeObjectPointer() {
        return this.cppPointer.getPointer();
    }

    /* JADX INFO: compiled from: PG */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(awqx awqxVar) {
            this();
        }
    }
}
