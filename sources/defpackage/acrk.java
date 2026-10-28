package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acrk implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aapl(17);
    public boolean a;
    public String b;
    public acrt c;
    public final acrl d;
    public String e;
    public boolean f;

    public acrk(Parcel parcel) {
        this.a = parcel.readByte() != 0;
        this.b = parcel.readString();
        int i = parcel.readInt();
        if (i < 0 || i >= acrt.values().length) {
            this.c = acrt.SHEDDABLE;
        } else {
            this.c = acrt.values()[i];
        }
        int i2 = parcel.readInt();
        if (i2 < 0 || i2 >= acrl.values().length) {
            this.d = acrl.UNKNOWN;
        } else {
            this.d = acrl.values()[i2];
        }
        this.e = parcel.readString();
        this.f = parcel.readByte() != 0;
    }

    public final boolean a() {
        return !ahno.aa(this.b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.a ? (byte) 1 : (byte) 0);
        parcel.writeString(this.b);
        parcel.writeInt(this.c.ordinal());
        parcel.writeInt(this.d.ordinal());
        parcel.writeString(this.e);
        parcel.writeByte(this.f ? (byte) 1 : (byte) 0);
    }

    public acrk(acrt acrtVar, acrl acrlVar) {
        this.a = false;
        this.b = null;
        this.c = acrtVar;
        this.d = acrlVar;
        this.e = "";
    }
}
