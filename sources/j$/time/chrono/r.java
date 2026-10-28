package j$.time.chrono;

import j$.time.temporal.Temporal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class r implements m {
    public static final r AH;
    public static final /* synthetic */ r[] a;

    static {
        r rVar = new r("AH", 0);
        AH = rVar;
        a = new r[]{rVar};
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) a.clone();
    }

    @Override // j$.time.temporal.k
    public final /* synthetic */ long C(j$.time.temporal.n nVar) {
        return j$.desugar.sun.nio.fs.g.l(this, nVar);
    }

    @Override // j$.time.temporal.k
    public final /* synthetic */ boolean d(j$.time.temporal.n nVar) {
        return j$.desugar.sun.nio.fs.g.n(this, nVar);
    }

    @Override // j$.time.chrono.m
    public final int getValue() {
        return 1;
    }

    @Override // j$.time.temporal.k
    public final /* synthetic */ int h(j$.time.temporal.n nVar) {
        return j$.desugar.sun.nio.fs.g.k(this, (j$.time.temporal.a) nVar);
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.q l(j$.time.temporal.n nVar) {
        return nVar == j$.time.temporal.a.ERA ? j$.time.temporal.q.f(1L, 1L) : j$.time.temporal.o.d(this, nVar);
    }

    @Override // j$.time.temporal.l
    public final Temporal p(Temporal temporal) {
        return temporal.a(1L, j$.time.temporal.a.ERA);
    }

    @Override // j$.time.temporal.k
    public final /* synthetic */ Object w(j$.desugar.sun.nio.fs.o oVar) {
        return j$.desugar.sun.nio.fs.g.r(this, oVar);
    }
}
