package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mt implements Parcelable {
    public static final Parcelable.Creator CREATOR = new ax(15);
    public int a;
    public int b;
    public boolean c;

    public mt(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt() == 1;
    }

    public final void a() {
        this.a = -1;
    }

    public final boolean b() {
        return this.a >= 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c ? 1 : 0);
    }

    public mt(mt mtVar) {
        this.a = mtVar.a;
        this.b = mtVar.b;
        this.c = mtVar.c;
    }

    public mt() {
    }
}
