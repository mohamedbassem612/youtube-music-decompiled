package defpackage;

import com.google.research.xeno.effect.UserInteractionManager;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atwd extends UserInteractionManager implements atvg {
    public long a;
    public final ReentrantReadWriteLock b = new ReentrantReadWriteLock();

    public atwd(long j) {
        this.a = j;
        super.d(this, nativeGetUserInteractionManager(j));
    }

    @Override // defpackage.atvg
    public final void iD(atvh atvhVar) {
        this.b.readLock().lock();
        try {
            atvhVar.a(this.a);
        } finally {
            this.b.readLock().unlock();
        }
    }
}
