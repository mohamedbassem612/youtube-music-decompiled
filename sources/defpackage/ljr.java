package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mobiledataplan.MdpUpsellPlan;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ljr extends kry {
    public static final Parcelable.Creator CREATOR = new kvs(8);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final MdpUpsellPlan[] e;
    public final Bundle f;
    public final Integer g;
    public final Long h;
    public final lkg[] i;
    public final List j;

    public ljr(String str, String str2, String str3, String str4, MdpUpsellPlan[] mdpUpsellPlanArr, Bundle bundle, Integer num, Long l, lkg[] lkgVarArr, List list) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = mdpUpsellPlanArr;
        this.f = bundle;
        this.g = num;
        this.h = l;
        this.i = lkgVarArr;
        this.j = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ljr) {
            ljr ljrVar = (ljr) obj;
            if (Objects.equals(this.a, ljrVar.a) && Objects.equals(this.b, ljrVar.b) && Objects.equals(this.c, ljrVar.c) && Objects.equals(this.d, ljrVar.d) && Arrays.equals(this.e, ljrVar.e) && lqd.c(this.f, ljrVar.f) && Objects.equals(this.g, ljrVar.g) && Objects.equals(this.h, ljrVar.h) && Arrays.equals(this.i, ljrVar.i) && Objects.equals(this.j, ljrVar.j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, Integer.valueOf(lqd.b(this.f)), this.g, this.h, Integer.valueOf(Arrays.hashCode(this.e)), Integer.valueOf(Arrays.hashCode(this.i)), this.j);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        kro.p("CarrierName", this.a, arrayList);
        kro.p("CarrierLogoUrl", this.b, arrayList);
        kro.p("PromoMessage", this.c, arrayList);
        kro.p("Info", this.d, arrayList);
        kro.p("UpsellPlans", Arrays.toString(this.e), arrayList);
        kro.p("ExtraInfo", this.f, arrayList);
        kro.p("EventFlowId", this.g, arrayList);
        kro.p("UniqueRequestId", this.h, arrayList);
        kro.p("PaymentForms", Arrays.toString(this.i), arrayList);
        kro.p("Filters", this.j.toString(), arrayList);
        return kro.o(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iG = ksy.g(parcel, 20293);
        ksy.B(parcel, 1, str);
        ksy.B(parcel, 2, this.b);
        ksy.B(parcel, 3, this.c);
        ksy.B(parcel, 4, this.d);
        ksy.E(parcel, 5, this.e, i);
        ksy.p(parcel, 6, this.f);
        ksy.w(parcel, 7, this.g);
        ksy.z(parcel, 8, this.h);
        ksy.E(parcel, 9, this.i, i);
        ksy.F(parcel, 10, this.j);
        ksy.h(parcel, iG);
    }
}
