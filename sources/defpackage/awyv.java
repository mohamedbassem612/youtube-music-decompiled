package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awyv implements awzc {
    private final awqk a;

    public awyv(awqk awqkVar) {
        this.a = awqkVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.awzc
    public final Object collect(awzd awzdVar, awoq awoqVar) throws Throwable {
        awyu awyuVar;
        Throwable th;
        axcb axcbVar;
        if (awoqVar instanceof awyu) {
            awyuVar = (awyu) awoqVar;
            int i = awyuVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                awyuVar.c = i - Integer.MIN_VALUE;
            } else {
                awyuVar = new awyu(this, awoqVar);
            }
        } else {
            awyuVar = new awyu(this, awoqVar);
        }
        Object obj = awyuVar.a;
        awox awoxVar = awox.a;
        int i2 = awyuVar.c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            axcbVar = awyuVar.d;
            try {
                atqp.j(obj);
                axcbVar.releaseIntercepted();
                return awmy.a;
            } catch (Throwable th2) {
                th = th2;
                axcbVar.releaseIntercepted();
                throw th;
            }
        }
        atqp.j(obj);
        axcb axcbVar2 = new axcb(awzdVar, awyuVar.getContext());
        try {
            awyuVar.d = axcbVar2;
            awyuVar.c = 1;
            Object objInvoke = this.a.invoke(axcbVar2, awyuVar);
            if (objInvoke != awoxVar) {
                objInvoke = awmy.a;
            }
            if (objInvoke == awoxVar) {
                return awoxVar;
            }
            axcbVar = axcbVar2;
            axcbVar.releaseIntercepted();
            return awmy.a;
        } catch (Throwable th3) {
            th = th3;
            axcbVar = axcbVar2;
            axcbVar.releaseIntercepted();
            throw th;
        }
    }
}
