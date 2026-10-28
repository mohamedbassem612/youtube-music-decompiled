package defpackage;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mcx extends AbstractOwnableSynchronizer {
    public final void a(Thread thread) {
        setExclusiveOwnerThread(thread);
    }
}
