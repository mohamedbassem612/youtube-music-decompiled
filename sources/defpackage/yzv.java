package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class yzv {
    final cno a;
    public final ywj b;
    public long c;
    public cml d;
    public boolean e;
    btn f;
    public long g = -1;
    final Object h = new Object();
    private final zjr i;

    public yzv(cno cnoVar, zjr zjrVar, ywj ywjVar) {
        this.a = cnoVar;
        this.i = zjrVar;
        this.c = zjrVar.v();
        this.b = ywjVar;
    }

    final long a() {
        long j = this.g;
        if (j == -1) {
            return Long.MIN_VALUE;
        }
        return j * 1000;
    }

    public final boolean b(long j) {
        zkf.a(j == this.i.v() || j >= 0);
        if (this.c == j) {
            return false;
        }
        this.c = j;
        return this.f != null;
    }

    public final boolean c(long j) {
        boolean z;
        if (j > 0) {
            z = true;
        } else if (j == -1) {
            z = true;
            j = -1;
        } else {
            z = false;
        }
        zkf.a(z);
        if (this.g == j) {
            return false;
        }
        this.g = j;
        cml cmlVar = this.d;
        if (cmlVar == null) {
            return false;
        }
        cmlVar.k(0L, a());
        return true;
    }
}
