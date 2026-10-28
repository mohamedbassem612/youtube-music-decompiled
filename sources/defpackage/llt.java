package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class llt extends gda implements IInterface {
    public llt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.phenotype.internal.IPhenotypeService");
    }

    public final void a(lls llsVar, String str) {
        Parcel parcelC = c();
        gdc.e(parcelC, llsVar);
        parcelC.writeString(str);
        e(5, parcelC);
    }
}
