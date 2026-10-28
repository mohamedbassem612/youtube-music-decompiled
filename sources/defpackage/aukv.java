package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aukv extends aukm {
    public static final Parcelable.Creator CREATOR = new ahpw(15);
    public int a;
    public int b;
    public float c;
    public float f;

    public aukv(Parcel parcel) {
        a(parcel);
    }

    @Override // defpackage.aukm
    public final void a(Parcel parcel) {
        super.a(parcel);
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readFloat();
        this.f = parcel.readFloat();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.aukm, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeFloat(this.c);
        parcel.writeFloat(this.f);
    }
}
