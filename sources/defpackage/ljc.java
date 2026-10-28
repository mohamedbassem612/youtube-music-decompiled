package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ljc extends kry {
    public static final Parcelable.Creator CREATOR = new kvg(19);
    public final Long a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public ljc(Long l, String str, String str2, String str3, String str4) {
        this.a = l;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ljc) {
            ljc ljcVar = (ljc) obj;
            if (Objects.equals(this.a, ljcVar.a) && Objects.equals(this.b, ljcVar.b)) {
                String str = this.c;
                String str2 = ljcVar.c;
                if (Objects.equals(str, str2) && Objects.equals(str, str2) && Objects.equals(this.d, ljcVar.d) && Objects.equals(this.e, ljcVar.e)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, this.e);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        kro.p("tileId", this.a, arrayList);
        kro.p("title", this.b, arrayList);
        kro.p("description", this.c, arrayList);
        kro.p("landingPageUri", this.d, arrayList);
        kro.p("buttonText", this.e, arrayList);
        return kro.o(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Long l = this.a;
        int iG = ksy.g(parcel, 20293);
        ksy.z(parcel, 1, l);
        ksy.B(parcel, 2, this.b);
        ksy.B(parcel, 3, this.c);
        ksy.B(parcel, 4, this.d);
        ksy.B(parcel, 5, this.e);
        ksy.h(parcel, iG);
    }
}
