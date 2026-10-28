package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ldf extends BroadcastReceiver {
    public final lfv a;
    public boolean b;
    public boolean c;

    public ldf(lfv lfvVar) {
        this.a = lfvVar;
    }

    public final Context a() {
        return this.a.aS();
    }

    public final lcz b() {
        return this.a.aT();
    }

    public final void c() {
        lfv lfvVar = this.a;
        lfvVar.D();
        lfvVar.A();
        lfvVar.A();
        if (this.b) {
            b().k.a("Unregistering connectivity change receiver");
            this.b = false;
            this.c = false;
            try {
                a().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                b().c.b("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        lfv lfvVar = this.a;
        lfvVar.D();
        String action = intent.getAction();
        b().k.b("NetworkBroadcastReceiver received action", action);
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            b().f.b("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        boolean zC = lfvVar.l().c();
        if (this.c != zC) {
            this.c = zC;
            lfvVar.aU().j(new kcx(this, 18, null));
        }
    }
}
