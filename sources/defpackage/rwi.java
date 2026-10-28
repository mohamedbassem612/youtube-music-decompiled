package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
@sdn(b = aixo.SLOT_TYPE_PLAYER_BYTES, d = {sid.class, sic.class, sjy.class, sjf.class})
public final class rwi extends rvo {
    public final aehs a;
    private final Executor b;
    private final Executor c;

    public rwi(rvr rvrVar, Executor executor, Executor executor2, aehs aehsVar) {
        super(rvrVar);
        this.b = executor;
        this.c = executor2;
        this.a = aehsVar;
    }

    @Override // defpackage.rvo
    public final void b() {
        rwj rwjVar = new rwj(this, 1);
        rwk rwkVar = new rwk(1);
        this.i.a(rwjVar, this.b, this.c, rwkVar);
    }
}
