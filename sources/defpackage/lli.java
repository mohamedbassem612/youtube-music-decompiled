package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lli extends kry {
    public static final Parcelable.Creator CREATOR = new kvu(9);
    public final List a;

    public lli(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lli) {
            return this.a.equals(((lli) obj).a);
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlagOverrides(");
        boolean z = true;
        for (llh llhVar : this.a) {
            if (!z) {
                sb.append(", ");
            }
            llhVar.a(sb);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.F(parcel, 2, this.a);
        ksy.h(parcel, iG);
    }
}
