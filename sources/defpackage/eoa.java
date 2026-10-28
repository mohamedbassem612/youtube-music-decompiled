package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class eoa extends enu {
    public final Context o;
    public volatile int p;
    public volatile gdo q;
    private volatile ScheduledExecutorService r;
    private volatile aumu s;

    public eoa(String str, acih acihVar, Context context, eom eomVar, ExecutorService executorService, ent entVar) {
        super(str, acihVar, context, eomVar, executorService, entVar);
        this.p = 0;
        this.o = context;
    }

    private final int A(ListenableFuture listenableFuture) {
        try {
            return ((Integer) listenableFuture.get(28500L, TimeUnit.MILLISECONDS)).intValue();
        } catch (TimeoutException e) {
            y(114, 28, eoi.n);
            eov.f("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", e);
            return 0;
        } catch (Exception e2) {
            if (e2 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            y(107, 28, eoi.n);
            eov.f("BillingClientTesting", "An error occurred while retrieving billing override.", e2);
            return 0;
        }
    }

    private final synchronized void B() {
        z(27);
        try {
            try {
                if (this.s != null && this.q != null) {
                    int i = eov.a;
                    this.o.unbindService(this.s);
                    this.s = new aumu(this, 1);
                }
                this.q = null;
                ScheduledExecutorService scheduledExecutorService = this.r;
            } catch (RuntimeException e) {
                eov.f("BillingClientTesting", "There was an exception while ending Billing Override Service connection!", e);
            }
            this.p = 3;
        } catch (Throwable th) {
            this.p = 3;
            throw th;
        }
    }

    private final synchronized void C() {
        if (x()) {
            int i = eov.a;
            z(26);
            return;
        }
        int i2 = 1;
        if (this.p == 1) {
            eov.e("BillingClientTesting", "Client is already in the process of connecting to Billing Override Service.");
            return;
        }
        if (this.p == 3) {
            eov.e("BillingClientTesting", "Billing Override Service Client was already closed and can't be reused. Please create another instance.");
            eoh eohVar = eoi.a;
            y(38, 26, zi.j(-1, 0, "Billing Override Service connection is disconnected."));
            return;
        }
        this.p = 1;
        int i3 = eov.a;
        this.s = new aumu(this, 1);
        Intent intent = new Intent("com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND");
        intent.setPackage("com.google.android.apps.play.billingtestcompanion");
        Context context = this.o;
        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            i2 = 41;
        } else {
            ResolveInfo resolveInfo = listQueryIntentServices.get(0);
            if (resolveInfo.serviceInfo != null) {
                String str = resolveInfo.serviceInfo.packageName;
                String str2 = resolveInfo.serviceInfo.name;
                if (!Objects.equals(str, "com.google.android.apps.play.billingtestcompanion") || str2 == null) {
                    eov.e("BillingClientTesting", "The device doesn't have valid Play Billing Lab.");
                } else {
                    ComponentName componentName = new ComponentName(str, str2);
                    Intent intent2 = new Intent(intent);
                    intent2.setComponent(componentName);
                    if (context.bindService(intent2, this.s, 1)) {
                        return;
                    } else {
                        eov.e("BillingClientTesting", "Connection to Billing Override Service is blocked.");
                    }
                }
                i2 = 39;
            }
        }
        this.p = 0;
        eoh eohVar2 = eoi.a;
        y(i2, 26, zi.j(2, 0, "Billing Override Service unavailable on device."));
    }

    @Override // defpackage.enu
    public final eoh e(Activity activity, eob eobVar) {
        ListenableFuture listenableFutureBO;
        dwv dwvVar = new dwv(this, 2);
        egz egzVar = new egz((Object) this, (Object) activity, (Object) eobVar, 3, (byte[]) null);
        if (x()) {
            listenableFutureBO = a.bO(new enz(this, 0));
        } else {
            eov.e("BillingClientTesting", "Billing Override Service is not ready.");
            eoh eohVar = eoi.a;
            y(106, 28, zi.j(-1, 0, "Billing Override Service connection is disconnected."));
            listenableFutureBO = ahng.n(0);
        }
        int iA = A(listenableFutureBO);
        if (iA > 0) {
            eoh eohVar2 = eoi.a;
            eoh eohVarJ = zi.j(iA, 0, "Billing override value was set by a license tester.");
            y(105, 2, eohVarJ);
            dwvVar.accept(eohVarJ);
            return eohVarJ;
        }
        try {
            return (eoh) egzVar.call();
        } catch (Exception e) {
            eoh eohVar3 = eoi.e;
            y(115, 2, eohVar3);
            eov.f("BillingClientTesting", "An internal error occurred.", e);
            return eohVar3;
        }
    }

    @Override // defpackage.enu
    public final void h() {
        B();
        super.h();
    }

    @Override // defpackage.enu
    public final void o(eny enyVar) {
        C();
        super.p(enyVar, 0);
    }

    public final /* synthetic */ eoh v(Activity activity, eob eobVar) {
        return super.e(activity, eobVar);
    }

    public final /* synthetic */ void w(eoh eohVar) {
        super.s(eohVar);
    }

    public final synchronized boolean x() {
        return (this.p != 2 || this.q == null || this.s == null) ? false : true;
    }

    public final void y(int i, int i2, eoh eohVar) {
        ainy ainyVarB = eoc.b(i, i2, eohVar);
        ainyVarB.getClass();
        this.e.a(ainyVarB);
    }

    public final void z(int i) {
        ainz ainzVarD = eoc.d(i);
        ainzVarD.getClass();
        eod eodVar = this.e;
        try {
            ((eok) eodVar).g(ainzVarD, ((eok) eodVar).b);
        } catch (Throwable th) {
            eov.f("BillingLogger", "Unable to log.", th);
        }
    }
}
