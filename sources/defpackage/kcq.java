package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class kcq {
    private final kby a;
    public final kch g;

    static {
        new khn("Session", (String) null);
    }

    protected kcq(Context context, String str, String str2) {
        kch kchVarK;
        kby kbyVar = new kby(this, 2);
        this.a = kbyVar;
        int i = kdm.a;
        try {
            kchVarK = kdm.a(context).k(str, str2, kbyVar);
        } catch (RemoteException | kcl unused) {
            khn.e();
            kchVarK = null;
        }
        this.g = kchVarK;
    }

    public long a() {
        throw null;
    }

    protected abstract void e(boolean z);

    protected void f(Bundle bundle) {
        throw null;
    }

    protected void g(Bundle bundle) {
        throw null;
    }

    protected abstract void h(Bundle bundle);

    protected abstract void i(Bundle bundle);

    protected void j(Bundle bundle) {
        throw null;
    }

    public final int n() {
        kro.f("Must be called from the main thread.");
        kch kchVar = this.g;
        if (kchVar == null) {
            return 0;
        }
        try {
            if (kchVar.a() >= 211100000) {
                return kchVar.b();
            }
            return 0;
        } catch (RemoteException unused) {
            khn.e();
            return 0;
        }
    }

    public final kuo o() {
        kch kchVar = this.g;
        if (kchVar == null) {
            return null;
        }
        try {
            return kchVar.g();
        } catch (RemoteException unused) {
            khn.e();
            return null;
        }
    }

    protected final void p(int i) {
        kch kchVar = this.g;
        if (kchVar != null) {
            try {
                kchVar.h(i);
            } catch (RemoteException unused) {
                khn.e();
            }
        }
    }

    public final boolean q() {
        kro.f("Must be called from the main thread.");
        kch kchVar = this.g;
        if (kchVar == null) {
            return false;
        }
        try {
            return kchVar.i();
        } catch (RemoteException unused) {
            khn.e();
            return false;
        }
    }
}
