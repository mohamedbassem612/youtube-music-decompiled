package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axda extends awvg implements awph, awoq {
    public final awuq a;
    public final awoq b;
    public Object c;
    public final Object d;
    public final awtr f;

    public axda(awuq awuqVar, awoq awoqVar) {
        super(-1);
        this.a = awuqVar;
        this.b = awoqVar;
        this.c = axdb.a;
        this.d = axea.a(getContext());
        this.f = new awtr(null, awts.a);
    }

    public final void a(awou awouVar, Object obj) throws awve {
        this.c = obj;
        this.e = 1;
        this.a.i(awouVar, this);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [awoq, awph] */
    @Override // defpackage.awph
    public final awph getCallerFrame() {
        return this.b;
    }

    @Override // defpackage.awoq
    public final awou getContext() {
        return this.b.getContext();
    }

    @Override // defpackage.awph
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // defpackage.awvg
    public final Object m() {
        Object obj = this.c;
        boolean z = awuv.a;
        this.c = axdb.a;
        return obj;
    }

    @Override // defpackage.awoq
    public final void resumeWith(Object obj) throws awve {
        awuq awuqVar = this.a;
        Object objS = awrc.S(obj);
        awou context = getContext();
        try {
            if (awuqVar.fX(context)) {
                this.c = objS;
                this.e = 0;
                awuq awuqVar2 = this.a;
                awou context2 = getContext();
                try {
                    awuqVar2.a(context2, this);
                    return;
                } catch (Throwable th) {
                    throw new awve(th, awuqVar2, context2);
                }
            }
            boolean z = awuv.a;
            ThreadLocal threadLocal = awxh.a;
            awvo awvoVarA = awxh.a();
            if (awvoVarA.q()) {
                this.c = objS;
                this.e = 0;
                awvoVarA.o(this);
                return;
            }
            awvoVarA.p(true);
            try {
                awou context3 = getContext();
                Object objB = axea.b(context3, this.d);
                try {
                    this.b.resumeWith(obj);
                    axea.c(context3, objB);
                    while (awvoVarA.s()) {
                    }
                } catch (Throwable th2) {
                    axea.c(context3, objB);
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    E(th3);
                } finally {
                    awvoVarA.n(true);
                }
            }
        } catch (Throwable th4) {
            throw new awve(th4, awuqVar, context);
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.a + ", " + awuw.c(this.b) + ']';
    }

    @Override // defpackage.awvg
    public final awoq q() {
        return this;
    }
}
