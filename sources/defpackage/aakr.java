package defpackage;

import j$.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aakr {
    public zwa a;
    public final aanb b;
    private final wco c;
    private final zwb d;
    private final Executor e;
    private final tbt f;
    private avmn g;

    public aakr(wco wcoVar, zwb zwbVar, Executor executor, aanb aanbVar, tbt tbtVar) {
        this.c = wcoVar;
        this.d = zwbVar;
        this.e = executor;
        this.b = aanbVar;
        this.f = tbtVar;
    }

    private final void b() {
        zwa zwaVarE = this.d.e();
        if (zwaVarE.h() || Objects.equals(this.a, zwaVarE)) {
            return;
        }
        c();
        this.a = zwaVarE;
        avlr avlrVarI = this.c.b(zwaVarE).i(aohq.class);
        Executor executor = this.e;
        avmb avmbVar = awlg.a;
        this.g = avlrVarI.O(new awir(executor)).af(new xwu(this, 14));
    }

    private final void c() {
        Object obj = this.g;
        if (obj != null) {
            avnr.b((AtomicReference) obj);
            this.g = null;
            this.a = null;
        }
    }

    public final void a() {
        b();
        this.f.f(this);
    }

    @tcc
    public void handleSignInEvent(zwt zwtVar) {
        b();
    }

    @tcc
    public void handleSignOutEvent(zwu zwuVar) {
        c();
    }
}
