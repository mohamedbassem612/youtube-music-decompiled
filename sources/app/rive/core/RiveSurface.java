package app.rive.core;

import app.rive.RiveIncompatibleResourceException;
import app.rive.RiveLog;
import app.rive.RiveResourceClosedException;
import defpackage.awmy;
import defpackage.awqg;
import defpackage.awqx;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class RiveSurface implements CheckableAutoCloseable {
    private final CloseOnce closer;
    private final CommandQueue commandQueue;
    private final long drawKey;
    private int height;
    private final UniquePointer nativePointer;
    private final boolean resizable;
    private int width;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    private RiveSurface(CommandQueue commandQueue, long j, long j2, int i, int i2, boolean z) {
        commandQueue.getClass();
        this.drawKey = j2;
        this.resizable = z;
        this.width = i;
        this.height = i2;
        commandQueue.acquire("RiveSurface");
        this.commandQueue = commandQueue;
        this.nativePointer = new UniquePointer(j, "RiveSurface " + j2, new awqg() { // from class: app.rive.core.RiveSurface$$ExternalSyntheticLambda1
            @Override // defpackage.awqg
            public final Object invoke(Object obj) {
                return RiveSurface.nativePointer$lambda$0(((Long) obj).longValue());
            }
        });
        this.closer = new CloseOnce("RiveSurface " + j2, new Function0() { // from class: app.rive.core.RiveSurface$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RiveSurface.closer$lambda$0(this.f$0);
            }
        });
    }

    static final awmy closer$lambda$0(final RiveSurface riveSurface) {
        riveSurface.commandQueue.m398xea2bbd71(riveSurface.drawKey);
        riveSurface.commandQueue.runOnCommandServer$third_party_java_android_libs_rive_rive_android(new Function0() { // from class: app.rive.core.RiveSurface$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RiveSurface.closer$lambda$0$0(this.f$0);
            }
        });
        riveSurface.commandQueue.release("RiveSurface", "Surface closed");
        return awmy.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final awmy closer$lambda$0$0(RiveSurface riveSurface) {
        riveSurface.dispose();
        return awmy.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void cppDeleteSurfaceNative(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void cppResizeSurface(long j, int i, int i2);

    static final awmy nativePointer$lambda$0(long j) {
        RiveLog.INSTANCE.getLogger().d("Rive/Surface", new Function0() { // from class: app.rive.core.RiveSurface$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RiveSurface.nativePointer$lambda$0$0();
            }
        });
        Companion.cppDeleteSurface$third_party_java_android_libs_rive_rive_android(j);
        return awmy.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String nativePointer$lambda$0$0() {
        return "Deleting Rive native surface";
    }

    static final awmy resize$lambda$2(RiveSurface riveSurface, int i, int i2) {
        if (!riveSurface.getClosed()) {
            riveSurface.resizeNativeResources(i, i2);
        }
        return awmy.a;
    }

    public final void checkOpen$third_party_java_android_libs_rive_rive_android() {
        this.closer.checkOpen();
        if (this.nativePointer.getClosed()) {
            throw new RiveResourceClosedException("RiveSurface " + this.drawKey + " is closed");
        }
    }

    @Override // app.rive.core.CheckableAutoCloseable, java.lang.AutoCloseable
    public void close() {
        this.closer.close();
    }

    protected void dispose() {
        this.nativePointer.close();
    }

    @Override // app.rive.core.CheckableAutoCloseable
    public boolean getClosed() {
        return this.closer.getClosed() || this.nativePointer.getClosed();
    }

    /* JADX INFO: renamed from: getDrawKey-DhFih_o, reason: not valid java name */
    public final long m561getDrawKeyDhFih_o() {
        return this.drawKey;
    }

    public final int getHeight() {
        return this.height;
    }

    public final boolean getResizable() {
        return this.resizable;
    }

    public final UniquePointer getSurfaceNativePointer() {
        return this.nativePointer;
    }

    public final int getWidth() {
        return this.width;
    }

    public final long requireNativePointer$third_party_java_android_libs_rive_rive_android() {
        checkOpen$third_party_java_android_libs_rive_rive_android();
        return this.nativePointer.getPointer();
    }

    public final void requireOwnedBy$third_party_java_android_libs_rive_rive_android(CommandQueue commandQueue) {
        commandQueue.getClass();
        if (this.commandQueue == commandQueue) {
            return;
        }
        throw new RiveIncompatibleResourceException("RiveSurface " + this.drawKey + " is not owned by the required RiveWorker");
    }

    public final void resize$third_party_java_android_libs_rive_rive_android(final int i, final int i2) {
        checkOpen$third_party_java_android_libs_rive_rive_android();
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException("RiveSurface resize requires a positive width and height.");
        }
        if (!this.resizable) {
            throw new IllegalStateException("Cannot resize a fixed-size RiveSurface");
        }
        if (this.width == i && this.height == i2) {
            return;
        }
        this.commandQueue.m398xea2bbd71(this.drawKey);
        this.width = i;
        this.height = i2;
        this.commandQueue.runOnCommandServer$third_party_java_android_libs_rive_rive_android(new Function0() { // from class: app.rive.core.RiveSurface$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RiveSurface.resize$lambda$2(this.f$0, i, i2);
            }
        });
    }

    protected void resizeNativeResources(int i, int i2) {
        Companion.cppResizeSurface(this.nativePointer.getPointer(), i, i2);
    }

    /* JADX INFO: compiled from: PG */
    public final class Companion {
        private Companion() {
        }

        private final void cppDeleteSurfaceNative(long j) {
            RiveSurface.cppDeleteSurfaceNative(j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void cppResizeSurface(long j, int i, int i2) {
            RiveSurface.cppResizeSurface(j, i, i2);
        }

        public final void cppDeleteSurface$third_party_java_android_libs_rive_rive_android(long j) {
            cppDeleteSurfaceNative(j);
        }

        public /* synthetic */ Companion(awqx awqxVar) {
            this();
        }
    }

    public static /* synthetic */ void getSurfaceNativePointer$annotations() {
    }

    public /* synthetic */ RiveSurface(CommandQueue commandQueue, long j, long j2, int i, int i2, boolean z, awqx awqxVar) {
        this(commandQueue, j, j2, i, i2, z);
    }
}
