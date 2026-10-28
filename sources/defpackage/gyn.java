package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class gyn extends gut {
    private final abvn a;
    private final wbz b;
    private final zwh c;
    private final lqa d;

    public gyn(abvn abvnVar, lqa lqaVar, wbz wbzVar, zwh zwhVar) {
        this.a = abvnVar;
        this.d = lqaVar;
        this.b = wbzVar;
        this.c = zwhVar;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void a(ajwo ajwoVar) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aqzs.c);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        aqzs aqzsVar = (aqzs) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        aihv aihvVar = aqzsVar.f;
        aihw aihwVar = aqzs.a;
        if (!new aihx(aihvVar, aihwVar).contains(aptd.SHARE_CLIENT_PARAMS_TYPE_VIDEO)) {
            if (!new aihx(aqzsVar.f, aihwVar).contains(aptd.SHARE_CLIENT_PARAMS_TYPE_FLOW)) {
                agrx agrxVar = agso.a;
                return;
            }
            if ((aqzsVar.d & 2) == 0) {
                agrx agrxVar2 = agso.a;
                return;
            }
            akzz akzzVar = (akzz) this.b.e(this.c.hw()).g(aqzsVar.g).g(akzz.class).E();
            if (akzzVar == null) {
                agrx agrxVar3 = agso.a;
                return;
            }
            aihf aihfVarCreateBuilder = aptc.a.createBuilder();
            aihf aihfVarCreateBuilder2 = akzi.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            akzi akziVar = (akzi) aihfVarCreateBuilder2.instance;
            alab alabVar = akzzVar.c;
            alabVar.getClass();
            akziVar.c = alabVar;
            akziVar.b |= 1;
            akzi akziVar2 = (akzi) aihfVarCreateBuilder2.build();
            aihfVarCreateBuilder.copyOnWrite();
            aptc aptcVar = (aptc) aihfVarCreateBuilder.instance;
            akziVar2.getClass();
            aptcVar.d = akziVar2;
            aptcVar.b |= 4;
            this.d.B(aqzsVar.e, (aptc) aihfVarCreateBuilder.build());
            agrx agrxVar4 = agso.a;
            return;
        }
        acfw acfwVarI = this.a.o().i();
        if (acfwVarI == null) {
            agrx agrxVar5 = agso.a;
            return;
        }
        wjf wjfVarC = acfwVarI.c();
        if (wjfVarC == null) {
            agrx agrxVar6 = agso.a;
            return;
        }
        aihf aihfVarCreateBuilder3 = aptc.a.createBuilder();
        aihf aihfVarCreateBuilder4 = arcp.a.createBuilder();
        String strG = wjfVarC.G();
        aihfVarCreateBuilder4.copyOnWrite();
        arcp arcpVar = (arcp) aihfVarCreateBuilder4.instance;
        strG.getClass();
        arcpVar.b |= 1;
        arcpVar.c = strG;
        long jA = acfwVarI.a();
        aihfVarCreateBuilder4.copyOnWrite();
        arcp arcpVar2 = (arcp) aihfVarCreateBuilder4.instance;
        arcpVar2.b |= 2;
        arcpVar2.d = jA;
        aihfVarCreateBuilder3.copyOnWrite();
        aptc aptcVar2 = (aptc) aihfVarCreateBuilder3.instance;
        arcp arcpVar3 = (arcp) aihfVarCreateBuilder4.build();
        arcpVar3.getClass();
        aptcVar2.c = arcpVar3;
        aptcVar2.b |= 2;
        this.d.B(aqzsVar.e, (aptc) aihfVarCreateBuilder3.build());
        agrx agrxVar7 = agso.a;
    }
}
