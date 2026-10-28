package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afqj implements bpl {
    private final /* synthetic */ int $cid;

    public afqj(int i) {
        this.$cid = i;
    }

    @Override // defpackage.bpl
    public final bpi a(Class cls) {
        if (this.$cid != 0) {
            return new bqb();
        }
        ahno.G(afqf.class.equals(cls), "This ViewModelProvider.Factory only supports LifecycleMemoizingObserver.");
        return new afqf();
    }

    @Override // defpackage.bpl
    public final /* synthetic */ bpi b(Class cls, bpt bptVar) {
        return this.$cid != 0 ? new bqb() : a(cls);
    }

    @Override // defpackage.bpl
    public final /* synthetic */ bpi c(awsd awsdVar, bpt bptVar) {
        return this.$cid != 0 ? bnz.g(this, awsdVar, bptVar) : bnz.g(this, awsdVar, bptVar);
    }
}
