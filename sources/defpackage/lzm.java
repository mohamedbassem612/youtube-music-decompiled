package defpackage;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
abstract class lzm {
    final Unsafe a;

    public lzm(Unsafe unsafe) {
        this.a = unsafe;
    }

    public abstract double a(Object obj, long j);

    public abstract float b(Object obj, long j);

    public abstract void c(Object obj, long j, boolean z);

    public abstract void d(Object obj, long j, double d);

    public abstract void e(Object obj, long j, float f);

    public abstract boolean f(Object obj, long j);

    public void g() {
        throw null;
    }

    public boolean h() {
        try {
            Class<?> cls = this.a.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            cls.getMethod("getInt", Object.class, Long.TYPE);
            cls.getMethod("putInt", Object.class, Long.TYPE, Integer.TYPE);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, Long.TYPE);
            cls.getMethod("putObject", Object.class, Long.TYPE, Object.class);
            return true;
        } catch (Throwable th) {
            lzn.i(th);
            return false;
        }
    }

    public final int i(Object obj, long j) {
        return this.a.getInt(obj, j);
    }

    public final long j(Object obj, long j) {
        return this.a.getLong(obj, j);
    }

    public final void k(Object obj, long j, int i) {
        this.a.putInt(obj, j, i);
    }

    public final void l(Object obj, long j, long j2) {
        this.a.putLong(obj, j, j2);
    }
}
