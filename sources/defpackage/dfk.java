package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.os.PowerManager;
import android.os.SystemClock;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dfk implements btf {
    public static final long a;
    private final Context b;
    private final long c;
    private final PowerManager.WakeLock d;
    private long e;

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        a = 300000L;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [boolean, int] */
    public dfk(Context context) {
        PowerManager.WakeLock wakeLockNewWakeLock;
        long j = a;
        ahno.F(((j > 0L ? 1 : (j == 0L ? 0 : -1)) ^ (-1)) >>> 31);
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        this.c = j;
        this.e = -9223372036854775807L;
        PowerManager powerManager = (PowerManager) applicationContext.getSystemService("power");
        if (powerManager != null) {
            wakeLockNewWakeLock = powerManager.newWakeLock(1, "WearUnsuitableOutputPlaybackSuppressionResolverListener:WakeLock");
            wakeLockNewWakeLock.setReferenceCounted(false);
        } else {
            wakeLockNewWakeLock = null;
        }
        this.d = wakeLockNewWakeLock;
    }

    private static ComponentName B(Context context, Intent intent) {
        Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(intent, 0).iterator();
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (activityInfo != null && activityInfo.applicationInfo != null && (activityInfo.applicationInfo.flags & 129) != 0) {
                return new ComponentName(activityInfo.packageName, activityInfo.name);
            }
        }
        return null;
    }

    @Override // defpackage.btf
    public final void gf(bth bthVar, bte bteVar) {
        Context context = this.b;
        if (bwp.af(context)) {
            if ((!bteVar.a(6) && !bteVar.a(5)) || !bthVar.G() || bthVar.o() != 3) {
                if (!bteVar.a(6) || bthVar.o() != 0 || this.e == -9223372036854775807L || SystemClock.elapsedRealtime() - this.e >= this.c) {
                    return;
                }
                this.e = -9223372036854775807L;
                ((brs) bthVar).A(true);
                PowerManager.WakeLock wakeLock = this.d;
                if (wakeLock != null) {
                    wakeLock.release();
                    return;
                }
                return;
            }
            ((brs) bthVar).A(false);
            this.e = SystemClock.elapsedRealtime();
            PowerManager.WakeLock wakeLock2 = this.d;
            if (wakeLock2 != null && !wakeLock2.isHeld()) {
                wakeLock2.acquire(this.c);
            }
            if (bteVar.a(5)) {
                Intent intentPutExtra = new Intent("com.android.settings.panel.action.MEDIA_OUTPUT").addFlags(268435456).putExtra("com.android.settings.panel.extra.PACKAGE_NAME", context.getPackageName());
                ComponentName componentNameB = B(context, intentPutExtra);
                if (componentNameB != null) {
                    intentPutExtra.setComponent(componentNameB);
                    context.startActivity(intentPutExtra);
                    return;
                }
                Intent intentPutExtra2 = new Intent("android.settings.BLUETOOTH_SETTINGS").addFlags(268468224).putExtra("EXTRA_CLOSE_ON_CONNECT", true).putExtra("EXTRA_CONNECTION_ONLY", true).putExtra("android.bluetooth.devicepicker.extra.FILTER_TYPE", 1);
                ComponentName componentNameB2 = B(context, intentPutExtra2);
                if (componentNameB2 != null) {
                    intentPutExtra2.setComponent(componentNameB2);
                    context.startActivity(intentPutExtra2);
                }
            }
        }
    }

    @Override // defpackage.btf
    public final /* synthetic */ void A() {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void o() {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void w() {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void x() {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void y() {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void b(int i) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void gg(boolean z) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void gh(boolean z) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void gi(bsx bsxVar) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void gk(btb btbVar) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void gl(int i) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void iE(brq brqVar) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void j(int i) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void k(bta btaVar) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void l(bta btaVar) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void p(int i) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void q(boolean z) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void s(btu btuVar) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void t(btz btzVar) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void u(float f) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void v(int i) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void z(int i) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void gj(boolean z, int i) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void m(boolean z, int i) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void r(int i, int i2) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void n(btg btgVar, btg btgVar2, int i) {
    }
}
