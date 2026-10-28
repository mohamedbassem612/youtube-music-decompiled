package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
@sdn(b = aixo.SLOT_TYPE_BELOW_PLAYER, d = {sjh.class, shz.class, sid.class, sib.class, shn.class, siq.class, sic.class})
@Deprecated
public final class rvz extends rvo {
    public final smr a;
    public final aehs b;
    private final Executor c;
    private final Executor d;

    public rvz(rvr rvrVar, Executor executor, Executor executor2, aehs aehsVar, smr smrVar) {
        super(rvrVar);
        this.c = executor;
        this.d = executor2;
        this.b = aehsVar;
        this.a = smrVar;
    }

    @Override // defpackage.rvo
    public final void b() {
        ListenableFuture listenableFuture = (ListenableFuture) this.a.d(shz.class);
        kjh kjhVar = new kjh(this, listenableFuture, 19, null);
        boolean zIsDone = listenableFuture.isDone();
        rvr rvrVar = this.i;
        if (zIsDone) {
            rvrVar.b(kjhVar);
        } else {
            rvrVar.a(kjhVar, this.c, this.d, null);
        }
    }
}
