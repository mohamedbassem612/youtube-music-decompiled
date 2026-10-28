package defpackage;

import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class afme extends awom implements CoroutineExceptionHandler {
    public static final afme a = new afme();

    private afme() {
        super(CoroutineExceptionHandler.c);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(awou awouVar, Throwable th) {
        awouVar.getClass();
        th.getClass();
        Thread threadCurrentThread = Thread.currentThread();
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = threadCurrentThread.getUncaughtExceptionHandler();
        uncaughtExceptionHandler.getClass();
        uncaughtExceptionHandler.uncaughtException(threadCurrentThread, th);
    }
}
