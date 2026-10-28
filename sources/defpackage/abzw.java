package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class abzw implements zgg {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ abzw(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.zgg
    public final String a(long j) {
        int i = this.$cid;
        if (i == 0) {
            return ((((abzz) this.a).b.b() - j) / 1000.0d) + ";su";
        }
        if (i == 1) {
            return ((((abzz) this.a).b.b() - j) / 1000.0d) + ";pi";
        }
        Object obj = this.a;
        if (i != 2) {
            return ((((acab) obj).b.b() - j) / 1000.0d) + ";pi";
        }
        return ((((acab) obj).b.b() - j) / 1000.0d) + ";su";
    }
}
