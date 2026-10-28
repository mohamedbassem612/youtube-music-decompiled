package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.work.impl.WorkDatabase;
import com.google.android.libraries.youtube.slimstatusbar.SlimStatusBar;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Optional;
import java.net.MulticastSocket;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.NetworkException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dzn implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dzn(aeoh aeohVar, ViewGroup viewGroup, SlimStatusBar slimStatusBar, int i) {
        this.$cid = i;
        this.a = aeohVar;
        this.c = viewGroup;
        this.b = slimStatusBar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r0v117, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v123, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r0v60, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r2v53, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v57, types: [java.lang.Object, mbc] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r3v54, types: [java.lang.Object, mbc] */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v1, types: [eds, java.lang.Object] */
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
    public final void run() throws Throwable {
        eek eekVarA;
        ArrayList arrayList;
        int i = 1;
        boolean zBooleanValue = true;
        Object obj = null;
        switch (this.$cid) {
            case 0:
                drb.a();
                ?? r0 = this.a;
                Object obj2 = this.b;
                Object obj3 = this.c;
                try {
                    r0.invoke();
                    dzj dzjVar = dzk.a;
                    ((bop) obj2).i(dzjVar);
                    ((aqi) obj3).b(dzjVar);
                    return;
                } catch (Throwable th) {
                    ((bop) obj2).i(new dzh(th));
                    ((aqi) obj3).d(th);
                    return;
                }
            case 1:
                dyj.a((AtomicBoolean) this.b, (aqi) this.c, this.a);
                return;
            case 2:
                Object obj4 = this.b;
                ?? r4 = this.a;
                Object obj5 = this.c;
                try {
                    zBooleanValue = ((Boolean) r4.get()).booleanValue();
                    break;
                } catch (InterruptedException | ExecutionException unused) {
                }
                synchronized (((eam) obj5).l) {
                    eekVarA = ((eby) obj4).a();
                    String str = eekVarA.a;
                    if (((eam) obj5).b(str) == obj4) {
                        ((eam) obj5).a(str);
                    }
                    dzf.b();
                    obj5.getClass().getSimpleName();
                    arrayList = new ArrayList(((eam) obj5).j);
                    break;
                }
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((eaa) arrayList.get(i2)).a(eekVarA, zBooleanValue);
                }
                return;
            case 3:
                ArrayList arrayList2 = new ArrayList();
                Object obj6 = this.b;
                Object obj7 = ((dov) obj6).a;
                eek eekVar = (eek) obj7;
                String str2 = eekVar.a;
                ?? r6 = ((qv) this.a).b;
                iqb iqbVar = new iqb(r6, arrayList2, str2, 1, null);
                eam eamVar = (eam) r6;
                WorkDatabase workDatabase = eamVar.e;
                ees eesVar = (ees) workDatabase.e(iqbVar);
                if (eesVar == null) {
                    dzf.b();
                    String str3 = eam.a;
                    Objects.toString(obj7);
                    Log.w(str3, "Didn't find WorkSpec for id ".concat(obj7.toString()));
                    eamVar.f(eekVar);
                    return;
                }
                Object obj8 = eamVar.l;
                synchronized (obj8) {
                    try {
                        try {
                            if (((eam) r6).e(str2)) {
                                Set set = (Set) ((eam) r6).h.get(str2);
                                if (((eek) ((dov) set.iterator().next()).a).b == ((eek) obj7).b) {
                                    set.add(obj6);
                                    dzf.b();
                                    Objects.toString(obj7);
                                } else {
                                    ((eam) r6).f((eek) obj7);
                                }
                                return;
                            }
                            if (eesVar.t != ((eek) obj7).b) {
                                ((eam) r6).f((eek) obj7);
                                return;
                            }
                            Context context = ((eam) r6).c;
                            dyl dylVar = ((eam) r6).d;
                            axfd axfdVar = ((eam) r6).m;
                            eby ebyVar = new eby(new aerj(context, dylVar, axfdVar, (eds) r6, workDatabase, eesVar, arrayList2));
                            awou awouVarPlus = ((awom) ebyVar.k.b).plus(new awwf(null));
                            bej bejVar = new bej(ebyVar, (awoq) null, 8, (byte[]) null);
                            awouVarPlus.getClass();
                            ListenableFuture listenableFutureF = ape.f(new oen(awouVarPlus, bejVar, i));
                            listenableFutureF.addListener(new dzn((Object) r6, listenableFutureF, ebyVar, 2, (char[]) null), axfdVar.d);
                            ((eam) r6).g.put(str2, ebyVar);
                            HashSet hashSet = new HashSet();
                            hashSet.add(obj6);
                            ((eam) r6).h.put(str2, hashSet);
                            dzf.b();
                            r6.getClass().getSimpleName();
                            Objects.toString(obj7);
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            obj = obj8;
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                break;
            case 4:
                Iterator it = ((WorkDatabase) this.c).C().i((String) this.a).iterator();
                while (it.hasNext()) {
                    dms.j((ebm) this.b, (String) it.next());
                }
                return;
            case 5:
                Object obj9 = this.b;
                lff lffVar = (lff) obj9;
                lco lcoVar = lffVar.b;
                ?? r5 = this.a;
                Object obj10 = this.c;
                if (lcoVar == 0) {
                    ((ldz) obj9).aT().c.a("Discarding data. Failed to record diagnostic signal.");
                    return;
                }
                ldz ldzVar = (ldz) obj9;
                ldzVar.o();
                ((lbc) obj9).a();
                if (lffVar.T() && ldzVar.L().k() < 261300) {
                    ldzVar.aT().f.a("Discarding data. Service does not support recordDiagnosticSignals.");
                    return;
                }
                try {
                    lcoVar.p((lbg) obj10, r5);
                    ((lff) obj9).A();
                    return;
                } catch (RemoteException e) {
                    ldzVar.aT().c.b("Failed to record diagnostic signal, exception", e);
                    return;
                }
            case 6:
                Object obj11 = this.a;
                synchronized (obj11) {
                    try {
                        try {
                            Object obj12 = this.b;
                            if (((ldz) obj12).J().f().o()) {
                                lco lcoVar2 = ((lff) obj12).b;
                                if (lcoVar2 != null) {
                                    ((AtomicReference) obj11).set(lcoVar2.b((lbg) this.c));
                                    String str4 = (String) ((AtomicReference) obj11).get();
                                    if (str4 != null) {
                                        ((lbb) obj12).i().V(str4);
                                        ((ldz) obj12).J().f.b(str4);
                                    }
                                    ((lff) obj12).A();
                                    obj11.notify();
                                    return;
                                }
                                ((ldz) obj12).aT().c.a("Failed to get app instance id");
                            } else {
                                ((ldz) obj12).aT().h.a("Analytics storage consent denied; will not get app instance id");
                                ((lbb) obj12).i().V(null);
                                ((ldz) obj12).J().f.b(null);
                                ((AtomicReference) obj11).set(null);
                            }
                            obj11.notify();
                            return;
                        } catch (Throwable th4) {
                            this.a.notify();
                            throw th4;
                        }
                    } catch (RemoteException e2) {
                        ((ldz) this.b).aT().c.b("Failed to get app instance id", e2);
                        this.a.notify();
                    }
                }
                break;
            case 7:
                Object obj13 = this.c;
                if (Build.VERSION.SDK_INT >= 28) {
                    ((StrictMode.ThreadPolicy.Builder) obj13).penaltyListener(MoreExecutors.directExecutor(), new mbi());
                }
                agev agevVar = (agev) ((aupo) ((kjc) this.b).a).b;
                if (agevVar.g()) {
                    try {
                        qtm qtmVar = (qtm) agevVar.c();
                        ((StrictMode.ThreadPolicy.Builder) obj13).build();
                        qtmVar.a();
                    } catch (Exception e3) {
                        Log.e("AndroidExecutorsModule", "Failed to install thread interceptor", e3);
                        rmp.i(((StrictMode.ThreadPolicy.Builder) obj13).penaltyLog().penaltyDeath().build());
                    }
                    break;
                } else {
                    rmp.i(((StrictMode.ThreadPolicy.Builder) obj13).penaltyLog().penaltyDeath().build());
                }
                this.a.run();
                return;
            case 8:
                tls tlsVar = ((tkw) this.c).e;
                Object obj14 = this.b;
                try {
                    try {
                        tks tksVar = tlsVar.f;
                        if (tksVar.c()) {
                            tlr tlrVar = tlsVar.e;
                            tns tnsVar = tlsVar.c;
                            if (!tlrVar.c(tnsVar) || obj14 == null) {
                                tlrVar.a(tnsVar);
                                tksVar.d();
                                return;
                            }
                        }
                        try {
                            if (obj14 == null) {
                                Object obj15 = this.a;
                                if (obj15 == null) {
                                    throw new tod();
                                }
                                if (!(obj15 instanceof NetworkException) || !((NetworkException) obj15).immediatelyRetryable()) {
                                    throw new tni((Throwable) obj15);
                                }
                                tod todVar = new tod();
                                todVar.initCause((Throwable) obj15);
                                throw todVar;
                            }
                            int i3 = ((tnm) obj14).d;
                            if (i3 != 304) {
                                if (i3 >= 200 && i3 <= 299) {
                                    tlsVar.i((tnm) obj14, null, false);
                                    return;
                                }
                                if (i3 == 401) {
                                    throw new tmg((tnm) obj14);
                                }
                                if (i3 == 403) {
                                    throw new tnc((tnm) obj14);
                                }
                                if (i3 == 415) {
                                    throw new thb((tnm) obj14);
                                }
                                if (i3 != 400) {
                                    throw new tob((tnm) obj14);
                                }
                                throw new tey((tnm) obj14);
                            }
                            tmr tmrVar = tlsVar.h;
                            if (tmrVar == null || !tmrVar.c()) {
                                tlsVar.i((tnm) obj14, null, false);
                                return;
                            }
                            aftj aftjVar = new aftj(tmrVar);
                            tms tmsVar = new tms(tmrVar.b);
                            Map map = ((tnm) obj14).e;
                            map.getClass();
                            tmsVar.d(map);
                            aftjVar.j(tmsVar.a());
                            tmr tmrVarI = aftjVar.i();
                            tlsVar.c(new tml(new tnw(tmrVar.a.c().a, tmrVarI.b, null, false)), tmrVarI);
                            return;
                        } catch (toe e4) {
                            e = e4;
                            tns tnsVar2 = tlsVar.c;
                            if ((tnsVar2.E() || i != 0) && taq.r(tnsVar2, e)) {
                                tlsVar.g();
                                return;
                            } else {
                                tlsVar.i((tnm) obj14, e, false);
                                return;
                            }
                        }
                    } catch (toe e5) {
                        e = e5;
                        i = 0;
                    }
                } catch (Exception e6) {
                    if (e6 instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    tlsVar.d(e6);
                    return;
                }
                break;
            case 9:
                try {
                    ((ArrayList) this.a).add(((wal) this.c).a.ae((String) this.b).d());
                    return;
                } catch (Exception unused2) {
                    return;
                }
            case 10:
                ((xja) ((xip) this.b).a.io()).b((String) this.a, (xie) this.c);
                return;
            case 11:
                xiv xivVar = (xiv) this.b;
                boolean z = xivVar.e;
                Object obj16 = this.c;
                Object obj17 = this.a;
                if (!z) {
                    ArrayList arrayList3 = xivVar.f;
                    Optional.empty();
                    arrayList3.add(new xiu(Optional.of(obj17), Optional.empty(), (xie) obj16));
                    return;
                } else {
                    xja xjaVar = xivVar.c;
                    aftj aftjVar2 = new aftj();
                    aftjVar2.g((String) obj17);
                    aftjVar2.f(xivVar.d);
                    xjaVar.c(aftjVar2.e(), (xie) obj16);
                    xivVar.a.isPresent();
                    return;
                }
            case 12:
                ((xnv) this.c).d(this.b, (MulticastSocket) this.a);
                return;
            case 13:
                zhl zhlVar = (zhl) this.b;
                boolean zBB = zhlVar.bB();
                Object obj18 = this.c;
                if (!zBB || ((zae) obj18).h.get() == 0) {
                    zae zaeVar = (zae) obj18;
                    zaeVar.l = ((zle) this.a).c;
                    if (zhlVar.bB()) {
                        zaeVar.i = zaeVar.l != null;
                    }
                    zaeVar.o = true;
                    return;
                }
                return;
            case 14:
                Object obj19 = this.b;
                Object obj20 = this.c;
                aeoh aeohVar = (aeoh) this.a;
                ViewGroup viewGroup = (ViewGroup) obj20;
                aeohVar.p(viewGroup, (SlimStatusBar) obj19);
                viewGroup.removeView((View) obj19);
                viewGroup.setTouchDelegate(null);
                aeohVar.o(0);
                if (aeohVar.N.l(151, 45649805L, false)) {
                    return;
                }
                aeohVar.P.f(0);
                return;
            case 15:
                ?? r1 = this.a;
                ?? r2 = this.c;
                Object obj21 = this.b;
                synchronized (obj21) {
                    if (((aera) obj21).a) {
                        ((aera) obj21).b = r2.b();
                        aerb aerbVar = (aerb) r1.io();
                        if (aerbVar.f) {
                            qck.a().a.e(new aesz("Heartbeat", null).toString());
                        } else {
                            aerbVar.a(null);
                        }
                        return;
                    }
                    return;
                }
            default:
                ?? r3 = this.a;
                ?? r7 = this.c;
                Object obj22 = this.b;
                synchronized (obj22) {
                    try {
                        if (((aera) obj22).a) {
                            r7.b();
                            aerb aerbVar2 = (aerb) r3.io();
                            aihf aihfVarCreateBuilder = aqih.a.createBuilder();
                            aqii aqiiVar = aqii.PERIODIC;
                            aihfVarCreateBuilder.copyOnWrite();
                            aqih aqihVar = (aqih) aihfVarCreateBuilder.instance;
                            aqihVar.c = aqiiVar.d;
                            aqihVar.b |= 1;
                            synchronized (aerbVar2.a) {
                                try {
                                    for (aepp aeppVar : aerbVar2.e.values()) {
                                        if (aeppVar.f()) {
                                            aeppVar.d();
                                        }
                                    }
                                } catch (Throwable th5) {
                                    throw th5;
                                }
                                break;
                            }
                            return;
                        }
                        return;
                    } catch (Throwable th6) {
                        throw th6;
                    }
                }
        }
    }

    public /* synthetic */ dzn(Object obj, Object obj2, Object obj3, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ dzn(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public /* synthetic */ dzn(Object obj, Object obj2, Object obj3, int i, char[] cArr) {
        this.$cid = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public /* synthetic */ dzn(Object obj, Object obj2, Object obj3, int i, short[] sArr) {
        this.$cid = i;
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }

    public /* synthetic */ dzn(Object obj, String str, xie xieVar, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = str;
        this.c = xieVar;
    }

    public dzn(lff lffVar, AtomicReference atomicReference, lbg lbgVar, int i) {
        this.$cid = i;
        this.a = atomicReference;
        this.c = lbgVar;
        this.b = lffVar;
    }
}
