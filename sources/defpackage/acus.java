package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acus implements abua {
    private final xgm a;
    private final int b;
    private final acsv c;
    private final hno d;

    public acus(xgm xgmVar, int i, acsv acsvVar, hno hnoVar) {
        this.a = xgmVar;
        this.b = i;
        this.c = acsvVar;
        this.d = hnoVar;
    }

    @Override // defpackage.abua
    public final abnl b(abnl abnlVar) {
        acsv acsvVar;
        ajwo ajwoVar = abnlVar.b;
        hno hnoVar = this.d;
        if (hnoVar.aj() && !hnoVar.aq() && (acsvVar = this.c) != null && ajwoVar != null && !hnoVar.aO()) {
            acsvVar.e(ajwoVar);
        }
        String strI = this.a.hB().i();
        int i = this.b;
        ajwo ajwoVar2 = abnlVar.b;
        if (ajwoVar2 == null) {
            return abnlVar;
        }
        aihf aihfVarP = acfz.P(ajwoVar2);
        aihfVarP.copyOnWrite();
        aoar aoarVar = (aoar) aihfVarP.instance;
        aoar aoarVar2 = aoar.a;
        strI.getClass();
        aoarVar.b |= 1;
        aoarVar.c = strI;
        aihfVarP.copyOnWrite();
        aoar aoarVar3 = (aoar) aihfVarP.instance;
        aoarVar3.b |= 2;
        aoarVar3.d = i;
        abnk abnkVarF = abnlVar.f();
        aihh aihhVar = (aihh) ajwoVar2.toBuilder();
        aihhVar.e(aoaq.b, (aoar) aihfVarP.build());
        abnkVarF.a = (ajwo) aihhVar.build();
        abnkVarF.c = abnlVar.I();
        abnkVarF.b = abnlVar.H();
        abnl abnlVarA = abnkVarF.a();
        abnlVarA.z(abnlVar);
        return abnlVarA;
    }
}
