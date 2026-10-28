package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ajlt extends tzk {
    private final aihf a;

    public ajlt(aihf aihfVar) {
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
        ajlv ajlvVar = (ajlv) aihfVar.instance;
        ajlv ajlvVar2 = ajlv.a;
        ajlvVar.c |= 2;
        ajlvVar.e = zBooleanValue;
    }

    public final ajlu an() {
        return new ajlu((ajlv) this.a.build());
    }
}
