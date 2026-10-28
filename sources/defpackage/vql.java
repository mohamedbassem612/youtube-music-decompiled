package defpackage;

import android.app.Activity;
import android.view.View;
import j$.util.Optional;
import java.io.File;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vql implements aupn {
    public static View b(Activity activity, Map map) {
        View view = (View) ((awmd) map.get(activity.getClass())).io();
        view.getClass();
        return view;
    }

    public static View c(Activity activity, Map map) {
        View view = (View) ((awmd) map.get(activity.getClass())).io();
        view.getClass();
        return view;
    }

    public static Set d(tqj tqjVar, awmd awmdVar) {
        int i = tqr.a;
        Set agqjVar = !tqjVar.k(1073830462) ? agpr.a : new agqj((zxy) awmdVar.io());
        agqjVar.getClass();
        return agqjVar;
    }

    public static Set e(zxy zxyVar) {
        Set agqjVar = zxyVar != null ? new agqj(zxyVar) : agpr.a;
        agqjVar.getClass();
        return agqjVar;
    }

    public static tmo f(mbc mbcVar, vvn vvnVar, Optional optional, tqj tqjVar, awmd awmdVar) {
        mbcVar.getClass();
        vvnVar.getClass();
        optional.getClass();
        tqjVar.getClass();
        awmdVar.getClass();
        int i = tqr.a;
        if (tqjVar.k(1073840112)) {
            return new tnn();
        }
        tow towVar = new tow(mbcVar, vvnVar.a, (vwp) optional.orElse(null));
        if (tym.as(tqjVar)) {
            ((tes) awmdVar.io()).b(towVar, tew.c, tew.d, tew.e, tew.f);
        }
        return towVar;
    }

    public static tmo g(File file, vvn vvnVar, Executor executor, vxz vxzVar, tqj tqjVar) {
        file.getClass();
        vvnVar.getClass();
        executor.getClass();
        vxzVar.getClass();
        tqjVar.getClass();
        return new tpd(file, vvnVar.b, executor, vxzVar, tqjVar);
    }

    public static Optional h(vwp vwpVar, tqj tqjVar) {
        tqjVar.getClass();
        int i = tqr.a;
        if (tqjVar.k(1073840112)) {
            return Optional.empty();
        }
        return new Random().nextInt(100000) >= tqjVar.a(1074863552) ? Optional.empty() : Optional.of(vwpVar);
    }

    public static wjz i(awmd awmdVar, tag tagVar) {
        awmdVar.getClass();
        tagVar.getClass();
        return new wjz(new wjx(1), awmdVar, tagVar, tai.d);
    }

    public static tgg j(tqj tqjVar, aunn aunnVar, aunn aunnVar2) {
        int i = tqr.a;
        tgg tggVarU = tzk.U(tqjVar, 1073829872, aunnVar, aunnVar2);
        tggVarU.getClass();
        return tggVarU;
    }

    public static tgg k(tqj tqjVar, aunn aunnVar, aunn aunnVar2) {
        int i = tqr.a;
        tgg tggVarU = tzk.U(tqjVar, 1073829873, aunnVar, aunnVar2);
        tggVarU.getClass();
        return tggVarU;
    }

    public static tgg l(tqj tqjVar, aunn aunnVar, aunn aunnVar2) {
        int i = tqr.a;
        tgg tggVarU = tzk.U(tqjVar, 1073829874, aunnVar, aunnVar2);
        tggVarU.getClass();
        return tggVarU;
    }

    public static tgg m(tqj tqjVar, aunn aunnVar, aunn aunnVar2) {
        int i = tqr.a;
        tgg tggVarU = tzk.U(tqjVar, 1073829875, aunnVar, aunnVar2);
        tggVarU.getClass();
        return tggVarU;
    }

    public static tgg n(vvn vvnVar, tgm tgmVar, tmo tmoVar, Optional optional, tgl tglVar, ExecutorService executorService, ExecutorService executorService2) {
        tgh tghVar = new tgh();
        tghVar.e(false);
        tghVar.g();
        tghVar.b(tmoVar);
        tghVar.c(optional);
        tghVar.f(tglVar);
        int i = vvnVar.c;
        tghVar.g();
        tghVar.e = "bg-innertube";
        tghVar.a = Optional.of(executorService);
        tghVar.c = Optional.of(executorService2);
        tghVar.d(executorService2);
        tgg tggVarA = tgmVar.a(tghVar.a());
        tggVarA.getClass();
        return tggVarA;
    }

    public static tgg o(vvn vvnVar, tgm tgmVar, tmo tmoVar, Optional optional, tgl tglVar, ExecutorService executorService, ExecutorService executorService2, Executor executor) {
        tgh tghVar = new tgh();
        tghVar.e(false);
        tghVar.g();
        tghVar.b(tmoVar);
        tghVar.c(optional);
        tghVar.f(tglVar);
        int i = vvnVar.c;
        tghVar.g();
        tghVar.e = "ui-innertube";
        tghVar.a = Optional.of(executorService);
        tghVar.c = Optional.of(executorService2);
        tghVar.d(executor);
        tgg tggVarA = tgmVar.a(tghVar.a());
        tggVarA.getClass();
        return tggVarA;
    }

    public static vxe p(afpa afpaVar) {
        vxe vxeVarT = ((vxm) atqp.a(afpaVar.a, vxm.class)).T();
        vxeVarT.getClass();
        return vxeVarT;
    }

    public static vxe q(awmd awmdVar, Activity activity, Map map) {
        agev agevVarA = agev.h((awmd) map.get(activity.getClass())).a(new qmd(7));
        awmdVar.getClass();
        return (vxe) agevVarA.d(new tpc(awmdVar, 10));
    }

    public static vwx r(vxa vxaVar, Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new vwz(map));
        return new vwy(vxaVar, agke.n(arrayList));
    }

    public static wlp s(abwg abwgVar) {
        return abwgVar.a(new jxp(20), false);
    }

    public static wlp t(abwg abwgVar) {
        return abwgVar.a(new xjr(1), false);
    }

    public static tzk u(Activity activity, tzk tzkVar, Map map) {
        if (map.get(activity.getClass()) != null) {
            tzkVar = (tzk) ((awmd) map.get(activity.getClass())).io();
        }
        tzkVar.getClass();
        return tzkVar;
    }

    public static abxv v(awmd awmdVar, Executor executor, Executor executor2, Executor executor3, tqj tqjVar, awmd awmdVar2) {
        awmdVar.getClass();
        executor.getClass();
        executor2.getClass();
        executor3.getClass();
        tqjVar.getClass();
        awmdVar2.getClass();
        return new abxv(awmdVar, new wkv(tqjVar, executor, executor3), awmdVar2);
    }

    @Override // defpackage.awmd, defpackage.awmc
    public final /* synthetic */ Object io() {
        throw null;
    }
}
