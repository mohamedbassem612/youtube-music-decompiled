package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kek extends gda implements kel {
    public kek(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.media.INotificationActionsProvider");
    }

    @Override // defpackage.kel
    public final List a() {
        Parcel parcelD = d(3, c());
        ArrayList arrayListCreateTypedArrayList = parcelD.createTypedArrayList(kes.CREATOR);
        parcelD.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // defpackage.kel
    public final int[] b() {
        Parcel parcelD = d(4, c());
        int[] iArrCreateIntArray = parcelD.createIntArray();
        parcelD.recycle();
        return iArrCreateIntArray;
    }
}
