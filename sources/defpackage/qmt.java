package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qmt implements qmy {
    private static boolean b;
    public final agfr a;
    private final agfr c;
    private final int d;

    public qmt(agfr agfrVar) {
        jxp jxpVar = new jxp(13);
        this.c = agfrVar;
        this.d = 10;
        this.a = jxpVar;
    }

    @Override // defpackage.qmy
    public final void a() {
        synchronized (qmt.class) {
            if (!b) {
                qca qcaVar = new qca(this, 13);
                long j = this.d;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                ahey aheyVar = (ahey) this.c.io();
                qnl.n(aheyVar.schedule(new spu(qcaVar, aheyVar, j, timeUnit, 1), j, timeUnit));
                b = true;
            }
        }
    }
}
