package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class jyv extends gdb implements IInterface {
    public jyv() {
        super("com.google.android.gms.auth.aang.internal.IGoogleAuthAangCallbacks");
    }

    @Override // defpackage.gdb
    protected final boolean C(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                Status status = (Status) gdc.a(parcel, Status.CREATOR);
                jyl jylVar = (jyl) gdc.a(parcel, jyl.CREATOR);
                gdc.b(parcel);
                b(status, jylVar);
                return true;
            case 2:
                Status status2 = (Status) gdc.a(parcel, Status.CREATOR);
                jyo jyoVar = (jyo) gdc.a(parcel, jyo.CREATOR);
                gdc.b(parcel);
                c(status2, jyoVar);
                return true;
            case 3:
                parcel.readInt();
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
                Status status3 = (Status) gdc.a(parcel, Status.CREATOR);
                jyo jyoVar2 = (jyo) gdc.a(parcel, jyo.CREATOR);
                gdc.b(parcel);
                d(status3, jyoVar2);
                return true;
            case 8:
                gdc.b(parcel);
                throw new UnsupportedOperationException();
            default:
                return false;
        }
    }

    public void b(Status status, jyl jylVar) {
        throw new UnsupportedOperationException();
    }

    public void c(Status status, jyo jyoVar) {
        throw new UnsupportedOperationException();
    }

    public void d(Status status, jyo jyoVar) {
        throw new UnsupportedOperationException();
    }
}
