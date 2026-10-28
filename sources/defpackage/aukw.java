package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aukw extends aukm {
    public static final Parcelable.Creator CREATOR = new ahpw(16);
    public int a = 0;

    public aukw(Parcel parcel) {
        a(parcel);
    }

    @Override // defpackage.aukm
    public final void a(Parcel parcel) {
        int iDataPosition = parcel.dataPosition() + parcel.readInt();
        super.a(parcel);
        this.a = parcel.readInt();
        parcel.setDataPosition(iDataPosition);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.aukm, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(20);
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
        if (parcel.dataPosition() - iDataPosition != 20) {
            throw new IllegalStateException("Parcelable implemented incorrectly, getByteSize() must return the correct size for each ControllerEvent subclass.");
        }
    }

    public aukw() {
    }
}
