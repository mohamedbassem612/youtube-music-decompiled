package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aavi extends BroadcastReceiver implements aavd {
    boolean a;
    private final Context b;
    private abnc c;

    public aavi(Context context) {
        this.b = context;
    }

    @Override // defpackage.aavd
    public final synchronized void a(abnc abncVar) {
        this.c = abncVar;
        if (!this.a) {
            this.b.registerReceiver(this, new IntentFilter("android.intent.action.HEADSET_PLUG"));
            this.a = true;
        }
    }

    @Override // defpackage.aavd
    public final synchronized void b(abnc abncVar) {
        if (this.a) {
            try {
                this.b.unregisterReceiver(this);
            } catch (IllegalArgumentException unused) {
                Log.w("HeadsetPlugReceiver", "Receiver already unregistered");
            }
            this.a = false;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.c == null || !intent.hasExtra("state")) {
            return;
        }
        boolean z = intent.getIntExtra("state", 1) == 1;
        abnc abncVar = this.c;
        abncVar.getClass();
        abncVar.q(z);
    }
}
