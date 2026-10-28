package app.rive.runtime.kotlin.core;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import defpackage.awqx;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class RiveRenderImage extends NativeObject {
    public static final Companion Companion = new Companion(null);
    public static final int $stable = NativeObject.$stable;

    public RiveRenderImage(long j) {
        super(j);
    }

    @Override // app.rive.runtime.kotlin.core.NativeObject
    public native void cppDelete(long j);

    /* JADX INFO: compiled from: PG */
    public final class Companion {
        private Companion() {
        }

        private final native long cppFromARGBInts(int[] iArr, int i, int i2, int i3, boolean z);

        private final native long cppFromBitmapCanvas(Bitmap bitmap);

        private final native long cppFromBitmapRive(Bitmap bitmap, boolean z);

        private final native long cppFromRGBABytes(byte[] bArr, int i, int i2, int i3, boolean z);

        public static /* synthetic */ RiveRenderImage fromARGBInts$default(Companion companion, int[] iArr, int i, int i2, RendererType rendererType, boolean z, int i3, Object obj) {
            if ((i3 & 8) != 0) {
                rendererType = Rive.INSTANCE.getDefaultRendererType();
            }
            return companion.fromARGBInts(iArr, i, i2, rendererType, z & ((i3 & 16) == 0));
        }

        public static /* synthetic */ RiveRenderImage fromBitmap$default(Companion companion, Bitmap bitmap, RendererType rendererType, int i, Object obj) {
            if ((i & 2) != 0) {
                rendererType = Rive.INSTANCE.getDefaultRendererType();
            }
            return companion.fromBitmap(bitmap, rendererType);
        }

        public static /* synthetic */ RiveRenderImage fromEncoded$default(Companion companion, byte[] bArr, RendererType rendererType, int i, Object obj) {
            if ((i & 2) != 0) {
                rendererType = Rive.INSTANCE.getDefaultRendererType();
            }
            return companion.fromEncoded(bArr, rendererType);
        }

        public static /* synthetic */ RiveRenderImage fromRGBABytes$default(Companion companion, byte[] bArr, int i, int i2, RendererType rendererType, boolean z, int i3, Object obj) {
            if ((i3 & 8) != 0) {
                rendererType = Rive.INSTANCE.getDefaultRendererType();
            }
            return companion.fromRGBABytes(bArr, i, i2, rendererType, z | (!((i3 & 16) == 0)));
        }

        public static /* synthetic */ RiveRenderImage make$default(Companion companion, byte[] bArr, RendererType rendererType, int i, Object obj) {
            if ((i & 2) != 0) {
                rendererType = Rive.INSTANCE.getDefaultRendererType();
            }
            return companion.make(bArr, rendererType);
        }

        public final RiveRenderImage fromARGBInts(int[] iArr, int i, int i2, RendererType rendererType, boolean z) {
            iArr.getClass();
            rendererType.getClass();
            if (i <= 0 || i2 <= 0) {
                throw new IllegalArgumentException("Width and height must be > 0");
            }
            if (iArr.length != i * i2) {
                throw new IllegalArgumentException("Colors must have size = width * height");
            }
            if (rendererType != RendererType.Canvas || z) {
                return new RiveRenderImage(cppFromARGBInts(iArr, i, i2, rendererType.getValue(), z));
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, i, i2, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.getClass();
            bitmapCreateBitmap.setPremultiplied(true);
            return new RiveRenderImage(cppFromBitmapCanvas(bitmapCreateBitmap));
        }

        public final RiveRenderImage fromBitmap(Bitmap bitmap, RendererType rendererType) {
            bitmap.getClass();
            rendererType.getClass();
            if (bitmap.isRecycled()) {
                throw new IllegalArgumentException("Bitmap must not be recycled");
            }
            Bitmap.Config config = bitmap.getConfig();
            Bitmap.Config config2 = Bitmap.Config.HARDWARE;
            if ((bitmap.getConfig() != Bitmap.Config.ARGB_8888 || config == config2) && (bitmap = bitmap.copy(Bitmap.Config.ARGB_8888, false)) == null) {
                throw new IllegalStateException("Failed to copy bitmap to ARGB_8888");
            }
            return rendererType == RendererType.Rive ? new RiveRenderImage(cppFromBitmapRive(bitmap, bitmap.isPremultiplied())) : new RiveRenderImage(cppFromBitmapCanvas(bitmap));
        }

        public final RiveRenderImage fromEncoded(byte[] bArr, RendererType rendererType) {
            bArr.getClass();
            rendererType.getClass();
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            options.inPremultiplied = true;
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (bitmapDecodeByteArray == null) {
                throw new IllegalArgumentException("Failed to decode image from encoded bytes");
            }
            if (bitmapDecodeByteArray.isPremultiplied() || !bitmapDecodeByteArray.hasAlpha()) {
                return fromBitmap(bitmapDecodeByteArray, rendererType);
            }
            throw new IllegalStateException("Decoded bitmap was not premultiplied");
        }

        public final RiveRenderImage fromRGBABytes(byte[] bArr, int i, int i2, RendererType rendererType, boolean z) {
            bArr.getClass();
            rendererType.getClass();
            if (i <= 0 || i2 <= 0) {
                throw new IllegalArgumentException("Width and height must be > 0");
            }
            if (bArr.length == ((i * i2) << 2)) {
                return new RiveRenderImage(cppFromRGBABytes(bArr, i, i2, rendererType.getValue(), z));
            }
            throw new IllegalArgumentException("Bytes must have size = width * height * 4");
        }

        public final RiveRenderImage make(byte[] bArr, RendererType rendererType) {
            bArr.getClass();
            rendererType.getClass();
            return fromEncoded(bArr, rendererType);
        }

        public /* synthetic */ Companion(awqx awqxVar) {
            this();
        }
    }
}
