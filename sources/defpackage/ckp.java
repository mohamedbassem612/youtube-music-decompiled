package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Point;
import androidx.media3.decoder.DecoderInputBuffer;
import app.rive.semantics.SemanticState;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ckp extends cas implements ckq {
    private final Context a;
    private final int b;

    public ckp(Context context) {
        super(new DecoderInputBuffer[1], new ckt[1]);
        this.a = context;
        this.b = -1;
    }

    @Override // defpackage.cas
    protected final /* synthetic */ can a(Throwable th) {
        return new ckr("Unexpected decode error", th);
    }

    @Override // defpackage.cas
    protected final /* bridge */ /* synthetic */ can b(DecoderInputBuffer decoderInputBuffer, caq caqVar, boolean z) {
        ckr ckrVar;
        BitmapFactory.Options options;
        ckt cktVar = (ckt) caqVar;
        ByteBuffer byteBuffer = decoderInputBuffer.data;
        byteBuffer.getClass();
        ahno.O(byteBuffer.hasArray());
        int i = 0;
        ahno.F(byteBuffer.arrayOffset() == 0);
        try {
            int iMax = this.b;
            if (iMax == -1) {
                Context context = this.a;
                if (context != null) {
                    Point pointG = bwp.G(context);
                    int i2 = pointG.x;
                    int i3 = pointG.y;
                    bse bseVar = decoderInputBuffer.format;
                    if (bseVar != null) {
                        int i4 = bseVar.Q;
                        if (i4 != -1) {
                            i2 *= i4;
                        }
                        int i5 = bseVar.R;
                        if (i5 != -1) {
                            i3 *= i5;
                        }
                    }
                    iMax = (Math.max(i2, i3) << 1) - 1;
                } else {
                    iMax = SemanticState.Obscured;
                }
            }
            byte[] bArrArray = byteBuffer.array();
            int iRemaining = byteBuffer.remaining();
            if (iMax != -1) {
                options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeByteArray(bArrArray, 0, iRemaining, options);
                options.inJustDecodeBounds = false;
                options.inSampleSize = 1;
                for (int iMax2 = Math.max(options.outWidth, options.outHeight); iMax2 > iMax; iMax2 /= 2) {
                    options.inSampleSize <<= 1;
                }
            } else {
                options = null;
            }
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrArray, 0, iRemaining, options);
            if (options != null) {
                options.inSampleSize = 1;
            }
            if (bitmapDecodeByteArray == null) {
                throw new bsz("Could not decode image data", new IllegalStateException(), true, 1);
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrArray);
            try {
                bmu bmuVar = new bmu(byteArrayInputStream);
                byteArrayInputStream.close();
                switch (bmuVar.j()) {
                    case 3:
                    case 4:
                        i = 180;
                        break;
                    case 5:
                    case 8:
                        i = 270;
                        break;
                    case 6:
                    case 7:
                        i = 90;
                        break;
                }
                if (i != 0) {
                    Matrix matrix = new Matrix();
                    matrix.postRotate(i);
                    bitmapDecodeByteArray = Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, false);
                }
                cktVar.a = bitmapDecodeByteArray;
                cktVar.timeUs = decoderInputBuffer.timeUs;
                return null;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (bsz e) {
            ckrVar = new ckr("Could not decode image data with BitmapFactory.", e);
            return ckrVar;
        } catch (IOException e2) {
            ckrVar = new ckr(e2);
            return ckrVar;
        }
    }

    @Override // defpackage.cas
    protected final DecoderInputBuffer c() {
        return new DecoderInputBuffer(1);
    }

    @Override // defpackage.cas
    protected final /* synthetic */ caq e() {
        return new ckt(this);
    }

    @Override // defpackage.cam
    public final String getName() {
        return "BitmapFactoryImageDecoder";
    }

    @Override // defpackage.ckq
    public final /* bridge */ /* synthetic */ ckt l() {
        return (ckt) super.dequeueOutputBuffer();
    }
}
