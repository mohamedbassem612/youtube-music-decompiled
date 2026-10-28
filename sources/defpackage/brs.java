package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class brs implements bth {
    protected final btm a = new btm();

    protected brs() {
    }

    @Override // defpackage.bth
    public /* synthetic */ int a() {
        throw null;
    }

    public final int aq() {
        btn btnVarW = w();
        if (btnVarW.n()) {
            return -1;
        }
        int iL = l();
        int iAr = ar();
        I();
        return btnVarW.j(iL, iAr, false);
    }

    public final int ar() {
        int iP = p();
        if (iP == 1) {
            return 0;
        }
        return iP;
    }

    public final void as(long j) {
        h(l(), j, false);
    }

    @Override // defpackage.bth
    public final int b() {
        if (!f(16)) {
            return 0;
        }
        long jQ = q();
        long jS = s();
        if (jQ == -9223372036854775807L || jS == -9223372036854775807L) {
            return 0;
        }
        if (jS == 0) {
            return 100;
        }
        int i = bwp.a;
        long jX = afxw.X(jQ, 100L);
        return bwp.c(ahng.P((jX == Long.MAX_VALUE || jX == Long.MIN_VALUE) ? jQ / (jS / 100) : jX / jS), 0, 100);
    }

    @Override // defpackage.bth
    public final void e(bss bssVar) {
        J(agke.q(bssVar));
    }

    @Override // defpackage.bth
    public final boolean f(int i) {
        return v().a.c(i);
    }

    @Override // defpackage.bth
    public final boolean g() {
        return n() == 3 && G() && o() == 0;
    }

    public abstract void h(int i, long j, boolean z);
}
