package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class efa implements awqg {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ efa(dzr dzrVar, String str, int i) {
        this.$cid = i;
        this.a = "UPDATE workspec SET state=? WHERE id=?";
        this.b = dzrVar;
        this.c = str;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [awye, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [awqk, java.lang.Object] */
    @Override // defpackage.awqg
    public final Object invoke(Object obj) {
        if (this.$cid == 0) {
            dpt dptVar = (dpt) obj;
            dptVar.getClass();
            dpb dpbVarA = dptVar.a((String) this.a);
            Object obj2 = this.c;
            try {
                dpbVarA.g(1, dms.l((dzr) this.b));
                dpbVarA.i(2, (String) obj2);
                dpbVarA.l();
                return Integer.valueOf(ape.n(dptVar));
            } finally {
                dpbVarA.close();
            }
        }
        Throwable th = (Throwable) obj;
        this.a.invoke(th);
        ?? r0 = ((djl) this.b).c;
        r0.u(th);
        while (true) {
            Object objI = r0.i();
            if (true == (objI instanceof awyh)) {
                objI = null;
            }
            if (objI == null) {
                return awmy.a;
            }
            this.c.invoke(objI, th);
        }
    }

    public /* synthetic */ efa(awqg awqgVar, djl djlVar, awqk awqkVar, int i) {
        this.$cid = i;
        this.a = awqgVar;
        this.b = djlVar;
        this.c = awqkVar;
    }
}
