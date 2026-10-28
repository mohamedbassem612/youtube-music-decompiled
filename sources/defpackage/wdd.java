package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.google.android.libraries.elements.interfaces.Snapshot;
import com.google.android.libraries.elements.interfaces.TransactionRecord;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Collection;
import j$.util.Optional;
import java.net.DatagramSocket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wdd implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wdd(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, tqo] */
    /* JADX WARN: Type inference failed for: r11v30, types: [java.lang.Object, sxu] */
    /* JADX WARN: Type inference failed for: r11v31, types: [java.lang.Object, java.lang.Runnable] */
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
        agke agkeVarN;
        int i;
        byte[] bArr = null;
        switch (this.$cid) {
            case 0:
                ((wdf) this.a).b.remove(this.b);
                return;
            case 1:
                TransactionRecord transactionRecord = (TransactionRecord) this.a;
                Snapshot snapshotBeginState = transactionRecord.beginState();
                Snapshot snapshotEndState = transactionRecord.endState();
                for (String str : transactionRecord.keys()) {
                    wcd wcdVar = (wcd) this.b;
                    Class clsB = wcdVar.e.b(str);
                    awly awlyVar = (awly) wcdVar.b.get(str);
                    awly awlyVar2 = (awly) wcdVar.c.get(clsB);
                    if (awlyVar != null || awlyVar2 != null) {
                        weo weoVarF = wcdVar.a.f(str, snapshotBeginState, snapshotEndState);
                        if (weoVarF != null) {
                            if (awlyVar != null) {
                                awlyVar.kk(weoVarF);
                            }
                            if (awlyVar2 != null) {
                                awlyVar2.kk(weoVarF);
                            }
                        }
                    }
                }
                return;
            case 2:
                ((wdf) this.a).a.remove(this.b);
                return;
            case 3:
                HashMap map = new HashMap();
                for (amgu amguVar : ((wjp) this.a).a) {
                    map.put(amguVar.e, amguVar.c == 2 ? (String) amguVar.d : "");
                }
                zvr zvrVar = (zvr) ((wjr) this.b).b;
                zvrVar.c = map;
                zvrVar.h();
                return;
            case 4:
                ?? r0 = this.a;
                wll wllVar = (wll) this.b;
                wllVar.k(r0);
                wllVar.l(r0.f());
                wllVar.g();
                return;
            case 5:
                ((xdy) this.a).c((ajtl) this.b);
                return;
            case 6:
                akvx akvxVar = (akvx) this.b;
                boolean z = (akvxVar.b & 1) != 0 ? akvxVar.c : true;
                xef xefVar = (xef) this.a;
                xefVar.c = z;
                xefVar.d = (akvxVar.b & 2) != 0 ? akvxVar.d : 1;
                return;
            case 7:
                ((xge) this.a).j = Optional.ofNullable(this.b);
                return;
            case 8:
                akwd akwdVar = ((amuh) this.b).c;
                if (akwdVar == null) {
                    akwdVar = akwd.a;
                }
                xic xicVar = (xic) this.a;
                xicVar.h = akwdVar;
                agkx agkxVar = new agkx();
                agkx agkxVar2 = new agkx();
                agkh agkhVar = new agkh(4);
                akwd akwdVar2 = xicVar.h;
                akwdVar2.getClass();
                for (akwf akwfVar : akwdVar2.d) {
                    int i2 = akwfVar.c;
                    alot alotVarA = alot.a(i2);
                    if (alotVarA == null) {
                        String strBP = a.bP(i2, "V2: payloadCase for payload number ", " is null in onNextEventLoggingConfig");
                        ((agrc) ((agrc) xic.a.b()).k("com/google/android/libraries/youtube/logging/internal/config/EventLoggingConfigManagerV2", "updatePayloadPolicyRecordsFromConfig", 247, "EventLoggingConfigManagerV2.java")).w("%s", strBP);
                        zvp.a(zvn.b, zvm.m, "GEL_DELAYED_EVENT_DEBUG ".concat(strBP));
                    } else {
                        if (!akwfVar.d) {
                            agkxVar.c(alotVarA);
                        }
                        if (akwfVar.e) {
                            agkxVar2.c(alotVarA);
                        }
                        akku akkuVarA = akku.a(akwfVar.f);
                        if (akkuVarA == null) {
                            akkuVarA = akku.DELAYED_EVENT_TIER_UNSPECIFIED;
                        }
                        akku akkuVar = akku.DELAYED_EVENT_TIER_UNSPECIFIED;
                        if (!akkuVarA.equals(akkuVar)) {
                            akku akkuVarA2 = akku.a(akwfVar.f);
                            if (akkuVarA2 != null) {
                                akkuVar = akkuVarA2;
                            }
                            agkhVar.e(alotVarA, akkuVar);
                        }
                    }
                }
                xicVar.d = agkxVar.g();
                xicVar.e = agkxVar2.g();
                xicVar.f = agkhVar.d(false);
                return;
            case 9:
                Object obj = this.b;
                xiv xivVar = (xiv) obj;
                if (xivVar.e) {
                    xivVar.a.isPresent();
                    return;
                }
                Object obj2 = this.a;
                xja xjaVar = xivVar.c;
                String str2 = xivVar.d;
                xie xieVar = (xie) obj2;
                xjaVar.b(str2, xieVar);
                xivVar.e = true;
                xivVar.a.isPresent();
                xivVar.j(xieVar);
                ArrayList arrayList = xivVar.f;
                if (arrayList.isEmpty()) {
                    return;
                }
                aftj aftjVar = new aftj();
                aftjVar.f(str2);
                Collection.EL.stream(arrayList).forEach(new rew(obj, aftjVar, 20, bArr));
                arrayList.clear();
                xivVar.j(xieVar);
                return;
            case 10:
                akja akjaVar = (akja) this.b;
                int i3 = akjaVar.d;
                xja xjaVar2 = (xja) this.a;
                xjaVar2.b = i3;
                int i4 = 15;
                xjaVar2.c = (agkz) Collection.EL.stream(akjaVar.e).map(new rmm(i4)).filter(new gqn(i4)).collect(aghu.b);
                return;
            case 11:
                ((xnv) this.a).g((DatagramSocket) this.b);
                return;
            case 12:
                ((xxy) this.b).a((xhn) this.a);
                return;
            case 13:
                this.a.b(null, ((aaew) ((aadk) this.b).i.io()).ap());
                return;
            case 14:
                if (((aado) this.a).B()) {
                    this.b.run();
                    return;
                }
                return;
            case 15:
                ?? r1 = this.a;
                Object obj3 = this.b;
                synchronized (((aakq) obj3).a) {
                    if (!((aakq) obj3).f() || r1.h()) {
                        return;
                    }
                    if (((aakq) obj3).c.e().equals(r1)) {
                        ListenableFuture listenableFuture = ((aakq) obj3).f;
                        if (listenableFuture != null) {
                            listenableFuture.cancel(false);
                        }
                        aakp aakpVar = ((aakq) obj3).g;
                        if (aakpVar != null) {
                            aakpVar.a.set(true);
                        }
                        avmc avmcVarB = ((aakq) obj3).b.b(r1).b(197);
                        tzj tzjVar = new tzj();
                        avmcVarB.F(new tzi(tzjVar));
                        aakp aakpVar2 = new aakp((aakq) obj3, r1);
                        ((aakq) obj3).g = aakpVar2;
                        Executor executor = ((aakq) obj3).d;
                        long j = afwl.a;
                        afwi afwiVar = new afwi(afty.c(false), aakpVar2);
                        int i5 = ahcs.c;
                        ahcr ahcrVar = new ahcr(tzjVar, afwiVar);
                        tzjVar.addListener(ahcrVar, MoreExecutors.c(executor, ahcrVar));
                        ((aakq) obj3).f = ahcrVar;
                        return;
                    }
                    return;
                }
            case 16:
                ?? r2 = this.b;
                Collection.EL.stream(r2).map(new ygi(6)).collect(aghu.b);
                aaof aaofVar = (aaof) this.a;
                aaofVar.r(r2);
                aaofVar.f(r2, null);
                aaofVar.q();
                return;
            case 17:
                ((fg) this.a).g((ez) ((aceo) this.b).b.io(), null);
                return;
            case 18:
                aebl aeblVar = (aebl) this.b;
                if (aeblVar.j) {
                    ((fsy) this.a).V(true, null);
                    aeblVar.j = false;
                    return;
                }
                return;
            case 19:
                taq.c();
                Object obj4 = this.b;
                List listD = tym.d((PackageManager) this.a);
                synchronized (obj4) {
                    Iterator it = listD.iterator();
                    while (it.hasNext()) {
                        ((aemo) obj4).a.add(((ResolveInfo) it.next()).activityInfo.applicationInfo.packageName);
                    }
                    break;
                }
                return;
            default:
                Iterator it2 = ((wjs) this.a).b.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        amgu amguVar2 = (amgu) it2.next();
                        if ("e".equals(amguVar2.e) && (i = amguVar2.c) == 2) {
                            List listH = wjs.a.h(i == 2 ? (String) amguVar2.d : "");
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it3 = listH.iterator();
                            while (it3.hasNext()) {
                                arrayList2.add(Integer.valueOf(Integer.parseInt((String) it3.next())));
                            }
                            agkeVarN = agke.n(arrayList2);
                        }
                    } else {
                        agkeVarN = agpi.a;
                    }
                }
                aerf aerfVar = (aerf) this.b;
                aere aereVar = aerfVar.d;
                if (agkeVarN.isEmpty()) {
                    return;
                }
                ((llq) aerfVar.a.io()).g(ahng.S(agkeVarN), "__internal.youtube_phenotype.".concat(String.valueOf(aerfVar.c.getPackageName())), "DROP_BOX");
                return;
        }
    }

    public /* synthetic */ wdd(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }

    public wdd(Object obj, Object obj2, int i, char[] cArr) {
        this.$cid = i;
        this.a = obj2;
        this.b = obj;
    }
}
