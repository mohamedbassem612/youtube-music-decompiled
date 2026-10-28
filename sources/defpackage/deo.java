package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class deo implements bxk {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ deo(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.bxk
    public final void a(long j, bwb bwbVar) {
        int i = this.$cid;
        if (i == 0) {
            azz.k(j, bwbVar, (cwj[]) ((dep) this.a).d);
            return;
        }
        Object obj = this.a;
        if (i != 1) {
            azz.l(j, bwbVar, (cwj[]) ((kwq) obj).a);
        } else {
            azz.k(j, bwbVar, ((daa) obj).a);
        }
    }
}
