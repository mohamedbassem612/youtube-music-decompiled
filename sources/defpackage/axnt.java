package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class axnt implements ThreadFactory {
    private final /* synthetic */ int $cid;

    public axnt(int i) {
        this.$cid = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return this.$cid != 0 ? new axe(runnable) : Executors.defaultThreadFactory().newThread(new axms(runnable, 10, null));
    }
}
