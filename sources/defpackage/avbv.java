package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avbv implements avcc {
    private final /* synthetic */ int $cid;

    public avbv(int i) {
        this.$cid = i;
    }

    @Override // defpackage.avcc
    public final /* synthetic */ int a(Object obj) {
        if (this.$cid == 0) {
            return ((avbu) obj).d();
        }
        ((avav) obj).e();
        return 5;
    }

    @Override // defpackage.avcc
    public final /* synthetic */ void b(Object obj) {
        if (this.$cid != 0) {
            ((avav) obj).d();
        } else {
            ((avbu) obj).f();
        }
    }
}
