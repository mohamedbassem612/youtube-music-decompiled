package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awjy extends AtomicInteger implements avoq {
    private static final long serialVersionUID = -3830916580126663321L;
    final Object a;
    final axsp b;

    public awjy(axsp axspVar, Object obj) {
        this.b = axspVar;
        this.a = obj;
    }

    @Override // defpackage.avot
    public final void c() {
        lazySet(1);
    }

    @Override // defpackage.avot
    public final boolean i() {
        return get() != 0;
    }

    @Override // defpackage.avot
    public final boolean j(Object obj) {
        return a.aD();
    }

    @Override // defpackage.axsq
    public final void kj() {
        lazySet(2);
    }

    @Override // defpackage.avop
    public final int kl(int i) {
        return i & 1;
    }

    @Override // defpackage.avot
    public final Object km() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return this.a;
    }

    @Override // defpackage.axsq
    public final void ko(long j) {
        if (awka.h(j) && compareAndSet(0, 1)) {
            axsp axspVar = this.b;
            axspVar.kk(this.a);
            if (get() != 2) {
                axspVar.kn();
            }
        }
    }
}
