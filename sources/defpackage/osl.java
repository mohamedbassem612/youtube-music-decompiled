package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class osl implements mlt {
    public final AtomicReference a = new AtomicReference();
    public volatile Consumer b;
    private final nsl c;
    private final mzx d;
    private final String e;
    private final awmd f;
    private volatile osn g;
    private volatile Runnable h;
    private final grj i;

    public osl(nsl nslVar, ndv ndvVar, awmd awmdVar) {
        this.c = nslVar;
        this.i = nslVar.j();
        String strA = null;
        mzx mzxVar = ndvVar.a() ? (mzx) ndvVar.g().d(mzx.L) : null;
        this.d = mzxVar;
        if (mzxVar != null && mzxVar.b()) {
            strA = mzxVar.a().a();
        }
        this.e = strA;
        this.f = awmdVar;
    }

    @Override // defpackage.mlt
    public final String a() {
        return this.e;
    }

    @Override // defpackage.mlt
    public final void b() {
        if (this.b == null || this.g == null) {
            ((nuc) this.f.io()).c(aslh.LOG_TYPE_INTERNAL_ERROR, this.c, "Failed to initialize ComposableReferenceController: missing consumer or composable state", new Object[0]);
            return;
        }
        this.h = this.g.b(new kjk(this, 9));
        if (this.h == null) {
            ((nuc) this.f.io()).c(aslh.LOG_TYPE_INVALID_FIELD, this.c, "Failed to register listener for Reference: %s", this.d.a().a());
            return;
        }
        nay nayVarA = this.g.a();
        if (nayVarA != this.a.getAndSet(nayVarA)) {
            this.b.r(nayVarA);
        }
    }

    @Override // defpackage.mlt
    public final void c() {
        if (this.h != null) {
            this.h.run();
        }
    }

    @Override // defpackage.mlt
    public final nay d(Consumer consumer) {
        this.b = consumer;
        String str = this.e;
        if (str == null || str.isEmpty()) {
            ((nuc) this.f.io()).c(aslh.LOG_TYPE_MISSING_FIELD, this.c, "Failed to register listener: empty identifier", new Object[0]);
            return null;
        }
        grj grjVar = this.i;
        String strA = this.d.a().a();
        if (strA == null) {
            strA = "";
        }
        this.g = grjVar.m(strA);
        nay nayVarA = this.g.a();
        this.a.set(nayVarA);
        return nayVarA;
    }
}
