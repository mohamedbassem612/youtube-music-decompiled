package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
@sdn(b = aixo.SLOT_TYPE_BELOW_PLAYER_IMMERSIVE, d = {sjh.class, shw.class, siq.class})
@Deprecated
public final class rva extends rvo {
    public final smr a;
    public final aehs b;

    public rva(rvr rvrVar, aehs aehsVar, smr smrVar) {
        super(rvrVar);
        this.b = aehsVar;
        this.a = smrVar;
    }

    @Override // defpackage.rvo
    public final void b() {
        this.i.b(new rns(this, 8));
    }
}
