package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qfn implements qfh {
    public final ahey a;
    public final aunn b;

    public qfn(axfd axfdVar, Context context, ahey aheyVar, aunn aunnVar, awmd awmdVar, awmd awmdVar2) {
        new AtomicBoolean(false);
        new IntentFilter("android.intent.action.BATTERY_CHANGED");
        axfdVar.V(aheyVar, aunnVar, awmdVar);
        this.a = aheyVar;
        this.b = aunnVar;
        aguu.al(new cmw(this, context, 4));
        aguu.al(new ope(awmdVar2, 15));
    }

    public final synchronized void a() {
    }

    @Override // defpackage.qfh
    public final void k() {
        ahng.q(new qca(this, 6), this.a);
    }
}
