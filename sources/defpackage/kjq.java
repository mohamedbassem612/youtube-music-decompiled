package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class kjq extends gdb implements IInterface {
    public kjq() {
        super("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
    }

    @Override // defpackage.gdb
    protected final boolean C(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                Status status = (Status) gdc.a(parcel, Status.CREATOR);
                gdc.b(parcel);
                c(status);
                return true;
            case 2:
                gdc.b(parcel);
                throw new UnsupportedOperationException();
            case 3:
                parcel.readLong();
                gdc.b(parcel);
                throw new UnsupportedOperationException();
            case 4:
                gdc.b(parcel);
                throw new UnsupportedOperationException();
            case 5:
                parcel.readLong();
                gdc.b(parcel);
                throw new UnsupportedOperationException();
            case 6:
                gdc.b(parcel);
                throw new UnsupportedOperationException();
            case 7:
                gdc.b(parcel);
                throw new UnsupportedOperationException();
            case 8:
                Status status2 = (Status) gdc.a(parcel, Status.CREATOR);
                gdc.b(parcel);
                b(status2);
                return true;
            case 9:
                Status status3 = (Status) gdc.a(parcel, Status.CREATOR);
                gdc.b(parcel);
                d(status3);
                return true;
            default:
                return false;
        }
    }

    public void b(Status status) {
        throw new UnsupportedOperationException();
    }

    public void c(Status status) {
        throw new UnsupportedOperationException();
    }

    public void d(Status status) {
        throw new UnsupportedOperationException();
    }
}
