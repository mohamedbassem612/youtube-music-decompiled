package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class awxe extends awtt implements awwv {
    public awxe(awou awouVar, boolean z) {
        super(awouVar, true, z);
    }

    @Override // defpackage.awwk
    protected final boolean K(Throwable th) {
        awrc.Q(((awtt) this).a, th);
        return true;
    }

    @Override // defpackage.awph
    public final /* bridge */ awph getCallerFrame() {
        return awuw.k(this);
    }

    @Override // defpackage.awph
    public final /* bridge */ StackTraceElement getStackTraceElement() {
        return awxb.a(this);
    }

    @Override // defpackage.awxd
    public final /* bridge */ StackTraceElement kz() {
        return awxc.b;
    }
}
