package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.concurrent.atomic.DesugarAtomicReference;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class idm implements ahcy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ idm(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x01b7 A[Catch: all -> 0x01d0, TRY_LEAVE, TryCatch #0 {all -> 0x01d0, blocks: (B:34:0x0136, B:36:0x013c, B:37:0x016f, B:39:0x0175, B:40:0x01b7), top: B:172:0x0136 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, oii] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v27, types: [kjc] */
    /* JADX WARN: Type inference failed for: r0v37, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v73, types: [com.google.common.util.concurrent.ListenableFuture] */
    /* JADX WARN: Type inference failed for: r0v80, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v13, types: [ahex, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v5, types: [ooi] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object, ola] */
    /* JADX WARN: Type inference failed for: r1v27, types: [com.google.common.util.concurrent.ListenableFuture] */
    /* JADX WARN: Type inference failed for: r1v30, types: [kjc] */
    /* JADX WARN: Type inference failed for: r1v34, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v54, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v57, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r1v64, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v28, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v34, types: [java.lang.Object, ola] */
    /* JADX WARN: Type inference failed for: r2v48, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v50, types: [axfd] */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r3v26, types: [java.lang.Object, ola] */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.Object, omb] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r7v29, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.ahcy
    public final ListenableFuture a(Object obj) {
        char c;
        int i;
        Object obj2;
        final ListenableFuture listenableFutureF;
        ListenableFuture aherVar;
        Object obj3;
        int i2 = 8;
        int i3 = 5;
        int i4 = 14;
        int i5 = 4;
        byte[] bArr = null;
        int i6 = 2;
        int i7 = 1;
        switch (this.$cid) {
            case 0:
                final ieg iegVar = (ieg) obj;
                if (iegVar == null) {
                    return aher.a;
                }
                agke agkeVar = iegVar.a;
                if (agkeVar.isEmpty()) {
                    return new aher(iegVar);
                }
                Object obj4 = this.b;
                Object obj5 = this.a;
                int i8 = iegVar.d;
                agke agkeVar2 = iegVar.b;
                long j = iegVar.c;
                int iOrdinal = ((ieb) obj4).ordinal();
                if (iOrdinal == 2) {
                    c = 2;
                    int i9 = i8 + 1;
                    if (i9 < agkeVar.size()) {
                        i8 = i9;
                        j = 0;
                    }
                } else if (iOrdinal != 3) {
                    c = 2;
                } else {
                    c = 2;
                    if (j > ((idr) obj5).B || (i = i8 - 1) < 0) {
                        j = 0;
                    } else {
                        i8 = i;
                    }
                }
                agke agkeVarSubList = agkeVar.subList(0, i8);
                agke agkeVarSubList2 = agkeVar.subList(i8, agkeVar.size());
                idr idrVar = (idr) obj5;
                final ListenableFuture listenableFutureN = idrVar.n(agkeVarSubList);
                final ListenableFuture listenableFutureN2 = idrVar.n(agkeVarSubList2);
                final ListenableFuture listenableFutureN3 = idrVar.n(agkeVar2);
                ListenableFuture[] listenableFutureArr = new ListenableFuture[3];
                listenableFutureArr[0] = listenableFutureN;
                listenableFutureArr[1] = listenableFutureN2;
                listenableFutureArr[c] = listenableFutureN3;
                final long j2 = j;
                return new ahud(new ahek(false, agke.p(listenableFutureArr)), (byte[]) null).k(new Callable() { // from class: idq
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        agrf agrfVar = idr.a;
                        ListenableFuture listenableFuture = listenableFutureN;
                        ahno.R(listenableFuture.isDone(), "Future was expected to be done: %s", listenableFuture);
                        List list = (List) a.i(listenableFuture);
                        ListenableFuture listenableFuture2 = listenableFutureN2;
                        ahno.R(listenableFuture2.isDone(), "Future was expected to be done: %s", listenableFuture2);
                        List list2 = (List) a.i(listenableFuture2);
                        ListenableFuture listenableFuture3 = listenableFutureN3;
                        ahno.R(listenableFuture3.isDone(), "Future was expected to be done: %s", listenableFuture3);
                        List list3 = (List) a.i(listenableFuture3);
                        int size = list2.isEmpty() ? list.size() - 1 : list.size();
                        long j3 = j2;
                        ieg iegVar2 = iegVar;
                        int iMax = Math.max(0, size);
                        list.addAll(list2);
                        ief iefVar = new ief(iegVar2);
                        iefVar.m(j3);
                        iefVar.f(list3);
                        iefVar.j(list);
                        iefVar.i(iMax);
                        return iefVar.a();
                    }
                }, idrVar.k);
            case 1:
                aihf aihfVarCreateBuilder = ailg.a.createBuilder();
                aihf builder = ((ailw) obj).toBuilder();
                builder.copyOnWrite();
                ailw ailwVar = (ailw) builder.instance;
                ailwVar.b |= 1;
                ailwVar.c = true;
                aihfVarCreateBuilder.av((String) this.b, (ailw) builder.build());
                return ((hvo) this.a).c.B((ailg) aihfVarCreateBuilder.build());
            case 2:
                kir kirVar = (kir) obj;
                obj3 = this.b;
                if (kirVar == null) {
                    ListenableFuture listenableFuture = ((kic) this.a).j;
                    return listenableFuture == null ? aher.a : listenableFuture;
                }
                break;
            case 3:
                return ((obq) ((oao) this.b).b.b.get()).a((Context) this.a);
            case 4:
                agke agkeVar3 = (agke) obj;
                ListenableFuture aherVar2 = new aher(new agjz(4));
                int size = agkeVar3.size();
                int i10 = 0;
                while (true) {
                    Object obj6 = this.b;
                    if (i10 >= size) {
                        hys hysVar = new hys(i4);
                        ?? r1 = ((zpw) obj6).o;
                        long j3 = afwl.a;
                        afwi afwiVar = new afwi(afty.c(false), hysVar);
                        int i11 = ahcs.c;
                        ahcr ahcrVar = new ahcr(aherVar2, afwiVar);
                        aherVar2.addListener(ahcrVar, MoreExecutors.c(r1, ahcrVar));
                        return ahcrVar;
                    }
                    ojk ojkVar = new ojk(obj6, (omh) agkeVar3.get(i10), this.a, 0, (byte[]) null);
                    ?? r6 = ((zpw) obj6).o;
                    long j4 = afwl.a;
                    ahdb ahdbVar = new ahdb(afty.c(false), ojkVar, 1);
                    int i12 = ahcs.c;
                    ahcq ahcqVar = new ahcq(aherVar2, ahdbVar);
                    aherVar2.addListener(ahcqVar, MoreExecutors.c(r6, ahcqVar));
                    i10++;
                    aherVar2 = ahcqVar;
                }
                break;
            case 5:
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                AtomicInteger atomicInteger = new AtomicInteger(0);
                ArrayList arrayList3 = new ArrayList();
                Iterator it = ((List) obj).iterator();
                while (true) {
                    Object obj7 = this.a;
                    if (!it.hasNext()) {
                        omn omnVar = (omn) obj7;
                        omnVar.h.x();
                        ArrayList arrayList4 = new ArrayList();
                        ?? C = omnVar.j.c();
                        idv idvVar = new idv(obj7, arrayList4, i6);
                        ?? r0 = omnVar.b;
                        long j5 = afwl.a;
                        afwi afwiVar2 = new afwi(afty.c(false), idvVar);
                        int i13 = ahcs.c;
                        ahcr ahcrVar2 = new ahcr(C, afwiVar2);
                        C.addListener(ahcrVar2, MoreExecutors.c(r0, ahcrVar2));
                        ahcr ahcrVar3 = new ahcr(ahcrVar2, new afwi(afty.c(false), new olh(arrayList, 1)));
                        ahcrVar2.addListener(ahcrVar3, MoreExecutors.c(r0, ahcrVar3));
                        arrayList3.add(ahcrVar3);
                        return new kjc(new ahek(false, agke.j(arrayList3))).N(new hql(omnVar, atomicInteger, arrayList2, arrayList, 3), r0);
                    }
                    ?? r3 = this.b;
                    oiz oizVar = (oiz) it.next();
                    if (r3.contains(oizVar)) {
                        omn omnVar2 = (omn) obj7;
                        ListenableFuture listenableFutureD = ((omn) omnVar2.i).d(oizVar);
                        iun iunVar = new iun(arrayList, 16);
                        ?? r7 = omnVar2.b;
                        long j6 = afwl.a;
                        ahcr ahcrVar4 = new ahcr(listenableFutureD, new afwi(afty.c(false), iunVar));
                        listenableFutureD.addListener(ahcrVar4, MoreExecutors.c(r7, ahcrVar4));
                        arrayList3.add(ahcrVar4);
                    } else {
                        omn omnVar3 = (omn) obj7;
                        ListenableFuture listenableFutureE = omnVar3.f.e(oizVar);
                        iaj iajVar = new iaj(obj7, arrayList2, oizVar, atomicInteger, 7);
                        ?? r4 = omnVar3.b;
                        long j7 = afwl.a;
                        ahdb ahdbVar2 = new ahdb(afty.c(false), iajVar, 1);
                        int i14 = ahcs.c;
                        ahcq ahcqVar2 = new ahcq(listenableFutureE, ahdbVar2);
                        listenableFutureE.addListener(ahcqVar2, MoreExecutors.c(r4, ahcqVar2));
                        arrayList3.add(ahcqVar2);
                    }
                }
                break;
            case 6:
                Object obj8 = this.a;
                omn omnVar4 = (omn) obj8;
                ListenableFuture listenableFutureM = omnVar4.j.m(this.b);
                hqm hqmVar = new hqm(obj8, 11);
                long j8 = afwl.a;
                ahdb ahdbVar3 = new ahdb(afty.c(false), hqmVar, 1);
                ?? r2 = omnVar4.b;
                int i15 = ahcs.c;
                ahcq ahcqVar3 = new ahcq(listenableFutureM, ahdbVar3);
                listenableFutureM.addListener(ahcqVar3, MoreExecutors.c(r2, ahcqVar3));
                obj3 = ahcqVar3;
                break;
            case 7:
                ArrayList arrayList5 = new ArrayList();
                Iterator it2 = ((List) obj).iterator();
                while (true) {
                    Object obj9 = this.a;
                    if (!it2.hasNext()) {
                        return new kjc(new ahek(false, agke.j(arrayList5))).N(new okp(i5), ((xgg) obj9).k);
                    }
                    oiw oiwVar = (oiw) it2.next();
                    if (!oiwVar.f) {
                        xgg xggVar = (xgg) obj9;
                        arrayList5.add(xggVar.s(xggVar.i(oiwVar, false), new okx(obj9, (Object) oiwVar, this.b, 0, (char[]) null)));
                    }
                }
                break;
            case 8:
                omh omhVar = (omh) obj;
                oip oipVar = omhVar.b;
                ArrayList arrayList6 = new ArrayList();
                for (oin oinVar : oipVar.o) {
                    int iAS = a.aS(oipVar.j);
                    if (iAS == 0) {
                        iAS = i7;
                    }
                    Object obj10 = this.b;
                    Object obj11 = this.a;
                    final oiz oizVarA = nsj.a(oinVar, iAS);
                    AtomicReference atomicReference = (AtomicReference) obj10;
                    if (((Map) atomicReference.get()).containsKey(oizVarA.e)) {
                        listenableFutureF = (ListenableFuture) ((Map) atomicReference.get()).get(oizVarA.e);
                        obj2 = obj11;
                    } else {
                        Object obj12 = ((xgg) obj11).c;
                        omn omnVar5 = (omn) obj12;
                        obj2 = obj11;
                        listenableFutureF = ooi.d(omnVar5.f(oizVarA)).f(new okx(obj12, (Object) oizVarA, (Object) oinVar, 10, (byte[]) null), omnVar5.b);
                        DesugarAtomicReference.getAndUpdate(atomicReference, new UnaryOperator() { // from class: okl
                            @Override // java.util.function.Function
                            /* JADX INFO: renamed from: andThen */
                            public final /* synthetic */ Function mo840andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj13) {
                                Map map = (Map) obj13;
                                map.put(oizVarA.e, listenableFutureF);
                                return map;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                    }
                    listenableFutureF.getClass();
                    arrayList6.add(ahno.an(listenableFutureF, oma.class, new ojk(obj2, oipVar, omhVar, i2), ((xgg) obj2).k));
                    i7 = 1;
                }
                return qnl.aJ(arrayList6).N(new fxv(5), MoreExecutors.directExecutor());
            case 9:
                olp olpVar = (olp) this.a;
                olpVar.i.F();
                olpVar.k.j(1032);
                xgg xggVar2 = olpVar.m;
                Object obj13 = this.b;
                ListenableFuture listenableFutureD2 = xggVar2.m.d();
                idm idmVar = new idm(xggVar2, obj13, 7);
                long j9 = afwl.a;
                return xggVar2.s(listenableFutureD2, new ahdb(afty.c(false), idmVar, 1));
            case 10:
                int i16 = ((qkt) obj).a;
                if ((i16 == 29501 || i16 == 29537 || i16 == 29538 || i16 == 29539 || i16 == 29540 || i16 == 29541 || i16 == 29542 || i16 == 29543 || i16 == 29544 || i16 == 29547) && ((web) this.b).h()) {
                    ((qmi) this.a).a();
                }
                return aher.a;
            case 11:
                Object obj14 = this.a;
                qrt qrtVar = (qrt) obj14;
                ListenableFuture listenableFuture2 = qrtVar.a;
                ahno.R(listenableFuture2.isDone(), "Future was expected to be done: %s", listenableFuture2);
                qrtVar.e((Uri) a.i(listenableFuture2), obj);
                Object obj15 = qrtVar.d;
                ?? r5 = this.b;
                synchronized (obj15) {
                    ((qrt) obj14).e = r5;
                    break;
                }
                return obj == null ? aher.a : new aher(obj);
            case 12:
                syn synVar = (syn) this.a;
                return ((axfd) synVar.b.io()).O(this.b, (Executor) synVar.a.io());
            case 13:
                ?? r8 = this.b;
                return ((abhh) ((axfd) this.a).e).x(rmp.c(r8), rmp.d(r8));
            case 14:
                affd affdVar = (affd) obj;
                ListenableFuture listenableFutureW = ((abhh) ((axfd) this.a).e).w(affdVar);
                olh olhVar = new olh(affdVar, 12);
                long j10 = afwl.a;
                ahcr ahcrVar5 = new ahcr(listenableFutureW, new afwi(afty.c(false), olhVar));
                listenableFutureW.addListener(ahcrVar5, MoreExecutors.c(this.b, ahcrVar5));
                return ahcrVar5;
            case 15:
                ((wnl) this.b).n((wlu) this.a);
                return ahng.m((toe) obj);
            case 16:
                ?? r9 = this.b;
                ArrayList arrayList7 = new ArrayList(r9.size());
                Iterator it3 = r9.iterator();
                while (it3.hasNext()) {
                    arrayList7.add(new jnu((afgg) it3.next(), this.a, 6, bArr));
                }
                ListenableFuture listenableFutureAF = aguu.aF(arrayList7, new idn(10), MoreExecutors.directExecutor());
                abzy abzyVar = new abzy(9);
                long j11 = afwl.a;
                afwi afwiVar3 = new afwi(afty.c(false), abzyVar);
                Executor executorDirectExecutor = MoreExecutors.directExecutor();
                int i17 = ahcs.c;
                ahcr ahcrVar6 = new ahcr(listenableFutureAF, afwiVar3);
                listenableFutureAF.addListener(ahcrVar6, MoreExecutors.c(executorDirectExecutor, ahcrVar6));
                obj3 = ahcrVar6;
                break;
            case 17:
                Pair pair = (Pair) obj;
                afuu afuuVarD = afwt.d(112, "AccountUiService handle selection result", afux.a, true);
                Object obj16 = this.b;
                Object obj17 = this.a;
                if (pair != null) {
                    try {
                        if (pair.first instanceof afgn) {
                            ListenableFuture listenableFutureB = ((afgn) pair.first).b();
                            aeqk aeqkVar = new aeqk(obj17, i3);
                            long j12 = afwl.a;
                            afwi afwiVar4 = new afwi(afty.c(false), aeqkVar);
                            Executor executorDirectExecutor2 = MoreExecutors.directExecutor();
                            int i18 = ahcs.c;
                            ahcr ahcrVar7 = new ahcr(listenableFutureB, afwiVar4);
                            listenableFutureB.addListener(ahcrVar7, MoreExecutors.c(executorDirectExecutor2, ahcrVar7));
                            afuuVarD.a(ahcrVar7);
                            aherVar = ahcrVar7;
                        } else if (pair.first instanceof afgl) {
                            affd affdVar2 = (affd) pair.second;
                            afgl afglVar = (afgl) pair.first;
                            ListenableFuture listenableFutureY = ((abhh) ((axfd) obj16).e).y(affdVar2);
                            afgt afgtVar = new afgt((axfd) obj16, (afff) obj17, afglVar, affdVar2, 0);
                            long j13 = afwl.a;
                            ahdb ahdbVar4 = new ahdb(afty.c(false), afgtVar, 1);
                            Executor executorDirectExecutor3 = MoreExecutors.directExecutor();
                            ahcq ahcqVar4 = new ahcq(listenableFutureY, ahdbVar4);
                            listenableFutureY.addListener(ahcqVar4, MoreExecutors.c(executorDirectExecutor3, ahcqVar4));
                            afuuVarD.a(ahcqVar4);
                            aherVar = ahcqVar4;
                        } else {
                            aherVar = new aher(new affg(null, afhq.a, null, null, (afff) obj17));
                            afuuVarD.a(aherVar);
                        }
                    } catch (Throwable th) {
                        try {
                            afuuVarD.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } else {
                    aherVar = new aher(new affg(null, afhq.a, null, null, (afff) obj17));
                    afuuVarD.a(aherVar);
                }
                afuuVarD.close();
                return aherVar;
            case 18:
                Object obj18 = this.b;
                ahek ahekVarA = afip.a((Set) ((aupo) ((afip) obj18).h).b);
                ojf ojfVar = new ojf(obj18, i4);
                long j14 = afwl.a;
                return ahekVarA.b(new afwh(afty.c(false), ojfVar, 0), MoreExecutors.directExecutor());
            case 19:
                Object obj19 = this.a;
                try {
                    afiw afiwVar = (afiw) ((afiu) obj).d.get(Integer.valueOf(((affd) obj19).a));
                    if (afiwVar == null) {
                        throw new IllegalArgumentException();
                    }
                    int iAS2 = a.aS(afiwVar.e);
                    if (iAS2 != 0 && iAS2 == 2) {
                        return aher.a;
                    }
                    Object obj20 = this.b;
                    afhs afhsVar = new afhs((affd) obj19, abhh.t(afiwVar).b);
                    Set set = (Set) ((afip) obj20).f.io();
                    ArrayList arrayList8 = new ArrayList(set.size());
                    Iterator it4 = set.iterator();
                    while (it4.hasNext()) {
                        try {
                            Object obj21 = ((hhb) it4.next()).a;
                            arrayList8.add(((abhh) obj21).a.submit(new afii(obj21, afhsVar.a, i6)));
                        } catch (Exception e) {
                            arrayList8.add(ahng.m(e));
                        }
                    }
                    ahek ahekVar = new ahek(true, agke.j(arrayList8));
                    jnu jnuVar = new jnu(obj20, obj19, i2, bArr);
                    long j15 = afwl.a;
                    ListenableFuture listenableFutureB2 = ahekVar.b(new afwh(afty.c(false), jnuVar, 0), MoreExecutors.directExecutor());
                    ahdb ahdbVar5 = new ahdb(afty.c(false), new idm(obj20, afhsVar, 18, bArr), 1);
                    Executor executorDirectExecutor4 = MoreExecutors.directExecutor();
                    int i19 = ahcs.c;
                    ahcq ahcqVar5 = new ahcq(listenableFutureB2, ahdbVar5);
                    listenableFutureB2.addListener(ahcqVar5, MoreExecutors.c(executorDirectExecutor4, ahcqVar5));
                    obj3 = ahcqVar5;
                } catch (IllegalArgumentException e2) {
                    throw new afig(e2);
                }
                break;
            default:
                Set setKeySet = ((HashMap) this.b).keySet();
                afrr afrrVar = ((afry) this.a).e;
                return afrrVar.c.submit(new fzs(afrrVar, setKeySet, 17));
        }
        return obj3;
    }

    public /* synthetic */ idm(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
