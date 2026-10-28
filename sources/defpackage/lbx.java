package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lbx extends kry {
    public static final Parcelable.Creator CREATOR = new kwo(4);
    public final String a;
    public final String b;
    public final int c;
    public final long d;

    public lbx(String str, String str2, int i, long j) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lbx) {
            lbx lbxVar = (lbx) obj;
            if (Objects.equals(this.a, lbxVar.a) && Objects.equals(this.b, lbxVar.b) && this.c == lbxVar.c && this.d == lbxVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, Integer.valueOf(this.c), Long.valueOf(this.d));
    }

    public final String toString() {
        return "DiagnosticSignalParcel{signalName='" + this.a + "', signalMetadata='" + this.b + "', count=" + this.c + ", sum=" + this.d + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iG = ksy.g(parcel, 20293);
        if (str != null) {
            int iG2 = ksy.g(parcel, 2);
            parcel.writeString(str);
            ksy.h(parcel, iG2);
        }
        String str2 = this.b;
        if (str2 != null) {
            int iG3 = ksy.g(parcel, 3);
            parcel.writeString(str2);
            ksy.h(parcel, iG3);
        }
        int i2 = this.c;
        parcel.writeInt(262148);
        parcel.writeInt(i2);
        long j = this.d;
        parcel.writeInt(524293);
        parcel.writeLong(j);
        ksy.h(parcel, iG);
    }
}
