package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jzs extends kry {
    public final long b;
    public final long c;
    public final String d;
    public final String e;
    public final long f;
    public static final khn a = new khn("AdBreakStatus", (String) null);
    public static final Parcelable.Creator CREATOR = new jys(6);

    public jzs(long j, long j2, String str, String str2, long j3) {
        this.b = j;
        this.c = j2;
        this.d = str;
        this.e = str2;
        this.f = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jzs) {
            jzs jzsVar = (jzs) obj;
            if (this.b == jzsVar.b && this.c == jzsVar.c && khe.g(this.d, jzsVar.d) && khe.g(this.e, jzsVar.e) && this.f == jzsVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.b), Long.valueOf(this.c), this.d, this.e, Long.valueOf(this.f));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.b;
        int iG = ksy.g(parcel, 20293);
        ksy.m(parcel, 2, j);
        ksy.m(parcel, 3, this.c);
        ksy.B(parcel, 4, this.d);
        ksy.B(parcel, 5, this.e);
        ksy.m(parcel, 6, this.f);
        ksy.h(parcel, iG);
    }
}
