package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class khf extends kry {
    public static final Parcelable.Creator CREATOR = new kbc(6);
    public double a;
    public boolean b;
    public int c;
    public jzt d;
    public int e;
    public kae f;
    public double g;

    public khf(double d, boolean z, int i, jzt jztVar, int i2, kae kaeVar, double d2) {
        this.a = d;
        this.b = z;
        this.c = i;
        this.d = jztVar;
        this.e = i2;
        this.f = kaeVar;
        this.g = d2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof khf) {
            khf khfVar = (khf) obj;
            if (this.a == khfVar.a && this.b == khfVar.b && this.c == khfVar.c && khe.g(this.d, khfVar.d) && this.e == khfVar.e) {
                kae kaeVar = this.f;
                if (khe.g(kaeVar, kaeVar) && this.g == khfVar.g) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Double.valueOf(this.a), Boolean.valueOf(this.b), Integer.valueOf(this.c), this.d, Integer.valueOf(this.e), this.f, Double.valueOf(this.g));
    }

    public final String toString() {
        return String.format(Locale.ROOT, "volume=%f", Double.valueOf(this.a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.j(parcel, 2, this.a);
        ksy.i(parcel, 3, this.b);
        ksy.l(parcel, 4, this.c);
        ksy.A(parcel, 5, this.d, i);
        ksy.l(parcel, 6, this.e);
        ksy.A(parcel, 7, this.f, i);
        ksy.j(parcel, 8, this.g);
        ksy.h(parcel, iG);
    }

    public khf() {
        this(Double.NaN, false, -1, null, -1, null, Double.NaN);
    }
}
