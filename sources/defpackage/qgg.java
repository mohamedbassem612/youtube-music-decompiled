package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qgg extends qnl implements qfh {
    public final qfg a;
    public final Context b;
    public final Executor c;
    public final awmd d;
    public final aunn e;
    public final awmd f;
    public final awmd g;
    public final awmd h;
    public final qge i;
    public final qdc j;
    public final rrq k;

    public qgg(axfd axfdVar, Context context, Executor executor, qge qgeVar, awmd awmdVar, aunn aunnVar, qdc qdcVar, rrq rrqVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4) {
        super((short[]) null);
        this.a = axfdVar.V(executor, aunnVar, null);
        this.b = context;
        this.c = executor;
        this.i = qgeVar;
        this.d = awmdVar;
        this.j = qdcVar;
        this.k = rrqVar;
        this.e = aunnVar;
        this.f = awmdVar2;
        this.g = awmdVar3;
        this.h = awmdVar4;
    }

    @Override // defpackage.qfh
    public final void k() {
        ahfo ahfoVar = new ahfo(new ojf(this, 8));
        Executor executor = this.c;
        executor.execute(ahfoVar);
        executor.execute(new ahfo(Executors.callable(new mbo(this, 6), null)));
    }
}
