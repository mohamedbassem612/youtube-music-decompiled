package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class spq implements abrf {
    public final slb a;

    public spq(slb slbVar) {
        this.a = slbVar;
        typ.f(slbVar.i);
    }

    @Override // defpackage.abrf
    public final void hX(abri abriVar) {
        slb slbVar = this.a;
        smk smkVar = (smk) slbVar;
        wgm wgmVar = smkVar.e;
        final int iD = afyd.D(Integer.parseInt(wgmVar != null ? wgmVar.g : wgm.UNKNOWN.g));
        if (iD == 0) {
            iD = 1;
        }
        zvp.a(zvn.a, zvm.a, "Used PlayerResponse.ad_params to generate requests");
        String str = slbVar.k;
        final int i = true != smkVar.b ? 1 : 2;
        abriVar.G = true;
        abriVar.ah = 3;
        abriVar.ag = iD;
        abriVar.c = str;
        abriVar.ai = i;
        abriVar.V = slbVar.i;
        abriVar.F(new abrh() { // from class: spp
            @Override // defpackage.abrh
            public final void a(dov dovVar) {
                dovVar.G("isAdRequest", true);
                dovVar.E("adType", 2L);
                dovVar.E("adSystem", iD - 1);
                dovVar.E("instreamType", i - 1);
                dovVar.F("hostVideoId", this.a.a.i);
            }
        });
    }
}
