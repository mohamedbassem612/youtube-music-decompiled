package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class antu extends tzk {
    private final aihf a;

    public antu(aihf aihfVar) {
        super(null);
        this.a = aihfVar;
    }

    @Override // defpackage.tzk
    public final /* bridge */ /* synthetic */ weh I(wek wekVar) {
        return new antw((antx) this.a.build());
    }

    public final void am(antt anttVar) {
        aihf aihfVar = this.a;
        aihfVar.copyOnWrite();
        antx antxVar = (antx) aihfVar.instance;
        antx antxVar2 = antx.a;
        antxVar.d = anttVar.e;
        antxVar.b |= 2;
    }

    public final void an(aihf aihfVar) {
        aihf aihfVar2 = this.a;
        aihfVar2.copyOnWrite();
        antx antxVar = (antx) aihfVar2.instance;
        anty antyVar = (anty) aihfVar.build();
        antx antxVar2 = antx.a;
        antyVar.getClass();
        antxVar.e = antyVar;
        antxVar.b |= 4;
    }
}
