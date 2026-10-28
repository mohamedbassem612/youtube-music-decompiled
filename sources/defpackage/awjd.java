package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awjd extends AtomicReferenceArray implements Runnable, Callable, avmn {
    static final Object a = new Object();
    static final Object b = new Object();
    static final Object c = new Object();
    static final Object d = new Object();
    private static final long serialVersionUID = -6120223772001106981L;
    final Runnable e;

    public awjd(Runnable runnable, avnq avnqVar) {
        super(3);
        this.e = runnable;
        lazySet(0, avnqVar);
    }

    public final void a(Future future) {
        Object obj;
        do {
            obj = get(1);
            if (obj == d) {
                return;
            }
            if (obj == b) {
                future.cancel(false);
                return;
            } else if (obj == c) {
                future.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        run();
        return null;
    }

    @Override // defpackage.avmn
    public final void dispose() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        while (true) {
            Object obj6 = get(1);
            obj = d;
            if (obj6 == obj || obj6 == (obj4 = b) || obj6 == (obj5 = c)) {
                break;
            }
            boolean z = get(2) != Thread.currentThread();
            if (z) {
                obj4 = obj5;
            }
            if (compareAndSet(1, obj6, obj4)) {
                if (obj6 == null) {
                    break;
                }
                ((Future) obj6).cancel(z);
                break;
            }
        }
        do {
            obj2 = get(0);
            if (obj2 == obj || obj2 == (obj3 = a) || obj2 == null) {
                return;
            }
        } while (!compareAndSet(0, obj2, obj3));
        ((avnq) obj2).d(this);
    }

    @Override // defpackage.avmn
    public final boolean f() {
        Object obj = get(0);
        return obj == a || obj == d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Object obj2;
        boolean zCompareAndSet;
        lazySet(2, Thread.currentThread());
        try {
            this.e.run();
        } catch (Throwable th) {
            try {
                atqp.n(th);
            } finally {
                lazySet(2, null);
                Object obj3 = get(0);
                if (obj3 != a && compareAndSet(0, obj3, d) && obj3 != null) {
                    ((avnq) obj3).d(this);
                }
                do {
                    obj = get(1);
                    if (obj == b || obj == c) {
                        break;
                    }
                } while (!compareAndSet(1, obj, d));
            }
        }
        lazySet(2, null);
        Object obj4 = get(0);
        if (obj4 != a && compareAndSet(0, obj4, d) && obj4 != null) {
            ((avnq) obj4).d(this);
        }
        do {
            obj = get(1);
            Object obj5 = b;
            if (obj == obj5) {
                return;
            } else {
                if (obj == obj2) {
                    return;
                }
            }
        } while (!zCompareAndSet);
    }
}
