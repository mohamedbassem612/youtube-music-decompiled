package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class khg extends gdb implements khh {
    public khg() {
        super("com.google.android.gms.cast.internal.IBundleCallback");
    }

    @Override // defpackage.gdb
    protected final boolean C(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) gdc.a(parcel, Bundle.CREATOR);
        gdc.b(parcel);
        b(bundle);
        return true;
    }
}
