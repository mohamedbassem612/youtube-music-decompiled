package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class cdb {
    public final cnm a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public cdb(cnm cnmVar, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3) {
        boolean z4 = true;
        ahno.F(!z3 || z);
        if (z2 && !z) {
            z4 = false;
        }
        ahno.F(z4);
        this.a = cnmVar;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = false;
        this.g = z;
        this.h = z2;
        this.i = z3;
    }

    public final cdb a(long j) {
        return j != this.d ? new cdb(this.a, this.b, this.c, j, this.e, this.g, this.h, this.i) : this;
    }

    public final cdb b(long j, long j2) {
        return (j == this.b && j2 == this.c) ? this : new cdb(this.a, j, j2, this.d, this.e, this.g, this.h, this.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            cdb cdbVar = (cdb) obj;
            if (this.b == cdbVar.b && this.d == cdbVar.d && this.e == cdbVar.e && this.g == cdbVar.g && this.h == cdbVar.h && this.i == cdbVar.i && Objects.equals(this.a, cdbVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() + 527;
        long j = this.e;
        return (((((((((((iHashCode * 31) + ((int) this.b)) * 31) + ((int) this.d)) * 31) + ((int) j)) * 961) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0);
    }
}
