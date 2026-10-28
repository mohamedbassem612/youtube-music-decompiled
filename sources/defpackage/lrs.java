package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lrs extends kry {
    public static final Parcelable.Creator CREATOR = new lqu(17);
    byte[] a;

    lrs() {
        this(new byte[0]);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.q(parcel, 2, this.a);
        ksy.h(parcel, iG);
    }

    public lrs(byte[] bArr) {
        this.a = bArr;
    }
}
