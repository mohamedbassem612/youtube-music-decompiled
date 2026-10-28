package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ljp extends kry {
    public static final Parcelable.Creator CREATOR = new kvs(6);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final String f;
    public final String g;
    public final Bundle h;
    public final Integer i;
    public final Long j;

    public ljp(String str, String str2, String str3, String str4, long j, String str5, String str6, Bundle bundle, Integer num, Long l) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = j;
        this.f = str5;
        this.g = str6;
        this.h = bundle;
        this.i = num;
        this.j = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ljp) {
            ljp ljpVar = (ljp) obj;
            if (Objects.equals(this.a, ljpVar.a) && Objects.equals(this.b, ljpVar.b) && Objects.equals(this.c, ljpVar.c) && Objects.equals(this.d, ljpVar.d) && Objects.equals(Long.valueOf(this.e), Long.valueOf(ljpVar.e)) && Objects.equals(this.f, ljpVar.f) && Objects.equals(this.g, ljpVar.g) && lqd.c(this.h, ljpVar.h) && Objects.equals(this.i, ljpVar.i) && Objects.equals(this.j, ljpVar.j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, Long.valueOf(this.e), this.f, this.g, this.h, this.i, this.j);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        kro.p("CarrierName", this.a, arrayList);
        kro.p("TransactionId", this.b, arrayList);
        kro.p("ConfirmationCode", this.c, arrayList);
        kro.p("TransactionMsg", this.d, arrayList);
        kro.p("RemainingBalance", Long.valueOf(this.e), arrayList);
        kro.p("CostCurrency", this.f, arrayList);
        kro.p("PlanActivationTime", this.g, arrayList);
        kro.p("ExtraInfo", this.h, arrayList);
        kro.p("EventFlowId", this.i, arrayList);
        kro.p("UniqueRequestId", this.j, arrayList);
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
        ksy.m(parcel, 5, this.e);
        ksy.B(parcel, 6, this.f);
        ksy.B(parcel, 7, this.g);
        ksy.p(parcel, 8, this.h);
        ksy.w(parcel, 9, this.i);
        ksy.z(parcel, 10, this.j);
        ksy.h(parcel, iG);
    }
}
