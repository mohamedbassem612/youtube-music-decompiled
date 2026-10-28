package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kfq extends gda implements kfr {
    public kfq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
    }

    @Override // defpackage.kfr
    public final Bitmap a(Uri uri) {
        Parcel parcelC = c();
        gdc.c(parcelC, uri);
        Parcel parcelD = d(1, parcelC);
        Bitmap bitmap = (Bitmap) gdc.a(parcelD, Bitmap.CREATOR);
        parcelD.recycle();
        return bitmap;
    }
}
