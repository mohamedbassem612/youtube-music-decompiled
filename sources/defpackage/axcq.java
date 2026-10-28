package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axcq extends awtt implements awwv {
    public final axcp b;

    public axcq(awou awouVar) {
        super(awouVar, true, true);
        this.b = new axcp(this);
    }

    @Override // defpackage.awph
    public final /* synthetic */ awph getCallerFrame() {
        return awuw.k(this);
    }

    @Override // defpackage.awph
    public final /* synthetic */ StackTraceElement getStackTraceElement() {
        return awxb.a(this);
    }

    @Override // defpackage.awtt
    protected final void kC(Throwable th, boolean z) {
        this.b.b(th);
    }

    @Override // defpackage.awtt
    protected final void kD(Object obj) {
        this.b.a(obj);
    }

    @Override // defpackage.awxd
    public final /* synthetic */ StackTraceElement kz() {
        return awxc.d;
    }
}
