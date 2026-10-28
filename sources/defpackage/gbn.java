package defpackage;

import android.app.AppOpsManager;
import android.app.AppOpsManager$OnOpActiveChangedListener;
import android.content.Context;
import android.os.Build;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gbn {
    public static final String[] a = {"android:establish_vpn_service", "android:establish_vpn_manager"};
    public long b = 0;
    public long c = 0;
    public long d = -1;
    public boolean e = false;
    private AppOpsManager$OnOpActiveChangedListener f;
    private AppOpsManager g;

    public gbn(Context context, Executor executor, String[] strArr) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f = new oez(this, 1);
            try {
                AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
                this.g = appOpsManager;
                appOpsManager.startWatchingActive(strArr, executor, this.f);
            } catch (IllegalArgumentException | NoSuchMethodError unused) {
            }
        }
    }

    public final long a() {
        long j = this.d;
        this.d = -1L;
        return j;
    }

    public final long b() {
        if (this.e) {
            return this.c - this.b;
        }
        return -1L;
    }

    public final void c() {
        if (this.e) {
            this.c = System.currentTimeMillis();
        }
    }
}
