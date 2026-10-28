package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ljd extends kry {
    public static final Parcelable.Creator CREATOR = new kvg(20);
    public final Integer a;
    public final Integer b;

    public ljd(Integer num, Integer num2) {
        this.a = num;
        this.b = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ljd) {
            ljd ljdVar = (ljd) obj;
            if (Objects.equals(this.a, ljdVar.a) && Objects.equals(this.b, ljdVar.b)) {
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
        kro.p("connectionType", this.a, arrayList);
        kro.p("meteredness", this.b, arrayList);
        return kro.o(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.a;
        int iG = ksy.g(parcel, 20293);
        ksy.w(parcel, 1, num);
        ksy.w(parcel, 2, this.b);
        ksy.h(parcel, iG);
    }
}
