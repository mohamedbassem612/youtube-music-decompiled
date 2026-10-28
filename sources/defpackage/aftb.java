package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class aftb implements afvn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ aftb(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [afun, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [afun, afvl, java.lang.Object] */
    @Override // defpackage.afvn, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.$cid;
        if (i == 0) {
            this.a.close();
            afty.k();
        } else {
            if (i == 1) {
                ((aftc) this.a).s();
                return;
            }
            ?? r2 = this.a;
            if (i == 2) {
                afty.e((afvh) afty.d.get(), r2);
            } else {
                r2.close();
                afty.k();
            }
        }
    }
}
