package defpackage;

import android.os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class awm extends AtomicBoolean implements OutcomeReceiver {
    private final awoq a;

    public awm(awoq awoqVar) {
        super(false);
        this.a = awoqVar;
    }

    public final void onError(Throwable th) {
        th.getClass();
        if (compareAndSet(false, true)) {
            this.a.resumeWith(atqp.i(th));
        }
    }

    public final void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.a.resumeWith(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
