package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class clp implements bwm {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ clp(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [bwm, java.lang.Object] */
    @Override // defpackage.bwm
    public final void a() {
        int i = this.$cid;
        Object obj = this.a;
        if (i != 0) {
            ((ckz) obj).c.b();
            this.b.a();
            return;
        }
        cls clsVar = (cls) obj;
        cav cavVar = (cav) obj;
        clsVar.s.set(cavVar.k((ccu) this.b, clsVar.r, 0));
    }
}
