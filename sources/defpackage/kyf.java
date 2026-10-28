package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import j$.util.Objects;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kyf extends kry {
    public static final Parcelable.Creator CREATOR = new kvg(8);
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final kyf f;

    static {
        Process.myUid();
        Process.myPid();
    }

    public kyf(int i, String str, String str2, String str3, List list, kyf kyfVar) {
        if (kyfVar != null && kyfVar.f != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.a = i;
        this.b = str;
        this.c = str2;
        if (str3 == null) {
            str3 = kyfVar != null ? kyfVar.d : null;
        }
        this.d = str3;
        if (list == null) {
            list = kyfVar != null ? kyfVar.e : null;
            if (list == null) {
                list = agpi.a;
                list.getClass();
            }
        }
        this.e = aguu.T(list);
        this.f = kyfVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kyf)) {
            return false;
        }
        kyf kyfVar = (kyf) obj;
        return this.a == kyfVar.a && awrc.c(this.b, kyfVar.b) && awrc.c(this.c, kyfVar.c) && awrc.c(this.d, kyfVar.d) && awrc.c(this.f, kyfVar.f) && awrc.c(this.e, kyfVar.e);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b, this.c, this.d, this.f);
    }

    public final String toString() {
        String str = this.c;
        int length = str != null ? str.length() : 0;
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(str2.length() + 18 + length);
        sb.append(this.a);
        sb.append('/');
        sb.append(str2);
        if (str != null) {
            sb.append('[');
            if (awrc.n(str, str2, false)) {
                sb.append((CharSequence) str, str2.length(), str.length());
            } else {
                sb.append(str);
            }
            sb.append(']');
        }
        String str3 = this.d;
        if (str3 != null) {
            sb.append('/');
            sb.append(Integer.toHexString(str3.hashCode()));
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int i2 = this.a;
        int iG = ksy.g(parcel, 20293);
        ksy.l(parcel, 1, i2);
        ksy.B(parcel, 3, this.b);
        ksy.B(parcel, 4, this.c);
        ksy.B(parcel, 6, this.d);
        ksy.A(parcel, 7, this.f, i);
        ksy.F(parcel, 8, this.e);
        ksy.h(parcel, iG);
    }
}
