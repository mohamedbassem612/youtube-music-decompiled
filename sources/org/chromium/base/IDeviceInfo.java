package org.chromium.base;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ahpw;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public class IDeviceInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new ahpw(17);
    public String a;
    public boolean b = false;
    public boolean c = false;
    public boolean d = false;
    public boolean e = false;
    public int f = 0;
    public boolean g = false;
    public boolean h = false;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(0);
        parcel.writeString(this.a);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        int iDataPosition2 = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition);
        parcel.writeInt(iDataPosition2 - iDataPosition);
        parcel.setDataPosition(iDataPosition2);
    }
}
