package defpackage;

import j$.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aala {
    avmn a;
    public final ci b;
    private final wco c;
    private final zwb d;
    private final Executor e;
    private final tbt f;
    private zwa g;

    public aala(wco wcoVar, zwb zwbVar, Executor executor, tbt tbtVar, ci ciVar) {
        this.c = wcoVar;
        this.d = zwbVar;
        this.e = executor;
        this.f = tbtVar;
        this.b = ciVar;
    }

    private final void b() {
        zwa zwaVarE = this.d.e();
        if (zwaVarE.h() || Objects.equals(this.g, zwaVarE)) {
            return;
        }
        c();
        this.g = zwaVarE;
        avlr avlrVarI = this.c.b(zwaVarE).i(aqph.class);
        Executor executor = this.e;
        avmb avmbVar = awlg.a;
        this.a = avlrVarI.O(new awir(executor)).af(new xwu(this, 15));
    }

    private final void c() {
        Object obj = this.a;
        if (obj != null) {
            avnr.b((AtomicReference) obj);
            this.a = null;
            this.g = null;
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
