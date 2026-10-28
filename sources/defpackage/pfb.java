package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pfb extends pff {
    private final pdr d;
    private final String e;

    public pfb(pdr pdrVar) {
        pdrVar.getClass();
        this.d = pdrVar;
        this.e = "RPC_FETCH_LATEST_THREADS";
    }

    @Override // defpackage.qbh
    public final String d() {
        return this.e;
    }

    @Override // defpackage.pff
    public final Object g(Bundle bundle, aieu aieuVar, plx plxVar, awoq awoqVar) {
        if (plxVar == null) {
            return k();
        }
        long j = bundle.getLong("com.google.android.libraries.notifications.INTENT_EXTRA_PAGE_VERSION");
        aidy aidyVarA = aidy.a(bundle.getInt("com.google.android.libraries.notifications.NOTIFICATIONS_FETCH_REASON", aidy.FETCH_REASON_UNSPECIFIED.q));
        if (aidyVarA != null) {
            return this.d.b(plxVar, j, aidyVarA, aieuVar, awoqVar);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // defpackage.pff
    protected final String h() {
        return "FetchLatestThreadsCallback";
    }
}
