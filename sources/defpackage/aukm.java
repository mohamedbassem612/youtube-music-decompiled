package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public abstract class aukm implements Parcelable {
    public long d;
    public int e = 0;

    public void a(Parcel parcel) {
        this.d = parcel.readLong();
        this.e = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.d);
        parcel.writeInt(this.e);
    }
}
