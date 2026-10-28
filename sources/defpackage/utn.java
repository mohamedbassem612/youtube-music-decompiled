package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class utn implements utu {
    private final long a;
    private final augy b;
    private final String c;
    private final int d;

    public utn(long j, augy augyVar, String str, int i) {
        augyVar.getClass();
        str.getClass();
        this.a = j;
        this.b = augyVar;
        this.c = str;
        this.d = i;
    }

    @Override // defpackage.utu
    public final utv a(auhs auhsVar) {
        auhsVar.getClass();
        augy augyVar = this.b;
        awsr awsrVar = new awsr((awss) awqx.h(atqq.ax(yno.gn(auhsVar, augyVar.e).keySet()), new rla(auhsVar, 11)));
        while (awsrVar.hasNext()) {
            augy augyVar2 = (augy) awsrVar.next();
            int i = augyVar2.c;
            if (i == 110) {
                if (awrc.c((i == 110 ? (auhb) augyVar2.d : auhb.a).c, this.c)) {
                    return new utt(agpi.a);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        jrr jrrVar = (jrr) augy.a.createBuilder();
        jrrVar.getClass();
        long j = this.a;
        jrrVar.copyOnWrite();
        augy augyVar3 = (augy) jrrVar.instance;
        augyVar3.b |= 1;
        augyVar3.e = j;
        aigu aiguVar = augyVar.i;
        if (aiguVar == null) {
            aiguVar = aigu.a;
        }
        aiguVar.getClass();
        atxy.j(aiguVar, jrrVar);
        aigu aiguVar2 = augyVar.j;
        if (aiguVar2 == null) {
            aiguVar2 = aigu.a;
        }
        aiguVar2.getClass();
        atxy.i(aiguVar2, jrrVar);
        jrrVar.copyOnWrite();
        augy augyVar4 = (augy) jrrVar.instance;
        augyVar4.b |= 4;
        augyVar4.g = 1;
        aihf aihfVarCreateBuilder = auhb.a.createBuilder();
        aihfVarCreateBuilder.getClass();
        String str = this.c;
        aihfVarCreateBuilder.copyOnWrite();
        auhb auhbVar = (auhb) aihfVarCreateBuilder.instance;
        auhbVar.b |= 1;
        auhbVar.c = str;
        atqn.w(this.d, aihfVarCreateBuilder);
        aihfVarCreateBuilder.copyOnWrite();
        auhb auhbVar2 = (auhb) aihfVarCreateBuilder.instance;
        auhbVar2.q = 3;
        auhbVar2.b |= 16384;
        aihfVarCreateBuilder.copyOnWrite();
        auhb auhbVar3 = (auhb) aihfVarCreateBuilder.instance;
        auhbVar3.b |= 64;
        auhbVar3.i = 0.1f;
        atqn.x("YOUTUBE_SANS", aihfVarCreateBuilder);
        atxy.k(atqn.v(aihfVarCreateBuilder), jrrVar);
        arrayList.add(new utl(yno.ga(atxy.h(jrrVar), augf.NOT_FOR_UPLOAD, augf.NOT_SHOW_IN_TIMELINE), new usz()).a(auhsVar));
        arrayList.add(new uua(augyVar.e, j));
        return new utt(aguu.T(arrayList));
    }

    @Override // defpackage.utu
    public final /* synthetic */ utv b(auhs auhsVar) {
        return a(auhsVar);
    }
}
