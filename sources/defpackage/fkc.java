package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fkc extends fjq {
    int[] N;
    fik O;
    boolean[] P;

    public fkc(fhd fhdVar, fly flyVar) {
        super(fhdVar);
        fly.b(flyVar);
    }

    @Override // defpackage.fjq
    public final void T(int[] iArr, int[] iArr2, float[] fArr) {
        int[] iArr3 = new int[4];
        this.N = iArr3;
        System.arraycopy(iArr, 0, iArr3, 0, 4);
        System.arraycopy(iArr2, 0, this.d, 0, 4);
        System.arraycopy(fArr, 0, this.e, 0, 4);
        this.o = null;
    }

    @Override // defpackage.fjq
    public final /* bridge */ /* synthetic */ fji h(fjd fjdVar, fwo fwoVar, fji fjiVar) {
        return new fkd(fjdVar, g(), this, fwoVar, fjiVar);
    }

    @Override // defpackage.fjq
    protected final /* synthetic */ fme o(fwo fwoVar) {
        return new fke(fwoVar);
    }

    @Override // defpackage.fjq
    public final /* bridge */ /* synthetic */ fme p(fwo fwoVar) {
        fke fkeVar = (fke) super.p(fwoVar);
        this.N = fkeVar.a;
        this.O = fkeVar.b;
        this.P = fkeVar.c;
        return fkeVar;
    }
}
