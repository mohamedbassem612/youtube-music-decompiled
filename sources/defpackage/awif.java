package defpackage;

import app.rive.semantics.SemanticState;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awif extends AtomicReferenceArray implements avos {
    private static final Integer f = Integer.getInteger("jctools.spsc.max.lookahead.step", SemanticState.Obscured);
    private static final long serialVersionUID = -1296597691183856449L;
    final int a;
    final AtomicLong b;
    long c;
    final AtomicLong d;
    final int e;

    public awif(int i) {
        super(1 << (32 - Integer.numberOfLeadingZeros(i - 1)));
        this.a = length() - 1;
        this.b = new AtomicLong();
        this.d = new AtomicLong();
        this.e = Math.min(i / 4, f.intValue());
    }

    @Override // defpackage.avot
    public final void c() {
        while (true) {
            if (km() == null && i()) {
                return;
            }
        }
    }

    @Override // defpackage.avot
    public final boolean i() {
        return this.b.get() == this.d.get();
    }

    @Override // defpackage.avot
    public final boolean j(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        int i = this.a;
        AtomicLong atomicLong = this.b;
        long j = atomicLong.get();
        int i2 = ((int) j) & i;
        if (j >= this.c) {
            long j2 = ((long) this.e) + j;
            if (get(((int) j2) & i) == null) {
                this.c = j2;
            } else if (get(i2) != null) {
                return false;
            }
        }
        lazySet(i2, obj);
        atomicLong.lazySet(j + 1);
        return true;
    }

    @Override // defpackage.avos, defpackage.avot
    public final Object km() {
        AtomicLong atomicLong = this.d;
        long j = atomicLong.get();
        int i = ((int) j) & this.a;
        Object obj = get(i);
        if (obj == null) {
            return null;
        }
        atomicLong.lazySet(j + 1);
        lazySet(i, null);
        return obj;
    }
}
