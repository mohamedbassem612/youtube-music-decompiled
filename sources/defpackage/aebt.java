package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aebt implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aapl(19);
    public final int a;
    public final xhc b;
    public final xhc c;

    public aebt(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = xhb.b(parcel.readInt());
        this.c = xhb.b(parcel.readInt());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b.a);
        parcel.writeInt(this.c.a);
    }

    public aebt(int i, xhc xhcVar, xhc xhcVar2) {
        this.a = i;
        this.b = xhcVar;
        this.c = xhcVar2;
    }
}
