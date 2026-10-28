package defpackage;

import android.app.Activity;
import android.os.CancellationSignal;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.google.android.libraries.blocks.Container;
import com.google.android.libraries.elements.interfaces.ExecutorRegistry;
import com.google.android.libraries.elements.interfaces.JSModuleCache;
import com.google.android.libraries.performance.primes.metrics.crash.NativeCrashHandlerImpl;
import com.google.android.libraries.youtube.blocks.BlocksLogger;
import com.google.android.libraries.youtube.blocks.BlocksRuntimeProxy;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lph implements Runnable {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;

    public lph(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.b = obj2;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v20, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v48, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v58, types: [bof, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, loz] */
    /* JADX WARN: Type inference failed for: r1v24, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, java.util.concurrent.Callable] */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r7v44, types: [android.view.ViewTreeObserver$OnDrawListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v54, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r7v63, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v66, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object, los, lov, low] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        String name;
        int i;
        String str = null;
        switch (this.$cid) {
            case 0:
                try {
                    ((lpf) this.a).t(this.b.call());
                    return;
                } catch (Exception e) {
                    ((lpf) this.a).s(e);
                    return;
                } catch (Throwable th) {
                    ((lpf) this.a).s(new RuntimeException(th));
                    return;
                }
            case 1:
                try {
                    lpa lpaVarA = ((lox) this.a).b.a(((lpa) this.b).f());
                    ?? r7 = this.a;
                    Executor executor = lpd.b;
                    lpaVarA.n(executor, r7);
                    lpaVarA.m(executor, r7);
                    lpaVarA.k(executor, r7);
                    return;
                } catch (CancellationException unused) {
                    ((lox) this.a).c();
                    return;
                } catch (loy e2) {
                    boolean z = e2.getCause() instanceof Exception;
                    Object obj = this.a;
                    if (z) {
                        ((lox) obj).d((Exception) e2.getCause());
                        return;
                    } else {
                        ((lox) obj).d(e2);
                        return;
                    }
                } catch (Exception e3) {
                    ((lox) this.a).d(e3);
                    return;
                }
            case 2:
                ((ahec) this.a).execute(this.b);
                return;
            case 3:
                ((ahec) this.a).execute(this.b);
                return;
            case 4:
                ((mcg) this.a).b.removeCallbacks(this.b);
                return;
            case 5:
                Object obj2 = this.a;
                Object obj3 = this.b;
                synchronized (((mcs) obj3).a) {
                    ((mcs) obj3).b.remove(obj2);
                    ((mcs) obj3).c.add(obj2);
                    break;
                }
                return;
            case 6:
                Object obj4 = this.a;
                Object obj5 = this.b;
                synchronized (((mcs) obj5).a) {
                    ((mcs) obj5).c.remove(obj4);
                    break;
                }
                return;
            case 7:
                ((dxu) this.a).c(this.b);
                return;
            case 8:
                ((hee) this.a).a(this.b);
                return;
            case 9:
                ((NativeCrashHandlerImpl) this.b).b((qfv) this.a);
                return;
            case 10:
                boolean zBooleanValue = ((Boolean) ((agfa) this.b).a.io()).booleanValue();
                Object obj6 = this.a;
                if (zBooleanValue) {
                    synchronized (obj6) {
                        ((qgo) obj6).a = true;
                        Activity activity = ((qgo) obj6).b;
                        if (activity != null) {
                            ((qgo) obj6).c(activity);
                        }
                        ((qgo) obj6).b = null;
                        break;
                    }
                    return;
                }
                return;
            case 11:
                ((qhk) this.b).c.d.a(6, ((qci) this.a).a);
                return;
            case 12:
                ((View) this.a).getViewTreeObserver().removeOnDrawListener(this.b);
                return;
            case 13:
                Map mapA = qmn.a(((qkh) this.a).c);
                Object obj7 = this.b;
                if (mapA.containsKey(obj7)) {
                    return;
                }
                Log.e("FilePhenotypeFlags", a.bT((String) obj7, "Config package ", " cannot use FILE backing without declarative registration. See go/phenotype-android-integration#phenotype for more information. This will lead to stale flags."));
                return;
            case 14:
                if (((ahev) this.b).isCancelled()) {
                    ((CancellationSignal) ((omr) this.a).a).cancel();
                    return;
                }
                return;
            case 15:
                boc lifecycle = ((bog) this.b.io()).getLifecycle();
                bob bobVarA = lifecycle.a();
                Object obj8 = this.a;
                if (bobVarA == bob.a) {
                    ((Container) obj8).d();
                    return;
                } else {
                    lifecycle.b(new afns(obj8, 1));
                    return;
                }
            case 16:
                szw szwVar = (szw) this.a;
                Process.setThreadPriority(szwVar.a);
                String str2 = szwVar.b;
                Thread threadCurrentThread = Thread.currentThread();
                if (!TextUtils.isEmpty(str2) && (name = threadCurrentThread.getName()) != null) {
                    int iIndexOf = name.indexOf("-thread-");
                    if (name.startsWith("pool-") && iIndexOf >= 0 && (i = iIndexOf + 8) < name.length()) {
                        str = str2 + name.substring(5, iIndexOf) + '-' + name.substring(i);
                    }
                }
                if (str != null) {
                    threadCurrentThread.setName(str);
                }
                this.b.run();
                return;
            case 17:
                Object obj9 = this.b;
                syd sydVar = new syd(obj9, 3);
                Object obj10 = this.a;
                boc bocVar = (boc) ((vwt) obj10).a;
                if (bocVar.a() == bob.a) {
                    sydVar.run();
                    return;
                }
                tdv tdvVar = new tdv(new hyl(obj9, 4), sydVar);
                avnr.i((AtomicReference) obj9, new avml(new tdt(obj10, tdvVar, 0)));
                bocVar.b(tdvVar);
                return;
            case 18:
                ((boc) ((vwt) this.b).a).c(this.a);
                return;
            case 19:
                Object obj11 = this.b;
                ((wah) obj11).startLatencyActionSpan("DataPushSharedEnvironmentInit");
                meg.a();
                axfd axfdVar = (axfd) this.a;
                BlocksRuntimeProxy.setJsModuleCache((JSModuleCache) axfdVar.c.io());
                BlocksRuntimeProxy.setExecutorRegistry((ExecutorRegistry) axfdVar.d.io());
                BlocksRuntimeProxy.setLogger((BlocksLogger) obj11);
                return;
            default:
                this.b.remove(this.a);
                return;
        }
    }

    public /* synthetic */ lph(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ lph(Object obj, Object obj2, int i, char[] cArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }

    public lph(lpf lpfVar, Callable callable, int i) {
        this.$cid = i;
        this.a = lpfVar;
        this.b = callable;
    }
}
