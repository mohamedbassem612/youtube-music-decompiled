package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class oqf extends ho {
    final /* synthetic */ oon a;
    final /* synthetic */ oon b;

    public oqf(oon oonVar, oon oonVar2) {
        this.a = oonVar;
        this.b = oonVar2;
    }

    @Override // defpackage.ho
    public final int a() {
        return this.b.a();
    }

    @Override // defpackage.ho
    public final int b() {
        return this.a.a();
    }

    @Override // defpackage.ho
    public final boolean c(int i, int i2) {
        return this.a.b(i).equals(this.b.b(i2));
    }

    @Override // defpackage.ho
    public final boolean d(int i, int i2) {
        atgg atggVarB = this.a.b(i);
        atgg atggVarB2 = this.b.b(i2);
        if (ksy.aD(atggVarB.bb()) != ksy.aD(atggVarB2.bb())) {
            return false;
        }
        String strAY = atggVarB.aY();
        String strAY2 = atggVarB2.aY();
        boolean zAa = ahno.aa(strAY);
        boolean zAa2 = ahno.aa(strAY2);
        if (zAa) {
            return zAa2 && i == i2;
        }
        if (zAa2) {
            return false;
        }
        return strAY.equals(strAY2);
    }
}
