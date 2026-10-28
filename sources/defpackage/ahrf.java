package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ahrf implements awqg {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ long a;

    public /* synthetic */ ahrf(long j, int i) {
        this.$cid = i;
        this.a = j;
    }

    @Override // defpackage.awqg
    public final Object invoke(Object obj) {
        if (this.$cid == 0) {
            ((bhj) obj).e(ahrg.a, Long.valueOf(this.a));
            return null;
        }
        dpb dpbVarA = ((dpt) obj).a("DELETE FROM chime_thread_states WHERE modified_timestamp < ?");
        try {
            dpbVarA.g(1, this.a);
            dpbVarA.l();
            return awmy.a;
        } finally {
            dpbVarA.close();
        }
    }
}
