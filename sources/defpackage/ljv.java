package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ljv extends kry {
    public static final Parcelable.Creator CREATOR = new kvs(11);
    public final Long a;
    public final Float b;
    public final Float c;

    public ljv(Long l, Float f, Float f2) {
        this.a = l;
        this.b = f;
        this.c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ljv) {
            ljv ljvVar = (ljv) obj;
            if (Objects.equals(this.a, ljvVar.a) && Objects.equals(this.b, ljvVar.b) && Objects.equals(this.c, ljvVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        kro.p("uptime", this.a, arrayList);
        kro.p("networkScore", this.b, arrayList);
        kro.p("timeConnectedPercent", this.c, arrayList);
        return kro.o(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Long l = this.a;
        int iG = ksy.g(parcel, 20293);
        ksy.z(parcel, 1, l);
        ksy.s(parcel, 2, this.b);
        ksy.s(parcel, 3, this.c);
        ksy.h(parcel, iG);
    }
}
