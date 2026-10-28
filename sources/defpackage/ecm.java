package defpackage;

import android.net.ConnectivityManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ecm implements ecy {
    public final ConnectivityManager a;

    public ecm(ConnectivityManager connectivityManager) {
        this.a = connectivityManager;
    }

    @Override // defpackage.ecy
    public final awzc a(dyn dynVar) {
        dynVar.getClass();
        return new awyx(new ecl(dynVar, this, (awoq) null, 0));
    }

    @Override // defpackage.ecy
    public final boolean b(ees eesVar) {
        return (eesVar.l.a() == null && eesVar.l.j == 1) ? false : true;
    }

    @Override // defpackage.ecy
    public final boolean c(ees eesVar) {
        if (b(eesVar)) {
            throw new IllegalStateException("isCurrentlyConstrained() must never be called onNetworkRequestConstraintController. isCurrentlyConstrained() is called only on older platforms where NetworkRequest isn't supported");
        }
        return false;
    }
}
