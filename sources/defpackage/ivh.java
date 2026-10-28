package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ivh extends qr {
    final /* synthetic */ ivj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ivh(ivj ivjVar) {
        super(false);
        this.a = ivjVar;
    }

    @Override // defpackage.qr
    public final void b() {
        ivj ivjVar = this.a;
        if (ivjVar.ah) {
            if (!ivjVar.Q.l(224, 45763723L, false)) {
                ivjVar.T();
            } else if (ivjVar.f()) {
                ivjVar.e(new ivf(ivjVar, 0));
            } else {
                ivjVar.T();
            }
        }
    }
}
