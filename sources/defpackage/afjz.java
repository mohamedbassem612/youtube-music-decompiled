package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class afjz extends ahch {
    private afkb a;
    private final int b;

    public afjz(afkb afkbVar, int i) {
        this.a = afkbVar;
        this.b = i;
    }

    @Override // defpackage.ahch
    protected final void gH() {
        AtomicLong atomicLong;
        long j;
        int i;
        int i2;
        boolean z;
        AtomicReference atomicReference;
        afka afkaVar;
        afkb afkbVar = this.a;
        this.a = null;
        if (afkbVar != null) {
            do {
                atomicLong = afkbVar.a;
                j = atomicLong.get();
                i = (int) j;
                long j2 = j >>> 32;
                if (i == Integer.MIN_VALUE) {
                    throw new AssertionError(a.bS(j, "Refcount is: "));
                }
                i2 = (int) j2;
                z = i == -2147483647;
                if (z) {
                    i2++;
                }
            } while (!atomicLong.compareAndSet(j, (((long) i2) << 32) | (((long) (i - 1)) & 4294967295L)));
            if (z) {
                do {
                    atomicReference = afkbVar.b;
                    afkaVar = (afka) atomicReference.get();
                    if (afkaVar == null) {
                        return;
                    }
                    if (afkaVar.a > this.b) {
                        return;
                    } else {
                        afkaVar.cancel(true);
                    }
                } while (!a.aq(atomicReference, afkaVar));
            }
        }
    }

    @Override // defpackage.ahch
    protected final String jK() {
        Object obj;
        afkb afkbVar = this.a;
        if (afkbVar == null || (obj = afkbVar.d.a) == null) {
            return null;
        }
        String strCn = a.cn((byte) 93, obj, "callable=[");
        afka afkaVar = (afka) this.a.b.get();
        if (afkaVar == null) {
            return strCn;
        }
        return strCn + ", trial=[" + afkaVar.toString() + ']';
    }

    @Override // defpackage.ahch
    public final boolean setFuture(ListenableFuture listenableFuture) {
        return super.setFuture(listenableFuture);
    }
}
