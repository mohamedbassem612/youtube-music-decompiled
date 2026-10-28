package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adhm implements zsl {
    private final int a;
    private final Bitmap.Config b;

    public adhm() {
        this.a = 0;
        this.b = Bitmap.Config.ARGB_8888;
    }

    @Override // defpackage.zsl
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Bitmap d(byte[] bArr) throws tzn {
        int i;
        Bitmap bitmapDecodeByteArray;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        if (options.outWidth < 0) {
            bitmapDecodeByteArray = null;
        } else {
            int i2 = this.a;
            if (i2 != 0) {
                int i3 = options.outWidth;
                i = 1;
                while (true) {
                    i3 >>= 1;
                    if (i3 < i2) {
                        break;
                    }
                    i <<= 1;
                }
            } else {
                i = 1;
            }
            options.inSampleSize = i;
            options.inJustDecodeBounds = false;
            options.inPreferredConfig = this.b;
            options.inPurgeable = true;
            options.inInputShareable = false;
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        }
        if (bitmapDecodeByteArray != null) {
            return bitmapDecodeByteArray;
        }
        throw new tzn("failed to decode bitmap");
    }

    public adhm(int i, Bitmap.Config config) {
        this.a = i;
        this.b = config;
    }
}
