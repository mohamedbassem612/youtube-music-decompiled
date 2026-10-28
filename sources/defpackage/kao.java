package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kao extends kry {
    public static final Parcelable.Creator CREATOR = new jys(12);
    public int a;

    public kao(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof kao) && this.a == ((kao) obj).a;
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
        return String.format("joinOptions(connectionType=%s)", str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.l(parcel, 2, this.a);
        ksy.h(parcel, iG);
    }

    public kao() {
        throw null;
    }
}
