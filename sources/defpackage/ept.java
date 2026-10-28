package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Gainmap;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class ept {
    protected /* synthetic */ ept() {
    }

    public static int a(List list, etr etrVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int iA = etrVar.a((etj) list.get(i));
            if (iA != -1) {
                return iA;
            }
        }
        return -1;
    }

    public static ImageHeaderParser$ImageType b(List list, ByteBuffer byteBuffer) {
        return byteBuffer == null ? ImageHeaderParser$ImageType.UNKNOWN : c(list, new etl(byteBuffer));
    }

    public static ImageHeaderParser$ImageType c(List list, ets etsVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ImageHeaderParser$ImageType imageHeaderParser$ImageTypeA = etsVar.a((etj) list.get(i));
            if (imageHeaderParser$ImageTypeA != ImageHeaderParser$ImageType.UNKNOWN) {
                return imageHeaderParser$ImageTypeA;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static boolean d(List list, etq etqVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (etqVar.a((etj) list.get(i))) {
                return true;
            }
        }
        return false;
    }

    public static int e(List list, InputStream inputStream, ewv ewvVar) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new fbg(inputStream, ewvVar);
        }
        inputStream.mark(5242880);
        return a(list, new etn(inputStream, ewvVar));
    }

    public static int f(List list, ByteBuffer byteBuffer, ewv ewvVar) {
        if (byteBuffer == null) {
            return -1;
        }
        return a(list, new eto(byteBuffer, ewvVar, 1));
    }

    public static ImageHeaderParser$ImageType g(List list, InputStream inputStream, ewv ewvVar) {
        if (inputStream == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new fbg(inputStream, ewvVar);
        }
        inputStream.mark(5242880);
        return c(list, new etk(inputStream));
    }

    public static /* synthetic */ String h(int i) {
        if (i == 1) {
            return "LOCAL";
        }
        if (i == 2) {
            return "REMOTE";
        }
        if (i == 3) {
            return "DATA_DISK_CACHE";
        }
        if (i != 4) {
            return i != 5 ? "null" : "MEMORY_CACHE";
        }
        return "RESOURCE_DISK_CACHE";
    }

    public static void i(Context context, erj erjVar, jqs jqsVar, List list, fdn fdnVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fdp fdpVar = (fdp) it.next();
            try {
                fdpVar.e(context, erjVar, jqsVar);
            } catch (AbstractMethodError e) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ".concat(String.valueOf(fdpVar.getClass().getName())), e);
            }
        }
        if (fdnVar != null) {
            fdnVar.e(context, erjVar, jqsVar);
        }
    }

    public static Bitmap j(byte[] bArr, int i, int i2, BitmapFactory.Options options, fbb fbbVar) throws Throwable {
        Bitmap.Config config;
        if (Build.VERSION.SDK_INT != 34 || !faw.a(options) || !m(fbbVar)) {
            return BitmapFactory.decodeByteArray(bArr, i, i2, options);
        }
        gzj.bJ(options.inPreferredConfig == Bitmap.Config.HARDWARE, "");
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        Bitmap bitmapL = null;
        try {
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, i, i2, options);
            if (bitmapDecodeByteArray == null) {
                config = Bitmap.Config.HARDWARE;
            } else {
                try {
                    bitmapL = l(bitmapDecodeByteArray);
                    bitmapDecodeByteArray.recycle();
                    config = Bitmap.Config.HARDWARE;
                } catch (Throwable th) {
                    th = th;
                    bitmapL = bitmapDecodeByteArray;
                    if (bitmapL != null) {
                        bitmapL.recycle();
                    }
                    options.inPreferredConfig = Bitmap.Config.HARDWARE;
                    throw th;
                }
            }
            options.inPreferredConfig = config;
            return bitmapL;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static Bitmap k(InputStream inputStream, BitmapFactory.Options options, fbb fbbVar) throws Throwable {
        Bitmap.Config config;
        Bitmap bitmapL = null;
        if (Build.VERSION.SDK_INT != 34 || !faw.a(options) || !m(fbbVar)) {
            return BitmapFactory.decodeStream(inputStream, null, options);
        }
        if (options.inPreferredConfig != Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("");
        }
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        try {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStream, null, options);
            if (bitmapDecodeStream == null) {
                config = Bitmap.Config.HARDWARE;
            } else {
                try {
                    bitmapL = l(bitmapDecodeStream);
                    bitmapDecodeStream.recycle();
                    config = Bitmap.Config.HARDWARE;
                } catch (Throwable th) {
                    th = th;
                    bitmapL = bitmapDecodeStream;
                    if (bitmapL != null) {
                        bitmapL.recycle();
                    }
                    options.inPreferredConfig = Bitmap.Config.HARDWARE;
                    throw th;
                }
            }
            options.inPreferredConfig = config;
            return bitmapL;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static Bitmap l(Bitmap bitmap) {
        Gainmap gainmap = bitmap.getGainmap();
        if (gainmap != null && gainmap.getGainmapContents().getConfig() == Bitmap.Config.ALPHA_8) {
            ColorMatrixColorFilter colorMatrixColorFilter = fau.a;
            Bitmap gainmapContents = gainmap.getGainmapContents();
            if (gainmapContents.getConfig() == Bitmap.Config.ALPHA_8) {
                gzj.bJ(gainmapContents.getConfig() == Bitmap.Config.ALPHA_8, "");
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(gainmapContents.getWidth(), gainmapContents.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                Paint paint = new Paint();
                paint.setColorFilter(fau.a);
                canvas.drawBitmap(gainmapContents, 0.0f, 0.0f, paint);
                canvas.setBitmap(null);
                Gainmap gainmap2 = new Gainmap(bitmapCreateBitmap);
                float[] ratioMin = gainmap.getRatioMin();
                gainmap2.setRatioMin(ratioMin[0], ratioMin[1], ratioMin[2]);
                float[] ratioMax = gainmap.getRatioMax();
                gainmap2.setRatioMax(ratioMax[0], ratioMax[1], ratioMax[2]);
                float[] gamma = gainmap.getGamma();
                gainmap2.setGamma(gamma[0], gamma[1], gamma[2]);
                float[] epsilonSdr = gainmap.getEpsilonSdr();
                gainmap2.setEpsilonSdr(epsilonSdr[0], epsilonSdr[1], epsilonSdr[2]);
                float[] epsilonHdr = gainmap.getEpsilonHdr();
                gainmap2.setEpsilonHdr(epsilonHdr[0], epsilonHdr[1], epsilonHdr[2]);
                gainmap2.setDisplayRatioForFullHdr(gainmap.getDisplayRatioForFullHdr());
                gainmap2.setMinDisplayRatioForHdrTransition(gainmap.getMinDisplayRatioForHdrTransition());
                gainmap = gainmap2;
            }
            bitmap.setGainmap(gainmap);
        }
        return bitmap.copy(Bitmap.Config.HARDWARE, false);
    }

    public static boolean m(fbb fbbVar) {
        try {
            return fbbVar.e();
        } catch (IOException unused) {
            return false;
        }
    }

    public static /* synthetic */ String n(int i) {
        if (i == 1) {
            return "INITIALIZE";
        }
        if (i == 2) {
            return "RESOURCE_CACHE";
        }
        if (i == 3) {
            return "DATA_CACHE";
        }
        if (i != 4) {
            return i != 5 ? "FINISHED" : "ENCODE";
        }
        return "SOURCE";
    }

    public static AssetFileDescriptor o(Uri uri, ContentResolver contentResolver) {
        return MediaStore.openAssetFileDescriptor(contentResolver, uri, "r", null);
    }

    public static boolean p() {
        return Build.VERSION.SDK_INT >= 30 && SdkExtensions.getExtensionVersion(30) >= 17;
    }

    public static boolean q(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static boolean r(int i, int i2) {
        return i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= 384;
    }

    public static boolean s(Uri uri) {
        return uri.getPathSegments().contains("video");
    }

    public ept(byte[] bArr) {
    }
}
