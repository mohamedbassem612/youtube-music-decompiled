package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class lmp extends gdb implements IInterface {
    public lmp() {
        super("com.google.android.gms.pseudonymous.internal.IPseudonymousIdCallbacks");
    }

    @Override // defpackage.gdb
    protected final boolean C(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                Status status = (Status) gdc.a(parcel, Status.CREATOR);
                lmn lmnVar = (lmn) gdc.a(parcel, lmn.CREATOR);
                kmv kmvVar = (kmv) gdc.a(parcel, kmv.CREATOR);
                gdc.b(parcel);
                b(status, lmnVar, kmvVar);
                return true;
            case 2:
                gdc.b(parcel);
                throw new UnsupportedOperationException();
            case 3:
                parcel.readLong();
                gdc.b(parcel);
                throw new UnsupportedOperationException();
            case 4:
                parcel.createTypedArrayList(lmo.CREATOR);
                gdc.b(parcel);
                throw new UnsupportedOperationException();
            case 5:
                gdc.b(parcel);
                throw new UnsupportedOperationException();
            case 6:
                gdc.b(parcel);
                throw new UnsupportedOperationException();
            case 7:
                gdc.b(parcel);
                throw new UnsupportedOperationException();
            default:
                return false;
        }
    }

    public void b(Status status, lmn lmnVar, kmv kmvVar) {
        throw null;
    }
}
