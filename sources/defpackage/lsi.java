package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class lsi extends gdb implements IInterface {
    public lsi() {
        super("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
    }

    @Override // defpackage.gdb
    protected final boolean C(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                parcel.readInt();
                gdc.b(parcel);
                return true;
            case 2:
                parcel.readInt();
                gdc.b(parcel);
                return true;
            case 3:
                parcel.readInt();
                gdc.f(parcel);
                gdc.b(parcel);
                return true;
            case 4:
                parcel.readInt();
                gdc.b(parcel);
                return true;
            case 5:
            default:
                return false;
            case 6:
                parcel.readInt();
                gdc.f(parcel);
                gdc.b(parcel);
                return true;
            case 7:
                gdc.b(parcel);
                return true;
            case 8:
                gdc.b(parcel);
                return true;
            case 9:
                gdc.f(parcel);
                gdc.b(parcel);
                return true;
            case 10:
                Status status = (Status) gdc.a(parcel, Status.CREATOR);
                lru lruVar = (lru) gdc.a(parcel, lru.CREATOR);
                gdc.b(parcel);
                b(status, lruVar);
                return true;
            case 11:
                gdc.b(parcel);
                return true;
            case 12:
                gdc.b(parcel);
                return true;
            case 13:
                gdc.b(parcel);
                return true;
            case 14:
                gdc.b(parcel);
                return true;
            case 15:
                gdc.b(parcel);
                return true;
            case 16:
                gdc.b(parcel);
                return true;
            case 17:
                gdc.b(parcel);
                return true;
            case 18:
                parcel.readInt();
                gdc.b(parcel);
                return true;
            case 19:
                gdc.b(parcel);
                return true;
            case 20:
                gdc.b(parcel);
                return true;
            case 21:
                gdc.b(parcel);
                return true;
            case 22:
                gdc.b(parcel);
                return true;
        }
    }

    public void b(Status status, lru lruVar) {
    }
}
