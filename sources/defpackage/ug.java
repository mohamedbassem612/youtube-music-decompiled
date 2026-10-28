package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Parcel;
import android.os.SystemClock;
import app.rive.semantics.SemanticState;
import com.google.android.icing.IcingSearchEngineImpl;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ug implements Closeable {
    public final tv a;
    public final tw c;
    public final String d;
    public final uu e;
    private final Executor h;
    public volatile boolean f = false;
    public volatile boolean g = false;
    public final String b = "ytoffline_appsearch";

    public ug(tv tvVar, Executor executor, Context context, tw twVar) {
        this.a = tvVar;
        this.h = executor;
        this.c = twVar;
        String packageName = context.getPackageName();
        this.d = packageName;
        this.e = new uu(packageName);
    }

    private final void j(int i) {
        this.h.execute(new awu(this, i, 1));
    }

    public final tp a(tn tnVar, List list, Map map, ut utVar) throws ts {
        azs.i(0, 0, 2, "schemaMigrationCallType");
        ArrayList arrayList = new ArrayList(tnVar.b());
        sv svVarM = this.a.m(this.d, this.b, arrayList, list, map, tnVar.h, 1, utVar);
        if (!svVarM.a) {
            throw new ts(7, svVarM.c, null);
        }
        this.f = true;
        return svVarM.b;
    }

    public final ListenableFuture b(Callable callable) {
        return ed.l(this.h, callable);
    }

    public final ListenableFuture c(td tdVar) {
        azs.h(!this.g, "AppSearchSession has already been closed");
        ListenableFuture listenableFutureB = b(new uf(this, tdVar, 1));
        j(tdVar.a().size());
        return listenableFutureB;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.f || this.g) {
            return;
        }
        ed.l(this.h, new ub(this, 3));
    }

    public final ListenableFuture d() {
        return b(new ub(this, 5));
    }

    public final ListenableFuture e(final tn tnVar) {
        azs.h(!this.g, "AppSearchSession has already been closed");
        SystemClock.elapsedRealtime();
        SystemClock.elapsedRealtime();
        ListenableFuture listenableFutureB = b(new Callable() { // from class: ud
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, java.util.List] */
            /* JADX WARN: Type inference failed for: r12v11, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r1v10 */
            /* JADX WARN: Type inference failed for: r1v22 */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.io.FileInputStream, java.io.InputStream] */
            /* JADX WARN: Type inference failed for: r1v5 */
            /* JADX WARN: Type inference failed for: r1v7 */
            /* JADX WARN: Type inference failed for: r29v1 */
            /* JADX WARN: Type inference failed for: r29v10 */
            /* JADX WARN: Type inference failed for: r29v11 */
            /* JADX WARN: Type inference failed for: r29v12 */
            /* JADX WARN: Type inference failed for: r29v13 */
            /* JADX WARN: Type inference failed for: r29v14 */
            /* JADX WARN: Type inference failed for: r29v15 */
            /* JADX WARN: Type inference failed for: r29v16 */
            /* JADX WARN: Type inference failed for: r29v17 */
            /* JADX WARN: Type inference failed for: r29v2, types: [java.io.InputStream] */
            /* JADX WARN: Type inference failed for: r29v3 */
            /* JADX WARN: Type inference failed for: r29v4, types: [java.io.InputStream] */
            /* JADX WARN: Type inference failed for: r29v5 */
            /* JADX WARN: Type inference failed for: r29v6 */
            /* JADX WARN: Type inference failed for: r29v7 */
            /* JADX WARN: Type inference failed for: r29v8 */
            /* JADX WARN: Type inference failed for: r29v9 */
            @Override // java.util.concurrent.Callable
            public final Object call() throws Throwable {
                Map map;
                boolean z;
                int i;
                ?? r29;
                tp tpVarA;
                long jElapsedRealtime;
                Set<String> set;
                SystemClock.elapsedRealtime();
                ug ugVar = this.a;
                String str = ugVar.d;
                ut utVar = new ut(str);
                tn tnVar2 = tnVar;
                Set set2 = tnVar2.a;
                Set setB = tnVar2.b();
                Set setUnmodifiableSet = DesugarCollections.unmodifiableSet(set2);
                afv afvVar = new afv();
                for (Map.Entry entry : tnVar2.b.entrySet()) {
                    afvVar.put((String) entry.getKey(), new afx((Collection) entry.getValue()));
                }
                Map map2 = tnVar2.c;
                Map map3 = tnVar2.d;
                afv afvVarA = tn.a(map2);
                Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(map3);
                afv afvVar2 = new afv();
                for (Map.Entry entry2 : tnVar2.e.entrySet()) {
                    afvVar2.put((String) entry2.getKey(), new afx((Collection) entry2.getValue()));
                }
                ArrayList arrayList = new ArrayList(setB.size());
                Iterator it = setB.iterator();
                while (it.hasNext()) {
                    String str2 = ((sl) it.next()).a;
                    sw swVar = new sw(str2);
                    swVar.f(setUnmodifiableSet.contains(str2));
                    Set set3 = (Set) afvVar.get(str2);
                    if (set3 != null) {
                        Iterator it2 = set3.iterator();
                        while (it2.hasNext()) {
                            swVar.d((sz) it2.next());
                        }
                    }
                    Set set4 = (Set) afvVarA.get(str2);
                    if (set4 != null) {
                        Iterator it3 = set4.iterator();
                        while (it3.hasNext()) {
                            swVar.e((Set) it3.next());
                        }
                    }
                    sz szVar = (sz) mapUnmodifiableMap.get(str2);
                    if (szVar != null) {
                        swVar.g(szVar);
                    }
                    Set set5 = (Set) afvVar2.get(str2);
                    if (set5 != null) {
                        Iterator it4 = set5.iterator();
                        while (it4.hasNext()) {
                            swVar.c((te) it4.next());
                        }
                    }
                    arrayList.add(swVar.a());
                }
                afv afvVar3 = new afv();
                for (Map.Entry entry3 : tnVar2.f.entrySet()) {
                    afvVar3.put((String) entry3.getKey(), new afx((Collection) entry3.getValue()));
                }
                Map mapUnmodifiableMap2 = DesugarCollections.unmodifiableMap(tnVar2.g);
                if (mapUnmodifiableMap2.isEmpty()) {
                    tp tpVarA2 = ugVar.a(tnVar2, arrayList, afvVar3, utVar);
                    SystemClock.elapsedRealtime();
                    ugVar.f();
                    SystemClock.elapsedRealtime();
                    SystemClock.elapsedRealtime();
                    return tpVarA2;
                }
                str.getClass();
                SystemClock.elapsedRealtime();
                tv tvVar = ugVar.a;
                String str3 = ugVar.b;
                su suVarN = tvVar.n(str, ugVar.e);
                int i2 = suVarN.a;
                SystemClock.elapsedRealtime();
                Set setA = suVarN.a();
                if (i2 == 1) {
                    map = Collections.EMPTY_MAP;
                } else {
                    afx afxVar = new afx(setA.size());
                    Iterator it5 = setA.iterator();
                    while (it5.hasNext()) {
                        afxVar.add(((sl) it5.next()).a);
                    }
                    afv afvVar4 = new afv();
                    for (Map.Entry entry4 : mapUnmodifiableMap2.entrySet()) {
                        String str4 = (String) entry4.getKey();
                        sy syVar = (sy) entry4.getValue();
                        if (afxVar.contains(str4) && syVar.c()) {
                            afvVar4.put(str4, syVar);
                        }
                    }
                    map = afvVar4;
                }
                if (map.isEmpty()) {
                    tp tpVarA3 = ugVar.a(tnVar2, arrayList, afvVar3, utVar);
                    SystemClock.elapsedRealtime();
                    return tpVarA3;
                }
                SystemClock.elapsedRealtime();
                azs.i(1, 0, 2, "schemaMigrationCallType");
                sv svVarM = tvVar.m(str, str3, new ArrayList(tnVar2.b()), arrayList, afvVar3, false, 1, utVar);
                SystemClock.elapsedRealtime();
                boolean z2 = svVarM.a;
                boolean z3 = tnVar2.h;
                SystemClock.elapsedRealtime();
                if (!z3) {
                    Set setKeySet = map.keySet();
                    if (!z2) {
                        tp tpVar = svVarM.b;
                        afx afxVar2 = new afx(tpVar.b());
                        afxVar2.removeAll(setKeySet);
                        afx afxVar3 = new afx(tpVar.a());
                        afxVar3.removeAll(setKeySet);
                        if (!afxVar2.isEmpty() || !afxVar3.isEmpty()) {
                            throw new ts(7, svVarM.c, null);
                        }
                    }
                }
                tx txVar = new tx(tvVar, str, tnVar2.b(), ugVar.c);
                try {
                    File file = txVar.d;
                    azs.h(file.exists(), "Internal temp file does not exist.");
                    FileOutputStream fileOutputStream = new FileOutputStream(file, true);
                    try {
                        lxg lxgVar = new lxg(fileOutputStream);
                        tv tvVar2 = txVar.a;
                        String str5 = txVar.b;
                        String str6 = txVar.c;
                        tk tkVar = new tk();
                        Set setKeySet2 = map.keySet();
                        azs.l(setKeySet2);
                        tkVar.b();
                        tkVar.a.addAll(setKeySet2);
                        tkVar.d(1);
                        tj tjVarK = tvVar2.k(str5, str6, "", tkVar.a(), null);
                        while (!tjVarK.a().isEmpty()) {
                            for (int i3 = 0; i3 < tjVarK.a().size(); i3++) {
                                sy syVar2 = (sy) map.get(((ti) tjVarK.a().get(i3)).a().h());
                                ss ssVarB = i2 <= 0 ? syVar2.b() : syVar2.a();
                                if (!txVar.e.contains(ssVarB.h())) {
                                    throw new ts(7, "Receive a migrated document with schema type: " + ssVarB.h() + ". But the schema types doesn't exist in the request", null);
                                }
                                uz uzVar = ssVarB.a;
                                Parcel parcelObtain = Parcel.obtain();
                                try {
                                    ax.a(uzVar, parcelObtain);
                                    byte[] bArrMarshall = parcelObtain.marshall();
                                    parcelObtain.recycle();
                                    int length = bArrMarshall.length;
                                    lxgVar.s(length);
                                    lxgVar.z(bArrMarshall, 0, length);
                                } catch (Throwable th) {
                                    parcelObtain.recycle();
                                    throw th;
                                }
                                try {
                                    txVar.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                    throw th;
                                }
                            }
                            if (lxgVar.a > 0) {
                                lxgVar.y();
                            }
                            txVar.g += tjVarK.a().size();
                            tj tjVarI = tvVar2.i(str5, tjVarK.a, null);
                            fileOutputStream.flush();
                            tjVarK = tjVarI;
                        }
                        fileOutputStream.close();
                        SystemClock.elapsedRealtime();
                        SystemClock.elapsedRealtime();
                        if (svVarM.a) {
                            z = true;
                            i = 0;
                        } else {
                            String str7 = ugVar.d;
                            ut utVar2 = new ut(str7);
                            azs.i(2, 0, 2, "schemaMigrationCallType");
                            tv tvVar3 = ugVar.a;
                            String str8 = ugVar.b;
                            ArrayList arrayList2 = new ArrayList(tnVar2.b());
                            i = 0;
                            z = true;
                            svVarM = tvVar3.m(str7, str8, arrayList2, arrayList, afvVar3, true, 1, utVar2);
                            if (!svVarM.a) {
                                throw new ts(2, svVarM.c, null);
                            }
                        }
                        SystemClock.elapsedRealtime();
                        aeg aegVar = new aeg(svVarM.b);
                        Set setKeySet3 = map.keySet();
                        azs.l(setKeySet3);
                        aegVar.b();
                        ((ArrayList) aegVar.b).addAll(setKeySet3);
                        ugVar.f = z;
                        SystemClock.elapsedRealtime();
                        File file2 = txVar.d;
                        azs.h(file2.exists(), "Internal temp file does not exist.");
                        if (txVar.g == 0) {
                            tpVarA = aegVar.a();
                        } else {
                            ?? fileInputStream = new FileInputStream(file2);
                            try {
                                lxd lxdVarD = lxd.d(fileInputStream);
                                fileInputStream = fileInputStream;
                                this = this;
                                while (!lxdVarD.a()) {
                                    byte[] bArrB = lxdVarD.b();
                                    Parcel parcelObtain2 = Parcel.obtain();
                                    try {
                                        parcelObtain2.unmarshall(bArrB, i, bArrB.length);
                                        parcelObtain2.setDataPosition(i);
                                        uz uzVar2 = (uz) uz.CREATOR.createFromParcel(parcelObtain2);
                                        parcelObtain2.recycle();
                                        ss ssVar = new ss(uzVar2);
                                        try {
                                            tv tvVar4 = txVar.a;
                                            String str9 = txVar.b;
                                            String str10 = txVar.c;
                                            SystemClock.elapsedRealtime();
                                            tvVar4.b.writeLock().lock();
                                            try {
                                                jElapsedRealtime = SystemClock.elapsedRealtime();
                                                try {
                                                    tvVar4.e();
                                                    String strD = ed.d(str9, str10);
                                                    if (tvVar4.l != null && (set = (Set) tvVar4.i.a.get(strD.concat(ssVar.h()))) != null) {
                                                        for (String str11 : set) {
                                                            ss[] ssVarArrM = ssVar.m(str11);
                                                            if (ssVarArrM != null && ssVarArrM.length > 0) {
                                                                int i4 = ru.a;
                                                                ss ssVar2 = new ss(ssVarArrM[i]);
                                                                String strG = ssVar2.g("accountName");
                                                                if (strG == null) {
                                                                    throw new ts(3, "The account name at " + i + " of " + str11 + " is missing.", null);
                                                                }
                                                                String strG2 = ssVar2.g("accountType");
                                                                if (strG2 != null) {
                                                                    new Account(strG, strG2);
                                                                    throw null;
                                                                }
                                                                throw new ts(3, "The account type at " + i + " of " + str11 + " is missing.", null);
                                                            }
                                                        }
                                                    }
                                                    SystemClock.elapsedRealtime();
                                                    lxq lxqVarV = uh.a(ssVar).v();
                                                    SystemClock.elapsedRealtime();
                                                    SystemClock.elapsedRealtime();
                                                    ed.j(lxqVarV, strD);
                                                    SystemClock.elapsedRealtime();
                                                    ltt lttVar = (ltt) lxqVarV.o();
                                                    String str12 = lttVar.uri_;
                                                    lttVar.l(null);
                                                    tvVar4.g(str9);
                                                    String str13 = lttVar.uri_;
                                                    boolean z4 = vo.a;
                                                    IcingSearchEngineImpl icingSearchEngineImpl = tvVar4.e.a;
                                                    byte[] bArrN = lttVar.n();
                                                    icingSearchEngineImpl.a();
                                                    byte[] bArrNativePut = IcingSearchEngineImpl.nativePut(icingSearchEngineImpl, bArrN);
                                                    int length2 = bArrN.length;
                                                    int i5 = ltk.a;
                                                    r29 = fileInputStream;
                                                    try {
                                                        lyo lyoVarC = ltk.c(bArrNativePut, lve.c(), new lti(4));
                                                        ((lxq) lyoVarC).s();
                                                        lve lveVar = (lve) ((lxq) lyoVarC).a;
                                                        lveVar.bitField0_ |= SemanticState.Focused;
                                                        lveVar.requestBytes_ = length2;
                                                        if (bArrNativePut != null) {
                                                            ((lxq) lyoVarC).s();
                                                            lve lveVar2 = (lve) ((lxq) lyoVarC).a;
                                                            lveVar2.bitField0_ |= SemanticState.Hidden;
                                                            lveVar2.responseBytes_ = bArrNativePut.length;
                                                        }
                                                        lve lveVar3 = (lve) ((lxq) lyoVarC).o();
                                                        tvVar4.f(tv.a);
                                                        lveVar3.b();
                                                        tv.d(lveVar3.b());
                                                        tvVar4.k.x(strD, lttVar.namespace_);
                                                        if (!lveVar3.wasReplacement_) {
                                                            tvVar4.j.k(str9);
                                                        }
                                                        long j = lveVar3.documentExpirationTimestampMs_;
                                                        try {
                                                            tvVar4.o(jElapsedRealtime, SystemClock.elapsedRealtime(), 6);
                                                            tvVar4.b.writeLock().unlock();
                                                        } catch (Throwable th3) {
                                                            th = th3;
                                                            try {
                                                                to toVar = new to(ssVar.f(), ssVar.e(), ssVar.h(), ry.a(th));
                                                                aegVar.b();
                                                                aegVar.d.add(toVar);
                                                            } catch (Throwable th4) {
                                                                th = th4;
                                                                Throwable th5 = th;
                                                                try {
                                                                    r29.close();
                                                                    throw th5;
                                                                } catch (Throwable th6) {
                                                                    th5.addSuppressed(th6);
                                                                    throw th5;
                                                                }
                                                            }
                                                        }
                                                        i = 0;
                                                        fileInputStream = r29;
                                                        r29 = r29;
                                                    } catch (Throwable th7) {
                                                        th = th7;
                                                        r29 = r29;
                                                        tvVar4.o(jElapsedRealtime, SystemClock.elapsedRealtime(), 6);
                                                        tvVar4.b.writeLock().unlock();
                                                        throw th;
                                                    }
                                                } catch (Throwable th8) {
                                                    th = th8;
                                                    r29 = fileInputStream;
                                                }
                                            } catch (Throwable th9) {
                                                th = th9;
                                                r29 = fileInputStream;
                                                jElapsedRealtime = 0;
                                            }
                                        } catch (Throwable th10) {
                                            th = th10;
                                            r29 = fileInputStream;
                                        }
                                    } catch (Throwable th11) {
                                        parcelObtain2.recycle();
                                        throw th11;
                                    }
                                }
                                ?? r210 = fileInputStream;
                                txVar.a.q(luv.FULL, txVar.f);
                                r210.close();
                                tpVarA = aegVar.a();
                            } catch (Throwable th12) {
                                th = th12;
                                r29 = fileInputStream;
                            }
                        }
                        SystemClock.elapsedRealtime();
                        SystemClock.elapsedRealtime();
                        ugVar.f();
                        SystemClock.elapsedRealtime();
                        SystemClock.elapsedRealtime();
                        txVar.close();
                        return tpVarA;
                    } catch (Throwable th13) {
                        try {
                            fileOutputStream.close();
                            throw th13;
                        } catch (Throwable th14) {
                            th13.addSuppressed(th14);
                            throw th13;
                        }
                    }
                } catch (Throwable th15) {
                    txVar.close();
                    throw th15;
                }
            }
        });
        h();
        return listenableFutureB;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    public final void f() {
        ua uaVar;
        ujb ujbVar = this.a.f;
        if (ujbVar.a) {
            synchronized (ujbVar.b) {
                ?? r1 = ujbVar.c;
                if (r1.isEmpty() || !ujbVar.a) {
                    return;
                }
                Iterator it = r1.values().iterator();
                loop0: while (true) {
                    if (!it.hasNext()) {
                        ujbVar.a = false;
                        return;
                    }
                    List list = (List) it.next();
                    for (int i = 0; i < list.size(); i++) {
                        uaVar = (ua) list.get(i);
                        Map map = uaVar.d;
                        Map map2 = uaVar.c;
                        if (!map.isEmpty() || !map2.isEmpty()) {
                            break loop0;
                        }
                    }
                }
                uaVar.d = new afv();
                uaVar.c = new afv();
                Executor executor = uaVar.b;
                throw null;
            }
        }
    }

    public final uc g(String str, tl tlVar) {
        azs.l(str);
        azs.h(!this.g, "AppSearchSession has already been closed");
        return new uc(this.a, this.h, this.d, str, tlVar, this.c);
    }

    public final void h() {
        this.h.execute(new mc(this, 11, null));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List] */
    public final ListenableFuture i(eol eolVar) {
        azs.h(!this.g, "AppSearchSession has already been closed");
        ?? r0 = eolVar.b;
        List listUnmodifiableList = DesugarCollections.unmodifiableList(eolVar.a);
        List listUnmodifiableList2 = DesugarCollections.unmodifiableList(r0);
        ListenableFuture listenableFutureB = b(new egz(this, listUnmodifiableList, listUnmodifiableList2, 1));
        j(listUnmodifiableList.size() + listUnmodifiableList2.size());
        return listenableFutureB;
    }
}
