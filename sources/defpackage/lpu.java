package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class lpu extends gdb implements IInterface {
    public lpu() {
        super("com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks");
    }

    @Override // defpackage.gdb
    protected final boolean C(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                Status status = (Status) gdc.a(parcel, Status.CREATOR);
                lpt lptVar = (lpt) gdc.a(parcel, lpt.CREATOR);
                gdc.b(parcel);
                b(status, lptVar);
                return true;
            case 3:
                gdc.b(parcel);
                throw new IllegalStateException("Not implemented.");
            case 4:
                gdc.b(parcel);
                throw new IllegalStateException("Not implemented.");
            case 5:
                Status status2 = (Status) gdc.a(parcel, Status.CREATOR);
                gdc.b(parcel);
                c(status2);
                return true;
            case 6:
                parcel.createStringArrayList();
                gdc.b(parcel);
                throw new IllegalStateException("Not implemented.");
            case 7:
                gdc.b(parcel);
                throw new IllegalStateException("Not implemented.");
            case 8:
                gdc.f(parcel);
                gdc.b(parcel);
                throw new IllegalStateException("Not implemented.");
            case 9:
                gdc.b(parcel);
                throw new IllegalStateException("Not implemented");
            case 10:
                gdc.b(parcel);
                throw new IllegalStateException("Not implemented");
            case 11:
                gdc.b(parcel);
                throw new IllegalStateException("Not implemented.");
            case 12:
                gdc.b(parcel);
                throw new IllegalStateException("Not implemented.");
            case 13:
                gdc.b(parcel);
                throw new IllegalStateException("Not implemented.");
            case 14:
                gdc.b(parcel);
                throw new IllegalStateException("Not implemented.");
            case 15:
                gdc.b(parcel);
                throw new IllegalStateException("Not implemented.");
            default:
                return false;
        }
    }

    public void b(Status status, lpt lptVar) {
        throw new IllegalStateException("Not implemented.");
    }

    public void c(Status status) {
        throw new IllegalStateException("Not implemented.");
    }
}
