package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ljo extends kry {
    public static final Parcelable.Creator CREATOR = new kvs(5);
    public final String a;
    public final String b;
    public final String c;
    public final int d;

    public ljo(String str, String str2, String str3, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ljo) {
            ljo ljoVar = (ljo) obj;
            if (Objects.equals(this.a, ljoVar.a) && Objects.equals(this.b, ljoVar.b) && Objects.equals(this.c, ljoVar.c) && Objects.equals(Integer.valueOf(this.d), Integer.valueOf(ljoVar.d))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, Integer.valueOf(this.d));
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        kro.p("RecurrenceType", this.a, arrayList);
        kro.p("StartTime", this.b, arrayList);
        kro.p("EndTime", this.c, arrayList);
        kro.p("DiscountPercentage", Integer.valueOf(this.d), arrayList);
        return kro.o(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iG = ksy.g(parcel, 20293);
        ksy.B(parcel, 1, str);
        ksy.B(parcel, 2, this.b);
        ksy.B(parcel, 3, this.c);
        ksy.l(parcel, 4, this.d);
        ksy.h(parcel, iG);
    }
}
