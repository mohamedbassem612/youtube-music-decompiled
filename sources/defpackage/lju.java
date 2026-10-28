package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lju extends kry {
    public static final Parcelable.Creator CREATOR = new kvs(10);
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public lju(String str, int i, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lju)) {
            return false;
        }
        lju ljuVar = (lju) obj;
        return Objects.equals(this.a, ljuVar.a) && Objects.equals(Integer.valueOf(this.b), Integer.valueOf(ljuVar.b)) && Objects.equals(this.c, ljuVar.c) && Objects.equals(this.d, ljuVar.d) && Objects.equals(this.e, ljuVar.e) && Objects.equals(this.f, ljuVar.f);
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), this.c, this.d, this.e);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        kro.p("displayName", this.a, arrayList);
        kro.p("type", Integer.valueOf(this.b), arrayList);
        kro.p("paymentGatewayUrl", this.c, arrayList);
        kro.p("purchaseStatusUrl", this.d, arrayList);
        kro.p("description", this.e, arrayList);
        kro.p("title", this.f, arrayList);
        return kro.o(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iG = ksy.g(parcel, 20293);
        ksy.B(parcel, 1, str);
        ksy.l(parcel, 2, this.b);
        ksy.B(parcel, 3, this.c);
        ksy.B(parcel, 4, this.d);
        ksy.B(parcel, 5, this.e);
        ksy.B(parcel, 6, this.f);
        ksy.h(parcel, iG);
    }
}
