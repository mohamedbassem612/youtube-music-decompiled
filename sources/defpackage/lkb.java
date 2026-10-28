package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lkb extends kry {
    public static final Parcelable.Creator CREATOR = new kvs(17);
    public lka a;
    public ljz b;
    public Long c;
    public Integer d;
    public Long e;
    public Integer f;

    public lkb(lka lkaVar, ljz ljzVar, Long l, Integer num, Long l2, Integer num2) {
        this.a = lkaVar;
        this.b = ljzVar;
        this.c = l;
        this.d = num;
        this.e = l2;
        this.f = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lkb) {
            lkb lkbVar = (lkb) obj;
            if (Objects.equals(this.a, lkbVar.a) && Objects.equals(this.b, lkbVar.b) && Objects.equals(this.c, lkbVar.c) && Objects.equals(this.d, lkbVar.d) && Objects.equals(this.e, lkbVar.e) && Objects.equals(this.f, lkbVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, this.e, this.f);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        kro.p("ConsentStatus", this.a, arrayList);
        kro.p("ConsentAgreementText", this.b, arrayList);
        kro.p("ConsentChangeTime", this.c, arrayList);
        kro.p("EventFlowId", this.d, arrayList);
        kro.p("UniqueRequestId", this.e, arrayList);
        kro.p("ConsentResponseSource", this.f, arrayList);
        return kro.o(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.A(parcel, 1, this.a, i);
        ksy.A(parcel, 2, this.b, i);
        ksy.z(parcel, 3, this.c);
        ksy.w(parcel, 4, this.d);
        ksy.z(parcel, 5, this.e);
        ksy.w(parcel, 6, this.f);
        ksy.h(parcel, iG);
    }

    private lkb() {
    }
}
