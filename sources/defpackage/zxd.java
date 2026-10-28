package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zxd implements syk {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/net/ping/DelayedPingFlushTaskRunner");
    private final zxs b;

    public zxd(zxs zxsVar) {
        this.b = zxsVar;
    }

    @Override // defpackage.syk
    public final int a(Bundle bundle) {
        try {
            this.b.b();
        } catch (tmg e) {
            ((agrc) ((agrc) ((agrc) a.b()).j(e)).k("com/google/android/libraries/youtube/net/ping/DelayedPingFlushTaskRunner", "runTask", (char) 28, "DelayedPingFlushTaskRunner.java")).w("Auth failure occurred when dispatching previous stored requests: %s", e.getLocalizedMessage());
        }
        return !this.b.d() ? 2 : 0;
    }
}
