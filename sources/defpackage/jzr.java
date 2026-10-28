package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jzr extends kry {
    public static final Parcelable.Creator CREATOR = new jys(5);
    public final long a;
    public final String b;
    public final long c;
    public final boolean d;
    public final String[] e;
    public final boolean f;
    public final boolean g;

    public jzr(long j, String str, long j2, boolean z, String[] strArr, boolean z2, boolean z3) {
        this.a = j;
        this.b = str;
        this.c = j2;
        this.d = z;
        this.e = strArr;
        this.f = z2;
        this.g = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jzr) {
            jzr jzrVar = (jzr) obj;
            if (khe.g(this.b, jzrVar.b) && this.a == jzrVar.a && this.c == jzrVar.c && this.d == jzrVar.d && Arrays.equals(this.e, jzrVar.e) && this.f == jzrVar.f && this.g == jzrVar.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.a;
        int iG = ksy.g(parcel, 20293);
        ksy.m(parcel, 2, j);
        ksy.B(parcel, 3, this.b);
        ksy.m(parcel, 4, this.c);
        ksy.i(parcel, 5, this.d);
        ksy.C(parcel, 6, this.e);
        ksy.i(parcel, 7, this.f);
        ksy.i(parcel, 8, this.g);
        ksy.h(parcel, iG);
    }
}
