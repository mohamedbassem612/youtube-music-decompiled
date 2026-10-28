package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mcy {
    public static final int a(long j, int i) {
        return (((int) (j >>> ((i * 6) + 43))) & 63) - 21;
    }

    public static final boolean b(long j) {
        return ((j >>> 61) & 1) == 1;
    }

    public static final boolean c(long j) {
        return ((j >>> 62) & 1) == 1;
    }

    public static final boolean d(long j) {
        return (j >>> 63) == 1;
    }

    public static /* synthetic */ long e(long j, boolean z, boolean z2, boolean z3, int i, int i2, long j2, int i3) {
        if ((i3 & 1) != 0) {
            z = d(j);
        }
        if ((i3 & 2) != 0) {
            z2 = c(j);
        }
        if ((i3 & 4) != 0) {
            z3 = b(j);
        }
        if ((i3 & 8) != 0) {
            i = a(j, 2);
        }
        int iA = (i3 & 16) != 0 ? a(j, 1) : 0;
        if ((i3 & 32) != 0) {
            i2 = a(j, 0);
        }
        if ((i3 & 64) != 0) {
            j2 = 8796093022207L & j;
        }
        return ksy.aI(z, z2, z3, i, iA, i2, j2);
    }

    public static final int f(boolean z, int i, int i2, int i3) {
        if (i2 != -21) {
            i = i2;
        }
        if (i3 == -21 || i3 > i) {
            i3 = i;
        }
        if (z) {
            return i3;
        }
        int iA = mcq.a(i3);
        if (iA <= 0 || iA > 10) {
            throw new IllegalArgumentException(a.bR(iA, "Invalid java priority: "));
        }
        return mcq.a[iA - 1];
    }

    public final boolean equals(Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
