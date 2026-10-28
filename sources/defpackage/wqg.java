package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wqg extends wms {
    private final List a;

    /* JADX WARN: Illegal instructions before constructor call */
    public wqg(abxv abxvVar, zwa zwaVar, List list) {
        aihf aihfVarCreateBuilder = alra.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        alra alraVar = (alra) aihfVarCreateBuilder.instance;
        alraVar.b |= 2;
        alraVar.d = false;
        List listCd = zik.cd("");
        aihfVarCreateBuilder.copyOnWrite();
        alra alraVar2 = (alra) aihfVarCreateBuilder.instance;
        aiie aiieVar = alraVar2.e;
        if (!aiieVar.c()) {
            alraVar2.e = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(listCd, alraVar2.e);
        aihfVarCreateBuilder.copyOnWrite();
        alra alraVar3 = (alra) aihfVarCreateBuilder.instance;
        alraVar3.b |= 8;
        alraVar3.f = false;
        aihf aihfVarCreateBuilder2 = alrb.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        alrb alrbVar = (alrb) aihfVarCreateBuilder2.instance;
        alrbVar.b |= 4;
        alrbVar.c = false;
        aihfVarCreateBuilder2.copyOnWrite();
        alrb alrbVar2 = (alrb) aihfVarCreateBuilder2.instance;
        alrbVar2.b |= 16;
        alrbVar2.e = false;
        aihfVarCreateBuilder2.copyOnWrite();
        alrb alrbVar3 = (alrb) aihfVarCreateBuilder2.instance;
        alrbVar3.b |= 8;
        alrbVar3.d = false;
        aihfVarCreateBuilder2.copyOnWrite();
        alrb alrbVar4 = (alrb) aihfVarCreateBuilder2.instance;
        aiie aiieVar2 = alrbVar4.f;
        if (!aiieVar2.c()) {
            alrbVar4.f = aihn.mutableCopy(aiieVar2);
        }
        aifs.addAll(list, alrbVar4.f);
        alrb alrbVar5 = (alrb) aihfVarCreateBuilder2.build();
        aihfVarCreateBuilder.copyOnWrite();
        alra alraVar4 = (alra) aihfVarCreateBuilder.instance;
        alrbVar5.getClass();
        alraVar4.g = alrbVar5;
        alraVar4.b |= 32;
        super(abxvVar, zwaVar, "guide", aihfVarCreateBuilder, true);
        this.a = list;
        this.A = 3;
        m();
    }

    @Override // defpackage.wkf
    public final String Y() {
        List list = this.a;
        dov dovVarE = E();
        if (list != null && !list.isEmpty()) {
            dovVarE.F("entityKeysToUpdate", "true");
        }
        return dovVarE.D();
    }

    @Override // defpackage.wkf
    protected final void b() {
    }
}
