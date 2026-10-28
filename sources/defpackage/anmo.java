package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class anmo extends tzk {
    public final aihf a;

    public anmo(aihf aihfVar) {
        super(null);
        this.a = aihfVar;
    }

    @Override // defpackage.tzk
    public final /* bridge */ /* synthetic */ weh I(wek wekVar) {
        return an();
    }

    public final void am(aolh aolhVar) {
        aihf aihfVar = this.a;
        aihfVar.copyOnWrite();
        anmr anmrVar = (anmr) aihfVar.instance;
        anmr anmrVar2 = anmr.a;
        anmrVar.e = aolhVar.d;
        anmrVar.b |= 4;
    }

    public final anmq an() {
        return new anmq((anmr) this.a.build());
    }
}
