package defpackage;

import java.util.TimerTask;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adtj extends TimerTask {
    final /* synthetic */ Object a;
    final /* synthetic */ acjx b;
    public final /* synthetic */ adtv c;

    public adtj(adtv adtvVar, Object obj, acjx acjxVar) {
        this.a = obj;
        this.b = acjxVar;
        this.c = adtvVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.c.am.remove(this.a);
        new acnp(this, this.b, 18).run();
    }
}
