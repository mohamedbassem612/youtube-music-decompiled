package defpackage;

import com.google.research.xeno.effect.Callbacks$StatusCallback;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rhj implements Callbacks$StatusCallback {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rhj(rht rhtVar, aqi aqiVar, int i) {
        this.$cid = i;
        this.b = rhtVar;
        this.a = aqiVar;
    }

    @Override // com.google.research.xeno.effect.NativeCallbacks$StatusCallback
    public final void onCompletion(boolean z, String str) {
        long j;
        if (this.$cid == 0) {
            if (!z) {
                rbc rbcVar = new rbc(rht.q, rbd.c);
                rbcVar.a = new Exception(str);
                rbcVar.c();
                rbcVar.a("Xeno processor reported a failure to stop.", new Object[0]);
            }
            Object obj = this.b;
            rht rhtVar = (rht) this.a;
            rhu rhuVar = rhtVar.d;
            rhuVar.getClass();
            rhtVar.m.i(new rhl(rhuVar, 1));
            ((CountDownLatch) obj).countDown();
            return;
        }
        Object obj2 = this.b;
        rht rhtVar2 = (rht) obj2;
        synchronized (rhtVar2.j) {
            j = ((rht) obj2).k;
        }
        AtomicLong atomicLong = rhtVar2.h;
        Object obj3 = this.a;
        atomicLong.set(j);
        rhtVar2.l();
        if (z) {
            ((aqi) obj3).b(null);
        } else if (str.equals("xeno::effect::EffectWasReconfiguredStatus()") || str.equals("xeno::effect::StartProcessingWasCancelledStatus()")) {
            ((aqi) obj3).c();
        } else {
            ((aqi) obj3).d(new IllegalStateException(String.format("setEffect() failed with error: %s", str)));
        }
    }

    public /* synthetic */ rhj(rht rhtVar, CountDownLatch countDownLatch, int i) {
        this.$cid = i;
        this.a = rhtVar;
        this.b = countDownLatch;
    }
}
