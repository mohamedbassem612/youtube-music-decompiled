package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class aunz implements AutoCloseable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ aunz(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        int i = this.$cid;
        Object obj = this.a;
        if (i != 0) {
            ((zut) obj).r.unlock();
        } else {
            ((auod) obj).a();
        }
    }
}
