package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awli extends awly {
    static final awlh[] a = new awlh[0];
    static final awlh[] b = new awlh[0];
    public final AtomicReference c;
    public final AtomicReference d;
    final ReadWriteLock e;
    final Lock f;
    final Lock g;
    final AtomicReference h;
    long i;

    public awli() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.e = reentrantReadWriteLock;
        this.f = reentrantReadWriteLock.readLock();
        this.g = reentrantReadWriteLock.writeLock();
        this.d = new AtomicReference(a);
        this.c = new AtomicReference();
        this.h = new AtomicReference();
    }

    public final Object au() {
        Object obj = this.c.get();
        if (obj == awkl.COMPLETE || (obj instanceof awkj)) {
            return null;
        }
        return obj;
    }

    final void av(awlh awlhVar) {
        AtomicReference atomicReference;
        awlh[] awlhVarArr;
        awlh[] awlhVarArr2;
        do {
            atomicReference = this.d;
            awlhVarArr = (awlh[]) atomicReference.get();
            int length = awlhVarArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (awlhVarArr[i] == awlhVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                awlhVarArr2 = a;
            } else {
                awlh[] awlhVarArr3 = new awlh[length - 1];
                System.arraycopy(awlhVarArr, 0, awlhVarArr3, 0, i);
                System.arraycopy(awlhVarArr, i + 1, awlhVarArr3, i, (length - i) - 1);
                awlhVarArr2 = awlhVarArr3;
            }
        } while (!a.av(atomicReference, awlhVarArr, awlhVarArr2));
    }

    final void aw(Object obj) {
        Lock lock = this.g;
        lock.lock();
        this.i++;
        this.c.lazySet(obj);
        lock.unlock();
    }

    final awlh[] ax(Object obj) {
        AtomicReference atomicReference = this.d;
        awlh[] awlhVarArr = b;
        awlh[] awlhVarArr2 = (awlh[]) atomicReference.getAndSet(awlhVarArr);
        if (awlhVarArr2 != awlhVarArr) {
            aw(obj);
        }
        return awlhVarArr2;
    }

    @Override // defpackage.avlw
    public final void b(Throwable th) {
        th.getClass();
        if (!a.av(this.h, null, th)) {
            atqp.n(th);
            return;
        }
        awkj awkjVar = new awkj(th);
        for (awlh awlhVar : ax(awkjVar)) {
            awlhVar.b(awkjVar, this.i);
        }
    }

    @Override // defpackage.avlw
    public final void d(avmn avmnVar) {
        if (this.h.get() != null) {
            avmnVar.dispose();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0086, code lost:
    
        r6.b(r0);
     */
    @Override // defpackage.avlr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void e(defpackage.avlw r7) {
        /*
            r6 = this;
            awlh r0 = new awlh
            r0.<init>(r7, r6)
            r7.d(r0)
        L8:
            java.util.concurrent.atomic.AtomicReference r1 = r6.d
            java.lang.Object r2 = r1.get()
            awlh[] r2 = (defpackage.awlh[]) r2
            awlh[] r3 = defpackage.awli.b
            if (r2 != r3) goto L28
            java.util.concurrent.atomic.AtomicReference r6 = r6.h
            java.lang.Object r6 = r6.get()
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            java.lang.Throwable r0 = defpackage.awkh.a
            if (r6 != r0) goto L24
            r7.kn()
            goto L95
        L24:
            r7.b(r6)
            goto L95
        L28:
            int r3 = r2.length
            int r4 = r3 + 1
            awlh[] r4 = new defpackage.awlh[r4]
            r5 = 0
            java.lang.System.arraycopy(r2, r5, r4, r5, r3)
            r4[r3] = r0
            boolean r1 = defpackage.a.av(r1, r2, r4)
            if (r1 == 0) goto L8
            boolean r7 = r0.g
            if (r7 != 0) goto L92
            boolean r6 = r0.g
            if (r6 != 0) goto L95
            monitor-enter(r0)
            boolean r6 = r0.g     // Catch: java.lang.Throwable -> L90
            if (r6 == 0) goto L48
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L90
            goto L95
        L48:
            boolean r6 = r0.c     // Catch: java.lang.Throwable -> L90
            if (r6 == 0) goto L4e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L90
            goto L95
        L4e:
            awli r6 = r0.b     // Catch: java.lang.Throwable -> L90
            java.util.concurrent.locks.Lock r7 = r6.f     // Catch: java.lang.Throwable -> L90
            r7.lock()     // Catch: java.lang.Throwable -> L90
            long r1 = r6.i     // Catch: java.lang.Throwable -> L90
            r0.h = r1     // Catch: java.lang.Throwable -> L90
            java.util.concurrent.atomic.AtomicReference r6 = r6.c     // Catch: java.lang.Throwable -> L90
            java.lang.Object r6 = r6.get()     // Catch: java.lang.Throwable -> L90
            r7.unlock()     // Catch: java.lang.Throwable -> L90
            r7 = 1
            if (r6 == 0) goto L67
            r1 = r7
            goto L68
        L67:
            r1 = r5
        L68:
            r0.d = r1     // Catch: java.lang.Throwable -> L90
            r0.c = r7     // Catch: java.lang.Throwable -> L90
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L90
            if (r6 == 0) goto L95
            boolean r6 = r0.a(r6)
            if (r6 != 0) goto L95
        L75:
            boolean r6 = r0.g
            if (r6 != 0) goto L95
            monitor-enter(r0)
            awkc r6 = r0.e     // Catch: java.lang.Throwable -> L8c
            if (r6 != 0) goto L82
            r0.d = r5     // Catch: java.lang.Throwable -> L8c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8c
            goto L95
        L82:
            r7 = 0
            r0.e = r7     // Catch: java.lang.Throwable -> L8c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8c
            r6.b(r0)
            goto L75
        L8a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8c
            throw r6
        L8c:
            r6 = move-exception
            goto L8a
        L8e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L90
            throw r6
        L90:
            r6 = move-exception
            goto L8e
        L92:
            r6.av(r0)
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awli.e(avlw):void");
    }

    @Override // defpackage.awly
    public final boolean f() {
        throw null;
    }

    @Override // defpackage.avlw
    public final void kk(Object obj) {
        obj.getClass();
        if (this.h.get() == null) {
            aw(obj);
            for (awlh awlhVar : (awlh[]) this.d.get()) {
                awlhVar.b(obj, this.i);
            }
        }
    }

    @Override // defpackage.avlw
    public final void kn() {
        if (a.av(this.h, null, awkh.a)) {
            awkl awklVar = awkl.COMPLETE;
            for (awlh awlhVar : ax(awklVar)) {
                awlhVar.b(awklVar, this.i);
            }
        }
    }

    public awli(Object obj) {
        this();
        AtomicReference atomicReference = this.c;
        obj.getClass();
        atomicReference.lazySet(obj);
    }
}
