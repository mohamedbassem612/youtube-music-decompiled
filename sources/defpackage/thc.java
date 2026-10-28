package defpackage;

import android.net.Uri;
import android.os.Build;
import com.google.android.libraries.elements.interfaces.ResourceLoader;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.MessageLite;
import j$.lang.Iterable$EL;
import j$.util.Collection;
import j$.util.Comparator$CC;
import j$.util.Comparator$EL;
import j$.util.DesugarCollections;
import j$.util.Map;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class thc implements ahcy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ thc(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v106, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v120, types: [java.lang.Object, java.util.concurrent.Callable] */
    /* JADX WARN: Type inference failed for: r0v177, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v202, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v58, types: [agfr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v81, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v64, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v7, types: [agek, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v87, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r3v29, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r4v33, types: [java.lang.Object, java.util.concurrent.Executor] */
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
    @Override // defpackage.ahcy
    public final ListenableFuture a(Object obj) throws Exception {
        aher aherVar;
        ListenableFuture listenableFutureF;
        int i = 11;
        int i2 = 13;
        byte[] bArr = null;
        int i3 = 14;
        int i4 = 4;
        int i5 = 9;
        int i6 = 15;
        int i7 = 7;
        int i8 = 5;
        int i9 = 1;
        boolean z = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        switch (this.$cid) {
            case 0:
                tnx tnxVar = (tnx) obj;
                if (tnxVar != null) {
                    if (!tnxVar.h()) {
                        return ahng.m(tnxVar.a().a);
                    }
                    if (tnxVar.c().a != null) {
                        this.a.run();
                        return ahng.n(tnxVar.c());
                    }
                }
                return ahng.m(new IllegalStateException("Response was null. This should not have happened."));
            case 1:
                ((dov) ((syn) this.a).c).ap();
                return ahng.m((Throwable) obj);
            case 2:
                return ((qrx) ((omj) obj).a).a(this.a, MoreExecutors.directExecutor());
            case 3:
                return ((tpn) this.a).a();
            case 4:
                return hed.D();
            case 5:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Object obj2 = this.a;
                if (!zBooleanValue) {
                    ListenableFuture listenableFutureC = hed.C();
                    thc thcVar = new thc(obj2, i4);
                    Executor executorDirectExecutor = MoreExecutors.directExecutor();
                    long j = afwl.a;
                    ahdb ahdbVar = new ahdb(afty.c(false), thcVar, 1);
                    int i10 = ahcs.c;
                    ahcq ahcqVar = new ahcq(listenableFutureC, ahdbVar);
                    listenableFutureC.addListener(ahcqVar, MoreExecutors.c(executorDirectExecutor, ahcqVar));
                    return ahcqVar;
                }
                vyt vytVar = (vyt) obj2;
                long jB = vytVar.f.b();
                if (jB - vytVar.g > 60000) {
                    ((Executor) vytVar.e.io()).execute(afwl.i(new vlj(obj2, 15)));
                    vytVar.g = jB;
                }
                Uri uri = vyq.AUTOPUSH.h;
                if (uri == null) {
                    return aher.a;
                }
                aherVar = new aher(uri);
                break;
                break;
            case 6:
                return ((vzt) this.a).g;
            case 7:
                wag wagVar = (wag) this.a;
                wagVar.f = (ResourceLoader) obj;
                wagVar.g = wagVar.f.getPreloader();
                return (ListenableFuture) ((afip) wagVar.b.io()).h.io();
            case 8:
                agke agkeVar = (agke) obj;
                ArrayList arrayList = new ArrayList();
                int size = agkeVar.size();
                int i11 = 0;
                while (true) {
                    Object obj3 = this.a;
                    if (i11 >= size) {
                        ahek ahekVar = new ahek(true, agke.j(arrayList));
                        fzs fzsVar = new fzs(obj3, arrayList, 10);
                        long j2 = afwl.a;
                        return ahekVar.a(new ahcz(afty.c(z), fzsVar, 1), ((wag) obj3).c);
                    }
                    vzz vzzVar = (vzz) agkeVar.get(i11);
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = vzzVar.e(asjj.b).iterator();
                    while (it.hasNext()) {
                        for (asjk asjkVar : ((asjj) it.next()).c) {
                            z = z;
                            int iBc = a.bc(asjkVar.d);
                            if (iBc == 0) {
                                iBc = 1;
                            }
                            if (iBc == i8) {
                                fzs fzsVar2 = new fzs(obj3, asjkVar, i);
                                wag wagVar2 = (wag) obj3;
                                ahex ahexVar = wagVar2.c;
                                long j3 = afwl.a;
                                agke agkeVar2 = agkeVar;
                                ahfo ahfoVar = new ahfo(new ahcz(afty.c(z), fzsVar2, 1));
                                ahexVar.execute(ahfoVar);
                                ahdb ahdbVar2 = new ahdb(afty.c(z), new okv(wagVar2, asjkVar, vzzVar, 5), 1);
                                int i12 = ahcs.c;
                                ahcq ahcqVar2 = new ahcq(ahfoVar, ahdbVar2);
                                ahfoVar.addListener(ahcqVar2, MoreExecutors.c(ahexVar, ahcqVar2));
                                arrayList2.add(ahcqVar2);
                                agkeVar = agkeVar2;
                                i8 = 5;
                                i = 11;
                            }
                        }
                    }
                    agke agkeVar3 = agkeVar;
                    boolean z2 = z;
                    ahek ahekVar2 = new ahek(true, agke.j(arrayList2));
                    rru rruVar = new rru(arrayList2, 7);
                    long j4 = afwl.a;
                    arrayList.add(ahekVar2.a(new ahcz(afty.c(z2), rruVar, 1), ((wag) obj3).c));
                    i11++;
                    agkeVar = agkeVar3;
                    z = z2;
                    i = 11;
                }
                break;
            case 9:
                vzt vztVar = (vzt) ((afip) this.a).e.io();
                return afxd.f(vztVar.g).g(new idv(vztVar, asjj.b, i8), vztVar.e);
            case 10:
                atpi atpiVar = (atpi) obj;
                if (atpiVar == null) {
                    return aher.a;
                }
                Object obj4 = this.a;
                Optional optionalEmpty = (atpiVar.b & 2) != 0 ? Optional.empty() : Optional.of(Long.valueOf(((yds) obj4).c.f().toEpochMilli()));
                if ((atpiVar.b & 4) != 0) {
                    yds ydsVar = (yds) obj4;
                    ydsVar.f = atpiVar.g;
                    if (atpiVar.e.size() > 0) {
                        yds.i(atpiVar.e, ydsVar.d);
                    } else {
                        ((agrc) ((agrc) yds.a.b().i(agso.a, "MDX.user")).k("com/google/android/libraries/youtube/mdx/user/MdxProfileStorage", "loadStatsInternal", 162, "MdxProfileStorage.java")).t("No connection count stats in the preferences");
                    }
                    if (atpiVar.f.size() > 0) {
                        yds.i(atpiVar.f, ydsVar.e);
                    } else {
                        ((agrc) ((agrc) yds.a.b().i(agso.a, "MDX.user")).k("com/google/android/libraries/youtube/mdx/user/MdxProfileStorage", "loadStatsInternal", 168, "MdxProfileStorage.java")).t("No cast available session count stats in the preferences");
                    }
                    if (atpiVar.h.size() > 0) {
                        ydsVar.f(atpiVar.h);
                    }
                    if (atpiVar.i.size() > 0) {
                        aiie<atpg> aiieVar = atpiVar.i;
                        ydsVar.j.writeLock().lock();
                        try {
                            for (atpg atpgVar : aiieVar) {
                                Map.EL.merge(((yds) obj4).i, Integer.valueOf(atpgVar.d), atpgVar, new ito(atpgVar, i5));
                            }
                            ydsVar.j.writeLock().unlock();
                        } catch (Throwable th) {
                            ydsVar.j.writeLock().unlock();
                            throw th;
                        }
                    }
                    if (atpiVar.j.size() > 0) {
                        ydsVar.g(atpiVar.j);
                    }
                    if (ydsVar.l()) {
                        return ydsVar.c(Optional.empty(), ydsVar.d, ydsVar.e, 0, optionalEmpty);
                    }
                } else if (optionalEmpty.isPresent()) {
                    ListenableFuture listenableFutureB = ((tpq) ((yds) obj4).b.io()).b(new vzs(optionalEmpty, i7));
                    hmb hmbVar = new hmb(i3);
                    Executor executor = taf.a;
                    Executor executorDirectExecutor2 = MoreExecutors.directExecutor();
                    taa taaVar = new taa(taf.c, null, hmbVar);
                    long j5 = afwl.a;
                    listenableFutureB.addListener(new ahei(listenableFutureB, new afwj(afty.c(false), taaVar, 0)), executorDirectExecutor2);
                }
                return aher.a;
            case 11:
                ynq ynqVar = (ynq) this.a;
                ynqVar.f((MessageLite) obj);
                aherVar = new aher(ynqVar.a.get());
                break;
            case 12:
                return this.a;
            case 13:
                String strValueOf = String.valueOf(Build.ID);
                String strValueOf2 = String.valueOf(Build.VERSION.INCREMENTAL);
                String str = ((atpl) obj).l;
                String strConcat = strValueOf.concat(strValueOf2);
                boolean zEquals = strConcat.equals(str);
                Object obj5 = this.a;
                return (!zEquals || ((zhl) obj5).Q().b) ? ((zjr) obj5).s.b(new xwd(strConcat, i7)) : aher.a;
            case 14:
                Object objCall = this.a.call();
                if (objCall == null) {
                    return aher.a;
                }
                aherVar = new aher(objCall);
                break;
                break;
            case 15:
                agkz agkzVar = (agkz) obj;
                if (agkzVar != null && !agkzVar.isEmpty()) {
                    return ((abib) this.a).c.a((agke) Collection.EL.stream(agkzVar).map(new aalr(i6)).collect(aghu.a));
                }
                agke agkeVar4 = agpi.a;
                if (agkeVar4 == null) {
                    return aher.a;
                }
                aherVar = new aher(agkeVar4);
                break;
                break;
            case 16:
                java.util.Map map = (java.util.Map) obj;
                if (map != null) {
                    abib abibVar = (abib) this.a;
                    vxz vxzVar = abibVar.g;
                    if (vxzVar.l(177, 45702259L, false)) {
                        Boolean bool = Boolean.TRUE;
                        agke agkeVar5 = agpi.a;
                        ArrayList arrayList3 = new ArrayList((java.util.Collection) Map.EL.getOrDefault(map, bool, agkeVar5));
                        Comparator comparatorReversed = Comparator$EL.reversed(Comparator$CC.comparing(new ygi(8)));
                        Iterable iterable = (Iterable) Map.EL.getOrDefault(map, Boolean.FALSE, agkeVar5);
                        comparatorReversed.getClass();
                        Object[] array = aguu.O(iterable).toArray();
                        int length = array.length;
                        aguu.j(array, length);
                        Arrays.sort(array, comparatorReversed);
                        agke agkeVarI = agke.i(array, length);
                        int iC = (int) vxzVar.c(21, 45705671L, 0L);
                        int i13 = ((agpi) agkeVarI).d;
                        int iMin = Math.min(iC, i13);
                        agke agkeVarSubList = agkeVarI.subList(0, iMin);
                        if (i13 > iMin) {
                            arrayList3.addAll(agkeVarI.subList(iMin, i13));
                        }
                        wer werVarE = abibVar.f.e();
                        Iterable$EL.forEach(arrayList3, new jap(werVarE, i5));
                        ListenableFuture[] listenableFutureArr = new ListenableFuture[2];
                        listenableFutureArr[0] = ape.f(new tzc(werVarE.b(), objArr2 == true ? 1 : 0));
                        if (abibVar.d == null) {
                            ((agrc) ((agrc) abib.a.c()).k("com/google/android/libraries/youtube/player/features/playbackposition/PlaybackPositionStartupController", "warmupInMemoryStore", 223, "PlaybackPositionStartupController.java")).t("InMemoryEntityStore not initialized; skipping warmup.");
                            listenableFutureF = aher.a;
                        } else if (agkeVarSubList.isEmpty() || !vxzVar.l(176, 45702257L, false)) {
                            listenableFutureF = aher.a;
                        } else {
                            wer werVarE2 = abibVar.d.e();
                            Iterable$EL.forEach(agkeVarSubList, new aaer(werVarE2, i2));
                            listenableFutureF = ape.f(new tzc(werVarE2.b(), objArr == true ? 1 : 0));
                        }
                        listenableFutureArr[1] = listenableFutureF;
                        return new ahdn(agke.p(listenableFutureArr), false);
                    }
                }
                agke agkeVar6 = agpi.a;
                if (agkeVar6 == null) {
                    return aher.a;
                }
                aherVar = new aher(agkeVar6);
                break;
                break;
            case 17:
                ((agrc) ((agrc) ((agrc) afhw.a.b()).j((Throwable) obj)).k("com/google/apps/tiktok/account/data/AccountInvalidator", "invalidateAllAccounts", 'F', "AccountInvalidator.java")).t("Account sync failed");
                afid afidVar = ((afhw) this.a).b;
                return afidVar.f.a(new aeqk(afidVar, 6), MoreExecutors.directExecutor());
            case 18:
                abhh abhhVar = (abhh) ((afid) this.a).a.io();
                agkj agkjVarV = abhhVar.v();
                ArrayList arrayList4 = new ArrayList();
                agqr it2 = agkjVarV.entrySet().iterator();
                while (it2.hasNext()) {
                    java.util.Map.Entry entry = (java.util.Map.Entry) it2.next();
                    String str2 = (String) entry.getKey();
                    afhx afhxVar = (afhx) entry.getValue();
                    ListenableFuture listenableFutureA = afhxVar.a();
                    idv idvVar = new idv(str2, afhxVar, i5, bArr);
                    long j6 = afwl.a;
                    afwi afwiVar = new afwi(afty.c(false), idvVar);
                    ?? r3 = abhhVar.b;
                    int i14 = ahcs.c;
                    ahcr ahcrVar = new ahcr(listenableFutureA, afwiVar);
                    listenableFutureA.addListener(ahcrVar, MoreExecutors.c(r3, ahcrVar));
                    arrayList4.add(ahcrVar);
                }
                ahek ahekVar3 = new ahek(true, agke.j(arrayList4));
                rru rruVar2 = new rru(arrayList4, i3);
                long j7 = afwl.a;
                return ahekVar3.a(new ahcz(afty.c(false), rruVar2, 1), abhhVar.b);
            case 19:
                final agke agkeVar7 = (agke) obj;
                afuu afuuVarD = afwt.d(118, "Sync Accounts", afux.a, true);
                Object obj6 = ((afid) this.a).g.a;
                try {
                    Object obj7 = ((afip) obj6).a;
                    agek agekVar = new agek() { // from class: afin
                        @Override // defpackage.agek
                        public final Object apply(Object obj8) {
                            int i15;
                            afhq afhqVar;
                            aihf builder = ((afiu) obj8).toBuilder();
                            afiu afiuVar = (afiu) builder.build();
                            HashMap map2 = new HashMap();
                            java.util.Collection collection = agkeVar7;
                            Iterator it3 = collection.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                }
                                afhq afhqVar2 = (afhq) it3.next();
                                Iterator it4 = DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((afiu) builder.instance).d)).values().iterator();
                                while (true) {
                                    if (!it4.hasNext()) {
                                        aihf aihfVarCreateBuilder = afiw.a.createBuilder();
                                        aihfVarCreateBuilder.copyOnWrite();
                                        afiw afiwVar = (afiw) aihfVarCreateBuilder.instance;
                                        afhqVar2.getClass();
                                        afiwVar.d = afhqVar2;
                                        afiwVar.b |= 2;
                                        aihfVarCreateBuilder.copyOnWrite();
                                        afiw afiwVar2 = (afiw) aihfVarCreateBuilder.instance;
                                        afiwVar2.e = 0;
                                        afiwVar2.b |= 4;
                                        i15 = ((afiu) builder.instance).c;
                                        builder.copyOnWrite();
                                        afiu afiuVar2 = (afiu) builder.instance;
                                        afiuVar2.b |= 1;
                                        afiuVar2.c = i15 + 1;
                                        aihfVarCreateBuilder.copyOnWrite();
                                        afiw afiwVar3 = (afiw) aihfVarCreateBuilder.instance;
                                        afiwVar3.b |= 1;
                                        afiwVar3.c = i15;
                                        builder.aj(i15, (afiw) aihfVarCreateBuilder.build());
                                        break;
                                    }
                                    afiw afiwVar4 = (afiw) it4.next();
                                    afhq afhqVar3 = afiwVar4.d;
                                    if (afhqVar3 == null) {
                                        afhqVar3 = afhq.a;
                                    }
                                    if (!afhqVar3.f.equals(afhqVar2.f) ? false : afhqVar3.c.equals(afhqVar2.c)) {
                                        aihf builder2 = afiwVar4.toBuilder();
                                        builder2.copyOnWrite();
                                        afiw afiwVar5 = (afiw) builder2.instance;
                                        afhqVar2.getClass();
                                        aihn aihnVar = afiwVar5.d;
                                        if (aihnVar == null || aihnVar == (afhqVar = afhq.a)) {
                                            afiwVar5.d = afhqVar2;
                                        } else {
                                            aihh aihhVar = (aihh) afhqVar.createBuilder(aihnVar);
                                            aihhVar.mergeFrom((aihn) afhqVar2);
                                            afiwVar5.d = (afhq) aihhVar.buildPartial();
                                        }
                                        afiwVar5.b |= 2;
                                        builder.aj(afiwVar4.c, (afiw) builder2.build());
                                        i15 = afiwVar4.c;
                                        break;
                                    }
                                }
                                map2.put(affd.a(i15), afhqVar2);
                            }
                            agkj agkjVarH = agkj.h(map2);
                            ahno.P(agkjVarH.size() == collection.size(), "Provider had duplicate accounts.");
                            agkx agkxVar = new agkx();
                            Iterator it5 = DesugarCollections.unmodifiableMap(afiuVar.d).values().iterator();
                            while (it5.hasNext()) {
                                agkxVar.c(affd.a(((afiw) it5.next()).c));
                            }
                            agkz agkzVarG = agkxVar.g();
                            agkz agkzVarKeySet = agkjVarH.keySet();
                            agkzVarG.getClass();
                            agkzVarKeySet.getClass();
                            agkz<affd> agkzVarF = new agqb(agkzVarG, agkzVarKeySet).f();
                            agkh agkhVar = new agkh(4);
                            java.util.Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((afiu) builder.instance).d));
                            for (affd affdVar : agkzVarF) {
                                Integer numValueOf = Integer.valueOf(affdVar.a);
                                if (mapUnmodifiableMap.containsKey(numValueOf)) {
                                    int iAS = a.aS(((afiw) mapUnmodifiableMap.get(numValueOf)).e);
                                    if (iAS == 0) {
                                        iAS = 1;
                                    }
                                    if (iAS == 2) {
                                        agkhVar.e(affdVar, (afiw) mapUnmodifiableMap.get(numValueOf));
                                    }
                                }
                            }
                            agkj agkjVarD = agkhVar.d(true);
                            Iterator<E> it6 = agkzVarF.iterator();
                            while (it6.hasNext()) {
                                int i16 = ((affd) it6.next()).a;
                                builder.copyOnWrite();
                                ((afiu) builder.instance).a().remove(Integer.valueOf(i16));
                            }
                            return new afio(agkjVarD, (afiu) builder.build());
                        }
                    };
                    AtomicReference atomicReference = new AtomicReference();
                    idv idvVar2 = new idv(agekVar, atomicReference, i);
                    long j8 = afwl.a;
                    ListenableFuture listenableFutureS = ((abhh) obj7).s(new afwi(afty.c(false), idvVar2), ((afip) obj6).b);
                    int i15 = 20;
                    afwi afwiVar2 = new afwi(afty.c(false), new vzs(atomicReference, i15));
                    Executor executorDirectExecutor3 = MoreExecutors.directExecutor();
                    int i16 = ahcs.c;
                    ahcr ahcrVar2 = new ahcr(listenableFutureS, afwiVar2);
                    listenableFutureS.addListener(ahcrVar2, MoreExecutors.c(executorDirectExecutor3, ahcrVar2));
                    afxd afxdVarG = afxd.f(ahcrVar2).h(new thc(obj6, i15), ((afip) obj6).c).g(new abzy(i2), MoreExecutors.directExecutor());
                    afuuVarD.a(afxdVarG);
                    afuuVarD.close();
                    return afxdVarG;
                } catch (Throwable th2) {
                    try {
                        afuuVarD.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            default:
                ArrayList arrayList5 = new ArrayList();
                agqr it3 = ((agkj) obj).entrySet().iterator();
                while (it3.hasNext()) {
                    Object obj8 = this.a;
                    java.util.Map.Entry entry2 = (java.util.Map.Entry) it3.next();
                    afhs afhsVar = new afhs((affd) entry2.getKey(), abhh.t((afiw) entry2.getValue()).b);
                    afip afipVar = (afip) obj8;
                    Set set = (Set) afipVar.d.io();
                    ArrayList arrayList6 = new ArrayList(set.size());
                    Iterator it4 = set.iterator();
                    while (it4.hasNext()) {
                        try {
                            arrayList6.add(((afht) it4.next()).a());
                        } catch (Exception e) {
                            arrayList6.add(ahng.m(e));
                        }
                    }
                    ahek ahekVar4 = new ahek(false, agke.j(arrayList6));
                    aflu afluVar = new aflu(obj8, arrayList6, afhsVar, i9);
                    long j9 = afwl.a;
                    arrayList5.add(ahekVar4.b(new afwh(afty.c(false), afluVar, 0), afipVar.c));
                }
                return new ahek(true, agke.j(arrayList5)).a(new okp(15), MoreExecutors.directExecutor());
        }
        return aherVar;
    }
}
