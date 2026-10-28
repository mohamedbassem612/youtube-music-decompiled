package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aakl {
    public final awmd a;
    public final wco b;
    public final zwb c;
    public final aakq d;
    private final tbt e;
    private final Executor f;
    private final aauk g;
    private avmn h = null;

    public aakl(awmd awmdVar, wco wcoVar, zwb zwbVar, tbt tbtVar, Executor executor, aakq aakqVar, aauk aaukVar) {
        this.a = awmdVar;
        this.b = wcoVar;
        this.c = zwbVar;
        this.e = tbtVar;
        this.f = executor;
        this.d = aakqVar;
        this.g = aaukVar;
    }

    private final synchronized void b() {
        c();
        zwa zwaVarE = this.c.e();
        if (zwaVarE.h()) {
            return;
        }
        avlr avlrVarI = this.b.b(zwaVarE).i(amtc.class);
        Executor executor = this.f;
        avmb avmbVar = awlg.a;
        this.h = avlrVarI.O(new awir(executor)).af(new xwu(this, 13));
    }

    private final synchronized void c() {
        Object obj = this.h;
        if (obj != null) {
            avnr.b((AtomicReference) obj);
            this.h = null;
        }
    }

    public final void a() {
        this.e.f(this);
        b();
        if (this.g.c().x) {
            this.f.execute(new aadm(this, 7));
        }
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
