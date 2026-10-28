package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axij implements axir {
    private final InputStream a;

    public axij(InputStream inputStream) {
        this.a = inputStream;
    }

    @Override // defpackage.axir, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    @Override // defpackage.axir
    public final long e(axig axigVar, long j) throws IOException {
        String message;
        try {
            if (Thread.currentThread().isInterrupted()) {
                throw new InterruptedIOException("interrupted");
            }
            axio axioVarI = axigVar.i(1);
            int i = this.a.read(axioVarI.a, axioVarI.c, (int) Math.min(8192L, 8192 - axioVarI.c));
            if (i == -1) {
                if (axioVarI.b == axioVarI.c) {
                    axigVar.a = axioVarI.a();
                    axip.b(axioVarI);
                }
                return -1L;
            }
            axioVarI.c += i;
            long j2 = i;
            axigVar.b += j2;
            return j2;
        } catch (AssertionError e) {
            int i2 = axiu.a;
            if (e.getCause() == null || (message = e.getMessage()) == null || !awrc.u(message, "getsockname failed", false)) {
                throw e;
            }
            throw new IOException(e);
        }
    }

    public final String toString() {
        return "source(" + this.a + ')';
    }
}
