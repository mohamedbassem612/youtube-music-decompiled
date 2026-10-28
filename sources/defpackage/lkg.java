package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lkg extends kry {
    public static final Parcelable.Creator CREATOR = new kvs(19);
    public int a;

    public lkg(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lkg) {
            return Objects.equals(Integer.valueOf(this.a), Integer.valueOf(((lkg) obj).a));
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.l(parcel, 1, this.a);
        ksy.h(parcel, iG);
    }

    private lkg() {
    }
}
