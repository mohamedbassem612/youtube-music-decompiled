package defpackage;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class ahes extends AbstractOwnableSynchronizer implements Runnable {
    private final ahet a;

    public ahes(ahet ahetVar) {
        this.a = ahetVar;
    }

    public final void a(Thread thread) {
        super.setExclusiveOwnerThread(thread);
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
