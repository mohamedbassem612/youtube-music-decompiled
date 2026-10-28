package defpackage;

import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class log extends gdb implements IInterface {
    public log() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // defpackage.gdb
    protected final boolean C(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 3:
                gdc.b(parcel);
                break;
            case 4:
                gdc.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                gdc.b(parcel);
                break;
            case 7:
                gdc.b(parcel);
                break;
            case 8:
                lol lolVar = (lol) gdc.a(parcel, lol.CREATOR);
                gdc.b(parcel);
                c(lolVar);
                break;
            case 9:
                gdc.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }

    public void c(lol lolVar) {
    }
}
