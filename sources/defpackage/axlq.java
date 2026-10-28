package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axlq {
    public final Object a;

    public axlq(float f) {
        this.a = Float.valueOf(f);
    }

    public final float a() {
        e(2);
        return ((Float) this.a).floatValue();
    }

    public final int b() {
        Object obj = this.a;
        if (obj instanceof Boolean) {
            return 0;
        }
        if (obj instanceof Long) {
            return 1;
        }
        if (obj instanceof Float) {
            return 2;
        }
        if (obj instanceof String) {
            return 3;
        }
        if (obj instanceof axpo) {
            return 4;
        }
        throw new IllegalStateException("Unexpected flag value type: ".concat(String.valueOf(obj.getClass().getName())));
    }

    public final long c() {
        e(1);
        return ((Long) this.a).longValue();
    }

    public final String d() {
        e(3);
        return (String) this.a;
    }

    public final void e(int i) {
        int iB = b();
        if (i != iB) {
            throw new IllegalStateException(a.bQ(iB, i, "Attempted to access flag value as ", ", but actual type is "));
        }
    }

    public final boolean f() {
        e(0);
        return ((Boolean) this.a).booleanValue();
    }

    public final String toString() {
        return this.a.toString();
    }

    public axlq(Object obj) {
        this.a = obj;
    }

    public axlq(boolean z) {
        this.a = Boolean.valueOf(z);
    }

    public axlq(long j) {
        this.a = Long.valueOf(j);
    }
}
