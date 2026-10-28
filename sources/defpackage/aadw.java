package defpackage;

import android.app.job.JobParameters;
import com.google.android.libraries.youtube.offline.transfer.service.OfflineUserInitiatedDataTransferJobService;
import com.google.cardboard.sdk.CardboardView;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class aadw implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ aadw(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r9v15, types: [aarw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v33, types: [java.lang.Object, java.util.Map] */
    @Override // java.lang.Runnable
    public final void run() {
        aams aamsVar;
        int i = 1;
        switch (this.$cid) {
            case 0:
                aady aadyVar = ((aadx) this.a).a;
                aamw aamwVar = (aamw) this.b;
                String strE = aarq.e(aamwVar.f);
                ((aaew) aadyVar.h.io()).X(strE, aamwVar);
                aadyVar.m(strE);
                aaqx aaqxVar = (aaqx) aadyVar.j.io();
                if (aaqxVar.c().contains(strE)) {
                    aaqz aaqzVarB = aaqxVar.b();
                    if (aaqzVarB.d(aamwVar)) {
                        aadyVar.o(aaqzVarB.a());
                        return;
                    }
                    return;
                }
                return;
            case 1:
                aady aadyVar2 = (aady) this.a;
                aaew aaewVar = (aaew) aadyVar2.h.io();
                String str = (String) this.b;
                aamt aamtVarF = aaewVar.f(str);
                if (aamtVarF == null || (aamsVar = aamtVarF.m) == null) {
                    return;
                }
                if (aamsVar.e()) {
                    aadyVar2.m(str);
                    return;
                } else {
                    aadyVar2.q(aamtVarF);
                    return;
                }
            case 2:
                int i2 = aaog.c;
                ((aaof) this.b).s((aanq) this.a);
                return;
            case 3:
                ((aaqo) this.a).b((Class) this.b);
                return;
            case 4:
                Object obj = this.a;
                Object obj2 = ((aask) obj).q;
                Object obj3 = this.b;
                synchronized (obj2) {
                    if (((aask) obj).i.contains(obj3)) {
                        ScheduledFuture scheduledFuture = (ScheduledFuture) ((aask) obj).s.remove(obj3);
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(false);
                        }
                        aasi aasiVarA = aasj.a(11);
                        aasiVarA.f((String) obj3);
                        ((aask) obj).f(aasiVarA.a());
                    }
                    break;
                }
                return;
            case 5:
                aaso aasoVar = (aaso) this.b;
                long millis = TimeUnit.MINUTES.toMillis(aasoVar.c.b.c(8, 45385102L, 0L));
                ?? r9 = this.a;
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (millis > 0) {
                    aasoVar.b.acquire(millis);
                } else {
                    aasoVar.b.acquire();
                }
                try {
                    r9.run();
                    return;
                } finally {
                    aasoVar.b();
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                    if (millis > 0) {
                        jCurrentTimeMillis2 = Math.min(jCurrentTimeMillis2, millis);
                    }
                    ((agrc) ((agrc) aaso.a.c()).k("com/google/android/libraries/youtube/offline/transfer/executor/ExecutorServiceTransfersRunner", "runTaskWithWakeLock", 88, "ExecutorServiceTransfersRunner.java")).v("[Offline] Transfer wakelock held for %d ms", jCurrentTimeMillis2);
                }
            case 6:
                aatc aatcVar = (aatc) ((aasw) this.b).a;
                Map map = aatcVar.c;
                Object obj4 = this.a;
                map.put(((aamw) obj4).a, obj4);
                aatcVar.k(new aasz(obj4, 5));
                aatcVar.l();
                if (aatcVar.j.l()) {
                    ((rnj) aatcVar.k.io()).j(teb.a);
                    return;
                }
                return;
            case 7:
                Object obj5 = this.a;
                aamw aamwVar2 = (aamw) obj5;
                String str2 = aamwVar2.a;
                aarz aarzVar = ((aasw) this.b).a;
                aatc aatcVar2 = (aatc) aarzVar;
                aatcVar2.c.remove(str2);
                aatcVar2.k(new aasz(obj5, 7));
                byte[] bArr = null;
                if (aarq.l(aamwVar2) && str2.equals(aatcVar2.b)) {
                    aatcVar2.b = null;
                }
                aatcVar2.p.execute(new aadw(aarzVar, obj5, 14, bArr));
                return;
            case 8:
                aatc aatcVar3 = (aatc) ((aasw) this.b).a;
                Map map2 = aatcVar3.c;
                Object obj6 = this.a;
                map2.put(((aamw) obj6).a, obj6);
                aatcVar3.k(new aasz(obj6, 4));
                return;
            case 9:
                aatc aatcVar4 = (aatc) ((aasw) this.b).a;
                Map map3 = aatcVar4.c;
                Object obj7 = this.a;
                map3.put(((aamw) obj7).a, obj7);
                aatcVar4.k(new aasz(obj7, i));
                return;
            case 10:
                aatc aatcVar5 = (aatc) ((aasw) this.a).a;
                Map map4 = aatcVar5.c;
                ?? r10 = this.b;
                map4.putAll(r10);
                aatcVar5.o = true;
                aatcVar5.k(new aata(i));
                Iterator it = r10.values().iterator();
                while (it.hasNext()) {
                    if (((aamw) it.next()).c()) {
                        aatcVar5.l();
                        return;
                    }
                }
                if (aatcVar5.j.l()) {
                    ((rnj) aatcVar5.k.io()).j(teb.a);
                    return;
                }
                return;
            case 11:
                aatc aatcVar6 = (aatc) ((aasw) this.b).a;
                Map map5 = aatcVar6.c;
                Object obj8 = this.a;
                map5.put(((aamw) obj8).a, obj8);
                aatcVar6.k(new aasz(obj8, 3));
                return;
            case 12:
                aatc aatcVar7 = (aatc) ((aasw) this.b).a;
                Map map6 = aatcVar7.c;
                Object obj9 = this.a;
                map6.put(((aamw) obj9).a, obj9);
                aatcVar7.k(new aasz(obj9, 6));
                return;
            case 13:
                aatc aatcVar8 = (aatc) ((aasw) this.b).a;
                Map map7 = aatcVar8.c;
                Object obj10 = this.a;
                map7.put(((aamw) obj10).a, obj10);
                aatcVar8.k(new aasz(obj10, 2));
                return;
            case 14:
                ((aanl) ((aatc) this.b).g.io()).n((aamw) this.a);
                return;
            case 15:
                ((aatc) this.b).q((aamw) this.a);
                return;
            case 16:
                aatc aatcVar9 = (aatc) this.b;
                aamw aamwVar3 = (aamw) this.a;
                aamb aambVar = aamwVar3.f;
                aarq.c(aambVar);
                if (aambVar.m("user_triggered", true)) {
                    aqpc aqpcVar = aamwVar3.b;
                    if (aqpcVar == aqpc.TRANSFER_STATE_COMPLETE) {
                        ((aanl) aatcVar9.g.io()).l(aamwVar3);
                        return;
                    }
                    if (aqpcVar == aqpc.TRANSFER_STATE_FAILED) {
                        ((aanl) aatcVar9.g.io()).m(aamwVar3);
                        return;
                    } else {
                        if (aqpcVar == aqpc.TRANSFER_STATE_TRANSFER_IN_QUEUE && aarq.l(aamwVar3)) {
                            aatcVar9.q(aamwVar3);
                            return;
                        }
                        return;
                    }
                }
                return;
            case 17:
                ((OfflineUserInitiatedDataTransferJobService) this.b).jobFinished((JobParameters) this.a, true);
                return;
            case 18:
                ((aauw) this.b).a.h((acer) ((avbs) this.a).d);
                return;
            case 19:
                ((aavo) ((aavn) this.a).f.io()).i((abtu) this.b);
                return;
            default:
                abal abalVar = (abal) this.a;
                CardboardView.Renderer renderer = abalVar.b;
                if (renderer != null) {
                    renderer.onRendererShutdown();
                }
                abalVar.a.onDestroy();
                ((CountDownLatch) this.b).countDown();
                return;
        }
    }

    public /* synthetic */ aadw(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }

    public aadw(Object obj, Object obj2, int i, char[] cArr) {
        this.$cid = i;
        this.b = obj2;
        this.a = obj;
    }
}
