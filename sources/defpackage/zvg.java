package defpackage;

import java.util.Deque;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class zvg {
    zvf a;
    public long b;
    public boolean c;
    private final boolean d;
    private long e;
    private long f;
    private boolean g = false;
    private final int h;

    public zvg(boolean z, long j, int i, boolean z2) {
        this.c = z;
        this.h = i;
        this.d = z2;
        this.e = j;
        this.b = j;
    }

    final long a(long j) {
        long jMax = Math.max(0L, j - this.e);
        boolean z = this.c;
        if (z && (this.h != 2 || this.g)) {
            this.f += jMax;
        }
        zvf zvfVar = this.a;
        if (zvfVar != null) {
            zvfVar.f += true != z ? 0L : jMax;
            zvfVar.g -= true != z ? jMax : 0L;
            zvfVar.b += jMax;
            Deque deque = zvfVar.a;
            zve zveVar = !deque.isEmpty() ? (zve) deque.getLast() : null;
            if (zveVar == null || z != zveVar.a) {
                deque.addLast(new zve(jMax, z));
            } else {
                zveVar.b += jMax;
            }
            while (true) {
                long j2 = zvfVar.b;
                long j3 = zvfVar.c;
                if (j2 <= j3) {
                    break;
                }
                zve zveVar2 = (zve) deque.peekFirst();
                long jMin = Math.min(zvfVar.b - j3, zveVar2.b);
                zvfVar.b -= jMin;
                zvfVar.f -= true != zveVar2.a ? 0L : jMin;
                long j4 = zveVar2.b;
                if (j4 > jMin) {
                    zveVar2.b = j4 - jMin;
                } else {
                    deque.removeFirst();
                }
            }
        }
        this.e = j;
        return this.f;
    }

    public final long b(long j) {
        return j - this.b;
    }

    final void c(boolean z, long j) {
        if (this.h == 2) {
            if (z) {
                this.e = j;
            } else {
                a(j);
            }
        }
        this.g = z;
    }

    final void d(int i, int i2, int i3) {
        if (i == 100) {
            this.a = null;
        } else {
            long j = ((long) i2) * 1000;
            this.a = new zvf((((long) i) * j) / 100, j, ((long) i3) * 1000);
        }
    }

    final void e(szg szgVar, long j) {
        if (szgVar instanceof zva) {
            f(((zva) szgVar).f, j);
        }
    }

    final void f(boolean z, long j) {
        a(j);
        boolean z2 = this.d;
        if (!z2) {
            this.b = j;
        }
        zvf zvfVar = this.a;
        if (zvfVar != null && z) {
            if (zvfVar.g > 0) {
                z = false;
            } else if (zvfVar.f > zvfVar.d) {
                zvfVar.g = zvfVar.e;
                z = false;
            }
        }
        if (z2 && z != this.c) {
            this.b = j;
        }
        this.c = z;
    }
}
