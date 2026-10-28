package defpackage;

import java.util.Set;
import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class ahdi extends agec {
    static final agej a = new agej();
    static final Set b = ahng.aj();
    final ahdk c;

    public ahdi(ahdm ahdmVar) {
        super(ahdmVar, a);
        this.c = ahdmVar.c;
    }

    @Override // defpackage.aged
    public final void finalizeReferent() {
        b.remove(this);
        ahdk ahdkVar = this.c;
        if (((ahdl) ahdkVar.a.get()).equals(ahdl.a)) {
            ahdm.a.a().logp(Level.SEVERE, "com.google.common.util.concurrent.ClosingFuture$State", "closeIfLeaked", "Uh oh! An open ClosingFuture has leaked and will close: {0}", ahdkVar);
            ahdkVar.d();
        }
    }
}
