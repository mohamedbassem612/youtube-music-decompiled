package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class acca implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aapl(12);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final String f;
    public final String g;
    public final boolean h;
    public final int i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final Optional o;
    public final CharSequence p;
    public final boolean q;

    public acca(String str, String str2, String str3, String str4, int i, String str5, String str6, boolean z, int i2, String str7, String str8, String str9, String str10, String str11, Optional optional, CharSequence charSequence, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = str5;
        this.g = str6;
        this.h = z;
        this.i = i2;
        this.j = str7;
        this.k = str8;
        this.l = str9;
        this.m = str10;
        this.n = str11;
        this.o = optional;
        this.p = charSequence;
        this.q = z2;
    }

    public static acbz a() {
        acbz acbzVar = new acbz();
        acbzVar.j("");
        acbzVar.l("");
        acbzVar.e("");
        acbzVar.d(0);
        acbzVar.k("");
        acbzVar.g(false);
        acbzVar.f(false);
        acbzVar.b(-1);
        acbzVar.h("");
        return acbzVar;
    }

    public static acca b(String str) {
        acbz acbzVarA = a();
        acbzVarA.i("DISABLE_CAPTIONS_OPTION");
        acbzVarA.n("");
        acbzVarA.e("");
        acbzVarA.o("-");
        acbzVarA.m("");
        acbzVarA.c = str;
        acbzVarA.g(false);
        return acbzVarA.a();
    }

    public static String d(String str, String str2) {
        return "t" + str + '.' + str2;
    }

    public final acca c(String str) {
        acbz acbzVarA = a();
        CharSequence charSequence = this.p;
        if (charSequence != null) {
            acbzVarA.c = charSequence.toString();
        }
        String str2 = this.f;
        if (str2 != null) {
            acbzVarA.a = str2;
        }
        acbzVarA.i(this.a);
        acbzVarA.n(this.d);
        acbzVarA.e("");
        acbzVarA.o(this.k);
        acbzVarA.m(this.m);
        acbzVarA.j(this.b);
        acbzVarA.l(this.c);
        acbzVarA.d(this.e);
        acbzVarA.k(this.g);
        acbzVarA.f(true);
        acbzVarA.b = str;
        return acbzVarA.a();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return "AUTO_TRANSLATE_CAPTIONS_OPTION".equals(this.a);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof acca)) {
            return false;
        }
        acca accaVar = (acca) obj;
        return TextUtils.equals(this.k, accaVar.k) && TextUtils.equals(this.d, accaVar.d) && TextUtils.equals(this.g, accaVar.g);
    }

    public final boolean f() {
        return this.k.startsWith("t");
    }

    public final boolean g() {
        return "DISABLE_CAPTIONS_OPTION".equals(this.a);
    }

    public final int hashCode() {
        tqj tqjVar = tqi.a;
        if (tqjVar != null) {
            int i = tqr.a;
            if (tqjVar.k(1073840115)) {
                String str = this.k;
                int iHashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
                String str2 = this.d;
                int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
                String str3 = this.g;
                return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
            }
        }
        int iHashCode3 = (((((this.a.hashCode() + 527) * 31) + this.m.hashCode()) * 31) + toString().hashCode()) * 31;
        String str4 = this.d;
        return str4 != null ? iHashCode3 + str4.hashCode() : iHashCode3;
    }

    public final String toString() {
        return typ.b(this.p).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.n);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.j);
        parcel.writeString(this.k);
        parcel.writeString(this.m);
        Optional optionalOfNullable = this.o;
        Optional optionalOfNullable2 = true != optionalOfNullable.isPresent() ? optionalOfNullable : Optional.ofNullable(Double.valueOf(((acbk) optionalOfNullable.get()).a));
        Double dValueOf = Double.valueOf(0.0d);
        parcel.writeDouble(((Double) optionalOfNullable2.orElse(dValueOf)).doubleValue());
        parcel.writeDouble(((Double) (true != optionalOfNullable.isPresent() ? optionalOfNullable : Optional.ofNullable(Double.valueOf(((acbk) optionalOfNullable.get()).b))).orElse(dValueOf)).doubleValue());
        Optional optionalOfNullable3 = true != optionalOfNullable.isPresent() ? optionalOfNullable : Optional.ofNullable(Double.valueOf(((acbk) optionalOfNullable.get()).c));
        Double dValueOf2 = Double.valueOf(1.0d);
        parcel.writeDouble(((Double) optionalOfNullable3.orElse(dValueOf2)).doubleValue());
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = Optional.ofNullable(Double.valueOf(((acbk) optionalOfNullable.get()).d));
        }
        parcel.writeDouble(((Double) optionalOfNullable.orElse(dValueOf2)).doubleValue());
        parcel.writeString(typ.b(this.p).toString());
        parcel.writeString(this.l);
    }

    public acca() {
        throw null;
    }
}
