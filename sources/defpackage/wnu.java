package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wnu extends wms {
    /* JADX WARN: Illegal instructions before constructor call */
    public wnu(abxv abxvVar, zwa zwaVar, zwa zwaVar2, String str, int i, String str2, boolean z) {
        aihf aihfVarCreateBuilder = alky.a.createBuilder();
        List listCd = zik.cd(str == null ? "" : str);
        aihfVarCreateBuilder.copyOnWrite();
        alky alkyVar = (alky) aihfVarCreateBuilder.instance;
        aiie aiieVar = alkyVar.h;
        if (!aiieVar.c()) {
            alkyVar.h = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(listCd, alkyVar.h);
        aihfVarCreateBuilder.copyOnWrite();
        alky alkyVar2 = (alky) aihfVarCreateBuilder.instance;
        alkyVar2.f = i - 1;
        alkyVar2.b |= 2;
        if (zwaVar2.c()) {
            String strJ = zwaVar2.j();
            aihfVarCreateBuilder.copyOnWrite();
            alky alkyVar3 = (alky) aihfVarCreateBuilder.instance;
            alkyVar3.c = 14;
            alkyVar3.d = strJ;
        }
        if (str2 != null) {
            aihfVarCreateBuilder.copyOnWrite();
            alky alkyVar4 = (alky) aihfVarCreateBuilder.instance;
            alkyVar4.b |= 4;
            alkyVar4.g = str2;
        }
        super(abxvVar, zwaVar, "account/accounts_list", aihfVarCreateBuilder, z);
        this.k = zwaVar2;
        m();
    }

    @Override // defpackage.wkf
    protected final void b() {
    }
}
