package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public class ahqc extends gdb implements IInterface {
    public ahqc() {
        super("com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks");
    }

    @Override // defpackage.gdb
    protected final boolean C(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            Status status = (Status) gdc.a(parcel, Status.CREATOR);
            ahpv ahpvVar = (ahpv) gdc.a(parcel, ahpv.CREATOR);
            gdc.b(parcel);
            b(status, ahpvVar);
            return true;
        }
        if (i != 2) {
            return false;
        }
        gdc.b(parcel);
        throw new UnsupportedOperationException();
    }

    public void b(Status status, ahpv ahpvVar) {
        throw new UnsupportedOperationException();
    }
}
