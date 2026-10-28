package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.chromium.base.TraceEvent;
import org.chromium.net.ProxyChangeListener;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axkt extends BroadcastReceiver {
    private final ProxyChangeListener a;

    public axkt(ProxyChangeListener proxyChangeListener) {
        this.a = proxyChangeListener;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        TraceEvent traceEventC = TraceEvent.c("ProxyBroadcastReceiver#onReceive");
        try {
            if ("android.intent.action.PROXY_CHANGE".equals(intent.getAction())) {
                this.a.updateProxyConfigFromConnectivityManager(intent);
            }
            if (traceEventC != null) {
                TraceEvent.b(0L);
            }
        } catch (Throwable th) {
            if (traceEventC != null) {
                try {
                    TraceEvent.b(0L);
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
