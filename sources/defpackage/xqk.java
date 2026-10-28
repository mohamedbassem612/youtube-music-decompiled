package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class xqk extends azs {
    final /* synthetic */ xql a;

    public xqk(xql xqlVar) {
        this.a = xqlVar;
    }

    @Override // defpackage.azs
    public final void B(dii diiVar, int i) {
        xql xqlVar = this.a;
        boolean zJ = xrx.j(diiVar);
        xvq xvqVar = xqlVar.g;
        if (xvqVar != null && !xvqVar.l()) {
            xqlVar.q(xvqVar);
        }
        if (xvqVar != null && xvqVar.l()) {
            xqlVar.k();
        }
        if (zJ) {
            return;
        }
        xqlVar.w.f();
    }

    @Override // defpackage.azs
    public final void t(dii diiVar) {
        xql xqlVar = this.a;
        if (xqlVar.o() && xrx.d(diiVar, xqlVar.e.a)) {
            xzm xzmVar = xqlVar.l;
            if (xzmVar != null && xqlVar.q == xzmVar.a()) {
                xqlVar.q = -1;
            }
            xqlVar.i.kk(xqlVar.d);
        }
    }
}
