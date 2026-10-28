package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kyw extends kry {
    public static final Parcelable.Creator CREATOR = new kvg(10);
    public final long a;
    public final int b;
    public final boolean c;
    public final kyf d;

    public kyw(long j, int i, boolean z, kyf kyfVar) {
        this.a = j;
        this.b = i;
        this.c = z;
        this.d = kyfVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kyw)) {
            return false;
        }
        kyw kywVar = (kyw) obj;
        return this.a == kywVar.a && this.b == kywVar.b && this.c == kywVar.c && Objects.equals(this.d, kywVar.d);
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Integer.valueOf(this.b), Boolean.valueOf(this.c));
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("LastLocationRequest[");
        long j = this.a;
        if (j != Long.MAX_VALUE) {
            sb.append("maxAge=");
            int i = kzd.a;
            if (j == 0) {
                sb.append("0s");
            } else {
                sb.ensureCapacity(sb.length() + 27);
                boolean z = false;
                if (j < 0) {
                    sb.append('-');
                    if (j != Long.MIN_VALUE) {
                        j = -j;
                    } else {
                        j = Long.MAX_VALUE;
                        z = true;
                    }
                }
                if (j >= 86400000) {
                    sb.append(j / 86400000);
                    sb.append('d');
                    j %= 86400000;
                }
                if (z) {
                    j++;
                }
                if (j >= 3600000) {
                    sb.append(j / 3600000);
                    sb.append('h');
                    j %= 3600000;
                }
                if (j >= 60000) {
                    sb.append(j / 60000);
                    sb.append('m');
                    j %= 60000;
                }
                if (j >= 1000) {
                    sb.append(j / 1000);
                    sb.append('s');
                    j %= 1000;
                }
                if (j > 0) {
                    sb.append(j);
                    sb.append("ms");
                }
            }
        }
        int i2 = this.b;
        if (i2 != 0) {
            sb.append(", ");
            if (i2 == 0) {
                str = "GRANULARITY_PERMISSION_LEVEL";
            } else if (i2 == 1) {
                str = "GRANULARITY_COARSE";
            } else {
                if (i2 != 2) {
                    throw new IllegalArgumentException();
                }
                str = "GRANULARITY_FINE";
            }
            sb.append(str);
        }
        if (this.c) {
            sb.append(", bypass");
        }
        kyf kyfVar = this.d;
        if (kyfVar != null) {
            sb.append(", impersonation=");
            sb.append(kyfVar);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.a;
        int iG = ksy.g(parcel, 20293);
        ksy.m(parcel, 1, j);
        ksy.l(parcel, 2, this.b);
        ksy.i(parcel, 3, this.c);
        ksy.A(parcel, 5, this.d, i);
        ksy.h(parcel, iG);
    }
}
