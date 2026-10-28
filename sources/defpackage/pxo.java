package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pxo implements pxk {
    public static final Parcelable.Creator CREATOR = new kwo(10);
    public final String a;

    public pxo(String str) {
        str.getClass();
        this.a = str;
    }

    @Override // defpackage.pxk
    public final String a() {
        return this.a;
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
        if (this != obj) {
            return (obj instanceof pxo) && awrc.c(this.a, ((pxo) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Gaia(accountName=" + this.a + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
    }
}
