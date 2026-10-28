package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class knr extends knn {
    private final kpk a;
    private final kjc b;

    public knr(int i, kpk kpkVar, kjc kjcVar) {
        super(i);
        this.b = kjcVar;
        this.a = kpkVar;
        if (i == 2 && kpkVar.c) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // defpackage.knn
    public final int a(kol kolVar) {
        return this.a.d;
    }

    @Override // defpackage.knn
    public final void b(Executor executor, Runnable runnable) {
        ((lpa) this.b.a).l(executor, new kbr(runnable, 5));
    }

    @Override // defpackage.knn
    public final boolean c(kol kolVar) {
        return this.a.c;
    }

    @Override // defpackage.knn
    public final klq[] d(kol kolVar) {
        return this.a.b;
    }

    @Override // defpackage.knt
    public final void f(Status status) {
        this.b.w(kro.q(status));
    }

    @Override // defpackage.knt
    public final void g(Exception exc) {
        if (k(exc)) {
            return;
        }
        this.b.w(exc);
    }

    @Override // defpackage.knt
    public final void h(kol kolVar) throws DeadObjectException {
        try {
            this.a.a(kolVar.b, this.b);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            f(knt.j(e2));
        } catch (RuntimeException e3) {
            g(e3);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.knt
    public final void i(khn khnVar, boolean z) {
        ?? r0 = khnVar.a;
        kjc kjcVar = this.b;
        r0.put(kjcVar, Boolean.valueOf(z));
        ((lpa) kjcVar.a).o(new koh(khnVar, kjcVar));
    }
}
