package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ljx extends kry {
    public static final Parcelable.Creator CREATOR = new kvs(13);
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public int f;

    public ljx(String str, String str2, String str3, String str4, String str5, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ljx) {
            ljx ljxVar = (ljx) obj;
            if (Objects.equals(this.a, ljxVar.a) && Objects.equals(this.b, ljxVar.b) && Objects.equals(this.c, ljxVar.c) && Objects.equals(this.d, ljxVar.d) && Objects.equals(this.e, ljxVar.e) && Objects.equals(Integer.valueOf(this.f), Integer.valueOf(ljxVar.f))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, this.e, Integer.valueOf(this.f));
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        kro.p("Title", this.a, arrayList);
        kro.p("SubTitle", this.b, arrayList);
        kro.p("Target", this.c, arrayList);
        kro.p("DefaultMessageSubject", this.d, arrayList);
        kro.p("DefaultMessageBody", this.e, arrayList);
        kro.p("Type", Integer.valueOf(this.f), arrayList);
        return kro.o(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.B(parcel, 1, this.a);
        ksy.B(parcel, 2, this.b);
        ksy.B(parcel, 3, this.c);
        ksy.B(parcel, 4, this.d);
        ksy.B(parcel, 5, this.e);
        ksy.l(parcel, 6, this.f);
        ksy.h(parcel, iG);
    }

    private ljx() {
    }
}
