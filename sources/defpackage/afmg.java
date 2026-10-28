package defpackage;

import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afmg extends awom implements CoroutineExceptionHandler {
    private final CoroutineExceptionHandler a;
    private final CoroutineExceptionHandler b;
    private final aunn d;

    public afmg(CoroutineExceptionHandler coroutineExceptionHandler, CoroutineExceptionHandler coroutineExceptionHandler2, aunn aunnVar) {
        super(CoroutineExceptionHandler.c);
        this.a = coroutineExceptionHandler;
        this.b = coroutineExceptionHandler2;
        this.d = aunnVar;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(awou awouVar, Throwable th) {
        awouVar.getClass();
        th.getClass();
        ((Boolean) this.d.io()).booleanValue();
        this.b.handleException(awouVar, th);
    }
}
