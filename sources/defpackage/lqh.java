package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lqh extends kry {
    public static final Parcelable.Creator CREATOR = new lof(13);
    public lql a;
    public String b;
    public String c;
    public lqm[] d;
    public lqj[] e;
    public String[] f;
    public lqe[] g;

    public lqh(lql lqlVar, String str, String str2, lqm[] lqmVarArr, lqj[] lqjVarArr, String[] strArr, lqe[] lqeVarArr) {
        this.a = lqlVar;
        this.b = str;
        this.c = str2;
        this.d = lqmVarArr;
        this.e = lqjVarArr;
        this.f = strArr;
        this.g = lqeVarArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.A(parcel, 2, this.a, i);
        ksy.B(parcel, 3, this.b);
        ksy.B(parcel, 4, this.c);
        ksy.E(parcel, 5, this.d, i);
        ksy.E(parcel, 6, this.e, i);
        ksy.C(parcel, 7, this.f);
        ksy.E(parcel, 8, this.g, i);
        ksy.h(parcel, iG);
    }

    public lqh() {
    }
}
