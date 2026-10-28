package defpackage;

import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class axeg extends axcy {
    public static final axeg a = new axeg();
    private static final ReentrantReadWriteLock b = new ReentrantReadWriteLock();
    private static final WeakHashMap c = new WeakHashMap();

    @Override // defpackage.axcy
    public final awqg a(Class cls) {
        ReentrantReadWriteLock reentrantReadWriteLock = b;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        lock.lock();
        try {
            awqg awqgVar = (awqg) c.get(cls);
            lock.unlock();
            if (awqgVar != null) {
                return awqgVar;
            }
            ReentrantReadWriteLock.ReadLock lock2 = reentrantReadWriteLock.readLock();
            int i = 0;
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i2 = 0; i2 < readHoldCount; i2++) {
                lock2.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                WeakHashMap weakHashMap = c;
                awqg awqgVarB = (awqg) weakHashMap.get(cls);
                if (awqgVarB != null) {
                    while (i < readHoldCount) {
                        lock2.lock();
                        i++;
                    }
                    writeLock.unlock();
                } else {
                    awqgVarB = axdi.b(cls);
                    weakHashMap.put(cls, awqgVarB);
                    while (i < readHoldCount) {
                        lock2.lock();
                        i++;
                    }
                    writeLock.unlock();
                }
                return awqgVarB;
            } catch (Throwable th) {
                while (i < readHoldCount) {
                    lock2.lock();
                    i++;
                }
                writeLock.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }
}
