package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class awlb extends avjt {
    static final avjt[] g = new avjt[0];
    public final AtomicReference a;
    public final AtomicReference b;
    final ReadWriteLock c;
    public final Lock d;
    public final AtomicReference e;
    public long f;

    public awlb() {
        super(null);
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.c = reentrantReadWriteLock;
        reentrantReadWriteLock.readLock();
        this.d = reentrantReadWriteLock.writeLock();
        this.b = new AtomicReference(g);
        this.a = new AtomicReference(null);
        this.e = new AtomicReference();
    }
}
