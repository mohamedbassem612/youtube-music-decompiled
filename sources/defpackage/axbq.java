package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class axbq extends CancellationException {
    public axbq() {
        super("Child of the scoped flow was cancelled");
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        if (awuv.a) {
            return super.fillInStackTrace();
        }
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
