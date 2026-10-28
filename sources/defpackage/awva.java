package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class awva extends awtt implements awuz, awwv {
    public awva(awou awouVar, boolean z) {
        super(awouVar, true, z);
    }

    @Override // defpackage.awuz
    public final Object c(awoq awoqVar) {
        return w(awoqVar);
    }

    @Override // defpackage.awuz
    public final Object f() {
        return kF();
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
        return awxc.c;
    }
}
