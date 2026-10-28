package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lkc extends kry {
    public static final Parcelable.Creator CREATOR = new kvs(18);
    public String a;

    public lkc(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lkc) {
            return Objects.equals(this.a, ((lkc) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        kro.p("Html", this.a, arrayList);
        return kro.o(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.B(parcel, 1, this.a);
        ksy.h(parcel, iG);
    }

    private lkc() {
    }
}
