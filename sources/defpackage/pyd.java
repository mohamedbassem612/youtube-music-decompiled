package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pyd implements pxk {
    public static final pyd a = new pyd();
    public static final Parcelable.Creator CREATOR = new pyc(0);

    private pyd() {
    }

    @Override // defpackage.pxk
    public final String a() {
        return "signed_out";
    }

    @Override // defpackage.pxk
    public final /* synthetic */ boolean b() {
        return qnl.Y(this);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pyd)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -1004849924;
    }

    public final String toString() {
        return "Zwieback";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
