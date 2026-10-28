package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class amlb extends tzk {
    private final aihf a;

    public amlb(aihf aihfVar) {
        super(null);
        this.a = aihfVar;
    }

    @Override // defpackage.tzk
    public final /* bridge */ /* synthetic */ weh I(wek wekVar) {
        return an();
    }

    public final void am(amlg amlgVar) {
        aihf aihfVar = this.a;
        aihfVar.copyOnWrite();
        amle amleVar = (amle) aihfVar.instance;
        amle amleVar2 = amle.a;
        amleVar.d = amlgVar.e;
        amleVar.b |= 2;
    }

    public final amld an() {
        return new amld((amle) this.a.build());
    }
}
