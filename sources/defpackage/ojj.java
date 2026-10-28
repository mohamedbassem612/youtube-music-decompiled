package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ojj implements ahcx {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ojj(ListenableFuture listenableFuture, ListenableFuture listenableFuture2, agev agevVar, omh omhVar, int i) {
        this.$cid = i;
        this.a = listenableFuture;
        this.b = listenableFuture2;
        this.c = agevVar;
        this.d = omhVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v11, types: [afxd] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v69, types: [wnh] */
    /* JADX WARN: Type inference failed for: r0v9, types: [ahud] */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r14v0, types: [afxd] */
    /* JADX WARN: Type inference failed for: r1v11, types: [omj] */
    /* JADX WARN: Type inference failed for: r1v19, types: [wlc] */
    /* JADX WARN: Type inference failed for: r1v23, types: [wlc] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r3v11, types: [ahcy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v26, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v29, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r3v33, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r4v22, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v23, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v11, types: [agke] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r8v46, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r9v8, types: [wlc] */
    @Override // defpackage.ahcx
    public final ListenableFuture a() throws IOException {
        ListenableFuture listenableFutureAp;
        int i = 16;
        int count = 0;
        ?? arrayList = 0;
        ?? r5 = 0;
        ?? r6 = 0;
        ?? r7 = 0;
        int i2 = 1;
        switch (this.$cid) {
            case 0:
                ohp ohpVar = (ohp) ahng.v(this.a);
                nss.a(((omh) this.d).b);
                if ((ohpVar.b & SemanticState.Hidden) == 0) {
                    return ahng.n(ohx.a);
                }
                Object obj = this.c;
                String str = ohpVar.c;
                Object obj2 = ((agfa) obj).a;
                abxv abxvVar = (abxv) obj2;
                vzx vzxVarH = ((hed) abxvVar.d).H(ohpVar);
                if ((vzxVarH.c().b & 2) == 0) {
                    return abxvVar.r(str);
                }
                asjl asjlVar = vzxVarH.c().d;
                if (asjlVar == null) {
                    asjlVar = asjl.a;
                }
                if ((asjlVar.b & 1) == 0) {
                    return abxvVar.r(str);
                }
                Object obj3 = abxvVar.b;
                atpz atpzVar = asjlVar.c;
                if (atpzVar == null) {
                    atpzVar = atpz.a;
                }
                xpl xplVarM = ((hed) obj3).M(atpzVar.toByteString());
                ?? UnmodifiableMap = DesugarCollections.unmodifiableMap(asjlVar.d);
                ArrayList arrayList2 = new ArrayList();
                for (String str2 : ((agkj) vzxVarH.d.io()).keySet()) {
                    if (!UnmodifiableMap.containsKey(str2)) {
                        return abxvVar.r(str);
                    }
                    if (vzxVarH.g().containsKey(str2)) {
                        listenableFutureAp = ahno.ap(new tsn(vzxVarH, str2, i, r6 == true ? 1 : 0), vzxVarH.a);
                    } else {
                        ((zs) vzxVarH.b.io()).C(4, vzxVarH.d(), str2);
                        listenableFutureAp = ahng.m(new IOException("File not found: ".concat(String.valueOf(str2))));
                    }
                    arrayList2.add(afxd.f(listenableFutureAp).g(new hco(xplVarM, (Object) UnmodifiableMap, str2, 14, (char[]) null), abxvVar.c));
                }
                ?? Aw = ahno.aw(arrayList2);
                fxv fxvVar = new fxv(14);
                ?? r3 = abxvVar.c;
                return afxd.f(Aw.k(fxvVar, r3)).c(Exception.class, new row(obj2, str, 12, r5 == true ? 1 : 0), r3);
            case 1:
                Uri uri = (Uri) this.d;
                iuo iuoVar = (iuo) this.b;
                ContentResolver contentResolver = iuoVar.e;
                Cursor cursorQuery = contentResolver.query(ixt.o(uri), new String[]{"_id"}, null, null, "play_order");
                Object obj4 = this.c;
                Object obj5 = this.a;
                if (obj4 == null) {
                    Cursor cursorQuery2 = contentResolver.query(ixt.o(uri), null, null, null, null);
                    try {
                        count = cursorQuery2.moveToFirst() ? cursorQuery2.getCount() : 0;
                        jku.b(cursorQuery2);
                    } catch (Throwable th) {
                        jku.b(cursorQuery2);
                        throw th;
                    }
                } else {
                    count = -1;
                }
                try {
                    int columnIndex = cursorQuery.getColumnIndex("_id");
                    int i3 = -1;
                    int i4 = -1;
                    while (cursorQuery.moveToNext()) {
                        i3++;
                        String string = cursorQuery.getString(columnIndex);
                        if (string.equals(((Uri) obj5).getLastPathSegment())) {
                            if (count != -1) {
                                i4 = i3;
                            } else {
                                count = -1;
                                i4 = i3;
                                if (obj4 == null) {
                                }
                            }
                        } else if (obj4 == null && string.equals(((Uri) obj4).getLastPathSegment())) {
                            count = i3;
                            if (i4 != -1) {
                            }
                        }
                        jku.b(cursorQuery);
                        if (i4 >= 0 || count < 0) {
                            return ahng.n(Boolean.FALSE);
                        }
                        if (i4 < count) {
                            count--;
                        }
                        if (i4 == count) {
                            return ahng.n(Boolean.TRUE);
                        }
                        iuoVar.O(uri, iuo.b());
                        return ahng.n(Boolean.valueOf(MediaStore.Audio.Playlists.Members.moveItem(iuoVar.e, iuo.j(uri), i4, count)));
                    }
                    jku.b(cursorQuery);
                    if (i4 >= 0) {
                    }
                    return ahng.n(Boolean.FALSE);
                } catch (Throwable th2) {
                    jku.b(cursorQuery);
                    throw th2;
                }
            case 2:
                ?? r4 = this.b;
                ?? r8 = this.a;
                Object obj6 = this.d;
                xgg xggVar = (xgg) this.c;
                return ((omj) xggVar.h).c(new ojj(xggVar, (oiw) obj6, (ahcy) r8, (List) r4, 3), xggVar.k);
            case 3:
                Object obj7 = this.d;
                Object obj8 = this.c;
                xgg xggVar2 = (xgg) obj8;
                return xggVar2.s(ahno.aq(new gwj(obj8, obj7, 9, r7 == true ? 1 : 0), xggVar2.k), new iaj(obj8, (oiw) obj7, this.a, this.b, 17));
            case 4:
                ListenableFuture listenableFutureN = ahng.n(Boolean.TRUE);
                while (true) {
                    ?? r2 = this.a;
                    Object obj9 = this.d;
                    if (count >= r2.size()) {
                        return ahno.ar(listenableFutureN, new olj(this.c, i2), ((ole) obj9).c);
                    }
                    ole oleVar = (ole) obj9;
                    listenableFutureN = ahno.as(listenableFutureN, new okx(oleVar, (oiz) r2.get(count), (ojb) ahng.v((Future) this.b.get(count)), 5), oleVar.c);
                    count++;
                }
                break;
            case 5:
                Object obj10 = this.b;
                try {
                    Map map = (Map) ((agev) ahng.v(this.c)).f();
                    if (map != null) {
                        aihf aihfVar = (aihf) obj10;
                        long j = ((axgz) aihfVar.instance).c;
                        for (Map.Entry entry : map.entrySet()) {
                            Integer num = (Integer) entry.getKey();
                            num.intValue();
                            long jLongValue = ((Long) entry.getValue()).longValue() - j;
                            aihfVar.copyOnWrite();
                            axgz axgzVar = (axgz) aihfVar.instance;
                            aiip aiipVar = axgzVar.w;
                            if (!aiipVar.b) {
                                axgzVar.w = aiipVar.a();
                            }
                            axgzVar.w.put(num, Long.valueOf(jLongValue));
                        }
                    }
                } catch (Exception e) {
                    ((agrc) ((agrc) ((agrc) qcq.a.c()).j(e)).k("com/google/android/libraries/performance/primes/metrics/startup/StartupMetricRecordingService", "setCustomTimestamps", 'v', "StartupMetricRecordingService.java")).t("Failed to get custom timestamps future");
                }
                ?? r0 = this.a;
                Object obj11 = this.d;
                qfc qfcVarA = qfd.a();
                aihf aihfVarCreateBuilder = axhz.a.createBuilder();
                aihf aihfVarCreateBuilder2 = axgw.a.createBuilder();
                long leastSignificantBits = UUID.randomUUID().getLeastSignificantBits();
                aihfVarCreateBuilder2.copyOnWrite();
                axgw axgwVar = (axgw) aihfVarCreateBuilder2.instance;
                axgwVar.b |= 1;
                axgwVar.c = leastSignificantBits;
                aihfVarCreateBuilder2.copyOnWrite();
                axgw axgwVar2 = (axgw) aihfVarCreateBuilder2.instance;
                axgwVar2.d = 2;
                axgwVar2.b |= 2;
                aihfVarCreateBuilder2.copyOnWrite();
                axgw axgwVar3 = (axgw) aihfVarCreateBuilder2.instance;
                axgz axgzVar2 = (axgz) ((aihf) obj10).build();
                axgzVar2.getClass();
                axgwVar3.f = axgzVar2;
                axgwVar3.b |= 16;
                aihfVarCreateBuilder.copyOnWrite();
                axhz axhzVar = (axhz) aihfVarCreateBuilder.instance;
                axgw axgwVar4 = (axgw) aihfVarCreateBuilder2.build();
                axgwVar4.getClass();
                axhzVar.l = axgwVar4;
                axhzVar.b |= SemanticState.ReadOnly;
                qfcVarA.g((axhz) aihfVarCreateBuilder.build());
                qfcVarA.b = (axgh) ((agev) ahng.v(r0)).f();
                qfcVarA.c = null;
                qfcVarA.e(true);
                return ((qii) obj11).a.a(qfcVarA.a());
            case 6:
                int i5 = 6;
                try {
                    albe albeVarA = ((wmn) ((xxj) this.c).a).a();
                    if (albeVarA == null) {
                        return aher.a;
                    }
                    for (wlc wlcVar : ((dov) this.d).a) {
                        if (wlcVar.d(albeVarA)) {
                            if (arrayList == 0) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(wlcVar);
                        }
                    }
                    if (arrayList == 0) {
                        arrayList = agpi.a;
                    }
                    if (arrayList.isEmpty()) {
                        return aher.a;
                    }
                    ?? r9 = this.a;
                    if (arrayList.size() == 1) {
                        return ahno.an(((wlc) arrayList.get(0)).b(MoreExecutors.directExecutor(), r9, albeVarA), Throwable.class, new oly(i5), MoreExecutors.directExecutor());
                    }
                    ArrayList arrayList3 = new ArrayList(arrayList.size());
                    while (count < arrayList.size() - 1) {
                        arrayList3.add(((wlc) arrayList.get(count)).b(this.b, r9, albeVarA));
                        count++;
                    }
                    arrayList3.add(((wlc) aguu.K(arrayList)).b(MoreExecutors.directExecutor(), r9, albeVarA));
                    return ahno.aE(arrayList3).m(new wko(arrayList3, 3), MoreExecutors.directExecutor()).g(new vxq(6), MoreExecutors.directExecutor());
                } catch (IOException e2) {
                    twu.c(6, "[TRANSPORT] Field 777 failed to parse", e2);
                    throw e2;
                }
            default:
                return ((wnh) ((wom) this.c).g.io()).b((wlu) this.a, this.b, (wlt) this.d);
        }
    }

    public /* synthetic */ ojj(dov dovVar, Executor executor, zwa zwaVar, xxj xxjVar, int i) {
        this.$cid = i;
        this.d = dovVar;
        this.b = executor;
        this.a = zwaVar;
        this.c = xxjVar;
    }

    public /* synthetic */ ojj(iuo iuoVar, Uri uri, Uri uri2, Uri uri3, int i) {
        this.$cid = i;
        this.b = iuoVar;
        this.d = uri;
        this.c = uri2;
        this.a = uri3;
    }

    public /* synthetic */ ojj(ole oleVar, List list, List list2, Boolean bool, int i) {
        this.$cid = i;
        this.d = oleVar;
        this.a = list;
        this.b = list2;
        this.c = bool;
    }

    public /* synthetic */ ojj(qii qiiVar, aihf aihfVar, ListenableFuture listenableFuture, ListenableFuture listenableFuture2, int i) {
        this.$cid = i;
        this.d = qiiVar;
        this.b = aihfVar;
        this.c = listenableFuture;
        this.a = listenableFuture2;
    }

    public /* synthetic */ ojj(wom womVar, woo wooVar, Executor executor, wlt wltVar, int i) {
        this.$cid = i;
        this.c = womVar;
        this.a = wooVar;
        this.b = executor;
        this.d = wltVar;
    }

    public /* synthetic */ ojj(xgg xggVar, oiw oiwVar, ahcy ahcyVar, List list, int i) {
        this.$cid = i;
        this.c = xggVar;
        this.d = oiwVar;
        this.a = ahcyVar;
        this.b = list;
    }
}
