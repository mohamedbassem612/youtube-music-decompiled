package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jwz extends kry {
    public static final Parcelable.Creator CREATOR = new jwx(3);
    final String a;
    final Bundle b;
    final Bundle c;
    final Bundle d;

    public jwz(String str, Bundle bundle, Bundle bundle2, Bundle bundle3) {
        this.a = str;
        this.b = bundle;
        this.c = bundle2;
        this.d = bundle3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.B(parcel, 1, this.a);
        ksy.p(parcel, 2, this.b);
        ksy.p(parcel, 3, this.c);
        ksy.p(parcel, 4, this.d);
        ksy.h(parcel, iG);
    }
}
