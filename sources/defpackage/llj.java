package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class llj extends kry implements Comparable {
    public static final Parcelable.Creator CREATOR = new kvu(10);
    public final int a;
    public final int b;

    public llj(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(llj lljVar) {
        int i = this.a;
        int i2 = lljVar.a;
        if (i < i2) {
            return -1;
        }
        if (i <= i2) {
            int i3 = this.b;
            int i4 = lljVar.b;
            if (i3 < i4) {
                return -1;
            }
            if (i3 <= i4) {
                return 0;
            }
        }
        return 1;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof llj) && compareTo((llj) obj) == 0;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "GenericDimension(" + this.a + ", " + this.b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.l(parcel, 1, this.a);
        ksy.l(parcel, 2, this.b);
        ksy.h(parcel, iG);
    }
}
