package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ifk extends awpk implements awqk {
    private final /* synthetic */ int $cid;
    Object a;
    int b;
    final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ifk(ifj ifjVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.c = ifjVar;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        int i = this.$cid;
        if (i == 0) {
            return new ifk((ifn) this.c, awoqVar, 0);
        }
        Object obj2 = this.c;
        return i != 1 ? new ifk((ycd) obj2, awoqVar, 2) : new ifk((ifj) obj2, awoqVar, 1);
    }

    @Override // defpackage.awqk
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return ((ifk) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        if (i != 1) {
            return ((ifk) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        return ((ifk) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005f  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006d, code lost:
    
        if (((defpackage.ycd) r12).c(r1, r11) != r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0111, code lost:
    
        if (r12 == r0) goto L51;
     */
    @Override // defpackage.awpe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ifk.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ifk(ifn ifnVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.c = ifnVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ifk(ycd ycdVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.c = ycdVar;
    }
}
