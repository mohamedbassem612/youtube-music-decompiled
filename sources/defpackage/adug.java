package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adug extends awpk implements awqk {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ int b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adug(aduh aduhVar, int i, awqg awqgVar, awoq awoqVar, int i2) {
        super(2, awoqVar);
        this.$cid = i2;
        this.c = aduhVar;
        this.b = i;
        this.d = awqgVar;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [awqg, java.lang.Object] */
    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        if (this.$cid != 0) {
            return new adug((String) this.d, this.b, (xsc) this.c, awoqVar, 1);
        }
        return new adug((aduh) this.c, this.b, (awqg) this.d, awoqVar, 0);
    }

    @Override // defpackage.awqk
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.$cid != 0) {
            return ((adug) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        return ((adug) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0099, code lost:
    
        if (r8 != r0) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, zwh] */
    /* JADX WARN: Type inference failed for: r8v31, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r8v8, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    @Override // defpackage.awpe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adug.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adug(String str, int i, xsc xscVar, awoq awoqVar, int i2) {
        super(2, awoqVar);
        this.$cid = i2;
        this.d = str;
        this.b = i;
        this.c = xscVar;
    }
}
