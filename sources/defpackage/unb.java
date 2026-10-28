package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class unb extends unf {
    public static final Parcelable.Creator CREATOR = new uwz(1);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeFloat(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeString(this.h.name());
        audb audbVar = this.i;
        if (audbVar == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(audbVar.name());
        }
        parcel.writeInt(this.j ? 1 : 0);
        uqc uqcVar = this.k;
        if (uqcVar == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            ahng.aE(parcel, uqcVar);
        }
    }
}
