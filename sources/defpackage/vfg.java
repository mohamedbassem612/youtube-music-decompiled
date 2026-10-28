package defpackage;

import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class vfg extends vei {
    static final Function a = new vff();
    static final Function b = new vfh();
    static final agek c = new vem(3);

    @Override // defpackage.vei
    public final void a(augy augyVar, aihf aihfVar) {
        akpk akpkVar = akpk.a;
        aihf aihfVarCreateBuilder = akpkVar.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        akpk akpkVar2 = (akpk) aihfVarCreateBuilder.instance;
        akpkVar2.b |= 1;
        akpkVar2.c = 0L;
        aihfVarCreateBuilder.copyOnWrite();
        akpk akpkVar3 = (akpk) aihfVarCreateBuilder.instance;
        akpkVar3.b |= 2;
        akpkVar3.d = 0.0d;
        akpk akpkVar4 = (akpk) aihfVarCreateBuilder.build();
        aihf aihfVarCreateBuilder2 = akpkVar.createBuilder();
        aigu aiguVar = augyVar.i;
        if (aiguVar == null) {
            aiguVar = aigu.a;
        }
        long jA = aikw.a(aiguVar);
        aihfVarCreateBuilder2.copyOnWrite();
        akpk akpkVar5 = (akpk) aihfVarCreateBuilder2.instance;
        akpkVar5.b |= 1;
        akpkVar5.c = jA;
        aihfVarCreateBuilder2.copyOnWrite();
        akpk akpkVar6 = (akpk) aihfVarCreateBuilder2.instance;
        akpkVar6.b |= 2;
        akpkVar6.d = 1.0d;
        akpk akpkVar7 = (akpk) aihfVarCreateBuilder2.build();
        aihf aihfVarCreateBuilder3 = akpkVar.createBuilder();
        aigu aiguVar2 = augyVar.i;
        if (aiguVar2 == null) {
            aiguVar2 = aigu.a;
        }
        long jA2 = aikw.a(aiguVar2);
        aigu aiguVar3 = augyVar.j;
        if (aiguVar3 == null) {
            aiguVar3 = aigu.a;
        }
        long jA3 = jA2 + aikw.a(aiguVar3);
        aihfVarCreateBuilder3.copyOnWrite();
        akpk akpkVar8 = (akpk) aihfVarCreateBuilder3.instance;
        akpkVar8.b |= 1;
        akpkVar8.c = jA3;
        aihfVarCreateBuilder3.copyOnWrite();
        akpk akpkVar9 = (akpk) aihfVarCreateBuilder3.instance;
        akpkVar9.b |= 2;
        akpkVar9.d = 0.0d;
        agke agkeVarS = agke.s(akpkVar4, akpkVar7, (akpk) aihfVarCreateBuilder3.build());
        aihfVar.copyOnWrite();
        akqu akquVar = (akqu) aihfVar.instance;
        akqu akquVar2 = akqu.a;
        aiie aiieVar = akquVar.f;
        if (!aiieVar.c()) {
            akquVar.f = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(agkeVarS, akquVar.f);
    }

    @Override // defpackage.vei
    public final void b(augy augyVar, aihf aihfVar) {
        akqs akqsVar = (akqs) a.apply(augyVar);
        aihfVar.copyOnWrite();
        akqu akquVar = (akqu) aihfVar.instance;
        akqu akquVar2 = akqu.a;
        akqsVar.getClass();
        akquVar.c = akqsVar;
        akquVar.b |= 2;
    }
}
