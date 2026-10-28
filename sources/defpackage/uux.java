package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class uux implements utv {
    private final aigw a;

    public uux(aigw aigwVar) {
        this.a = aigwVar;
    }

    public abstract Object a(Object obj);

    @Override // defpackage.utv
    public final /* synthetic */ String b() {
        return yno.gq(this);
    }

    @Override // defpackage.utx
    public final auhs h(auhs auhsVar) {
        auhsVar.getClass();
        aiie aiieVar = auhsVar.f;
        aiieVar.getClass();
        aigw aigwVar = this.a;
        Object objA = a(yno.gh(aiieVar, aigwVar));
        if (objA != null) {
            return yno.gg(auhsVar, aigwVar, new rla(objA, 16));
        }
        auhq auhqVar = (auhq) auhsVar.toBuilder();
        auhqVar.copyOnWrite();
        ((auhs) auhqVar.instance).f = auhs.emptyProtobufList();
        aiie aiieVar2 = auhsVar.f;
        aiieVar2.getClass();
        auhqVar.c(yno.gj(aiieVar2, aigwVar));
        aihn aihnVarBuild = auhqVar.build();
        aihnVarBuild.getClass();
        return (auhs) aihnVarBuild;
    }

    @Override // defpackage.uub
    public final void c(urz urzVar) {
    }
}
