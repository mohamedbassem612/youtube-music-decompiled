package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class edj extends edl {
    private final BroadcastReceiver e;

    public edj(Context context, axfd axfdVar) {
        super(context, axfdVar);
        this.e = new edi(this);
    }

    public abstract IntentFilter a();

    public abstract void c(Intent intent);

    @Override // defpackage.edl
    public final void d() {
        dzf.b();
        int i = edk.a;
        getClass().getSimpleName();
        this.a.registerReceiver(this.e, a());
    }

    @Override // defpackage.edl
    public final void e() {
        dzf.b();
        int i = edk.a;
        getClass().getSimpleName();
        this.a.unregisterReceiver(this.e);
    }
}
