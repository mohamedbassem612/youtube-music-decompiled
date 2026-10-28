package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.FileDescriptor;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fba implements fbb {
    private final List a;
    private final euv b;
    private final ewv c;

    public fba(ParcelFileDescriptor parcelFileDescriptor, List list, ewv ewvVar) {
        this.c = ewvVar;
        this.a = list;
        this.b = new euv(parcelFileDescriptor);
    }

    @Override // defpackage.fbb
    public final int a() {
        return ept.a(this.a, new eto(this.b, this.c, 0));
    }

    @Override // defpackage.fbb
    public final Bitmap b(BitmapFactory.Options options) throws Throwable {
        Bitmap.Config config;
        FileDescriptor fileDescriptor = this.b.a().getFileDescriptor();
        Bitmap bitmapL = null;
        if (Build.VERSION.SDK_INT != 34 || !faw.a(options) || !ept.m(this)) {
            return BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
        }
        gzj.bJ(options.inPreferredConfig == Bitmap.Config.HARDWARE, "");
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        try {
            Bitmap bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
            if (bitmapDecodeFileDescriptor == null) {
                config = Bitmap.Config.HARDWARE;
            } else {
                try {
                    bitmapL = ept.l(bitmapDecodeFileDescriptor);
                    bitmapDecodeFileDescriptor.recycle();
                    config = Bitmap.Config.HARDWARE;
                } catch (Throwable th) {
                    th = th;
                    bitmapL = bitmapDecodeFileDescriptor;
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

    @Override // defpackage.fbb
    public final ImageHeaderParser$ImageType c() {
        return ept.c(this.a, new etm(this.b, this.c));
    }

    @Override // defpackage.fbb
    public final boolean e() {
        return ept.d(this.a, new etp(this.b, this.c, 2));
    }

    @Override // defpackage.fbb
    public final void d() {
    }
}
