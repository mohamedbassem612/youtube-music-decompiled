package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kjr extends gda implements IInterface {
    public kjr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.clearcut.internal.IClearcutLoggerService");
    }

    public final void a(kjq kjqVar, kjg kjgVar) {
        Parcel parcelC = c();
        gdc.e(parcelC, kjqVar);
        gdc.c(parcelC, kjgVar);
        f(8, parcelC);
    }
}
