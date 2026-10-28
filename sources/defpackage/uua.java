package defpackage;

import j$.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uua implements utv {
    private final long a;
    private final long b;

    public uua(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @Override // defpackage.utv
    public final /* synthetic */ String b() {
        return yno.gq(this);
    }

    @Override // defpackage.utx
    public final auhs h(auhs auhsVar) {
        auhsVar.getClass();
        aihf aihfVarCreateBuilder = augc.a.createBuilder();
        aihfVarCreateBuilder.getClass();
        aihfVarCreateBuilder.copyOnWrite();
        augc augcVar = (augc) aihfVarCreateBuilder.instance;
        augcVar.b |= 2;
        augcVar.d = true;
        aihfVarCreateBuilder.copyOnWrite();
        augc augcVar2 = (augc) aihfVarCreateBuilder.instance;
        augcVar2.b |= 1;
        augcVar2.c = true;
        aihn aihnVarBuild = aihfVarCreateBuilder.build();
        aihnVarBuild.getClass();
        final augc augcVar3 = (augc) aihnVarBuild;
        aihl aihlVar = auge.b;
        aihlVar.getClass();
        final long j = this.a;
        final long j2 = this.b;
        return yno.gg(auhsVar, aihlVar, new awqg() { // from class: uvl
            @Override // defpackage.awqg
            public final Object invoke(Object obj) {
                auge augeVar = (auge) obj;
                augeVar.getClass();
                aihf builder = augeVar.toBuilder();
                builder.getClass();
                atqn.m(builder);
                aiko aikoVarM = atqn.m(builder);
                Long lValueOf = Long.valueOf(j);
                aihf aihfVarCreateBuilder2 = augd.a.createBuilder();
                aihfVarCreateBuilder2.getClass();
                aihf builder2 = ((augd) Map.EL.getOrDefault(aikoVarM, lValueOf, atqn.l(aihfVarCreateBuilder2))).toBuilder();
                builder2.getClass();
                atqn.k(builder2);
                builder2.copyOnWrite();
                ((augd) builder2.instance).a().put(Long.valueOf(j2), augcVar3);
                augd augdVarL = atqn.l(builder2);
                builder.copyOnWrite();
                ((auge) builder.instance).a().put(lValueOf, augdVarL);
                return atqn.n(builder);
            }
        });
    }

    @Override // defpackage.uub
    public final /* synthetic */ void c(urz urzVar) {
    }
}
