package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ljn extends kry {
    public static final Parcelable.Creator CREATOR = new kvs(4);
    public final String a;
    public final ljl[] b;
    public final Bundle c;
    public final String d;
    public final ljw e;
    public final Integer f;
    public final Long g;
    public final Long h;
    public final ljd[] i;
    public final String j;
    public final List k;

    public ljn(String str, ljl[] ljlVarArr, Bundle bundle, String str2, ljw ljwVar, Integer num, Long l, Long l2, ljd[] ljdVarArr, String str3, List list) {
        this.a = str;
        this.b = ljlVarArr;
        this.c = bundle;
        this.d = str2;
        this.e = ljwVar;
        this.f = num;
        this.g = l;
        this.h = l2;
        this.i = ljdVarArr;
        this.j = str3;
        this.k = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ljn) {
            ljn ljnVar = (ljn) obj;
            if (Objects.equals(this.a, ljnVar.a) && Arrays.equals(this.b, ljnVar.b) && lqd.c(this.c, ljnVar.c) && Objects.equals(this.d, ljnVar.d) && Objects.equals(this.e, ljnVar.e) && Objects.equals(this.f, ljnVar.f) && Objects.equals(this.g, ljnVar.g) && Objects.equals(this.h, ljnVar.h) && Arrays.equals(this.i, ljnVar.i) && Objects.equals(this.j, ljnVar.j) && Objects.equals(this.k, ljnVar.k)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Objects.hash(this.a, Integer.valueOf(lqd.b(this.c)), this.d, this.e, this.f, this.g, this.h, this.k) ^ Arrays.hashCode(this.b)) ^ Arrays.hashCode(this.i);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        kro.p("CarrierPlanId", this.a, arrayList);
        kro.p("DataPlans", Arrays.toString(this.b), arrayList);
        kro.p("ExtraInfo", this.c, arrayList);
        kro.p("Title", this.d, arrayList);
        kro.p("WalletBalanceInfo", this.e, arrayList);
        kro.p("EventFlowId", this.f, arrayList);
        kro.p("UniqueRequestId", this.g, arrayList);
        Long l = this.h;
        kro.p("UpdateTime", l != null ? aikz.b(l.longValue()) : null, arrayList);
        kro.p("CellularInfo", Arrays.toString(this.i), arrayList);
        String str = this.j;
        kro.p("ExpirationTime", str != null ? str : null, arrayList);
        List list = this.k;
        kro.p("ActionTile", list != null ? list.toString() : "", arrayList);
        return kro.o(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iG = ksy.g(parcel, 20293);
        ksy.B(parcel, 1, str);
        ksy.E(parcel, 2, this.b, i);
        ksy.p(parcel, 3, this.c);
        ksy.B(parcel, 4, this.d);
        ksy.A(parcel, 5, this.e, i);
        ksy.w(parcel, 6, this.f);
        ksy.z(parcel, 7, this.g);
        ksy.z(parcel, 8, this.h);
        ksy.E(parcel, 9, this.i, i);
        ksy.B(parcel, 10, this.j);
        ksy.F(parcel, 11, this.k);
        ksy.h(parcel, iG);
    }
}
