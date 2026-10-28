package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bwr implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bwr(Object obj, boolean z, boolean z2, int i) {
        this.$cid = i;
        this.c = obj;
        this.a = z;
        this.b = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.$cid != 0) {
            ((bwq) this.c).a.k(this.a, this.b);
        } else {
            boolean z = this.b;
            ((bwt) this.c).a.i(this.a, z);
        }
    }
}
