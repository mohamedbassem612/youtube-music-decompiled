package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class lkl extends gdb implements IInterface {
    public lkl() {
        super("com.google.android.gms.mobstore.IMobStoreFileCallbacks");
    }

    @Override // defpackage.gdb
    protected final boolean C(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            Status status = (Status) gdc.a(parcel, Status.CREATOR);
            lkt lktVar = (lkt) gdc.a(parcel, lkt.CREATOR);
            kmv kmvVar = (kmv) gdc.a(parcel, kmv.CREATOR);
            gdc.b(parcel);
            c(status, lktVar, kmvVar);
            return true;
        }
        if (i == 2) {
            Status status2 = (Status) gdc.a(parcel, Status.CREATOR);
            kmv kmvVar2 = (kmv) gdc.a(parcel, kmv.CREATOR);
            gdc.b(parcel);
            b(status2, kmvVar2);
            return true;
        }
        if (i != 3) {
            return false;
        }
        Status status3 = (Status) gdc.a(parcel, Status.CREATOR);
        kmv kmvVar3 = (kmv) gdc.a(parcel, kmv.CREATOR);
        gdc.b(parcel);
        d(status3, kmvVar3);
        return true;
    }

    public void b(Status status, kmv kmvVar) {
        throw new UnsupportedOperationException();
    }

    public void c(Status status, lkt lktVar, kmv kmvVar) {
        throw new UnsupportedOperationException();
    }

    public void d(Status status, kmv kmvVar) {
        throw new UnsupportedOperationException();
    }
}
