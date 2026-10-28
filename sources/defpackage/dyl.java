package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dyl {
    public final Executor a;
    public final awou b;
    public final Executor c;
    public final dzv d;
    public final dzp e;
    public final axo f;
    public final String g;
    public final int h;
    public final int i;
    public final azx j;
    public final bnz k;

    /* JADX WARN: Code duplicated, block: B:11:0x0024  */
    public dyl(dyj dyjVar) {
        awou awouVarF = dyjVar.b;
        Executor executorE = dyjVar.a;
        if (executorE == null) {
            if (awouVarF != null) {
                awor aworVar = (awor) awouVarF.get(awor.j);
                awuq awuqVar = aworVar instanceof awuq ? (awuq) aworVar : null;
                if (awuqVar != null) {
                    executorE = awuw.e(awuqVar);
                } else {
                    executorE = null;
                }
            } else {
                executorE = null;
            }
            if (executorE == null) {
                awuq awuqVar2 = awvi.a;
                int iMax = Math.max(1, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4));
                awon awonVar = awuq.k;
                executorE = awuw.e(awuqVar2.e(iMax));
            }
        }
        this.a = executorE;
        if (awouVarF == null) {
            awouVarF = dyjVar.a != null ? awuw.f(executorE) : awvi.a;
        }
        this.b = awouVarF;
        Executor executor = dyjVar.d;
        this.c = executor == null ? awuw.e(awvi.a) : executor;
        this.k = new bnz();
        dzv dzvVar = dyjVar.c;
        this.d = dzvVar == null ? dyr.a : dzvVar;
        dzp dzpVar = dyjVar.e;
        this.e = dzpVar == null ? new dzz() : dzpVar;
        this.h = 4;
        this.i = 20;
        this.f = null;
        this.g = dyjVar.f;
        this.j = new azx(null);
    }
}
