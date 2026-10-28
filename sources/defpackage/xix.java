package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xix implements tcr {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public /* synthetic */ xix(wmy wmyVar, int i) {
        this.$cid = i;
        this.a = wmyVar;
    }

    @Override // defpackage.tcr
    public final void a() {
        int i = this.$cid;
        Object obj = this.a;
        if (i != 0) {
            ((wmy) obj).a = true;
        } else {
            ((xja) obj).d = 2;
        }
    }

    public xix(xja xjaVar, int i) {
        this.$cid = i;
        this.a = xjaVar;
    }
}
