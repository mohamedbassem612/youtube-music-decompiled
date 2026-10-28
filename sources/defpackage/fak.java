package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fak extends fam {
    @Override // defpackage.fam
    public final float a(int i, int i2, int i3, int i4) {
        if (h) {
            return Math.min(i3 / i, i4 / i2);
        }
        int iMax = Math.max(i2 / i4, i / i3);
        if (iMax == 0) {
            return 1.0f;
        }
        return 1.0f / Integer.highestOneBit(iMax);
    }

    @Override // defpackage.fam
    public final int b(int i, int i2, int i3, int i4) {
        return h ? 2 : 1;
    }
}
