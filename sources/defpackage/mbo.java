package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.SystemClock;
import com.google.android.libraries.elements.interfaces.DirectUpdateProcessor;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protos.youtube.elements.DirectUpdatePropertiesOuterClass$DirectUpdateProperties;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mbo implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ mbo(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.lang.Object, rmu] */
    /* JADX WARN: Type inference failed for: r13v28, types: [android.app.Application$ActivityLifecycleCallbacks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r13v46, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r13v49, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r13v61, types: [avmn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [ahey, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        DirectUpdatePropertiesOuterClass$DirectUpdateProperties directUpdatePropertiesOuterClass$DirectUpdateProperties;
        ListenableFuture listenableFuture;
        byte[] bArr = null;
        try {
            switch (this.$cid) {
                case 0:
                    ((mbp) this.a).a.cancel(false);
                    return;
                case 1:
                    mci.a.set(Boolean.TRUE);
                    this.a.run();
                    return;
                case 2:
                    mjs mjsVar = (mjs) this.a;
                    DirectUpdateProcessor directUpdateProcessor = mjsVar.b;
                    if (directUpdateProcessor == null || (directUpdatePropertiesOuterClass$DirectUpdateProperties = mjsVar.d) == null) {
                        return;
                    }
                    directUpdateProcessor.processProperties(directUpdatePropertiesOuterClass$DirectUpdateProperties);
                    return;
                case 3:
                    Object obj = this.a;
                    oet oetVar = new oet((oeu) obj);
                    Object systemService = ((oeu) obj).a.getSystemService("connectivity");
                    systemService.getClass();
                    ((ConnectivityManager) systemService).registerDefaultNetworkCallback(oetVar);
                    return;
                case 4:
                    Object obj2 = this.a;
                    oez oezVar = new oez(obj2, 0);
                    Object systemService2 = ((ofa) obj2).b.getSystemService("appops");
                    systemService2.getClass();
                    ((AppOpsManager) systemService2).startWatchingActive(((ofa) obj2).d, ((ofa) obj2).c, oezVar);
                    return;
                case 5:
                    qej qejVar = (qej) this.a;
                    qci qciVar = qejVar.h;
                    qciVar.getClass();
                    if (qejVar.b == 0) {
                        qejVar.c = true;
                        Iterator it = qejVar.g.iterator();
                        while (it.hasNext()) {
                            ((qdx) it.next()).k(qciVar);
                        }
                    }
                    qejVar.h.getClass();
                    qejVar.a();
                    return;
                case 6:
                    qgg qggVar = (qgg) this.a;
                    if (((Boolean) qggVar.h.io()).booleanValue()) {
                        qdc qdcVar = qggVar.j;
                        Iterator it2 = qdcVar.b.iterator();
                        while (it2.hasNext()) {
                            ahcs.f(((qdg) it2.next()).a(), new oll(qdcVar, 19), qdcVar.a);
                        }
                    }
                    rrq rrqVar = qggVar.k;
                    if (((Boolean) rrqVar.c.io()).booleanValue()) {
                        double dLongValue = ((Long) rrqVar.e.io()).longValue();
                        Object obj3 = rrqVar.b;
                        ?? r3 = rrqVar.d;
                        rrqVar.a.scheduleWithFixedDelay(new qca(rrqVar, 5), Math.round(dLongValue + (((Random) obj3).nextDouble() * ((Long) r3.io()).longValue())), ((Long) r3.io()).longValue(), TimeUnit.MILLISECONDS);
                        return;
                    }
                    return;
                case 7:
                    ((qih) this.a).a(0);
                    return;
                case 8:
                    int i = qif.b;
                    qpj.c();
                    qih qihVar = ((qig) this.a).b;
                    if (qihVar.h == null) {
                        qihVar.h = new qfk(SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
                        return;
                    }
                    return;
                case 9:
                    int i2 = qif.b;
                    qpj.c();
                    ?? r13 = this.a;
                    qig qigVar = (qig) r13;
                    qih qihVar2 = qigVar.b;
                    if (qihVar2.i == null) {
                        qihVar2.i = new qfk(SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
                        qih.b("Primes-ttfdd-end-and-length-ms", qihVar2.i.a);
                        qigVar.a.unregisterActivityLifecycleCallbacks(r13);
                        return;
                    }
                    return;
                case 10:
                    qpj.c();
                    qih qihVar3 = ((qig) this.a).b;
                    if (qihVar3.k == null) {
                        qihVar3.k = new qfk(SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
                        return;
                    }
                    return;
                case 11:
                    qpj.c();
                    qih qihVar4 = ((qig) this.a).b;
                    if (qihVar4.j == null) {
                        qihVar4.j = new qfk(SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
                        return;
                    }
                    return;
                case 12:
                    qmi qmiVar = (qmi) this.a;
                    if (qmiVar.e) {
                        qkh qkhVar = qmiVar.b;
                        if (!mef.h(qkhVar.c)) {
                            qmi.i.e(qkhVar);
                            return;
                        }
                    }
                    qmiVar.c();
                    return;
                case 13:
                    ahnm ahnmVar = ahnm.FILE;
                    qnl qnlVar = new qnl();
                    qmi qmiVar2 = (qmi) this.a;
                    qms qmsVar = qmiVar2.b.h;
                    qmy qmqVar = (qmy) qmsVar.c.io();
                    if (qmqVar == null && !qmiVar2.f) {
                        ListenableFuture listenableFuture2 = aher.a;
                        return;
                    }
                    int i3 = 1 << ahnmVar.h;
                    if ((qmsVar.e & i3) == 0) {
                        CopyOnWriteArrayList copyOnWriteArrayList = qmsVar.f;
                        synchronized (copyOnWriteArrayList) {
                            int i4 = qmsVar.e;
                            if ((i4 & i3) == 0) {
                                copyOnWriteArrayList.add(qnlVar);
                                qmsVar.e = i4 | i3;
                            }
                            break;
                        }
                    }
                    if (qmsVar.h == null) {
                        synchronized (qmsVar.g) {
                            if (qmsVar.h == null) {
                                if (qmqVar == null) {
                                    qmqVar = new qmq();
                                }
                                Context context = qmsVar.a;
                                int i5 = 15;
                                if (mef.h(context)) {
                                    ListenableFuture listenableFutureB = ((kjc) qmsVar.d.io()).B(new qmr(qmsVar, qmqVar));
                                    qmsVar.h = listenableFutureB;
                                    listenableFuture = listenableFutureB;
                                } else {
                                    gqd gqdVar = new gqd(16);
                                    agfr agfrVar = qmsVar.b;
                                    ListenableFuture listenableFutureE = mef.e(context, gqdVar, (Executor) agfrVar.io());
                                    ols olsVar = new ols(qmsVar, qmqVar, i5, bArr);
                                    Executor executor = (Executor) agfrVar.io();
                                    int i6 = ahcs.c;
                                    ahcq ahcqVar = new ahcq(listenableFutureE, olsVar);
                                    listenableFutureE.addListener(ahcqVar, MoreExecutors.c(executor, ahcqVar));
                                    qmsVar.h = ahcqVar;
                                    listenableFuture = ahcqVar;
                                }
                                listenableFuture.addListener(new mbo(listenableFuture, i5), (Executor) qmsVar.b.io());
                            }
                            break;
                        }
                        return;
                    }
                    return;
                case 14:
                    ?? r14 = this.a;
                    try {
                        ahno.R(r14.isDone(), "Future was expected to be done: %s", r14);
                        a.i(r14);
                        return;
                    } catch (ExecutionException e) {
                        qpj.a().post(new qca(e, 12));
                        return;
                    }
                case 15:
                    ahng.v(this.a);
                    return;
                case 16:
                    Object obj4 = this.a;
                    synchronized (((qso) obj4).h) {
                        if (((qso) obj4).k == 0) {
                            ((qso) obj4).d();
                        }
                        break;
                    }
                    return;
                case 17:
                    ((qtl) this.a).c();
                    return;
                case 18:
                    Object obj5 = this.a;
                    zwa zwaVarE = ((rrq) obj5).a.e();
                    if (zwaVarE instanceof rlt) {
                        if (rre.a(((rlt) zwaVarE).b, ((rre) ((rrq) obj5).c).d()) == null) {
                            ((rqa) ((rrq) obj5).e).j(false, false);
                            return;
                        }
                        return;
                    }
                    return;
                case 19:
                    rpy rpyVar = (rpy) this.a;
                    if (!rpyVar.c.c() || ((acfd) rpyVar.g.io()).a) {
                        return;
                    }
                    rpyVar.d.a(null, rpyVar.e);
                    long j = rpyVar.f;
                    if (j > 0) {
                        rpyVar.i.d("modular_onboarding_check", j, 2, 1, false, null, null, false);
                        return;
                    }
                    return;
                default:
                    this.a.dispose();
                    return;
            }
        } catch (Throwable unused) {
        }
    }
}
