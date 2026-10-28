package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pyb implements pxk {
    public static final pyb a = new pyb();
    public static final Parcelable.Creator CREATOR = new pyc(1);

    private pyb() {
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
        if (!(obj instanceof pyb)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -436297177;
    }

    public final String toString() {
        return "YouTubeVisitor";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
