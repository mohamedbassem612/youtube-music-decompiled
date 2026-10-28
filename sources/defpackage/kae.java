package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kae extends kry {
    public static final Parcelable.Creator CREATOR = new jys(11);
    public final kad a;
    public final kad b;

    public kae(kad kadVar, kad kadVar2) {
        this.a = kadVar;
        this.b = kadVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kae) {
            kae kaeVar = (kae) obj;
            if (khe.g(this.a, kaeVar.a) && khe.g(this.b, kaeVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        kad kadVar = this.a;
        int iG = ksy.g(parcel, 20293);
        ksy.A(parcel, 2, kadVar, i);
        ksy.A(parcel, 3, this.b, i);
        ksy.h(parcel, iG);
    }
}
