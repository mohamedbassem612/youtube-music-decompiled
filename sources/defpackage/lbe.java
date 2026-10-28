package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.lang.ref.SoftReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lbe implements Runnable {
    private final /* synthetic */ int $cid;
    final /* synthetic */ boolean a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;

    public lbe(AppMeasurementDynamiteService appMeasurementDynamiteService, kzm kzmVar, String str, String str2, boolean z, int i) {
        this.$cid = i;
        this.b = kzmVar;
        this.c = str;
        this.d = str2;
        this.a = z;
        this.e = appMeasurementDynamiteService;
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kzm] */
    @Override // java.lang.Runnable
    public final void run() {
        Executor executorAl;
        int iC;
        int i = this.$cid;
        if (i == 0) {
            lff lffVarK = ((AppMeasurementDynamiteService) this.e).a.k();
            lffVarK.o();
            lffVarK.a();
            lbg lbgVarS = lffVarK.s(false);
            ?? r8 = this.b;
            lffVarK.B(new lex(lffVarK, (String) this.c, (String) this.d, lbgVarS, this.a, (kzm) r8, 0));
            return;
        }
        Object obj = this.b;
        if (i != 1) {
            lff lffVarK2 = ((ler) obj).t.k();
            lffVarK2.o();
            lffVarK2.a();
            lbg lbgVarS2 = lffVarK2.s(false);
            Object obj2 = this.d;
            AtomicReference atomicReference = (AtomicReference) obj2;
            lffVarK2.B(new lex(lffVarK2, atomicReference, (String) this.e, (String) this.c, lbgVarS2, this.a, 2));
            return;
        }
        Object obj3 = this.c;
        try {
            Parcelable parcelableExtra = ((Intent) obj3).getParcelableExtra("wrapped_intent");
            Intent intent = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            Object obj4 = this.e;
            Object obj5 = this.d;
            if (intent != null) {
                iC = ((kkv) obj5).c(intent);
            } else if (((Intent) obj3).getExtras() == null) {
                iC = 500;
            } else {
                kkr kkrVar = new kkr((Intent) obj3);
                CountDownLatch countDownLatch = new CountDownLatch(1);
                synchronized (kkv.class) {
                    SoftReference softReference = kkv.a;
                    executorAl = softReference != null ? (Executor) softReference.get() : null;
                    if (executorAl == null) {
                        ksy ksyVar = kyq.a;
                        executorAl = ksy.al(1, new ktb("pscm-ack-executor", 0));
                        kkv.a = new SoftReference(executorAl);
                    }
                }
                executorAl.execute(new gwb(obj4, (Object) kkrVar, (Object) countDownLatch, 13, (byte[]) null));
                int iA = ((kkv) obj5).a((Context) obj4, kkrVar);
                try {
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    if (!countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                        Log.w("CloudMessagingReceiver", "Message ack timed out");
                    }
                } catch (InterruptedException e) {
                    Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(e.toString()));
                }
                iC = iA;
            }
            if (this.a && obj != null) {
                ((BroadcastReceiver.PendingResult) obj).setResultCode(iC);
            }
            if (obj != null) {
                ((BroadcastReceiver.PendingResult) obj).finish();
            }
        } catch (Throwable th) {
            if (obj == null) {
                throw th;
            }
            ((BroadcastReceiver.PendingResult) obj).finish();
            throw th;
        }
    }

    public /* synthetic */ lbe(kkv kkvVar, Intent intent, Context context, boolean z, BroadcastReceiver.PendingResult pendingResult, int i) {
        this.$cid = i;
        this.d = kkvVar;
        this.c = intent;
        this.e = context;
        this.a = z;
        this.b = pendingResult;
    }

    public lbe(ler lerVar, AtomicReference atomicReference, String str, String str2, boolean z, int i) {
        this.$cid = i;
        this.d = atomicReference;
        this.e = str;
        this.c = str2;
        this.a = z;
        this.b = lerVar;
    }
}
