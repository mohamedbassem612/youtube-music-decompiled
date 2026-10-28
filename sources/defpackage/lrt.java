package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lrt extends kry {
    public static final Parcelable.Creator CREATOR = new lqu(18);
    final lrx a;
    final boolean b;
    final int c;

    public lrt(lrx lrxVar, boolean z, int i) {
        this.a = lrxVar;
        this.b = z;
        this.c = i;
        if (lrxVar == null) {
            throw new NullPointerException("WalletCustomTheme is required");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        lrx lrxVar = this.a;
        int iG = ksy.g(parcel, 20293);
        ksy.A(parcel, 2, lrxVar, i);
        ksy.i(parcel, 3, this.b);
        ksy.l(parcel, 4, this.c);
        ksy.h(parcel, iG);
    }
}
