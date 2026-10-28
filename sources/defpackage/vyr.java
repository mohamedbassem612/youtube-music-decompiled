package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.libraries.elements.interfaces.ByteStore;
import j$.util.Optional;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vyr implements aupn {
    public static wag b(awmd awmdVar) {
        wag wagVar = (wag) awmdVar.io();
        wagVar.getClass();
        return wagVar;
    }

    public static sqs c(boolean z, awmd awmdVar, awmd awmdVar2) {
        sqs sqsVar = z ? (sqs) awmdVar2.io() : (sqs) awmdVar.io();
        sqsVar.getClass();
        return sqsVar;
    }

    public static avlr d(vyo vyoVar, avmb avmbVar) {
        return vyoVar.c(new vup(17)).O(avmbVar);
    }

    public static avlr e(vyo vyoVar, avmb avmbVar) {
        return vyoVar.c(new vup(18)).O(avmbVar);
    }

    public static vzt f(awmd awmdVar, Optional optional, Optional optional2) {
        vzt vztVar = (!((Boolean) optional.orElse(Boolean.FALSE)).booleanValue() || optional2.isEmpty()) ? (vzt) awmdVar.io() : (vzt) ((awmd) optional2.get()).io();
        vztVar.getClass();
        return vztVar;
    }

    public static agke g(Set set) {
        agke agkeVarN = agke.n(set);
        agkeVarN.getClass();
        return agkeVarN;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, wbz] */
    public static wbz h(agev agevVar) {
        return ((agfa) agevVar).a;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, wco] */
    public static wco i(agev agevVar) {
        return ((agfa) agevVar).a;
    }

    public static ByteStore j(agev agevVar) {
        return (ByteStore) ((agfa) agevVar).a;
    }

    public static wfl k(awmd awmdVar) {
        wfl wflVar = (wfl) awmdVar.io();
        wflVar.getClass();
        return wflVar;
    }

    public static wfp l(awmd awmdVar, tqj tqjVar, awmd awmdVar2) {
        wfp wfqVar;
        int i = tqr.a;
        if (tqjVar.k(1073815024)) {
            wfqVar = (wfp) awmdVar.io();
        } else {
            int iC = (int) ((vxz) awmdVar2.io()).c(14, 45627166L, 0L);
            wfqVar = iC == 0 ? new wfq(1) : new wfo(iC);
        }
        wfqVar.getClass();
        return wfqVar;
    }

    public static wkd m(tqj tqjVar, awmd awmdVar, awmd awmdVar2) {
        int i = tqr.a;
        wkd wkdVar = tqjVar.k(1073815451) ? (wkd) awmdVar2.io() : (wkd) awmdVar.io();
        wkdVar.getClass();
        return wkdVar;
    }

    public static wps n(vvn vvnVar, awmd awmdVar) {
        boolean z = vvnVar.f;
        wps wpsVar = (wps) awmdVar.io();
        wpsVar.getClass();
        return wpsVar;
    }

    public static zvl o(awmd awmdVar, awmd awmdVar2, tqj tqjVar) {
        int i = tqr.a;
        if (true == tqjVar.k(1073829854)) {
            awmdVar = awmdVar2;
        }
        zvl zvlVar = (zvl) awmdVar.io();
        zvlVar.getClass();
        return zvlVar;
    }

    public static wll p(omn omnVar) {
        wll wllVarA = omnVar.a();
        wllVarA.getClass();
        return wllVarA;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [agfr, java.lang.Object] */
    public static vyo q(omn omnVar) {
        vyo vyoVar = (vyo) omnVar.c.io();
        vyoVar.getClass();
        return vyoVar;
    }

    public static qrx r(Context context, String str, ahex ahexVar, rrq rrqVar) {
        qrn qrnVar = new qrn(context.getApplicationContext(), ahexVar);
        qrnVar.b();
        qrnVar.c = str;
        qrnVar.d("innertube_safety_mode_enabled");
        qrnVar.e(new tpi(2));
        qrp qrpVarA = qrnVar.a();
        qrl qrlVarA = qrm.a();
        Pattern pattern = qpr.a;
        qpq qpqVar = new qpq(context);
        qpqVar.c("innertube");
        qpqVar.d("innertube_backedup.pb");
        qrlVarA.f(qpqVar.a());
        qrlVarA.e(atou.a);
        qrlVarA.b(qrpVarA);
        qrx qrxVarC = rrqVar.c(qrlVarA.a());
        qrxVarC.getClass();
        return qrxVarC;
    }

    public static qrx s(Context context, String str, ahex ahexVar, rrq rrqVar) {
        Pattern pattern = qpr.a;
        qpq qpqVar = new qpq(context);
        qpqVar.c("innertube");
        qpqVar.d("innertube.pb");
        Uri uriA = qpqVar.a();
        qrl qrlVarA = qrm.a();
        atov atovVar = atov.a;
        qrlVarA.e(atovVar);
        qrlVarA.f(uriA);
        hes hesVar = new hes(15);
        qrn qrnVar = new qrn(context.getApplicationContext(), ahexVar);
        qrnVar.c = str;
        qrnVar.d("com.google.android.libraries.youtube.innertube.pref.player_config_supplier");
        qrnVar.e(new onw(hesVar, 2));
        qrlVarA.b(qrnVar.a());
        hes hesVar2 = new hes(16);
        qrn qrnVar2 = new qrn(context.getApplicationContext(), ahexVar);
        qrnVar2.c = str;
        qrnVar2.d("attribution_data");
        qrnVar2.e(new onw(hesVar2, 3));
        qrlVarA.b(qrnVar2.a());
        qrlVarA.d(new qsa(atovVar));
        qrx qrxVarC = rrqVar.c(qrlVarA.a());
        qrxVarC.getClass();
        return qrxVarC;
    }

    public static qrx t(Context context, rrq rrqVar) {
        Pattern pattern = qpr.a;
        qpq qpqVar = new qpq(context);
        qpqVar.c("mdd");
        qpqVar.d("TaskPeriods.pb");
        Uri uriA = qpqVar.a();
        qrl qrlVarA = qrm.a();
        qrlVarA.f(uriA);
        qrlVarA.e(ooj.a);
        qrx qrxVarC = rrqVar.c(qrlVarA.a());
        qrxVarC.getClass();
        return qrxVarC;
    }

    public static wvq u(Object obj, Object obj2, tzk tzkVar) {
        return new wvq((wvo) obj);
    }

    public static wdg v(Context context, hhb hhbVar, wfc wfcVar, tbt tbtVar, Executor executor, Object obj) {
        return new wdg(context, hhbVar, wfcVar, tbtVar, executor, (wjr) obj);
    }

    @Override // defpackage.awmd, defpackage.awmc
    public final /* synthetic */ Object io() {
        throw null;
    }
}
