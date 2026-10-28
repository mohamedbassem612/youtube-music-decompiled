package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axbd extends CancellationException {
    public final transient Object a;

    public axbd(Object obj) {
        super("Flow was aborted, no more elements needed");
        this.a = obj;
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
