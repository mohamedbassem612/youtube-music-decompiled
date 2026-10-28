package defpackage;

import java.util.concurrent.Future;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class awua implements awub {
    private final Future a;

    public awua(Future future) {
        this.a = future;
    }

    @Override // defpackage.awub
    public final void b(Throwable th) {
        this.a.cancel(false);
    }

    public final String toString() {
        return "CancelFutureOnCancel[" + this.a + ']';
    }
}
