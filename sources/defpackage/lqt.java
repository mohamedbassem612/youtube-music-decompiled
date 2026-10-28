package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lqt extends kry {
    public static final Parcelable.Creator CREATOR = new lqu(0);
    public int a;
    public boolean b;

    public lqt(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lqt) {
            lqt lqtVar = (lqt) obj;
            if (this.a == lqtVar.a && Objects.equals(Boolean.valueOf(this.b), Boolean.valueOf(lqtVar.b))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Boolean.valueOf(this.b));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.l(parcel, 2, this.a);
        ksy.i(parcel, 3, this.b);
        ksy.h(parcel, iG);
    }

    public lqt() {
    }
}
