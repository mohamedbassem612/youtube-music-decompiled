package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awku extends awkv {
    static final awkt[] b = new awkt[0];
    static final awkt[] c = new awkt[0];
    public static final /* synthetic */ int k = 0;
    final AtomicReference d;
    final ReadWriteLock e;
    final Lock f;
    final Lock g;
    final AtomicReference h;
    final AtomicReference i;
    long j;

    public awku() {
        this.h = new AtomicReference();
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.e = reentrantReadWriteLock;
        this.f = reentrantReadWriteLock.readLock();
        this.g = reentrantReadWriteLock.writeLock();
        this.d = new AtomicReference(b);
        this.i = new AtomicReference();
    }

    public static awku aC(Object obj) {
        obj.getClass();
        return new awku(obj);
    }

    public final Object aD() {
        Object obj = this.h.get();
        if (obj == awkl.COMPLETE || (obj instanceof awkj)) {
            return null;
        }
        return obj;
    }

    final void aE(awkt awktVar) {
        AtomicReference atomicReference;
        awkt[] awktVarArr;
        awkt[] awktVarArr2;
        do {
            atomicReference = this.d;
            awktVarArr = (awkt[]) atomicReference.get();
            int length = awktVarArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (awktVarArr[i] == awktVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                awktVarArr2 = b;
            } else {
                awkt[] awktVarArr3 = new awkt[length - 1];
                System.arraycopy(awktVarArr, 0, awktVarArr3, 0, i);
                System.arraycopy(awktVarArr, i + 1, awktVarArr3, i, (length - i) - 1);
                awktVarArr2 = awktVarArr3;
            }
        } while (!a.av(atomicReference, awktVarArr, awktVarArr2));
    }

    final void aF(Object obj) {
        Lock lock = this.g;
        lock.lock();
        this.j++;
        this.h.lazySet(obj);
        lock.unlock();
    }

    public final boolean aG() {
        Object obj = this.h.get();
        return (obj == null || awkl.d(obj) || (obj instanceof awkj)) ? false : true;
    }

    final awkt[] aH(Object obj) {
        AtomicReference atomicReference = this.d;
        awkt[] awktVarArr = (awkt[]) atomicReference.get();
        awkt[] awktVarArr2 = c;
        if (awktVarArr == awktVarArr2) {
            return awktVarArr;
        }
        awkt[] awktVarArr3 = (awkt[]) atomicReference.getAndSet(awktVarArr2);
        if (awktVarArr3 != awktVarArr2) {
            aF(obj);
        }
        return awktVarArr3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0086, code lost:
    
        r6.b(r0);
     */
    @Override // defpackage.avlh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void ar(defpackage.axsp r7) {
        /*
            r6 = this;
            awkt r0 = new awkt
            r0.<init>(r7, r6)
            r7.e(r0)
        L8:
            java.util.concurrent.atomic.AtomicReference r1 = r6.d
            java.lang.Object r2 = r1.get()
            awkt[] r2 = (defpackage.awkt[]) r2
            awkt[] r3 = defpackage.awku.c
            if (r2 != r3) goto L28
            java.util.concurrent.atomic.AtomicReference r6 = r6.i
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
            awkt[] r4 = new defpackage.awkt[r4]
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
            awku r6 = r0.b     // Catch: java.lang.Throwable -> L90
            java.util.concurrent.locks.Lock r7 = r6.f     // Catch: java.lang.Throwable -> L90
            r7.lock()     // Catch: java.lang.Throwable -> L90
            long r1 = r6.j     // Catch: java.lang.Throwable -> L90
            r0.h = r1     // Catch: java.lang.Throwable -> L90
            java.util.concurrent.atomic.AtomicReference r6 = r6.h     // Catch: java.lang.Throwable -> L90
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
            r6.aE(r0)
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awku.ar(axsp):void");
    }

    @Override // defpackage.axsp
    public final void b(Throwable th) {
        th.getClass();
        if (!a.av(this.i, null, th)) {
            atqp.n(th);
            return;
        }
        awkj awkjVar = new awkj(th);
        for (awkt awktVar : aH(awkjVar)) {
            awktVar.b(awkjVar, this.j);
        }
    }

    @Override // defpackage.axsp
    public final void e(axsq axsqVar) {
        if (this.i.get() != null) {
            axsqVar.kj();
        } else {
            axsqVar.ko(Long.MAX_VALUE);
        }
    }

    @Override // defpackage.axsp
    public final void kk(Object obj) {
        obj.getClass();
        if (this.i.get() == null) {
            aF(obj);
            for (awkt awktVar : (awkt[]) this.d.get()) {
                awktVar.b(obj, this.j);
            }
        }
    }

    @Override // defpackage.axsp
    public final void kn() {
        if (a.av(this.i, null, awkh.a)) {
            awkl awklVar = awkl.COMPLETE;
            for (awkt awktVar : aH(awklVar)) {
                awktVar.b(awklVar, this.j);
            }
        }
    }

    public awku(Object obj) {
        this();
        this.h.lazySet(obj);
    }
}
