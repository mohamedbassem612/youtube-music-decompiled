package defpackage;

import j$.util.DesugarCollections;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class utp implements utv {
    private final long a;
    private final Optional b;
    private final boolean c;

    public utp(long j, Optional optional, boolean z) {
        this.a = j;
        this.b = optional;
        this.c = z;
    }

    @Override // defpackage.utv
    public final /* synthetic */ String b() {
        return yno.gq(this);
    }

    @Override // defpackage.utx
    public final auhs h(auhs auhsVar) {
        auhq auhqVar = (auhq) auhsVar.toBuilder();
        aihf aihfVarCreateBuilder = aufw.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        aufw aufwVar = (aufw) aihfVarCreateBuilder.instance;
        aufwVar.b |= 1;
        aufwVar.c = this.a;
        aihfVarCreateBuilder.copyOnWrite();
        aufw aufwVar2 = (aufw) aihfVarCreateBuilder.instance;
        aufwVar2.b |= 4;
        aufwVar2.e = this.c;
        urh urhVar = new urh(aihfVarCreateBuilder, 3);
        Optional optional = this.b;
        if (true == optional.isPresent()) {
            Object obj = optional.get();
            Object obj2 = urhVar.a;
            long jLongValue = ((Long) obj).longValue();
            aihf aihfVar = (aihf) obj2;
            aihfVar.copyOnWrite();
            aufw aufwVar3 = (aufw) aihfVar.instance;
            aufwVar3.b |= 2;
            aufwVar3.d = jLongValue;
        }
        aihf builder = yno.gv(auhsVar).toBuilder();
        builder.copyOnWrite();
        aufx aufxVar = (aufx) builder.instance;
        aufw aufwVar4 = (aufw) aihfVarCreateBuilder.build();
        aufwVar4.getClass();
        aufxVar.a();
        aufxVar.c.add(aufwVar4);
        aufx aufxVar2 = (aufx) builder.build();
        aihl aihlVar = aufx.b;
        int iGe = yno.ge(DesugarCollections.unmodifiableList(((auhs) auhqVar.instance).f), aihlVar);
        aihh aihhVar = (aihh) aufs.a.createBuilder();
        aihhVar.e(aihlVar, aufxVar2);
        aufs aufsVar = (aufs) aihhVar.build();
        if (iGe == -1) {
            auhqVar.e(aufsVar);
        } else {
            auhqVar.copyOnWrite();
            auhs auhsVar2 = (auhs) auhqVar.instance;
            aufsVar.getClass();
            auhsVar2.e();
            auhsVar2.f.set(iGe, aufsVar);
        }
        return (auhs) auhqVar.build();
    }

    @Override // defpackage.uub
    public final /* synthetic */ void c(urz urzVar) {
    }
}
