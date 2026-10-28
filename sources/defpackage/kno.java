package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class kno extends knn {
    protected final kjc a;

    public kno(int i, kjc kjcVar) {
        super(i);
        this.a = kjcVar;
    }

    @Override // defpackage.knn
    public final void b(Executor executor, Runnable runnable) {
        ((lpa) this.a.a).l(executor, new kbr(runnable, 4));
    }

    protected abstract void e(kol kolVar);

    @Override // defpackage.knt
    public final void f(Status status) {
        this.a.w(new kmu(status));
    }

    @Override // defpackage.knt
    public final void g(Exception exc) {
        if (k(exc)) {
            return;
        }
        this.a.w(exc);
    }

    @Override // defpackage.knt
    public final void h(kol kolVar) throws DeadObjectException {
        try {
            e(kolVar);
        } catch (DeadObjectException e) {
            f(knt.j(e));
            throw e;
        } catch (RemoteException e2) {
            f(knt.j(e2));
        } catch (RuntimeException e3) {
            g(e3);
        }
    }

    @Override // defpackage.knt
    public void i(khn khnVar, boolean z) {
    }
}
