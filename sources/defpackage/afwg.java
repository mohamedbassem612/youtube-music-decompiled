package defpackage;

import java.io.Closeable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afwg implements Closeable {
    public final long a;

    public afwg(long j) {
        this.a = j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        qpj.d(new afjc(this, 5), 5000L);
    }
}
