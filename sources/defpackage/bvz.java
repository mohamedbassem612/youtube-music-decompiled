package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bvz extends BroadcastReceiver {
    public final /* synthetic */ afjq a;

    public bvz(afjq afjqVar) {
        this.a = afjqVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.e.execute(new br(this, context, 9));
    }
}
