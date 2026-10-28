package defpackage;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
abstract class gk {
    private BroadcastReceiver a;
    final /* synthetic */ gp c;

    public gk(gp gpVar) {
        this.c = gpVar;
    }

    public abstract IntentFilter a();

    public abstract void b();

    final void c() {
        BroadcastReceiver broadcastReceiver = this.a;
        if (broadcastReceiver != null) {
            try {
                this.c.j.unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException unused) {
            }
            this.a = null;
        }
    }

    final void d() {
        c();
        IntentFilter intentFilterA = a();
        if (intentFilterA.countActions() != 0) {
            if (this.a == null) {
                this.a = new gj(this);
            }
            gp gpVar = this.c;
            gpVar.j.registerReceiver(this.a, intentFilterA);
        }
    }
}
