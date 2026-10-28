package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kmx extends kry {
    public static final Parcelable.Creator CREATOR = new fh(14);
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;

    public kmx(int i, int i2, int i3, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kmx)) {
            return false;
        }
        kmx kmxVar = (kmx) obj;
        return this.a == kmxVar.a && this.b == kmxVar.b && this.c == kmxVar.c && this.d == kmxVar.d;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Boolean.valueOf(this.d));
    }

    public final String toString() {
        return "ComplianceOptions{callerProductId=" + this.a + ", dataOwnerProductId=" + this.b + ", processingReason=" + this.c + ", isUserData=" + this.d + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        parcel.writeInt(262145);
        parcel.writeInt(this.a);
        parcel.writeInt(262146);
        parcel.writeInt(this.b);
        parcel.writeInt(262147);
        parcel.writeInt(this.c);
        parcel.writeInt(262148);
        parcel.writeInt(this.d ? 1 : 0);
        ksy.h(parcel, iG);
    }
}
