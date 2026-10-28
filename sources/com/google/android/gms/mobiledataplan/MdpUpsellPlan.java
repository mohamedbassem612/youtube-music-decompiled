package com.google.android.gms.mobiledataplan;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.kro;
import defpackage.kry;
import defpackage.ksy;
import defpackage.kvs;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class MdpUpsellPlan extends kry implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new kvs(9);
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final String e;
    public final String f;
    public final long g;
    public final long h;
    public final String i;
    public final String j;
    public final int k;
    public final List l;
    public final String m;
    public final List n;
    public final List o;

    public MdpUpsellPlan(String str, String str2, String str3, long j, String str4, String str5, long j2, long j3, String str6, String str7, int i, List list, String str8, List list2, List list3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = str4;
        this.f = str5;
        this.g = j2;
        this.h = j3;
        this.i = str6;
        this.j = str7;
        this.k = i;
        this.l = list;
        this.m = str8;
        this.n = list2;
        this.o = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MdpUpsellPlan) {
            MdpUpsellPlan mdpUpsellPlan = (MdpUpsellPlan) obj;
            if (Objects.equals(this.a, mdpUpsellPlan.a) && Objects.equals(this.b, mdpUpsellPlan.b) && Objects.equals(this.c, mdpUpsellPlan.c) && Objects.equals(Long.valueOf(this.d), Long.valueOf(mdpUpsellPlan.d)) && Objects.equals(this.e, mdpUpsellPlan.e) && Objects.equals(this.f, mdpUpsellPlan.f) && Objects.equals(Long.valueOf(this.g), Long.valueOf(mdpUpsellPlan.g)) && Objects.equals(Long.valueOf(this.h), Long.valueOf(mdpUpsellPlan.h)) && Objects.equals(this.i, mdpUpsellPlan.i) && Objects.equals(this.j, mdpUpsellPlan.j) && Objects.equals(Integer.valueOf(this.k), Integer.valueOf(mdpUpsellPlan.k)) && Objects.equals(this.l, mdpUpsellPlan.l) && Objects.equals(this.m, mdpUpsellPlan.m) && Objects.equals(this.n, mdpUpsellPlan.n) && Objects.equals(this.o, mdpUpsellPlan.o)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, Long.valueOf(this.d), this.e, this.f, Long.valueOf(this.g), Long.valueOf(this.h), this.i, this.j, Integer.valueOf(this.k), this.l, this.m, this.n, this.o);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        kro.p("PlanId", this.a, arrayList);
        kro.p("PlanName", this.b, arrayList);
        kro.p("PlanType", this.c, arrayList);
        kro.p("Cost", Long.valueOf(this.d), arrayList);
        kro.p("CostCurrency", this.e, arrayList);
        kro.p("ConnectionType", this.f, arrayList);
        kro.p("DurationInSeconds", Long.valueOf(this.g), arrayList);
        kro.p("mQuotaBytes", Long.valueOf(this.h), arrayList);
        kro.p("mOfferContext", this.i, arrayList);
        kro.p("planDescription", this.j, arrayList);
        kro.p("offerType", Integer.valueOf(this.k), arrayList);
        kro.p("filterTags", this.l, arrayList);
        kro.p("paymentUrl", this.m, arrayList);
        kro.p("fundSources", this.n, arrayList);
        kro.p("paymentGatewayConfig", this.o, arrayList);
        return kro.o(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iG = ksy.g(parcel, 20293);
        ksy.B(parcel, 1, str);
        ksy.B(parcel, 2, this.b);
        ksy.B(parcel, 3, this.c);
        ksy.m(parcel, 4, this.d);
        ksy.B(parcel, 5, this.e);
        ksy.B(parcel, 6, this.f);
        ksy.m(parcel, 7, this.g);
        ksy.m(parcel, 8, this.h);
        ksy.B(parcel, 9, this.i);
        ksy.B(parcel, 10, this.j);
        ksy.l(parcel, 11, this.k);
        ksy.D(parcel, 12, this.l);
        ksy.B(parcel, 13, this.m);
        ksy.v(parcel, 14, this.n);
        ksy.F(parcel, 15, this.o);
        ksy.h(parcel, iG);
    }
}
