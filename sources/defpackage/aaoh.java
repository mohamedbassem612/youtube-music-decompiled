package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aaoh implements acaq {
    public final zyh a;
    public final aanb b;
    private final acaq c;
    private final Executor d;
    private final tfq e;

    public aaoh(acaq acaqVar, Executor executor, tfq tfqVar, aanb aanbVar, zyh zyhVar) {
        acaqVar.getClass();
        this.c = acaqVar;
        executor.getClass();
        this.d = executor;
        tfqVar.getClass();
        this.e = tfqVar;
        aanbVar.getClass();
        this.b = aanbVar;
        this.a = zyhVar;
    }

    @Override // defpackage.acaq
    public final void a(acap acapVar, sxu sxuVar) {
        if (!this.e.i() || acapVar.a.h) {
            this.d.execute(new aapc(this, acapVar, sxuVar, 1));
        } else {
            this.c.a(acapVar, sxuVar);
        }
    }

    @Override // defpackage.acaq
    public final void b(acap acapVar, sxu sxuVar) {
        this.c.b(acapVar, sxuVar);
    }
}
