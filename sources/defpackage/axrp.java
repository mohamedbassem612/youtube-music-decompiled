package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class axrp {
    final Unsafe a;

    public axrp(Unsafe unsafe) {
        this.a = unsafe;
    }

    public abstract double a(Object obj, long j);

    public abstract float b(Object obj, long j);

    public abstract void c(Object obj, long j, boolean z);

    public abstract void d(Object obj, long j, double d);

    public abstract void e(Object obj, long j, float f);

    public abstract boolean f(Object obj, long j);

    public final int g(Object obj, long j) {
        return this.a.getInt(obj, j);
    }

    public final long h(Object obj, long j) {
        return this.a.getLong(obj, j);
    }

    public final Object i(Object obj, long j) {
        return this.a.getObject(obj, j);
    }

    public final void j(Object obj, long j, int i) {
        this.a.putInt(obj, j, i);
    }

    public final void k(Object obj, long j, long j2) {
        this.a.putLong(obj, j, j2);
    }

    public final void l(Object obj, long j, Object obj2) {
        this.a.putObject(obj, j, obj2);
    }
}
