package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class trg {
    public final long a;

    public trg(mbc mbcVar) {
        TimeUnit timeUnit = TimeUnit.MICROSECONDS;
        long jC = mbcVar.c();
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        this.a = jC / 1000;
    }

    public trg(long j) {
        this.a = TimeUnit.MICROSECONDS.convert(j, TimeUnit.MILLISECONDS);
    }

    public trg(long j, byte[] bArr) {
        this.a = j;
    }
}
