package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lop implements lpb {
    public final loo a;
    public final lpf b;
    private final Executor c;

    public lop(Executor executor, loo looVar, lpf lpfVar) {
        this.c = executor;
        this.a = looVar;
        this.b = lpfVar;
    }

    @Override // defpackage.lpb
    public final void a() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.lpb
    public final void b(lpa lpaVar) {
        this.c.execute(new ihq(this, lpaVar, 16, (short[]) null));
    }
}
