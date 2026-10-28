package app.rive.core;

import android.media.ImageReader;
import android.view.Surface;
import defpackage.awmy;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ImageReaderSurface implements CloseableSurface {
    public static final int $stable = 8;
    private final CloseOnce closer;
    private final int height;
    private final ImageReader imageReader;
    private final boolean resizable;
    private final Surface surface;
    private final int width;

    public ImageReaderSurface(ImageReader imageReader) {
        imageReader.getClass();
        this.imageReader = imageReader;
        Surface surface = imageReader.getSurface();
        surface.getClass();
        this.surface = surface;
        this.width = imageReader.getWidth();
        this.height = imageReader.getHeight();
        if (getWidth() <= 0 || getHeight() <= 0) {
            throw new IllegalArgumentException("ImageReaderSurface requires a positive width and height.");
        }
        this.closer = new CloseOnce("ImageReaderSurface", new Function0() { // from class: app.rive.core.ImageReaderSurface$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ImageReaderSurface.closer$lambda$0(this.f$0);
            }
        });
    }

    static final awmy closer$lambda$0(ImageReaderSurface imageReaderSurface) {
        imageReaderSurface.imageReader.close();
        return awmy.a;
    }

    @Override // app.rive.core.CloseableSurface, java.lang.AutoCloseable
    public void close() {
        this.closer.close();
    }

    @Override // app.rive.core.CloseableSurface
    public int getHeight() {
        return this.height;
    }

    @Override // app.rive.core.CloseableSurface
    public boolean getResizable() {
        return this.resizable;
    }

    @Override // app.rive.core.CloseableSurface
    public Surface getSurface() {
        return this.surface;
    }

    @Override // app.rive.core.CloseableSurface
    public int getWidth() {
        return this.width;
    }
}
