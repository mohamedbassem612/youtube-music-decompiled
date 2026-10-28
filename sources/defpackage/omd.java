package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class omd implements aupn {
    private final aupr a;
    private final aupr b;
    private final aupr c;
    private final aupr d;
    private final aupr e;

    public omd(aupr auprVar, aupr auprVar2, aupr auprVar3, aupr auprVar4, aupr auprVar5) {
        this.a = auprVar;
        this.b = auprVar2;
        this.c = auprVar3;
        this.d = auprVar4;
        this.e = auprVar5;
    }

    @Override // defpackage.awmd, defpackage.awmc
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final omc io() {
        return new omc(((omk) this.a).io(), (omj) this.b.io(), (qnl) this.c.io(), (agev) this.d.io(), (Executor) this.e.io());
    }
}
