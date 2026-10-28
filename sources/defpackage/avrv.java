package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avrv extends AtomicInteger implements axsq {
    private static final long serialVersionUID = 6770240836423125754L;
    final axsp a;
    final avrw b;
    final AtomicLong c = new AtomicLong();
    int d;
    long e;
    awax f;

    public avrv(axsp axspVar, avrw avrwVar) {
        this.a = axspVar;
        this.b = avrwVar;
        this.f = avrwVar.k;
    }

    @Override // defpackage.axsq
    public final void kj() {
        AtomicReference atomicReference;
        avrv[] avrvVarArr;
        avrv[] avrvVarArr2;
        if (this.c.getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
            avrw avrwVar = this.b;
            do {
                atomicReference = avrwVar.f;
                avrvVarArr = (avrv[]) atomicReference.get();
                int length = avrvVarArr.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (avrvVarArr[i] == this) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    avrvVarArr2 = avrw.c;
                } else {
                    avrv[] avrvVarArr3 = new avrv[length - 1];
                    System.arraycopy(avrvVarArr, 0, avrvVarArr3, 0, i);
                    System.arraycopy(avrvVarArr, i + 1, avrvVarArr3, i, (length - i) - 1);
                    avrvVarArr2 = avrvVarArr3;
                }
            } while (!a.av(atomicReference, avrvVarArr, avrvVarArr2));
        }
    }

    @Override // defpackage.axsq
    public final void ko(long j) {
        if (awka.h(j)) {
            atqp.C(this.c, j);
            this.b.aC(this);
        }
    }
}
