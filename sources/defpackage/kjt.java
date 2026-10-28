package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kjt extends kry {
    public static final Parcelable.Creator CREATOR = new fh(10);
    public final String a;
    public final int b;
    public int c;

    public kjt(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kjt) {
            kjt kjtVar = (kjt) obj;
            if (Objects.equals(this.a, kjtVar.a) && this.b == kjtVar.b && this.c == kjtVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        return "LogErrorParcelable[LogSourceName: " + this.a + ", ClearcutStatusCode: " + this.b + ", ErrorCount: " + this.c + ']';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.B(parcel, 1, this.a);
        ksy.l(parcel, 2, this.b);
        ksy.l(parcel, 3, this.c);
        ksy.h(parcel, iG);
    }
}
