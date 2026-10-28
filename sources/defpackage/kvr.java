package defpackage;

import android.os.Parcel;
import j$.util.Objects;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kvr extends kry {
    public static final kvs CREATOR = new kvs(0);
    public final kvt a;
    public final byte[] b;

    public kvr(kvt kvtVar, byte[] bArr) {
        kvtVar.getClass();
        this.a = kvtVar;
        bArr.getClass();
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            kvr kvrVar = (kvr) obj;
            if (this.a.equals(kvrVar.a) && Arrays.equals(this.b, kvrVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Objects.hash(this.a) * 31) + Arrays.hashCode(this.b);
    }

    public final String toString() {
        byte[] bArr = this.b;
        String string = this.a.toString();
        String string2 = Arrays.toString(bArr);
        if (string2.length() > 20) {
            string2 = String.valueOf(string2.substring(0, 17)).concat("...");
        }
        return "ServiceDump{serviceDumpRequest=" + string + ", dumpOutput=\"" + String.format(string2, new Object[0]) + "\"}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.A(parcel, 2, this.a, i);
        ksy.q(parcel, 3, this.b);
        ksy.h(parcel, iG);
    }
}
