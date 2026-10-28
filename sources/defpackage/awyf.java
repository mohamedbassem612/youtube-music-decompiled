package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class awyf extends awtt implements awye {
    public final awye b;

    public awyf(awou awouVar, awye awyeVar) {
        super(awouVar, true, true);
        this.b = awyeVar;
    }

    @Override // defpackage.awyr
    public final awxw A() {
        throw null;
    }

    @Override // defpackage.awwk
    public final void E(Throwable th) {
        awye awyeVar = this.b;
        CancellationException cancellationExceptionB = B(th, null);
        awyeVar.p(cancellationExceptionB);
        I(cancellationExceptionB);
    }

    @Override // defpackage.awyr
    public final Object d(awoq awoqVar) {
        throw null;
    }

    @Override // defpackage.awyr
    public final Object e(awoq awoqVar) {
        throw null;
    }

    @Override // defpackage.awys
    public final Object h(Object obj, awoq awoqVar) {
        return this.b.h(obj, awoqVar);
    }

    @Override // defpackage.awyr
    public final Object i() {
        throw null;
    }

    @Override // defpackage.awys
    public final Object j(Object obj) {
        return this.b.j(obj);
    }

    @Override // defpackage.awwk, defpackage.awwd
    public final void p(CancellationException cancellationException) {
        if (r()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new awwe(ky(), null, this);
        }
        E(cancellationException);
    }

    @Override // defpackage.awys
    public final void s(awqg awqgVar) {
        this.b.s(awqgVar);
    }

    @Override // defpackage.awys
    public final boolean u(Throwable th) {
        return this.b.u(th);
    }

    @Override // defpackage.awys
    public final boolean y() {
        return this.b.y();
    }
}
