package defpackage;

import android.accounts.Account;
import android.content.Intent;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.stream.Collector;
import j$.util.stream.Stream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class rlu implements Runnable {
    final /* synthetic */ rlt a;
    final /* synthetic */ WeakReference b;
    final /* synthetic */ rlw c;

    public rlu(rlw rlwVar, rlt rltVar, WeakReference weakReference) {
        this.a = rltVar;
        this.b = weakReference;
        this.c = rlwVar;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0253 A[Catch: InterruptedException | ExecutionException -> 0x032b, ExecutionException -> 0x032d, TRY_LEAVE, TryCatch #16 {InterruptedException | ExecutionException -> 0x032b, blocks: (B:81:0x0200, B:83:0x020a, B:96:0x0244, B:98:0x024d, B:100:0x0253, B:112:0x0282, B:113:0x028a, B:115:0x0290, B:92:0x0232), top: B:203:0x0200 }] */
    /* JADX WARN: Code duplicated, block: B:103:0x025d A[Catch: InterruptedException | ExecutionException -> 0x0274, ExecutionException -> 0x0276, TryCatch #15 {InterruptedException | ExecutionException -> 0x0274, blocks: (B:101:0x0257, B:103:0x025d, B:104:0x0261, B:106:0x026c), top: B:205:0x0257 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x026c A[Catch: InterruptedException | ExecutionException -> 0x0274, ExecutionException -> 0x0276, TRY_LEAVE, TryCatch #15 {InterruptedException | ExecutionException -> 0x0274, blocks: (B:101:0x0257, B:103:0x025d, B:104:0x0261, B:106:0x026c), top: B:205:0x0257 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x0290 A[Catch: InterruptedException | ExecutionException -> 0x032b, ExecutionException -> 0x032d, TRY_LEAVE, TryCatch #16 {InterruptedException | ExecutionException -> 0x032b, blocks: (B:81:0x0200, B:83:0x020a, B:96:0x0244, B:98:0x024d, B:100:0x0253, B:112:0x0282, B:113:0x028a, B:115:0x0290, B:92:0x0232), top: B:203:0x0200 }] */
    /* JADX WARN: Code duplicated, block: B:120:0x02ac A[Catch: InterruptedException -> 0x0327, ExecutionException -> 0x0329, TryCatch #20 {InterruptedException -> 0x0327, ExecutionException -> 0x0329, blocks: (B:117:0x029a, B:118:0x02a2, B:120:0x02ac, B:122:0x02b6), top: B:195:0x029a }] */
    /* JADX WARN: Code duplicated, block: B:142:0x0316 A[Catch: InterruptedException -> 0x0323, ExecutionException -> 0x0325, TRY_LEAVE, TryCatch #23 {InterruptedException -> 0x0323, ExecutionException -> 0x0325, blocks: (B:129:0x02f3, B:142:0x0316), top: B:191:0x02f3 }] */
    /* JADX WARN: Code duplicated, block: B:162:0x035c  */
    /* JADX WARN: Code duplicated, block: B:164:0x0363  */
    /* JADX WARN: Code duplicated, block: B:165:0x0369  */
    /* JADX WARN: Code duplicated, block: B:167:0x0374  */
    /* JADX WARN: Code duplicated, block: B:172:0x039e  */
    /* JADX WARN: Code duplicated, block: B:175:0x03b0 A[LOOP:4: B:173:0x03aa->B:175:0x03b0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:178:0x0406  */
    /* JADX WARN: Code duplicated, block: B:180:0x0416  */
    /* JADX WARN: Code duplicated, block: B:188:0x042e  */
    /* JADX WARN: Code duplicated, block: B:197:0x0210 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x0425 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:45:0x0149  */
    /* JADX WARN: Code duplicated, block: B:47:0x014d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0156  */
    /* JADX WARN: Code duplicated, block: B:58:0x017b  */
    /* JADX WARN: Code duplicated, block: B:61:0x0186  */
    /* JADX WARN: Code duplicated, block: B:64:0x0197  */
    /* JADX WARN: Code duplicated, block: B:68:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:70:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:74:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:75:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:80:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:83:0x020a A[Catch: InterruptedException | ExecutionException -> 0x032b, ExecutionException -> 0x032d, TRY_LEAVE, TryCatch #16 {InterruptedException | ExecutionException -> 0x032b, blocks: (B:81:0x0200, B:83:0x020a, B:96:0x0244, B:98:0x024d, B:100:0x0253, B:112:0x0282, B:113:0x028a, B:115:0x0290, B:92:0x0232), top: B:203:0x0200 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0232 A[Catch: InterruptedException | ExecutionException -> 0x032b, ExecutionException -> 0x032d, TRY_ENTER, TryCatch #16 {InterruptedException | ExecutionException -> 0x032b, blocks: (B:81:0x0200, B:83:0x020a, B:96:0x0244, B:98:0x024d, B:100:0x0253, B:112:0x0282, B:113:0x028a, B:115:0x0290, B:92:0x0232), top: B:203:0x0200 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x0238  */
    /* JADX WARN: Code duplicated, block: B:98:0x024d A[Catch: InterruptedException | ExecutionException -> 0x032b, ExecutionException -> 0x032d, TryCatch #16 {InterruptedException | ExecutionException -> 0x032b, blocks: (B:81:0x0200, B:83:0x020a, B:96:0x0244, B:98:0x024d, B:100:0x0253, B:112:0x0282, B:113:0x028a, B:115:0x0290, B:92:0x0232), top: B:203:0x0200 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [agke] */
    /* JADX WARN: Type inference failed for: r12v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v2, types: [android.content.Intent] */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v15 */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        char c;
        Throwable th;
        WeakReference weakReference;
        rlt rltVar;
        int length;
        int i;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        LinkedHashMap linkedHashMap;
        int size;
        int i2;
        airo airoVarA;
        boolean z;
        akrq akrqVarB;
        ArrayList arrayList4;
        Iterator it;
        agke agkeVar;
        ArrayList arrayList5;
        int size2;
        int i3;
        rlt rltVar2;
        boolean z2;
        rlv rlvVar;
        ArrayList arrayList6;
        rlv rlvVar2;
        WeakReference weakReference2;
        byte[] bArr;
        akrq akrqVar;
        ?? r13;
        Throwable cause;
        String str;
        wns wnsVarB;
        Intent intent;
        wnr wnrVar;
        ovo ovoVar;
        wnt wntVarH;
        Iterator it2;
        Account account;
        zyz zyzVar;
        ?? r9;
        rlt rltVarB;
        zwk zwkVarA;
        zwb zwbVar;
        zwa zwaVarE;
        int i4;
        rpa rpaVar;
        agke agkeVarP;
        ArrayList arrayList7;
        int i5;
        int i6;
        ?? r7;
        String str2;
        rlw rlwVar = this.c;
        Account[] accountArrE = rlwVar.c.e();
        ArrayList arrayList8 = new ArrayList();
        int i7 = 2;
        char c2 = 1;
        boolean z3 = false;
        try {
            aijp aijpVar = aikz.a;
            try {
                accountArrE = (Account[]) DesugarArrays.stream(accountArrE).sorted(new pke(rlwVar, aiky.INSTANCE, i7)).toArray(new hhv(9));
                c = 1;
            } catch (agfy e) {
                Class[] clsArr = {ExecutionException.class, InterruptedException.class};
                int i8 = 0;
                while (i8 < 2) {
                    Class cls = clsArr[i8];
                    c = c2;
                    try {
                        ahno.M((RuntimeException.class.isAssignableFrom(cls) ? 1 : 0) ^ c2, "The cause of a TunnelException can never be a RuntimeException, but %s argument was %s", "rethrow", cls);
                        i8++;
                        c2 = c;
                    } catch (InterruptedException e2) {
                        e = e2;
                        th = e;
                        ((agrc) ((agrc) ((agrc) rlw.a.b()).j(th)).k("com/google/android/libraries/youtube/account/identity/AccountServiceRequestAggregator", "getSectionListInternal", (char) 237, "AccountServiceRequestAggregator.java")).t("Error while sorting accounts");
                        weakReference = this.b;
                        rltVar = this.a;
                        if (!rlwVar.i.i()) {
                            rpaVar = rlwVar.j;
                            agkeVarP = agke.p(accountArrE);
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = new ArrayList();
                            arrayList7 = new ArrayList();
                            i5 = ((agpi) agkeVarP).d;
                            i6 = 0;
                            while (i6 < i5) {
                                Account account2 = (Account) agkeVarP.get(i6);
                                if (rltVar == null) {
                                    r7 = z3;
                                } else {
                                    r7 = z3;
                                }
                                String str3 = account2.name;
                                if (rltVar != null) {
                                    str2 = rltVar.g;
                                } else {
                                    str2 = "";
                                }
                                afxd afxdVarF = afxd.f(rpaVar.h.o(str3));
                                qmu qmuVar = new qmu(rpaVar, 13);
                                Executor executor = rpaVar.c;
                                arrayList7.add(afxdVarF.h(qmuVar, executor).b(afig.class, new rns(rpaVar, 3), executor).h(new rox(rpaVar, str3, (boolean) r7, str2, 0), executor));
                                i6++;
                                agkeVarP = agkeVarP;
                                z3 = false;
                            }
                            taf.g(ahno.aw(arrayList7).k(new hlm(agkeVarP, arrayList7, arrayList9, arrayList10, 12), rpaVar.c), new itt(rlwVar, weakReference, 6));
                            return;
                        }
                        length = accountArrE.length;
                        i = 0;
                        while (i < length) {
                            account = accountArrE[i];
                            zyzVar = new zyz();
                            if (rltVar != null) {
                                r9 = 0;
                            } else {
                                r9 = 0;
                            }
                            rltVarB = rlt.b(account.name);
                            if (c == r9) {
                                rltVarB = rltVar;
                            }
                            zwkVarA = rlwVar.d.a(rltVarB).a(rltVarB);
                            if (zwkVarA.f()) {
                                zwbVar = rlwVar.e;
                                if (zwbVar.e() == null) {
                                    zwaVarE = zvz.a;
                                } else {
                                    zwaVarE = zwbVar.e();
                                }
                                zwa zwaVar = zwaVarE;
                                wnw wnwVar = rlwVar.b;
                                String str4 = account.name;
                                if (r9 != 0) {
                                    i4 = 3;
                                } else {
                                    i4 = 5;
                                }
                                rlt rltVar3 = rltVarB;
                                wnwVar.a(zwaVar, rltVar3, zyzVar, str4, i4);
                                arrayList8.add(new rlv(account, r9, rltVar3, zyzVar));
                            } else {
                                zwbVar = rlwVar.e;
                                if (zwbVar.e() == null) {
                                    zwaVarE = zvz.a;
                                } else {
                                    zwaVarE = zwbVar.e();
                                }
                                zwa zwaVar2 = zwaVarE;
                                wnw wnwVar2 = rlwVar.b;
                                String str5 = account.name;
                                if (r9 != 0) {
                                    i4 = 3;
                                } else {
                                    i4 = 5;
                                }
                                rlt rltVar4 = rltVarB;
                                wnwVar2.a(zwaVar2, rltVar4, zyzVar, str5, i4);
                                arrayList8.add(new rlv(account, r9, rltVar4, zyzVar));
                            }
                            i++;
                            c = 1;
                        }
                        arrayList = new ArrayList();
                        arrayList2 = new ArrayList();
                        arrayList3 = new ArrayList();
                        linkedHashMap = new LinkedHashMap();
                        size = arrayList8.size();
                        i2 = 0;
                        airoVarA = null;
                        z = false;
                        akrqVarB = null;
                        while (i2 < size) {
                            z2 = z;
                            rlvVar = (rlv) arrayList8.get(i2);
                            try {
                                ovoVar = (ovo) rlvVar.d.get();
                                if (z2) {
                                    if (!rlw.b(ovoVar)) {
                                        arrayList6 = arrayList8;
                                        size = size;
                                        weakReference2 = weakReference;
                                    }
                                    z = z2;
                                    i2++;
                                    weakReference = weakReference2;
                                    arrayList8 = arrayList6;
                                    size = size;
                                } else {
                                    if (rlw.b(ovoVar)) {
                                        try {
                                            arrayList.clear();
                                            arrayList2.clear();
                                            linkedHashMap.clear();
                                            arrayList3.clear();
                                            z2 = true;
                                        } catch (InterruptedException | ExecutionException e3) {
                                            e = e3;
                                            arrayList6 = arrayList8;
                                            size = size;
                                            rlvVar2 = rlvVar;
                                            akrqVar = akrqVarB;
                                            weakReference2 = weakReference;
                                            bArr = null;
                                            z2 = true;
                                            Exception exc = e;
                                            airo airoVar = airoVarA;
                                            r13 = bArr;
                                            ((agrc) ((agrc) ((agrc) rlw.a.b()).j(exc)).k("com/google/android/libraries/youtube/account/identity/AccountServiceRequestAggregator", "getSectionListInternal", (char) 350, "AccountServiceRequestAggregator.java")).t("Error while fetching account list response");
                                            cause = exc.getCause();
                                            str = rlvVar2.a.name;
                                            if (cause instanceof tmg) {
                                                intent = ((tmg) cause).a;
                                                if (intent == null) {
                                                    wnrVar = new wnr(r13, cause);
                                                } else {
                                                    wnrVar = new wnr(intent, cause);
                                                }
                                                wnsVarB = wns.b(str, wnrVar);
                                            } else {
                                                wnsVarB = wns.b(str, new wnr(r13, cause));
                                            }
                                            arrayList2.add(wnsVarB);
                                            airoVarA = airoVar;
                                            akrqVarB = akrqVar;
                                            z = z2;
                                            i2++;
                                            weakReference = weakReference2;
                                            arrayList8 = arrayList6;
                                            size = size;
                                        }
                                    }
                                    z = z2;
                                    i2++;
                                    weakReference = weakReference2;
                                    arrayList8 = arrayList6;
                                    size = size;
                                }
                                arrayList.add(ovoVar);
                                wntVarH = ovoVar.h();
                                if (wntVarH != null) {
                                    if (wntVarH.a() != null) {
                                        airoVarA = wntVarH.a();
                                        try {
                                            if (wntVarH.b() != null) {
                                                akrqVarB = wntVarH.b();
                                            }
                                        } catch (InterruptedException | ExecutionException e4) {
                                            e = e4;
                                            arrayList6 = arrayList8;
                                            size = size;
                                            rlvVar2 = rlvVar;
                                            akrqVar = akrqVarB;
                                            weakReference2 = weakReference;
                                            bArr = null;
                                            Exception exc2 = e;
                                            airo airoVar2 = airoVarA;
                                            r13 = bArr;
                                            ((agrc) ((agrc) ((agrc) rlw.a.b()).j(exc2)).k("com/google/android/libraries/youtube/account/identity/AccountServiceRequestAggregator", "getSectionListInternal", (char) 350, "AccountServiceRequestAggregator.java")).t("Error while fetching account list response");
                                            cause = exc2.getCause();
                                            str = rlvVar2.a.name;
                                            if (cause instanceof tmg) {
                                                intent = ((tmg) cause).a;
                                                if (intent == null) {
                                                    wnrVar = new wnr(r13, cause);
                                                } else {
                                                    wnrVar = new wnr(intent, cause);
                                                }
                                                wnsVarB = wns.b(str, wnrVar);
                                            } else {
                                                wnsVarB = wns.b(str, new wnr(r13, cause));
                                            }
                                            arrayList2.add(wnsVarB);
                                            airoVarA = airoVar2;
                                            akrqVarB = akrqVar;
                                        }
                                    }
                                    arrayList2.addAll(wntVarH.c());
                                    if (rlvVar.b) {
                                        arrayList3.addAll(wntVarH.d());
                                    }
                                }
                                it2 = ovoVar.j().iterator();
                                while (it2.hasNext()) {
                                    arrayList6 = arrayList8;
                                    try {
                                        linkedHashMap.put((String) it2.next(), rlvVar.c);
                                        arrayList8 = arrayList6;
                                    } catch (InterruptedException e5) {
                                        e = e5;
                                        rlvVar2 = rlvVar;
                                        weakReference2 = weakReference;
                                        bArr = null;
                                        akrqVar = akrqVarB;
                                        Exception exc3 = e;
                                        airo airoVar3 = airoVarA;
                                        r13 = bArr;
                                        ((agrc) ((agrc) ((agrc) rlw.a.b()).j(exc3)).k("com/google/android/libraries/youtube/account/identity/AccountServiceRequestAggregator", "getSectionListInternal", (char) 350, "AccountServiceRequestAggregator.java")).t("Error while fetching account list response");
                                        cause = exc3.getCause();
                                        str = rlvVar2.a.name;
                                        if (cause instanceof tmg) {
                                            intent = ((tmg) cause).a;
                                            if (intent == null) {
                                                wnrVar = new wnr(r13, cause);
                                            } else {
                                                wnrVar = new wnr(intent, cause);
                                            }
                                            wnsVarB = wns.b(str, wnrVar);
                                        } else {
                                            wnsVarB = wns.b(str, new wnr(r13, cause));
                                        }
                                        arrayList2.add(wnsVarB);
                                        airoVarA = airoVar3;
                                        akrqVarB = akrqVar;
                                        z = z2;
                                        i2++;
                                        weakReference = weakReference2;
                                        arrayList8 = arrayList6;
                                        size = size;
                                    } catch (ExecutionException e6) {
                                        e = e6;
                                        rlvVar2 = rlvVar;
                                        weakReference2 = weakReference;
                                        bArr = null;
                                        akrqVar = akrqVarB;
                                        Exception exc4 = e;
                                        airo airoVar4 = airoVarA;
                                        r13 = bArr;
                                        ((agrc) ((agrc) ((agrc) rlw.a.b()).j(exc4)).k("com/google/android/libraries/youtube/account/identity/AccountServiceRequestAggregator", "getSectionListInternal", (char) 350, "AccountServiceRequestAggregator.java")).t("Error while fetching account list response");
                                        cause = exc4.getCause();
                                        str = rlvVar2.a.name;
                                        if (cause instanceof tmg) {
                                            intent = ((tmg) cause).a;
                                            if (intent == null) {
                                                wnrVar = new wnr(r13, cause);
                                            } else {
                                                wnrVar = new wnr(intent, cause);
                                            }
                                            wnsVarB = wns.b(str, wnrVar);
                                        } else {
                                            wnsVarB = wns.b(str, new wnr(r13, cause));
                                        }
                                        arrayList2.add(wnsVarB);
                                        airoVarA = airoVar4;
                                        akrqVarB = akrqVar;
                                        z = z2;
                                        i2++;
                                        weakReference = weakReference2;
                                        arrayList8 = arrayList6;
                                        size = size;
                                    }
                                }
                                arrayList6 = arrayList8;
                                rpa rpaVar2 = rlwVar.j;
                                String str6 = rlvVar.a.name;
                                if (ovoVar != null) {
                                    size = size;
                                    weakReference2 = weakReference;
                                    ListenableFuture listenableFuture = aher.a;
                                } else {
                                    size = size;
                                    weakReference2 = weakReference;
                                    ListenableFuture listenableFuture2 = aher.a;
                                }
                            } catch (InterruptedException | ExecutionException e7) {
                                e = e7;
                                arrayList6 = arrayList8;
                            }
                            z = z2;
                            i2++;
                            weakReference = weakReference2;
                            arrayList8 = arrayList6;
                            size = size;
                        }
                        WeakReference weakReference3 = weakReference;
                        if (rlwVar.k.m(32, 45661975L)) {
                            taq.c();
                            arrayList4 = new ArrayList();
                            it = arrayList.iterator();
                            while (it.hasNext()) {
                                arrayList4.addAll(((ovo) it.next()).i());
                            }
                            Stream map = Collection.EL.stream(arrayList4).filter(new rej(7)).map(new ris(9));
                            Collector collector = aghu.a;
                            ?? r0 = (agke) map.collect(collector);
                            agkeVar = (agke) Collection.EL.stream(rlwVar.f.w()).map(new ris(10)).collect(collector);
                            arrayList5 = new ArrayList();
                            size2 = agkeVar.size();
                            for (i3 = 0; i3 < size2; i3++) {
                                String str7 = (String) agkeVar.get(i3);
                                rltVar2 = (rlt) rlwVar.g.y(str7);
                                if (rltVar2 == null) {
                                }
                            }
                            if (!arrayList5.isEmpty()) {
                                ((aehs) rlwVar.h.io()).u().b(arrayList5, true);
                            }
                        }
                        rlwVar.c(weakReference3, new xsc(arrayList, new wnt(arrayList2, arrayList3, airoVarA, akrqVarB), linkedHashMap, (boolean[]) null));
                    } catch (ExecutionException e8) {
                        e = e8;
                        th = e;
                        ((agrc) ((agrc) ((agrc) rlw.a.b()).j(th)).k("com/google/android/libraries/youtube/account/identity/AccountServiceRequestAggregator", "getSectionListInternal", (char) 237, "AccountServiceRequestAggregator.java")).t("Error while sorting accounts");
                        weakReference = this.b;
                        rltVar = this.a;
                        if (!rlwVar.i.i()) {
                            rpaVar = rlwVar.j;
                            agkeVarP = agke.p(accountArrE);
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = new ArrayList();
                            arrayList7 = new ArrayList();
                            i5 = ((agpi) agkeVarP).d;
                            i6 = 0;
                            while (i6 < i5) {
                                Account account3 = (Account) agkeVarP.get(i6);
                                if (rltVar == null) {
                                    r7 = z3;
                                } else {
                                    r7 = z3;
                                }
                                String str8 = account3.name;
                                if (rltVar != null) {
                                    str2 = rltVar.g;
                                } else {
                                    str2 = "";
                                }
                                afxd afxdVarF2 = afxd.f(rpaVar.h.o(str8));
                                qmu qmuVar2 = new qmu(rpaVar, 13);
                                Executor executor2 = rpaVar.c;
                                arrayList7.add(afxdVarF2.h(qmuVar2, executor2).b(afig.class, new rns(rpaVar, 3), executor2).h(new rox(rpaVar, str8, (boolean) r7, str2, 0), executor2));
                                i6++;
                                agkeVarP = agkeVarP;
                                z3 = false;
                            }
                            taf.g(ahno.aw(arrayList7).k(new hlm(agkeVarP, arrayList7, arrayList11, arrayList12, 12), rpaVar.c), new itt(rlwVar, weakReference, 6));
                            return;
                        }
                        length = accountArrE.length;
                        i = 0;
                        while (i < length) {
                            account = accountArrE[i];
                            zyzVar = new zyz();
                            if (rltVar != null) {
                                r9 = 0;
                            } else {
                                r9 = 0;
                            }
                            rltVarB = rlt.b(account.name);
                            if (c == r9) {
                                rltVarB = rltVar;
                            }
                            zwkVarA = rlwVar.d.a(rltVarB).a(rltVarB);
                            if (zwkVarA.f()) {
                                zwbVar = rlwVar.e;
                                if (zwbVar.e() == null) {
                                    zwaVarE = zvz.a;
                                } else {
                                    zwaVarE = zwbVar.e();
                                }
                                zwa zwaVar3 = zwaVarE;
                                wnw wnwVar3 = rlwVar.b;
                                String str9 = account.name;
                                if (r9 != 0) {
                                    i4 = 3;
                                } else {
                                    i4 = 5;
                                }
                                rlt rltVar5 = rltVarB;
                                wnwVar3.a(zwaVar3, rltVar5, zyzVar, str9, i4);
                                arrayList8.add(new rlv(account, r9, rltVar5, zyzVar));
                            } else {
                                zwbVar = rlwVar.e;
                                if (zwbVar.e() == null) {
                                    zwaVarE = zvz.a;
                                } else {
                                    zwaVarE = zwbVar.e();
                                }
                                zwa zwaVar4 = zwaVarE;
                                wnw wnwVar4 = rlwVar.b;
                                String str10 = account.name;
                                if (r9 != 0) {
                                    i4 = 3;
                                } else {
                                    i4 = 5;
                                }
                                rlt rltVar6 = rltVarB;
                                wnwVar4.a(zwaVar4, rltVar6, zyzVar, str10, i4);
                                arrayList8.add(new rlv(account, r9, rltVar6, zyzVar));
                            }
                            i++;
                            c = 1;
                        }
                        arrayList = new ArrayList();
                        arrayList2 = new ArrayList();
                        arrayList3 = new ArrayList();
                        linkedHashMap = new LinkedHashMap();
                        size = arrayList8.size();
                        i2 = 0;
                        airoVarA = null;
                        z = false;
                        akrqVarB = null;
                        while (i2 < size) {
                            z2 = z;
                            rlvVar = (rlv) arrayList8.get(i2);
                            ovoVar = (ovo) rlvVar.d.get();
                            if (z2) {
                                if (rlw.b(ovoVar)) {
                                    arrayList.clear();
                                    arrayList2.clear();
                                    linkedHashMap.clear();
                                    arrayList3.clear();
                                    z2 = true;
                                }
                                z = z2;
                                i2++;
                                weakReference = weakReference2;
                                arrayList8 = arrayList6;
                                size = size;
                            } else {
                                if (!rlw.b(ovoVar)) {
                                    arrayList6 = arrayList8;
                                    size = size;
                                    weakReference2 = weakReference;
                                }
                                z = z2;
                                i2++;
                                weakReference = weakReference2;
                                arrayList8 = arrayList6;
                                size = size;
                            }
                            arrayList.add(ovoVar);
                            wntVarH = ovoVar.h();
                            if (wntVarH != null) {
                                if (wntVarH.a() != null) {
                                    airoVarA = wntVarH.a();
                                    if (wntVarH.b() != null) {
                                        akrqVarB = wntVarH.b();
                                    }
                                }
                                arrayList2.addAll(wntVarH.c());
                                if (rlvVar.b) {
                                    arrayList3.addAll(wntVarH.d());
                                }
                            }
                            it2 = ovoVar.j().iterator();
                            while (it2.hasNext()) {
                                arrayList6 = arrayList8;
                                linkedHashMap.put((String) it2.next(), rlvVar.c);
                                arrayList8 = arrayList6;
                            }
                            arrayList6 = arrayList8;
                            rpa rpaVar3 = rlwVar.j;
                            String str11 = rlvVar.a.name;
                            if (ovoVar != null) {
                                size = size;
                                weakReference2 = weakReference;
                                ListenableFuture listenableFuture3 = aher.a;
                            } else {
                                size = size;
                                weakReference2 = weakReference;
                                ListenableFuture listenableFuture4 = aher.a;
                            }
                            z = z2;
                            i2++;
                            weakReference = weakReference2;
                            arrayList8 = arrayList6;
                            size = size;
                        }
                        WeakReference weakReference4 = weakReference;
                        if (rlwVar.k.m(32, 45661975L)) {
                            taq.c();
                            arrayList4 = new ArrayList();
                            it = arrayList.iterator();
                            while (it.hasNext()) {
                                arrayList4.addAll(((ovo) it.next()).i());
                            }
                            Stream map2 = Collection.EL.stream(arrayList4).filter(new rej(7)).map(new ris(9));
                            Collector collector2 = aghu.a;
                            ?? r1 = (agke) map2.collect(collector2);
                            agkeVar = (agke) Collection.EL.stream(rlwVar.f.w()).map(new ris(10)).collect(collector2);
                            arrayList5 = new ArrayList();
                            size2 = agkeVar.size();
                            while (i3 < size2) {
                                String str12 = (String) agkeVar.get(i3);
                                rltVar2 = (rlt) rlwVar.g.y(str12);
                                if (rltVar2 == null) {
                                }
                            }
                            if (!arrayList5.isEmpty()) {
                                ((aehs) rlwVar.h.io()).u().b(arrayList5, true);
                            }
                        }
                        rlwVar.c(weakReference4, new xsc(arrayList, new wnt(arrayList2, arrayList3, airoVarA, akrqVarB), linkedHashMap, (boolean[]) null));
                    }
                }
                c = c2;
                agfv.c(e.getCause(), ExecutionException.class);
                agfv.c(e.getCause(), InterruptedException.class);
                Exception cause2 = e.getCause();
                Object[] objArr = new Object[2];
                objArr[0] = ExecutionException.class;
                objArr[c] = InterruptedException.class;
                ClassCastException classCastException = new ClassCastException(String.format("rethrow(%s, %s) doesn't match underlying exception", objArr));
                classCastException.initCause(cause2);
                throw classCastException;
            } catch (InterruptedException e9) {
                e = e9;
                th = e;
                c = 1;
                ((agrc) ((agrc) ((agrc) rlw.a.b()).j(th)).k("com/google/android/libraries/youtube/account/identity/AccountServiceRequestAggregator", "getSectionListInternal", (char) 237, "AccountServiceRequestAggregator.java")).t("Error while sorting accounts");
            } catch (ExecutionException e10) {
                e = e10;
                th = e;
                c = 1;
                ((agrc) ((agrc) ((agrc) rlw.a.b()).j(th)).k("com/google/android/libraries/youtube/account/identity/AccountServiceRequestAggregator", "getSectionListInternal", (char) 237, "AccountServiceRequestAggregator.java")).t("Error while sorting accounts");
            }
        } catch (InterruptedException | ExecutionException e11) {
            e = e11;
            c = 1;
        }
        weakReference = this.b;
        rltVar = this.a;
        if (!rlwVar.i.i()) {
            rpaVar = rlwVar.j;
            agkeVarP = agke.p(accountArrE);
            ArrayList arrayList13 = new ArrayList();
            ArrayList arrayList14 = new ArrayList();
            arrayList7 = new ArrayList();
            i5 = ((agpi) agkeVarP).d;
            i6 = 0;
            while (i6 < i5) {
                Account account4 = (Account) agkeVarP.get(i6);
                if (rltVar == null && rltVar.b.equals(account4.name)) {
                    r7 = c;
                } else {
                    r7 = z3;
                }
                String str13 = account4.name;
                if (rltVar != null) {
                    str2 = rltVar.g;
                } else {
                    str2 = "";
                }
                afxd afxdVarF3 = afxd.f(rpaVar.h.o(str13));
                qmu qmuVar3 = new qmu(rpaVar, 13);
                Executor executor3 = rpaVar.c;
                arrayList7.add(afxdVarF3.h(qmuVar3, executor3).b(afig.class, new rns(rpaVar, 3), executor3).h(new rox(rpaVar, str13, (boolean) r7, str2, 0), executor3));
                i6++;
                agkeVarP = agkeVarP;
                z3 = false;
            }
            taf.g(ahno.aw(arrayList7).k(new hlm(agkeVarP, arrayList7, arrayList13, arrayList14, 12), rpaVar.c), new itt(rlwVar, weakReference, 6));
            return;
        }
        length = accountArrE.length;
        i = 0;
        while (i < length) {
            account = accountArrE[i];
            zyzVar = new zyz();
            if (rltVar != null || !rltVar.b.equals(account.name) || rmp.f(rltVar) || (rlwVar.k.l(81, 45835405L, false) && rltVar.f)) {
                r9 = 0;
            } else {
                r9 = c;
            }
            rltVarB = rlt.b(account.name);
            if (c == r9) {
                rltVarB = rltVar;
            }
            zwkVarA = rlwVar.d.a(rltVarB).a(rltVarB);
            if (zwkVarA.f() || zwkVarA.e() || zwkVarA.b) {
                zwbVar = rlwVar.e;
                if (zwbVar.e() == null) {
                    zwaVarE = zvz.a;
                } else {
                    zwaVarE = zwbVar.e();
                }
                zwa zwaVar5 = zwaVarE;
                wnw wnwVar5 = rlwVar.b;
                String str14 = account.name;
                if (r9 != 0) {
                    i4 = 3;
                } else {
                    i4 = 5;
                }
                rlt rltVar7 = rltVarB;
                wnwVar5.a(zwaVar5, rltVar7, zyzVar, str14, i4);
                arrayList8.add(new rlv(account, r9, rltVar7, zyzVar));
            }
            i++;
            c = 1;
        }
        arrayList = new ArrayList();
        arrayList2 = new ArrayList();
        arrayList3 = new ArrayList();
        linkedHashMap = new LinkedHashMap();
        size = arrayList8.size();
        i2 = 0;
        airoVarA = null;
        z = false;
        akrqVarB = null;
        while (i2 < size) {
            z2 = z;
            rlvVar = (rlv) arrayList8.get(i2);
            ovoVar = (ovo) rlvVar.d.get();
            if (z2) {
                if (rlw.b(ovoVar)) {
                    arrayList.clear();
                    arrayList2.clear();
                    linkedHashMap.clear();
                    arrayList3.clear();
                    z2 = true;
                }
                z = z2;
                i2++;
                weakReference = weakReference2;
                arrayList8 = arrayList6;
                size = size;
            } else {
                if (!rlw.b(ovoVar)) {
                    arrayList6 = arrayList8;
                    size = size;
                    weakReference2 = weakReference;
                }
                z = z2;
                i2++;
                weakReference = weakReference2;
                arrayList8 = arrayList6;
                size = size;
            }
            arrayList.add(ovoVar);
            wntVarH = ovoVar.h();
            if (wntVarH != null) {
                if (wntVarH.a() != null) {
                    airoVarA = wntVarH.a();
                    if (wntVarH.b() != null) {
                        akrqVarB = wntVarH.b();
                    }
                }
                arrayList2.addAll(wntVarH.c());
                if (rlvVar.b) {
                    arrayList3.addAll(wntVarH.d());
                }
            }
            it2 = ovoVar.j().iterator();
            while (it2.hasNext()) {
                arrayList6 = arrayList8;
                linkedHashMap.put((String) it2.next(), rlvVar.c);
                arrayList8 = arrayList6;
            }
            arrayList6 = arrayList8;
            rpa rpaVar4 = rlwVar.j;
            String str15 = rlvVar.a.name;
            if (ovoVar != null || ovoVar.i().isEmpty()) {
                size = size;
                weakReference2 = weakReference;
                ListenableFuture listenableFuture5 = aher.a;
            } else {
                afxd afxdVarF4 = afxd.f(rpaVar4.h.o(str15));
                rlvVar2 = rlvVar;
                try {
                    rmk rmkVar = new rmk(3);
                    Executor executor4 = rpaVar4.c;
                    size = size;
                    weakReference2 = weakReference;
                    try {
                        try {
                            bArr = null;
                            try {
                                afxd.f(afxdVarF4.g(rmkVar, executor4).c(afig.class, new row(rpaVar4, ovoVar, 0, null), executor4).b(IllegalStateException.class, new rmk(4), executor4)).h(new row(rpaVar4, ovoVar, 2, bArr), executor4).c(Throwable.class, new qmu(rpaVar4, 12), executor4);
                            } catch (InterruptedException e12) {
                                e = e12;
                                akrqVar = akrqVarB;
                                Exception exc5 = e;
                                airo airoVar5 = airoVarA;
                                r13 = bArr;
                                ((agrc) ((agrc) ((agrc) rlw.a.b()).j(exc5)).k("com/google/android/libraries/youtube/account/identity/AccountServiceRequestAggregator", "getSectionListInternal", (char) 350, "AccountServiceRequestAggregator.java")).t("Error while fetching account list response");
                                cause = exc5.getCause();
                                str = rlvVar2.a.name;
                                if (cause instanceof tmg) {
                                    intent = ((tmg) cause).a;
                                    if (intent == null) {
                                        wnrVar = new wnr(r13, cause);
                                    } else {
                                        wnrVar = new wnr(intent, cause);
                                    }
                                    wnsVarB = wns.b(str, wnrVar);
                                } else {
                                    wnsVarB = wns.b(str, new wnr(r13, cause));
                                }
                                arrayList2.add(wnsVarB);
                                airoVarA = airoVar5;
                                akrqVarB = akrqVar;
                            } catch (ExecutionException e13) {
                                e = e13;
                                akrqVar = akrqVarB;
                                Exception exc6 = e;
                                airo airoVar6 = airoVarA;
                                r13 = bArr;
                                ((agrc) ((agrc) ((agrc) rlw.a.b()).j(exc6)).k("com/google/android/libraries/youtube/account/identity/AccountServiceRequestAggregator", "getSectionListInternal", (char) 350, "AccountServiceRequestAggregator.java")).t("Error while fetching account list response");
                                cause = exc6.getCause();
                                str = rlvVar2.a.name;
                                if (cause instanceof tmg) {
                                    intent = ((tmg) cause).a;
                                    if (intent == null) {
                                        wnrVar = new wnr(r13, cause);
                                    } else {
                                        wnrVar = new wnr(intent, cause);
                                    }
                                    wnsVarB = wns.b(str, wnrVar);
                                } else {
                                    wnsVarB = wns.b(str, new wnr(r13, cause));
                                }
                                arrayList2.add(wnsVarB);
                                airoVarA = airoVar6;
                                akrqVarB = akrqVar;
                            }
                        } catch (InterruptedException e14) {
                            e = e14;
                            bArr = null;
                            akrqVar = akrqVarB;
                            Exception exc7 = e;
                            airo airoVar7 = airoVarA;
                            r13 = bArr;
                            ((agrc) ((agrc) ((agrc) rlw.a.b()).j(exc7)).k("com/google/android/libraries/youtube/account/identity/AccountServiceRequestAggregator", "getSectionListInternal", (char) 350, "AccountServiceRequestAggregator.java")).t("Error while fetching account list response");
                            cause = exc7.getCause();
                            str = rlvVar2.a.name;
                            if (cause instanceof tmg) {
                                intent = ((tmg) cause).a;
                                if (intent == null) {
                                    wnrVar = new wnr(r13, cause);
                                } else {
                                    wnrVar = new wnr(intent, cause);
                                }
                                wnsVarB = wns.b(str, wnrVar);
                            } else {
                                wnsVarB = wns.b(str, new wnr(r13, cause));
                            }
                            arrayList2.add(wnsVarB);
                            airoVarA = airoVar7;
                            akrqVarB = akrqVar;
                            z = z2;
                            i2++;
                            weakReference = weakReference2;
                            arrayList8 = arrayList6;
                            size = size;
                        } catch (ExecutionException e15) {
                            e = e15;
                            bArr = null;
                            akrqVar = akrqVarB;
                            Exception exc8 = e;
                            airo airoVar8 = airoVarA;
                            r13 = bArr;
                            ((agrc) ((agrc) ((agrc) rlw.a.b()).j(exc8)).k("com/google/android/libraries/youtube/account/identity/AccountServiceRequestAggregator", "getSectionListInternal", (char) 350, "AccountServiceRequestAggregator.java")).t("Error while fetching account list response");
                            cause = exc8.getCause();
                            str = rlvVar2.a.name;
                            if (cause instanceof tmg) {
                                intent = ((tmg) cause).a;
                                if (intent == null) {
                                    wnrVar = new wnr(r13, cause);
                                } else {
                                    wnrVar = new wnr(intent, cause);
                                }
                                wnsVarB = wns.b(str, wnrVar);
                            } else {
                                wnsVarB = wns.b(str, new wnr(r13, cause));
                            }
                            arrayList2.add(wnsVarB);
                            airoVarA = airoVar8;
                            akrqVarB = akrqVar;
                            z = z2;
                            i2++;
                            weakReference = weakReference2;
                            arrayList8 = arrayList6;
                            size = size;
                        }
                    } catch (InterruptedException e16) {
                        e = e16;
                        bArr = null;
                        akrqVar = akrqVarB;
                        Exception exc9 = e;
                        airo airoVar9 = airoVarA;
                        r13 = bArr;
                        ((agrc) ((agrc) ((agrc) rlw.a.b()).j(exc9)).k("com/google/android/libraries/youtube/account/identity/AccountServiceRequestAggregator", "getSectionListInternal", (char) 350, "AccountServiceRequestAggregator.java")).t("Error while fetching account list response");
                        cause = exc9.getCause();
                        str = rlvVar2.a.name;
                        if (cause instanceof tmg) {
                            intent = ((tmg) cause).a;
                            if (intent == null) {
                                wnrVar = new wnr(r13, cause);
                            } else {
                                wnrVar = new wnr(intent, cause);
                            }
                            wnsVarB = wns.b(str, wnrVar);
                        } else {
                            wnsVarB = wns.b(str, new wnr(r13, cause));
                        }
                        arrayList2.add(wnsVarB);
                        airoVarA = airoVar9;
                        akrqVarB = akrqVar;
                        z = z2;
                        i2++;
                        weakReference = weakReference2;
                        arrayList8 = arrayList6;
                        size = size;
                    } catch (ExecutionException e17) {
                        e = e17;
                        bArr = null;
                        akrqVar = akrqVarB;
                        Exception exc10 = e;
                        airo airoVar10 = airoVarA;
                        r13 = bArr;
                        ((agrc) ((agrc) ((agrc) rlw.a.b()).j(exc10)).k("com/google/android/libraries/youtube/account/identity/AccountServiceRequestAggregator", "getSectionListInternal", (char) 350, "AccountServiceRequestAggregator.java")).t("Error while fetching account list response");
                        cause = exc10.getCause();
                        str = rlvVar2.a.name;
                        if (cause instanceof tmg) {
                            intent = ((tmg) cause).a;
                            if (intent == null) {
                                wnrVar = new wnr(r13, cause);
                            } else {
                                wnrVar = new wnr(intent, cause);
                            }
                            wnsVarB = wns.b(str, wnrVar);
                        } else {
                            wnsVarB = wns.b(str, new wnr(r13, cause));
                        }
                        arrayList2.add(wnsVarB);
                        airoVarA = airoVar10;
                        akrqVarB = akrqVar;
                        z = z2;
                        i2++;
                        weakReference = weakReference2;
                        arrayList8 = arrayList6;
                        size = size;
                    }
                } catch (InterruptedException e18) {
                    e = e18;
                    weakReference2 = weakReference;
                    bArr = null;
                    akrqVar = akrqVarB;
                    Exception exc11 = e;
                    airo airoVar11 = airoVarA;
                    r13 = bArr;
                    ((agrc) ((agrc) ((agrc) rlw.a.b()).j(exc11)).k("com/google/android/libraries/youtube/account/identity/AccountServiceRequestAggregator", "getSectionListInternal", (char) 350, "AccountServiceRequestAggregator.java")).t("Error while fetching account list response");
                    cause = exc11.getCause();
                    str = rlvVar2.a.name;
                    if (cause instanceof tmg) {
                        intent = ((tmg) cause).a;
                        if (intent == null) {
                            wnrVar = new wnr(r13, cause);
                        } else {
                            wnrVar = new wnr(intent, cause);
                        }
                        wnsVarB = wns.b(str, wnrVar);
                    } else {
                        wnsVarB = wns.b(str, new wnr(r13, cause));
                    }
                    arrayList2.add(wnsVarB);
                    airoVarA = airoVar11;
                    akrqVarB = akrqVar;
                    z = z2;
                    i2++;
                    weakReference = weakReference2;
                    arrayList8 = arrayList6;
                    size = size;
                } catch (ExecutionException e19) {
                    e = e19;
                    weakReference2 = weakReference;
                    bArr = null;
                    akrqVar = akrqVarB;
                    Exception exc12 = e;
                    airo airoVar12 = airoVarA;
                    r13 = bArr;
                    ((agrc) ((agrc) ((agrc) rlw.a.b()).j(exc12)).k("com/google/android/libraries/youtube/account/identity/AccountServiceRequestAggregator", "getSectionListInternal", (char) 350, "AccountServiceRequestAggregator.java")).t("Error while fetching account list response");
                    cause = exc12.getCause();
                    str = rlvVar2.a.name;
                    if (cause instanceof tmg) {
                        intent = ((tmg) cause).a;
                        if (intent == null) {
                            wnrVar = new wnr(r13, cause);
                        } else {
                            wnrVar = new wnr(intent, cause);
                        }
                        wnsVarB = wns.b(str, wnrVar);
                    } else {
                        wnsVarB = wns.b(str, new wnr(r13, cause));
                    }
                    arrayList2.add(wnsVarB);
                    airoVarA = airoVar12;
                    akrqVarB = akrqVar;
                    z = z2;
                    i2++;
                    weakReference = weakReference2;
                    arrayList8 = arrayList6;
                    size = size;
                }
            }
            z = z2;
            i2++;
            weakReference = weakReference2;
            arrayList8 = arrayList6;
            size = size;
        }
        WeakReference weakReference5 = weakReference;
        if (rlwVar.k.m(32, 45661975L)) {
            taq.c();
            arrayList4 = new ArrayList();
            it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList4.addAll(((ovo) it.next()).i());
            }
            Stream map3 = Collection.EL.stream(arrayList4).filter(new rej(7)).map(new ris(9));
            Collector collector3 = aghu.a;
            ?? r2 = (agke) map3.collect(collector3);
            agkeVar = (agke) Collection.EL.stream(rlwVar.f.w()).map(new ris(10)).collect(collector3);
            arrayList5 = new ArrayList();
            size2 = agkeVar.size();
            while (i3 < size2) {
                String str16 = (String) agkeVar.get(i3);
                rltVar2 = (rlt) rlwVar.g.y(str16);
                if (rltVar2 == null && rltVar2.c() && !r2.contains(str16)) {
                    arrayList5.add(rltVar2);
                }
            }
            if (!arrayList5.isEmpty()) {
                ((aehs) rlwVar.h.io()).u().b(arrayList5, true);
            }
        }
        rlwVar.c(weakReference5, new xsc(arrayList, new wnt(arrayList2, arrayList3, airoVarA, akrqVarB), linkedHashMap, (boolean[]) null));
    }
}
