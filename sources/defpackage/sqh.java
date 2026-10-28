package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class sqh {
    public final tbt a;
    public final Executor b;
    public final cf c;
    public final xgm d;
    public final abvk e;
    public sgs f;
    public sqn g;
    private final sof h;

    public sqh(ruf rufVar, tbt tbtVar, cf cfVar, xgm xgmVar, abvk abvkVar, Executor executor) {
        this.a = tbtVar;
        this.c = cfVar;
        this.d = xgmVar;
        this.e = abvkVar;
        this.b = executor;
        sqg sqgVar = new sqg(this);
        this.h = sqgVar;
        rufVar.a(sqgVar);
    }
}
