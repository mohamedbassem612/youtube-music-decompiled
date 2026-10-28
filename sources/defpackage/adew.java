package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class adew implements sxu {
    private final adfc a;
    private final asnt b;
    private final nuc c;
    private final nsl d;
    private final int e;

    public adew(adfc adfcVar, asnt asntVar, nuc nucVar, int i, nsl nslVar) {
        this.a = adfcVar;
        this.b = asntVar;
        this.c = nucVar;
        this.e = i;
        this.d = nslVar;
    }

    @Override // defpackage.sxu
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        adfc adfcVar = this.a;
        adfcVar.B = this.e;
        adfcVar.z = (byte[]) obj2;
        aecm.J(adfcVar, this.b);
    }

    @Override // defpackage.sxu
    public final /* bridge */ /* synthetic */ void iT(Object obj, Exception exc) {
        this.c.f(aslh.LOG_TYPE_INTERNAL_ERROR, this.d, exc, "Image zoom bytes load error", new Object[0]);
    }
}
