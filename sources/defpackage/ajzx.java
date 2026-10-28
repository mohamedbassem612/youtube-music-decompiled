package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ajzx extends tzk {
    private final aihf a;

    public ajzx(aihf aihfVar) {
        super(null);
        this.a = aihfVar;
    }

    @Override // defpackage.tzk
    public final /* bridge */ /* synthetic */ weh I(wek wekVar) {
        return an();
    }

    public final void am(akad akadVar) {
        aihf aihfVar = this.a;
        aihfVar.copyOnWrite();
        akaa akaaVar = (akaa) aihfVar.instance;
        akaa akaaVar2 = akaa.a;
        akadVar.getClass();
        akaaVar.d = akadVar;
        akaaVar.b |= 2;
    }

    public final ajzz an() {
        return new ajzz((akaa) this.a.build());
    }
}
