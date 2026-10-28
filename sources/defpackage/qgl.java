package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qgl extends nrd implements qfh {
    public final qfg a;
    public final aunn b;
    private final awmd c;

    static {
        new ager(" -> ");
    }

    public qgl(axfd axfdVar, aunn aunnVar, Executor executor, awmd awmdVar) {
        new ArrayDeque();
        this.a = axfdVar.V(executor, aunnVar, null);
        this.b = aunnVar;
        this.c = awmdVar;
    }

    @Override // defpackage.qfh
    public final void k() {
        Thread.setDefaultUncaughtExceptionHandler(new rfv(this, Thread.getDefaultUncaughtExceptionHandler(), 1));
        tld tldVar = (tld) this.c.io();
        ((kjc) tldVar.a).E(new qgm(tldVar));
    }
}
