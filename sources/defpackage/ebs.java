package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.provider.MediaStore;
import android.util.Base64;
import androidx.work.impl.WorkDatabase;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.watchpage.ui.WatchWhileLayout;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ebs implements Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ ebs(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r10v55, types: [java.lang.Object, oii] */
    /* JADX WARN: Type inference failed for: r10v74, types: [java.lang.Object, rqu] */
    /* JADX WARN: Type inference failed for: r10v75, types: [java.lang.Object, rqu] */
    /* JADX WARN: Type inference failed for: r10v76, types: [java.lang.Object, rqu] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = 11;
        int i2 = 18;
        boolean z = true;
        int i3 = 0;
        switch (this.$cid) {
            case 0:
                eby ebyVar = (eby) this.a;
                String str = ebyVar.c;
                eet eetVar = ebyVar.f;
                if (eetVar.b(str) == dzr.a) {
                    eetVar.A(dzr.b, str);
                    eetVar.v(str);
                    eetVar.r(str, -256);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                ees eesVar = ((eby) this.a).a;
                if (eesVar.d != dzr.a) {
                    String str2 = eca.a;
                    dzf.b();
                    return Boolean.TRUE;
                }
                if ((!eesVar.e() && !eesVar.d()) || System.currentTimeMillis() >= eesVar.a()) {
                    return Boolean.FALSE;
                }
                dzf.b();
                String str3 = eca.a;
                return Boolean.TRUE;
            case 2:
                WorkDatabase workDatabase = (WorkDatabase) ((dov) this.a).a;
                Long lA = workDatabase.x().a("next_job_scheduler_id");
                int iLongValue = lA != null ? (int) lA.longValue() : 0;
                dms.g(workDatabase, iLongValue == Integer.MAX_VALUE ? 0 : iLongValue + 1);
                if (iLongValue < 0) {
                    dms.g(workDatabase, 1);
                } else {
                    i3 = iLongValue;
                }
                return Integer.valueOf(i3);
            case 3:
                Object obj = this.a;
                try {
                    return new kwf((Context) obj, ((Context) obj).getPackageName(), Integer.toString(((Context) obj).getPackageManager().getPackageInfo(((Context) obj).getPackageName(), 0).versionCode)).f();
                } catch (Throwable unused) {
                    return null;
                }
            case 4:
                return ((aanb) ((jan) this.a).h).b().l();
            case 5:
                return ((aanb) ((jan) this.a).h).b().i();
            case 6:
                return ((iuo) this.a).e.query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, ish.m, "is_music=1 AND title IS NOT NULL", null, null);
            case 7:
                return ((iuo) this.a).e.query(MediaStore.Audio.Playlists.EXTERNAL_CONTENT_URI, ish.n, null, null, null);
            case 8:
                Object obj2 = this.a;
                return ((vor) ((WatchWhileLayout) obj2).l.io()).d.p.ak(new joc(obj2, i2));
            case 9:
                oby obyVar = (oby) this.a;
                ((ocd) obyVar.b.io()).a();
                ((ocu) obyVar.a.io()).b();
                return null;
            case 10:
                Object obj3 = this.a;
                ebs ebsVar = new ebs(obj3, i);
                ofb ofbVarH = ((omj) ((aerj) obj3).g).h(101);
                try {
                    ofbVarH.c();
                    Object objCall = ebsVar.call();
                    ofbVarH.a();
                    return (String) objCall;
                } catch (Throwable th) {
                    try {
                        ofbVarH.b(th);
                        throw th;
                    } catch (Throwable th2) {
                        ofbVarH.a();
                        throw th2;
                    }
                }
            case 11:
                aerj aerjVar = (aerj) this.a;
                fxl fxlVar = (fxl) ((aihf) aerjVar.a).build();
                Object obj4 = aerjVar.d;
                Object obj5 = aerjVar.c;
                try {
                    return Base64.encodeToString(((fxp) ((ocd) obj5).g(fxlVar.toByteArray(), (String) obj4).build()).toByteArray(), 11);
                } catch (IllegalArgumentException unused2) {
                    return ((ocd) obj5).f(SemanticState.Obscured, (String) obj4);
                }
            case 12:
                Object obj6 = this.a;
                gqq gqqVar = new gqq(obj6, i2);
                synchronized (obj6) {
                    omj omjVar = ((oeo) obj6).e;
                    ListenableFuture listenableFutureF = ape.f(new oen(((oeo) obj6).a, ((oeo) obj6).b, i3));
                    ahex ahexVar = ((oeo) obj6).c;
                    int i4 = ahcs.c;
                    ahcr ahcrVar = new ahcr(listenableFutureF, gqqVar);
                    listenableFutureF.addListener(ahcrVar, MoreExecutors.c(ahexVar, ahcrVar));
                    omjVar.m(52, ahcrVar);
                    ((oeo) obj6).d = ahcrVar;
                    break;
                }
                return "";
            case 13:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.USER_PRESENT");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                Object obj7 = this.a;
                ((oey) obj7).a.registerReceiver((BroadcastReceiver) obj7, intentFilter);
                return null;
            case 14:
                agdf agdfVar = agdf.a;
                ojm ojmVar = new ojm(agdfVar, agdfVar);
                zpw zpwVar = (zpw) this.a;
                wjr wjrVar = (wjr) ((agfa) zpwVar.e).a;
                agkh agkhVar = new agkh(4);
                ?? r10 = zpwVar.g;
                agkhVar.e("MDD.CHARGING.PERIODIC.TASK", qnl.bm(r10.d()));
                agkhVar.e("MDD.MAINTENANCE.PERIODIC.GCM.TASK", qnl.bm(r10.c()));
                agkhVar.e("MDD.CELLULAR.CHARGING.PERIODIC.TASK", qnl.bm(r10.b()));
                agkhVar.e("MDD.WIFI.CHARGING.PERIODIC.TASK", qnl.bm(r10.e()));
                agkj agkjVarD = agkhVar.d(true);
                agev agevVar = ojmVar.b;
                ojq ojqVarA = ojr.a();
                ojqVarA.a = "MDD.CHARGING.PERIODIC.TASK";
                ojqVarA.c(21600L);
                ojqVarA.e = 3;
                ojqVarA.b = agev.h((ojp) agkjVarD.get("MDD.CHARGING.PERIODIC.TASK"));
                ojqVarA.b(agevVar);
                wjrVar.e(ojqVarA.a());
                ojq ojqVarA2 = ojr.a();
                ojqVarA2.a = "MDD.MAINTENANCE.PERIODIC.GCM.TASK";
                ojqVarA2.c(86400L);
                ojqVarA2.e = 3;
                ojqVarA2.b = agev.h((ojp) agkjVarD.get("MDD.MAINTENANCE.PERIODIC.GCM.TASK"));
                ojqVarA2.b(agevVar);
                wjrVar.e(ojqVarA2.a());
                ojq ojqVarA3 = ojr.a();
                ojqVarA3.a = "MDD.CELLULAR.CHARGING.PERIODIC.TASK";
                ojqVarA3.c(21600L);
                ojqVarA3.e = 1;
                ojqVarA3.b = agev.h((ojp) agkjVarD.get("MDD.CELLULAR.CHARGING.PERIODIC.TASK"));
                ojqVarA3.b(agevVar);
                wjrVar.e(ojqVarA3.a());
                ojq ojqVarA4 = ojr.a();
                ojqVarA4.a = "MDD.WIFI.CHARGING.PERIODIC.TASK";
                ojqVarA4.c(21600L);
                ojqVarA4.e = 2;
                ojqVarA4.b = agev.h((ojp) agkjVarD.get("MDD.WIFI.CHARGING.PERIODIC.TASK"));
                ojqVarA4.b(agevVar);
                wjrVar.e(ojqVarA4.a());
                return null;
            case 15:
                ((qch) this.a).g();
                return null;
            case 16:
                qrp qrpVar = (qrp) this.a;
                qrpVar.e = qrpVar.a.getSharedPreferences(qrpVar.b, 0);
                Set set = qrpVar.c;
                if (set == null) {
                    return Boolean.valueOf(!qrpVar.e.getAll().isEmpty());
                }
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    if (qrpVar.e.contains((String) it.next())) {
                        return Boolean.TRUE;
                    }
                }
                return Boolean.FALSE;
            case 17:
                Object obj8 = this.a;
                synchronized (((qrw) obj8).b.d) {
                    ((qrw) obj8).a = null;
                    break;
                }
                return null;
            case 18:
                return this.a.w();
            case 19:
                return this.a.x();
            default:
                return this.a.z();
        }
    }
}
