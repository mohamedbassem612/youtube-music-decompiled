package defpackage;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ackw extends awom implements CoroutineExceptionHandler {
    final /* synthetic */ acky a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ackw(ahx ahxVar, acky ackyVar) {
        super(ahxVar);
        this.a = ackyVar;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(awou awouVar, Throwable th) {
        if (th instanceof CancellationException) {
            return;
        }
        acky ackyVar = this.a;
        synchronized (ackyVar) {
            if (ackyVar.d == null && !ackyVar.e) {
                ackyVar.e = true;
            }
        }
    }
}
