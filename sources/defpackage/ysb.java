package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ysb extends awpk implements awqk {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ysb(acsj acsjVar, zwa zwaVar, alql alqlVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.a = acsjVar;
        this.c = zwaVar;
        this.b = alqlVar;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, tjk] */
    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        int i = this.$cid;
        if (i == 0) {
            Object obj2 = this.a;
            return new ysb((ysf) obj2, (avlr) this.b, (tjk) this.c, awoqVar, 0);
        }
        if (i != 1) {
            return new ysb((acsj) this.a, (zwa) this.c, (alql) this.b, awoqVar, 2);
        }
        Object obj3 = this.b;
        return new ysb((awrm) obj3, (tkd) this.c, (Throwable) this.a, awoqVar, 1);
    }

    @Override // defpackage.awqk
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return ((ysb) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        if (i != 1) {
            return ((ysb) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        return ((ysb) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, tjk] */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.$cid;
        if (i == 0) {
            atqp.j(obj);
            ?? r3 = this.c;
            Object obj2 = this.b;
            ysf ysfVar = (ysf) this.a;
            ysfVar.h = ysfVar.e((avlr) obj2, r3);
            return awmy.a;
        }
        if (i != 1) {
            atqp.j(obj);
            Object obj3 = this.b;
            ((acsj) this.a).e(this.c, (alql) obj3);
            return awmy.a;
        }
        atqp.j(obj);
        tjm tjmVar = (tjm) ((awrm) this.b).a;
        if (tjmVar != null) {
            tjmVar.a();
        }
        ((tkd) this.c).k((Throwable) this.a);
        return awmy.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ysb(awrm awrmVar, tkd tkdVar, Throwable th, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = awrmVar;
        this.c = tkdVar;
        this.a = th;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ysb(ysf ysfVar, avlr avlrVar, tjk tjkVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.a = ysfVar;
        this.b = avlrVar;
        this.c = tjkVar;
    }
}
