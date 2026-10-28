package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ljz extends kry {
    public static final Parcelable.Creator CREATOR = new kvs(15);
    public lkc a;
    public lkc[] b;
    public lkc[] c;
    public String d;
    public String e;
    public String f;
    public int g;
    public String h;

    public ljz(lkc lkcVar, lkc[] lkcVarArr, lkc[] lkcVarArr2, String str, String str2, String str3, int i, String str4) {
        this.a = lkcVar;
        this.b = lkcVarArr;
        this.c = lkcVarArr2;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = i;
        this.h = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ljz) {
            ljz ljzVar = (ljz) obj;
            if (Objects.equals(this.a, ljzVar.a) && Arrays.equals(this.b, ljzVar.b) && Arrays.equals(this.c, ljzVar.c) && Objects.equals(this.d, ljzVar.d) && Objects.equals(this.e, ljzVar.e) && Objects.equals(this.f, ljzVar.f) && Objects.equals(Integer.valueOf(this.g), Integer.valueOf(ljzVar.g)) && Objects.equals(this.h, ljzVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(Arrays.hashCode(this.b)), Integer.valueOf(Arrays.hashCode(this.c)), this.d, this.e, this.f, Integer.valueOf(this.g));
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        kro.p("Title", this.a, arrayList);
        kro.p("DescriptionParagraphs", Arrays.toString(this.b), arrayList);
        kro.p("AdditionalInfoParagraphs", Arrays.toString(this.c), arrayList);
        kro.p("PositiveButtonCaption", this.d, arrayList);
        kro.p("NegativeButtonCaption", this.e, arrayList);
        kro.p("ContinueButtonCaption", this.f, arrayList);
        kro.p("Version", Integer.valueOf(this.g), arrayList);
        kro.p("TextId", this.h, arrayList);
        return kro.o(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.A(parcel, 1, this.a, i);
        ksy.E(parcel, 2, this.b, i);
        ksy.E(parcel, 3, this.c, i);
        ksy.B(parcel, 4, this.d);
        ksy.B(parcel, 5, this.e);
        ksy.B(parcel, 6, this.f);
        ksy.l(parcel, 7, this.g);
        ksy.B(parcel, 8, this.h);
        ksy.h(parcel, iG);
    }

    private ljz() {
    }
}
