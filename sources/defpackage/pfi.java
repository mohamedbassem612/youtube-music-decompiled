package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pfi extends pff {
    private final pdr d;
    private final String e;

    public pfi(pdr pdrVar) {
        pdrVar.getClass();
        this.d = pdrVar;
        this.e = "RPC_STORE_TARGET";
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
        aier aierVarA = aier.a(bundle.getInt("com.google.android.libraries.notifications.REGISTRATION_REASON", aier.REGISTRATION_REASON_UNSPECIFIED.p));
        if (aierVarA != null) {
            return this.d.f(plxVar, aierVarA, aieuVar, awoqVar);
        }
        throw new IllegalArgumentException("Registration reason was null");
    }

    @Override // defpackage.pff
    protected final String h() {
        return "StoreTargetCallback";
    }
}
