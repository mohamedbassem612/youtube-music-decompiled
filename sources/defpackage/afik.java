package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class afik implements Executor {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Executor a;
    public final /* synthetic */ Object b;

    public /* synthetic */ afik(Object obj, Executor executor, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = executor;
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.$cid;
        int i2 = 1;
        if (i != 0) {
            if (i != 1) {
                this.b.addListener(runnable, this.a);
                return;
            } else {
                ((abhh) this.b).a.execute(new afii(this.a, runnable, 0));
                return;
            }
        }
        Executor executor = this.a;
        executor.getClass();
        runnable.getClass();
        ojf ojfVar = new ojf(runnable, i2);
        Object obj = this.b;
        ege egeVar = new ege(obj, 5);
        ahfo ahfoVar = new ahfo(ojfVar);
        egeVar.execute(ahfoVar);
        executor.execute(new lph(obj, ahfoVar, 7, (byte[]) null));
    }
}
