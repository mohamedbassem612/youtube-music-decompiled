package defpackage;

import android.net.Uri;
import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.SettableFuture;
import j$.time.Instant;
import j$.util.Collection;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class aekb implements ahcy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ aekb(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r8v36, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v38, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v40, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v42, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v44, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v46, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v48, types: [awqg, java.lang.Object] */
    @Override // defpackage.ahcy
    public final ListenableFuture a(Object obj) throws Throwable {
        byte[] bArr = null;
        switch (this.$cid) {
            case 0:
                ((aejd) ((ahgb) this.a).d).b();
                return ahng.m(new aeon("Voice language renderer not found in cache"));
            case 1:
                aprb aprbVar = (aprb) obj;
                ((aejd) ((ahgb) this.a).d).b();
                return aprbVar != null ? ahng.n(aprbVar) : ahng.m(new Exception("Cached voice language renderer is null"));
            case 2:
                String str = (String) obj;
                return str.isEmpty() ? ahng.n(((ahgb) this.a).c) : ahng.n(str);
            case 3:
                abhh abhhVar = ((afim) this.a).a;
                return abhhVar.o(abhhVar.n(true));
            case 4:
                Object obj2 = this.a;
                ((IOException) obj2).addSuppressed((IOException) obj);
                throw ((Throwable) obj2);
            case 5:
                afie afieVar = (afie) obj;
                int i = afieVar.b & 1;
                Object obj3 = this.a;
                return (i == 0 || Math.abs(((afja) obj3).c.f().toEpochMilli() - afieVar.c) >= afja.b) ? ahcs.e(((afja) obj3).e.a(), afwl.a(new aeni(9)), MoreExecutors.directExecutor()) : ahng.n(Boolean.FALSE);
            case 6:
                return ((Boolean) obj).booleanValue() ? ((afja) this.a).a() : ahng.n(null);
            case 7:
                ?? r8 = this.a;
                syn synVar = afnp.m;
                return a.k(r8, obj);
            case 8:
                ?? r9 = this.a;
                syn synVar2 = afnp.m;
                return a.k(r9, obj);
            case 9:
                ?? r10 = this.a;
                syn synVar3 = afnp.m;
                return a.k(r10, obj);
            case 10:
                ?? r11 = this.a;
                syn synVar4 = afnp.m;
                return a.k(r11, obj);
            case 11:
                ?? r12 = this.a;
                syn synVar5 = afnp.m;
                return a.k(r12, obj);
            case 12:
                ?? r13 = this.a;
                syn synVar6 = afnp.m;
                return a.k(r13, obj);
            case 13:
                ?? r14 = this.a;
                syn synVar7 = afnp.m;
                return a.k(r14, obj);
            case 14:
                Map map = (Map) obj;
                Collection.EL.stream(map.keySet()).map(new aegf(6)).toArray();
                if (map.isEmpty()) {
                    return ahng.n(agpr.a);
                }
                Object obj4 = this.a;
                final Set setKeySet = map.keySet();
                afry afryVar = (afry) obj4;
                final afrr afrrVar = afryVar.e;
                ListenableFuture listenableFutureAp = ahno.ap(new Callable() { // from class: afrn
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Boolean boolValueOf;
                        aihf aihfVarCreateBuilder;
                        long epochMilli;
                        HashSet hashSet;
                        Iterator it;
                        java.util.Collection collection;
                        Iterator it2;
                        boolean z;
                        afrr afrrVar2 = afrrVar;
                        afrrVar2.b.writeLock().lock();
                        try {
                            afsu afsuVarA = afsu.a;
                            try {
                                afsuVarA = afrrVar2.a();
                                while (true) {
                                    boolean zHasNext = it.hasNext();
                                    collection = setKeySet;
                                    if (!zHasNext) {
                                        break;
                                    }
                                    afst afstVar = (afst) it.next();
                                    afsw afswVar = afstVar.c;
                                    if (afswVar == null) {
                                        afswVar = afsw.a;
                                    }
                                    if (collection.contains(new afsa(afswVar))) {
                                        afsw afswVar2 = afstVar.c;
                                        if (afswVar2 == null) {
                                            afswVar2 = afsw.a;
                                        }
                                        hashSet.add(new afsa(afswVar2));
                                        aihf builder = afstVar.toBuilder();
                                        builder.copyOnWrite();
                                        afst afstVar2 = (afst) builder.instance;
                                        afstVar2.b |= 4;
                                        afstVar2.e = epochMilli;
                                        aihfVarCreateBuilder.ak((afst) builder.build());
                                    } else {
                                        aihfVarCreateBuilder.ak(afstVar);
                                    }
                                }
                                while (true) {
                                    z = false;
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    afsa afsaVar = (afsa) it2.next();
                                    if (!hashSet.contains(afsaVar)) {
                                        aihf aihfVarCreateBuilder2 = afst.a.createBuilder();
                                        afsw afswVar3 = afsaVar.a;
                                        aihfVarCreateBuilder2.copyOnWrite();
                                        afst afstVar3 = (afst) aihfVarCreateBuilder2.instance;
                                        afswVar3.getClass();
                                        afstVar3.c = afswVar3;
                                        afstVar3.b |= 1;
                                        long j = afrrVar2.f;
                                        aihfVarCreateBuilder2.copyOnWrite();
                                        afst afstVar4 = (afst) aihfVarCreateBuilder2.instance;
                                        afstVar4.b |= 2;
                                        afstVar4.d = j;
                                        aihfVarCreateBuilder2.copyOnWrite();
                                        afst afstVar5 = (afst) aihfVarCreateBuilder2.instance;
                                        afstVar5.b |= 4;
                                        afstVar5.e = epochMilli;
                                        aihfVarCreateBuilder2.copyOnWrite();
                                        afst afstVar6 = (afst) aihfVarCreateBuilder2.instance;
                                        afstVar6.b |= 8;
                                        afstVar6.f = 0;
                                        aihfVarCreateBuilder.ak((afst) aihfVarCreateBuilder2.build());
                                    }
                                }
                            } catch (IOException e) {
                                if (!afrrVar2.g(e)) {
                                    ((agrc) ((agrc) ((agrc) afrr.a.b()).j(e)).k("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "prepareForSync", 237, "SyncManagerDataStore.java")).t("Error, could not read or clear store. Aborting sync attempt.");
                                    boolValueOf = Boolean.FALSE;
                                }
                                afrrVar2.b.writeLock().unlock();
                                return boolValueOf;
                            }
                            aihfVarCreateBuilder = afsu.a.createBuilder();
                            aihfVarCreateBuilder.mergeFrom((aihn) afsuVarA);
                            aihfVarCreateBuilder.copyOnWrite();
                            ((afsu) aihfVarCreateBuilder.instance).d = afsu.emptyProtobufList();
                            mbc mbcVar = afrrVar2.d;
                            epochMilli = mbcVar.f().toEpochMilli();
                            hashSet = new HashSet();
                            it = afsuVarA.d.iterator();
                            it2 = collection.iterator();
                            if (afsuVarA.c < 0) {
                                long epochMilli2 = afrrVar2.f;
                                if (epochMilli2 < 0) {
                                    epochMilli2 = mbcVar.f().toEpochMilli();
                                    afrrVar2.f = epochMilli2;
                                }
                                aihfVarCreateBuilder.copyOnWrite();
                                afsu afsuVar = (afsu) aihfVarCreateBuilder.instance;
                                afsuVar.b |= 1;
                                afsuVar.c = epochMilli2;
                            }
                            try {
                                afrrVar2.f((afsu) aihfVarCreateBuilder.build());
                                afrrVar2.e.set(true);
                                z = true;
                            } catch (IOException unused) {
                            } catch (Throwable th) {
                                afrrVar2.e.set(true);
                                throw th;
                            }
                            boolValueOf = Boolean.valueOf(z);
                            afrrVar2.b.writeLock().unlock();
                            return boolValueOf;
                        } catch (Throwable th2) {
                            afrrVar2.b.writeLock().unlock();
                            throw th2;
                        }
                    }
                }, afrrVar.c);
                ListenableFuture listenableFutureH = afryVar.h(listenableFutureAp);
                aflu afluVar = new aflu(afryVar, listenableFutureAp, map, 2);
                ahey aheyVar = afryVar.b;
                ListenableFuture listenableFutureAz = ahno.az(listenableFutureH, afluVar, aheyVar);
                map.getClass();
                ListenableFuture listenableFutureAy = ahno.ay(listenableFutureAz, new aegt(map, 10), aheyVar);
                afryVar.d.b(listenableFutureAy, "SyncManager: Syncing");
                return listenableFutureAy;
            case 15:
                final long jLongValue = ((Long) obj).longValue();
                final afv afvVar = new afv();
                final afv afvVar2 = new afv();
                Object obj5 = this.a;
                final afry afryVar2 = (afry) obj5;
                final long epochMilli = afryVar2.a.f().toEpochMilli();
                ListenableFuture listenableFutureH2 = afryVar2.h(afryVar2.e.b());
                agek agekVar = new agek() { // from class: afrs
                    @Override // defpackage.agek
                    public final Object apply(Object obj6) {
                        Map map2;
                        Iterator it;
                        this = this;
                        afry afryVar3 = afryVar2;
                        Object obj7 = afryVar3.h;
                        Map map3 = (Map) obj6;
                        Map map4 = afvVar2;
                        synchronized (obj7) {
                            Iterator it2 = afryVar3.i.entrySet().iterator();
                            while (true) {
                                boolean zHasNext = it2.hasNext();
                                map2 = afvVar;
                                if (zHasNext) {
                                    Map.Entry entry = (Map.Entry) it2.next();
                                    afsa afsaVar = (afsa) entry.getKey();
                                    Map map5 = afryVar3.j;
                                    if (!map5.containsKey(afsaVar) && afryVar3.m()) {
                                        long jMax = Math.max(((Long) j$.util.Map.EL.getOrDefault(afryVar3.k, afsaVar, -1L)).longValue(), ((Long) j$.util.Map.EL.getOrDefault(map3, afsaVar, -1L)).longValue());
                                        agev agevVarI = jMax == -1 ? agdf.a : agev.i(Instant.ofEpochMilli(jMax));
                                        if (jMax == -1) {
                                            jMax = jLongValue;
                                        }
                                        afre afreVar = ((afsa) entry.getKey()).b;
                                        afrb afrbVarA = ((afrg) entry.getValue()).a();
                                        long j = afrbVarA.a;
                                        long j2 = jMax;
                                        long j3 = epochMilli;
                                        if (j2 + j <= j3) {
                                            agqr it3 = ((agpk) ((agpn) afrbVarA.c).entrySet()).iterator();
                                            while (true) {
                                                if (!it3.hasNext()) {
                                                    it = it2;
                                                    SettableFuture settableFutureCreate = SettableFuture.create();
                                                    map5.put(afsaVar, settableFutureCreate);
                                                    map2.put(afsaVar, new afrx(settableFutureCreate, agevVarI));
                                                    break;
                                                }
                                                Map.Entry entry2 = (Map.Entry) it3.next();
                                                it = it2;
                                                agqr agqrVar = it3;
                                                long j4 = ((afrc) entry2.getValue()).b;
                                                long j5 = j3 - j2;
                                                long j6 = j4 + j;
                                                if (j4 == -1 || j5 <= j6) {
                                                    afrd afrdVar = (afrd) entry2.getKey();
                                                    if (!map4.containsKey(afrdVar)) {
                                                        map4.put(afrdVar, Boolean.valueOf(((afrh) ((awmd) afryVar3.f.get(afrdVar)).io()).a()));
                                                    }
                                                    if (!((Boolean) map4.get(afrdVar)).booleanValue()) {
                                                        break;
                                                    }
                                                }
                                                it2 = it;
                                                it3 = agqrVar;
                                            }
                                        } else {
                                            it = it2;
                                        }
                                        it2 = it;
                                    }
                                }
                            }
                        }
                        return map2;
                    }
                };
                ahey aheyVar2 = afryVar2.b;
                return ahno.as(ahno.ar(listenableFutureH2, agekVar, aheyVar2), new aekb(obj5, 14), aheyVar2);
            case 16:
                dyp dypVar = ((WorkerParameters) this.a).b;
                ((ahub) obj).n();
                return aher.a;
            default:
                ahuu ahuuVar = (ahuu) obj;
                String scheme = Uri.parse(ahuuVar.a).getScheme();
                if (!ahuuVar.b && !ahno.ag(scheme, "https")) {
                    ((agsj) ((agsj) ahup.a.b()).k("com/google/frameworks/client/data/android/HttpClientImpl", "makeRequest", 85, "HttpClientImpl.java")).t("Making plaintext http request");
                }
                Object obj6 = this.a;
                return ahcs.f(ahng.s(((ahup) obj6).d, MoreExecutors.directExecutor()), afwl.d(new aaoq(obj6, ahuuVar, 13, bArr)), MoreExecutors.directExecutor());
        }
    }
}
