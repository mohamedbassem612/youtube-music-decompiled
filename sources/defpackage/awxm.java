package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awxm extends axdv {
    private final ThreadLocal b;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public awxm(awou awouVar, awoq awoqVar) {
        awxn awxnVar = awxn.a;
        super(awouVar.get(awxnVar) == null ? awouVar.plus(awxnVar) : awouVar, awoqVar);
        this.b = new ThreadLocal();
        if (awoqVar.getContext().get(awor.j) instanceof awuq) {
            return;
        }
        Object objB = axea.b(awouVar, null);
        axea.c(awouVar, objB);
        O(awouVar, objB);
    }

    private final void Q() {
        if (this.threadLocalIsSet) {
            ThreadLocal threadLocal = this.b;
            awml awmlVar = (awml) threadLocal.get();
            if (awmlVar != null) {
                axea.c((awou) awmlVar.a, awmlVar.b);
            }
            threadLocal.remove();
        }
    }

    public final void O(awou awouVar, Object obj) {
        this.threadLocalIsSet = true;
        this.b.set(new awml(awouVar, obj));
    }

    public final boolean P() {
        boolean z = this.threadLocalIsSet && this.b.get() == null;
        this.b.remove();
        return !z;
    }

    @Override // defpackage.axdv
    public final void c() {
        Q();
    }

    @Override // defpackage.axdv, defpackage.awtt
    protected final void kA(Object obj) {
        Q();
        awoq awoqVar = this.c;
        Object objR = awrc.R(obj, awoqVar);
        awou context = awoqVar.getContext();
        Object objB = axea.b(context, null);
        awxm awxmVarC = objB != axea.a ? awup.c(awoqVar, context, objB) : null;
        try {
            awoqVar.resumeWith(objR);
        } finally {
            if (awxmVarC == null || awxmVarC.P()) {
                axea.c(context, objB);
            }
        }
    }
}
