package defpackage;

import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class jzg extends gdb implements IInterface {
    public jzg() {
        super("com.google.android.gms.auth.api.internal.IAuthCallbacks");
    }

    @Override // defpackage.gdb
    protected final boolean C(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            gdc.b(parcel);
            throw new UnsupportedOperationException();
        }
        if (i != 2) {
            return false;
        }
        String string = parcel.readString();
        gdc.b(parcel);
        b(string);
        parcel2.writeNoException();
        return true;
    }

    public void b(String str) {
        throw new UnsupportedOperationException();
    }
}
