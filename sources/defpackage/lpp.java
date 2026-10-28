package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lpp extends kry {
    public static final Parcelable.Creator CREATOR = new lof(8);
    public final boolean a;
    public final boolean b;
    public final int c;

    public lpp(boolean z, boolean z2, int i) {
        this.a = z;
        this.b = z2;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.i(parcel, 2, this.a);
        ksy.i(parcel, 3, this.b);
        ksy.l(parcel, 4, this.c);
        ksy.h(parcel, iG);
    }
}
