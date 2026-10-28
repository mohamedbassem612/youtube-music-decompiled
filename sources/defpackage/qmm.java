package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qmm {
    private final AtomicReferenceArray a;
    private final omm b;

    public qmm(omm ommVar, int i) {
        this.b = ommVar;
        this.a = new AtomicReferenceArray(i);
    }

    public final qmc a(int i, String str, double d) {
        AtomicReferenceArray atomicReferenceArray = this.a;
        qmc qmcVar = (qmc) atomicReferenceArray.get(i);
        if (qmcVar != null) {
            return qmcVar;
        }
        qmc qmcVarT = this.b.t(str, d);
        if (qnl.o(atomicReferenceArray, i, qmcVarT)) {
            return qmcVarT;
        }
        qmc qmcVar2 = (qmc) atomicReferenceArray.get(i);
        qmcVar2.getClass();
        return qmcVar2;
    }

    public final qmc b(int i, String str, long j) {
        AtomicReferenceArray atomicReferenceArray = this.a;
        qmc qmcVar = (qmc) atomicReferenceArray.get(i);
        if (qmcVar != null) {
            return qmcVar;
        }
        qmc qmcVarU = this.b.u(str, j);
        if (qnl.o(atomicReferenceArray, i, qmcVarU)) {
            return qmcVarU;
        }
        qmc qmcVar2 = (qmc) atomicReferenceArray.get(i);
        qmcVar2.getClass();
        return qmcVar2;
    }

    public final qmc c(int i, String str, String str2) {
        AtomicReferenceArray atomicReferenceArray = this.a;
        qmc qmcVar = (qmc) atomicReferenceArray.get(i);
        if (qmcVar != null) {
            return qmcVar;
        }
        qmc qmcVarV = this.b.v(str, str2);
        if (qnl.o(atomicReferenceArray, i, qmcVarV)) {
            return qmcVarV;
        }
        qmc qmcVar2 = (qmc) atomicReferenceArray.get(i);
        qmcVar2.getClass();
        return qmcVar2;
    }

    public final qmc d(int i, String str, boolean z) {
        AtomicReferenceArray atomicReferenceArray = this.a;
        qmc qmcVar = (qmc) atomicReferenceArray.get(i);
        if (qmcVar != null) {
            return qmcVar;
        }
        qmc qmcVarW = this.b.w(str, z);
        if (qnl.o(atomicReferenceArray, i, qmcVarW)) {
            return qmcVarW;
        }
        qmc qmcVar2 = (qmc) atomicReferenceArray.get(i);
        qmcVar2.getClass();
        return qmcVar2;
    }

    public final qmc e(int i, String str, qln qlnVar, String str2) {
        AtomicReferenceArray atomicReferenceArray = this.a;
        qmc qmcVar = (qmc) atomicReferenceArray.get(i);
        if (qmcVar != null) {
            return qmcVar;
        }
        qmc qmcVarX = this.b.x(str, qlnVar, str2);
        if (qnl.o(atomicReferenceArray, i, qmcVarX)) {
            return qmcVarX;
        }
        qmc qmcVar2 = (qmc) atomicReferenceArray.get(i);
        qmcVar2.getClass();
        return qmcVar2;
    }
}
