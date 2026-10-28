package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lmn extends kry {
    public static final Parcelable.Creator CREATOR = new kvu(12);
    public final String a;

    public lmn(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lmn) {
            return Objects.equals(this.a, ((lmn) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "PseudonymousIdToken[" + this.a + ']';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iG = ksy.g(parcel, 20293);
        ksy.B(parcel, 2, str);
        ksy.h(parcel, iG);
    }
}
