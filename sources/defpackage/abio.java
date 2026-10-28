package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abio implements abrf, abrd {
    public final abmt a;
    public agev b = agdf.a;
    private final aunn c;

    public abio(abmt abmtVar, aunn aunnVar) {
        this.a = abmtVar;
        this.c = aunnVar;
    }

    private final zfp c(zfe zfeVar) {
        return this.b.g() ? (zfp) this.b.c() : ((zfs) this.c.io()).b(zfeVar);
    }

    @Override // defpackage.abrf
    public final void hX(abri abriVar) {
        zh zhVar = new zh((byte[]) null, (char[]) null);
        zhVar.m(abriVar.a);
        zfp zfpVarC = c(zhVar.l());
        if (zfpVarC != null) {
            abriVar.ad = zfpVarC;
        }
    }

    @Override // defpackage.abrd
    public final void hY(aihf aihfVar) {
        zh zhVar = new zh((byte[]) null, (char[]) null);
        zhVar.m(wfs.h(((aluc) aihfVar.instance).e));
        zfp zfpVarC = c(zhVar.l());
        if (zfpVarC != null) {
            aihf aihfVarCreateBuilder = appy.a.createBuilder();
            aigj aigjVarV = aigj.v(zfpVarC.b);
            aihfVarCreateBuilder.copyOnWrite();
            appy appyVar = (appy) aihfVarCreateBuilder.instance;
            aigjVarV.getClass();
            appyVar.b |= 1;
            appyVar.c = aigjVarV;
            aihfVar.copyOnWrite();
            aluc alucVar = (aluc) aihfVar.instance;
            appy appyVar2 = (appy) aihfVarCreateBuilder.build();
            appyVar2.getClass();
            alucVar.m = appyVar2;
            alucVar.b |= SemanticState.Hidden;
        }
    }
}
