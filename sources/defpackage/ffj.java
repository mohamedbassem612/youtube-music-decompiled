package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ffj implements Executor {
    private final /* synthetic */ int $cid;

    public ffj(int i) {
        this.$cid = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.$cid;
        if (i == 0) {
            runnable.run();
        } else if (i != 1) {
            runnable.run();
        } else {
            ffs.d().post(runnable);
        }
    }
}
