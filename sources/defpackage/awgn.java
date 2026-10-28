package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awgn extends avmc {
    final avme a;

    public awgn(avme avmeVar) {
        this.a = avmeVar;
    }

    @Override // defpackage.avmc
    protected final void G(avmd avmdVar) {
        awgm awgmVar = new awgm(avmdVar);
        avmdVar.d(awgmVar);
        try {
            this.a.a(awgmVar);
        } catch (Throwable th) {
            avkz.a(th);
            awgmVar.a(th);
        }
    }
}
