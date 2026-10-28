package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afmi extends awuq implements awvb {
    private final /* synthetic */ awvb a;
    private final awuq b;

    /* JADX WARN: Multi-variable type inference failed */
    public afmi(awuq awuqVar) {
        this.a = (awvb) awuqVar;
        this.b = awuqVar;
    }

    @Override // defpackage.awuq
    public final void a(awou awouVar, Runnable runnable) {
        awouVar.getClass();
        runnable.getClass();
        this.b.a(awouVar, runnable);
    }

    @Override // defpackage.awvb
    public final awvk c(long j, Runnable runnable, awou awouVar) {
        awouVar.getClass();
        return this.a.c(j, runnable, awouVar);
    }

    @Override // defpackage.awvb
    public final void d(long j, awuc awucVar) {
        this.a.d(j, awucVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof afmi) && awrc.c(((afmi) obj).b, this.b);
    }

    @Override // defpackage.awuq
    public final boolean fX(awou awouVar) {
        awouVar.getClass();
        return !qpj.g();
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
