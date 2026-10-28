package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ljk extends kry {
    public static final Parcelable.Creator CREATOR = new kvs(3);
    public final String a;
    public final long b;
    public final String c;
    public final String d;
    public final long e;
    public final String f;
    public int g;
    public ljy h;
    public Integer i;
    public Long j;

    public ljk(String str, long j, String str2, String str3, long j2, String str4, int i, ljy ljyVar, Integer num, Long l) {
        this.a = str;
        this.b = j;
        this.c = str2;
        this.d = str3;
        this.e = j2;
        this.f = str4;
        if (i != 0 && i != 1 && i != 2) {
            throw new IllegalArgumentException("Response source must be a value in CpidResponseSource");
        }
        this.g = i;
        this.h = ljyVar;
        this.i = num;
        this.j = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ljk) {
            ljk ljkVar = (ljk) obj;
            if (Objects.equals(this.a, ljkVar.a) && Objects.equals(Long.valueOf(this.b), Long.valueOf(ljkVar.b)) && Objects.equals(this.c, ljkVar.c) && Objects.equals(this.d, ljkVar.d) && Objects.equals(Long.valueOf(this.e), Long.valueOf(ljkVar.e)) && Objects.equals(this.f, ljkVar.f) && Objects.equals(Integer.valueOf(this.g), Integer.valueOf(ljkVar.g)) && Objects.equals(this.h, ljkVar.h) && Objects.equals(this.i, ljkVar.i) && Objects.equals(this.j, ljkVar.j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Long.valueOf(this.b), this.c, this.d, Long.valueOf(this.e), Integer.valueOf(this.g), this.h, this.i, this.j);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        kro.p("CarrierPlanId", this.a, arrayList);
        kro.p("TTL-in-Seconds", Long.valueOf(this.b), arrayList);
        kro.p("CarrierName", this.c, arrayList);
        kro.p("CarrierLogoImageURL", this.d, arrayList);
        kro.p("CarrierId", Long.valueOf(this.e), arrayList);
        kro.p("CarrierCpid", this.f, arrayList);
        kro.p("ResponseSource", Integer.valueOf(this.g), arrayList);
        kro.p("CarrierSupportInfo", this.h, arrayList);
        kro.p("EventFlowId", this.i, arrayList);
        kro.p("UniqueRequestId", this.j, arrayList);
        return kro.o(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iG = ksy.g(parcel, 20293);
        ksy.B(parcel, 1, str);
        ksy.m(parcel, 2, this.b);
        ksy.B(parcel, 3, this.c);
        ksy.B(parcel, 4, this.d);
        ksy.m(parcel, 5, this.e);
        ksy.B(parcel, 6, this.f);
        ksy.l(parcel, 7, this.g);
        ksy.A(parcel, 8, this.h, i);
        ksy.w(parcel, 9, this.i);
        ksy.z(parcel, 10, this.j);
        ksy.h(parcel, iG);
    }
}
