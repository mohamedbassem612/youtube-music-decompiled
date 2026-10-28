package defpackage;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.apps.youtube.music.watchpage.MusicPlaybackControls;
import java.io.IOException;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ihq implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ihq(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v126, types: [java.lang.Object, lot] */
    /* JADX WARN: Type inference failed for: r0v130, types: [java.lang.Object, lov] */
    /* JADX WARN: Type inference failed for: r0v135, types: [java.lang.Object, low] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v53, types: [android.os.IBinder, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, loo] */
    /* JADX WARN: Type inference failed for: r0v76, types: [java.lang.Object, leb] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, los, lov, low] */
    /* JADX WARN: Type inference failed for: r2v42, types: [java.lang.Object, lco] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$cid) {
            case 0:
                aero aeroVar = (aero) this.b;
                int i = aeroVar.a;
                Object obj = aeroVar.b;
                Object obj2 = this.a;
                ihr ihrVar = (ihr) obj2;
                for (Class cls : ihrVar.e) {
                    try {
                        int[] appWidgetIds = ((ihr) obj2).d.getAppWidgetIds(new ComponentName(ihrVar.b, (Class<?>) cls));
                        if (appWidgetIds.length == 0) {
                            agrx agrxVar = agso.a;
                            cls.getName();
                        } else {
                            awmd awmdVar = (awmd) ihrVar.f.get(cls);
                            if (awmdVar == null) {
                                ((agrc) ((agrc) ihr.a.c().i(agso.a, "Widget.MusicWidgetCtlr")).k("com/google/android/apps/youtube/music/player/widget/controllers/MusicWidgetController", "sendUpdate", 304, "MusicWidgetController.java")).w("No WidgetRenderer is registered for %s, skipping update.", cls.getName());
                            } else {
                                agrx agrxVar2 = agso.a;
                                cls.getName();
                                ((iis) awmdVar.io()).b(ihrVar.b, appWidgetIds, i, (Bundle) obj);
                            }
                        }
                    } catch (RuntimeException e) {
                        ((agrc) ((agrc) ((agrc) ihr.a.c().i(agso.a, "Widget.MusicWidgetCtlr")).j(e)).k("com/google/android/apps/youtube/music/player/widget/controllers/MusicWidgetController", "sendUpdate", (char) 287, "MusicWidgetController.java")).w("Failed to fetch app widget ids for %s", cls);
                    }
                }
                return;
            case 1:
                Object obj3 = this.a;
                try {
                    wqe wqeVarC = ((hkl) this.b).c.c();
                    if (wqeVarC == null) {
                        ((avyd) obj3).a();
                        return;
                    } else {
                        ((avyd) obj3).c(new hkk(wqeVarC, false));
                        return;
                    }
                } catch (IOException e2) {
                    ((agrc) ((agrc) ((agrc) hkl.a.c().i(agso.a, "DefaultPivotBarCtlr")).j(e2)).k("com/google/android/apps/youtube/music/navigation/DefaultPivotBarController", "doBackgroundOfflineResponseStoreGuideFetch", (char) 376, "DefaultPivotBarController.java")).t("Failed to load guide response from local store");
                    ((avyd) obj3).a();
                    return;
                }
            case 2:
                ((jcl) this.a).d(((iyb) this.b).b());
                return;
            case 3:
                this.a.run();
                ((jkn) this.b).a = null;
                return;
            case 4:
                MusicPlaybackControls musicPlaybackControls = (MusicPlaybackControls) this.b;
                abgi abgiVar = musicPlaybackControls.j;
                Object obj4 = this.a;
                if (abgiVar.equals(obj4)) {
                    return;
                }
                abgi abgiVar2 = (abgi) obj4;
                musicPlaybackControls.j = abgiVar2;
                musicPlaybackControls.e();
                if (abgiVar2.a != abgh.f || musicPlaybackControls.h.m() == 0) {
                    return;
                }
                abhl abhlVar = musicPlaybackControls.i;
                abhlVar.b = 0L;
                musicPlaybackControls.h.v(abhlVar);
                return;
            case 5:
                ((kdx) this.a).p((did) this.b);
                return;
            case 6:
                ?? r0 = this.b;
                Object obj5 = this.a;
                synchronized (obj5) {
                    if (r0 == 0) {
                        ((kkx) obj5).g("Null service connection");
                        return;
                    }
                    try {
                        ((kkx) obj5).f = new khn((IBinder) r0);
                        ((kkx) obj5).a = 2;
                        ((kkx) obj5).a();
                        return;
                    } catch (RemoteException e3) {
                        ((kkx) obj5).g(e3.getMessage());
                        return;
                    }
                }
            case 7:
                ((kkx) this.b).c(((kkz) this.a).a);
                return;
            case 8:
                kon konVar = (kon) this.a;
                kol kolVar = (kol) konVar.e.k.get(konVar.b);
                if (kolVar != null) {
                    if (!((klo) this.b).d()) {
                        kolVar.j((klo) this.b, null);
                        return;
                    }
                    konVar.d = true;
                    kmt kmtVar = konVar.a;
                    if (kmtVar.i()) {
                        konVar.c();
                        return;
                    }
                    try {
                        kmtVar.z(null, kmtVar.t());
                        return;
                    } catch (SecurityException e4) {
                        Log.e("GoogleApiManager", "Failed to get service from broker. ", e4);
                        ((kon) this.a).a.v("Failed to get service from broker.");
                        kolVar.j(new klo(1, 10, null, null, null, null), null);
                        return;
                    }
                }
                return;
            case 9:
                ?? r1 = this.a;
                r1.aW();
                if (a.x()) {
                    r1.aU().j(this);
                    return;
                }
                lbw lbwVar = (lbw) this.b;
                boolean zD = lbwVar.d();
                lbwVar.a = 0L;
                if (zD) {
                    lbwVar.b();
                    return;
                }
                return;
            case 10:
                Object obj6 = this.b;
                Bundle bundle = (Bundle) obj6;
                boolean zIsEmpty = bundle.isEmpty();
                Object obj7 = this.a;
                Object obj8 = obj6;
                if (!zIsEmpty) {
                    ldz ldzVar = (ldz) obj7;
                    Bundle bundle2 = new Bundle(ldzVar.J().s.a());
                    for (String str : bundle.keySet()) {
                        Object obj9 = bundle.get(str);
                        if (obj9 != null && !(obj9 instanceof String) && !(obj9 instanceof Long) && !(obj9 instanceof Double)) {
                            ldzVar.L();
                            if (lga.ay(obj9)) {
                                ldzVar.L().R(((ler) obj7).h, null, 27, null, null, 0);
                            }
                            ldzVar.aT().h.c("Invalid default event parameter type. Name, value", str, obj9);
                        } else if (lga.am(str)) {
                            ldzVar.aT().h.b("Invalid default event parameter name. Name", str);
                        } else if (obj9 == null) {
                            bundle2.remove(str);
                        } else if (ldzVar.L().af("param", str, ldzVar.G().c(null, false), obj9)) {
                            ldzVar.L().S(bundle2, str, obj9);
                        }
                    }
                    ldzVar.L();
                    int iE = ldzVar.G().e();
                    int size = bundle2.size();
                    obj8 = bundle2;
                    if (size > iE) {
                        TreeSet<String> treeSet = new TreeSet(bundle2.keySet());
                        int size2 = treeSet.size();
                        treeSet.removeAll(lga.a);
                        int size3 = size2 - treeSet.size();
                        for (String str2 : treeSet) {
                            size3++;
                            if (size3 > iE) {
                                bundle2.remove(str2);
                            }
                        }
                        ldzVar.L().R(((ler) obj7).h, null, 26, null, null, 0);
                        ldzVar.aT().h.a("Too many default event parameters set. Discarding beyond event parameter limit");
                        obj8 = bundle2;
                    }
                }
                Bundle bundle3 = (Bundle) obj8;
                ((ldz) obj7).J().s.b(bundle3);
                ((lbb) obj7).j().N(bundle3);
                return;
            case 11:
                ((ler) this.b).ab((Boolean) this.a, true);
                return;
            case 12:
                Object obj10 = this.a;
                lco lcoVar = ((lff) obj10).b;
                if (lcoVar == null) {
                    ((ldz) obj10).aT().c.a("Discarding data. Failed to send app launch");
                    return;
                }
                try {
                    Object obj11 = this.b;
                    lbt lbtVarG = ((ldz) obj10).G();
                    adam adamVar = lcl.aO;
                    if (lbtVarG.F(null, adamVar)) {
                        ((lff) obj10).D(lcoVar, null, (lbg) obj11);
                    }
                    lcoVar.m((lbg) obj11);
                    ((lbb) obj10).k().x();
                    ((ldz) obj10).G().F(null, adamVar);
                    ((lff) obj10).D(lcoVar, null, (lbg) obj11);
                    ((lff) obj10).A();
                    return;
                } catch (RemoteException e5) {
                    ((ldz) this.a).aT().c.b("Failed to send app launch to the service", e5);
                    return;
                }
            case 13:
                Object obj12 = this.b;
                lco lcoVar2 = ((lff) obj12).b;
                if (lcoVar2 == null) {
                    ((ldz) obj12).aT().c.a("Failed to send current screen to service");
                    return;
                }
                try {
                    Object obj13 = this.a;
                    if (obj13 == null) {
                        lcoVar2.t(0L, null, null, ((ldz) obj12).aS().getPackageName());
                    } else {
                        lcoVar2.t(((lhf) obj13).c, ((lhf) obj13).a, ((lhf) obj13).b, ((ldz) obj12).aS().getPackageName());
                    }
                    ((lff) obj12).A();
                    return;
                } catch (RemoteException e6) {
                    ((ldz) this.b).aT().c.b("Failed to send current screen to the service", e6);
                    return;
                }
            case 14:
                Object obj14 = this.a;
                lco lcoVar3 = ((lff) obj14).b;
                if (lcoVar3 == null) {
                    ((ldz) obj14).aT().c.a("Failed to send measurementEnabled to service");
                    return;
                }
                try {
                    lcoVar3.w((lbg) this.b);
                    ((lff) obj14).A();
                    return;
                } catch (RemoteException e7) {
                    ((ldz) this.a).aT().c.b("Failed to send measurementEnabled to the service", e7);
                    return;
                }
            case 15:
                Object obj15 = this.a;
                synchronized (obj15) {
                    ((lfe) obj15).a = false;
                    lff lffVar = ((lfe) obj15).c;
                    if (!lffVar.P()) {
                        lffVar.aT().j.a("Connected to remote service");
                        lffVar.O(this.b);
                    }
                    break;
                }
                lff lffVar2 = ((lfe) this.a).c;
                ScheduledExecutorService scheduledExecutorService = lffVar2.d;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                    lffVar2.d = null;
                    return;
                }
                return;
            case 16:
                Object obj16 = this.a;
                if (((lpf) obj16).c) {
                    ((lop) this.b).b.v();
                    return;
                }
                try {
                    ((lop) this.b).b.t(((lop) this.b).a.a((lpa) obj16));
                    return;
                } catch (loy e8) {
                    boolean z = e8.getCause() instanceof Exception;
                    Object obj17 = this.b;
                    if (!z) {
                        ((lop) obj17).b.s(e8);
                        return;
                    } else {
                        ((lop) obj17).b.s((Exception) e8.getCause());
                        return;
                    }
                } catch (Exception e9) {
                    ((lop) this.b).b.s(e9);
                    return;
                }
            case 17:
                try {
                    lpa lpaVar = (lpa) ((lox) this.b).b.a((lpa) this.a);
                    ?? r2 = this.b;
                    if (lpaVar == 0) {
                        ((lox) r2).d(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    Executor executor = lpd.b;
                    lpaVar.n(executor, r2);
                    lpaVar.m(executor, r2);
                    lpaVar.k(executor, r2);
                    return;
                } catch (loy e10) {
                    boolean z2 = e10.getCause() instanceof Exception;
                    Object obj18 = this.b;
                    if (!z2) {
                        ((lox) obj18).a.s(e10);
                        return;
                    } else {
                        ((lox) obj18).a.s((Exception) e10.getCause());
                        return;
                    }
                } catch (Exception e11) {
                    ((lox) this.b).a.s(e11);
                    return;
                }
            case 18:
                Object obj19 = this.b;
                synchronized (((lou) obj19).a) {
                    ?? r3 = ((lou) obj19).b;
                    if (r3 != 0) {
                        r3.a((lpa) this.a);
                    }
                    break;
                }
                return;
            case 19:
                Object obj20 = this.b;
                synchronized (((lou) obj20).a) {
                    ?? r4 = ((lou) obj20).b;
                    if (r4 != 0) {
                        Exception excE = ((lpa) this.a).e();
                        if (excE == null) {
                            throw new NullPointerException("null reference");
                        }
                        r4.d(excE);
                    }
                }
                return;
            default:
                Object obj21 = this.b;
                synchronized (((lou) obj21).a) {
                    ?? r5 = ((lou) obj21).b;
                    if (r5 != 0) {
                        r5.e(((lpa) this.a).f());
                    }
                    break;
                }
                return;
        }
    }

    public /* synthetic */ ihq(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    public ihq(Object obj, Object obj2, int i, char[] cArr) {
        this.$cid = i;
        this.b = obj2;
        this.a = obj;
    }

    public ihq(Object obj, Object obj2, int i, short[] sArr) {
        this.$cid = i;
        this.a = obj2;
        this.b = obj;
    }
}
