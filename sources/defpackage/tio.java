package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tio implements awqg {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public tio(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, tjm] */
    /* JADX WARN: Type inference failed for: r2v10, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [awoq, java.lang.Object] */
    @Override // defpackage.awqg
    public final /* synthetic */ Object invoke(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            this.a.a();
            return awmy.a;
        }
        if (i == 1) {
            Object obj2 = ((Object[]) this.a)[((Number) obj).intValue()];
            if (obj2 != null) {
                return (Byte) obj2;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Byte");
        }
        if (i != 2) {
            this.a.cancel(false);
            return awmy.a;
        }
        ?? r2 = this.a;
        awmy awmyVar = awmy.a;
        r2.resumeWith(awmyVar);
        return awmyVar;
    }
}
