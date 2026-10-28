package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class kdj {
    public final long a;
    public long b;
    public long c;
    public final AtomicInteger d;
    public final int e;

    public kdj(amp ampVar) {
        this.e = ampVar.a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.a = jCurrentTimeMillis;
        this.b = jCurrentTimeMillis;
        this.d = new AtomicInteger(1);
    }
}
