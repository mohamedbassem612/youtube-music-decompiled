package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class awim implements Runnable {
    private final /* synthetic */ int $cid;
    public final Object a;
    public final /* synthetic */ Object b;

    public awim(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$cid;
        if (i == 0) {
            Object obj = this.b;
            ?? r5 = this.a;
            avnr.g(((awin) r5).b, ((avmb) obj).e(r5));
            return;
        }
        if (i != 1) {
            Object obj2 = this.a;
            ((awji) obj2).d = true;
            ((awjj) this.b).a.remove(obj2);
        } else {
            avjh avjhVar = (avjh) this.b;
            avjf avjfVarB = avjhVar.b(avjhVar.r.e, false, true);
            if (avjfVarB != null) {
                avjhVar.g.execute(new aves(this, avjfVarB, 12, (short[]) null));
            }
        }
    }
}
