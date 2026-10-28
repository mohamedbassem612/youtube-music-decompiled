package defpackage;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qqc implements Closeable {
    public Closeable a;

    public qqc(Closeable closeable) {
        this.a = closeable;
    }

    public final Closeable a() {
        Closeable closeable = this.a;
        this.a = null;
        return closeable;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        Closeable closeable = this.a;
        if (closeable != null) {
            closeable.close();
        }
    }
}
