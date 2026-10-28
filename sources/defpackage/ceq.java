package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ceq implements bvs {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ cdy a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ ceq(cdy cdyVar, String str, long j, long j2, int i) {
        this.$cid = i;
        this.a = cdyVar;
        this.b = str;
        this.c = j;
        this.d = j2;
    }

    @Override // defpackage.bvs
    public final void a(Object obj) {
        if (this.$cid != 0) {
            long j = this.d;
            long j2 = this.c;
            ((cdz) obj).C(this.a, this.b, j, j2);
            return;
        }
        long j3 = this.d;
        long j4 = this.c;
        ((cdz) obj).am(this.a, this.b, j3, j4);
    }
}
