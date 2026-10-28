package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lpl extends kry {
    public static final Parcelable.Creator CREATOR = new lof(7);
    public final boolean a;
    public final int b;

    public lpl(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.i(parcel, 2, this.a);
        ksy.l(parcel, 3, this.b);
        ksy.h(parcel, iG);
    }
}
