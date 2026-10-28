package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class hls extends hlu {
    final /* synthetic */ hlv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hls(hlv hlvVar, hfn hfnVar) {
        super(hlvVar, hfnVar);
        this.a = hlvVar;
    }

    @Override // defpackage.hlu
    protected final /* bridge */ /* synthetic */ Object a(byte[] bArr) {
        return new wtt((alya) this.a.g.D(bArr, alya.a));
    }

    @Override // defpackage.hlu
    protected final /* synthetic */ byte[] b(Object obj) {
        return ((wtt) obj).a.toByteArray();
    }
}
