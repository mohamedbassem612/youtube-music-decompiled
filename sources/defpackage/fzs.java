package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import j$.util.Optional;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fzs implements Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fzs(Context context, int i) {
        this.$cid = i;
        this.b = context;
        this.a = "logging_settings.pb";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v49, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r11v57, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r11v7, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v72, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, java.util.concurrent.Future] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        aihf aihfVarCreateBuilder;
        int i = 5;
        HashMap map = null;
        switch (this.$cid) {
            case 0:
                return ((ayq) this.a).y((Context) this.b);
            case 1:
                return ehd.b((String) this.b, (String) this.a);
            case 2:
                return ((gqh) this.b).h((woo) this.a, Optional.empty(), Optional.empty());
            case 3:
                return hmy.U(this.b, this.a);
            case 4:
                Object obj = this.a;
                jhl jhlVar = (jhl) obj;
                return jhlVar.f.M().H(new hby(new agw(obj, 17), i)).p().L(jhlVar.c).al(new iho(new agw(this.b, 19), 11), new iho(jhi.a, 12));
            case 5:
                jhl jhlVar2 = (jhl) this.a;
                return jhlVar2.b.n.p().L(jhlVar2.c).al(new iho(new agw(this.b, 18), 9), new iho(jhj.a, 10));
            case 6:
                jhl jhlVar3 = (jhl) this.a;
                return jhlVar3.b.o.p().L(jhlVar3.c).al(new iho(new agw(this.b, 20), 13), new iho(jhk.a, 8));
            case 7:
                ocu ocuVar = (ocu) this.b;
                ClassLoader classLoader = ocuVar.c;
                byte[] bArr = ocuVar.b;
                isi isiVar = (isi) this.a;
                Object obj2 = isiVar.c;
                Object obj3 = isiVar.b;
                Object obj4 = isiVar.a;
                oct octVar = ocuVar.a;
                try {
                    return classLoader.loadClass(octVar.a(bArr, (String) obj2)).getMethod(octVar.a(bArr, (String) obj3), (Class[]) obj4);
                } catch (ClassNotFoundException | NoSuchMethodException | NullPointerException | ocs e) {
                    throw new IllegalStateException(e);
                }
            case 8:
                Object obj5 = this.b;
                return ((vor) obj5).d.f.f.x(new jna(15)).ak(new jbq(obj5, this.a, i));
            case 9:
                ?? r1 = this.a;
                ahno.R(r1.isDone(), "Future was expected to be done: %s", r1);
                Map map2 = (Map) a.i(r1);
                ListenableFuture listenableFuture = ((vzt) this.b).g;
                ahno.R(listenableFuture.isDone(), "Future was expected to be done: %s", listenableFuture);
                agkj agkjVar = (agkj) a.i(listenableFuture);
                HashMap map3 = new HashMap(map2);
                agqr it = agkjVar.values().iterator();
                while (it.hasNext()) {
                    waa waaVar = (waa) it.next();
                    j$.util.Map.EL.putIfAbsent(map3, waaVar.d(), waaVar);
                }
                return agkj.h(map3);
            case 10:
                map = new HashMap();
                for (ListenableFuture listenableFuture2 : this.a) {
                    ahno.R(listenableFuture2.isDone(), "Future was expected to be done: %s", listenableFuture2);
                    map.putAll((Map) a.i(listenableFuture2));
                }
                awmd awmdVar = ((wag) this.b).d;
                if (((wah) awmdVar.io()).endLatencyActionSpan("DataPushEmbeddedGroupContainerInit")) {
                    ((wah) awmdVar.io()).logLatencyActionSpan("DataPushEmbeddedGroupContainerInit");
                    return map;
                }
                return map;
            case 11:
                return ((afip) ((wag) this.b).b.io()).ae(((asjk) this.a).b).d();
            case 12:
                Pattern pattern = qpr.a;
                Object obj6 = this.b;
                qpq qpqVar = new qpq((Context) obj6);
                qpqVar.c("logging");
                qpqVar.d((String) this.a);
                try {
                    return rmp.L(qpqVar.a(), new omj(obj6, (byte[]) null));
                } catch (IOException e2) {
                    throw new agfz(e2);
                }
            case 13:
                agrx agrxVar = agso.a;
                Object obj7 = this.b;
                did didVarA = obj7 != null ? ((dhh) obj7).a() : null;
                Object obj8 = this.a;
                if (didVarA != null) {
                    xqz xqzVar = (xqz) obj8;
                    if (didVarA.b().contains(xqzVar.o)) {
                        ((yar) xqzVar.a.io()).f(xqzVar.m);
                        xqzVar.b = true;
                        xqzVar.h();
                        return xqzVar.a();
                    }
                }
                xqz xqzVar2 = (xqz) obj8;
                ((yar) xqzVar2.a.io()).n(xqzVar2.m);
                xqzVar2.b = false;
                xqzVar2.h();
                return null;
            case 14:
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                Object obj9 = this.b;
                Object obj10 = this.a;
                aaof aaofVar = (aaof) obj10;
                synchronized (aaofVar.h) {
                    agkj agkjVarD = ((aaof) obj10).d();
                    agqs agqsVarListIterator = ((agke) agkjVarD.values()).listIterator(0);
                    while (agqsVarListIterator.hasNext()) {
                        aanq aanqVar = (aanq) agqsVarListIterator.next();
                        if (!aanqVar.a().g()) {
                            ((aaof) obj10).u(aanqVar, Optional.of(obj9), agkjVarD, hashSet, hashSet2);
                        }
                    }
                    synchronized (obj10) {
                        try {
                            agqs agqsVarListIterator2 = ((agke) agkjVarD.values()).listIterator(0);
                            while (agqsVarListIterator2.hasNext()) {
                                aanq aanqVar2 = (aanq) agqsVarListIterator2.next();
                                if (!hashSet.contains(aanqVar2)) {
                                    if (aanqVar2.g()) {
                                        ((aaof) obj10).j.put(aanqVar2.a, aanqVar2);
                                    } else {
                                        ((aaof) obj10).i.add(aanqVar2);
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                if (!hashSet.isEmpty() || !hashSet2.isEmpty()) {
                    hashSet2.addAll(hashSet);
                    aaofVar.r(hashSet2);
                    aaofVar.q();
                }
                return agke.n(hashSet);
            case 15:
                ?? r2 = this.b;
                ahno.R(r2.isDone(), "Future was expected to be done: %s", r2);
                afie afieVar = (afie) a.i(r2);
                ?? r11 = this.a;
                ahno.R(r11.isDone(), "Future was expected to be done: %s", r11);
                List list = (List) a.i(r11);
                if ((afieVar.b & 1) == 0) {
                    return afmt.a;
                }
                Instant instantOfEpochMilli = Instant.ofEpochMilli(afieVar.c);
                afmt afmtVar = afmt.a;
                list.getClass();
                return new afmt(list, instantOfEpochMilli, true);
            case 16:
                Object obj11 = ((ahpu) this.a).b;
                afra afraVar = (afra) this.b;
                return ((auor) obj11).j(afraVar.c, String.valueOf(afraVar.a).concat(".pb"));
            case 17:
                Object obj12 = this.b;
                afrr afrrVar = (afrr) obj12;
                afrrVar.b.writeLock().lock();
                ?? r12 = this.a;
                try {
                    afsu afsuVarA = afsu.a;
                    try {
                        afsuVarA = ((afrr) obj12).a();
                        break;
                    } catch (IOException e3) {
                        if (!((afrr) obj12).g(e3)) {
                            ((agrc) ((agrc) ((agrc) afrr.a.b()).j(e3)).k("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "updateScheduledAccountIds", 405, "SyncManagerDataStore.java")).t("Unable to read or clear store, will not update scheduled account ids. ");
                        }
                    }
                    aihf builder = afsuVarA.toBuilder();
                    builder.copyOnWrite();
                    ((afsu) builder.instance).f = afsu.emptyIntList();
                    TreeSet treeSet = new TreeSet();
                    for (afsa afsaVar : r12) {
                        if (afsaVar.a()) {
                            treeSet.add(Integer.valueOf(afsaVar.c.a));
                        }
                    }
                    builder.copyOnWrite();
                    afsu afsuVar = (afsu) builder.instance;
                    aihv aihvVar = afsuVar.f;
                    if (!aihvVar.c()) {
                        afsuVar.f = aihn.mutableCopy(aihvVar);
                    }
                    aifs.addAll(treeSet, afsuVar.f);
                    try {
                        ((afrr) obj12).f((afsu) builder.build());
                        break;
                    } catch (IOException e4) {
                        ((agrc) ((agrc) ((agrc) afrr.a.b()).j(e4)).k("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "updateScheduledAccountIds", 426, "SyncManagerDataStore.java")).t("Error writing scheduled account ids");
                        break;
                    }
                    afrrVar.b.writeLock().unlock();
                    return null;
                } catch (Throwable th2) {
                    afrrVar.b.writeLock().unlock();
                    throw th2;
                }
            default:
                Object obj13 = this.b;
                afrr afrrVar2 = (afrr) obj13;
                afrrVar2.b.writeLock().lock();
                ?? r13 = this.a;
                try {
                    afsu afsuVarA2 = afsu.a;
                    try {
                        try {
                            afsuVarA2 = ((afrr) obj13).a();
                        } catch (IOException e5) {
                            if (!((afrr) obj13).g(e5)) {
                                ((agrc) ((agrc) ((agrc) afrr.a.b()).j(e5)).k("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "removeSyncRequests", 446, "SyncManagerDataStore.java")).t("Unable to read or clear store. Cannot remove account.");
                            }
                            afrrVar2.b.writeLock().unlock();
                            return map;
                        }
                        ((afrr) obj13).f((afsu) aihfVarCreateBuilder.build());
                        break;
                    } catch (IOException e6) {
                        ((agrc) ((agrc) ((agrc) afrr.a.b()).j(e6)).k("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "removeSyncRequests", 466, "SyncManagerDataStore.java")).t("Error writing sync data file. Cannot remove account.");
                    }
                    aihfVarCreateBuilder = afsu.a.createBuilder();
                    aihfVarCreateBuilder.mergeFrom((aihn) afsuVarA2);
                    aihfVarCreateBuilder.copyOnWrite();
                    ((afsu) aihfVarCreateBuilder.instance).d = afsu.emptyProtobufList();
                    for (afst afstVar : afsuVarA2.d) {
                        afsw afswVar = afstVar.c;
                        if (afswVar == null) {
                            afswVar = afsw.a;
                        }
                        if (!r13.contains(new afsa(afswVar))) {
                            aihfVarCreateBuilder.ak(afstVar);
                        }
                    }
                    afrrVar2.b.writeLock().unlock();
                    return map;
                } catch (Throwable th3) {
                    afrrVar2.b.writeLock().unlock();
                    throw th3;
                }
        }
    }

    public /* synthetic */ fzs(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }

    public /* synthetic */ fzs(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }
}
