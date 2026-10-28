package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ijs extends hej {
    public static final Parcelable.Creator CREATOR = new vj(18);

    public ijs(Parcel parcel) {
        byte[] bArr = new byte[parcel.readInt()];
        parcel.readByteArray(bArr);
        ajwo ajwoVarB = vxg.b(bArr);
        j(ajwoVarB);
        this.f = ajwoVarB;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] byteArray = this.f.toByteArray();
        int length = byteArray.length;
        parcel.writeInt(length);
        parcel.writeByteArray(byteArray, 0, length);
    }

    public ijs(ajwo ajwoVar) {
        j(ajwoVar);
    }
}
