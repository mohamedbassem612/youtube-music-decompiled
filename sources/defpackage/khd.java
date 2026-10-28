package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class khd extends kry {
    public static final Parcelable.Creator CREATOR = new kbc(5);
    public final int a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final boolean i;
    public final boolean j;
    public final boolean k;

    public khd(int i, boolean z, boolean z2, String str, String str2, String str3, String str4, String str5, boolean z3, boolean z4, boolean z5) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = z3;
        this.j = z4;
        this.k = z5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof khd) {
            khd khdVar = (khd) obj;
            if (this.a == khdVar.a && this.b == khdVar.b && this.c == khdVar.c && TextUtils.equals(this.d, khdVar.d) && TextUtils.equals(this.e, khdVar.e) && TextUtils.equals(this.f, khdVar.f) && TextUtils.equals(this.g, khdVar.g) && TextUtils.equals(this.h, khdVar.h) && this.i == khdVar.i && this.j == khdVar.j && this.k == khdVar.k) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c), this.d, this.e, this.f, this.g, this.h, Boolean.valueOf(this.i), Boolean.valueOf(this.j), Boolean.valueOf(this.k));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iG = ksy.g(parcel, 20293);
        ksy.l(parcel, 2, i2);
        ksy.i(parcel, 3, this.b);
        ksy.i(parcel, 4, this.c);
        ksy.B(parcel, 5, this.d);
        ksy.B(parcel, 6, this.e);
        ksy.B(parcel, 7, this.f);
        ksy.B(parcel, 8, this.g);
        ksy.B(parcel, 9, this.h);
        ksy.i(parcel, 10, this.i);
        ksy.i(parcel, 11, this.j);
        ksy.i(parcel, 12, this.k);
        ksy.h(parcel, iG);
    }
}
