package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sno implements Parcelable {
    public final List A;
    public final List B;
    public final List C;
    public final List D;
    public final List E;
    public final List F;
    public final List G;
    public final List H;
    public final List I;
    public final List J;
    public final List K;
    public final List L;
    public final int M;
    private final aivn O;
    public final List b;
    public final List c;
    public final List d;
    public final List e;
    public final List f;
    public final List g;
    public final List h;
    public final List i;
    public final List j;
    public final List k;
    public final List l;
    public final List m;
    public final List n;
    public final List o;
    public final List p;
    public final List q;
    public final List r;
    public final List s;
    public final List t;
    public final List u;
    public final List v;
    public final List w;
    public final List x;
    public final List y;
    public final List z;
    private static final agrf N = agrf.h("com/google/android/libraries/youtube/ads/model/VideoAdTrackingModel");
    public static final sno a = new sno(aivn.a);
    public static final Parcelable.Creator CREATOR = new pyc(18);

    public sno(aivn aivnVar) {
        aivnVar = aivnVar == null ? aivn.a : aivnVar;
        this.b = a(aivnVar.r);
        this.c = a(aivnVar.p);
        this.d = a(aivnVar.o);
        this.e = a(aivnVar.n);
        aive aiveVar = aivnVar.m;
        this.f = a((aiveVar == null ? aive.a : aiveVar).b);
        aive aiveVar2 = aivnVar.m;
        this.g = a((aiveVar2 == null ? aive.a : aiveVar2).c);
        aive aiveVar3 = aivnVar.m;
        int iAV = a.aV((aiveVar3 == null ? aive.a : aiveVar3).d);
        this.M = iAV == 0 ? 1 : iAV;
        this.h = a(aivnVar.k);
        this.i = a(aivnVar.i);
        this.j = a(aivnVar.w);
        this.k = a(aivnVar.q);
        this.l = a(aivnVar.c);
        this.m = a(aivnVar.t);
        this.n = a(aivnVar.l);
        this.o = a(aivnVar.b);
        this.p = a(aivnVar.x);
        a(aivnVar.d);
        this.q = a(aivnVar.f);
        this.r = a(aivnVar.j);
        this.s = a(aivnVar.g);
        this.t = a(aivnVar.u);
        this.u = a(aivnVar.h);
        this.v = a(aivnVar.s);
        this.w = a(aivnVar.v);
        a(aivnVar.k);
        a(aivnVar.y);
        a(aivnVar.z);
        this.x = a(aivnVar.K);
        this.y = a(aivnVar.H);
        this.z = a(aivnVar.F);
        this.A = a(aivnVar.P);
        this.B = a(aivnVar.J);
        this.C = a(aivnVar.B);
        this.D = a(aivnVar.M);
        this.E = a(aivnVar.I);
        this.F = a(aivnVar.A);
        a(aivnVar.C);
        this.G = a(aivnVar.D);
        a(aivnVar.G);
        this.H = a(aivnVar.E);
        this.I = a(aivnVar.N);
        this.J = a(aivnVar.L);
        this.K = a(aivnVar.O);
        this.L = a(aivnVar.Q);
        this.O = aivnVar;
    }

    private static agke a(List list) {
        if (list == null || list.isEmpty()) {
            return agpi.a;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aivk aivkVar = (aivk) it.next();
            if (!aivkVar.c.isEmpty()) {
                try {
                    tyu.c(aivkVar.c);
                    arrayList.add(aivkVar);
                } catch (MalformedURLException unused) {
                    ((agrc) ((agrc) N.c()).k("com/google/android/libraries/youtube/ads/model/VideoAdTrackingModel", "createTrackingPingList", 342, "VideoAdTrackingModel.java")).t("Badly formed uri - ignoring");
                }
            }
        }
        return agke.n(arrayList);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof sno) {
            return Objects.equals(this.O, ((sno) obj).O);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.O);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (parcel != null) {
            tym.u(this.O, parcel);
        }
    }
}
