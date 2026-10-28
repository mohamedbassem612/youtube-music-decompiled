package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
@sdn(b = aixo.SLOT_TYPE_BELOW_PLAYER_IMMERSIVE, d = {shn.class, shr.class, sib.class, siq.class, sjh.class, sjv.class, sjt.class})
@Deprecated
public final class rvk extends rvo {
    public final smr a;
    public final aehs b;

    public rvk(rvr rvrVar, aehs aehsVar, smr smrVar) {
        super(rvrVar);
        this.b = aehsVar;
        this.a = smrVar;
    }

    @Override // defpackage.rvo
    public final void b() {
        smr smrVar = this.a;
        this.i.b(new hco(this, (!smrVar.e(shw.class) || smrVar.d(shw.class) == null) ? agdf.a : agev.i((ajlj) smrVar.d(shw.class)), (List) smrVar.d(shr.class), 8, (byte[]) null));
    }
}
