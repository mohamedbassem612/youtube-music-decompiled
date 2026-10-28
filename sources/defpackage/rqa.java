package defpackage;

import app.rive.semantics.SemanticState;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class rqa implements zwg {
    private static final agrf n = agrf.h("com/google/android/libraries/youtube/account/signin/flow/DefaultSignInController");
    public final aunn a;
    public final aunn b;
    public final aunn c;
    public final aunn d;
    public final Executor e;
    public final Executor f;
    public final awmd g;
    public final tbt h;
    public final awmd i;
    public final ahbw j;
    public final CopyOnWriteArraySet k = new CopyOnWriteArraySet();
    public final tfq l;
    public final ci m;
    private final mbc o;
    private final vxu p;

    public rqa(aunn aunnVar, aunn aunnVar2, aunn aunnVar3, aunn aunnVar4, Executor executor, Executor executor2, awmd awmdVar, mbc mbcVar, tbt tbtVar, awmd awmdVar2, ahbw ahbwVar, ci ciVar, tfq tfqVar, vxu vxuVar) {
        this.a = aunnVar;
        this.b = aunnVar2;
        this.c = aunnVar3;
        this.e = executor;
        this.f = executor2;
        this.d = aunnVar4;
        this.g = awmdVar;
        this.o = mbcVar;
        this.h = tbtVar;
        this.i = awmdVar2;
        this.j = ahbwVar;
        this.m = ciVar;
        this.l = tfqVar;
        this.p = vxuVar;
    }

    private final void k(boolean z) {
        ((rmu) this.a.io()).j(z);
        ((rmw) this.b.io()).m();
    }

    private final void l(ajue ajueVar, arbj arbjVar, ajwo ajwoVar) {
        rmv rmvVar;
        if (arbjVar == null) {
            rmvVar = rmv.a;
        } else {
            String str = arbjVar.c;
            String str2 = arbjVar.b;
            aqmh aqmhVar = arbjVar.d;
            if (aqmhVar == null) {
                aqmhVar = aqmh.a;
            }
            rmvVar = new rmv(str, str2, aqmhVar, arbjVar.e, arbjVar.f);
        }
        this.f.execute(afwl.i(new mrh(this, rlt.a(ajueVar), rmvVar, ajwoVar, 10)));
    }

    private final void m(wnq wnqVar, ajwo ajwoVar) {
        rlt rltVarN;
        wnx wnxVar = wnqVar.b;
        if (wnxVar.e == null) {
            wnxVar.b();
        }
        Boolean bool = wnxVar.e;
        if (bool != null) {
            bool.booleanValue();
            wnx wnxVar2 = wnqVar.b;
            if (wnxVar2.i == null) {
                wnxVar2.b();
            }
            rltVarN = rlt.n(wnxVar2.i, wnqVar.g(), null, false, false, true, false, false, false, 3, wnqVar.h());
        } else {
            String strI = wnqVar.i();
            String strG = wnqVar.g();
            String strJ = wnqVar.j();
            wnx wnxVar3 = wnqVar.b;
            if (wnxVar3.d == null) {
                wnxVar3.b();
            }
            Boolean bool2 = wnxVar3.d;
            boolean z = false;
            if (bool2 != null && bool2.booleanValue()) {
                z = true;
            }
            rltVarN = rlt.n(strI, strG, strJ, false, z, false, false, false, false, 2, wnqVar.h());
        }
        this.f.execute(afwl.i(new mrh(this, rltVarN, wnqVar, ajwoVar, 9)));
    }

    @Override // defpackage.zwg
    public final void a(zwa zwaVar) {
        if (zwaVar.h()) {
            return;
        }
        taf.g(((omj) this.d.io()).L(new rhk(((rlt) zwaVar).b, 7)), new gpq(18));
    }

    public final long b() {
        mbc mbcVar = this.o;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return TimeUnit.HOURS.toMillis(mbcVar.f().toEpochMilli() / 3600000);
    }

    public final void d(final rlt rltVar, final rmv rmvVar, final ajwo ajwoVar) {
        rlt rltVar2;
        final boolean z;
        rmu rmuVar = (rmu) this.a.io();
        if (rmuVar.u()) {
            rltVar2 = (rlt) rmuVar.e();
            if (rmp.e(rltVar) && rltVar.l == 3) {
                taf.g(((omj) this.d.io()).L(new rhk(rltVar2.a, 9)), new gpq(20));
            }
            int i = 1;
            if (!rmp.e(rltVar2) && rmp.f(rltVar)) {
                taf.g(((omj) this.d.io()).L(new rhk(rltVar2.a, 6)), new uqk(i));
            }
            j(false, true);
            z = true;
        } else {
            rltVar2 = null;
            z = false;
        }
        final rlt rltVar3 = rltVar2;
        taf.g(rmuVar.h(rltVar), new tae() { // from class: rpz
            @Override // defpackage.tae, defpackage.twi
            public final void a(Object obj) {
                rqa rqaVar = this.a;
                ((rmw) rqaVar.b.io()).r(rmvVar);
                aijp aijpVarAv = ahng.av(rqaVar.j.a());
                omj omjVar = (omj) rqaVar.d.io();
                rlt rltVar4 = rltVar;
                byte[] bArr = null;
                taf.g(omjVar.L(new hph(rltVar4.b, aijpVarAv, 15, null)), new gpq(19));
                rqf rqfVar = rqf.b;
                ajwo ajwoVar2 = ajwoVar;
                rqaVar.f(rqfVar, ajwoVar2);
                rqaVar.h.e(new zwt(rltVar4, ajwoVar2));
                rqaVar.e.execute(afwl.i(new rno(rqaVar, 5)));
                if (!z) {
                    aihf aihfVarCreateBuilder = aiqv.a.createBuilder();
                    aihfVarCreateBuilder.copyOnWrite();
                    aiqv aiqvVar = (aiqv) aihfVarCreateBuilder.instance;
                    aiqvVar.c = 1;
                    aiqvVar.b |= 1;
                    wvl wvlVarB = ((hed) rqaVar.i.io()).B();
                    wvlVarB.b = new kjh(rqaVar, aihfVarCreateBuilder, 16, bArr);
                    taf.j(wvlVarB.a(), new iul(11));
                    return;
                }
                rlt rltVar5 = rltVar3;
                if (rltVar5 != null) {
                    aiqv aiqvVar2 = aiqv.a;
                    aihf aihfVarCreateBuilder2 = aiqvVar2.createBuilder();
                    aihfVarCreateBuilder2.copyOnWrite();
                    aiqv aiqvVar3 = (aiqv) aihfVarCreateBuilder2.instance;
                    aiqvVar3.c = 4;
                    aiqvVar3.b |= 1;
                    tfq tfqVar = rqaVar.l;
                    if (!tfqVar.i()) {
                        aihfVarCreateBuilder2.copyOnWrite();
                        aiqv aiqvVar4 = (aiqv) aihfVarCreateBuilder2.instance;
                        aiqvVar4.d = 56;
                        aiqvVar4.b |= 2;
                    }
                    alou alouVar = alou.a;
                    alos alosVar = (alos) alouVar.createBuilder();
                    aiqv aiqvVar5 = (aiqv) aihfVarCreateBuilder2.build();
                    alosVar.copyOnWrite();
                    alou alouVar2 = (alou) alosVar.instance;
                    aiqvVar5.getClass();
                    alouVar2.d = aiqvVar5;
                    alouVar2.c = 23;
                    alou alouVar3 = (alou) alosVar.build();
                    awmd awmdVar = rqaVar.g;
                    ((dov) awmdVar.io()).T(alouVar3, rltVar5);
                    aihf aihfVarCreateBuilder3 = aiqvVar2.createBuilder();
                    aihfVarCreateBuilder3.copyOnWrite();
                    aiqv aiqvVar6 = (aiqv) aihfVarCreateBuilder3.instance;
                    aiqvVar6.c = 4;
                    aiqvVar6.b |= 1;
                    if (!tfqVar.i()) {
                        aihfVarCreateBuilder3.copyOnWrite();
                        aiqv aiqvVar7 = (aiqv) aihfVarCreateBuilder3.instance;
                        aiqvVar7.d = 56;
                        aiqvVar7.b |= 2;
                    }
                    alos alosVar2 = (alos) alouVar.createBuilder();
                    aiqv aiqvVar8 = (aiqv) aihfVarCreateBuilder3.build();
                    alosVar2.copyOnWrite();
                    alou alouVar4 = (alou) alosVar2.instance;
                    aiqvVar8.getClass();
                    alouVar4.d = aiqvVar8;
                    alouVar4.c = 23;
                    alou alouVar5 = (alou) alosVar2.build();
                    zwa zwaVarE = ((zwb) rqaVar.a.io()).e();
                    ((xeu) ((dov) awmdVar.io()).a).j(alouVar5, zwaVarE, rqaVar.b(), new zvh(rqaVar.m.aD(zwaVarE), zwaVarE.m()));
                }
            }
        });
    }

    final void e(Exception exc) {
        if (!((rmu) this.a.io()).u()) {
            k(false);
        }
        f(rqf.c, null);
        this.h.e(new rqe(exc));
        this.e.execute(afwl.i(new rhz(this, exc, 13, null)));
    }

    public final void f(rqf rqfVar, ajwo ajwoVar) {
        this.h.c(new rqg(rqfVar, rqfVar == rqf.b, ajwoVar));
    }

    public final void g(zws zwsVar) {
        CopyOnWriteArraySet copyOnWriteArraySet = this.k;
        if (!copyOnWriteArraySet.isEmpty()) {
            e(new IllegalStateException("Only one concurrent post-auth sign-in allowed."));
            ((agrc) ((agrc) n.b()).k("com/google/android/libraries/youtube/account/signin/flow/DefaultSignInController", "setCallback", 466, "DefaultSignInController.java")).w("%s", "Only one concurrent post-auth sign-in allowed.");
        }
        if (zwsVar != null) {
            copyOnWriteArraySet.add(zwsVar);
        }
    }

    public final void h(wnq wnqVar, ajwo ajwoVar, zws zwsVar) {
        taq.d();
        g(zwsVar);
        f(rqf.a, null);
        aiqh aiqhVar = this.p.c().i;
        if (aiqhVar == null) {
            aiqhVar = aiqh.a;
        }
        if (!aiqhVar.f) {
            if (wnqVar.k()) {
                m(wnqVar, ajwoVar);
                return;
            }
            return;
        }
        apzh apzhVar = wnqVar.c;
        if (apzhVar == null || (apzhVar.b & SemanticState.Hidden) == 0) {
            if (wnqVar.k()) {
                m(wnqVar, ajwoVar);
                return;
            } else {
                e(new IllegalStateException("AccountItem has no active identity."));
                return;
            }
        }
        ajue ajueVar = apzhVar.g;
        if (ajueVar == null) {
            ajueVar = ajue.b;
        }
        arbj arbjVar = apzhVar.h;
        if (arbjVar == null) {
            arbjVar = arbj.a;
        }
        if ((apzhVar.b & 2) != 0 && (ajwoVar = apzhVar.c) == null) {
            ajwoVar = ajwo.a;
        }
        l(ajueVar, arbjVar, ajwoVar);
    }

    public final void i(ajue ajueVar, arbj arbjVar, ajwo ajwoVar, zws zwsVar) {
        g(zwsVar);
        f(rqf.a, null);
        l(ajueVar, arbjVar, ajwoVar);
    }

    public final void j(boolean z, boolean z2) {
        if (!z2) {
            aihf aihfVarCreateBuilder = aiqv.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            aiqv aiqvVar = (aiqv) aihfVarCreateBuilder.instance;
            aiqvVar.c = 2;
            aiqvVar.b |= 1;
            aiqv aiqvVar2 = (aiqv) aihfVarCreateBuilder.build();
            alou alouVar = alou.a;
            alos alosVar = (alos) alouVar.createBuilder();
            alosVar.copyOnWrite();
            alou alouVar2 = (alou) alosVar.instance;
            aiqvVar2.getClass();
            alouVar2.d = aiqvVar2;
            alouVar2.c = 23;
            awmd awmdVar = this.g;
            ((dov) awmdVar.io()).S((alou) alosVar.build(), b());
            aihf aihfVarCreateBuilder2 = aiqw.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            aiqw aiqwVar = (aiqw) aihfVarCreateBuilder2.instance;
            aiqwVar.c = 2;
            aiqwVar.b |= 1;
            aiqw aiqwVar2 = (aiqw) aihfVarCreateBuilder2.build();
            alos alosVar2 = (alos) alouVar.createBuilder();
            alosVar2.copyOnWrite();
            alou alouVar3 = (alou) alosVar2.instance;
            aiqwVar2.getClass();
            alouVar3.d = aiqwVar2;
            alouVar3.c = 24;
            ((dov) awmdVar.io()).T((alou) alosVar2.build(), zvz.a);
        }
        k(z);
        this.h.e(new zwu(z2, false));
        f(rqf.b, null);
    }
}
