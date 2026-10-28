package app.rive;

import android.graphics.Bitmap;
import android.os.Build;
import app.rive.core.CheckableAutoCloseable;
import app.rive.core.CloseOnce;
import app.rive.core.CommandQueue;
import app.rive.core.RenderingDefaults;
import app.rive.core.RiveSurface;
import defpackage.avkz;
import defpackage.awmy;
import defpackage.awqx;
import defpackage.awrm;
import defpackage.axae;
import defpackage.axah;
import defpackage.axal;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class HardwareRenderBuffer implements CheckableAutoCloseable {
    private static final long FIRST_FRAME_TIMEOUT_MILLIS = 2000;
    private static final String TAG = "Rive/RenderBuffer/Hardware";
    private final axae _frameAvailable;
    private final Object bitmapLock;
    private final CloseOnce closer;
    private Bitmap currentBitmap;
    private final CountDownLatch firstFrameLatch;
    private volatile boolean firstFramePublished;
    private final long firstFrameTimeoutMillis;
    private final axah frameAvailable;
    private final HardwareFrameSource frameSource;
    private final int height;
    private volatile Throwable imageReaderFailure;
    private volatile boolean isClosedFlag;
    private Bitmap pendingBitmap;
    private final CommandQueue riveWorker;
    private final int width;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    private HardwareRenderBuffer(int i, int i2, CommandQueue commandQueue, HardwareFrameSourceFactory hardwareFrameSourceFactory, int i3, long j) {
        this.width = i;
        this.height = i2;
        this.riveWorker = commandQueue;
        this.firstFrameTimeoutMillis = j;
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException("HardwareRenderBuffer width/height must be > 0");
        }
        if (j < 0) {
            throw new IllegalArgumentException("HardwareRenderBuffer first-frame timeout must be >= 0");
        }
        if (i3 < 29) {
            throw new IllegalStateException("Hardware bitmap rendering requires API 29+");
        }
        axae axaeVarD = axal.d(0, 1, 2);
        this._frameAvailable = axaeVarD;
        this.frameAvailable = axaeVarD;
        HardwareFrameSource hardwareFrameSourceCreate = hardwareFrameSourceFactory.create(i, i2, commandQueue);
        this.frameSource = hardwareFrameSourceCreate;
        this.bitmapLock = new Object();
        this.firstFrameLatch = new CountDownLatch(1);
        this.closer = new CloseOnce("HardwareRenderBuffer", new Function0() { // from class: app.rive.HardwareRenderBuffer$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HardwareRenderBuffer.closer$lambda$0(this.f$0);
            }
        });
        try {
            hardwareFrameSourceCreate.setListener(new HardwareFrameSource.Listener() { // from class: app.rive.HardwareRenderBuffer.4
                @Override // app.rive.HardwareFrameSource.Listener
                public void onFailure(Throwable th) {
                    th.getClass();
                    HardwareRenderBuffer.this.reportFrameFailure(th);
                }

                @Override // app.rive.HardwareFrameSource.Listener
                public void onFrame(Bitmap bitmap) {
                    bitmap.getClass();
                    HardwareRenderBuffer.this.publishFrame(bitmap);
                }
            });
        } catch (Throwable th) {
            try {
                this.closer.close();
            } catch (Throwable th2) {
                if (th2 != th) {
                    avkz.d(th, th2);
                }
            }
            throw th;
        }
    }

    static final awmy closer$lambda$0(HardwareRenderBuffer hardwareRenderBuffer) throws Throwable {
        int i;
        Bitmap[] bitmapArr;
        hardwareRenderBuffer.isClosedFlag = true;
        hardwareRenderBuffer.firstFrameLatch.countDown();
        awrm awrmVar = new awrm();
        try {
            hardwareRenderBuffer.frameSource.stop();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        awrmVar.a = th;
        synchronized (hardwareRenderBuffer.bitmapLock) {
            Bitmap bitmap = hardwareRenderBuffer.pendingBitmap;
            Bitmap bitmap2 = hardwareRenderBuffer.currentBitmap;
            hardwareRenderBuffer.pendingBitmap = null;
            hardwareRenderBuffer.currentBitmap = null;
            bitmapArr = bitmap == bitmap2 ? new Bitmap[]{bitmap} : new Bitmap[]{bitmap, bitmap2};
        }
        for (Bitmap bitmap3 : bitmapArr) {
            if (bitmap3 != null && !bitmap3.isRecycled()) {
                Throwable th2 = (Throwable) awrmVar.a;
                try {
                    bitmap3.recycle();
                } catch (Throwable th3) {
                    if (th2 == null) {
                        th2 = th3;
                    } else if (th3 != th2) {
                        avkz.d(th2, th3);
                    }
                }
                awrmVar.a = th2;
            }
        }
        Throwable th4 = (Throwable) awrmVar.a;
        try {
            hardwareRenderBuffer.getSurface().close();
        } catch (Throwable th5) {
            if (th4 == null) {
                th4 = th5;
            } else if (th5 != th4) {
                avkz.d(th4, th5);
            }
        }
        awrmVar.a = th4;
        Throwable th6 = (Throwable) awrmVar.a;
        if (th6 == null) {
            return awmy.a;
        }
        throw th6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void publishFrame(Bitmap bitmap) {
        if (this.isClosedFlag) {
            if (bitmap.isRecycled()) {
                return;
            }
            bitmap.recycle();
            return;
        }
        synchronized (this.bitmapLock) {
            if (!this.isClosedFlag) {
                Bitmap bitmap2 = this.pendingBitmap;
                this.pendingBitmap = bitmap;
                if (bitmap2 != null && bitmap2 != bitmap && !bitmap2.isRecycled()) {
                    bitmap2.recycle();
                }
                this.firstFramePublished = true;
                this.firstFrameLatch.countDown();
            } else if (!bitmap.isRecycled()) {
                bitmap.recycle();
            }
        }
        this._frameAvailable.b(awmy.a);
    }

    public static /* synthetic */ void render$default(HardwareRenderBuffer hardwareRenderBuffer, Artboard artboard, StateMachine stateMachine, Fit fit, int i, int i2, Object obj) throws InterruptedException, RiveRenderException {
        if ((i2 & 4) != 0) {
            fit = RenderingDefaults.INSTANCE.defaultFit();
        }
        if ((i2 & 8) != 0) {
            i = 0;
        }
        hardwareRenderBuffer.render(artboard, stateMachine, fit, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reportFrameFailure(final Throwable th) {
        if (this.isClosedFlag) {
            return;
        }
        RiveLog.INSTANCE.getLogger().e(TAG, th, new Function0() { // from class: app.rive.HardwareRenderBuffer$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HardwareRenderBuffer.reportFrameFailure$lambda$0(th);
            }
        });
        this.imageReaderFailure = th;
        this.firstFrameLatch.countDown();
    }

    static final String reportFrameFailure$lambda$0(Throwable th) {
        return true != (th instanceof Error) ? "ImageReader callback failed while publishing hardware frame" : "Fatal error in ImageReader callback while publishing hardware frame";
    }

    private final Throwable runCleanupStep(Throwable th, Function0 function0) {
        try {
            function0.invoke();
            return th;
        } catch (Throwable th2) {
            if (th == null) {
                return th2;
            }
            if (th2 == th) {
                return th;
            }
            avkz.d(th, th2);
            return th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void waitForFirstFrame() throws InterruptedException, RiveRenderException {
        if (this.firstFramePublished) {
            return;
        }
        boolean zAwait = this.firstFrameLatch.await(this.firstFrameTimeoutMillis, TimeUnit.MILLISECONDS);
        Throwable th = this.imageReaderFailure;
        if (th != null) {
            throw new RiveRenderException("Hardware ImageReader failed while acquiring a frame; recreate HardwareRenderBuffer", th);
        }
        if (zAwait && this.firstFramePublished) {
            return;
        }
        throw new RiveRenderException("No hardware image available after render (timed out waiting for ImageReader frame)", null, 2, 0 == true ? 1 : 0);
    }

    @Override // app.rive.core.CheckableAutoCloseable, java.lang.AutoCloseable
    public void close() {
        this.closer.close();
    }

    public final Bitmap consumeLatestBitmap() throws RiveRenderException {
        Bitmap bitmap;
        this.closer.checkOpen();
        Throwable th = this.imageReaderFailure;
        if (th != null) {
            throw new RiveRenderException("Hardware ImageReader failed while acquiring a frame; recreate HardwareRenderBuffer", th);
        }
        synchronized (this.bitmapLock) {
            Bitmap bitmap2 = this.pendingBitmap;
            if (bitmap2 != null) {
                this.pendingBitmap = null;
                Bitmap bitmap3 = this.currentBitmap;
                this.currentBitmap = bitmap2;
                if (bitmap3 != null && bitmap3 != bitmap2 && !bitmap3.isRecycled()) {
                    bitmap3.recycle();
                }
            }
            bitmap = this.currentBitmap;
        }
        return bitmap;
    }

    @Override // app.rive.core.CheckableAutoCloseable
    public boolean getClosed() {
        return this.closer.getClosed();
    }

    public final axah getFrameAvailable() {
        return this.frameAvailable;
    }

    public final int getHeight() {
        return this.height;
    }

    public final RiveSurface getSurface() {
        return this.frameSource.getSurface();
    }

    public final int getWidth() {
        return this.width;
    }

    public final void render(Artboard artboard, StateMachine stateMachine, Fit fit, int i) throws InterruptedException, RiveRenderException {
        artboard.getClass();
        stateMachine.getClass();
        fit.getClass();
        this.closer.checkOpen();
        getSurface().checkOpen$third_party_java_android_libs_rive_rive_android();
        artboard.checkOpen$third_party_java_android_libs_rive_rive_android();
        stateMachine.checkOpen$third_party_java_android_libs_rive_rive_android();
        artboard.requireOwnedBy$third_party_java_android_libs_rive_rive_android(this.riveWorker);
        stateMachine.requireFromArtboard$third_party_java_android_libs_rive_rive_android(artboard);
        this.riveWorker.m424drawOcc3x_Y(artboard.m269getArtboardHandlenSTdbJo(), stateMachine.m318getStateMachineHandlea86gHUU(), getSurface(), fit, i);
        if (this.firstFramePublished) {
            return;
        }
        waitForFirstFrame();
    }

    /* JADX INFO: compiled from: PG */
    public final class Companion {
        private Companion() {
        }

        public static /* synthetic */ HardwareRenderBuffer createForTesting$third_party_java_android_libs_rive_rive_android$default(Companion companion, int i, int i2, CommandQueue commandQueue, HardwareFrameSourceFactory hardwareFrameSourceFactory, int i3, long j, int i4, Object obj) {
            if ((i4 & 16) != 0) {
                i3 = 29;
            }
            if ((i4 & 32) != 0) {
                j = 0;
            }
            return companion.createForTesting$third_party_java_android_libs_rive_rive_android(i, i2, commandQueue, hardwareFrameSourceFactory, i3, j);
        }

        public final HardwareRenderBuffer createForTesting$third_party_java_android_libs_rive_rive_android(int i, int i2, CommandQueue commandQueue, HardwareFrameSourceFactory hardwareFrameSourceFactory, int i3, long j) {
            commandQueue.getClass();
            hardwareFrameSourceFactory.getClass();
            return new HardwareRenderBuffer(i, i2, commandQueue, hardwareFrameSourceFactory, i3, j, null);
        }

        public final boolean isSupported() {
            return Build.VERSION.SDK_INT >= 29;
        }

        public /* synthetic */ Companion(awqx awqxVar) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HardwareRenderBuffer(int i, int i2, CommandQueue commandQueue) {
        this(i, i2, commandQueue, AndroidHardwareFrameSource.Companion, Build.VERSION.SDK_INT, FIRST_FRAME_TIMEOUT_MILLIS);
        commandQueue.getClass();
    }

    public /* synthetic */ HardwareRenderBuffer(int i, int i2, CommandQueue commandQueue, HardwareFrameSourceFactory hardwareFrameSourceFactory, int i3, long j, awqx awqxVar) {
        this(i, i2, commandQueue, hardwareFrameSourceFactory, i3, j);
    }
}
