package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class ahnq extends BroadcastReceiver {
    public static final AtomicReference a = new AtomicReference();
    private final Context b;

    public ahnq(Context context) {
        this.b = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (ahnr.a) {
            Iterator it = ahnr.b.values().iterator();
            while (it.hasNext()) {
                ((ahnr) it.next()).i();
            }
        }
        this.b.unregisterReceiver(this);
    }
}
