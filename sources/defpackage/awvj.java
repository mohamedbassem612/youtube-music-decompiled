package defpackage;

import java.util.concurrent.Future;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awvj implements awvk {
    private final Future a;

    public awvj(Future future) {
        this.a = future;
    }

    @Override // defpackage.awvk
    public final void kv() {
        this.a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.a + ']';
    }
}
