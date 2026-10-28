package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ljj extends kry {
    public static final Parcelable.Creator CREATOR = new kvs(2);
    public String a;
    public Bundle b;
    public Integer c;
    public Long d;

    public ljj(String str, Bundle bundle, Integer num, Long l) {
        this.a = str;
        this.b = bundle;
        this.c = num;
        this.d = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ljj) {
            ljj ljjVar = (ljj) obj;
            if (Objects.equals(this.a, ljjVar.a) && lqd.c(this.b, ljjVar.b) && Objects.equals(this.c, ljjVar.c) && Objects.equals(this.d, ljjVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(lqd.b(this.b)), this.c, this.d);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.a;
        kro.p("apiKey", str.substring(Math.max(str.length() - 5, 0)), arrayList);
        kro.p("ExtraInfo", this.b, arrayList);
        kro.p("EventFlowId", this.c, arrayList);
        kro.p("UniqueRequestId", this.d, arrayList);
        return kro.o(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.B(parcel, 1, this.a);
        ksy.p(parcel, 2, this.b);
        ksy.w(parcel, 3, this.c);
        ksy.z(parcel, 4, this.d);
        ksy.h(parcel, iG);
    }

    public ljj() {
    }
}
