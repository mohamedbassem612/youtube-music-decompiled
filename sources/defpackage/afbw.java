package defpackage;

import android.util.StateSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class afbw implements afbj {
    public final int a;
    public final afbk b;
    public final int[][] c;
    public final afbk[] d;

    public afbw(acb acbVar) {
        this.a = acbVar.a;
        this.b = (afbk) acbVar.d;
        this.c = (int[][]) acbVar.c;
        this.d = (afbk[]) acbVar.b;
    }

    private final int e(int[] iArr) {
        for (int i = 0; i < this.a; i++) {
            if (StateSet.stateSetMatches(this.c[i], iArr)) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.afbj
    public final afbk a() {
        return this.b;
    }

    @Override // defpackage.afbj
    public final afbk b(int[] iArr) {
        int iE = e(iArr);
        if (iE < 0) {
            iE = e(StateSet.WILD_CARD);
        }
        return this.d[iE];
    }

    @Override // defpackage.afbj
    public final afbk c(float f) {
        return this.b.c(f);
    }

    @Override // defpackage.afbj
    public final boolean d() {
        return this.a > 1;
    }
}
