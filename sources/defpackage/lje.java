package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lje extends kry {
    public static final Parcelable.Creator CREATOR = new kvs(1);
    public final Integer a;
    public final List b;

    public lje(Integer num, List list) {
        this.a = num;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lje) {
            lje ljeVar = (lje) obj;
            if (Objects.equals(this.a, ljeVar.a) && Objects.equals(this.b, ljeVar.b)) {
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
        kro.p("dataRecordDuration", this.a, arrayList);
        kro.p("dataUsage", this.b, arrayList);
        return kro.o(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.a;
        int iG = ksy.g(parcel, 20293);
        ksy.w(parcel, 1, num);
        ksy.y(parcel, 2, this.b);
        ksy.h(parcel, iG);
    }
}
