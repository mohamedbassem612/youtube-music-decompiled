package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ijk extends qr {
    final /* synthetic */ ijl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ijk(ijl ijlVar) {
        super(false);
        this.a = ijlVar;
    }

    @Override // defpackage.qr
    public final void b() {
        ijl ijlVar = this.a;
        if (ijlVar.aA.get()) {
            if (!ijlVar.Q.l(224, 45763723L, false)) {
                ijlVar.T();
            } else if (ijlVar.Y()) {
                ijlVar.e(new ivf(ijlVar, 1));
            } else {
                ijlVar.T();
            }
        }
    }
}
