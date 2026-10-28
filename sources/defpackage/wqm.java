package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wqm extends wnn {
    private final zwb c;
    private final wnh d;
    private final wnh e;
    private final wnh f;

    public wqm(wlp wlpVar, abxv abxvVar, zwb zwbVar, tgg tggVar) {
        super(abxvVar, tggVar);
        this.c = zwbVar;
        int i = 1;
        this.d = f(alrk.a, wlpVar, new wql(i), new het(19));
        this.e = f(alri.a, wlpVar, new wql(0), new het(20));
        this.f = f(alrm.a, wlpVar, new wql(2), new wre(i));
    }

    public final wqn a() {
        return new wqn(this.b, this.c.e());
    }

    public final wqo b() {
        return new wqo(this.b, this.c.e());
    }

    public final wqp c() {
        return new wqp(this.b, this.c.e());
    }

    public final ListenableFuture d(wqn wqnVar, Executor executor) {
        return this.e.b(wqnVar, executor, null);
    }

    public final ListenableFuture g(wqo wqoVar, Executor executor) {
        return this.d.b(wqoVar, executor, null);
    }

    public final ListenableFuture h(wqp wqpVar, Executor executor) {
        return this.f.b(wqpVar, executor, null);
    }

    public final heu i() {
        return new heu(this.b, this.c.e());
    }

    public final hev j() {
        return new hev(this.b, this.c.e());
    }

    public final hew k() {
        return new hew(this.b, this.c.e());
    }

    public final ListenableFuture l(heu heuVar) {
        heuVar.m();
        return this.e.b(heuVar, MoreExecutors.directExecutor(), null);
    }

    public final ListenableFuture m(hev hevVar) {
        hevVar.m();
        return this.d.b(hevVar, MoreExecutors.directExecutor(), null);
    }

    public final ListenableFuture n(hew hewVar) {
        hewVar.m();
        return this.f.b(hewVar, MoreExecutors.directExecutor(), null);
    }

    public wqm(wlp wlpVar, abxv abxvVar, zwb zwbVar, tgg tggVar, byte[] bArr) {
        super(abxvVar, tggVar);
        this.c = zwbVar;
        this.d = f(amzv.a, wlpVar, new hes(1), new het(1));
        this.e = f(amzs.a, wlpVar, new hes(0), new het(0));
        this.f = f(anab.a, wlpVar, new hes(2), new het(2));
    }
}
