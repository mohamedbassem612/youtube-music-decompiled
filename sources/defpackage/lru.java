package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lru extends kry {
    public static final Parcelable.Creator CREATOR = new lqu(19);
    byte[] a;

    lru() {
        this(new byte[0]);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.q(parcel, 2, this.a);
        ksy.h(parcel, iG);
    }

    public lru(byte[] bArr) {
        this.a = bArr;
    }
}
