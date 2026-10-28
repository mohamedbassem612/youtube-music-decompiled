package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aavf implements Parcelable {
    public static final Parcelable.Creator CREATOR = new kwo(17);
    public boolean a;

    public aavf(Parcel parcel) {
        this.a = true;
        this.a = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.a ? (byte) 1 : (byte) 0);
    }

    public aavf() {
        this.a = true;
    }
}
