package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uuu implements utv {
    private final /* synthetic */ int $cid;
    public final aihn a;

    public uuu(aihn aihnVar, int i) {
        this.$cid = i;
        this.a = aihnVar;
    }

    @Override // defpackage.utv
    public final /* synthetic */ String b() {
        return this.$cid != 0 ? yno.gq(this) : yno.gq(this);
    }

    @Override // defpackage.utx
    public final auhs h(auhs auhsVar) throws utw {
        if (this.$cid != 0) {
            auhsVar.getClass();
            aihl aihlVar = auge.b;
            aihlVar.getClass();
            return yno.gg(auhsVar, aihlVar, new rla(this, 13));
        }
        auhsVar.getClass();
        aihn aihnVar = this.a;
        akcw akcwVar = (akcw) aihnVar;
        if ((akcwVar.b & 1) == 0) {
            throw new utw(new IllegalArgumentException("Added composition asset must have an ID"), this);
        }
        aiie aiieVar = auhsVar.n;
        aiieVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : aiieVar) {
            if (!awrc.c(((akcw) obj).e, akcwVar.e)) {
                arrayList.add(obj);
            }
        }
        auhq auhqVar = (auhq) auhsVar.toBuilder();
        auhqVar.copyOnWrite();
        ((auhs) auhqVar.instance).n = auhs.emptyProtobufList();
        auhqVar.copyOnWrite();
        auhs auhsVar2 = (auhs) auhqVar.instance;
        auhsVar2.b();
        aifs.addAll(arrayList, auhsVar2.n);
        auhqVar.copyOnWrite();
        auhs auhsVar3 = (auhs) auhqVar.instance;
        auhsVar3.b();
        auhsVar3.n.add(aihnVar);
        aihn aihnVarBuild = auhqVar.build();
        aihnVarBuild.getClass();
        return (auhs) aihnVarBuild;
    }

    @Override // defpackage.uub
    public final /* synthetic */ void c(urz urzVar) {
    }
}
