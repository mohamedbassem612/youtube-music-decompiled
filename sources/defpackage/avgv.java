package defpackage;

import io.grpc.Status;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.base.TraceEvent;
import org.chromium.base.task.TaskRunnerImpl;
import org.chromium.net.NetworkChangeNotifierAutoDetect;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avgv implements Runnable {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public avgv(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        switch (this.$cid) {
            case 0:
                avgy avgyVar = (avgy) this.a;
                avhb avhbVar = avgyVar.c;
                if (avhbVar.y == null) {
                    AtomicReference atomicReference = avgyVar.a;
                    if (atomicReference.get() == avhb.f) {
                        atomicReference.set(null);
                    }
                    avhbVar.B.a(avhb.c);
                    return;
                }
                return;
            case 1:
                avhb avhbVar2 = ((avgs) this.a).b;
                avhbVar2.o.c();
                if (avhbVar2.u) {
                    avhbVar2.t.b();
                    return;
                }
                return;
            case 2:
                avgy avgyVar2 = (avgy) this.a;
                AtomicReference atomicReference2 = avgyVar2.a;
                if (atomicReference2.get() == avhb.f) {
                    atomicReference2.set(null);
                }
                avhb avhbVar3 = avgyVar2.c;
                Collection collection = avhbVar3.y;
                if (collection != null) {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        ((avgx) it.next()).b("Channel is forcefully shutdown", null);
                    }
                }
                avha avhaVar = avhbVar3.B;
                Status status = avhb.b;
                avhaVar.a(status);
                synchronized (avhaVar.a) {
                    arrayList = new ArrayList(avhaVar.b);
                    break;
                }
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((avdu) arrayList.get(i)).h(status);
                }
                avhaVar.d.A.f(status);
                return;
            case 3:
                ((avgy) this.a).c.h();
                return;
            case 4:
                Object obj = this.a;
                avhb avhbVar4 = ((avgx) obj).k.c;
                Collection collection2 = avhbVar4.y;
                if (collection2 != null) {
                    collection2.remove(obj);
                    if (avhbVar4.y.isEmpty()) {
                        avhbVar4.R.c(avhbVar4.z, false);
                        avhbVar4.y = null;
                        if (avhbVar4.C.get()) {
                            avhbVar4.B.a(avhb.c);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                ((avdd) this.a).f.f(avhb.d);
                return;
            case 6:
                avie avieVar = (avie) this.a;
                avieVar.s = null;
                avieVar.k.c();
                avieVar.f();
                return;
            case 7:
                avie avieVar2 = (avie) this.a;
                avieVar2.r = null;
                if (avieVar2.k.e()) {
                    avieVar2.f();
                    return;
                }
                return;
            case 8:
                ((avie) this.a).f();
                return;
            case 9:
                ((avii) this.a).d();
                return;
            case 10:
                Object obj2 = this.a;
                avis avisVar = (avis) obj2;
                if (!avisVar.e) {
                    avisVar.f = null;
                    return;
                }
                long jA = avisVar.d - avisVar.a();
                if (jA > 0) {
                    avisVar.f = avisVar.a.schedule(new avgv(obj2, 11), jA, TimeUnit.NANOSECONDS);
                    return;
                }
                avisVar.e = false;
                avisVar.f = null;
                avisVar.c.run();
                return;
            case 11:
                Object obj3 = this.a;
                ((avis) obj3).b.execute(new avgv(obj3, 10));
                return;
            case 12:
                avjh avjhVar = ((avit) this.a).g;
                avjhVar.A = true;
                avdw avdwVar = avjhVar.w;
                axlj axljVar = avjhVar.F;
                Object obj4 = axljVar.b;
                Status status2 = (Status) obj4;
                avdwVar.a(status2, (avdv) axljVar.c, (avbe) axljVar.a);
                return;
            case 13:
                avjh avjhVar2 = (avjh) this.a;
                if (avjhVar2.A) {
                    return;
                }
                avjhVar2.w.d();
                return;
            case 14:
                avjh avjhVar3 = ((avje) this.a).b;
                avjhVar3.A = true;
                avdw avdwVar2 = avjhVar3.w;
                axlj axljVar2 = avjhVar3.F;
                Object obj5 = axljVar2.b;
                Status status3 = (Status) obj5;
                avdwVar2.a(status3, (avdv) axljVar2.c, (avbe) axljVar2.a);
                return;
            case 15:
                avjh avjhVar4 = ((avje) this.a).b;
                if (avjhVar4.A) {
                    return;
                }
                avjhVar4.w.d();
                return;
            case 16:
                ((avbt) this.a).b();
                return;
            case 17:
                Object obj6 = this.a;
                TraceEvent traceEventC = TraceEvent.c(((TaskRunnerImpl) obj6).c);
                try {
                    synchronized (((TaskRunnerImpl) obj6).f) {
                        Queue queue = ((TaskRunnerImpl) obj6).g;
                        if (queue != null) {
                            ((Runnable) queue.poll()).run();
                        }
                    }
                    if (traceEventC != null) {
                        TraceEvent.b(0L);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (traceEventC != null) {
                        try {
                            TraceEvent.b(0L);
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        break;
                    }
                    throw th;
                }
            case 18:
                NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = (NetworkChangeNotifierAutoDetect) this.a;
                if (networkChangeNotifierAutoDetect.mIgnoreNextBroadcast) {
                    networkChangeNotifierAutoDetect.mIgnoreNextBroadcast = false;
                    return;
                } else {
                    networkChangeNotifierAutoDetect.connectionTypeChanged();
                    return;
                }
            case 19:
                ((axmo) this.a).d.cancel();
                return;
            default:
                ((axmo) this.a).b();
                return;
        }
    }

    public /* synthetic */ avgv(Object obj, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
    }
}
