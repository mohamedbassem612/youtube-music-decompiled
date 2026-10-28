package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class axcf implements awoq, awph {
    private final awoq a;
    private final awou b;

    public axcf(awoq awoqVar, awou awouVar) {
        this.a = awoqVar;
        this.b = awouVar;
    }

    @Override // defpackage.awph
    public final awph getCallerFrame() {
        awoq awoqVar = this.a;
        if (awoqVar instanceof awph) {
            return (awph) awoqVar;
        }
        return null;
    }

    @Override // defpackage.awoq
    public final awou getContext() {
        return this.b;
    }

    @Override // defpackage.awph
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // defpackage.awoq
    public final void resumeWith(Object obj) {
        this.a.resumeWith(obj);
    }
}
