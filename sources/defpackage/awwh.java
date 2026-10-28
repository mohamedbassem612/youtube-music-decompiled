package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awwh extends awud {
    private final awwk f;

    public awwh(awoq awoqVar, awwk awwkVar) {
        super(awoqVar, 1);
        this.f = awwkVar;
    }

    @Override // defpackage.awud
    protected final String n() {
        return "AwaitContinuation";
    }

    @Override // defpackage.awud
    public final Throwable o(awwd awwdVar) {
        Throwable thD;
        Object objZ = this.f.z();
        if (!(objZ instanceof awwj) || (thD = ((awwj) objZ).d()) == null) {
            return objZ instanceof awum ? ((awum) objZ).b : awwdVar.m();
        }
        return thD;
    }
}
