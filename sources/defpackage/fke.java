package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fke extends fme {
    public int[] a;
    public fik b;
    public boolean[] c;

    private final void D(int i, boolean z) {
        boolean[] zArr = this.c;
        if (zArr == null && z) {
            zArr = new boolean[9];
            this.c = zArr;
        }
        if (zArr != null) {
            zArr[i - 1] = z;
        }
    }

    private final void E(int i, float f) {
        fik fikVar = this.b;
        if (fikVar == null) {
            fikVar = new fik();
            this.b = fikVar;
        }
        fikVar.e(i, f);
    }

    @Override // defpackage.fme
    public final void a(int i, float f) {
        int[] iArr = this.a;
        if (iArr == null) {
            iArr = new int[4];
            this.a = iArr;
        }
        fgp.c(iArr, i, (int) f);
    }

    @Override // defpackage.fme, defpackage.fjb
    public final void y(int i, float f) {
        E(i, f);
        D(i, true);
    }

    @Override // defpackage.fme, defpackage.fjb
    public final void z(int i, int i2) {
        E(i, i2);
        D(i, false);
    }
}
