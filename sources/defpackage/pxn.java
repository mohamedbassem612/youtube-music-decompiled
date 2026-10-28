package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pxn implements pxk {
    public static final Parcelable.Creator CREATOR = new lry(20);
    public final String a;
    public final long b;

    public pxn(String str, long j) {
        str.getClass();
        this.a = str;
        this.b = j;
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
        if (this == obj) {
            return true;
        }
        if (obj instanceof pxn) {
            pxn pxnVar = (pxn) obj;
            if (awrc.c(this.a, pxnVar.a) && this.b == pxnVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + a.ak(this.b);
    }

    public final String toString() {
        return "Fitbit(fitbitEncodedId=" + this.a + ", fitbitDecodedId=" + this.b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeLong(this.b);
    }
}
