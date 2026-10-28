package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anme extends tzk {
    private final aihf a;

    public anme(aihf aihfVar) {
        super(null);
        this.a = aihfVar;
    }

    @Override // defpackage.tzk
    public final /* bridge */ /* synthetic */ weh I(wek wekVar) {
        return ao();
    }

    public final void am(anmd anmdVar) {
        aihf aihfVar = this.a;
        aihfVar.copyOnWrite();
        anmh anmhVar = (anmh) aihfVar.instance;
        anmh anmhVar2 = anmh.a;
        anmdVar.getClass();
        anmhVar.e = anmdVar;
        anmhVar.b |= 4;
    }

    public final void an(anmd anmdVar) {
        aihf aihfVar = this.a;
        aihfVar.copyOnWrite();
        anmh anmhVar = (anmh) aihfVar.instance;
        anmh anmhVar2 = anmh.a;
        anmdVar.getClass();
        anmhVar.f = anmdVar;
        anmhVar.b |= 8;
    }

    public final anmg ao() {
        return new anmg((anmh) this.a.build());
    }
}
