package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class awpg extends awpe {
    private final awou _context;
    private transient awoq intercepted;

    public awpg(awoq awoqVar) {
        this(awoqVar, awoqVar != null ? awoqVar.getContext() : null);
    }

    @Override // defpackage.awoq
    public awou getContext() {
        awou awouVar = this._context;
        awouVar.getClass();
        return awouVar;
    }

    public final awoq intercepted() {
        awoq awoqVarF = this.intercepted;
        if (awoqVarF == null) {
            awor aworVar = (awor) getContext().get(awor.j);
            awoqVarF = aworVar != null ? aworVar.f(this) : this;
            this.intercepted = awoqVarF;
        }
        return awoqVarF;
    }

    @Override // defpackage.awpe
    protected void releaseIntercepted() {
        awoq awoqVar = this.intercepted;
        if (awoqVar != null && awoqVar != this) {
            awos awosVar = getContext().get(awor.j);
            awosVar.getClass();
            ((awor) awosVar).g(awoqVar);
        }
        this.intercepted = awpf.a;
    }

    public awpg(awoq awoqVar, awou awouVar) {
        super(awoqVar);
        this._context = awouVar;
    }
}
