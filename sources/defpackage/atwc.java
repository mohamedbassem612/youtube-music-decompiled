package defpackage;

import com.google.research.xeno.effect.EventManager;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atwc extends EventManager implements atvg {
    public long d;
    public final ReentrantReadWriteLock e = new ReentrantReadWriteLock();

    public atwc(long j) {
        this.d = j;
        super.c(this, nativeGetEventManager(j));
    }

    @Override // defpackage.atvg
    public final void iD(atvh atvhVar) {
        this.e.readLock().lock();
        try {
            atvhVar.a(this.d);
        } finally {
            this.e.readLock().unlock();
        }
    }
}
