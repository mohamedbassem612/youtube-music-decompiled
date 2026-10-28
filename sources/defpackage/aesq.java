package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aesq {
    public final Object a;
    public final Object b;
    public volatile Object c;

    public aesq() {
        awku awkuVarAC = awku.aC(aatf.a);
        this.b = awkuVarAC;
        this.a = awkuVarAC.aI();
        this.c = null;
    }

    public final aatf a() {
        aatf aatfVar = (aatf) ((awku) this.b).aD();
        return aatfVar == null ? aatf.a : aatfVar;
    }

    public final void b(aatf aatfVar) {
        ((awkv) this.a).kk(aatfVar);
    }

    public aesq(aczl aczlVar, Executor executor) {
        aczlVar.getClass();
        this.a = aczlVar;
        executor.getClass();
        this.b = executor;
    }

    public aesq(aess aessVar, awmd awmdVar) {
        this.a = aessVar;
        this.b = awmdVar;
    }
}
