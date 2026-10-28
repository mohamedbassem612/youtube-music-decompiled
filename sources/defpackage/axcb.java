package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axcb extends awpg implements awzd, awph {
    public final awzd a;
    public final awou b;
    private awou c;
    private awoq d;

    public axcb(awzd awzdVar, awou awouVar) {
        super(axby.a, awov.a);
        this.a = awzdVar;
        this.b = awouVar;
    }

    @Override // defpackage.awzd
    public final Object emit(Object obj, awoq awoqVar) {
        try {
            awou context = awoqVar.getContext();
            awro.A(context);
            awou awouVar = this.c;
            if (awouVar != context) {
                if (awouVar instanceof axbv) {
                    throw new IllegalStateException(awrc.D("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((axbv) awouVar).a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            "));
                }
                awou awouVar2 = this.b;
                if (context != awouVar2 && ((Number) context.fold(0, new acfc(this, 8))).intValue() != ((Number) awouVar2.fold(0, new akm(15))).intValue()) {
                    throw new IllegalStateException(a.bW(context, awouVar2, "Flow invariant is violated:\n\t\tFlow was collected in ", ",\n\t\tbut emission happened in ", ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead"));
                }
                this.c = context;
            }
            this.d = awoqVar;
            awql awqlVar = axcd.a;
            awzd awzdVar = this.a;
            awzdVar.getClass();
            Object objInvoke = awqlVar.invoke(awzdVar, obj, this);
            if (!awrc.c(objInvoke, awox.a)) {
                this.d = null;
            }
            if (objInvoke != awox.a) {
                return awmy.a;
            }
            awoqVar.getClass();
            return objInvoke;
        } catch (Throwable th) {
            this.c = new axbv(th, awoqVar.getContext());
            throw th;
        }
    }

    @Override // defpackage.awpe, defpackage.awph
    public final awph getCallerFrame() {
        awoq awoqVar = this.d;
        if (awoqVar instanceof awph) {
            return (awph) awoqVar;
        }
        return null;
    }

    @Override // defpackage.awpg, defpackage.awoq
    public final awou getContext() {
        awou awouVar = this.c;
        return awouVar == null ? awov.a : awouVar;
    }

    @Override // defpackage.awpe, defpackage.awph
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // defpackage.awpe
    protected final Object invokeSuspend(Object obj) {
        Throwable thA = awmn.a(obj);
        if (thA != null) {
            this.c = new axbv(thA, getContext());
        }
        awoq awoqVar = this.d;
        if (awoqVar != null) {
            awoqVar.resumeWith(obj);
        }
        return awox.a;
    }

    @Override // defpackage.awpg, defpackage.awpe
    public final void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
