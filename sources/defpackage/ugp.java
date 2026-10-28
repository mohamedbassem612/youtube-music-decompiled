package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ugp extends ugr {
    public static final Parcelable.Creator CREATOR = new pyc(19);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeLong(this.d);
        parcel.writeFloat(this.e);
        parcel.writeInt(this.f);
    }
}
