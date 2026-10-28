package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class hlt extends hlu {
    final /* synthetic */ hlv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hlt(hlv hlvVar, hfn hfnVar) {
        super(hlvVar, hfnVar);
        this.a = hlvVar;
    }

    @Override // defpackage.hlu
    protected final /* bridge */ /* synthetic */ Object a(byte[] bArr) {
        alrc alrcVar = (alrc) this.a.g.D(bArr, alrc.a);
        if (alrcVar == null) {
            return null;
        }
        return new wqe(alrcVar, 3);
    }

    @Override // defpackage.hlu
    protected final /* synthetic */ byte[] b(Object obj) {
        return ((wqe) obj).a.toByteArray();
    }
}
