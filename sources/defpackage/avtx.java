package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
abstract class avtx extends awjv {
    private static final long serialVersionUID = -2252972430506210021L;
    final Object[] b;
    int c;
    volatile boolean d;

    public avtx(Object[] objArr) {
        this.b = objArr;
    }

    @Override // defpackage.avot
    public final void c() {
        this.c = this.b.length;
    }

    public abstract void d();

    public abstract void f(long j);

    @Override // defpackage.avot
    public final boolean i() {
        return this.c == this.b.length;
    }

    @Override // defpackage.axsq
    public final void kj() {
        this.d = true;
    }

    @Override // defpackage.avop
    public final int kl(int i) {
        return i & 1;
    }

    @Override // defpackage.avot
    public final Object km() {
        Object[] objArr = this.b;
        int i = this.c;
        if (i == objArr.length) {
            return null;
        }
        this.c = i + 1;
        Object obj = objArr[i];
        obj.getClass();
        return obj;
    }

    @Override // defpackage.axsq
    public final void ko(long j) {
        if (awka.h(j) && atqp.B(this, j) == 0) {
            if (j == Long.MAX_VALUE) {
                d();
            } else {
                f(j);
            }
        }
    }
}
