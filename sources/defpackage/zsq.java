package defpackage;

import android.accounts.Account;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReadWriteLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zsq implements syk {
    private final /* synthetic */ int $cid;
    private final Object a;
    private final Object b;
    private final Object c;

    public zsq(aajt aajtVar, grj grjVar, aajv aajvVar, int i) {
        this.$cid = i;
        this.b = aajtVar;
        this.a = grjVar;
        this.c = aajvVar;
    }

    /* JADX WARN: Code duplicated, block: B:86:0x0263  */
    /* JADX WARN: Code duplicated, block: B:88:0x0267  */
    /* JADX WARN: Type inference failed for: r0v8, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, tqj] */
    /* JADX WARN: Type inference failed for: r11v21, types: [java.lang.Object, rmu] */
    /* JADX WARN: Type inference failed for: r11v25, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v31, types: [aajv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v18, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v21, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v5, types: [awmd, java.lang.Object] */
    @Override // defpackage.syk
    public final int a(Bundle bundle) {
        Throwable th;
        int i = this.$cid;
        char c = 2;
        if (i != 0) {
            if (i == 1) {
                taq.c();
                try {
                    Account[] accountArrD = ((omj) this.c).D();
                    rlx rlxVarU = ((aehs) this.a.io()).u();
                    rlxVarU.a(Arrays.asList(accountArrD));
                    ?? r11 = this.b;
                    List listL = r11.l(accountArrD);
                    if (r11.u() && (r11.e() instanceof rlt)) {
                        ArrayList arrayList = new ArrayList(listL);
                        Collection.EL.removeIf(arrayList, new jmy(((rlt) r11.e()).b, 14));
                        listL = arrayList;
                    }
                    rlxVarU.b(listL, false);
                    return 0;
                } catch (RemoteException | kmj | kmk unused) {
                }
            } else {
                if (i != 2) {
                    Object obj = this.a;
                    if (aajc.j(bundle, (grj) obj)) {
                        try {
                            final ug ugVar = (ug) ((aajt) this.b).b().get();
                            azs.h(!ugVar.g, "AppSearchSession has already been closed");
                            tq tqVar = (tq) ugVar.b(new Callable() { // from class: ue
                                /* JADX WARN: Code duplicated, block: B:53:0x0115  */
                                @Override // java.util.concurrent.Callable
                                public final Object call() throws Throwable {
                                    long j;
                                    tq tqVar2;
                                    int i2;
                                    long j2;
                                    SystemClock.elapsedRealtime();
                                    ug ugVar2 = ugVar;
                                    tv tvVar = ugVar2.a;
                                    ReadWriteLock readWriteLock = tvVar.b;
                                    readWriteLock.readLock().lock();
                                    String str = ugVar2.d;
                                    String str2 = ugVar2.b;
                                    try {
                                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                                        try {
                                            tvVar.e();
                                            String strD = ed.d(str, str2);
                                            readWriteLock.readLock().lock();
                                            try {
                                                tvVar.e();
                                                boolean z = vo.a;
                                                lwh lwhVarD = tvVar.e.d();
                                                lwhVarD.b();
                                                tv.d(lwhVarD.b());
                                                lwg lwgVarC = lwhVarD.c();
                                                tvVar.b.readLock().unlock();
                                                int i3 = 0;
                                                afx afxVar = new afx(0);
                                                lye lyeVar = lwgVarC.namespaceBlobStorageInfo_;
                                                for (int i4 = 0; i4 < lyeVar.size(); i4++) {
                                                    String str3 = ((luo) lyeVar.get(i4)).namespace_;
                                                    if (str3.startsWith(strD)) {
                                                        afxVar.add(str3);
                                                    }
                                                }
                                                if (lwgVarC.namespaceBlobStorageInfo_.size() != 0) {
                                                    lye lyeVar2 = lwgVarC.namespaceBlobStorageInfo_;
                                                    for (int i5 = 0; i5 < lyeVar2.size(); i5++) {
                                                        luo luoVar = (luo) lyeVar2.get(i5);
                                                        if (afxVar.contains(luoVar.namespace_)) {
                                                            lye lyeVar3 = luoVar.blobFileNames_;
                                                            for (int i6 = 0; i6 < lyeVar3.size(); i6++) {
                                                                String str4 = (String) lyeVar3.get(i6);
                                                                try {
                                                                    tvVar.b(str4).length();
                                                                } catch (IOException | ts e) {
                                                                    Log.e("AppSearchImpl", "Path traversal/resolution error for blob storage info file name: ".concat(String.valueOf(str4)), e);
                                                                }
                                                            }
                                                            lyeVar3.size();
                                                        }
                                                    }
                                                }
                                                Set setW = tvVar.k.w(strD);
                                                if (setW == null || setW.isEmpty()) {
                                                    tqVar2 = new tq(0L, 0, 0);
                                                } else {
                                                    if ((lwgVarC.bitField0_ & 2) != 0) {
                                                        long j3 = lwgVarC.totalStorageSize_;
                                                        ltv ltvVarB = lwgVarC.b();
                                                        int i7 = ltvVarB.numAliveDocuments_ + ltvVarB.numExpiredDocuments_;
                                                        if (j3 == 0 || i7 == 0) {
                                                            i2 = 0;
                                                            j2 = 0;
                                                        } else {
                                                            lye lyeVar4 = ltvVarB.namespaceStorageInfo_;
                                                            int i8 = 0;
                                                            int i9 = 0;
                                                            i2 = 0;
                                                            while (i3 < lyeVar4.size()) {
                                                                luq luqVar = (luq) lyeVar4.get(i3);
                                                                if (setW.contains(luqVar.namespace_)) {
                                                                    int i10 = luqVar.numAliveDocuments_;
                                                                    if (i10 > 0) {
                                                                        i8 += i10;
                                                                        i2++;
                                                                    }
                                                                    i9 += luqVar.numExpiredDocuments_;
                                                                }
                                                                i3++;
                                                            }
                                                            j2 = (long) ((((double) (i9 + i8)) / ((double) i7)) * j3);
                                                            i3 = i8;
                                                        }
                                                    } else {
                                                        i2 = 0;
                                                        j2 = 0;
                                                    }
                                                    tqVar2 = new tq(j2, i3, i2);
                                                }
                                                tvVar.j(jElapsedRealtime, SystemClock.elapsedRealtime(), 27);
                                                tvVar.b.readLock().unlock();
                                                return tqVar2;
                                            } catch (Throwable th2) {
                                                j = jElapsedRealtime;
                                                try {
                                                    tvVar.b.readLock().unlock();
                                                    throw th2;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    tvVar.j(j, SystemClock.elapsedRealtime(), 27);
                                                    tvVar.b.readLock().unlock();
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            j = jElapsedRealtime;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        j = 0;
                                    }
                                }
                            }).get();
                            if (tqVar.b > 0) {
                                tk tkVar = new tk();
                                tkVar.e(((grj) obj).y());
                                tkVar.d(2);
                                List list = (List) Collection.EL.stream(aakb.c(ugVar.g("", tkVar.a()))).map(new aaeq(18)).collect(Collectors.toList());
                                if (!list.isEmpty()) {
                                    this.c.e(tqVar, list);
                                    return 0;
                                }
                            }
                        } catch (InterruptedException | ExecutionException e) {
                            if (e instanceof InterruptedException) {
                                Thread.currentThread().interrupt();
                            }
                        }
                    }
                    return 1;
                }
                aalk aalkVar = (aalk) this.c.io();
                aoev aoevVar = aalkVar.c.b().i;
                if (aoevVar == null) {
                    aoevVar = aoev.a;
                }
                aogn aognVar = aoevVar.d;
                if (aognVar == null) {
                    aognVar = aogn.a;
                }
                long millis = Duration.ofSeconds(Math.max(21600L, aognVar.c)).toMillis();
                mbc mbcVar = aalkVar.g;
                if (mbcVar.f().toEpochMilli() - aalkVar.h < millis) {
                    c = 1;
                } else {
                    aaqn aaqnVarB = ((aanb) aalkVar.f.io()).b();
                    if (!"NO_OP_STORE_TAG".equals(aaqnVarB.s())) {
                        boolean z = (aaqnVarB.l().h().isEmpty() && aaqnVarB.i().e().isEmpty()) ? false : true;
                        String strX = tym.x("offline_client_state_should_log_%s", aaqnVarB.s());
                        if (z) {
                            aalkVar.b.edit().putBoolean(strX, true).apply();
                        } else {
                            SharedPreferences sharedPreferences = aalkVar.b;
                            if (sharedPreferences.getBoolean(strX, false)) {
                                sharedPreferences.edit().putBoolean(strX, false).apply();
                            }
                        }
                        aoec aoecVarA = aalkVar.d.a();
                        if (aoecVarA == null) {
                            ((agrc) ((agrc) aalk.a.b()).k("com/google/android/libraries/youtube/offline/logging/OfflineClientStateLogger", "doLogOfflineClientState", 142, "OfflineClientStateLogger.java")).t("[Offline] Offline client state log error due to null offline client state result");
                        } else if (true == ((aalv) aalkVar.e.io()).e(aoecVarA)) {
                            c = 1;
                        }
                        c = 3;
                    }
                    if (c == 1) {
                        aalkVar.h = mbcVar.f().toEpochMilli();
                    }
                }
                if (c == 1 || (((aauk) this.b.io()).b.m(22, 45370062L) && c == 3)) {
                    ((aalt) this.a.io()).a();
                    return 0;
                }
            }
        } else if (((ztn) this.c.io()).a()) {
            zsu zsuVar = (zsu) this.a.io();
            zsuVar.m();
            ?? r12 = this.b;
            int i2 = tqr.a;
            if (r12.t(2L)) {
                int i3 = zsuVar.f;
                ztp ztpVar = new ztp(4);
                szn sznVar = zsuVar.d;
                sznVar.c(ztpVar, sznVar.b.b());
                if (zsuVar.o) {
                    avlb avlbVarP = ztpVar.e.p();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    timeUnit.getClass();
                    avoy avoyVar = new avoy();
                    avlbVarP.kp(avoyVar);
                    if (avoyVar.getCount() != 0) {
                        try {
                            boolean z2 = atqp.x;
                            if (avoyVar.await(120000L, timeUnit)) {
                                th = avoyVar.b;
                                if (th != null) {
                                    throw awkh.b(th);
                                }
                            } else {
                                avoyVar.e();
                            }
                        } catch (InterruptedException e2) {
                            avoyVar.e();
                            throw awkh.b(e2);
                        }
                    } else {
                        th = avoyVar.b;
                        if (th != null) {
                            throw awkh.b(th);
                        }
                    }
                }
            } else if (zsuVar.n) {
                szn sznVar2 = zsuVar.d;
                sznVar2.c(new ztp(3), sznVar2.b.b());
            } else if ((zsuVar.f & 2) != 0) {
                long jA = zsuVar.c.a();
                zsuVar.k = Long.MAX_VALUE;
                zsuVar.e = ((long) zsuVar.l.R) + jA;
                zsuVar.r(0, jA);
            }
        }
        return 0;
    }

    public zsq(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, int i) {
        this.$cid = i;
        this.c = awmdVar;
        this.a = awmdVar2;
        this.b = awmdVar3;
    }

    public zsq(awmd awmdVar, tqj tqjVar, awmd awmdVar2, int i) {
        this.$cid = i;
        this.a = awmdVar;
        this.b = tqjVar;
        this.c = awmdVar2;
    }

    public zsq(rmu rmuVar, omj omjVar, aunn aunnVar, int i) {
        this.$cid = i;
        this.b = rmuVar;
        this.c = omjVar;
        this.a = aunnVar;
    }
}
