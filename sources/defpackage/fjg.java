package defpackage;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fjg extends ThreadPoolExecutor implements AutoCloseable {
    public fjg(int i, int i2, int i3) {
        super(i, i2, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new fje(i3));
        boolean z = fna.a;
        allowCoreThreadTimeOut(false);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        a.ar(this);
    }
}
