package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class utm implements utv {
    private final /* synthetic */ int $cid;
    private final Object a;

    public utm(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.utv
    public final /* synthetic */ String b() {
        return this.$cid != 0 ? yno.gq(this) : yno.gq(this);
    }

    @Override // defpackage.utx
    public final auhs h(auhs auhsVar) {
        if (this.$cid == 0) {
            auhq auhqVar = (auhq) auhsVar.toBuilder();
            auhqVar.d((augy) this.a);
            return (auhs) auhqVar.build();
        }
        Object obj = this.a;
        if (obj == null) {
            return auhsVar;
        }
        auhq auhqVar2 = (auhq) auhsVar.toBuilder();
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        auhqVar2.copyOnWrite();
        auhs auhsVar2 = (auhs) auhqVar2.instance;
        auhsVar2.b |= 8;
        auhsVar2.j = zBooleanValue;
        return (auhs) auhqVar2.build();
    }

    @Override // defpackage.uub
    public final /* synthetic */ void c(urz urzVar) {
    }
}
