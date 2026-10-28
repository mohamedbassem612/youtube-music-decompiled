package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class awvg extends axez {
    public int e;

    public awvg(int i) {
        super(0L, false);
        this.e = i;
    }

    public final void E(Throwable th) {
        awrc.Q(q().getContext(), new awuu(a.bV(this, "Fatal exception in coroutines machinery for ", ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers"), th));
    }

    public abstract Object m();

    public Throwable p(Object obj) {
        awum awumVar = obj instanceof awum ? (awum) obj : null;
        if (awumVar != null) {
            return awumVar.b;
        }
        return null;
    }

    public abstract awoq q();

    /* JADX WARN: Type inference failed for: r1v0, types: [awoq, awph] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z = awuv.a;
        try {
            axda axdaVar = (axda) q();
            ?? r1 = axdaVar.b;
            Object obj = axdaVar.d;
            awou context = r1.getContext();
            Object objB = axea.b(context, obj);
            awwd awwdVar = null;
            awxm awxmVarC = objB != axea.a ? awup.c(r1, context, objB) : null;
            try {
                awou context2 = r1.getContext();
                Object objM = m();
                Throwable thP = p(objM);
                if (thP == null && a.az(this.e)) {
                    awwdVar = (awwd) context2.get(awwd.d);
                }
                if (awwdVar != null && !awwdVar.q()) {
                    Throwable thM = awwdVar.m();
                    C(thM);
                    if (awuv.b) {
                        thM = axdx.a(thM, r1);
                    }
                    thM.getClass();
                    r1.resumeWith(new awmm(thM));
                } else if (thP != null) {
                    r1.resumeWith(new awmm(thP));
                } else {
                    r1.resumeWith(l(objM));
                }
            } finally {
                if (awxmVarC == null || awxmVarC.P()) {
                    axea.c(context, objB);
                }
            }
        } catch (awve e) {
            awrc.Q(q().getContext(), e.a);
        } catch (Throwable th) {
            E(th);
        }
    }

    public void C(Throwable th) {
    }

    public Object l(Object obj) {
        return obj;
    }
}
