package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kbl extends kry {
    public static final Parcelable.Creator CREATOR = new fh(7);
    private final boolean a;

    public kbl(boolean z) {
        this.a = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        parcel.writeInt(262146);
        parcel.writeInt(this.a ? 1 : 0);
        ksy.h(parcel, iG);
    }
}
