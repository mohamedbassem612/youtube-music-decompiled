package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class anon extends tzk {
    private final aihf a;

    public anon(aihf aihfVar) {
        super(null);
        this.a = aihfVar;
    }

    @Override // defpackage.tzk
    public final /* bridge */ /* synthetic */ weh I(wek wekVar) {
        return an();
    }

    public final void am(Boolean bool) {
        aihf aihfVar = this.a;
        boolean zBooleanValue = bool.booleanValue();
        aihfVar.copyOnWrite();
        anow anowVar = (anow) aihfVar.instance;
        anow anowVar2 = anow.a;
        anowVar.b |= 2;
        anowVar.f = zBooleanValue;
    }

    public final anop an() {
        return new anop((anow) this.a.build());
    }
}
