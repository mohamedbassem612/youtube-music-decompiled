package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rgt implements rgq {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ rgt(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.lang.Runnable] */
    @Override // defpackage.rgq
    public final void a(boolean z) {
        int i = this.$cid;
        if (i == 0) {
            ((rgr) this.a).d(z);
        } else if (i != 1) {
            ((rgr) this.a).d(z);
        } else {
            int i2 = rgr.b;
            this.a.run();
        }
    }
}
