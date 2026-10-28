package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class awzq implements awzd {
    final /* synthetic */ awri a;
    final /* synthetic */ awzd b;
    final /* synthetic */ awqk c;

    public awzq(awri awriVar, awzd awzdVar, awqk awqkVar) {
        this.a = awriVar;
        this.b = awzdVar;
        this.c = awqkVar;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.awzd
    public final Object emit(Object obj, awoq awoqVar) throws Throwable {
        awzp awzpVar;
        awzd awzdVar;
        if (awoqVar instanceof awzp) {
            awzpVar = (awzp) awoqVar;
            int i = awzpVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                awzpVar.d = i - Integer.MIN_VALUE;
            } else {
                awzpVar = new awzp(this, awoqVar);
            }
        } else {
            awzpVar = new awzp(this, awoqVar);
        }
        Object objInvoke = awzpVar.b;
        awox awoxVar = awox.a;
        int i2 = awzpVar.d;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    obj = awzpVar.a;
                    atqp.j(objInvoke);
                    if (!((Boolean) objInvoke).booleanValue()) {
                        this.a.a = true;
                        awzdVar = this.b;
                        awzpVar.a = null;
                        awzpVar.d = 3;
                        if (awzdVar.emit(obj, awzpVar) == awoxVar) {
                            return awoxVar;
                        }
                    }
                } else if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            atqp.j(objInvoke);
        } else {
            atqp.j(objInvoke);
            if (this.a.a) {
                awzd awzdVar2 = this.b;
                awzpVar.d = 1;
                if (awzdVar2.emit(obj, awzpVar) == awoxVar) {
                    return awoxVar;
                }
            } else {
                awqk awqkVar = this.c;
                awzpVar.a = obj;
                awzpVar.d = 2;
                objInvoke = awqkVar.invoke(obj, awzpVar);
                if (objInvoke == awoxVar) {
                    return awoxVar;
                }
                if (!((Boolean) objInvoke).booleanValue()) {
                    this.a.a = true;
                    awzdVar = this.b;
                    awzpVar.a = null;
                    awzpVar.d = 3;
                    if (awzdVar.emit(obj, awzpVar) == awoxVar) {
                        return awoxVar;
                    }
                }
            }
        }
        return awmy.a;
    }
}
