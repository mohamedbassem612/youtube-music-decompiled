package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ll {
    long a = 0;
    ll b;

    private final void h() {
        if (this.b == null) {
            this.b = new ll();
        }
    }

    final int a(int i) {
        ll llVar = this.b;
        if (llVar == null) {
            long j = this.a;
            return i >= 64 ? Long.bitCount(j) : Long.bitCount(j & ((1 << i) - 1));
        }
        if (i < 64) {
            return Long.bitCount(this.a & ((1 << i) - 1));
        }
        return Long.bitCount(this.a) + llVar.a(i - 64);
    }

    final void b(int i) {
        if (i < 64) {
            this.a &= ~(1 << i);
            return;
        }
        ll llVar = this.b;
        if (llVar != null) {
            llVar.b(i - 64);
        }
    }

    final void c(int i, boolean z) {
        if (i >= 64) {
            h();
            this.b.c(i - 64, z);
            return;
        }
        long j = this.a;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        this.a = (j & j2) | ((j & (~j2)) << 1);
        if (z) {
            e(i);
        } else {
            b(i);
        }
        if (z2 || this.b != null) {
            h();
            this.b.c(0, z2);
        }
    }

    public final void d() {
        this.a = 0L;
        ll llVar = this.b;
        if (llVar != null) {
            llVar.d();
        }
    }

    public final void e(int i) {
        if (i < 64) {
            this.a |= 1 << i;
        } else {
            h();
            this.b.e(i - 64);
        }
    }

    final boolean f(int i) {
        if (i < 64) {
            return (this.a & (1 << i)) != 0;
        }
        h();
        return this.b.f(i - 64);
    }

    final boolean g(int i) {
        if (i >= 64) {
            h();
            return this.b.g(i - 64);
        }
        long j = 1 << i;
        long j2 = this.a;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.a = j3;
        long j4 = j - 1;
        this.a = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        ll llVar = this.b;
        if (llVar != null) {
            if (llVar.f(0)) {
                e(63);
            }
            this.b.g(0);
        }
        return z;
    }

    public final String toString() {
        if (this.b == null) {
            return Long.toBinaryString(this.a);
        }
        return this.b.toString() + "xx" + Long.toBinaryString(this.a);
    }
}
