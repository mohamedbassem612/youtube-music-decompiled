package app.rive;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.os.HandlerThread;
import app.rive.core.CommandQueue;
import app.rive.core.ImageReaderSurface;
import app.rive.core.RiveSurface;
import defpackage.avkz;
import defpackage.awqx;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class AndroidHardwareFrameSource implements HardwareFrameSource {
    private final ImageReader imageReader;
    private final Handler imageReaderHandler;
    private final HandlerThread imageReaderThread;
    private volatile HardwareFrameSource.Listener listener;
    private final ColorSpace srgbColorSpace;
    private final RiveSurface surface;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    private AndroidHardwareFrameSource(HandlerThread handlerThread, ImageReader imageReader, RiveSurface riveSurface) {
        this.imageReaderThread = handlerThread;
        this.imageReader = imageReader;
        this.surface = riveSurface;
        this.imageReaderHandler = new Handler(handlerThread.getLooper());
        ColorSpace colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        colorSpace.getClass();
        this.srgbColorSpace = colorSpace;
    }

    private final void onImageAvailable(ImageReader imageReader) {
        HardwareFrameSource.Listener listener = this.listener;
        try {
            if (listener != null) {
                Image imageAcquireLatestImage = imageReader.acquireLatestImage();
                if (imageAcquireLatestImage != null) {
                    HardwareBuffer hardwareBuffer = null;
                    try {
                        HardwareBuffer hardwareBuffer2 = imageAcquireLatestImage.getHardwareBuffer();
                        if (hardwareBuffer2 == null) {
                            throw new RiveRenderException("Image did not provide a HardwareBuffer", null, 2, null);
                        }
                        try {
                            Bitmap bitmapWrapHardwareBuffer = Bitmap.wrapHardwareBuffer(hardwareBuffer2, this.srgbColorSpace);
                            if (bitmapWrapHardwareBuffer == null) {
                                throw new RiveRenderException("Failed to wrap HardwareBuffer as Bitmap", null, 2, null);
                            }
                            hardwareBuffer2.close();
                            imageAcquireLatestImage.close();
                            listener.onFrame(bitmapWrapHardwareBuffer);
                            return;
                        } catch (Throwable th) {
                            th = th;
                            hardwareBuffer = hardwareBuffer2;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        if (hardwareBuffer != null) {
                            hardwareBuffer.close();
                        }
                        imageAcquireLatestImage.close();
                        throw th3;
                    }
                }
            }
        } catch (Error e) {
            HardwareFrameSource.Listener listener2 = this.listener;
            if (listener2 != null) {
                listener2.onFailure(e);
            }
            throw e;
        } catch (Exception e2) {
            HardwareFrameSource.Listener listener3 = this.listener;
            if (listener3 != null) {
                listener3.onFailure(e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$onImageAvailable(AndroidHardwareFrameSource androidHardwareFrameSource, ImageReader imageReader) {
        androidHardwareFrameSource.getClass();
        imageReader.getClass();
        androidHardwareFrameSource.onImageAvailable(imageReader);
    }

    @Override // app.rive.HardwareFrameSource
    public RiveSurface getSurface() {
        return this.surface;
    }

    @Override // app.rive.HardwareFrameSource
    public void setListener(HardwareFrameSource.Listener listener) {
        ImageReader.OnImageAvailableListener onImageAvailableListener;
        Handler handler;
        this.listener = listener;
        if (listener == null) {
            handler = null;
            onImageAvailableListener = null;
        } else {
            onImageAvailableListener = new ImageReader.OnImageAvailableListener() { // from class: app.rive.AndroidHardwareFrameSource$$ExternalSyntheticLambda0
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    AndroidHardwareFrameSource.setListener$onImageAvailable(this.f$0, imageReader);
                }
            };
            handler = this.imageReaderHandler;
        }
        this.imageReader.setOnImageAvailableListener(onImageAvailableListener, handler);
    }

    @Override // app.rive.HardwareFrameSource
    public void stop() {
        try {
            setListener(null);
        } finally {
            Companion.stopThread(this.imageReaderThread);
        }
    }

    /* JADX INFO: compiled from: PG */
    public final class Companion implements HardwareFrameSourceFactory {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void stopThread(HandlerThread handlerThread) {
            handlerThread.quitSafely();
            if (Thread.currentThread() != handlerThread) {
                try {
                    handlerThread.join(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v0, types: [awqx] */
        /* JADX WARN: Type inference failed for: r8v1, types: [app.rive.core.RiveSurface] */
        /* JADX WARN: Type inference failed for: r8v4 */
        /* JADX WARN: Type inference failed for: r8v6 */
        @Override // app.rive.HardwareFrameSourceFactory
        public HardwareFrameSource create(int i, int i2, CommandQueue commandQueue) throws Throwable {
            Throwable th;
            ImageReaderSurface imageReaderSurface;
            ImageReader imageReader;
            commandQueue.getClass();
            HandlerThread handlerThread = new HandlerThread("Rive/ImageReader");
            handlerThread.start();
            ?? r8 = 0;
            RiveSurface riveSurface = null;
            r8 = 0;
            try {
                ImageReader imageReaderNewInstance = ImageReader.newInstance(i, i2, 1, 2, 768L);
                imageReaderNewInstance.getClass();
                try {
                    imageReaderSurface = new ImageReaderSurface(imageReaderNewInstance);
                    try {
                        RiveSurface riveSurfaceCreateRiveSurface = commandQueue.createRiveSurface(imageReaderSurface);
                        try {
                            return new AndroidHardwareFrameSource(handlerThread, imageReaderNewInstance, riveSurfaceCreateRiveSurface, r8);
                        } catch (Throwable th2) {
                            th = th2;
                            riveSurface = riveSurfaceCreateRiveSurface;
                            imageReader = imageReaderNewInstance;
                            th = th;
                            r8 = riveSurface;
                            try {
                                if (r8 != 0) {
                                    r8.close();
                                } else {
                                    if (imageReaderSurface == null) {
                                        if (imageReader != null) {
                                            imageReader.close();
                                        }
                                        stopThread(handlerThread);
                                        throw th;
                                    }
                                    imageReaderSurface.close();
                                }
                            } catch (Throwable th3) {
                                avkz.d(th, th3);
                            }
                            stopThread(handlerThread);
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } catch (Throwable th5) {
                    imageReader = imageReaderNewInstance;
                    th = th5;
                    imageReaderSurface = null;
                }
            } catch (Throwable th6) {
                th = th6;
                imageReaderSurface = null;
                imageReader = null;
            }
        }

        public /* synthetic */ Companion(awqx awqxVar) {
            this();
        }
    }

    public /* synthetic */ AndroidHardwareFrameSource(HandlerThread handlerThread, ImageReader imageReader, RiveSurface riveSurface, awqx awqxVar) {
        this(handlerThread, imageReader, riveSurface);
    }
}
