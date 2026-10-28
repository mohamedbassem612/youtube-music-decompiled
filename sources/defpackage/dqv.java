package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dqv extends dqq {
    public static final dqv a = new dqv();
    private static final AtomicInteger b = new AtomicInteger(0);

    @Override // defpackage.dqq, java.lang.AutoCloseable
    public final void close() {
        b.set(0);
    }
}
