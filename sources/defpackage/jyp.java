package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jyp extends kry {
    public static final Parcelable.Creator CREATOR = new jys(1);
    public final String a;
    public final String b;
    public final String c;

    public jyp(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jyp) {
            jyp jypVar = (jyp) obj;
            if (Objects.equals(this.a, jypVar.a) && Objects.equals(this.c, jypVar.c) && Objects.equals(this.b, jypVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.c, this.b);
    }

    public final String toString() {
        return "Account=" + this.c + ",obfuscated gaiaId=" + this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iG = ksy.g(parcel, 20293);
        ksy.B(parcel, 1, str);
        ksy.B(parcel, 2, this.b);
        ksy.B(parcel, 3, this.c);
        ksy.h(parcel, iG);
    }
}
