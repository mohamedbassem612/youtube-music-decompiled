package defpackage;

import android.content.Context;
import android.util.Size;
import j$.time.Duration;
import j$.util.Optional;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import pl.droidsonroids.gif.GifInfoHandle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rhx extends rhy {
    private final AtomicReference q;

    public rhx(Context context, UUID uuid, Size size, qwr qwrVar, Duration duration, int i, Optional optional, rjc rjcVar, rjb rjbVar, qua quaVar, qug qugVar) {
        super(context, uuid, size, qwrVar, i, optional, rjcVar, rjbVar, quaVar, qugVar);
        AtomicReference atomicReference = new AtomicReference(Duration.ZERO);
        this.q = atomicReference;
        atomicReference.set(duration);
    }

    @Override // defpackage.rhy, defpackage.rif
    protected final void f(rfs rfsVar) {
        super.f(rfsVar);
        if (this.b.get() != null || this.c.get() == null) {
            return;
        }
        this.e.set(ahbt.a((Duration) this.q.get()));
    }

    @Override // defpackage.rif, defpackage.rib
    public final boolean g() {
        Duration durationB = ahbt.b(this.e.get());
        durationB.getClass();
        return aext.i((Duration) this.q.get(), durationB);
    }

    @Override // defpackage.rif
    public final synchronized void h(Duration duration) {
        AtomicLong atomicLong = this.e;
        long jA = ahbt.a(duration);
        atomicLong.set(jA);
        axst axstVar = (axst) this.b.get();
        if (this.g.get() && axstVar != null) {
            ((GifInfoHandle) axstVar.a).h();
            long jA2 = jA % ahbt.a(Duration.ofMillis(axstVar.a()));
            int iBinarySearch = Arrays.binarySearch(this.i, jA2);
            if (iBinarySearch < 0) {
                iBinarySearch = -(iBinarySearch + 1);
            }
            this.d.set(iBinarySearch);
            this.f.set(this.i[iBinarySearch] - jA2);
            this.c.set(null);
        }
        super.h(duration);
    }

    @Override // defpackage.rif
    public final synchronized void i(Duration duration) {
        this.q.set(duration);
        super.i(duration);
    }
}
