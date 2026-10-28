package defpackage;

import android.animation.ValueAnimator;
import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.v4.os.ResultReceiver;
import android.util.Log;
import android.util.Pair;
import android.view.MenuItem;
import android.view.View;
import androidx.work.impl.WorkDatabase;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class aew implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public aew(View view, ci ciVar, bal balVar, ValueAnimator valueAnimator, int i) {
        this.$cid = i;
        this.d = view;
        this.c = ciVar;
        this.a = balVar;
        this.b = valueAnimator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [aex, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [android.view.MenuItem, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v55, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kzm] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kzm] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kzm] */
    /* JADX WARN: Type inference failed for: r1v60, types: [java.lang.Object, nry] */
    /* JADX WARN: Type inference failed for: r1v61, types: [java.lang.Object, nry] */
    /* JADX WARN: Type inference failed for: r2v49, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v22, types: [dhj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v23, types: [dhj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [androidx.car.app.IOnDoneCallback, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r7v1, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r8v4, types: [awut, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object, kzm] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, kzm] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        boolean z2 = false;
        byte[] bArrA = null;
        try {
            switch (this.$cid) {
                case 0:
                    ?? r0 = this.d;
                    Object obj = this.c;
                    ?? r3 = this.b;
                    Object obj2 = this.a;
                    if (obj2 != null && ((boc) obj2).a().a(bob.c)) {
                        aag.b(r3, (String) obj, r0);
                        return;
                    } else {
                        Objects.toString(r0);
                        aag.f(r3, (String) obj, new IllegalStateException("Lifecycle is not at least created when dispatching ".concat(r0.toString())));
                        return;
                    }
                case 1:
                    Object obj3 = this.d;
                    if (obj3 != null) {
                        ik ikVar = ((ij) this.b).a;
                        ikVar.f = true;
                        ((iq) ((aae) obj3).c).i(false);
                        ikVar.f = false;
                    }
                    ?? r1 = this.c;
                    if (r1.isEnabled() && r1.hasSubMenu()) {
                        ((iq) this.a).z(r1, null, 4);
                        return;
                    }
                    return;
                case 2:
                    baq.f((View) this.d, (ci) this.c, (bal) this.a);
                    ((ValueAnimator) this.b).start();
                    return;
                case 3:
                    IBinder iBinderL = ((zf) this.a).l();
                    bre breVar = (bre) ((qcb) this.d).a;
                    bqp bqpVar = (bqp) breVar.c.get(iBinderL);
                    Object obj4 = this.c;
                    if (bqpVar == null) {
                        Log.w("MBServiceCompat", "removeSubscription for callback that isn't registered id=".concat(String.valueOf(obj4)));
                        return;
                    }
                    Object obj5 = this.b;
                    try {
                        if (obj5 == null) {
                            z = bqpVar.e.remove(obj4) != null;
                            breVar.d = null;
                        } else {
                            HashMap map = bqpVar.e;
                            List list = (List) map.get(obj4);
                            if (list != null) {
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    if (obj5 == ((axq) it.next()).a) {
                                        it.remove();
                                        z2 = true;
                                    }
                                }
                                if (list.size() == 0) {
                                    map.remove(obj4);
                                }
                            }
                            breVar.d = null;
                            z = z2;
                        }
                        if (z) {
                            return;
                        }
                        Log.w("MBServiceCompat", "removeSubscription called for " + ((String) this.c) + " which is not subscribed");
                        return;
                    } catch (Throwable th) {
                        breVar.d = null;
                        throw th;
                    }
                case 4:
                    IBinder iBinderL2 = ((zf) this.a).l();
                    bre breVar2 = (bre) ((qcb) this.d).a;
                    bqp bqpVar2 = (bqp) breVar2.c.get(iBinderL2);
                    Object obj6 = this.c;
                    if (bqpVar2 == null) {
                        Log.w("MBServiceCompat", "getMediaItem for callback that isn't registered id=".concat(String.valueOf(obj6)));
                        return;
                    }
                    bql bqlVar = new bql(obj6, (ResultReceiver) this.b);
                    breVar2.d = bqpVar2;
                    breVar2.d((String) obj6, bqlVar);
                    breVar2.d = null;
                    if (!bqlVar.d()) {
                        throw new IllegalStateException("onLoadItem must call detach() or sendResult() before returning for id=".concat(String.valueOf(obj6)));
                    }
                    return;
                case 5:
                    Pair pair = (Pair) this.b;
                    ((cdg) this.d).a.i.f(((Integer) pair.first).intValue(), (cnm) pair.second, (cnd) this.a, (cni) this.c);
                    return;
                case 6:
                    Pair pair2 = (Pair) this.b;
                    ((cdg) this.d).a.i.g(((Integer) pair2.first).intValue(), (cnm) pair2.second, (cnd) this.a, (cni) this.c);
                    return;
                case 7:
                    this.d.a((dhk) this.a, (dhg) this.b, this.c);
                    return;
                case 8:
                    this.d.a((dhk) this.a, (dhg) this.b, this.c);
                    return;
                case 9:
                    Object obj7 = this.d;
                    int i = eaq.a;
                    WorkDatabase workDatabase = (WorkDatabase) obj7;
                    eet eetVarC = workDatabase.C();
                    String str = ((eek) this.a).a;
                    if (eetVarC.t(str)) {
                        return;
                    }
                    ?? r2 = this.c;
                    ListIterator listIterator = ((awoa) r2).listIterator(0);
                    while (listIterator.hasNext()) {
                        ((eao) listIterator.next()).b(str);
                    }
                    eaq.a((dyl) this.b, workDatabase, r2);
                    return;
                case 10:
                    ((ajmf) this.c).c.getClass();
                    Object obj8 = this.b;
                    gmy gmyVar = (gmy) obj8;
                    mbc mbcVar = gmyVar.i;
                    mbcVar.getClass();
                    ScheduledExecutorService scheduledExecutorService = gmyVar.k;
                    scheduledExecutorService.getClass();
                    hed hedVar = (hed) this.d;
                    gmj gmjVar = (gmj) hedVar.a.io();
                    ahng.x(ahcs.e(ahcs.e(awrc.ag(gmjVar.c, awov.a, new gmc(gmjVar, gmjVar.a.e(), (awoq) null, 3, (char[]) null)), afwl.a(new cbs(9)), hedVar.c), afwl.a(new gmv(mbcVar, 2)), scheduledExecutorService), afwl.g(new hhi(obj8, this.a, 1)), gmyVar.l);
                    return;
                case 11:
                    if (((AtomicBoolean) this.c).getAndSet(true)) {
                        return;
                    }
                    Object obj9 = this.b;
                    Object obj10 = this.a;
                    Object obj11 = this.d;
                    String str2 = (String) obj10;
                    kjx.a(str2, 1030);
                    ((kkc) obj11).b((kjo) obj9, str2);
                    return;
                case 12:
                    lff lffVarK = ((AppMeasurementDynamiteService) this.d).a.k();
                    lffVarK.o();
                    lffVarK.a();
                    int iAs = lffVarK.L().as();
                    ?? r8 = this.b;
                    if (iAs == 0) {
                        lffVarK.B(new aew(lffVarK, (lcd) this.a, (String) this.c, (kzm) r8, 17));
                        return;
                    } else {
                        lffVarK.aT().f.a("Not bundling data. Service unavailable or out of date");
                        lffVarK.L().W(r8, new byte[0]);
                        return;
                    }
                case 13:
                    lff lffVarK2 = ((AppMeasurementDynamiteService) this.d).a.k();
                    lffVarK2.o();
                    lffVarK2.a();
                    lffVarK2.B(new brc(lffVarK2, (String) this.a, (String) this.c, lffVarK2.s(false), (kzm) this.b, 4));
                    return;
                case 14:
                    Bundle bundle = (Bundle) this.b;
                    boolean zIsEmpty = bundle.isEmpty();
                    Object obj12 = this.c;
                    Object obj13 = this.a;
                    if (zIsEmpty) {
                        lgp lgpVarV = ((lcn) obj13).a.v();
                        lgpVarV.o();
                        lgpVarV.w();
                        try {
                            lgpVarV.e().execSQL("delete from default_event_params where app_id=?", new String[]{(String) obj12});
                            return;
                        } catch (SQLiteException e) {
                            lgpVarV.aT().c.b("Error clearing default event params", e);
                            return;
                        }
                    }
                    lcn lcnVar = (lcn) obj13;
                    lgp lgpVarV2 = lcnVar.a.v();
                    lgpVarV2.o();
                    lgpVarV2.w();
                    String str3 = (String) obj12;
                    byte[] byteArray = lgpVarV2.u().k(new lbz(lgpVarV2.t, "", str3, "dep", 0L, 0L, 0L, bundle)).toByteArray();
                    lgpVarV2.aT().k.c("Saving default event parameters, appId, data size", obj12, Integer.valueOf(byteArray.length));
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str3);
                    contentValues.put("parameters", byteArray);
                    try {
                        if (lgpVarV2.e().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                            lgpVarV2.aT().c.b("Failed to insert default event parameters (got -1). appId", lcz.a((String) obj12));
                        }
                    } catch (SQLiteException e2) {
                        lgpVarV2.aT().c.c("Error storing default event parameters. appId", lcz.a(str3), e2);
                    }
                    Object obj14 = this.d;
                    lgp lgpVarV3 = lcnVar.a.v();
                    lbg lbgVar = (lbg) obj14;
                    long j = lbgVar.D;
                    try {
                        if (lgpVarV3.d("select count(*) from raw_events where app_id=? and timestamp >= ? and name not like '!_%' escape '!' limit 1;", new String[]{(String) obj12, String.valueOf(j)}, 0L) > 0 || lgpVarV3.d("select count(*) from raw_events where app_id=? and timestamp >= ? and name like '!_%' escape '!' limit 1;", new String[]{(String) obj12, String.valueOf(j)}, 0L) <= 0) {
                            return;
                        }
                        lcnVar.a.v().E(str3, Long.valueOf(lbgVar.D), null, bundle);
                        return;
                    } catch (SQLiteException e3) {
                        lgpVarV3.aT().c.b("Error checking backfill conditions", e3);
                        return;
                    }
                case 15:
                    lff lffVarK3 = ((ler) this.b).t.k();
                    lffVarK3.o();
                    lffVarK3.a();
                    lffVarK3.B(new brc(lffVarK3, (AtomicReference) this.c, (String) this.d, (String) this.a, lffVarK3.s(false), 3));
                    return;
                case 16:
                    Object obj15 = this.d;
                    Object obj16 = this.c;
                    Object obj17 = this.b;
                    Object obj18 = this.a;
                    synchronized (obj16) {
                        try {
                            lco lcoVar = ((lff) obj15).b;
                            if (lcoVar == null) {
                                ((ldz) obj15).aT().c.a("[sgtm] Failed to get upload batches; not connected to service");
                                return;
                            }
                            lcoVar.n((lbg) obj17, (lfm) obj18, new lcr((lff) obj15, (AtomicReference) obj16));
                            ((lff) obj15).A();
                            return;
                        } catch (RemoteException e4) {
                            ((ldz) obj15).aT().c.b("[sgtm] Failed to get upload batches; remote exception", e4);
                            obj16.notifyAll();
                        }
                    }
                    break;
                case 17:
                    try {
                        Object obj19 = this.a;
                        lco lcoVar2 = ((lff) obj19).b;
                        if (lcoVar2 == null) {
                            ((ldz) obj19).aT().c.a("Discarding data. Failed to send event to service to bundle");
                            ((ldz) obj19).L().W(this.b, null);
                            return;
                        } else {
                            bArrA = lcoVar2.A((lcd) this.d, (String) this.c);
                            ((lff) obj19).A();
                            ((ldz) this.a).L().W(this.b, bArrA);
                            return;
                        }
                    } catch (RemoteException e5) {
                        ((ldz) this.a).aT().c.b("Failed to send event to the service to bundle", e5);
                    }
                    break;
                case 18:
                    lfv lfvVar = ((lft) this.d).a;
                    lgv lgvVar = lfvVar.i().F(null, lcl.aT) ? lfvVar.i : lgv.a;
                    lga lgaVarR = lfvVar.r();
                    Object obj20 = this.c;
                    Object obj21 = this.a;
                    Object obj22 = this.b;
                    lfvVar.aV();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    lfvVar.aV();
                    String str4 = (String) obj20;
                    lcd lcdVarAq = lgaVarR.aq(str4, (String) obj21, (Bundle) obj22, "auto", jCurrentTimeMillis, SystemClock.elapsedRealtime(), false, lgvVar);
                    kro.l(lcdVarAq);
                    lfvVar.I(lcdVarAq, str4);
                    return;
                case 19:
                    Object obj23 = this.b;
                    CommandOuterClass$Command commandOuterClass$CommandX = ((omj) this.c).x();
                    nrt nrtVarD = nrv.d();
                    nrtVarD.e = ket.V((LottieAnimationView) obj23);
                    nrtVarD.g = ((nsl) this.a).x;
                    this.d.a(commandOuterClass$CommandX, nrtVarD.a()).D();
                    return;
                default:
                    Object obj24 = this.b;
                    CommandOuterClass$Command commandOuterClass$CommandX2 = ((omj) this.c).x();
                    nrt nrtVarD2 = nrv.d();
                    nrtVarD2.e = ket.V((LottieAnimationView) obj24);
                    nrtVarD2.g = ((nsl) this.a).x;
                    this.d.a(commandOuterClass$CommandX2, nrtVarD2.a()).D();
                    return;
            }
        } catch (Throwable th2) {
            ((ldz) this.a).L().W(this.b, null);
            throw th2;
        }
        ((ldz) this.a).L().W(this.b, null);
        throw th2;
    }

    public /* synthetic */ aew(WorkDatabase workDatabase, eek eekVar, List list, dyl dylVar, int i) {
        this.$cid = i;
        this.d = workDatabase;
        this.a = eekVar;
        this.c = list;
        this.b = dylVar;
    }

    public /* synthetic */ aew(cdg cdgVar, Pair pair, cnd cndVar, cni cniVar, int i) {
        this.$cid = i;
        this.d = cdgVar;
        this.b = pair;
        this.a = cndVar;
        this.c = cniVar;
    }

    public aew(AppMeasurementDynamiteService appMeasurementDynamiteService, kzm kzmVar, Object obj, String str, int i) {
        this.$cid = i;
        this.b = kzmVar;
        this.a = obj;
        this.c = str;
        this.d = appMeasurementDynamiteService;
    }

    public /* synthetic */ aew(dhk dhkVar, dhj dhjVar, dhg dhgVar, Collection collection, int i) {
        this.$cid = i;
        this.a = dhkVar;
        this.d = dhjVar;
        this.b = dhgVar;
        this.c = collection;
    }

    public /* synthetic */ aew(gmy gmyVar, heh hehVar, ajmf ajmfVar, hed hedVar, int i) {
        this.$cid = i;
        this.b = gmyVar;
        this.a = hehVar;
        this.c = ajmfVar;
        this.d = hedVar;
    }

    public aew(ij ijVar, aae aaeVar, MenuItem menuItem, iq iqVar, int i) {
        this.$cid = i;
        this.b = ijVar;
        this.d = aaeVar;
        this.c = menuItem;
        this.a = iqVar;
    }

    public /* synthetic */ aew(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$cid = i;
        this.d = obj;
        this.c = obj2;
        this.b = obj3;
        this.a = obj4;
    }

    public /* synthetic */ aew(Object obj, Object obj2, String str, Object obj3, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = str;
        this.d = obj3;
    }

    public /* synthetic */ aew(kkc kkcVar, AtomicBoolean atomicBoolean, String str, kjo kjoVar, int i) {
        this.$cid = i;
        this.d = kkcVar;
        this.c = atomicBoolean;
        this.a = str;
        this.b = kjoVar;
    }

    public aew(ler lerVar, AtomicReference atomicReference, String str, String str2, int i) {
        this.$cid = i;
        this.c = atomicReference;
        this.d = str;
        this.a = str2;
        this.b = lerVar;
    }

    public aew(lff lffVar, lcd lcdVar, String str, kzm kzmVar, int i) {
        this.$cid = i;
        this.d = lcdVar;
        this.c = str;
        this.b = kzmVar;
        this.a = lffVar;
    }

    public aew(lft lftVar, String str, String str2, Bundle bundle, int i) {
        this.$cid = i;
        this.c = str;
        this.a = str2;
        this.b = bundle;
        this.d = lftVar;
    }

    public aew(qcb qcbVar, zf zfVar, String str, Object obj, int i) {
        this.$cid = i;
        this.d = qcbVar;
        this.a = zfVar;
        this.c = str;
        this.b = obj;
    }
}
