package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qkf implements ThreadFactory {
    private final /* synthetic */ int $cid;

    public /* synthetic */ qkf(int i) {
        this.$cid = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        if (this.$cid != 0) {
            return new Thread(runnable);
        }
        AtomicReference atomicReference = qkh.a;
        return new Thread(runnable, "ProcessStablePhenotypeFlag");
    }
}
