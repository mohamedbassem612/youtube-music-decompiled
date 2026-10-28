package defpackage;

import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class bzz extends BufferedOutputStream {
    private boolean a;

    public bzz(OutputStream outputStream) {
        super(outputStream, 20480);
    }

    public final void a(OutputStream outputStream) {
        ahno.O(this.a);
        this.out = outputStream;
        this.count = 0;
        this.a = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        this.a = true;
        flush();
        th = null;
        try {
            this.out.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        if (th == null) {
            return;
        }
        int i = bwp.a;
        throw th;
    }
}
