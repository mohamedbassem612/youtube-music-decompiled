package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lnl extends kry {
    public static final Parcelable.Creator CREATOR = new kvu(15);
    public final int a;
    public final byte[] b;

    public lnl(int i, byte[] bArr) {
        this.a = i;
        this.b = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.l(parcel, 1, this.a);
        ksy.q(parcel, 5, this.b);
        ksy.h(parcel, iG);
    }
}
