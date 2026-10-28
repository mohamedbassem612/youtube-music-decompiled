package defpackage;

import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uuh extends uuf {
    private final Duration a;

    public uuh(long j, Duration duration) {
        super(j);
        this.a = duration;
    }

    @Override // defpackage.uuf
    public final aufa d(aufa aufaVar) {
        aihf builder = aufaVar.toBuilder();
        builder.getClass();
        atqo.k(aext.u(this.a), builder);
        return atqo.h(builder);
    }

    @Override // defpackage.uuf
    public final augy f(augy augyVar) {
        jrr jrrVar = (jrr) augyVar.toBuilder();
        jrrVar.getClass();
        augy augyVar2 = (augy) jrrVar.instance;
        int i = augyVar2.c;
        if (i == 108) {
            auhc auhcVar = i == 108 ? (auhc) augyVar2.d : auhc.a;
            auhcVar.getClass();
            aihf builder = auhcVar.toBuilder();
            builder.getClass();
            aigu aiguVarU = aext.u(this.a);
            builder.copyOnWrite();
            auhc auhcVar2 = (auhc) builder.instance;
            auhcVar2.e = aiguVarU;
            auhcVar2.b |= 1;
            aihn aihnVarBuild = builder.build();
            aihnVarBuild.getClass();
            jrrVar.copyOnWrite();
            augy augyVar3 = (augy) jrrVar.instance;
            augyVar3.d = (auhc) aihnVarBuild;
            augyVar3.c = 108;
        } else {
            twu.d("SourceTimingMutation", 5, "Matched Creation graphical segment does not have a source.", null);
        }
        return atxy.h(jrrVar);
    }
}
