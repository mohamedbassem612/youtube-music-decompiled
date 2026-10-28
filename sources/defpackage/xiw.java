package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xiw implements tcq {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public /* synthetic */ xiw(wmy wmyVar, int i) {
        this.$cid = i;
        this.a = wmyVar;
    }

    @Override // defpackage.tcq
    public final void t() {
        int i = this.$cid;
        Object obj = this.a;
        if (i != 0) {
            ((wmy) obj).a = false;
        } else {
            ((xja) obj).d = 3;
        }
    }

    public xiw(xja xjaVar, int i) {
        this.$cid = i;
        this.a = xjaVar;
    }
}
