package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tyc implements avll {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ tyc(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [avni, java.lang.Object] */
    @Override // defpackage.avll
    public final axso a(avlh avlhVar) {
        int i = this.$cid;
        if (i == 0) {
            return ((avlh) this.a).W(new hby(avlhVar, 15));
        }
        if (i == 1) {
            return avlhVar.S().ax().b(0, this.a);
        }
        return avlhVar.Z(((avlb) this.a).C(new Object()).g());
    }
}
