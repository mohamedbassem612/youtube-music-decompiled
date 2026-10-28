package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dno implements awzd {
    final /* synthetic */ awzd a;
    final /* synthetic */ dmq b;
    final /* synthetic */ awqg c;

    public dno(awzd awzdVar, dmq dmqVar, awqg awqgVar) {
        this.a = awzdVar;
        this.b = dmqVar;
        this.c = awqgVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [awzd] */
    /* JADX WARN: Type inference failed for: r6v8 */
    @Override // defpackage.awzd
    public final Object emit(Object obj, awoq awoqVar) throws Throwable {
        dnn dnnVar;
        ?? r6;
        if (awoqVar instanceof dnn) {
            dnnVar = (dnn) awoqVar;
            int i = dnnVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                dnnVar.b = i - Integer.MIN_VALUE;
            } else {
                dnnVar = new dnn(this, awoqVar);
            }
        } else {
            dnnVar = new dnn(this, awoqVar);
        }
        Object obj2 = dnnVar.a;
        awox awoxVar = awox.a;
        int i2 = dnnVar.b;
        if (i2 != 0) {
            if (i2 == 1) {
                Object obj3 = dnnVar.c;
                atqp.j(obj2);
                r6 = obj3;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                atqp.j(obj2);
            }
            return awmy.a;
        }
        atqp.j(obj2);
        awzd awzdVar = this.a;
        dmq dmqVar = this.b;
        awqg awqgVar = this.c;
        dnnVar.c = awzdVar;
        dnnVar.b = 1;
        Object objG = apb.g(dmqVar, true, false, awqgVar, dnnVar);
        if (objG == awoxVar) {
            return awoxVar;
        }
        obj2 = objG;
        r6 = awzdVar;
        dnnVar.c = null;
        dnnVar.b = 2;
        if (r6.emit(obj2, dnnVar) == awoxVar) {
            return awoxVar;
        }
        return awmy.a;
    }
}
