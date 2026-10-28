package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jxl extends kry {
    public static final Parcelable.Creator CREATOR = new jwx(9);
    final int a;
    final long b;
    final String c;
    public final int d;
    final int e;
    public final String f;

    public jxl(int i, long j, String str, int i2, int i3, String str2) {
        this.a = i;
        this.b = j;
        kro.l(str);
        this.c = str;
        this.d = i2;
        this.e = i3;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jxl)) {
            return false;
        }
        if (obj != this) {
            jxl jxlVar = (jxl) obj;
            if (this.a != jxlVar.a || this.b != jxlVar.b || !Objects.equals(this.c, jxlVar.c) || this.d != jxlVar.d || this.e != jxlVar.e || !Objects.equals(this.f, jxlVar.f)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Long.valueOf(this.b), this.c, Integer.valueOf(this.d), Integer.valueOf(this.e), this.f);
    }

    public final String toString() {
        String str;
        int i = this.d;
        if (i == 1) {
            str = "ADDED";
        } else if (i == 2) {
            str = "REMOVED";
        } else if (i != 3) {
            str = i != 4 ? "UNKNOWN" : "RENAMED_TO";
        } else {
            str = "RENAMED_FROM";
        }
        return "AccountChangeEvent {accountName = " + this.c + ", changeType = " + str + ", changeData = " + this.f + ", eventIndex = " + this.e + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.l(parcel, 1, this.a);
        ksy.m(parcel, 2, this.b);
        ksy.B(parcel, 3, this.c);
        ksy.l(parcel, 4, this.d);
        ksy.l(parcel, 5, this.e);
        ksy.B(parcel, 6, this.f);
        ksy.h(parcel, iG);
    }
}
