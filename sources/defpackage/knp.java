package defpackage;

import android.os.DeadObjectException;
import android.util.Log;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class knp extends knt {
    protected final kny a;

    public knp(int i, kny knyVar) {
        super(i);
        this.a = knyVar;
    }

    @Override // defpackage.knt
    public final void f(Status status) {
        try {
            this.a.i(status);
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // defpackage.knt
    public final void g(Exception exc) {
        if (k(exc)) {
            return;
        }
        try {
            this.a.i(new Status(10, exc.getClass().getSimpleName() + ": " + exc.getLocalizedMessage(), null, null));
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // defpackage.knt
    public final void h(kol kolVar) throws DeadObjectException {
        try {
            this.a.h(kolVar.b);
        } catch (RuntimeException e) {
            g(e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.knt
    public final void i(khn khnVar, boolean z) {
        kny knyVar = this.a;
        khnVar.b.put(knyVar, Boolean.valueOf(z));
        knyVar.d(new kog(khnVar, knyVar));
    }
}
