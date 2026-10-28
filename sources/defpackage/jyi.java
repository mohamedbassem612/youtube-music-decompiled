package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jyi extends kry {
    public static final Parcelable.Creator CREATOR = new jwx(12);
    public final boolean a;
    public final boolean b;

    public jyi(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jyi) {
            jyi jyiVar = (jyi) obj;
            if (this.a == jyiVar.a && this.b == jyiVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a), Boolean.valueOf(this.b));
    }

    public final String toString() {
        return String.format("AppRestrictionState{isRestricted=%b, isAccountHidden=%b}", Boolean.valueOf(this.a), Boolean.valueOf(this.b));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int iG = ksy.g(parcel, 20293);
        ksy.i(parcel, 1, z);
        ksy.i(parcel, 2, this.b);
        ksy.h(parcel, iG);
    }
}
