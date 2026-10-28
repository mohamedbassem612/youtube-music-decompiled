package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lcq extends gda implements lcs {
    public lcq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IUploadBatchesCallback");
    }

    @Override // defpackage.lcs
    public final void a(lfn lfnVar) {
        Parcel parcelC = c();
        gdc.c(parcelC, lfnVar);
        f(2, parcelC);
    }
}
