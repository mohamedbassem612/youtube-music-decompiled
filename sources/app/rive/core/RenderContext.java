package app.rive.core;

import defpackage.awmy;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class RenderContext implements CheckableAutoCloseable {
    public static final int $stable = CloseOnce.$stable;
    private final CloseOnce closer = new CloseOnce("RenderContext", new Function0() { // from class: app.rive.core.RenderContext$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RenderContext.closer$lambda$0(this.f$0);
        }
    });

    static final awmy closer$lambda$0(RenderContext renderContext) {
        renderContext.dispose();
        return awmy.a;
    }

    @Override // app.rive.core.CheckableAutoCloseable, java.lang.AutoCloseable
    public void close() {
        this.closer.close();
    }

    /* JADX INFO: renamed from: createImageSurface-i4dAsZ4$third_party_java_android_libs_rive_rive_android, reason: not valid java name */
    public abstract RiveSurface mo558x25d34fc(int i, int i2, long j, CommandQueue commandQueue);

    /* JADX INFO: renamed from: createSurface-mDlYe8U$third_party_java_android_libs_rive_rive_android, reason: not valid java name */
    public abstract RiveSurface mo559x4819e378(CloseableSurface closeableSurface, long j, CommandQueue commandQueue);

    protected abstract void dispose();

    @Override // app.rive.core.CheckableAutoCloseable
    public boolean getClosed() {
        return this.closer.getClosed();
    }

    public abstract long getNativeObjectPointer();
}
