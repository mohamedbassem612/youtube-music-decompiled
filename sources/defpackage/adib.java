package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Optional;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adib implements aupn {
    public static void b(adiz adizVar, tqj tqjVar, awmd awmdVar) {
        if (tym.ar(tqjVar)) {
            ((tes) awmdVar.io()).c(adizVar);
        }
        adizVar.getClass();
    }

    public static tgg c(tgm tgmVar, tmo tmoVar, tfu tfuVar, ExecutorService executorService, awut awutVar, ExecutorService executorService2, awut awutVar2) {
        tgh tghVar = new tgh();
        tghVar.e(false);
        tghVar.g();
        tghVar.b(tmoVar);
        tghVar.f(new tgl(tfuVar, null));
        tghVar.e = "glide-http-request-queue";
        tghVar.a = Optional.of(executorService2);
        tghVar.b = Optional.of(awutVar2);
        tghVar.c = Optional.of(executorService);
        tghVar.d = Optional.of(awutVar);
        tghVar.d(MoreExecutors.directExecutor());
        tghVar.e(true);
        tgg tggVarA = tgmVar.a(tghVar.a());
        tggVarA.getClass();
        return tggVarA;
    }

    public static adhp d(Context context, agev agevVar) {
        return (adhp) agevVar.d(new adav(context, 9));
    }

    public static ajbm e(tao taoVar) {
        anhb anhbVar = taoVar.a().j;
        if (anhbVar == null) {
            anhbVar = anhb.a;
        }
        ajbm ajbmVar = anhbVar.p;
        if (ajbmVar == null) {
            ajbmVar = ajbm.a;
        }
        ajbmVar.getClass();
        return ajbmVar;
    }

    public static xks f(vxz vxzVar, szb szbVar, tqj tqjVar, agev agevVar) {
        xks xksVarA;
        int i = tqr.a;
        if (tqjVar.k(1073815294)) {
            Optional optionalJ = agevVar.j();
            if (true == optionalJ.isPresent()) {
                optionalJ = Optional.ofNullable((xkq) ((awmd) optionalJ.get()).io());
            }
            if (true == optionalJ.isPresent()) {
                optionalJ = Optional.ofNullable(((xkq) optionalJ.get()).a(6));
            }
            xksVarA = (xks) optionalJ.orElse(xks.a(new int[]{0, 0}));
        } else {
            xksVarA = xks.a(new int[]{szbVar.b((float) vxzVar.a(3, 45688636L, 0.0d), szc.l), 0});
        }
        xksVarA.getClass();
        return xksVarA;
    }

    public static aeda g(aecz aeczVar, Optional optional) {
        aeda aedaVar = (aeda) optional.orElse(aeczVar);
        aedaVar.getClass();
        return aedaVar;
    }

    public static tfx h(tao taoVar, tqj tqjVar, awmd awmdVar) {
        tfx tfxVar = adul.m(taoVar, tqjVar) ? (tfx) awmdVar.io() : tfx.a;
        tfxVar.getClass();
        return tfxVar;
    }

    public static szb i(tqj tqjVar, awmd awmdVar, awmd awmdVar2) {
        int i = tqr.a;
        szb szbVar = tqjVar.k(1073816116) ? (szb) awmdVar2.io() : (szb) awmdVar.io();
        szbVar.getClass();
        return szbVar;
    }

    public static aerv j(qtj qtjVar, awmd awmdVar) {
        aerv aervVar = new aerv((ScheduledExecutorService) awmdVar.io(), qtjVar);
        qtl qtlVar = (qtl) aervVar.b;
        qtlVar.e = true;
        qtlVar.c = 100L;
        qtlVar.d = 60000L;
        return aervVar;
    }

    public static aesa k(Context context, mbc mbcVar, Object obj, xeu xeuVar, aery aeryVar, aetb aetbVar, tqj tqjVar) {
        return new aesa(context, mbcVar, (aerz) obj, xeuVar, aeryVar, aetbVar, tqjVar);
    }

    public static aese l(Context context, aetb aetbVar, aery aeryVar, Object obj, vxz vxzVar, awmd awmdVar) {
        return new aese(context, aetbVar, aeryVar, (aesa) obj, vxzVar, awmdVar);
    }

    public static aflp m(awmd awmdVar) {
        aflp aflpVar = (aflp) awmdVar.io();
        aflpVar.getClass();
        return aflpVar;
    }

    public static dzt n(Context context) {
        try {
            context.getClass();
            return ebm.j(context);
        } catch (IllegalStateException e) {
            throw new IllegalStateException("WorkManager instantiation failed. If you are in a test, add a dependency on\n\"//java/com/google/apps/tiktok/contrib/work/testing\",", e);
        }
    }

    public static dyj o(agev agevVar, Context context, aflr aflrVar, ahey aheyVar, awou awouVar, afkg afkgVar, dzv dzvVar) {
        dyj dyjVar = new dyj();
        aheyVar.getClass();
        dyjVar.a = aheyVar;
        dyjVar.e = new afls(afkgVar);
        aheyVar.getClass();
        dyjVar.d = aheyVar;
        awouVar.getClass();
        dyjVar.b = awouVar;
        dzvVar.getClass();
        dyjVar.c = dzvVar;
        Object packageName = ((agfa) ((aflg) ((agfa) agevVar).a).a).a;
        String str = (String) packageName;
        dyjVar.f = str;
        if (str.isEmpty()) {
            packageName = context.getPackageName();
        }
        afjn afjnVar = aflrVar.d;
        afii afiiVar = new afii(aflrVar, packageName, 5, null);
        ahex ahexVar = aflrVar.c;
        ahfo ahfoVar = new ahfo(Executors.callable(afwl.i(afiiVar), null));
        ahexVar.execute(ahfoVar);
        afjnVar.c(ahfoVar, 1L, TimeUnit.MINUTES);
        return dyjVar;
    }

    public static PackageInfo p(Context context, PackageManager packageManager) {
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
            packageInfo.getClass();
            return packageInfo;
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalStateException("Can't find our own package", e);
        }
    }

    public static awut q(awou awouVar) {
        awouVar.getClass();
        return new axcw(awouVar, 1);
    }

    public static afip r(afip afipVar, Optional optional) {
        afip afipVar2 = (afip) optional.orElse(afipVar);
        afipVar2.getClass();
        return afipVar2;
    }

    public static tpq s(Context context, ahex ahexVar, String str, rrq rrqVar, Optional optional) {
        optional.isPresent();
        boolean zBooleanValue = ((Boolean) optional.orElse(Boolean.TRUE)).booleanValue();
        Pattern pattern = qpr.a;
        qpq qpqVar = new qpq(context);
        qpqVar.c("systemhealth");
        qpqVar.d("system_health.pb");
        Uri uriA = qpqVar.a();
        qrn qrnVar = new qrn(context.getApplicationContext(), ahexVar);
        qrnVar.b();
        qrnVar.c = str;
        Iterable iterableD = agix.b(Arrays.asList(szc.values())).c(new abzy(6)).d();
        qrnVar.d((String[]) aguu.O(iterableD).toArray((Object[]) Array.newInstance((Class<?>) String.class, 0)));
        qrnVar.e(new tpi(7));
        qrp qrpVarA = qrnVar.a();
        qrl qrlVarA = qrm.a();
        qrlVarA.f(uriA);
        ator atorVar = ator.a;
        qrlVarA.e(atorVar);
        qrlVarA.b(qrpVarA);
        qrlVarA.g(zBooleanValue);
        return new tpn(omj.U(rrqVar.c(qrlVarA.a())), atorVar);
    }

    public static awou t(ahud ahudVar, ahey aheyVar) {
        aheyVar.getClass();
        awou awouVarW = ahudVar.W(aheyVar);
        awouVarW.getClass();
        return awouVarW;
    }

    public static awou u(ahud ahudVar, ahey aheyVar) {
        aheyVar.getClass();
        awou awouVarW = ahudVar.W(aheyVar);
        awouVarW.getClass();
        return awouVarW;
    }

    public static aga v(Context context, mew mewVar, owu owuVar, oxn oxnVar, oui ouiVar, kjc kjcVar, Set set, syn synVar) {
        int i = adgg.a;
        return qnl.aI(context, owuVar, oxnVar, ouiVar, kjcVar, set, synVar, mewVar);
    }

    @Override // defpackage.awmd, defpackage.awmc
    public final /* synthetic */ Object io() {
        throw null;
    }
}
