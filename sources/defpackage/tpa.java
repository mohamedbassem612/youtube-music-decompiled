package defpackage;

import java.io.InputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class tpa implements tos {
    private final InputStream a;

    public tpa(InputStream inputStream) {
        this.a = inputStream;
    }

    @Override // defpackage.tos
    public final InputStream a() {
        return this.a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        tpb.f(this.a);
    }
}
