package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aohi extends tzk {
    public final aihf a;

    private aohi() {
        super(null);
        this.a = aohl.a.createBuilder();
    }

    @Override // defpackage.tzk
    public final /* bridge */ /* synthetic */ weh I(wek wekVar) {
        return as();
    }

    public final void am(aohh aohhVar) {
        aihf aihfVar = this.a;
        aihfVar.copyOnWrite();
        aohl aohlVar = (aohl) aihfVar.instance;
        aohl aohlVar2 = aohl.a;
        aohlVar.d = aohhVar.e;
        aohlVar.b |= 2;
    }

    public final void an(Long l) {
        aihf aihfVar = this.a;
        long jLongValue = l.longValue();
        aihfVar.copyOnWrite();
        aohl aohlVar = (aohl) aihfVar.instance;
        aohl aohlVar2 = aohl.a;
        aohlVar.b |= 4;
        aohlVar.e = jLongValue;
    }

    public final void ao(Long l) {
        aihf aihfVar = this.a;
        long jLongValue = l.longValue();
        aihfVar.copyOnWrite();
        aohl aohlVar = (aohl) aihfVar.instance;
        aohl aohlVar2 = aohl.a;
        aohlVar.b |= 32;
        aohlVar.h = jLongValue;
    }

    public final void ap(aoeu aoeuVar) {
        aihf aihfVar = this.a;
        aihfVar.copyOnWrite();
        aohl aohlVar = (aohl) aihfVar.instance;
        aohl aohlVar2 = aohl.a;
        aoeuVar.getClass();
        aohlVar.g = aoeuVar;
        aohlVar.b |= 16;
    }

    public final void aq(aigj aigjVar) {
        aihf aihfVar = this.a;
        aihfVar.copyOnWrite();
        aohl aohlVar = (aohl) aihfVar.instance;
        aohl aohlVar2 = aohl.a;
        aohlVar.b |= 8;
        aohlVar.f = aigjVar;
    }

    public final void ar(aoet aoetVar) {
        aihf aihfVar = this.a;
        aihfVar.copyOnWrite();
        aohl aohlVar = (aohl) aihfVar.instance;
        aohl aohlVar2 = aohl.a;
        aoetVar.getClass();
        aohlVar.i = aoetVar;
        aohlVar.b |= 64;
    }

    public final aohk as() {
        return new aohk((aohl) this.a.build());
    }

    public aohi(aihf aihfVar) {
        super(null);
        this.a = aihfVar;
    }
}
