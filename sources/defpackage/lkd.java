package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class lkd extends gdb implements IInterface {
    public lkd() {
        super("com.google.android.gms.mobiledataplan.internal.IMobileDataPlanCallbacks");
    }

    @Override // defpackage.gdb
    protected final boolean C(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                Status status = (Status) gdc.a(parcel, Status.CREATOR);
                ljk ljkVar = (ljk) gdc.a(parcel, ljk.CREATOR);
                kmv kmvVar = (kmv) gdc.a(parcel, kmv.CREATOR);
                gdc.b(parcel);
                b(status, ljkVar, kmvVar);
                return true;
            case 2:
                gdc.b(parcel);
                throw new UnsupportedOperationException();
            case 3:
                gdc.b(parcel);
                throw new UnsupportedOperationException();
            case 4:
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

    public void b(Status status, ljk ljkVar, kmv kmvVar) {
        throw new UnsupportedOperationException();
    }
}
