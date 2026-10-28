package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avkv implements auyu {
    private final /* synthetic */ int $cid;
    public final Object a;

    public avkv(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [agfr, java.lang.Object] */
    @Override // defpackage.auyu
    public final auyt a(avbh avbhVar, auyq auyqVar, auyr auyrVar) {
        if (this.$cid == 0) {
            return new avku(this, auyrVar.a(avbhVar, auyqVar));
        }
        ((Boolean) this.a.io()).booleanValue();
        return auyrVar.a(avbhVar, auyqVar);
    }
}
