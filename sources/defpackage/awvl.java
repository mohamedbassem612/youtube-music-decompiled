package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awvl implements awub {
    private final /* synthetic */ int $cid;
    private final Object a;

    public awvl(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [awqg, awvk, java.lang.Object] */
    @Override // defpackage.awub
    public final void b(Throwable th) {
        int i = this.$cid;
        ?? r1 = this.a;
        if (i != 0) {
            r1.invoke(th);
        } else {
            r1.kv();
        }
    }

    public final String toString() {
        int i = this.$cid;
        Object obj = this.a;
        if (i == 0) {
            return "DisposeOnCancel[" + obj + ']';
        }
        return "CancelHandler.UserSupplied[" + awuw.a(obj) + '@' + awuw.b(this) + ']';
    }
}
