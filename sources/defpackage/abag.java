package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abag implements abaf {
    public static final String a = wfs.g(akkb.b.a(), "sticky_video_quality_key");
    private final awmd b;
    private final awmd c;
    private final awmd d;
    private final awmd e;

    public abag(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4) {
        this.b = awmdVar;
        this.c = awmdVar2;
        this.d = awmdVar3;
        this.e = awmdVar4;
    }

    private final akka c() {
        return (akka) ((wbz) this.b.io()).e(((zwb) this.c.io()).e()).g(a).E();
    }

    @Override // defpackage.abaf
    public final Optional a() {
        akka akkaVarC = c();
        if (akkaVarC == null) {
            return Optional.empty();
        }
        aihf aihfVarCreateBuilder = aoph.a.createBuilder();
        int i = akkaVarC.c.d;
        if (i == 2) {
            int iIntValue = akkaVarC.getStickyVideoQualityFixedResolution().intValue();
            aihfVarCreateBuilder.copyOnWrite();
            aoph aophVar = (aoph) aihfVarCreateBuilder.instance;
            aophVar.b |= 1;
            aophVar.c = iIntValue;
        } else {
            if (i != 3) {
                return Optional.empty();
            }
            arfb stickyVideoQualitySetting = akkaVarC.getStickyVideoQualitySetting();
            aihfVarCreateBuilder.copyOnWrite();
            aoph aophVar2 = (aoph) aihfVarCreateBuilder.instance;
            aophVar2.d = stickyVideoQualitySetting.e;
            aophVar2.b |= 2;
        }
        return Optional.of((aoph) aihfVarCreateBuilder.build());
    }

    @Override // defpackage.abaf
    public final boolean b(abnl abnlVar, abnc abncVar) {
        ajwo ajwoVar;
        if (!((vxz) this.d.io()).l(0, 45362264L, false)) {
            return false;
        }
        if (abnlVar != null) {
            if (abnlVar.J()) {
                return false;
            }
            if (((vxz) this.e.io()).m(32, 45430357L) && (ajwoVar = abnlVar.b) != null) {
                aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
                ajwoVar.c(aihlVarCheckIsLite);
                if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                    return false;
                }
            }
        }
        if (abncVar.t() || abncVar.k) {
            return false;
        }
        return ((abnlVar != null && (abnlVar.I() || abnlVar.H())) || abnr.FULLSCREEN.equals(abncVar.e())) && c() != null;
    }
}
