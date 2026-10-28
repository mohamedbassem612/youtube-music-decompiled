package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wtr extends wnn {
    private final zwb c;
    private final wnh d;
    private final wnh e;
    private final awmd f;
    private final tfq g;
    private final tqa h;

    public wtr(wlp wlpVar, abxv abxvVar, zwb zwbVar, tgg tggVar, tfq tfqVar, tqa tqaVar, awmd awmdVar) {
        super(abxvVar, tggVar);
        this.c = zwbVar;
        this.d = f(alyd.a, wlpVar, new wsj(7), new wtk(2));
        this.e = f(alya.a, wlpVar, new wsj(8), new wtk(3));
        f(alqn.a, wlpVar, new wsj(9), new wtk(4));
        tfqVar.getClass();
        this.g = tfqVar;
        tqaVar.getClass();
        this.h = tqaVar;
        this.f = awmdVar;
    }

    public final wts a(String str) {
        wts wtsVar = new wts(this.b, this.c.e(), str, this.g, this.h);
        wtsVar.r = (String) this.f.io();
        return wtsVar;
    }

    public final wtx b() {
        wtx wtxVar = new wtx(this.b, this.c.e());
        wtxVar.r = (String) this.f.io();
        return wtxVar;
    }

    public final ListenableFuture c(wts wtsVar) {
        return ahcs.e(this.e.a(wtsVar), new vxq(13), MoreExecutors.directExecutor());
    }

    public final ListenableFuture d(wtx wtxVar) {
        return this.d.a(wtxVar);
    }
}
