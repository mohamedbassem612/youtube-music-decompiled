package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class mee extends BroadcastReceiver {
    final /* synthetic */ AtomicBoolean a;
    final /* synthetic */ Context b;
    final /* synthetic */ SettableFuture c;
    final /* synthetic */ ahcx d;
    final /* synthetic */ Executor e;

    public mee(AtomicBoolean atomicBoolean, Context context, SettableFuture settableFuture, ahcx ahcxVar, Executor executor) {
        this.a = atomicBoolean;
        this.b = context;
        this.c = settableFuture;
        this.d = ahcxVar;
        this.e = executor;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.a.compareAndSet(false, true)) {
            mef.f(this.b, this);
            this.c.setFuture(ahng.s(this.d, this.e));
        }
    }
}
