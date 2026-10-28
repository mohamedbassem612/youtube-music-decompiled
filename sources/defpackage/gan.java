package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class gan implements kwk {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public gan(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.kwk
    public final void a(int i, long j) {
        if (this.$cid != 0) {
            ((kwc) this.a).e(i, System.currentTimeMillis() - j, null, null, null);
        } else {
            ((gao) this.a).c.e(i, System.currentTimeMillis() - j, null, null, null);
        }
    }

    @Override // defpackage.kwk
    public final void b(int i, long j, String str) {
        if (this.$cid != 0) {
            ((kwc) this.a).e(i, System.currentTimeMillis() - j, null, null, str);
        } else {
            ((gao) this.a).c.e(i, System.currentTimeMillis() - j, null, null, str);
        }
    }
}
