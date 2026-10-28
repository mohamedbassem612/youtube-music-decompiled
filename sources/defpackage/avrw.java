package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avrw extends avrf implements avlk {
    static final avrv[] c = new avrv[0];
    static final avrv[] d = new avrv[0];
    final AtomicBoolean e;
    final AtomicReference f;
    volatile long g;
    int h;
    Throwable i;
    volatile boolean j;
    final awax k;
    awax l;

    public avrw(avlh avlhVar) {
        super(avlhVar);
        this.e = new AtomicBoolean();
        awax awaxVar = new awax(null);
        this.k = awaxVar;
        this.l = awaxVar;
        this.f = new AtomicReference(c);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0012 A[SYNTHETIC] */
    final void aC(avrv avrvVar) {
        if (avrvVar.getAndIncrement() != 0) {
            return;
        }
        long j = avrvVar.e;
        int i = avrvVar.d;
        Object obj = avrvVar.f;
        AtomicLong atomicLong = avrvVar.c;
        axsp axspVar = avrvVar.a;
        int iAddAndGet = 1;
        while (true) {
            boolean z = this.j;
            long j2 = this.g;
            if (!z) {
                if (j2 != j) {
                }
                avrvVar.e = j;
                avrvVar.d = i;
                avrvVar.f = (awax) obj;
                iAddAndGet = avrvVar.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else if (j2 == j) {
                avrvVar.f = null;
                Throwable th = this.i;
                if (th != null) {
                    axspVar.b(th);
                    return;
                } else {
                    axspVar.kn();
                    return;
                }
            }
            long j3 = atomicLong.get();
            if (j3 == Long.MIN_VALUE) {
                avrvVar.f = null;
                return;
            }
            if (j3 != j) {
                if (i == 1) {
                    obj = ((awax) obj).b;
                }
                axspVar.kk(((awax) obj).a[0]);
                j++;
                i = 1;
            } else {
                avrvVar.e = j;
                avrvVar.d = i;
                avrvVar.f = (awax) obj;
                iAddAndGet = avrvVar.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }

    @Override // defpackage.avlh
    protected final void ar(axsp axspVar) {
        AtomicReference atomicReference;
        avrv[] avrvVarArr;
        avrv[] avrvVarArr2;
        avrv avrvVar = new avrv(axspVar, this);
        axspVar.e(avrvVar);
        do {
            atomicReference = this.f;
            avrvVarArr = (avrv[]) atomicReference.get();
            if (avrvVarArr == d) {
                break;
            }
            int length = avrvVarArr.length;
            avrvVarArr2 = new avrv[length + 1];
            System.arraycopy(avrvVarArr, 0, avrvVarArr2, 0, length);
            avrvVarArr2[length] = avrvVar;
        } while (!a.av(atomicReference, avrvVarArr, avrvVarArr2));
        AtomicBoolean atomicBoolean = this.e;
        if (atomicBoolean.get() || !atomicBoolean.compareAndSet(false, true)) {
            aC(avrvVar);
        } else {
            this.b.ap(this);
        }
    }

    @Override // defpackage.axsp
    public final void b(Throwable th) {
        if (this.j) {
            atqp.n(th);
            return;
        }
        this.i = th;
        this.j = true;
        for (avrv avrvVar : (avrv[]) this.f.getAndSet(d)) {
            aC(avrvVar);
        }
    }

    @Override // defpackage.avlk, defpackage.axsp
    public final void e(axsq axsqVar) {
        axsqVar.ko(Long.MAX_VALUE);
    }

    @Override // defpackage.axsp
    public final void kk(Object obj) {
        if (this.h == 1) {
            awax awaxVar = new awax(null);
            awaxVar.a[0] = obj;
            this.h = 1;
            this.l.b = awaxVar;
            this.l = awaxVar;
        } else {
            this.l.a[0] = obj;
            this.h = 1;
        }
        this.g++;
        for (avrv avrvVar : (avrv[]) this.f.get()) {
            aC(avrvVar);
        }
    }

    @Override // defpackage.axsp
    public final void kn() {
        this.j = true;
        for (avrv avrvVar : (avrv[]) this.f.getAndSet(d)) {
            aC(avrvVar);
        }
    }
}
