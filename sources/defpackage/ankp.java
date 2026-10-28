package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ankp extends tzk {
    private final aihf a;

    public ankp(aihf aihfVar) {
        super(null);
        this.a = aihfVar;
    }

    @Override // defpackage.tzk
    public final /* bridge */ /* synthetic */ weh I(wek wekVar) {
        return an();
    }

    public final void am(aqmh aqmhVar) {
        aihf aihfVar = this.a;
        aihfVar.copyOnWrite();
        ankw ankwVar = (ankw) aihfVar.instance;
        ankw ankwVar2 = ankw.a;
        aqmhVar.getClass();
        ankwVar.f = aqmhVar;
        ankwVar.b |= 8;
    }

    public final ankr an() {
        return new ankr((ankw) this.a.build());
    }
}
