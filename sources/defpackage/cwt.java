package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class cwt {
    public final cws a;
    public final cwj b;
    public final int c;
    public final int d;
    public final boolean e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public long[] m;
    public int[] n;
    private final long o;

    public cwt(int i, cws cwsVar, cwj cwjVar, boolean z) {
        this.a = cwsVar;
        this.e = z;
        int iB = cwsVar.b();
        boolean z2 = true;
        if (iB != 1) {
            if (iB == 2) {
                iB = 2;
            } else {
                z2 = false;
            }
        }
        ahno.F(z2);
        int i2 = (((i % 10) + 48) << 8) | ((i / 10) + 48);
        this.c = (iB == 2 ? 1667497984 : 1651965952) | i2;
        this.o = cwsVar.c();
        this.b = cwjVar;
        this.d = iB == 2 ? i2 | 1650720768 : -1;
        this.l = -1L;
        this.m = new long[SemanticState.LiveRegion];
        this.n = new int[SemanticState.LiveRegion];
        this.f = cwsVar.d;
    }

    private final cwa c(int i) {
        return new cwa(((long) this.n[i]) * a(1), this.m[i]);
    }

    public final long a(int i) {
        return (this.o * ((long) i)) / ((long) this.f);
    }

    public final cvx b(long j) {
        if (this.k == 0) {
            cwa cwaVar = new cwa(0L, this.l);
            return new cvx(cwaVar, cwaVar);
        }
        int iA = (int) (j / a(1));
        int iB = bwp.b(this.n, iA, true, true);
        if (this.n[iB] == iA) {
            cwa cwaVarC = c(iB);
            return new cvx(cwaVarC, cwaVarC);
        }
        cwa cwaVarC2 = c(iB);
        int i = iB + 1;
        return i < this.m.length ? new cvx(cwaVarC2, c(i)) : new cvx(cwaVarC2, cwaVarC2);
    }
}
