package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class bvp implements Executor {
    public final qcb a;
    private final bvq b;

    public bvp(bvq bvqVar, qcb qcbVar) {
        this.b = bvqVar;
        this.a = qcbVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.b.d(new blq(this, runnable, 9, (short[]) null));
    }
}
