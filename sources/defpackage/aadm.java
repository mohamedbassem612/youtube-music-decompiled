package defpackage;

import android.app.NotificationManager;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import android.util.Pair;
import androidx.media.AudioAttributesCompat;
import com.google.cardboard.sdk.CardboardView;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.Optional;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class aadm implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ aadm(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r13v13, types: [aati, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z = false;
        switch (this.$cid) {
            case 0:
                taq.d();
                final aado aadoVar = (aado) this.a;
                Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: aadn
                    @Override // android.os.MessageQueue.IdleHandler
                    public final boolean queueIdle() {
                        aado aadoVar2 = aadoVar;
                        aadoVar2.k.execute(new ztg(aadoVar2, 20));
                        return false;
                    }
                });
                return;
            case 1:
                aado aadoVar2 = (aado) this.a;
                aadoVar2.q.k();
                aadoVar2.n.r();
                return;
            case 2:
                aado aadoVar3 = (aado) this.a;
                if (aadoVar3.C()) {
                    aaew aaewVar = aadoVar3.n;
                    for (aamh aamhVar : aaewVar.ap()) {
                        aadk aadkVar = (aadk) aadoVar3.t.io();
                        String str = aamhVar.a;
                        aihf aihfVarCreateBuilder = aoen.a.createBuilder();
                        aihfVarCreateBuilder.copyOnWrite();
                        aoen aoenVar = (aoen) aihfVarCreateBuilder.instance;
                        aoenVar.b |= 2;
                        aoenVar.d = str;
                        aihfVarCreateBuilder.copyOnWrite();
                        aoen aoenVar2 = (aoen) aihfVarCreateBuilder.instance;
                        aoenVar2.e = 9;
                        aoenVar2.b |= 4;
                        aadkVar.n(str, (aoen) aihfVarCreateBuilder.build());
                    }
                    aadu aaduVar = (aadu) aadoVar3.u.io();
                    taq.c();
                    Iterator it = (!aaduVar.g.C() ? agpi.a : ((abxu) aaduVar.c.io()).f()).iterator();
                    while (it.hasNext()) {
                        String str2 = ((aamq) it.next()).b;
                        aihf aihfVarCreateBuilder2 = aoen.a.createBuilder();
                        aihfVarCreateBuilder2.copyOnWrite();
                        aoen aoenVar3 = (aoen) aihfVarCreateBuilder2.instance;
                        aoenVar3.b |= 2;
                        aoenVar3.d = str2;
                        aihfVarCreateBuilder2.copyOnWrite();
                        aoen aoenVar4 = (aoen) aihfVarCreateBuilder2.instance;
                        aoenVar4.e = 9;
                        aoenVar4.b |= 4;
                        aaduVar.e(str2, (aoen) aihfVarCreateBuilder2.build());
                    }
                    for (aamt aamtVar : aaewVar.l()) {
                        aady aadyVar = (aady) aadoVar3.s.io();
                        String strB = aamtVar.b();
                        aihf aihfVarCreateBuilder3 = aoen.a.createBuilder();
                        String strB2 = aamtVar.b();
                        aihfVarCreateBuilder3.copyOnWrite();
                        aoen aoenVar5 = (aoen) aihfVarCreateBuilder3.instance;
                        strB2.getClass();
                        aoenVar5.b |= 1;
                        aoenVar5.c = strB2;
                        aihfVarCreateBuilder3.copyOnWrite();
                        aoen aoenVar6 = (aoen) aihfVarCreateBuilder3.instance;
                        aoenVar6.e = 9;
                        aoenVar6.b |= 4;
                        aadyVar.u(strB, (aoen) aihfVarCreateBuilder3.build());
                    }
                    aary aaryVar = aadoVar3.o;
                    aaryVar.g();
                    Iterator it2 = aaryVar.d(aadoVar3.c).iterator();
                    while (it2.hasNext()) {
                        aaryVar.h((aaro) it2.next());
                    }
                    return;
                }
                return;
            case 3:
                ((aask) ((ci) this.a).a.c()).f(aasj.a(12).a());
                return;
            case 4:
                ((aadq) this.a).f();
                return;
            case 5:
                ((aanb) this.a).e();
                return;
            case 6:
                aady aadyVar2 = ((aadx) this.a).a;
                ci ciVar = aadyVar2.p;
                String str3 = aadyVar2.c;
                String strAs = ciVar.as();
                if (str3.equals(strAs)) {
                    aaew aaewVar2 = (aaew) aadyVar2.h.io();
                    aaqx aaqxVar = (aaqx) aadyVar2.j.io();
                    for (aamw aamwVar : ciVar.at(strAs).values()) {
                        if (aarq.l(aamwVar)) {
                            String strE = aarq.e(aamwVar.f);
                            aaewVar2.X(strE, aamwVar);
                            aadyVar2.m(strE);
                            if (aaqxVar.c().contains(strE)) {
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        aadyVar2.o(aaqxVar.b().a());
                    }
                    for (aamt aamtVar2 : aaewVar2.l()) {
                        if (aamtVar2.f() == aamp.PLAYABLE) {
                            aadyVar2.q(aamtVar2);
                        }
                    }
                    return;
                }
                return;
            case 7:
                aakl aaklVar = (aakl) this.a;
                zwa zwaVarE = aaklVar.c.e();
                if (zwaVarE.h()) {
                    return;
                }
                wcn wcnVarB = aaklVar.b.b(zwaVarE);
                List<String> list = (List) wcnVarB.q(197).E();
                wer werVarE = wcnVarB.e();
                for (String str4 : list) {
                    if (((agkz) wcnVarB.a(str4).E()).isEmpty()) {
                        werVarE.j(str4);
                    }
                }
                werVarE.b().G();
                return;
            case 8:
                Object obj = this.a;
                synchronized (((aask) obj).q) {
                    ListenableFuture listenableFuture = ((aask) obj).r;
                    if ((listenableFuture == null || listenableFuture.isDone()) && ((aask) obj).e() <= 0 && !((aask) obj).l) {
                        aarz aarzVar = ((aask) obj).g;
                        final boolean z2 = !((aask) obj).m;
                        final boolean z3 = !((aask) obj).u.l();
                        Executor executor = ((aasw) aarzVar).b;
                        final aasw aaswVar = (aasw) aarzVar;
                        executor.execute(afwl.i(new Runnable() { // from class: aasu
                            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Set] */
                            @Override // java.lang.Runnable
                            public final void run() {
                                aarz aarzVar2 = aaswVar.a;
                                aatc aatcVar = (aatc) aarzVar2;
                                aask aaskVar = aatcVar.n;
                                if (aaskVar == null || aaskVar.e() > 0) {
                                    return;
                                }
                                aatcVar.k(new aata(0));
                                isi isiVar = aatcVar.t;
                                ?? r4 = isiVar.b;
                                synchronized (r4) {
                                    for (Pair pair : isiVar.L()) {
                                        Object obj2 = pair.first;
                                        Object obj3 = pair.second;
                                        int iIntValue = ((Integer) pair.second).intValue();
                                        if (iIntValue != 15 && iIntValue != 17) {
                                            switch (iIntValue) {
                                                case 7:
                                                case 8:
                                                case 9:
                                                case 10:
                                                    break;
                                                default:
                                                    continue;
                                            }
                                        }
                                        ((NotificationManager) isiVar.a).cancel((String) pair.first, ((Integer) pair.second).intValue());
                                    }
                                    r4.clear();
                                }
                                try {
                                    Class<?> cls = Class.forName(((aatc) aarzVar2).i);
                                    Context context = aatcVar.d;
                                    context.stopService(new Intent(context, cls));
                                    aask aaskVar2 = aatcVar.n;
                                    if (aaskVar2 != null) {
                                        aaskVar2.j = true;
                                        aaskVar2.p = false;
                                        aasq aasqVar = aaskVar2.d;
                                        try {
                                            aaskVar2.b.unregisterReceiver(aasqVar);
                                        } catch (IllegalArgumentException unused) {
                                            aasqVar.getClass().getSimpleName();
                                        }
                                        aasqVar.a = null;
                                        aasr aasrVar = aaskVar2.e;
                                        Object obj4 = aasrVar.c;
                                        if (obj4 != null) {
                                            awka.f((AtomicReference) obj4);
                                        }
                                        Object obj5 = aasrVar.d;
                                        if (obj5 != null) {
                                            awka.f((AtomicReference) obj5);
                                        }
                                        Object obj6 = aaskVar2.t;
                                        if (obj6 != null) {
                                            avnr.b((AtomicReference) obj6);
                                        }
                                        aaskVar2.o = false;
                                        aaskVar2.f(aasj.a(14).a());
                                    }
                                    CountDownLatch countDownLatch = aatcVar.s;
                                    if (countDownLatch != null) {
                                        countDownLatch.countDown();
                                    }
                                    aauk aaukVar = aatcVar.j;
                                    if (aaukVar.h() && (!aaukVar.j() || ((aesq) aatcVar.m.io()).a() != aatf.c)) {
                                        Context context2 = aatcVar.d;
                                        if (Build.VERSION.SDK_INT >= 34) {
                                            ((JobScheduler) context2.getSystemService(JobScheduler.class)).cancel(10);
                                        }
                                    }
                                    aatcVar.n = null;
                                    aatb aatbVar = aatcVar.q;
                                    if (aatbVar != null) {
                                        aatcVar.h.unregisterOnSharedPreferenceChangeListener(aatbVar);
                                    }
                                    boolean z4 = z2;
                                    String strD = ((aanb) aatcVar.f.io()).d();
                                    if (z4) {
                                        aarq.g(aatcVar.h, strD, false);
                                    }
                                    if (z3) {
                                        ((aaqg) aatcVar.e.io()).w(strD, false);
                                    }
                                    Object obj7 = aatcVar.r;
                                    if (obj7 != null) {
                                        awka.f((AtomicReference) obj7);
                                        aatcVar.r = null;
                                    }
                                } catch (ClassNotFoundException e) {
                                    ((agrc) ((agrc) ((agrc) aatc.a.b()).j(e)).k("com/google/android/libraries/youtube/offline/transfer/service/DefaultTransfersExecutorManager", "onIdle", 453, "DefaultTransfersExecutorManager.java")).w("[Offline] Cannot find class: %s", aatcVar.i);
                                }
                            }
                        }));
                    }
                    break;
                }
                return;
            case 9:
                ((aasr) this.a).b();
                return;
            case 10:
                break;
            case 11:
                ((aask) this.a).g();
                return;
            case 12:
                this.a.getClass().getName();
                return;
            case 13:
                aatc aatcVar = (aatc) this.a;
                String strD = ((aanb) aatcVar.f.io()).d();
                aask aaskVar = aatcVar.n;
                if (aaskVar == null || "NO_OP_STORE_TAG".equals(strD)) {
                    return;
                }
                aaskVar.d(strD);
                return;
            case 14:
                Object obj2 = this.a;
                synchronized (obj2) {
                    Duration durationE = ((aath) obj2).f.e();
                    if (a.y(durationE)) {
                        aati aatiVarA = ((aath) obj2).a();
                        if (aatiVarA == null) {
                            return;
                        }
                        mbc mbcVar = ((aath) obj2).e;
                        long jB = mbcVar.b() - ((aath) obj2).h;
                        aamw aamwVar2 = ((aath) obj2).i != null ? (aamw) aatiVarA.f().get(((aath) obj2).i) : null;
                        if (aamwVar2 != null && aamwVar2.b()) {
                            z = true;
                        }
                        long millis = durationE.toMillis();
                        if (!z) {
                            ((aath) obj2).i = null;
                            ((aath) obj2).j = -1L;
                            ((aath) obj2).h = mbcVar.b();
                        } else if (jB >= millis - aath.b) {
                            ((agrc) ((agrc) aath.a.c()).k("com/google/android/libraries/youtube/offline/transfer/service/OfflineUidtWatchdog", "checkSticking", 150, "OfflineUidtWatchdog.java")).E("[Offline][UIDT] Watchdog: Zero bytes transferred for %d mins (Transfer %s stuck at %d bytes). Resolving the lock and rescheduling.", Long.valueOf(durationE.toMinutes()), ((aath) obj2).i, Long.valueOf(((aath) obj2).j));
                            if (aatiVarA.b() != null) {
                                ((aath) obj2).k = true;
                                aesq aesqVar = ((aath) obj2).l;
                                aesqVar.c = ((aath) obj2).i;
                                aesqVar.b(aatf.c);
                                ((aath) obj2).g = ((aath) obj2).d.schedule(new aadm(obj2, 15), aath.c, TimeUnit.MILLISECONDS);
                            } else {
                                ((aath) obj2).g = null;
                            }
                            return;
                        }
                        ((aath) obj2).d();
                        return;
                    }
                    return;
                }
            case 15:
                ((aath) this.a).c();
                return;
            case 16:
                aavg aavgVar = (aavg) this.a;
                if (aavgVar.c.k) {
                    return;
                }
                abmw abmwVar = abmw.AUDIOMANAGER;
                abmx.a(abmwVar, "AudioFocus Requested");
                int i = AudioAttributesCompat.b;
                zf zfVar = new zf((byte[]) null);
                Optional optionalEmpty = Optional.empty();
                wjf wjfVar = aavgVar.l;
                if (wjfVar != null && wjfVar.f() != null) {
                    optionalEmpty = aavgVar.l.f().J();
                }
                ((AudioAttributes.Builder) zfVar.a).setContentType((!aavgVar.i.g.l(269, 45725426L, false) || optionalEmpty.isEmpty()) ? aavgVar.n == 3 ? 1 : 0 : ((Integer) optionalEmpty.get()).intValue());
                fdr.f(zfVar);
                fdr.e(3, zfVar);
                AudioAttributesCompat audioAttributesCompatD = fdr.d(zfVar);
                int i2 = bqj.b;
                aave aaveVar = aavgVar.f;
                Handler handler = new Handler(Looper.getMainLooper());
                if (aaveVar == null) {
                    throw new IllegalArgumentException("OnAudioFocusChangeListener must not be null");
                }
                aavgVar.k = new bqj(aaveVar, handler, audioAttributesCompatD, aavgVar.n == 3);
                AudioManager audioManager = aavgVar.e;
                if (audioManager != null) {
                    bqj bqjVar = aavgVar.k;
                    if (bqjVar == null) {
                        throw new IllegalArgumentException("AudioFocusRequestCompat must not be null");
                    }
                    if (audioManager.requestAudioFocus(bd$$ExternalSyntheticApiModelOutline1.m626m(bqjVar.a)) == 1) {
                        abmx.a(abmwVar, "AudioFocus Granted");
                        aaveVar.b.m = 2;
                        aaveVar.b(false);
                        aaveVar.a(false);
                        return;
                    }
                }
                abmx.a(abmwVar, "AudioFocus DENIED");
                return;
            case 17:
                ((aavr) this.a).f();
                return;
            case 18:
                aazu aazuVar = (aazu) this.a;
                xsc xscVar = aazuVar.g;
                if (xscVar != null) {
                    xscVar.w(new aazt(aazuVar.f, false));
                    return;
                }
                return;
            case 19:
                ((CardboardView) this.a).onSettingsButtonClick();
                return;
            default:
                ((abal) this.a).g();
                return;
        }
        while (((aask) this.a).i()) {
        }
    }
}
