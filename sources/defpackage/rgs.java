package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rgs implements rft {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ rgs(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.rft
    public final void a(rfs rfsVar) {
        int i = this.$cid;
        if (i == 0) {
            ((rgr) this.a).e(rfsVar);
            return;
        }
        Object obj = this.a;
        if (i != 1) {
            ((rgr) obj).e(rfsVar);
        } else {
            ((rgp) obj).j(rfsVar);
        }
    }
}
