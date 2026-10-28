package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class awjw extends awju {
    private static final long serialVersionUID = -2151279923272604993L;
    protected final axsp f;
    protected Object g;

    public awjw(axsp axspVar) {
        this.f = axspVar;
    }

    @Override // defpackage.avot
    public final void c() {
        lazySet(32);
        this.g = null;
    }

    public final void f(Object obj) {
        int i = get();
        while (i != 8) {
            if ((i & (-3)) != 0) {
                return;
            }
            if (i == 2) {
                lazySet(3);
                axsp axspVar = this.f;
                axspVar.kk(obj);
                if (get() != 4) {
                    axspVar.kn();
                    return;
                }
                return;
            }
            this.g = obj;
            if (compareAndSet(0, 1)) {
                return;
            }
            i = get();
            if (i == 4) {
                this.g = null;
                return;
            }
        }
        this.g = obj;
        lazySet(16);
        axsp axspVar2 = this.f;
        axspVar2.kk(obj);
        if (get() != 4) {
            axspVar2.kn();
        }
    }

    public final boolean g() {
        return get() == 4;
    }

    @Override // defpackage.avot
    public final boolean i() {
        return get() != 16;
    }

    public void kj() {
        set(4);
        this.g = null;
    }

    @Override // defpackage.avop
    public final int kl(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }

    @Override // defpackage.avot
    public final Object km() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        Object obj = this.g;
        this.g = null;
        return obj;
    }

    @Override // defpackage.axsq
    public final void ko(long j) {
        Object obj;
        if (awka.h(j)) {
            do {
                int i = get();
                if ((i & (-2)) != 0) {
                    return;
                }
                if (i == 1) {
                    if (!compareAndSet(1, 3) || (obj = this.g) == null) {
                        return;
                    }
                    this.g = null;
                    axsp axspVar = this.f;
                    axspVar.kk(obj);
                    if (get() != 4) {
                        axspVar.kn();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }
}
