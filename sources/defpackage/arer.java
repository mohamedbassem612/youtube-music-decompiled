package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class arer extends tzk {
    public final aihf a;

    private arer() {
        super(null);
        this.a = areu.a.createBuilder();
    }

    @Override // defpackage.tzk
    public final /* bridge */ /* synthetic */ weh I(wek wekVar) {
        return aq();
    }

    public final String am() {
        return ((areu) this.a.build()).d;
    }

    public final void an(Long l) {
        aihf aihfVar = this.a;
        long jLongValue = l.longValue();
        aihfVar.copyOnWrite();
        areu areuVar = (areu) aihfVar.instance;
        areu areuVar2 = areu.a;
        areuVar.c |= 4;
        areuVar.f = jLongValue;
    }

    public final void ao(Long l) {
        aihf aihfVar = this.a;
        long jLongValue = l.longValue();
        aihfVar.copyOnWrite();
        areu areuVar = (areu) aihfVar.instance;
        areu areuVar2 = areu.a;
        areuVar.c |= 8;
        areuVar.g = jLongValue;
    }

    public final void ap(String str) {
        aihf aihfVar = this.a;
        aihfVar.copyOnWrite();
        areu areuVar = (areu) aihfVar.instance;
        areu areuVar2 = areu.a;
        str.getClass();
        areuVar.c |= 2;
        areuVar.e = str;
    }

    public final aret aq() {
        return new aret((areu) this.a.build());
    }

    public arer(aihf aihfVar) {
        super(null);
        this.a = aihfVar;
    }
}
