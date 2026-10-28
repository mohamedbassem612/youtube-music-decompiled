package defpackage;

import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wxa extends wxe {
    public final wqx f;
    private final Executor h;

    public wxa(wqx wqxVar, tbt tbtVar, ttm ttmVar, wwn wwnVar, xgm xgmVar, Executor executor) {
        super(wqxVar, tbtVar, ttmVar, wwnVar, xgmVar);
        this.f = wqxVar;
        this.h = executor;
    }

    @Override // defpackage.adtv
    public final void iM(acjx acjxVar) {
        wqs wqsVarG = this.f.g();
        wqsVarG.q(acjxVar);
        u(wqsVarG, acjxVar, null);
    }

    @Override // defpackage.wxe, defpackage.wwy
    public final boolean l() {
        return true;
    }

    public final void u(wlu wluVar, acjx acjxVar, Runnable runnable) {
        taf.i(this.f.b(wluVar, new wwz(), this.h), MoreExecutors.directExecutor(), new hfg(this, wluVar, acjxVar, runnable, 7), new itt(this, runnable, 20), null);
    }
}
