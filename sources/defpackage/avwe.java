package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class avwe extends AtomicLong implements axsq, avmn {
    private static final long serialVersionUID = -4453897557930727610L;
    final avwi a;
    final axsp b;
    Object c;
    final AtomicLong d = new AtomicLong();
    boolean e;
    boolean f;

    public avwe(avwi avwiVar, axsp axspVar) {
        this.a = avwiVar;
        this.b = axspVar;
    }

    @Override // defpackage.avmn
    public final void dispose() {
        if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
            avwi avwiVar = this.a;
            avwiVar.g(this);
            avwiVar.d();
            this.c = null;
        }
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return get() == Long.MIN_VALUE;
    }

    @Override // defpackage.axsq
    public final void kj() {
        dispose();
    }

    @Override // defpackage.axsq
    public final void ko(long j) {
        if (!awka.h(j) || atqp.C(this, j) == Long.MIN_VALUE) {
            return;
        }
        atqp.B(this.d, j);
        avwi avwiVar = this.a;
        avwiVar.d();
        avwiVar.i.b(this);
    }
}
