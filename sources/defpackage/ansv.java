package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ansv extends tzk {
    public final aihf a;

    public ansv(aihf aihfVar) {
        super(null);
        this.a = aihfVar;
    }

    @Override // defpackage.tzk
    public final /* bridge */ /* synthetic */ weh I(wek wekVar) {
        return new ansx((ansy) this.a.build());
    }

    public final void am(Long l) {
        aihf aihfVar = this.a;
        long jLongValue = l.longValue();
        aihfVar.copyOnWrite();
        ansy ansyVar = (ansy) aihfVar.instance;
        ansy ansyVar2 = ansy.a;
        ansyVar.b |= 4;
        ansyVar.e = jLongValue;
    }
}
