package defpackage;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class rsm implements sgs {
    public final tce a;
    private final tbt b;
    private ajwo c;
    private smr e;
    private sko f;
    private sko g;
    private skh h;
    private final xwy i;
    private final rsk j;
    private final vxu k;
    private final ruk l;
    private final rnj m;
    private final aehs n;

    public rsm(xwy xwyVar, rsk rskVar, aehs aehsVar, rnj rnjVar, vxu vxuVar, ruk rukVar, tbt tbtVar, tce tceVar) {
        this.i = xwyVar;
        this.j = rskVar;
        this.n = aehsVar;
        this.m = rnjVar;
        this.k = vxuVar;
        this.l = rukVar;
        this.b = tbtVar;
        this.a = tceVar;
    }

    private final void f(sgm sgmVar) {
        vxu vxuVar = this.k;
        int iA = sgm.a(sgmVar);
        if (taq.bc(vxuVar)) {
            this.j.e(this.h, this.e, this.g, iA);
        }
        rsk rskVar = this.j;
        rskVar.e(this.h, this.e, this.f, iA);
        smr smrVar = this.e;
        if (smrVar != null) {
            skh skhVar = this.h;
            spv spvVar = rskVar.f;
            spvVar.f(aixe.ADS_CLIENT_EVENT_TYPE_SLOT_EXITED, smrVar, null, null, null, 0, null, null, skhVar, null, null, false);
            Iterator it = rskVar.c.iterator();
            while (it.hasNext()) {
                ((san) it.next()).g(smrVar);
            }
            skh skhVar2 = this.h;
            smr smrVar2 = this.e;
            spvVar.f(aixe.ADS_CLIENT_EVENT_TYPE_SLOT_UNSCHEDULED, smrVar2, null, null, null, 0, null, null, skhVar2, null, null, false);
            Iterator it2 = rskVar.b.iterator();
            while (it2.hasNext()) {
                ((sap) it2.next()).X(smrVar2);
            }
        }
        this.c = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
    }

    public final void a(wjf wjfVar, smk smkVar, sgm sgmVar) {
        this.b.c(new sen(smkVar, sgmVar));
        new aaok(this.a, (smc) smkVar, slm.PRE_ROLL, wjfVar).T();
        c(sgmVar);
    }

    public final void b(smk smkVar, String str, wjf wjfVar, boolean z) {
        sko skoVar;
        this.c = smkVar.s;
        boolean zBc = taq.bc(this.k);
        sko skoVar2 = this.f;
        if (!zBc) {
            if (skoVar2 != null) {
                if (TextUtils.equals(smkVar.o, skoVar2.a)) {
                    return;
                } else {
                    f(sgm.VIDEO_ERROR);
                }
            }
            this.h = skh.c(str, wjfVar, true);
            smr smrVarAg = aaok.ag(this.m.e(), str, wjfVar, slm.PRE_ROLL, z);
            this.e = smrVarAg;
            rsk rskVar = this.j;
            rskVar.o(this.h, smrVarAg);
            rskVar.p(this.h, this.e);
            String str2 = smkVar.o;
            skn sknVarA = sko.a();
            sknVarA.l(str2);
            sknVarA.a = aixg.LAYOUT_TYPE_MEDIA;
            sknVarA.m(4);
            sknVarA.c = shh.b(new sjm(smkVar), new shq(this));
            sko skoVarA = sknVarA.a();
            this.f = skoVarA;
            rskVar.f(this.h, this.e, skoVarA);
            rskVar.g(this.h, this.e, this.f);
            rskVar.k(this.h, this.e);
            rskVar.c(this.h, this.e, this.f);
            return;
        }
        if (skoVar2 != null && (skoVar = this.g) != null) {
            if (TextUtils.equals(smkVar.o, skoVar.a)) {
                return;
            } else {
                f(sgm.VIDEO_ERROR);
            }
        }
        this.h = skh.c(str, wjfVar, true);
        smr smrVarAg2 = aaok.ag(this.m.e(), str, wjfVar, slm.PRE_ROLL, z);
        this.e = smrVarAg2;
        rsk rskVar2 = this.j;
        rskVar2.o(this.h, smrVarAg2);
        rskVar2.p(this.h, this.e);
        aehs aehsVar = this.n;
        String str3 = this.e.a;
        Object obj = aehsVar.f;
        aixg aixgVar = aixg.LAYOUT_TYPE_COMPOSITE_PLAYER_BYTES;
        String strX = ((xsc) obj).X(aixgVar, str3);
        String str4 = smkVar.o;
        skn sknVarA2 = sko.a();
        sknVarA2.l(str4);
        sknVarA2.a = aixg.LAYOUT_TYPE_MEDIA;
        sknVarA2.m(4);
        sknVarA2.c = shh.b(new sjm(smkVar), new shq(this), new sib(strX));
        agke agkeVarQ = agke.q(sknVarA2.a());
        skn sknVarA3 = sko.a();
        sknVarA3.l(strX);
        sknVarA3.a = aixgVar;
        sknVarA3.m(4);
        sknVarA3.c = shh.b(new sjq(agkeVarQ));
        sko skoVarA2 = sknVarA3.a();
        this.f = skoVarA2;
        rskVar2.f(this.h, this.e, skoVarA2);
        rskVar2.g(this.h, this.e, this.f);
        sko skoVar3 = (sko) ((List) this.f.d(sjq.class)).get(0);
        this.g = skoVar3;
        rskVar2.f(this.h, this.e, skoVar3);
        rskVar2.g(this.h, this.e, this.g);
        rskVar2.k(this.h, this.e);
        rskVar2.c(this.h, this.e, this.f);
        rskVar2.c(this.h, this.e, this.g);
    }

    public final void c(sgm sgmVar) {
        ajwo ajwoVar;
        if (this.f != null) {
            if (taq.bc(this.k) && (ajwoVar = this.c) != null) {
                this.l.a(ajwoVar, null);
            }
            f(sgmVar);
        }
    }

    @Override // defpackage.sgs
    public final void d(int i, int i2) {
        this.i.d(i, i2);
    }

    @Override // defpackage.sgs
    public final void e() {
    }
}
