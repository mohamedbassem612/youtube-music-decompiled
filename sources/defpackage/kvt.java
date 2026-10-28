package defpackage;

import android.os.Parcel;
import j$.util.Objects;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kvt extends kry {
    public static final kvu CREATOR = new kvu(0);
    final String a;
    final String b;
    final String[] c;
    final int d;
    final boolean e;

    public kvt(String str, String str2, String[] strArr, int i, boolean z) {
        str.getClass();
        this.a = str;
        this.b = str2 != null ? str2 : str;
        this.c = strArr;
        if (i != 2 && i != 1) {
            throw new IllegalArgumentException(a.bR(i, "Unknown expected output format="));
        }
        this.d = i;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            kvt kvtVar = (kvt) obj;
            if (this.e == kvtVar.e && this.d == kvtVar.d && this.a.equals(kvtVar.a) && this.b.equals(kvtVar.b) && Arrays.equals(this.c, kvtVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Objects.hash(this.a, this.b, Boolean.valueOf(this.e), Integer.valueOf(this.d)) * 31) + Arrays.hashCode(this.c);
    }

    public final String toString() {
        return "ServiceDumpRequest{serviceDumpId='" + this.a + "',serviceName='" + this.b + "', dumpsysFlags=" + Arrays.toString(this.c) + ", expectedOutputFormat=" + this.d + ", showOutputToUser=" + this.e + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.B(parcel, 2, this.a);
        ksy.C(parcel, 3, this.c);
        ksy.l(parcel, 4, this.d);
        ksy.i(parcel, 5, this.e);
        ksy.B(parcel, 6, this.b);
        ksy.h(parcel, iG);
    }
}
