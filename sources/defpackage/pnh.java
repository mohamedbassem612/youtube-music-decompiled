package defpackage;

import android.content.BroadcastReceiver;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pnh {
    private final BroadcastReceiver.PendingResult a;
    private final boolean b;
    private final int c;
    private boolean d;

    static {
        agsn.h("GnpSdk");
    }

    public pnh(BroadcastReceiver.PendingResult pendingResult, boolean z, int i) {
        this.a = pendingResult;
        this.b = z;
        this.c = i;
    }

    public final synchronized void a() {
        if (this.d) {
            return;
        }
        if (this.b) {
            this.a.setResultCode(-1);
        }
        this.a.finish();
        this.d = true;
    }

    public final String toString() {
        return "BroadcastAsyncOperation{executionId=" + this.c + '}';
    }
}
