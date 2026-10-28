package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avjx implements avhw {
    private final /* synthetic */ int $cid;
    private final Object a;

    public avjx(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [avjv, java.lang.Object] */
    @Override // defpackage.avhw
    public final Object a() {
        int i = this.$cid;
        ?? r1 = this.a;
        return i == 0 ? avjw.a(r1) : r1;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [avjv, java.lang.Object] */
    @Override // defpackage.avhw
    public final void b(Object obj) throws Throwable {
        if (this.$cid == 0) {
            avjw.c(this.a, obj);
        }
    }
}
