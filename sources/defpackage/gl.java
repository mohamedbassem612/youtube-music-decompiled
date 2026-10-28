package defpackage;

import android.content.IntentFilter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class gl extends gk {
    final /* synthetic */ gp a;
    public final xsc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gl(gp gpVar, xsc xscVar) {
        super(gpVar);
        this.a = gpVar;
        this.b = xscVar;
    }

    @Override // defpackage.gk
    public final IntentFilter a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIME_SET");
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        intentFilter.addAction("android.intent.action.TIME_TICK");
        return intentFilter;
    }

    @Override // defpackage.gk
    public final void b() {
        this.a.V(true, true);
    }
}
