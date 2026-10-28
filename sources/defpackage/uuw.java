package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class uuw extends uuf {
    private final aigw a;

    public uuw(long j, aigw aigwVar) {
        super(j);
        this.a = aigwVar;
    }

    @Override // defpackage.uuf
    public final aufa d(aufa aufaVar) {
        List listGj;
        aiie aiieVar = aufaVar.k;
        aiieVar.getClass();
        aigw aigwVar = this.a;
        Object objE = e(yno.gh(aiieVar, aigwVar));
        aihf builder = aufaVar.toBuilder();
        builder.getClass();
        atqo.r(builder);
        atqo.q(builder);
        atqo.r(builder);
        if (objE != null) {
            aiie aiieVar2 = aufaVar.k;
            aiieVar2.getClass();
            listGj = yno.gk(aiieVar2, aigwVar, new rla(objE, 14));
        } else {
            aiie aiieVar3 = aufaVar.k;
            aiieVar3.getClass();
            listGj = yno.gj(aiieVar3, aigwVar);
        }
        atqo.o(listGj, builder);
        return atqo.h(builder);
    }

    public abstract Object e(Object obj);

    @Override // defpackage.uuf
    public final augy f(augy augyVar) {
        List listGj;
        aiie aiieVar = augyVar.t;
        aiieVar.getClass();
        aigw aigwVar = this.a;
        Object objE = e(yno.gh(aiieVar, aigwVar));
        jrr jrrVar = (jrr) augyVar.toBuilder();
        jrrVar.getClass();
        atxy.l(jrrVar);
        jrrVar.copyOnWrite();
        ((augy) jrrVar.instance).t = augy.emptyProtobufList();
        atxy.l(jrrVar);
        if (objE != null) {
            aiie aiieVar2 = augyVar.t;
            aiieVar2.getClass();
            listGj = yno.gk(aiieVar2, aigwVar, new rla(objE, 15));
        } else {
            aiie aiieVar3 = augyVar.t;
            aiieVar3.getClass();
            listGj = yno.gj(aiieVar3, aigwVar);
        }
        jrrVar.f(listGj);
        return atxy.h(jrrVar);
    }
}
