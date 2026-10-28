package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kbn extends kry {
    public static final Parcelable.Creator CREATOR;
    public static final kbl a = new kbl(false);
    public static final kbm b = new kbm(0);
    public static final keh c;
    public final String d;
    public boolean e;
    public final kap f;
    public final boolean g;
    public final keh h;
    public final boolean i;
    public final double j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final kbl p;
    public kbm q;
    public final boolean r;
    public final boolean s;
    public final Boolean t;
    private final List u;
    private final List v;

    static {
        abhi abhiVar = new abhi((byte[]) null);
        abhiVar.a = false;
        abhiVar.d();
        c = abhiVar.c();
        CREATOR = new kbo();
    }

    public kbn(String str, List list, boolean z, kap kapVar, boolean z2, keh kehVar, boolean z3, double d, boolean z4, boolean z5, boolean z6, List list2, boolean z7, boolean z8, kbl kblVar, kbm kbmVar, boolean z9, boolean z10, Boolean bool) {
        this.d = true == TextUtils.isEmpty(str) ? "" : str;
        int size = list == null ? 0 : list.size();
        ArrayList arrayList = new ArrayList(size);
        this.u = arrayList;
        if (size > 0) {
            arrayList.addAll(list);
        }
        this.e = z;
        this.f = kapVar == null ? new kap() : kapVar;
        this.g = z2;
        this.h = kehVar;
        this.i = z3;
        this.j = d;
        this.k = z4;
        this.l = z5;
        this.m = z6;
        this.v = list2;
        this.n = z7;
        this.o = z8;
        this.p = kblVar;
        this.q = kbmVar;
        this.r = z9;
        this.s = z10;
        this.t = bool != null ? bool : z7 ? null : Boolean.FALSE;
    }

    public final List a() {
        return DesugarCollections.unmodifiableList(this.v);
    }

    public final List b() {
        return DesugarCollections.unmodifiableList(this.u);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.d;
        int iG = ksy.g(parcel, 20293);
        if (str != null) {
            int iG2 = ksy.g(parcel, 2);
            parcel.writeString(str);
            ksy.h(parcel, iG2);
        }
        List<String> listB = b();
        if (listB != null) {
            int iG3 = ksy.g(parcel, 3);
            parcel.writeStringList(listB);
            ksy.h(parcel, iG3);
        }
        boolean z = this.e;
        parcel.writeInt(262148);
        parcel.writeInt(z ? 1 : 0);
        kap kapVar = this.f;
        int iG4 = ksy.g(parcel, 5);
        kapVar.writeToParcel(parcel, i);
        ksy.h(parcel, iG4);
        boolean z2 = this.g;
        parcel.writeInt(262150);
        parcel.writeInt(z2 ? 1 : 0);
        ksy.A(parcel, 7, this.h, i);
        boolean z3 = this.i;
        parcel.writeInt(262152);
        parcel.writeInt(z3 ? 1 : 0);
        double d = this.j;
        parcel.writeInt(524297);
        parcel.writeDouble(d);
        boolean z4 = this.k;
        parcel.writeInt(262154);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z5 = this.l;
        parcel.writeInt(262155);
        parcel.writeInt(z5 ? 1 : 0);
        boolean z6 = this.m;
        parcel.writeInt(262156);
        parcel.writeInt(z6 ? 1 : 0);
        List<String> listA = a();
        if (listA != null) {
            int iG5 = ksy.g(parcel, 13);
            parcel.writeStringList(listA);
            ksy.h(parcel, iG5);
        }
        boolean z7 = this.n;
        parcel.writeInt(262158);
        parcel.writeInt(z7 ? 1 : 0);
        parcel.writeInt(262159);
        parcel.writeInt(0);
        boolean z8 = this.o;
        parcel.writeInt(262160);
        parcel.writeInt(z8 ? 1 : 0);
        ksy.A(parcel, 17, this.p, i);
        ksy.A(parcel, 18, this.q, i);
        boolean z9 = this.r;
        parcel.writeInt(262163);
        parcel.writeInt(z9 ? 1 : 0);
        boolean z10 = this.s;
        parcel.writeInt(262164);
        parcel.writeInt(z10 ? 1 : 0);
        ksy.o(parcel, 21, this.t);
        ksy.h(parcel, iG);
    }
}
