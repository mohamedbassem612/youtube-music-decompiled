package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zcp {
    public static zcp g(wgs wgsVar, zjv zjvVar, zkj zkjVar, boolean z) {
        String strB = txo.b(wgsVar.z());
        String strA = txo.a(wgsVar.z());
        int iAs = yno.as(zjvVar, z, !wgsVar.N());
        bsd bsdVar = new bsd();
        bsdVar.a = "video";
        bsdVar.a(strB);
        bsdVar.e(bsy.f(strA));
        bsdVar.k = strA;
        bsdVar.u = zkjVar.c;
        bsdVar.v = zkjVar.d;
        return new zbv(zjvVar, iAs, wgsVar, new bse(bsdVar));
    }

    public abstract int a();

    public abstract bse b();

    public abstract wgs c();

    public abstract zjv d();

    public bto e() {
        throw null;
    }

    public cqs f() {
        throw null;
    }
}
