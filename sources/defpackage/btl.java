package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class btl {
    public Object a;
    public Object b;
    public int c;
    public long d;
    public long e;
    public long f;
    public boolean g;
    public brp h = brp.a;

    static {
        bwp.a;
    }

    public final int a(int i) {
        return this.h.a(i).b;
    }

    public final int b(long j) {
        brp brpVar = this.h;
        long j2 = this.d;
        if (j == Long.MIN_VALUE) {
            return -1;
        }
        if (j2 != -9223372036854775807L && j >= j2) {
            return -1;
        }
        int i = brpVar.b;
        return -1;
    }

    public final int c(long j) {
        brp brpVar = this.h;
        int i = brpVar.b;
        brpVar.a(-1);
        return -1;
    }

    public final int d(int i) {
        return this.h.a(i).a(-1);
    }

    public final long e(int i, int i2) {
        brn brnVarA = this.h.a(i);
        if (brnVarA.b != -1) {
            return brnVarA.f[i2];
        }
        return -9223372036854775807L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass().equals(obj.getClass())) {
            btl btlVar = (btl) obj;
            if (Objects.equals(this.a, btlVar.a) && Objects.equals(this.b, btlVar.b) && this.c == btlVar.c && this.d == btlVar.d && this.f == btlVar.f && this.g == btlVar.g && Objects.equals(this.h, btlVar.h) && this.e == btlVar.e) {
                return true;
            }
        }
        return false;
    }

    public final long f() {
        return bwp.F(this.d);
    }

    public final long g() {
        return bwp.F(this.f);
    }

    public final void h() {
        long j = this.h.c;
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.b;
        return ((((((((((((((iHashCode + 217) * 31) + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.c) * 31) + a.ak(this.d)) * 31) + a.ak(this.f)) * 31) + (this.g ? 1 : 0)) * 31) + this.h.hashCode()) * 31) + a.ak(this.e);
    }

    public final void i(int i) {
        boolean z = this.h.a(i).j;
    }

    public final void j(Object obj, Object obj2, int i, long j, long j2, brp brpVar, boolean z, long j3) {
        this.a = obj;
        this.b = obj2;
        this.c = i;
        this.d = j;
        this.f = j2;
        this.h = brpVar;
        this.g = z;
        this.e = j3;
    }

    public final void k() {
        int i = this.h.b;
    }

    public final void l(int i) {
        long j = this.h.a(i).a;
    }

    @Deprecated
    public final void m(Object obj, Object obj2, long j, long j2) {
        j(obj, obj2, 0, j, j2, brp.a, false, -9223372036854775807L);
    }
}
