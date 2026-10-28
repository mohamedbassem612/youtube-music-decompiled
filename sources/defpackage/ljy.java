package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ljy extends kry {
    public static final Parcelable.Creator CREATOR = new kvs(14);
    public String a;
    public String b;
    public ljx[] c;

    public ljy(String str, String str2, ljx[] ljxVarArr) {
        this.a = str;
        this.b = str2;
        this.c = ljxVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ljy) {
            ljy ljyVar = (ljy) obj;
            if (Objects.equals(this.a, ljyVar.a) && Objects.equals(this.b, ljyVar.b) && Arrays.equals(this.c, ljyVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, Integer.valueOf(Arrays.hashCode(this.c)));
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        kro.p("TitleMessage", this.a, arrayList);
        kro.p("LanguageCode", this.b, arrayList);
        kro.p("SupportChannels", Arrays.toString(this.c), arrayList);
        return kro.o(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.B(parcel, 1, this.a);
        ksy.B(parcel, 2, this.b);
        ksy.E(parcel, 3, this.c, i);
        ksy.h(parcel, iG);
    }

    private ljy() {
    }
}
