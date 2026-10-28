package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uum implements utv {
    private final int a;

    public uum(int i) {
        this.a = i;
    }

    @Override // defpackage.utv
    public final /* synthetic */ String b() {
        return yno.gq(this);
    }

    @Override // defpackage.utx
    public final auhs h(auhs auhsVar) {
        auhq auhqVar = (auhq) auhsVar.toBuilder();
        auhqVar.copyOnWrite();
        auhs auhsVar2 = (auhs) auhqVar.instance;
        auhsVar2.b |= 16;
        auhsVar2.l = this.a;
        return (auhs) auhqVar.build();
    }

    @Override // defpackage.uub
    public final /* synthetic */ void c(urz urzVar) {
    }
}
