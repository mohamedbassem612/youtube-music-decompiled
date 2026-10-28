package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pfd extends pff {
    private final pdr d;
    private final String e;

    public pfd(pdr pdrVar) {
        pdrVar.getClass();
        this.d = pdrVar;
        this.e = "RPC_REMOVE_TARGET";
    }

    @Override // defpackage.qbh
    public final String d() {
        return this.e;
    }

    @Override // defpackage.pff
    public final Object g(Bundle bundle, aieu aieuVar, plx plxVar, awoq awoqVar) {
        return plxVar == null ? k() : this.d.d(plxVar, aieuVar, awoqVar);
    }

    @Override // defpackage.pff
    protected final String h() {
        return "RemoveTargetCallback";
    }
}
