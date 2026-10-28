package defpackage;

import android.content.Context;
import android.os.Build;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.MoreExecutors;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import org.chromium.net.CronetEngine;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nyr implements aupn {
    private final /* synthetic */ int $cid;

    public nyr(int i) {
        this.$cid = i;
    }

    public static avmb b(agev agevVar) {
        agfr agfrVar = nyq.a;
        avmb avmbVar = awlg.c;
        avnn avnnVar = atqp.i;
        return (avmb) agevVar.e(avmbVar);
    }

    public static nuc c(agev agevVar, agev agevVar2, aunn aunnVar) {
        nuc mfhVar;
        if (!((Boolean) agevVar2.e(Boolean.FALSE)).booleanValue()) {
            mfhVar = (nuc) agevVar.e(new nym());
        } else if (agevVar.g()) {
            HashSet hashSet = new HashSet();
            hashSet.add((nuc) aunnVar.io());
            hashSet.add(agevVar.c());
            mfhVar = new mfh(hashSet);
        } else {
            mfhVar = (nuc) aunnVar.io();
        }
        fvc.a = new nzj(mfhVar);
        mfhVar.getClass();
        return mfhVar;
    }

    public static aiew d() {
        aihf aihfVarCreateBuilder = aiew.a.createBuilder();
        if (Build.VERSION.SDK_INT >= 37) {
            aihfVarCreateBuilder.copyOnWrite();
            aiew aiewVar = (aiew) aihfVarCreateBuilder.instance;
            aiewVar.b |= 1048576;
            aiewVar.l = true;
        }
        aiew aiewVar2 = (aiew) aihfVarCreateBuilder.build();
        aiewVar2.getClass();
        return aiewVar2;
    }

    public static aiew e() {
        aihf aihfVarCreateBuilder = aiew.a.createBuilder();
        if (Build.VERSION.SDK_INT >= 36) {
            aihfVarCreateBuilder.copyOnWrite();
            aiew aiewVar = (aiew) aihfVarCreateBuilder.instance;
            aiewVar.b |= 131072;
            aiewVar.j = true;
        }
        aiew aiewVar2 = (aiew) aihfVarCreateBuilder.build();
        aiewVar2.getClass();
        return aiewVar2;
    }

    public static aiew f() {
        aihf aihfVarCreateBuilder = aiew.a.createBuilder();
        if (auvd.a.io().a()) {
            aihf aihfVarCreateBuilder2 = aiev.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            aiev aievVar = (aiev) aihfVarCreateBuilder2.instance;
            aievVar.b |= 2;
            aievVar.d = true;
            aihfVarCreateBuilder.copyOnWrite();
            aiew aiewVar = (aiew) aihfVarCreateBuilder.instance;
            aiev aievVar2 = (aiev) aihfVarCreateBuilder2.build();
            aievVar2.getClass();
            aiewVar.c = aievVar2;
            aiewVar.b |= 1;
        }
        aiew aiewVar2 = (aiew) aihfVarCreateBuilder.build();
        aiewVar2.getClass();
        return aiewVar2;
    }

    public static aiew g() {
        aihf aihfVarCreateBuilder = aiew.a.createBuilder();
        aihfVarCreateBuilder.getClass();
        if (auwb.a.io().b()) {
            aihfVarCreateBuilder.copyOnWrite();
            aiew aiewVar = (aiew) aihfVarCreateBuilder.instance;
            aiewVar.b |= 64;
            aiewVar.d = true;
            aihfVarCreateBuilder.copyOnWrite();
            aiew aiewVar2 = (aiew) aihfVarCreateBuilder.instance;
            aiewVar2.b |= SemanticState.Focused;
            aiewVar2.e = true;
        }
        aihn aihnVarBuild = aihfVarCreateBuilder.build();
        aihnVarBuild.getClass();
        return (aiew) aihnVarBuild;
    }

    public static Random h(mbc mbcVar) {
        mbcVar.getClass();
        return new Random(mbcVar.f().toEpochMilli());
    }

    public static aiew i() {
        aihf aihfVarCreateBuilder = aiew.a.createBuilder();
        aihfVarCreateBuilder.getClass();
        aihfVarCreateBuilder.copyOnWrite();
        aiew aiewVar = (aiew) aihfVarCreateBuilder.instance;
        aiewVar.b |= SemanticState.Hidden;
        aiewVar.f = true;
        aihn aihnVarBuild = aihfVarCreateBuilder.build();
        aihnVarBuild.getClass();
        return (aiew) aihnVarBuild;
    }

    public static ahey j(agev agevVar) {
        int i = pof.a;
        ahey aheyVar = (ahey) ((awmd) ((agfa) agevVar).a).io();
        if (aheyVar != null) {
            return aheyVar;
        }
        ahfi ahfiVar = new ahfi();
        ahfiVar.c("gnp-blocking-thread-%d");
        return new plo(MoreExecutors.a(Executors.newCachedThreadPool(ahfi.a(ahfiVar))), MoreExecutors.b(Executors.newSingleThreadScheduledExecutor()));
    }

    public static awou k(ahex ahexVar) {
        ahexVar.getClass();
        return new awvw(ahexVar);
    }

    public static awou l(ahex ahexVar) {
        ahexVar.getClass();
        return new awvw(ahexVar);
    }

    public static String m(String str) {
        int i = pok.a;
        String host = new URL(str).getHost();
        host.getClass();
        return host;
    }

    public static agfr n(final Context context, final ScheduledExecutorService scheduledExecutorService, final ayq ayqVar, final aunn aunnVar, final agev agevVar, final oii oiiVar) {
        agfr agfrVarAl = aguu.al(new agfr() { // from class: ojz
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, oyz] */
            @Override // defpackage.agfr
            public final Object io() {
                oiiVar.t();
                ojy ojyVar = new ojy(scheduledExecutorService);
                CronetEngine cronetEngine = (CronetEngine) aunnVar.io();
                cronetEngine.getClass();
                grj grjVar = new grj(new qcb(cronetEngine, null));
                Context context2 = context;
                ozc ozcVar = new ozc(grjVar, context2, ojyVar);
                ozcVar.g(((agfa) agevVar).a);
                return new xsc(context2, (Object) ozcVar, (Object) ayqVar);
            }
        });
        agfrVarAl.getClass();
        return agfrVarAl;
    }

    public static zpw o(Context context, ahex ahexVar, agke agkeVar, wjr wjrVar, ayq ayqVar, ooh oohVar, agev agevVar, agfr agfrVar, agev agevVar2, agev agevVar3, agev agevVar4, rrq rrqVar, agev agevVar5, agev agevVar6, agev agevVar7) {
        ArrayList arrayList = new ArrayList();
        agdf agdfVar = agdf.a;
        Context applicationContext = context.getApplicationContext();
        ahexVar.getClass();
        arrayList.addAll(agkeVar);
        agfa agfaVar = new agfa(wjrVar);
        agfr agfrVarAl = aguu.al(agfrVar);
        agfa agfaVar2 = new agfa(okb.class);
        applicationContext.getClass();
        ayqVar.getClass();
        rrqVar.getClass();
        oohVar.getClass();
        agfrVarAl.getClass();
        ahfg ahfgVar = new ahfg(ahexVar);
        omj omjVar = new omj(applicationContext);
        omm ommVar = new omm(ahfgVar, ahexVar);
        oml omlVar = new oml(agevVar2, agfrVarAl);
        oii oiiVar = (oii) agevVar6.e(new ojd());
        ong ongVar = new ong(applicationContext, (vwt) ((agfa) agevVar3).a, new omj(agfe.a));
        omn omnVar = new omn(ayqVar, oohVar, ongVar, agevVar, agevVar4, agevVar5, agdfVar, new agfa(new qnl(applicationContext)), oiiVar, agdfVar, agdfVar);
        omr omrVar = new omr(ahexVar, rrqVar);
        atqq.b(omjVar, omj.class);
        atqq.b(omlVar, oml.class);
        atqq.b(ommVar, omm.class);
        atqq.b(omnVar, omn.class);
        atqq.b(omrVar, omr.class);
        aupr auprVarC = aupm.c(new oan(omnVar, 12));
        aupr auprVarC2 = aupm.c(new omq(omnVar));
        omk omkVar = new omk(omjVar);
        aupr auprVarC3 = aupm.c(new oan(omnVar, 15));
        aupr auprVarC4 = aupm.c(new oan(omnVar, 14));
        omf omfVar = new omf(omkVar, auprVarC2, auprVarC3, auprVarC4);
        aupr auprVarC5 = aupm.c(new obe((Object) omkVar, auprVarC3, 10));
        aupr auprVarC6 = aupm.c(new oan(omnVar, 19));
        olr olrVar = new olr(auprVarC4);
        aupr auprVarC7 = aupm.c(new obv(omrVar, omkVar, auprVarC5, auprVarC6, auprVarC, olrVar, auprVarC3, 8));
        aupr auprVarC8 = aupm.c(new oan(ommVar, 10));
        aupr auprVarC9 = aupm.c(new obx((aupr) omkVar, auprVarC2, auprVarC7, auprVarC8, auprVarC4, 11, (short[][]) null));
        aupr auprVarC10 = aupm.c(new obe((Object) omkVar, auprVarC3, 9));
        aupr auprVarC11 = aupm.c(new oan(new olf(omkVar, auprVarC, omfVar, auprVarC9, aupm.c(new obx((aupr) omkVar, auprVarC2, aupm.c(new obv(omrVar, omkVar, auprVarC10, auprVarC6, auprVarC, olrVar, auprVarC3, 6)), auprVarC8, auprVarC4, 9, (short[][]) null)), auprVarC5, auprVarC10, olrVar, auprVarC6, auprVarC8, auprVarC4), 17));
        aupr auprVarC12 = aupm.c(new oan(omlVar, 8));
        aupr auprVarC13 = aupm.c(new oan(omnVar, 16));
        aupr auprVarC14 = aupm.c(new oan(omnVar, 11));
        aupr auprVarC15 = aupm.c(new oda(omrVar, omkVar, auprVarC3, 5));
        aupr auprVarC16 = aupm.c(new oan(aupm.c(omo.a), 20));
        aupr auprVarC17 = aupm.c(new oda(auprVarC15, auprVarC16, auprVarC8, 4, (int[]) null));
        aupr auprVarC18 = aupm.c(new oan(omlVar, 7));
        omd omdVar = new omd(omkVar, auprVarC16, auprVarC2, auprVarC3, auprVarC8);
        aupr auprVarC19 = aupm.c(new obe((Object) omkVar, auprVarC3, 8));
        aupr auprVarC20 = aupm.c(new obx(omkVar, auprVarC16, auprVarC2, aupm.c(new obv(omrVar, omkVar, auprVarC19, auprVarC6, auprVarC, olrVar, auprVarC3, 7)), auprVarC8, 10, (int[][]) null));
        aupr auprVarC21 = aupm.c(new obe((Object) omkVar, auprVarC3, 7));
        aupr auprVarC22 = aupm.c(new oan(new old(auprVarC, omdVar, auprVarC20, aupm.c(new omp(omkVar, auprVarC16, auprVarC2, aupm.c(new obv(omrVar, omkVar, auprVarC21, auprVarC6, auprVarC, olrVar, auprVarC3, 5)), auprVarC8, auprVarC4, 0)), auprVarC19, auprVarC21, olrVar, auprVarC6, auprVarC8, auprVarC4), 13));
        aupr auprVarC23 = aupm.c(new obe(omnVar, omkVar, 6));
        aupr auprVarC24 = aupm.c(new oan(omnVar, 18));
        aupr auprVarC25 = aupm.c(new oan(ommVar, 9));
        onc oncVar = (onc) auprVarC17.io();
        oncVar.getClass();
        ongVar.a = new agfa(oncVar);
        syn synVar = new syn(applicationContext.getApplicationContext(), new agfa(agfaVar2.a), new ahfg(ahfgVar), aguu.al(agfrVarAl));
        ong ongVar2 = (ong) auprVarC.io();
        Object obj = omjVar.a;
        obj.getClass();
        ong ongVar3 = (ong) auprVarC.io();
        omn omnVarBe = qnl.be(omjVar, omnVar, auprVarC, auprVarC2, auprVarC3, auprVarC4, auprVarC6, auprVarC8, auprVarC11, auprVarC12, auprVarC13, auprVarC14, auprVarC17, auprVarC18, auprVarC22);
        omb ombVar = (omb) auprVarC11.io();
        xgg xggVarBf = qnl.bf(omjVar, omnVar, auprVarC, auprVarC2, auprVarC3, auprVarC4, auprVarC6, auprVarC8, auprVarC11, auprVarC12, auprVarC13, auprVarC14, auprVarC16, auprVarC17, auprVarC18, auprVarC22, auprVarC23, auprVarC24, auprVarC25);
        ola olaVar = (ola) auprVarC22.io();
        obj.getClass();
        Context context2 = (Context) obj;
        omn omnVar2 = new omn(context2, (ola) auprVarC22.io(), qnl.be(omjVar, omnVar, auprVarC, auprVarC2, auprVarC3, auprVarC4, auprVarC6, auprVarC8, auprVarC11, auprVarC12, auprVarC13, auprVarC14, auprVarC17, auprVarC18, auprVarC22), (omb) auprVarC11.io(), (ong) auprVarC.io(), (omj) auprVarC16.io(), (ayq) auprVarC6.io(), (agev) auprVarC3.io(), (qnl) auprVarC2.io(), (Executor) auprVarC8.io(), (oii) auprVarC4.io());
        qnl qnlVar = (qnl) auprVarC2.io();
        obj.getClass();
        onp onpVar = new onp(context2, (ola) auprVarC22.io(), qnl.be(omjVar, omnVar, auprVarC, auprVarC2, auprVarC3, auprVarC4, auprVarC6, auprVarC8, auprVarC11, auprVarC12, auprVarC13, auprVarC14, auprVarC17, auprVarC18, auprVarC22), (ayq) auprVarC6.io(), (ong) auprVarC.io(), (qnl) auprVarC2.io(), (agev) auprVarC3.io(), (Executor) auprVarC8.io());
        syn synVar2 = new syn(qnl.bf(omjVar, omnVar, auprVarC, auprVarC2, auprVarC3, auprVarC4, auprVarC6, auprVarC8, auprVarC11, auprVarC12, auprVarC13, auprVarC14, auprVarC16, auprVarC17, auprVarC18, auprVarC22, auprVarC23, auprVarC24, auprVarC25), (ola) auprVarC22.io(), (ong) auprVarC.io(), (Executor) auprVarC8.io());
        obj.getClass();
        ong ongVar4 = (ong) auprVarC.io();
        isi isiVar = new isi(ongVar4, (oii) auprVarC4.io(), (onc) auprVarC17.io());
        agev agevVar8 = (agev) auprVarC3.io();
        Executor executor = (Executor) auprVarC8.io();
        agev agevVar9 = (agev) auprVarC24.io();
        oii oiiVar2 = (oii) auprVarC4.io();
        onc oncVar2 = (onc) auprVarC17.io();
        qnl.bS(omnVar, auprVarC4, auprVarC8, auprVarC22);
        return new zpw(applicationContext, ongVar2, new olp(context2, ongVar3, omnVarBe, ombVar, xggVarBf, olaVar, omnVar2, qnlVar, onpVar, synVar2, isiVar, agevVar8, executor, agevVar9, oiiVar2, oncVar2), ahfgVar, arrayList, agfaVar, ayqVar, agevVar, agfaVar2, oiiVar, synVar, agevVar7, (omj) auprVarC16.io());
    }

    @Override // defpackage.awmd, defpackage.awmc
    public final /* synthetic */ Object io() {
        switch (this.$cid) {
            case 0:
                throw null;
            case 1:
                throw null;
            case 2:
                return new obg();
            case 3:
                return new rbm((byte[]) null);
            case 4:
                return new oct();
            case 5:
                return new odq();
            case 6:
                return new odq();
            case 7:
                return new oev();
            case 8:
                throw null;
            case 9:
                throw null;
            case 10:
                return new tyq(1);
            case 11:
                throw null;
            case 12:
                throw null;
            case 13:
                throw null;
            case 14:
                throw null;
            case 15:
                throw null;
            case 16:
                throw null;
            case 17:
                throw null;
            case 18:
                throw null;
            case 19:
                throw null;
            default:
                throw null;
        }
    }
}
