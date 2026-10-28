package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kbm extends kry {
    public static final Parcelable.Creator CREATOR = new fh(8);
    private final int a;

    public kbm(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        parcel.writeInt(262146);
        parcel.writeInt(this.a);
        ksy.h(parcel, iG);
    }
}
