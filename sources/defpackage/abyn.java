package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abyn implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aapl(6);
    public final alvf a;
    public final byte[] b;
    public final String c;
    public final long d;
    public final int e;
    public final String f;

    public abyn(Parcel parcel) {
        this.a = (alvf) ((acli) parcel.readParcelable(acli.class.getClassLoader())).a(alvf.a);
        byte[] bArr = new byte[parcel.readInt()];
        this.b = bArr;
        parcel.readByteArray(bArr);
        this.c = typ.c(parcel.readString());
        this.d = parcel.readLong();
        this.e = parcel.readInt();
        this.f = parcel.readString();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(new acli(this.a), 0);
        byte[] bArr = this.b;
        parcel.writeInt(bArr.length);
        parcel.writeByteArray(bArr);
        parcel.writeString(this.c);
        parcel.writeLong(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
    }

    public abyn(alvf alvfVar, byte[] bArr, String str, long j, int i, String str2) {
        this.a = alvfVar;
        this.b = bArr;
        this.c = str;
        this.d = j;
        this.e = i;
        this.f = str2;
    }
}
