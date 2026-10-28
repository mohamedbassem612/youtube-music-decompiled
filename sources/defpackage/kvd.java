package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kvd extends gda implements IInterface {
    public kvd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int a() {
        Parcel parcelD = d(6, c());
        int i = parcelD.readInt();
        parcelD.recycle();
        return i;
    }
}
