package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ccg implements bvs {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;

    public /* synthetic */ ccg(boolean z, int i) {
        this.$cid = i;
        this.a = z;
    }

    @Override // defpackage.bvs
    public final void a(Object obj) {
        if (this.$cid != 0) {
            int i = ccm.I;
            ((btf) obj).q(this.a);
        } else {
            int i2 = cch.b;
            ((btf) obj).q(this.a);
        }
    }
}
