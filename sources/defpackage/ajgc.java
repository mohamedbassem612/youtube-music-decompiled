package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ajgc extends tzk {
    private final aihf a;

    public ajgc(aihf aihfVar) {
        super(null);
        this.a = aihfVar;
    }

    @Override // defpackage.tzk
    public final /* bridge */ /* synthetic */ weh I(wek wekVar) {
        return new ajgd((ajge) this.a.build());
    }

    public final void am(String str) {
        aihf aihfVar = this.a;
        aihfVar.copyOnWrite();
        ajge ajgeVar = (ajge) aihfVar.instance;
        ajge ajgeVar2 = ajge.a;
        str.getClass();
        ajgeVar.c |= 2;
        ajgeVar.e = str;
    }

    public final void an(ajgf ajgfVar) {
        aihf aihfVar = this.a;
        aihfVar.copyOnWrite();
        ajge ajgeVar = (ajge) aihfVar.instance;
        ajge ajgeVar2 = ajge.a;
        ajgeVar.f = ajgfVar.e;
        ajgeVar.c |= 4;
    }
}
