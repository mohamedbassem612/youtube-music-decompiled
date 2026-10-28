package defpackage;

import android.content.Context;
import android.content.Intent;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Optional;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.NetworkException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qmw implements ahcy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qmw(aalp aalpVar, wcn wcnVar, AbstractCollection abstractCollection, Object obj, int i) {
        this.$cid = i;
        this.b = aalpVar;
        this.c = wcnVar;
        this.d = abstractCollection;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object, wcn] */
    /* JADX WARN: Type inference failed for: r0v74, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v79, types: [java.lang.Object, xir] */
    /* JADX WARN: Type inference failed for: r0v81, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object, xir] */
    /* JADX WARN: Type inference failed for: r15v2, types: [abvz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v36, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v37, types: [agfr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v71, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v81, types: [java.lang.Object, wcn] */
    /* JADX WARN: Type inference failed for: r2v13, types: [ahex, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v47, types: [java.lang.Object, tns] */
    /* JADX WARN: Type inference failed for: r2v51, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r2v61, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v62, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v63, types: [java.lang.Object, java.util.concurrent.Executor, java.util.concurrent.ScheduledExecutorService] */
    /* JADX WARN: Type inference failed for: r2v84, types: [agek, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object, java.util.concurrent.Executor, java.util.concurrent.ScheduledExecutorService] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, wcn] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object, wcn] */
    /* JADX WARN: Type inference failed for: r5v23, types: [java.lang.Object, java.util.Set] */
    @Override // defpackage.ahcy
    public final ListenableFuture a(Object obj) {
        ListenableFuture listenableFutureR;
        ListenableFuture listenableFutureM;
        atxo atxoVar;
        ListenableFuture listenableFutureJ;
        int i = 14;
        int i2 = 18;
        int i3 = 6;
        int i4 = 8;
        int i5 = 7;
        byte[] bArr = null;
        int i6 = 3;
        int i7 = 2;
        int i8 = 1;
        switch (this.$cid) {
            case 0:
                Object obj2 = this.a;
                if (!((String) obj).equals(obj2)) {
                    return aher.a;
                }
                hhc hhcVar = qmx.a;
                return (hhcVar == null || !hhcVar.b(((qmn) this.b).a, (String) obj2)) ? ((qkh) this.c).e().z(((qnd) this.d).c) : aher.a;
            case 1:
                qnd qndVar = (qnd) ahng.v(this.d);
                if (qndVar.c.isEmpty()) {
                    return aher.a;
                }
                Object obj3 = this.a;
                Object obj4 = this.b;
                Object obj5 = this.c;
                qkh qkhVar = (qkh) obj5;
                return aheo.p(aheo.p(qmp.b(qkhVar).c()).q(new onn(((qmn) obj4).a, i3), qkhVar.b())).r(new qmw(obj3, obj4, obj5, qndVar, 0), qkhVar.b());
            case 2:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Object obj6 = this.d;
                if (zBooleanValue) {
                    return aheo.p(((kjc) this.b).C((String) obj6)).q(new onn(obj6, i4), this.a);
                }
                qkh qkhVarA = qkh.a((Context) this.c);
                if (qkhVarA == null) {
                    qkh.d();
                    ahno.O(false);
                    listenableFutureR = aher.a;
                } else {
                    qmn qmnVar = (qmn) qmn.a(qkhVarA.c).get(obj6);
                    if (qmnVar == null) {
                        listenableFutureR = ahng.m(new IllegalStateException(a.bT((String) obj6, "Config package ", " does not use declarative registration. See go/phenotype-android-integration#phenotype for more information.")));
                    } else {
                        qnf qnfVar = qkhVarA.f;
                        qnc qncVar = new qnc(qkhVarA, (String) obj6, "", qmnVar.c);
                        listenableFutureR = ((aheo) ahbz.e(aheo.p(qnfVar.d(false)), Throwable.class, new one(i), qkhVarA.b())).q(new onn(qncVar, i5), qkhVarA.b()).r(new okx((Object) qkhVarA, obj6, (Object) qncVar, 18, (short[]) null), qkhVarA.b());
                    }
                }
                return aheo.p(listenableFutureR);
            case 3:
                qqp qqpVar = new qqp(4);
                aczl aczlVar = (aczl) this.d;
                Object obj7 = aczlVar.d;
                ListenableFuture listenableFutureSubmit = ((tld) obj7).a.submit(new ium(obj7, this.c, qqpVar, 13, (char[]) null));
                return ahno.ax(listenableFutureSubmit).l(new gmf(listenableFutureSubmit, this.b, this.a, 15, (byte[]) null), aczlVar.c);
            case 4:
                toe toeVar = (toe) obj;
                atxn atxnVar = (atxn) this.a.io();
                boolean z = toeVar instanceof tob;
                Object obj8 = this.d;
                Object obj9 = this.b;
                if (z) {
                    tnm tnmVar = ((tob) toeVar).b;
                    tnmVar.getClass();
                    if (((zyt) obj8).b.l(56, 45416561L, false)) {
                        aihf aihfVarCreateBuilder = atxo.a.createBuilder();
                        int i9 = tnmVar.d;
                        aihfVarCreateBuilder.copyOnWrite();
                        ((atxo) aihfVarCreateBuilder.instance).b = i9;
                        atxoVar = (atxo) aihfVarCreateBuilder.build();
                    } else {
                        aihf aihfVarCreateBuilder2 = atxo.a.createBuilder();
                        int i10 = tnmVar.d;
                        aihfVarCreateBuilder2.copyOnWrite();
                        ((atxo) aihfVarCreateBuilder2.instance).b = i10;
                        List list = tnmVar.f;
                        agke agkeVar = list == null ? agpi.a : (agke) Collection.EL.stream(list).map(new zyr()).collect(aghu.a);
                        aihfVarCreateBuilder2.copyOnWrite();
                        atxo atxoVar2 = (atxo) aihfVarCreateBuilder2.instance;
                        aiie aiieVar = atxoVar2.c;
                        if (!aiieVar.c()) {
                            atxoVar2.c = aihn.mutableCopy(aiieVar);
                        }
                        aifs.addAll(agkeVar, atxoVar2.c);
                        atxoVar = (atxo) aihfVarCreateBuilder2.build();
                    }
                    int i11 = atxoVar.b;
                    listenableFutureM = ((aczl) obj9).i(i11 == 408 || i11 == 502 || i11 == 503 || i11 == 504, atxnVar);
                } else if (toeVar instanceof tod) {
                    listenableFutureM = ((aczl) obj9).i(true, atxnVar);
                } else if (toeVar instanceof tni) {
                    Throwable cause = toeVar.getCause();
                    if (cause instanceof NetworkException) {
                        ((NetworkException) cause).getErrorCode();
                        listenableFutureM = ((aczl) obj9).i(true, atxnVar);
                    } else {
                        listenableFutureM = ahng.m(toeVar);
                    }
                } else {
                    listenableFutureM = ahng.m(toeVar);
                }
                return afxd.f(listenableFutureM).h(new qmw(obj8, toeVar, this.c, obj9, 5), ((zyt) obj8).a).b(toe.class, new xwx(9), MoreExecutors.directExecutor());
            case 5:
                int iAV = a.aV(((asft) obj).c);
                i8 = iAV != 0 ? iAV : 1;
                Object obj10 = this.b;
                int i12 = i8 - 1;
                if (i12 != 0) {
                    if (i12 == 2) {
                        return ahng.m((Throwable) obj10);
                    }
                    if (i12 != 3) {
                        return ((zyt) this.a).e(this.c, (aczl) this.d);
                    }
                }
                return ahng.m((Throwable) obj10);
            case 6:
                Optional optional = (Optional) obj;
                if (optional.isEmpty()) {
                    return ahng.n(aanp.a);
                }
                amtc amtcVar = (amtc) optional.get();
                if (amtcVar.f()) {
                    if (!((aakk) this.d).e(this.b, amtcVar.getLocalImageUrl())) {
                        aano aanoVar = new aano(aanp.b);
                        aanoVar.d = 20;
                        return ahng.n(aanoVar.a());
                    }
                }
                Object obj11 = this.a;
                wer werVarE = this.c.e();
                werVarE.j((String) obj11);
                avmc avmcVarB = werVarE.d().B(avmc.t(aanp.a));
                aano aanoVar2 = new aano(aanp.b);
                aanoVar2.d = 5;
                return tzk.b(avmcVarB.x(aanoVar2.a()));
            case 7:
                final agke agkeVar2 = (agke) obj;
                final agkj agkjVar = (agkj) Collection.EL.stream(this.d).collect(aghu.a(new aakc(i5), new aakc(i4)));
                Object obj12 = this.b;
                aalp aalpVar = (aalp) obj12;
                if (!aalpVar.k.t()) {
                    aalp.c(agkeVar2, agkjVar);
                    return ahng.n(agkeVar2);
                }
                Object obj13 = this.a;
                ?? r4 = this.c;
                final ArrayList arrayList = new ArrayList();
                final ArrayList arrayList2 = new ArrayList();
                final HashMap map = new HashMap();
                ListenableFuture listenableFutureB = aalp.b(r4, 119, aoop.class);
                agek agekVar = new agek() { // from class: aaln
                    @Override // defpackage.agek
                    public final Object apply(Object obj14) {
                        agke agkeVar3 = agkeVar2;
                        agkj agkjVar2 = (agkj) obj14;
                        int size = agkeVar3.size();
                        for (int i13 = 0; i13 < size; i13++) {
                            aihf aihfVar = (aihf) agkeVar3.get(i13);
                            aoop aoopVar = (aoop) agkjVar2.get(((aoei) aihfVar.instance).c);
                            if (aoopVar == null) {
                                arrayList.add(aihfVar);
                            } else {
                                arrayList2.add(aihfVar);
                                aoeh aoehVar = ((aoei) aihfVar.instance).u;
                                if (aoehVar == null) {
                                    aoehVar = aoeh.a;
                                }
                                agkj agkjVar3 = agkjVar;
                                aihf builder = aoehVar.toBuilder();
                                builder.copyOnWrite();
                                aoeh aoehVar2 = (aoeh) builder.instance;
                                aoehVar2.b |= 2;
                                aoehVar2.d = true;
                                aihfVar.copyOnWrite();
                                aoei aoeiVar = (aoei) aihfVar.instance;
                                aoeh aoehVar3 = (aoeh) builder.build();
                                aoehVar3.getClass();
                                aoeiVar.u = aoehVar3;
                                aoeiVar.b |= 2097152;
                                aamt aamtVar = (aamt) agkjVar3.get(((aoei) aihfVar.instance).c);
                                if (aamtVar != null) {
                                    if (aamtVar.j()) {
                                        aihfVar.copyOnWrite();
                                        aoei aoeiVar2 = (aoei) aihfVar.instance;
                                        aoeiVar2.d = 17;
                                        aoeiVar2.b |= 2;
                                    } else if (aamtVar.n == aamg.DELETED) {
                                        aihfVar.copyOnWrite();
                                        aoei aoeiVar3 = (aoei) aihfVar.instance;
                                        aoeiVar3.d = 6;
                                        aoeiVar3.b |= 2;
                                    } else if (aamtVar.t()) {
                                        aihfVar.copyOnWrite();
                                        aoei aoeiVar4 = (aoei) aihfVar.instance;
                                        aoeiVar4.d = 9;
                                        aoeiVar4.b |= 2;
                                    }
                                    aohx aohxVar = aamtVar.b;
                                    aihfVar.copyOnWrite();
                                    aoei aoeiVar5 = (aoei) aihfVar.instance;
                                    aoeiVar5.h = aohxVar.l;
                                    aoeiVar5.b |= 32;
                                    aofb aofbVarB = aamtVar.o.b();
                                    aihfVar.copyOnWrite();
                                    aoei aoeiVar6 = (aoei) aihfVar.instance;
                                    aoeiVar6.i = aofbVarB.i;
                                    aoeiVar6.b |= 64;
                                    long j = aamtVar.h;
                                    aihfVar.copyOnWrite();
                                    aoei aoeiVar7 = (aoei) aihfVar.instance;
                                    aoeiVar7.b |= 32768;
                                    aoeiVar7.o = j;
                                    long j2 = ((aohb) aamtVar.a.e).q;
                                    aihfVar.copyOnWrite();
                                    aoei aoeiVar8 = (aoei) aihfVar.instance;
                                    aoeiVar8.b |= SemanticState.ReadOnly;
                                    aoeiVar8.m = j2;
                                    boolean z2 = (aamtVar.e || aamtVar.j()) ? false : true;
                                    aihfVar.copyOnWrite();
                                    aoei aoeiVar9 = (aoei) aihfVar.instance;
                                    aoeiVar9.b |= SemanticState.Modal;
                                    aoeiVar9.n = z2;
                                    aihfVar.copyOnWrite();
                                    aoei aoeiVar10 = (aoei) aihfVar.instance;
                                    aoeiVar10.b |= 65536;
                                    aoeiVar10.p = true;
                                }
                                HashMap map2 = map;
                                long millis = Duration.ofSeconds(aoopVar.getPlayerResponseTimestamp().longValue()).toMillis();
                                aihfVar.copyOnWrite();
                                aoei aoeiVar11 = (aoei) aihfVar.instance;
                                aoeiVar11.b |= SemanticState.Focused;
                                aoeiVar11.j = millis;
                                map2.put(aoeiVar11.c, aaje.h(aoopVar, new zqe(aoopVar, 12)));
                            }
                        }
                        return null;
                    }
                };
                Executor executor = aalpVar.b;
                return ahno.ar(ahno.as(ahno.as(ahno.as(ahno.ar(listenableFutureB, agekVar, executor), new aakn(obj12, (Object) r4, arrayList2, i6), executor), new qmw(aalpVar, (wcn) r4, (AbstractCollection) arrayList2, obj13, 8), executor), new qmw(aalpVar, (wcn) r4, (AbstractCollection) arrayList2, (Object) map, 9), executor), new hco(arrayList, agkjVar, agkeVar2, 17), executor);
            case 8:
                agkj agkjVar2 = (agkj) obj;
                ?? r2 = this.d;
                if (r2.isEmpty()) {
                    return aher.a;
                }
                return ahno.ar(aalp.b(this.c, 198, aohq.class), new hco((Object) r2, (Object) agkjVar2, (List) this.a, i2), ((aalp) this.b).b);
            case 9:
                ?? r3 = this.d;
                if (r3.isEmpty()) {
                    return aher.a;
                }
                Object obj14 = this.a;
                ?? r1 = this.c;
                Object obj15 = this.b;
                return ahno.ar(aalp.b(r1, 130, aohk.class), new hco(obj15, (Object) r3, obj14, 19, (byte[]) null), ((aalp) obj15).b);
            case 10:
                ListenableFuture listenableFuture = (ListenableFuture) ((agke) this.c).get(1);
                ?? r5 = this.a;
                return aaou.a(aaou.c(listenableFuture, 2, r5), this.b, new aaoq(this.d, r5, i7, bArr), r5);
            case 11:
                Object obj16 = this.c;
                ListenableFuture listenableFuture2 = (ListenableFuture) ((agke) obj16).get(0);
                i7 = true == (((Exception) obj) instanceof TimeoutException) ? 1 : 2;
                ?? r6 = this.a;
                ListenableFuture listenableFutureC = aaou.c(listenableFuture2, i7, r6);
                Object obj17 = this.d;
                ?? r7 = this.b;
                return aaou.a(listenableFutureC, r7, new qmw(obj16, (Object) r6, (Object) r7, obj17, 10, (char[]) null), r6);
            case 12:
                abpb abpbVar = (abpb) obj;
                abnl abnlVar = (abnl) this.b;
                listenableFutureJ = ((abpd) this.d).j(abnlVar.w(), (String) abnlVar.o().orElse(null), abpbVar.a, (yrr) abpbVar.b.f(), true, false, this.c, abnlVar, true);
                if (listenableFutureJ instanceof aboz) {
                    ((AtomicReference) this.a).set((aboz) listenableFutureJ);
                }
                break;
            case 13:
                abmw abmwVar = abmw.MEDIASESSION;
                Object obj18 = this.a;
                String.valueOf(obj18);
                abri abriVar = (abri) this.d;
                String str = abriVar.a;
                zvj zvjVarA = zvk.a();
                zvjVarA.j = 21;
                zvjVarA.i = 27;
                zvjVarA.f((Exception) obj);
                zvjVarA.c(ajtv.ERROR_LEVEL_WARNING);
                zvk zvkVarA = zvjVarA.a();
                abps abpsVar = (abps) this.b;
                ((zvl) abpsVar.c.io()).a(zvkVarA);
                return abpsVar.d(abriVar, (String) obj18, null, this.c);
            case 14:
                Throwable th = (Throwable) obj;
                if (!((abmt) ((acqf) this.c).a).bM() && (th instanceof CancellationException)) {
                    return ahng.l();
                }
                if (!(th instanceof UnsupportedOperationException)) {
                    zvp.b(zvn.b, zvm.k, "Error performing streaming watch.", th);
                }
                Object obj19 = this.d;
                ?? r8 = this.b;
                this.a.run();
                return (ListenableFuture) r8.apply(obj19);
            case 15:
                Object obj20 = this.c;
                Object obj21 = this.d;
                abwf abwfVar = (abwf) obj21;
                abug abugVar = (abug) obj20;
                boolean zO = abwfVar.o(abugVar);
                boolean zN = abwfVar.n();
                ?? r15 = this.b;
                if (zN) {
                    abvx abvxVar = abwfVar.b;
                    abnt abntVarC = abugVar.h;
                    boolean z2 = abugVar.k;
                    abvk abvkVar = abvxVar.b;
                    if (!z2) {
                        ahsk ahskVarB = abnt.b(abntVarC);
                        ahskVarB.e(0L);
                        abntVarC = ahskVarB.c();
                    }
                    listenableFutureJ = abvkVar.k(abntVarC, r15.a(), r15.b());
                    taf.i(listenableFutureJ, new cck(abvxVar, 14), new ztb(i2), new rjy(abvxVar, obj20, (Object) r15, 14, (short[]) null), new abmn(i6));
                } else {
                    listenableFutureJ = zO ? abwfVar.a.l(abwf.q(abugVar.h, abugVar), r15.a(), r15.b(), new abwd(), new abvv(obj21, abugVar, r15, 3)) : abwfVar.a.k(abwf.q(abugVar.h, abugVar), r15.a(), r15.b());
                }
                ((AtomicReference) this.a).set(listenableFutureJ);
                abvx abvxVar2 = abwfVar.b;
                abvxVar2.getClass();
                taf.i(listenableFutureJ, new cck(abvxVar2, 15), new abwu(i8), new uqk(13), new abmn(i3));
                break;
            case 16:
                Optional optional2 = (Optional) obj;
                boolean zIsPresent = optional2.isPresent();
                Object obj22 = this.b;
                Object obj23 = this.c;
                Object obj24 = this.a;
                if (zIsPresent) {
                    ((abwf) obj24).a.v((abnl) obj23, (abnp) obj22, (abng) optional2.get());
                } else {
                    ((abwf) obj24).j((abuc) this.d, (abnl) obj23, (abnp) obj22);
                }
                return ahng.l();
            default:
                return ((axfd) this.a).k((affd) this.b, (Intent) this.c, (afff) this.d);
        }
        return listenableFutureJ;
    }

    public /* synthetic */ qmw(abps abpsVar, String str, abri abriVar, xir xirVar, int i) {
        this.$cid = i;
        this.b = abpsVar;
        this.a = str;
        this.d = abriVar;
        this.c = xirVar;
    }

    public /* synthetic */ qmw(abwf abwfVar, abuc abucVar, abnl abnlVar, abnp abnpVar, int i) {
        this.$cid = i;
        this.a = abwfVar;
        this.d = abucVar;
        this.c = abnlVar;
        this.b = abnpVar;
    }

    public /* synthetic */ qmw(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public /* synthetic */ qmw(Object obj, Object obj2, Object obj3, Object obj4, int i, byte[] bArr) {
        this.$cid = i;
        this.d = obj;
        this.c = obj2;
        this.b = obj3;
        this.a = obj4;
    }

    public /* synthetic */ qmw(Object obj, Object obj2, Object obj3, Object obj4, int i, char[] cArr) {
        this.$cid = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
        this.d = obj4;
    }

    public /* synthetic */ qmw(Object obj, Object obj2, Object obj3, Object obj4, int i, short[] sArr) {
        this.$cid = i;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
        this.a = obj4;
    }

    public /* synthetic */ qmw(kjc kjcVar, String str, Executor executor, Context context, int i) {
        this.$cid = i;
        this.b = kjcVar;
        this.d = str;
        this.a = executor;
        this.c = context;
    }

    public /* synthetic */ qmw(qkh qkhVar, ListenableFuture listenableFuture, qmn qmnVar, String str, int i) {
        this.$cid = i;
        this.c = qkhVar;
        this.d = listenableFuture;
        this.b = qmnVar;
        this.a = str;
    }

    public /* synthetic */ qmw(zyt zytVar, aczl aczlVar, agfr agfrVar, tns tnsVar, int i) {
        this.$cid = i;
        this.d = zytVar;
        this.b = aczlVar;
        this.a = agfrVar;
        this.c = tnsVar;
    }
}
