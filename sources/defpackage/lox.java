package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lox implements lpb, low, lov, los {
    private final /* synthetic */ int $cid;
    public final lpf a;
    public final Object b;
    private final Executor c;

    public lox(Executor executor, Object obj, lpf lpfVar, int i) {
        this.$cid = i;
        this.c = executor;
        this.b = obj;
        this.a = lpfVar;
    }

    @Override // defpackage.lpb
    public final void a() {
        if (this.$cid == 0) {
            throw new UnsupportedOperationException();
        }
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.lpb
    public final void b(lpa lpaVar) {
        if (this.$cid != 0) {
            this.c.execute(new ihq(this, lpaVar, 17, (short[]) null));
        } else {
            this.c.execute(new lph(this, lpaVar, 1));
        }
    }

    @Override // defpackage.los
    public final void c() {
        int i = this.$cid;
        lpf lpfVar = this.a;
        if (i != 0) {
            lpfVar.v();
        } else {
            lpfVar.v();
        }
    }

    @Override // defpackage.lov
    public final void d(Exception exc) {
        int i = this.$cid;
        lpf lpfVar = this.a;
        if (i != 0) {
            lpfVar.s(exc);
        } else {
            lpfVar.s(exc);
        }
    }

    @Override // defpackage.low
    public final void e(Object obj) {
        int i = this.$cid;
        lpf lpfVar = this.a;
        if (i != 0) {
            lpfVar.t(obj);
        } else {
            lpfVar.t(obj);
        }
    }
}
