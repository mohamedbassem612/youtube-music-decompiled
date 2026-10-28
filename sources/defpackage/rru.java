package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.view.accessibility.CaptioningManager;
import com.google.android.libraries.youtube.common.backgroundtask.workmanager.BackgroundTaskWorker;
import com.google.cardboard.sdk.R;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.ExtensionRegistryLite;
import j$.util.Optional;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rru implements Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ rru(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:127:0x03de  */
    /* JADX WARN: Code duplicated, block: B:129:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:130:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:131:0x03ed  */
    /* JADX WARN: Type inference failed for: r11v12, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v44, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v46, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v60, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v17, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v8, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5, types: [awmd, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        byte[] bArrC;
        Bundle bundle;
        int length;
        long epochMilli;
        aihf aihfVarCreateBuilder;
        boolean z = true;
        switch (this.$cid) {
            case 0:
                ActivityManager activityManager = (ActivityManager) ((Context) this.a).getSystemService("activity");
                if (activityManager == null) {
                    return agdf.a;
                }
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                return new agfa(Long.valueOf(memoryInfo.totalMem));
            case 1:
                trh trhVarC = ((tre) this.a).h.c(0);
                return trhVarC != null ? trhVarC.b() : agdf.a;
            case 2:
                vbz vbzVarA = ((vca) ((agfa) this.a).a.io()).a();
                if (vbzVarA == null) {
                    return null;
                }
                vbzVarA.a();
                return vbzVarA;
            case 3:
                Object obj = this.a;
                dze dzeVar = (dze) obj;
                Set<String> set = dzeVar.b.c;
                dyp dypVarF = dzeVar.f();
                if (dypVarF == null || (bArrC = dypVarF.c("task_extras_key")) == null || (length = bArrC.length) == 0) {
                    bundle = Bundle.EMPTY;
                } else {
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.unmarshall(bArrC, 0, length);
                    parcelObtain.setDataPosition(0);
                    bundle = new Bundle();
                    bundle.readFromParcel(parcelObtain);
                    parcelObtain.recycle();
                }
                int iA = 1;
                for (String str : set) {
                    if (!ahno.ag(BackgroundTaskWorker.d, str)) {
                        BackgroundTaskWorker backgroundTaskWorker = (BackgroundTaskWorker) obj;
                        if (((vxz) backgroundTaskWorker.f.io()).l(234, 45779797L, false)) {
                            bundle.putInt("start_cnt", dzeVar.d());
                        } else {
                            bundle.remove("start_cnt");
                        }
                        iA = ((syi) backgroundTaskWorker.e.io()).a(str, bundle);
                        if (iA != 0) {
                            if (iA != 1) {
                                return iA != 2 ? new dzd() : new dzc();
                            }
                            return new dzb();
                        }
                    }
                }
                if (iA != 1) {
                    if (iA != 2) {
                    }
                }
                return new dzb();
            case 4:
                Object obj2 = this.a;
                synchronized (obj2) {
                    if (((toq) obj2).c == null) {
                        return null;
                    }
                    ((toq) obj2).j();
                    if (((toq) obj2).k()) {
                        ((toq) obj2).i();
                        ((toq) obj2).e = 0;
                    }
                    return null;
                }
            case 5:
                Object obj3 = this.a;
                vxt vxtVar = (vxt) obj3;
                vxr vxrVar = vxtVar.e;
                vxtVar.c = ((aino) ((tpq) vxrVar.a.io()).c()).c;
                try {
                    if (((vxt) obj3).c == 0) {
                        z = false;
                    } else {
                        int iA2 = ((tws) ((vxt) obj3).a.io()).a("failsafe_maxnumber_uncaught_exception", -1);
                        if (iA2 <= 0) {
                            ((vxt) obj3).c = 0;
                            vxrVar.a();
                        } else if (((vxt) obj3).c < iA2) {
                        }
                        z = false;
                    }
                    return Boolean.valueOf(z);
                } finally {
                    vxtVar.b.open();
                }
            case 6:
                Object obj4 = this.a;
                try {
                    asjh asjhVar = (asjh) aihn.parseFrom(asjh.a, ((vzt) obj4).b.getAssets().open(((vzt) obj4).f), ExtensionRegistryLite.getGeneratedRegistry());
                    agkh agkhVar = new agkh(4);
                    for (ohp ohpVar : asjhVar.b) {
                        String str2 = ohpVar.c;
                        abxv abxvVar = ((vzt) obj4).j;
                        ohpVar.getClass();
                        Context context = (Context) abxvVar.d.io();
                        context.getClass();
                        ((ahex) abxvVar.a.io()).getClass();
                        ?? r8 = abxvVar.c;
                        Optional optional = (Optional) abxvVar.b.io();
                        optional.getClass();
                        agkhVar.e(str2, new vzy(ohpVar, context, r8, optional));
                    }
                    return agkhVar.d(true);
                } catch (Exception unused) {
                    ((agrc) ((agrc) vzt.a.c()).k("com/google/android/libraries/youtube/innertube/datapush/DataPushClientImpl", "initializeEmbeddedFileGroups", 399, "DataPushClientImpl.java")).t("Failed to initialize embedded FileGroups");
                    zs zsVar = (zs) ((vzt) obj4).d.io();
                    alos alosVar = (alos) alou.a.createBuilder();
                    aihf aihfVarCreateBuilder2 = akjv.a.createBuilder();
                    aihfVarCreateBuilder2.copyOnWrite();
                    akjv akjvVar = (akjv) aihfVarCreateBuilder2.instance;
                    akjvVar.d = 1;
                    akjvVar.c = 1;
                    alosVar.copyOnWrite();
                    alou alouVar = (alou) alosVar.instance;
                    akjv akjvVar2 = (akjv) aihfVarCreateBuilder2.build();
                    akjvVar2.getClass();
                    alouVar.d = akjvVar2;
                    alouVar.c = 392;
                    ((dov) zsVar.a).R((alou) alosVar.build());
                    return agpn.b;
                }
            case 7:
                HashMap map = new HashMap();
                for (ListenableFuture listenableFuture : this.a) {
                    ahno.R(listenableFuture.isDone(), "Future was expected to be done: %s", listenableFuture);
                    waf wafVar = (waf) a.i(listenableFuture);
                    map.put(Integer.valueOf(wafVar.a.b), wafVar);
                }
                return map;
            case 8:
                return (vzt) this.a.io();
            case 9:
                return ((ztd) this.a).T();
            case 10:
                return ((ztm) this.a).f();
            case 11:
                return ((aadk) this.a).f();
            case 12:
                return agev.h((CaptioningManager) ((Context) this.a).getSystemService("captioning"));
            case 13:
                Object obj5 = this.a;
                aeog aeogVar = (aeog) obj5;
                return aeogVar.u.p(384, 45820101L).X(new vvb(obj5, 16)).O(aeogVar.n).ag(new acae(obj5, 20), new achk(6));
            case 14:
                agjz agjzVar = new agjz(4);
                for (ListenableFuture listenableFuture2 : this.a) {
                    ahno.R(listenableFuture2.isDone(), "Future was expected to be done: %s", listenableFuture2);
                    agjzVar.j((Iterable) a.i(listenableFuture2));
                }
                return agjzVar.g();
            case 15:
                agkx agkxVar = new agkx();
                Object obj6 = this.a;
                try {
                    Iterator it = ((afrr) obj6).a().f.iterator();
                    while (it.hasNext()) {
                        agkxVar.c(affd.a(((Integer) it.next()).intValue()));
                    }
                    return agkxVar.g();
                } catch (IOException e) {
                    ((afrr) obj6).g(e);
                    return agkxVar.g();
                }
            case 16:
                Object objValueOf = this.a;
                afrr afrrVar = (afrr) objValueOf;
                afrrVar.b.writeLock().lock();
                try {
                    if (!((afrr) objValueOf).e.get()) {
                        try {
                            afsu afsuVarA = ((afrr) objValueOf).a();
                            epochMilli = afsuVarA.c;
                            aihfVarCreateBuilder = afsuVarA.toBuilder();
                        } catch (IOException e2) {
                            ((afrr) objValueOf).g(e2);
                            epochMilli = ((afrr) objValueOf).d.f().toEpochMilli();
                            aihfVarCreateBuilder = afsu.a.createBuilder();
                        }
                        if (epochMilli <= 0) {
                            long epochMilli2 = ((afrr) objValueOf).d.f().toEpochMilli();
                            ((afrr) objValueOf).f = epochMilli2;
                            aihfVarCreateBuilder.copyOnWrite();
                            afsu afsuVar = (afsu) aihfVarCreateBuilder.instance;
                            afsuVar.b |= 1;
                            afsuVar.c = epochMilli2;
                            try {
                                try {
                                    ((afrr) objValueOf).f((afsu) aihfVarCreateBuilder.build());
                                    ((afrr) objValueOf).e.set(true);
                                } catch (Throwable th) {
                                    ((afrr) objValueOf).e.set(true);
                                    throw th;
                                }
                            } catch (IOException e3) {
                                ((agrc) ((agrc) ((agrc) afrr.a.c()).j(e3)).k("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "getSyncEpoch", R.styleable.AppCompatTheme_windowMinWidthMajor, "SyncManagerDataStore.java")).t("Could not write sync epoch. Using current time but future runs may be delayed.");
                                ((afrr) objValueOf).e.set(false);
                            }
                            objValueOf = Long.valueOf(((afrr) objValueOf).f);
                        } else {
                            ((afrr) objValueOf).f = epochMilli;
                            ((afrr) objValueOf).e.set(true);
                            objValueOf = Long.valueOf(((afrr) objValueOf).f);
                        }
                        break;
                    } else {
                        objValueOf = Long.valueOf(((afrr) objValueOf).f);
                    }
                    Object obj7 = objValueOf;
                    afrrVar.b.writeLock().unlock();
                    return obj7;
                } catch (Throwable th2) {
                    afrrVar.b.writeLock().unlock();
                    throw th2;
                }
            default:
                Object obj8 = this.a;
                synchronized (obj8) {
                    ((ahrg) ((ahqz) obj8).a.a()).d(System.currentTimeMillis(), ((ahuh) ((ahqz) obj8).b.a()).a());
                    break;
                }
                return null;
        }
    }
}
