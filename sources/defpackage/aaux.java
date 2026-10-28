package defpackage;

import android.content.Context;
import com.google.android.libraries.youtube.blocks.BlocksRuntimeProxy;
import j$.util.Optional;
import java.util.Collections;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aaux implements aupn {
    public static fg b(aceo aceoVar) {
        fg fgVarC = aceoVar.c();
        fgVarC.getClass();
        return fgVarC;
    }

    public static abea c(tqj tqjVar, awmd awmdVar, awmd awmdVar2) {
        int i = tqr.a;
        abea abeaVar = tqjVar.k(1073830357) ? (abea) awmdVar2.io() : (abea) awmdVar.io();
        abeaVar.getClass();
        return abeaVar;
    }

    public static tpq d(awmd awmdVar) {
        tpq tpqVar = (tpq) awmdVar.io();
        tpqVar.getClass();
        return tpqVar;
    }

    public static avlh e(awkv awkvVar) {
        return awkvVar.x(new xib(3)).N();
    }

    public static avlh f(avlh avlhVar, avmb avmbVar) {
        return avlhVar.N().L(avmbVar).S();
    }

    public static abvc g(Optional optional, abuy abuyVar) {
        abvc abvcVar = (abvc) optional.orElse(abuyVar);
        abvcVar.getClass();
        return abvcVar;
    }

    public static Set h(awmd awmdVar, abmt abmtVar) {
        Set setSingleton = abmtVar.au() ? Collections.singleton((acii) awmdVar.io()) : Collections.EMPTY_SET;
        setSingleton.getClass();
        return setSingleton;
    }

    public static abwj i(Optional optional) {
        abwj abwjVar = (abwj) optional.orElse(abwj.a().a());
        abwjVar.getClass();
        return abwjVar;
    }

    public static acii j(abzz abzzVar, vxu vxuVar) {
        acii aciiVar = abzzVar;
        if (abmt.co(vxuVar)) {
            aciiVar = new acii(0);
        }
        aciiVar.getClass();
        return aciiVar;
    }

    public static abvp k(abmt abmtVar, Object obj, avlh avlhVar) {
        return new abvp(abmtVar, (aerz) obj, avlhVar);
    }

    public static avlh l(awku awkuVar) {
        return awkuVar.x(new xib(5)).N();
    }

    public static avlh m(awku awkuVar, Optional optional) {
        avlh avlhVarN = awkuVar.x(new xib(4)).N();
        optional.isPresent();
        aeod aeodVar = (aeod) optional.get();
        abmt abmtVar = (abmt) aeodVar.b;
        boolean zBY = abmtVar.bY();
        boolean zAR = abmtVar.aR();
        if (!zBY) {
            if (!zAR) {
                return avlhVarN;
            }
            zAR = true;
        }
        return avlhVarN.H(new abqe(new acju(zBY, aeodVar, zAR, 0), 11));
    }

    public static avlh n(awku awkuVar) {
        return awkuVar.x(new xib(6)).N();
    }

    public static void o(Context context, awku awkuVar) {
        context.getClass();
        awkuVar.getClass();
    }

    public static abvk p(abvn abvnVar) {
        abvk abvkVarO = abvnVar.o();
        abvkVarO.getClass();
        return abvkVarO;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [awmd, java.lang.Object] */
    public static acyz q(awmd awmdVar, Optional optional) {
        awmdVar.getClass();
        sxe sxeVar = new sxe(awmdVar, 5);
        optional.isPresent();
        acyz acyzVar = (acyz) sxeVar.a.io();
        acyzVar.getClass();
        return acyzVar;
    }

    public static void r(aczb aczbVar) {
        int i = adba.a;
        aczbVar.getClass();
    }

    public static agev s() {
        int i = adba.a;
        return agev.h(BlocksRuntimeProxy.createContainerLoader());
    }

    public static sym t(Context context, String str, ahex ahexVar, rrq rrqVar, ayq ayqVar) {
        atpu atpuVarE = aawb.e();
        qrn qrnVar = new qrn(context.getApplicationContext(), ahexVar);
        qrnVar.b();
        qrnVar.c = str;
        qrnVar.d(aawb.QUICK_SEEK_PREFERENCE_STRING, "nerd_stats_enabled", "autonav");
        qrnVar.e(new onw(atpuVarE, 4));
        qrp qrpVarA = qrnVar.a();
        qrl qrlVarA = qrm.a();
        Pattern pattern = qpr.a;
        qpq qpqVar = new qpq(context);
        qpqVar.c("player");
        qpqVar.d("features/backup.pb");
        qrlVarA.f(qpqVar.a());
        qrlVarA.e(atpuVarE);
        qrlVarA.b(qrpVarA);
        return ayqVar.P(omj.U(rrqVar.c(qrlVarA.a())), aawb.e());
    }

    public static axfd u(zjk zjkVar, ci ciVar) {
        gil gilVar = (gil) ciVar.a;
        zjkVar.b = (abep) gilVar.db.io();
        axfd axfdVar = (axfd) gilVar.aX.io();
        axfdVar.getClass();
        return axfdVar;
    }

    public static ez v(ci ciVar) {
        hgs hgsVar = (hgs) ((gil) ciVar.a).a.Gc.io();
        hgsVar.getClass();
        if (hgsVar.C == null) {
            hgsVar.C = new hgq(hgsVar);
        }
        hgq hgqVar = hgsVar.C;
        hgqVar.getClass();
        return hgqVar;
    }

    @Override // defpackage.awmd, defpackage.awmc
    public final /* synthetic */ Object io() {
        throw null;
    }
}
