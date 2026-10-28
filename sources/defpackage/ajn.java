package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ajn extends CancellationException {
    public ajn() {
        super("The coroutine was canceled because it left the composition");
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(ajo.a);
        return this;
    }
}
