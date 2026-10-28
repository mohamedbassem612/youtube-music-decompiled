package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.PowerManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class gi extends gk {
    public final PowerManager a;
    final /* synthetic */ gp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gi(gp gpVar, Context context) {
        super(gpVar);
        this.b = gpVar;
        this.a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // defpackage.gk
    public final IntentFilter a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        return intentFilter;
    }

    @Override // defpackage.gk
    public final void b() {
        this.b.V(true, true);
    }
}
