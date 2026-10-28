package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jyf extends kry {
    public static final Parcelable.Creator CREATOR = new jwx(13);
    public final jyp a;
    public final jyi b;

    public jyf(jyp jypVar, jyi jyiVar) {
        this.a = jypVar;
        this.b = jyiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jyf) {
            jyf jyfVar = (jyf) obj;
            if (this.a.equals(jyfVar.a) && this.b.equals(jyfVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        return String.format("AccountWithAppRestrictionState{googleAccount=%s, appRestrictionState=%s}", this.a, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        jyp jypVar = this.a;
        int iG = ksy.g(parcel, 20293);
        ksy.A(parcel, 1, jypVar, i);
        ksy.A(parcel, 2, this.b, i);
        ksy.h(parcel, iG);
    }
}
