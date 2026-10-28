package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class xvi extends xvr {
    public abstract xvv a();

    @Override // defpackage.xvr
    public abstract xvz b();

    @Override // defpackage.xvr
    public abstract String c();

    @Override // defpackage.xvr
    public abstract xwc d();

    @Override // defpackage.xvr
    public final Bundle e() {
        Bundle bundleE = super.e();
        bundleE.putBoolean("displayInAvailableList", false);
        return bundleE;
    }

    @Override // defpackage.xvr
    public final String f() {
        return "cloudPairedDevice";
    }

    @Override // defpackage.xvr
    public final boolean g(xvr xvrVar) {
        return (xvrVar instanceof xvi) && b().equals(xvrVar.b()) && d().equals(xvrVar.d());
    }

    @Override // defpackage.xvr
    public final boolean h() {
        return true;
    }

    @Override // defpackage.xvr
    public final int i() {
        return 4;
    }
}
