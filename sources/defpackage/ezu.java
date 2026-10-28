package defpackage;

import android.graphics.Bitmap;
import android.os.SystemClock;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ezu implements eub {
    public static final etx a = new etx("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90, etx.a);
    public static final etx b = new etx("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, etx.a);
    private final ewv c;

    public ezu(ewv ewvVar) {
        this.c = ewvVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v7 */
    @Override // defpackage.eth
    public final /* bridge */ /* synthetic */ boolean a(Object obj, File file, ety etyVar) throws Throwable {
        Bitmap bitmap = (Bitmap) ((ewf) obj).c();
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) etyVar.b(b);
        if (compressFormat == null) {
            compressFormat = bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        double d = ffn.a;
        SystemClock.elapsedRealtimeNanos();
        int iIntValue = ((Integer) etyVar.b(a)).intValue();
        OutputStream eufVar = null;
        try {
            try {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        ewv ewvVar = this.c;
                        eufVar = ewvVar != null ? new euf(fileOutputStream, ewvVar) : fileOutputStream;
                        bitmap.compress(compressFormat, iIntValue, eufVar);
                        eufVar.close();
                        this = 1;
                        eufVar.close();
                    } catch (IOException unused) {
                        eufVar = fileOutputStream;
                        this = 0;
                        this = 0;
                        if (eufVar != null) {
                            eufVar.close();
                        }
                        return this;
                    } catch (Throwable th) {
                        th = th;
                        eufVar = fileOutputStream;
                        if (eufVar != null) {
                            try {
                                eufVar.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            } catch (IOException unused3) {
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException unused4) {
        }
        return this;
    }

    @Override // defpackage.eub
    public final int b() {
        return 2;
    }
}
