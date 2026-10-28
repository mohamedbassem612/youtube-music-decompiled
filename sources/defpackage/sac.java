package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class sac extends sab {
    public final awmd b;

    public sac(rsk rskVar, awmd awmdVar, spv spvVar, rmp rmpVar) {
        super(rskVar, spvVar);
        this.b = awmdVar;
    }

    public final /* synthetic */ void c(sgp sgpVar, smr smrVar, sko skoVar) {
        this.a.f(aixe.ADS_CLIENT_EVENT_TYPE_LAYOUT_RECEIVED, smrVar, skoVar, null, null, 0, null, null, sgpVar.a, null, null, false);
    }

    public final /* synthetic */ void d(sgp sgpVar, smr smrVar, sko skoVar) {
        this.a.f(aixe.ADS_CLIENT_EVENT_TYPE_LAYOUT_RECEIVED, smrVar, skoVar, null, null, 0, null, null, sgpVar.a, null, null, false);
    }

    public final void e(wgk wgkVar, String str, acfw acfwVar) {
        Optional optionalF = wgkVar.f();
        saa saaVar = new saa(this, 0);
        if (true == optionalF.isPresent()) {
            ((ruk) ((sac) saaVar.a).b.io()).a((ajwo) optionalF.get(), null);
        }
        ovo ovoVarA = sgp.a();
        ovoVarA.m(str);
        ovoVarA.n(skh.a(str, acfwVar.c()));
        sgp sgpVarL = ovoVarA.l();
        agke agkeVarA = a(wgkVar.a(), sgpVarL);
        int i = ((agpi) agkeVarA).d;
        for (int i2 = 0; i2 < i; i2++) {
            smr smrVar = (smr) agkeVarA.get(i2);
            if (smrVar.c() == aixo.SLOT_TYPE_BELOW_PLAYER_IMMERSIVE) {
                this.a.f(aixe.ADS_CLIENT_EVENT_TYPE_SLOT_RECEIVED, smrVar, null, null, null, 0, null, null, sgpVarL.a, null, null, false);
                Optional optional = smrVar.i;
                hmr hmrVar = new hmr(this, sgpVarL, smrVar, 3);
                if (true == optional.isPresent()) {
                    Object obj = optional.get();
                    Object obj2 = hmrVar.a;
                    Object obj3 = hmrVar.b;
                    sgp sgpVar = (sgp) obj3;
                    sac sacVar = (sac) obj2;
                    sacVar.d(sgpVar, (smr) hmrVar.c, (sko) obj);
                }
            }
        }
        wgkVar.a();
        b(agkeVarA, sgpVarL);
    }
}
