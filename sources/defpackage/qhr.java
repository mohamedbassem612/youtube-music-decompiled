package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.PowerManager;
import android.os.Process;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qhr extends qhn implements qfh {
    public final ahey a;
    public final aunn b;
    public final qfg c;
    public final qhw d;
    private final qcs e;
    private final qhm f;

    public qhr(axfd axfdVar, qhm qhmVar, ahey aheyVar, aunn aunnVar, qhw qhwVar, qcs qcsVar, awmd awmdVar, Executor executor) {
        new AtomicReference(qhi.a);
        new ConcurrentHashMap();
        this.f = qhmVar;
        this.e = qcsVar;
        this.c = axfdVar.V(executor, aunnVar, awmdVar);
        this.a = aheyVar;
        this.b = aunnVar;
        this.d = qhwVar;
        Boolean.FALSE.booleanValue();
    }

    public static final boolean d(int i) {
        return i != 1;
    }

    @Override // defpackage.qhn
    public final void a() {
        qhl qhlVar = new qhl() { // from class: qhp
            @Override // defpackage.qhl
            public final void a(int i, String str) {
                this.a.e(null, true, i, str, null);
            }
        };
        qhm qhmVar = this.f;
        qhmVar.d = qhlVar;
        if (qhmVar.c.getAndSet(true)) {
            return;
        }
        ahng.s(new iud(qhmVar, 6), qhmVar.b);
    }

    @Override // defpackage.qhn
    public final void b(qci qciVar, axgh axghVar) {
        e(qciVar.a, true, 1, null, axghVar);
    }

    public final synchronized void c(String str) {
        e(str, false, 1, null, null);
    }

    public final void e(final String str, final boolean z, final int i, final String str2, final axgh axghVar) {
        if (this.e.a) {
            ahng.l();
        } else {
            ahng.s(new ahcx() { // from class: qho
                @Override // defpackage.ahcx
                public final ListenableFuture a() {
                    qjj qjjVarC;
                    final qhr qhrVar = this.a;
                    qhh qhhVar = (qhh) qhrVar.b.io();
                    final int i2 = i;
                    boolean zD = qhr.d(i2);
                    final String str3 = str;
                    if (zD) {
                        qjjVarC = qhhVar.b() ? qjj.a : qjj.b;
                    } else {
                        qjjVarC = qhrVar.c.c(str3);
                    }
                    final qjj qjjVar = qjjVarC;
                    if (qjjVar.f()) {
                        return aher.a;
                    }
                    axgh axghVar2 = axghVar;
                    ListenableFuture listenableFutureN = ahng.n(axghVar2);
                    if (axghVar2 == null) {
                        agev agevVar = qhhVar.a;
                    }
                    final String str4 = str2;
                    final boolean z2 = z;
                    aheo aheoVarP = aheo.p(listenableFutureN);
                    one oneVar = new one(8);
                    ahey aheyVar = qhrVar.a;
                    return ((aheo) ahbz.e(aheoVarP, RuntimeException.class, oneVar, aheyVar)).r(new ahcy() { // from class: qhq
                        @Override // defpackage.ahcy
                        public final ListenableFuture a(Object obj) {
                            ActivityManager.MemoryInfo memoryInfo;
                            aihf aihfVar;
                            axgh axghVar3 = (axgh) obj;
                            aihf aihfVarCreateBuilder = axhz.a.createBuilder();
                            int iMyPid = Process.myPid();
                            qhr qhrVar2 = qhrVar;
                            qhw qhwVar = qhrVar2.d;
                            agfr agfrVarAl = aguu.al(new ope(qhwVar, 16));
                            Object objIo = qhwVar.a.io();
                            qpj.b();
                            qhv qhvVar = null;
                            if (((qhh) objIo).b) {
                                memoryInfo = new ActivityManager.MemoryInfo();
                                Context context = qhwVar.b;
                                if (qel.a == null) {
                                    synchronized (qel.class) {
                                        if (qel.a == null) {
                                            Object systemService = context.getSystemService("activity");
                                            systemService.getClass();
                                            qel.a = (ActivityManager) systemService;
                                        }
                                    }
                                }
                                qel.a.getMemoryInfo(memoryInfo);
                            } else {
                                memoryInfo = null;
                            }
                            String strD = qhwVar.d(((Boolean) qhwVar.c.io()).booleanValue() ? String.valueOf(iMyPid) : "self", "status", false);
                            if (strD != null) {
                                if (strD.isEmpty()) {
                                    ((agrc) ((agrc) qcq.a.c()).k("com/google/android/libraries/performance/primes/metrics/memory/MemoryUsageCapture", "procStatusFromString", 305, "MemoryUsageCapture.java")).t("Null or empty proc status");
                                } else {
                                    qhvVar = new qhv();
                                    qhvVar.f = qhw.c(qhv.a, strD);
                                    qhvVar.g = qhw.c(qhv.b, strD);
                                    qhvVar.h = qhw.c(qhv.c, strD);
                                    qhvVar.i = qhw.c(qhv.d, strD);
                                    qhvVar.j = qhw.c(qhv.e, strD);
                                }
                            }
                            qhu qhuVar = new qhu(qhw.b(qhwVar.d(String.valueOf(iMyPid), "dmabuf_rss", true)), qhw.b(qhwVar.d(String.valueOf(iMyPid), "dmabuf_rss_hwm", true)), qhw.b(qhwVar.d(String.valueOf(iMyPid), "dmabuf_pss", true)));
                            aihf aihfVarCreateBuilder2 = axgp.a.createBuilder();
                            aihf aihfVarCreateBuilder3 = axgo.a.createBuilder();
                            aihf aihfVarCreateBuilder4 = axgm.a.createBuilder();
                            if (memoryInfo != null) {
                                aihfVar = aihfVarCreateBuilder4;
                                long j = memoryInfo.availMem >> 10;
                                aihfVar.copyOnWrite();
                                axgm axgmVar = (axgm) aihfVar.instance;
                                axgmVar.b |= 131072;
                                axgmVar.c = (int) j;
                                long j2 = memoryInfo.totalMem >> 20;
                                aihfVar.copyOnWrite();
                                axgm axgmVar2 = (axgm) aihfVar.instance;
                                axgmVar2.b |= 262144;
                                axgmVar2.d = (int) j2;
                            } else {
                                aihfVar = aihfVarCreateBuilder4;
                            }
                            if (qhvVar != null) {
                                Long l = qhvVar.f;
                                if (l != null) {
                                    long jLongValue = l.longValue();
                                    aihfVar.copyOnWrite();
                                    axgm axgmVar3 = (axgm) aihfVar.instance;
                                    axgmVar3.b |= 524288;
                                    axgmVar3.e = jLongValue;
                                }
                                Long l2 = qhvVar.g;
                                if (l2 != null) {
                                    long jLongValue2 = l2.longValue();
                                    aihfVar.copyOnWrite();
                                    axgm axgmVar4 = (axgm) aihfVar.instance;
                                    axgmVar4.b |= 1048576;
                                    axgmVar4.f = jLongValue2;
                                }
                                Long l3 = qhvVar.h;
                                if (l3 != null) {
                                    long jLongValue3 = l3.longValue();
                                    aihfVar.copyOnWrite();
                                    axgm axgmVar5 = (axgm) aihfVar.instance;
                                    axgmVar5.b |= 2097152;
                                    axgmVar5.g = jLongValue3;
                                }
                                Long l4 = qhvVar.i;
                                if (l4 != null) {
                                    long jLongValue4 = l4.longValue();
                                    aihfVar.copyOnWrite();
                                    axgm axgmVar6 = (axgm) aihfVar.instance;
                                    axgmVar6.b |= 4194304;
                                    axgmVar6.h = jLongValue4;
                                }
                                Long l5 = qhvVar.j;
                                if (l5 != null) {
                                    long jLongValue5 = l5.longValue();
                                    aihfVar.copyOnWrite();
                                    axgm axgmVar7 = (axgm) aihfVar.instance;
                                    axgmVar7.b |= 8388608;
                                    axgmVar7.i = jLongValue5;
                                }
                            }
                            Long l6 = qhuVar.a;
                            if (l6 != null) {
                                long jLongValue6 = l6.longValue();
                                aihfVar.copyOnWrite();
                                axgm axgmVar8 = (axgm) aihfVar.instance;
                                axgmVar8.b |= 16777216;
                                axgmVar8.j = jLongValue6;
                            }
                            Long l7 = qhuVar.b;
                            if (l7 != null) {
                                long jLongValue7 = l7.longValue();
                                aihfVar.copyOnWrite();
                                axgm axgmVar9 = (axgm) aihfVar.instance;
                                axgmVar9.b |= 33554432;
                                axgmVar9.k = jLongValue7;
                            }
                            Long l8 = qhuVar.c;
                            if (l8 != null) {
                                long jLongValue8 = l8.longValue();
                                aihfVar.copyOnWrite();
                                axgm axgmVar10 = (axgm) aihfVar.instance;
                                axgmVar10.b |= 67108864;
                                axgmVar10.l = jLongValue8;
                            }
                            axgm axgmVar11 = (axgm) aihfVar.build();
                            aihfVarCreateBuilder3.copyOnWrite();
                            axgo axgoVar = (axgo) aihfVarCreateBuilder3.instance;
                            axgmVar11.getClass();
                            axgoVar.c = axgmVar11;
                            axgoVar.b |= 1;
                            aihfVarCreateBuilder2.copyOnWrite();
                            axgp axgpVar = (axgp) aihfVarCreateBuilder2.instance;
                            axgo axgoVar2 = (axgo) aihfVarCreateBuilder3.build();
                            axgoVar2.getClass();
                            axgpVar.c = axgoVar2;
                            axgpVar.b |= 1;
                            aihf aihfVarCreateBuilder5 = axhg.a.createBuilder();
                            axhf axhfVarE = ((Boolean) qhwVar.d.io()).booleanValue() ? qhwVar.e.e(iMyPid, agfrVarAl) : qhwVar.e.e(Process.myPid(), agfrVarAl);
                            String str5 = str4;
                            int i3 = i2;
                            aihfVarCreateBuilder5.copyOnWrite();
                            axhg axhgVar = (axhg) aihfVarCreateBuilder5.instance;
                            axhfVarE.getClass();
                            axhgVar.c = axhfVarE;
                            axhgVar.b |= 1;
                            aihfVarCreateBuilder2.copyOnWrite();
                            axgp axgpVar2 = (axgp) aihfVarCreateBuilder2.instance;
                            axhg axhgVar2 = (axhg) aihfVarCreateBuilder5.build();
                            axhgVar2.getClass();
                            axgpVar2.d = axhgVar2;
                            axgpVar2.b |= 2;
                            aihf aihfVarCreateBuilder6 = axgn.a.createBuilder();
                            Context context2 = qhwVar.b;
                            ActivityManager activityManager = qel.a;
                            Object systemService2 = context2.getSystemService("power");
                            systemService2.getClass();
                            boolean zIsInteractive = ((PowerManager) systemService2).isInteractive();
                            aihfVarCreateBuilder6.copyOnWrite();
                            axgn axgnVar = (axgn) aihfVarCreateBuilder6.instance;
                            axgnVar.b |= 1;
                            axgnVar.c = zIsInteractive;
                            aihfVarCreateBuilder2.copyOnWrite();
                            axgp axgpVar3 = (axgp) aihfVarCreateBuilder2.instance;
                            axgn axgnVar2 = (axgn) aihfVarCreateBuilder6.build();
                            axgnVar2.getClass();
                            axgpVar3.f = axgnVar2;
                            axgpVar3.b |= 8;
                            aihfVarCreateBuilder2.copyOnWrite();
                            axgp axgpVar4 = (axgp) aihfVarCreateBuilder2.instance;
                            axgpVar4.e = i3 - 1;
                            axgpVar4.b |= 4;
                            if (str5 != null) {
                                aihfVarCreateBuilder2.copyOnWrite();
                                axgp axgpVar5 = (axgp) aihfVarCreateBuilder2.instance;
                                axgpVar5.b |= 16;
                                axgpVar5.g = str5;
                            }
                            qjj qjjVar2 = qjjVar;
                            boolean z3 = z2;
                            String str6 = str3;
                            axgp axgpVar6 = (axgp) aihfVarCreateBuilder2.build();
                            aihfVarCreateBuilder.copyOnWrite();
                            axhz axhzVar = (axhz) aihfVarCreateBuilder.instance;
                            axgpVar6.getClass();
                            axhzVar.f = axgpVar6;
                            axhzVar.b |= 8;
                            axhz axhzVar2 = (axhz) aihfVarCreateBuilder.build();
                            qfc qfcVarA = qfd.a();
                            qfcVarA.a = str6;
                            qfcVarA.d(z3);
                            qfcVarA.d = qjjVar2;
                            qfcVarA.g(axhzVar2);
                            qfcVarA.b = axghVar3;
                            if (qhr.d(i3)) {
                                qfcVarA.e(true);
                            }
                            return qhrVar2.c.a(qfcVarA.a());
                        }
                    }, aheyVar);
                }
            }, this.a);
        }
    }

    @Override // defpackage.qfh
    public final void k() {
    }
}
