package j$.time.chrono;

import j$.time.temporal.Temporal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class d0 implements m {
    public static final d0 BEFORE_ROC;
    public static final d0 ROC;
    public static final /* synthetic */ d0[] a;

    static {
        d0 d0Var = new d0("BEFORE_ROC", 0);
        BEFORE_ROC = d0Var;
        d0 d0Var2 = new d0("ROC", 1);
        ROC = d0Var2;
        a = new d0[]{d0Var, d0Var2};
    }

    public static d0 valueOf(String str) {
        return (d0) Enum.valueOf(d0.class, str);
    }

    public static d0[] values() {
        return (d0[]) a.clone();
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
        return ordinal();
    }

    @Override // j$.time.temporal.k
    public final /* synthetic */ int h(j$.time.temporal.n nVar) {
        return j$.desugar.sun.nio.fs.g.k(this, (j$.time.temporal.a) nVar);
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.q l(j$.time.temporal.n nVar) {
        return j$.time.temporal.o.d(this, nVar);
    }

    @Override // j$.time.temporal.l
    public final Temporal p(Temporal temporal) {
        return temporal.a(getValue(), j$.time.temporal.a.ERA);
    }

    @Override // j$.time.temporal.k
    public final /* synthetic */ Object w(j$.desugar.sun.nio.fs.o oVar) {
        return j$.desugar.sun.nio.fs.g.r(this, oVar);
    }
}
