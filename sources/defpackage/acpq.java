package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class acpq implements avno {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ acpq(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v22, types: [awqg, java.lang.Object] */
    @Override // defpackage.avno
    public final boolean a(Object obj) {
        switch (this.$cid) {
            case 0:
                return a.n(this.a, obj);
            case 1:
                String str = acoi.g;
                aijp lastUpdatedTimestamp = ((aqzc) obj).getLastUpdatedTimestamp();
                aijp aijpVar = ((alqc) this.a).s;
                if (aijpVar == null) {
                    aijpVar = aijp.a;
                }
                aijp aijpVar2 = aikz.a;
                return aiky.a(lastUpdatedTimestamp, aijpVar) > 0;
            case 2:
                return a.n(this.a, obj);
            case 3:
                return a.n(this.a, obj);
            case 4:
                ?? r1 = this.a;
                String str2 = actj.a;
                return a.n(r1, obj);
            case 5:
                return a.n(this.a, obj);
            case 6:
                return ((String) this.a).equals(((aeoy) obj).a);
            default:
                return a.n(this.a, obj);
        }
    }
}
