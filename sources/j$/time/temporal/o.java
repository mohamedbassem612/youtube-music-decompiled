package j$.time.temporal;

import j$.util.Objects;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class o {
    public static final j$.desugar.sun.nio.fs.o a = new j$.desugar.sun.nio.fs.o(4);
    public static final j$.desugar.sun.nio.fs.o b = new j$.desugar.sun.nio.fs.o(5);
    public static final j$.desugar.sun.nio.fs.o c = new j$.desugar.sun.nio.fs.o(6);
    public static final j$.desugar.sun.nio.fs.o d = new j$.desugar.sun.nio.fs.o(7);
    public static final j$.desugar.sun.nio.fs.o e = new j$.desugar.sun.nio.fs.o(8);
    public static final j$.desugar.sun.nio.fs.o f = new j$.desugar.sun.nio.fs.o(9);
    public static final j$.desugar.sun.nio.fs.o g = new j$.desugar.sun.nio.fs.o(10);

    public static int a(k kVar, n nVar) {
        q qVarL = kVar.l(nVar);
        if (!qVarL.d()) {
            j$.time.g.e(j$.desugar.sun.nio.fs.i.a("Invalid field ", String.valueOf(nVar), " for get() method, use getLong() instead"));
            return 0;
        }
        long jC = kVar.C(nVar);
        if (qVarL.e(jC)) {
            return (int) jC;
        }
        throw new j$.time.b("Invalid value for " + String.valueOf(nVar) + " (valid values " + String.valueOf(qVarL) + "): " + jC);
    }

    public static Temporal b(Temporal temporal, long j, TemporalUnit temporalUnit) {
        long j2;
        if (j == Long.MIN_VALUE) {
            temporal = temporal.b(Long.MAX_VALUE, temporalUnit);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return temporal.b(j2, temporalUnit);
    }

    public static Object c(k kVar, j$.desugar.sun.nio.fs.o oVar) {
        if (oVar == a || oVar == b || oVar == c) {
            return null;
        }
        return oVar.c(kVar);
    }

    public static q d(k kVar, n nVar) {
        if (!(nVar instanceof a)) {
            Objects.a(nVar, "field");
            return nVar.k(kVar);
        }
        if (kVar.d(nVar)) {
            return ((a) nVar).b;
        }
        j$.time.g.e("Unsupported field: ".concat(String.valueOf(nVar)));
        return null;
    }
}
