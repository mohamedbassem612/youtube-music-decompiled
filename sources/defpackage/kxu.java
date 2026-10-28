package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.googlehelp.GoogleHelp;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class kxu extends gdb implements IInterface {
    public kxu() {
        super("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
    }

    @Override // defpackage.gdb
    protected final boolean C(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                GoogleHelp googleHelp = (GoogleHelp) gdc.a(parcel, GoogleHelp.CREATOR);
                gdc.b(parcel);
                d(googleHelp);
                parcel2.writeNoException();
                return true;
            case 2:
                gdc.b(parcel);
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            case 4:
                throw new UnsupportedOperationException();
            case 5:
                throw new UnsupportedOperationException();
            case 6:
                throw new UnsupportedOperationException();
            case 7:
                b();
                return true;
            case 8:
                c();
                return true;
            case 9:
                parcel.readInt();
                gdc.b(parcel);
                throw new UnsupportedOperationException();
            case 10:
                throw new UnsupportedOperationException();
            case 11:
                throw new UnsupportedOperationException();
            case 12:
                throw new UnsupportedOperationException();
            case 13:
                parcel.createByteArray();
                gdc.b(parcel);
                throw new UnsupportedOperationException();
            case 14:
                throw new UnsupportedOperationException();
            case 15:
                parcel.createByteArray();
                gdc.b(parcel);
                throw new UnsupportedOperationException();
            case 16:
                throw new UnsupportedOperationException();
            case 17:
                gdc.b(parcel);
                throw new UnsupportedOperationException();
            case 18:
                parcel.createByteArray();
                gdc.b(parcel);
                throw new UnsupportedOperationException();
            case 19:
                throw new UnsupportedOperationException();
            default:
                return false;
        }
    }

    public void b() {
        throw new UnsupportedOperationException();
    }

    public void c() {
        throw new UnsupportedOperationException();
    }

    public void d(GoogleHelp googleHelp) {
        throw new UnsupportedOperationException();
    }
}
