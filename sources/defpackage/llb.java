package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class llb extends kry {
    public static final Parcelable.Creator CREATOR = new kvu(6);
    public final byte[] a;

    public llb(byte[] bArr) {
        this.a = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.q(parcel, 2, this.a);
        ksy.h(parcel, iG);
    }
}
