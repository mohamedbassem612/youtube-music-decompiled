package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
@sdn(b = aixo.SLOT_TYPE_PLAYER_BYTES, d = {sip.class, sid.class, shl.class})
public final class rwl extends rvo {
    public final sdm a;
    public final aehs b;
    private final Executor c;
    private final Executor d;

    public rwl(rvr rvrVar, Executor executor, Executor executor2, sdm sdmVar, aehs aehsVar) {
        super(rvrVar);
        this.c = executor;
        this.d = executor2;
        this.a = sdmVar;
        this.b = aehsVar;
    }

    @Override // defpackage.rvo
    public final void b() {
        rwj rwjVar = new rwj(this, 0);
        rwk rwkVar = new rwk(0);
        this.i.a(rwjVar, this.c, this.d, rwkVar);
    }
}
