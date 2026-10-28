package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kab extends kry {
    public static final Parcelable.Creator CREATOR = new jys(8);
    public final int a;

    public kab(int i) {
        if (i != 0 && i != 2) {
            throw new IllegalArgumentException("Invalid value for connectionType");
        }
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof kab) && this.a == ((kab) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a));
    }

    public final String toString() {
        String str;
        int i = this.a;
        if (i != 0) {
            str = i != 2 ? "UNKNOWN" : "INVISIBLE";
        } else {
            str = "STRONG";
        }
        return String.format("connectOptions(connectionType=%s)", str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iG = ksy.g(parcel, 20293);
        ksy.l(parcel, 1, i2);
        ksy.h(parcel, iG);
    }

    public kab() {
        this(0);
    }
}
