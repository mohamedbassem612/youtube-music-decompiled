package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class llw extends kry {
    public static final Parcelable.Creator CREATOR = new kwo(9);
    public final byte[] a;

    public llw(byte[] bArr) {
        this.a = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.a;
        int iG = ksy.g(parcel, 20293);
        ksy.q(parcel, 1, bArr);
        ksy.h(parcel, iG);
    }

    public llw(byte[] bArr, byte[] bArr2) {
        this.a = bArr;
    }
}
