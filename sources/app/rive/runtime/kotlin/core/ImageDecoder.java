package app.rive.runtime.kotlin.core;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ImageDecoder {
    public static final int $stable = 0;
    public static final ImageDecoder INSTANCE = new ImageDecoder();

    private ImageDecoder() {
    }

    public static final int[] decodeToBitmap(byte[] bArr) {
        bArr.getClass();
        try {
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, new BitmapFactory.Options());
            int width = bitmapDecodeByteArray.getWidth();
            int height = bitmapDecodeByteArray.getHeight();
            int[] iArr = new int[(width * height) + 2];
            iArr[0] = width;
            iArr[1] = height;
            bitmapDecodeByteArray.getPixels(iArr, 2, width, 0, 0, width, height);
            return iArr;
        } catch (Exception unused) {
            return new int[0];
        }
    }
}
