package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adgc implements ovi {
    private final /* synthetic */ int $cid;
    public final np a;

    public adgc(np npVar, int i) {
        this.$cid = i;
        this.a = npVar;
    }

    @Override // defpackage.ovi
    public final opg a() {
        return this.$cid != 0 ? new adgb(this, 1) : new adgb(this, 0);
    }
}
