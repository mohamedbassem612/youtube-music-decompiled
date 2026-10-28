package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cej implements bvs {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ cdy a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;

    public /* synthetic */ cej(cdy cdyVar, boolean z, int i, int i2) {
        this.$cid = i2;
        this.a = cdyVar;
        this.b = z;
        this.c = i;
    }

    @Override // defpackage.bvs
    public final void a(Object obj) {
        if (this.$cid != 0) {
            int i = this.c;
            ((cdz) obj).aa(this.a, this.b, i);
        } else {
            int i2 = this.c;
            ((cdz) obj).V(this.a, this.b, i2);
        }
    }
}
