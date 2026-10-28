package app.rive;

import android.graphics.Bitmap;
import app.rive.core.CheckableAutoCloseable;
import app.rive.core.CloseOnce;
import app.rive.core.CommandQueue;
import app.rive.core.RenderingDefaults;
import app.rive.core.RiveSurface;
import defpackage.atqp;
import defpackage.awmi;
import defpackage.awmy;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class RenderBuffer implements CheckableAutoCloseable {
    public static final int $stable = 8;
    private final awmi argbScratch$delegate;
    private final CloseOnce closer;
    private final int height;
    private final byte[] pixels;
    private final CommandQueue riveWorker;
    private final RiveSurface surface;
    private final int width;

    public RenderBuffer(int i, int i2, CommandQueue commandQueue) {
        commandQueue.getClass();
        this.width = i;
        this.height = i2;
        this.riveWorker = commandQueue;
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException("RenderBuffer width/height must be > 0");
        }
        this.surface = commandQueue.createImageSurface(i, i2);
        this.closer = new CloseOnce("RenderBuffer", new Function0() { // from class: app.rive.RenderBuffer$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RenderBuffer.closer$lambda$0(this.f$0);
            }
        });
        this.pixels = new byte[(i * i2) << 2];
        this.argbScratch$delegate = atqp.k(3, new Function0() { // from class: app.rive.RenderBuffer$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RenderBuffer.argbScratch_delegate$lambda$0(this.f$0);
            }
        });
    }

    static final int[] argbScratch_delegate$lambda$0(RenderBuffer renderBuffer) {
        return new int[renderBuffer.width * renderBuffer.height];
    }

    static final awmy closer$lambda$0(RenderBuffer renderBuffer) {
        renderBuffer.surface.close();
        return awmy.a;
    }

    private final int[] getArgbScratch() {
        return (int[]) this.argbScratch$delegate.a();
    }

    public static /* synthetic */ RenderBuffer render$default(RenderBuffer renderBuffer, Artboard artboard, StateMachine stateMachine, Fit fit, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            fit = RenderingDefaults.INSTANCE.defaultFit();
        }
        if ((i2 & 8) != 0) {
            i = 0;
        }
        renderBuffer.render(artboard, stateMachine, fit, i);
        return renderBuffer;
    }

    public static /* synthetic */ RenderBuffer snapshot$default(RenderBuffer renderBuffer, Artboard artboard, StateMachine stateMachine, Fit fit, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            fit = RenderingDefaults.INSTANCE.defaultFit();
        }
        if ((i2 & 8) != 0) {
            i = 0;
        }
        renderBuffer.snapshot(artboard, stateMachine, fit, i);
        return renderBuffer;
    }

    @Override // app.rive.core.CheckableAutoCloseable, java.lang.AutoCloseable
    public void close() {
        this.closer.close();
    }

    public final Bitmap copyInto(Bitmap bitmap) {
        bitmap.getClass();
        this.closer.checkOpen();
        if (bitmap.getWidth() != this.width || bitmap.getHeight() != this.height || bitmap.getConfig() != Bitmap.Config.ARGB_8888) {
            throw new IllegalArgumentException("Bitmap must be " + this.width + 'x' + this.height + " ARGB_8888");
        }
        int[] argbScratch = getArgbScratch();
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.pixels;
            if (i >= bArr.length) {
                int i3 = this.width;
                bitmap.setPixels(argbScratch, 0, i3, 0, 0, i3, this.height);
                return bitmap;
            }
            argbScratch[i2] = ((bArr[i + 3] & 255) << 24) | ((bArr[i] & 255) << 16) | ((bArr[i + 1] & 255) << 8) | (bArr[i + 2] & 255);
            i += 4;
            i2++;
        }
    }

    @Override // app.rive.core.CheckableAutoCloseable
    public boolean getClosed() {
        return this.closer.getClosed();
    }

    public final int getHeight() {
        return this.height;
    }

    public final RiveSurface getSurface() {
        return this.surface;
    }

    public final int getWidth() {
        return this.width;
    }

    public final RenderBuffer render(Artboard artboard, StateMachine stateMachine, Fit fit, int i) {
        artboard.getClass();
        stateMachine.getClass();
        fit.getClass();
        this.closer.checkOpen();
        this.surface.checkOpen$third_party_java_android_libs_rive_rive_android();
        artboard.checkOpen$third_party_java_android_libs_rive_rive_android();
        stateMachine.checkOpen$third_party_java_android_libs_rive_rive_android();
        artboard.requireOwnedBy$third_party_java_android_libs_rive_rive_android(this.riveWorker);
        stateMachine.requireFromArtboard$third_party_java_android_libs_rive_rive_android(artboard);
        artboard.getRiveWorker$third_party_java_android_libs_rive_rive_android().m425drawToBufferfS7xHJs(artboard.m269getArtboardHandlenSTdbJo(), stateMachine.m318getStateMachineHandlea86gHUU(), this.surface, this.pixels, this.width, this.height, fit, i);
        return this;
    }

    public final RenderBuffer snapshot(Artboard artboard, StateMachine stateMachine, Fit fit, int i) {
        artboard.getClass();
        stateMachine.getClass();
        fit.getClass();
        render(artboard, stateMachine, fit, i);
        return this;
    }

    public final Bitmap toBitmap() {
        this.closer.checkOpen();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.width, this.height, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.getClass();
        copyInto(bitmapCreateBitmap);
        return bitmapCreateBitmap;
    }
}
