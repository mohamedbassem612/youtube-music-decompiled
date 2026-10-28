package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avti extends avmc implements avol {
    private final /* synthetic */ int $cid;
    final avlh a;
    final Object b;

    public avti(avlh avlhVar, Object obj, int i) {
        this.$cid = i;
        this.a = avlhVar;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [avno, java.lang.Object] */
    @Override // defpackage.avmc
    protected final void G(avmd avmdVar) {
        int i = this.$cid;
        ?? r1 = this.b;
        if (i != 0) {
            this.a.ap(new avrm(avmdVar, r1));
        } else {
            this.a.ap(new avth(avmdVar, r1));
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [avno, java.lang.Object] */
    @Override // defpackage.avol
    public final avlh a() {
        int i = this.$cid;
        ?? r1 = this.b;
        avlh avlhVar = this.a;
        if (i != 0) {
            avrl avrlVar = new avrl(avlhVar, r1);
            avnn avnnVar = atqp.j;
            return avrlVar;
        }
        avte avteVar = new avte(avlhVar, r1, true);
        avnn avnnVar2 = atqp.j;
        return avteVar;
    }
}
