package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jvg implements jvh {
    private static final AtomicInteger a = new AtomicInteger(1);

    @Override // defpackage.jvh
    public final int a() {
        return a.getAndIncrement();
    }
}
