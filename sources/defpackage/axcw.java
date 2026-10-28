package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axcw implements awut {
    private final /* synthetic */ int $cid;
    public final awou a;

    public axcw(awou awouVar, int i) {
        this.$cid = i;
        this.a = awouVar;
    }

    @Override // defpackage.awut
    public final awou b() {
        return this.a;
    }

    public final String toString() {
        int i = this.$cid;
        awou awouVar = this.a;
        if (i != 0) {
            return "CoroutineScope(coroutineContext=" + awouVar + ')';
        }
        return "CoroutineScope(coroutineContext=" + awouVar + ')';
    }
}
