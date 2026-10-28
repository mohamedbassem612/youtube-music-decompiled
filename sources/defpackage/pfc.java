package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pfc extends pff {
    private final pdr d;
    private final String e;
    private final tld f;

    public pfc(pdr pdrVar, tld tldVar) {
        pdrVar.getClass();
        tldVar.getClass();
        this.d = pdrVar;
        this.f = tldVar;
        this.e = "RPC_FETCH_UPDATED_THREADS";
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
        long j = bundle.getLong("com.google.android.libraries.notifications.INTENT_EXTRA_SYNC_VERSION");
        aidy aidyVarA = aidy.a(bundle.getInt("com.google.android.libraries.notifications.NOTIFICATIONS_FETCH_REASON", aidy.FETCH_REASON_UNSPECIFIED.q));
        if (aidyVarA == null) {
            throw new IllegalArgumentException("Fetch reason was null");
        }
        tld tldVar = this.f;
        tld tldVar2 = new tld();
        tldVar2.A("last_updated__version");
        tldVar2.B(">?", Long.valueOf(j));
        agke agkeVarA = ((pfv) tldVar.a).a(plxVar, agke.q(tldVar2.z()));
        agkeVarA.getClass();
        return this.d.c(plxVar, j, nxi.b(agkeVarA), aidyVarA, aieuVar, awoqVar);
    }

    @Override // defpackage.pff
    protected final String h() {
        return "FetchUpdatedThreadsCallback";
    }
}
