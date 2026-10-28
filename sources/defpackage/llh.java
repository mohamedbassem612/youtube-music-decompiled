package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class llh extends kry {
    public static final Parcelable.Creator CREATOR = new kvu(8);
    public final String a;
    public final String b;
    public final llg c;
    public final boolean d;

    public llh(String str, String str2, llg llgVar, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = llgVar;
        this.d = z;
    }

    final void a(StringBuilder sb) {
        sb.append("FlagOverride(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        this.c.a(sb);
        sb.append(", ");
        sb.append(this.d);
        sb.append(')');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof llh) {
            llh llhVar = (llh) obj;
            if (a.ae(this.a, llhVar.a) && a.ae(this.b, llhVar.b) && a.ae(this.c, llhVar.c) && this.d == llhVar.d) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        a(sb);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.B(parcel, 2, this.a);
        ksy.B(parcel, 3, this.b);
        ksy.A(parcel, 4, this.c, i);
        ksy.i(parcel, 5, this.d);
        ksy.h(parcel, iG);
    }
}
